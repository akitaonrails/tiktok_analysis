package X;

import android.graphics.Typeface;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0jxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300780jxE {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("proximanova-bold", "'proximanova-bold'", "\"proximanova-bold\"", "tiktokfont-bold", "'tiktokfont-bold'", "\"tiktokfont-bold\"");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("proximanova-semibold", "'proximanova-semibold'", "\"proximanova-semibold\"", "tiktokfont-semibold", "'tiktokfont-semibold'", "\"tiktokfont-semibold\"");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("proximanova-regular", "'proximanova-regular'", "\"proximanova-regular\"", "tiktokfont-regular", "'tiktokfont-regular'", "\"tiktokfont-regular\"");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("tiktokdisplayfont-bold", "'tiktokdisplayfont-bold'", "\"tiktokdisplayfont-bold\"");
    public static final List<String> LJ = C1697810uHb.LJIIJJI("tiktokdisplayfont-semibold", "'tiktokdisplayfont-semibold'", "\"tiktokdisplayfont-semibold\"");
    public static final List<String> LJFF = C1697810uHb.LJIIJJI("tiktokdisplayfont-regular", "'tiktokdisplayfont-regular'", "\"tiktokdisplayfont-regular\"");

    public static Typeface LIZIZ(String str) {
        C1300790jxF c1300790jxFLIZ;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (LIZ.contains(lowerCase)) {
            c1300790jxFLIZ = LIZ(3, false);
        } else if (LIZIZ.contains(lowerCase)) {
            c1300790jxFLIZ = LIZ(2, false);
        } else if (LIZJ.contains(lowerCase)) {
            c1300790jxFLIZ = LIZ(1, false);
        } else if (LIZLLL.contains(lowerCase)) {
            c1300790jxFLIZ = LIZ(3, true);
        } else if (LJ.contains(lowerCase)) {
            c1300790jxFLIZ = LIZ(2, true);
        } else {
            if (!LJFF.contains(lowerCase)) {
                return null;
            }
            c1300790jxFLIZ = LIZ(1, true);
        }
        if (c1300790jxFLIZ == null) {
            return null;
        }
        return C1697580uHE.LIZIZ(0.0f, c1300790jxFLIZ.LIZ, c1300790jxFLIZ.LIZIZ, 0.0f, null, 0.0f, 0, null, 240);
    }

    public static C1300790jxF LIZ(int i, boolean z) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                if (z) {
                    return new C1300790jxF(28.0f, OppoPermissionPopupMaskDelayExp.DEFAULT);
                }
                return new C1300790jxF(17.0f, OppoPermissionPopupMaskDelayExp.DEFAULT);
            }
            if (z) {
                return new C1300790jxF(28.0f, 500);
            }
            return new C1300790jxF(17.0f, 500);
        }
        if (z) {
            return new C1300790jxF(28.0f, 400);
        }
        return new C1300790jxF(17.0f, 400);
    }
}
