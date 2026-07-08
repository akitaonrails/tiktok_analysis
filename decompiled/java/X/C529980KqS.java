package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.template.MvModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;

/* JADX INFO: renamed from: X.0KqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529980KqS {
    public static final boolean LIZ(int i) {
        return i == 53;
    }

    public static final boolean LIZJ(int i) {
        return C13LQ.LJLIIL(new Integer[]{5, 6, 40, 29, 36, 24}).contains(Integer.valueOf(i));
    }

    public static final boolean LIZLLL(int i) {
        return C1697810uHb.LJIIJJI(40, 24, 36).contains(Integer.valueOf(i));
    }

    public static final float LJ(long j) {
        float fFloatValue = new BigDecimal(j / 1000.0f).setScale(1, RoundingMode.DOWN).floatValue();
        if (fFloatValue < 0.1f) {
            return 0.1f;
        }
        return fFloatValue;
    }

    public static boolean LIZIZ(int i, ShortVideoContext shortVideoContext) {
        String str;
        CreativeModel creativeModel;
        MvModel mvModel;
        if (!Collections.singleton(40).contains(Integer.valueOf(i))) {
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (mvModel = creativeModel.mvModel) != null) {
                str = mvModel.templateCategoryKey;
            } else {
                str = null;
            }
            if (!C123100dR.LIZ(str)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
