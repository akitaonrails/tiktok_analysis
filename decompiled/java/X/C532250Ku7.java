package X;

import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ku7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532250Ku7 {
    public static final boolean LIZ(SummaryData summaryData) {
        if (!summaryData.usingMagic) {
            C1432940nOO c1432940nOO = C1432940nOO.LIZ;
            List<String> list = summaryData.featuresList;
            c1432940nOO.getClass();
            if (!C1432940nOO.LJFF(list)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LIZIZ(SummaryData summaryData) {
        List<String> list = summaryData.featuresList;
        if (summaryData.usingMatting || list.contains("TEMPLATE_MATTING")) {
            for (String str : list) {
                if (Intrinsics.LJFF(str, "UGC_MAGIC_V2") || Intrinsics.LJFF(str, "UGC_ASYNC_I2V")) {
                }
            }
            return true;
        }
        return false;
    }
}
