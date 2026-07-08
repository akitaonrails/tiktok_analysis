package X;

import Y.ARunnableS134S0100000_34;
import android.app.Application;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.1BN8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BN8 {
    public static C1BN8 LIZIZ;
    public final C1BNB LIZ;

    public static C1BN8 LIZ() {
        if (LIZIZ == null) {
            synchronized (C1BN8.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1BN8();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final boolean LIZIZ() {
        this.LIZ.getClass();
        return C1906580ziK.LIZ;
    }

    public C1BN8() {
        Application applicationLIZ = C1BWL.LIZ();
        if (applicationLIZ == null) {
            return;
        }
        C1BNB c1bnb = new C1BNB(applicationLIZ);
        this.LIZ = c1bnb;
        C1BN9 c1bn9LIZLLL = C1BN9.LIZLLL();
        c1bn9LIZLLL.getClass();
        C823050WQl.LIZJ().execute(new ARunnableS134S0100000_34(c1bn9LIZLLL, 78));
        if (!C2206241BWk.LIZ()) {
            C1BN9 c1bn9LIZLLL2 = C1BN9.LIZLLL();
            if (C191811102f.LL == null) {
                synchronized (C191811102f.class) {
                    try {
                        if (C191811102f.LL == null) {
                            C191811102f.LL = new C191811102f();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            c1bn9LIZLLL2.LJ(C191811102f.LL);
        }
        C1BN9.LIZLLL().LJ(new C1BNA() { // from class: X.0Uyq
            public static boolean LLILLJJLI;

            @Override // X.C1BNA
            public final void LIZIZ() {
                LLILLJJLI = true;
            }

            @Override // X.C1BNA
            public final void LIZ() {
                if (LLILLJJLI) {
                    LLILLJJLI = false;
                    if (C1827607Du.LJ(AFwS189S0000000_3.get$arr$(1114), C1785006yu.LIZJ())) {
                        return;
                    }
                    C786410Ut5.LJLIIL(TimeUnit.SECONDS.toMillis(5L), new BPEAHandler(), new Runnable() { // from class: X.0Uv2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("DialogHotStartListener@3af5.onAppEnterForeground$1");
                            C1C7U.LIZIZ("DialogHotStartListener@3af5.onAppEnterForeground$1");
                        }
                    });
                }
            }
        });
        c1bnb.LIZLLL = C1BN9.LIZLLL();
    }
}
