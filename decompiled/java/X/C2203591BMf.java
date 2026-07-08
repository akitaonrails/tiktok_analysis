package X;

import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;

/* JADX INFO: renamed from: X.1BMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203591BMf {
    public static volatile boolean LIZ;

    public static synchronized void LIZ(Context context) {
        if (C2104108Md.LIZLLL(context)) {
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.1BN0
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType, String str, Thread thread) {
                    C1BMY.LIZIZ().LIZ(System.currentTimeMillis(), CrashType.JAVA.getName(), str);
                }
            }, CrashType.LAUNCH);
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.1BN1
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType, String str, Thread thread) {
                    C1BMY.LIZIZ().LIZ(System.currentTimeMillis(), CrashType.JAVA.getName(), str);
                }
            }, CrashType.JAVA);
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.1BN2
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType, String str, Thread thread) {
                    C1BMY.LIZIZ().LIZ(System.currentTimeMillis(), CrashType.NATIVE.getName(), str);
                }
            }, CrashType.NATIVE);
        }
    }

    public static void LIZIZ(int i) {
        C2203621BMi c2203621BMi = new C2203621BMi();
        c2203621BMi.LJ = 600000L;
        c2203621BMi.LIZLLL = 15000L;
        c2203621BMi.LIZ = true;
        c2203621BMi.LIZIZ = 6;
        c2203621BMi.LIZJ = 4;
        c2203621BMi.LJFF = i;
        c2203621BMi.LJI = 2L;
        c2203621BMi.LJII = 5L;
        c2203621BMi.LJIIIIZZ = 5400000L;
        c2203621BMi.LJIIIZ = 2L;
        c2203621BMi.LJIIJ = 5L;
        c2203621BMi.LJIIJJI = "";
        c2203621BMi.LJIIL = -1.0f;
        synchronized (C1BMY.LIZIZ()) {
            C2203571BMd c2203571BMd = C2203571BMd.LJIILLIIL;
            c2203571BMd.LIZLLL.LIZJ(Boolean.valueOf(c2203621BMi.LIZ));
            c2203571BMd.LJI.LIZJ(Long.valueOf(c2203621BMi.LIZLLL));
            c2203571BMd.LJ.LIZJ(Integer.valueOf(c2203621BMi.LIZIZ));
            c2203571BMd.LJFF.LIZJ(Integer.valueOf(c2203621BMi.LIZJ));
            c2203571BMd.LJII.LIZJ(Long.valueOf(c2203621BMi.LJ));
            c2203571BMd.LJIIIIZZ.LIZJ(Long.valueOf(c2203621BMi.LJFF));
            c2203571BMd.LJIIIZ.LIZJ(Long.valueOf(c2203621BMi.LJI));
            c2203571BMd.LJIIJ.LIZJ(Long.valueOf(c2203621BMi.LJII));
            c2203571BMd.LJIIJJI.LIZJ(Long.valueOf(c2203621BMi.LJIIIIZZ));
            c2203571BMd.LJIIL.LIZJ(Long.valueOf(c2203621BMi.LJIIIZ));
            c2203571BMd.LJIILIIL.LIZJ(Long.valueOf(c2203621BMi.LJIIJ));
            c2203571BMd.LJIILJJIL.LIZJ(c2203621BMi.LJIIJJI);
            c2203571BMd.LJIILL.LIZJ(Float.valueOf(c2203621BMi.LJIIL));
            c2203571BMd.LIZJ();
        }
    }
}
