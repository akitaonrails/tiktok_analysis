package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.service.IDramaDiscoverService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611670s2f {
    public static final C1611670s2f LIZ = new C1611670s2f();
    public static final Map<String, C1611810s2t> LIZIZ = new LinkedHashMap();
    public static final C1611810s2t LIZJ = new C1611810s2t();

    public static C1611810s2t LIZIZ(String str) {
        if (str != null && (!TextUtils.isEmpty(str))) {
            C1611810s2t c1611810s2t = (C1611810s2t) ((LinkedHashMap) LIZIZ).get(str);
            if (c1611810s2t == null) {
                return LIZJ;
            }
            return c1611810s2t;
        }
        return LIZJ;
    }

    public static int LIZLLL(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static void LIZ(C2344009Gk c2344009Gk, C1611810s2t c1611810s2t) {
        String str;
        DramaExtraTrackingParams dramaExtraTrackingParams;
        DramaExtraTrackingParams dramaExtraTrackingParams2;
        if (c1611810s2t.LJJIIJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_forced_insertion", str);
        boolean z = false;
        if (!c1611810s2t.LJJIIJ && (((dramaExtraTrackingParams = c1611810s2t.LJJIII) != null && Intrinsics.LJFF(dramaExtraTrackingParams.isFromUnderTakeForcedInsert(), Boolean.TRUE)) || ((dramaExtraTrackingParams2 = c1611810s2t.LJJIII) != null && Intrinsics.LJFF(dramaExtraTrackingParams2.isFromForcedInsertInfo(), Boolean.TRUE)))) {
            z = true;
        }
        if (c1611810s2t.LJJIIJ || z) {
            IDramaDiscoverService.LIZ.getClass();
            C1573420r2y.LIZ().LIZLLL();
            String str2 = null;
            c2344009Gk.LJFF("forced_insertion_from", null);
            DramaExtraTrackingParams dramaExtraTrackingParams3 = c1611810s2t.LJJIII;
            if (dramaExtraTrackingParams3 != null) {
                str2 = dramaExtraTrackingParams3.forcedInsertScene;
            }
            c2344009Gk.LJFF("forced_insertion_scene", str2);
        }
    }

    public static long LIZJ(long j, long j2) {
        Long lValueOf = Long.valueOf(j - j2);
        long jLongValue = lValueOf.longValue();
        if (0 <= jLongValue && jLongValue < 20001) {
            return lValueOf.longValue();
        }
        return -1L;
    }
}
