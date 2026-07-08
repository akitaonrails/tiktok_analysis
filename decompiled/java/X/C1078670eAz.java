package X;

import com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0eAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078670eAz {
    public static String LIZ(int i, long j) {
        String str;
        LiveRankLynxConfig liveRankLynxConfig = LiveRankLynxConfig.INSTANCE;
        HashMap<Long, String> map = liveRankLynxConfig.getValue().rankSchemaConfigList.get(Integer.valueOf(i));
        if (map == null || (str = map.get(Long.valueOf(j))) == null) {
            HashMap<Long, String> map2 = liveRankLynxConfig.getValue().rankSchemaConfigList.get(-1);
            if (map2 != null) {
                return map2.get(Long.valueOf(j));
            }
            return null;
        }
        return str;
    }
}
