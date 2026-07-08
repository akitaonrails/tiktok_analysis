package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;

/* JADX INFO: renamed from: X.0cF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004300cF2 {
    public static final String LIZ(String str) {
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_video");
        C01GW c01gw = C0AXT.LIZ;
        if (((Number) c01gw.getValue()).longValue() >= 0) {
            jLongValue = ((Number) c01gw.getValue()).longValue();
        } else {
            jLongValue = 86400000;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_expired");
        sbLIZ2.append(System.currentTimeMillis() + jLongValue);
        sbLIZ2.append("expired_");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(str);
        sbLIZ.append(".mp4");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LIZIZ(Long l) {
        if (l != null && System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= l.longValue()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(TakoMixFeed takoMixFeed, long j) {
        if (takoMixFeed == null || takoMixFeed.videoGenCard == null) {
            return false;
        }
        if (j > 0) {
            C1153150g77.LIZ.getClass();
            if (System.currentTimeMillis() - j > C1153150g77.LIZ() * 1000) {
                return false;
            }
            return true;
        }
        return true;
    }
}
