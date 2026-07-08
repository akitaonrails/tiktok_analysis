package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0ieA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250520ieA {
    public static final C1250520ieA LIZ = new C1250520ieA();
    public static final Keva LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;
    public static long LJ;

    static {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DRAMA_KEVA");
        sbLIZ.append(curUserId);
        LIZIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        LIZJ = true;
    }

    public static boolean LIZ() {
        if (LIZLLL > 0 && System.currentTimeMillis() - LIZLLL > Mp4ScreenVideoLoadTimeout.CONTROL) {
            LIZJ = false;
            LIZLLL = 0L;
        }
        return LIZJ;
    }
}
