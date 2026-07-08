package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SO2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SO2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL() {
        return !C0SKM.LIZIZ() && C0SOK.LIZ().enable && C0SOK.LIZ().enableFloat && C0SOK.LIZ().enableDarkNew;
    }

    public static boolean LIZ(String str) {
        int i;
        List<String> list = C0SOK.LIZ().degradeScene;
        if (list == null || !C13LP.LJJJJ(str, list)) {
            return false;
        }
        if (str != null && a0.LJJIIZI(str, "explore", false)) {
            i = C0SOK.LIZ().lowEndScoreForExplore;
        } else {
            i = C0SOK.LIZ().lowEndScore;
        }
        float fLIZ = C20737116Cr.LIZ();
        if (i >= 0 && fLIZ >= 0.0f && fLIZ <= i) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        int i;
        List<String> list = C0SOK.LIZ().degradeScene;
        if (list == null || !C13LP.LJJJJ(str, list)) {
            return false;
        }
        float f = C0SOK.LIZ().superLowEndScore;
        if (str != null && a0.LJJIIZI(str, "explore", false)) {
            i = C0SOK.LIZ().lowEndScoreForExplore;
        } else {
            i = C0SOK.LIZ().lowEndScore;
        }
        float fLIZ = C20737116Cr.LIZ();
        if (i >= 0 && f >= 0.0f) {
            float f2 = i;
            if (f <= f2 && fLIZ >= 0.0f && fLIZ < f2 && fLIZ >= f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        if (C0SKM.LIZIZ() || !C0SOK.LIZ().enable || !C0SOK.LIZ().enableFloat || !Intrinsics.LJFF(str, "homepage_hot")) {
            return false;
        }
        return true;
    }
}
