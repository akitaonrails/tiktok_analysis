package X;

import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.Map;

/* JADX INFO: renamed from: X.0YzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892210YzL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C869590Y9l c869590Y9l, Map map) {
        C892320YzW c892320YzWLJIIIIZZ;
        String strLJ;
        if (c869590Y9l != null) {
            IMessageAnalyticsUtils.LIZ.getClass();
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ != null && (strLJ = iMessageAnalyticsUtilsLIZ.LJ(c869590Y9l)) != null) {
                map.put("latest_message_type", strLJ);
            }
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ2 = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ2 != null && (c892320YzWLJIIIIZZ = iMessageAnalyticsUtilsLIZ2.LJIIIIZZ(c869590Y9l, null)) != null) {
                map.put("latest_message_type_v2", c892320YzWLJIIIIZZ.LIZ);
                map.put("latest_msg_content_type", c892320YzWLJIIIIZZ.LIZIZ);
            }
        }
    }

    public static void LIZ(Map map, C0Z72 c0z72, C869590Y9l c869590Y9l) {
        String strLIZ;
        if (c0z72 != null && (strLIZ = C892450Yzj.LIZ(c0z72)) != null) {
            map.put("hint_type", strLIZ);
        }
        LIZIZ(c869590Y9l, map);
    }
}
