package X;

import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C801730Vch {
    public static final char[] LIZIZ = {'t', 'r', 'u', 'e'};
    public static final char[] LIZJ = {'f', 'a', 'l', 's', 'e'};
    public final AbstractC801740Vci LIZ;

    public final void LJI() {
        this.LIZ.LJFF();
    }

    public C801730Vch(final String str) {
        AbstractC801740Vci c803250Vf9;
        try {
            c803250Vf9 = new C803250Vf9(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c803250Vf9 = new AbstractC801740Vci(str) { // from class: X.0Vf8
                @Override // X.AbstractC801740Vci
                public final void LJFF() {
                    this.LIZ.release();
                }

                {
                    InterfaceC803370VfL c2225008ng;
                    long jLJJLI = NativeBridge.LJJLI(0, str);
                    if (jLJJLI != 0) {
                        c2225008ng = new C803220Vf6(jLJJLI);
                    } else {
                        c2225008ng = new C2225008ng(str);
                    }
                    this.LIZ = c2225008ng;
                }

                @Override // X.AbstractC801740Vci
                public final void LIZ(char c) {
                    this.LIZ.LIZ(String.valueOf(c));
                }

                @Override // X.AbstractC801740Vci
                public final void LIZIZ(int i) {
                    this.LIZ.LIZIZ(i);
                }

                @Override // X.AbstractC801740Vci
                public final void LIZJ(long j) {
                    this.LIZ.LIZJ(j);
                }

                @Override // X.AbstractC801740Vci
                public final void LIZLLL(String str2) {
                    this.LIZ.LIZ(str2);
                }

                @Override // X.AbstractC801740Vci
                public final void LJ(char[] cArr) {
                    this.LIZ.LIZLLL(cArr, cArr.length);
                }
            };
        }
        this.LIZ = c803250Vf9;
    }

    public final void LIZ(char c) {
        this.LIZ.LIZ(c);
    }

    public final void LIZIZ(int i) {
        this.LIZ.LIZIZ(i);
    }

    public final void LIZJ(long j) {
        this.LIZ.LIZJ(j);
    }

    public final void LIZLLL(String str) {
        if (str != null) {
            this.LIZ.LIZLLL(str);
        }
    }

    public final void LJ(Throwable th) {
        LIZLLL(th.getClass().getName());
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            this.LIZ.LIZ(':');
            this.LIZ.LIZ(' ');
            LIZLLL(localizedMessage);
        }
    }

    public final void LJFF(boolean z) {
        if (z) {
            this.LIZ.LJ(LIZIZ);
        } else {
            this.LIZ.LJ(LIZJ);
        }
    }
}
