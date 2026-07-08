package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.13TS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TS {
    public static final C13TV LIZ;

    static {
        C13TV c13tv;
        C0VSJ c0vsj = new C0VSJ(C0NFQ.LIZIZ);
        synchronized (C13TV.class) {
            if (C13TV.LJFF == null) {
                C13TV.LJFF = new C13TV(c0vsj);
            }
            c13tv = C13TV.LJFF;
        }
        LIZ = c13tv;
    }

    public static File LIZ(String str) {
        C13TV c13tv = LIZ;
        try {
            C13TR c13trLJFF = c13tv.LIZ().LJFF(c13tv.LIZ.LIZ(new C13TX(str)));
            if (c13trLJFF != null) {
                return c13trLJFF.LIZ[0];
            }
            return null;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.0Egw] */
    public static void LIZIZ(String str, final C371180Egu c371180Egu) {
        C13TW c13twLIZ;
        C13TV c13tv = LIZ;
        C13TX c13tx = new C13TX(str);
        ?? r7 = new Object(c371180Egu) { // from class: X.0Egw
            public final InterfaceC371190Egv LIZ;

            {
                this.LIZ = c371180Egu;
            }

            public final boolean LIZ(File file) {
                return this.LIZ.LIZ(file);
            }
        };
        String strLIZ = c13tv.LIZ.LIZ(c13tx);
        C13TT c13tt = c13tv.LIZLLL;
        synchronized (c13tt) {
            try {
                c13twLIZ = (C13TW) ((HashMap) c13tt.LIZ).get(strLIZ);
                if (c13twLIZ == null) {
                    c13twLIZ = c13tt.LIZIZ.LIZ();
                    ((HashMap) c13tt.LIZ).put(strLIZ, c13twLIZ);
                }
                c13twLIZ.LIZIZ++;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        ((ReentrantLock) c13twLIZ.LIZ).lock();
        try {
            try {
                C13TL c13tlLIZ = c13tv.LIZ();
                if (c13tlLIZ.LJFF(strLIZ) == null) {
                    C13TO c13toLIZLLL = c13tlLIZ.LIZLLL(strLIZ);
                    if (c13toLIZLLL != null) {
                        try {
                            if (r7.LIZ(c13toLIZLLL.LIZ())) {
                                c13toLIZLLL.LIZLLL.LIZ(c13toLIZLLL, true);
                                c13toLIZLLL.LIZJ = true;
                            }
                            if (!c13toLIZLLL.LIZJ) {
                                try {
                                    c13toLIZLLL.LIZLLL.LIZ(c13toLIZLLL, false);
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        } catch (Throwable th) {
                            if (!c13toLIZLLL.LIZJ) {
                                try {
                                    c13toLIZLLL.LIZLLL.LIZ(c13toLIZLLL, false);
                                } catch (IOException th2) {
                                }
                            }
                            throw th2;
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Had two simultaneous puts for: ");
                        sbLIZ.append(strLIZ);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } catch (IOException th22) {
            }
            c13tv.LIZLLL.LIZ(strLIZ);
        } catch (Throwable th222) {
            c13tv.LIZLLL.LIZ(strLIZ);
            throw th222;
        }
    }
}
