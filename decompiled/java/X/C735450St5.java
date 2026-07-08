package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0St5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735450St5 {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(Aweme aweme, String str) {
        String str2;
        if (!Intrinsics.LJFF(str, "homepage_nearby")) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aweme != null) {
            linkedHashMap.put("publish_consume_interval", String.valueOf(System.currentTimeMillis() - aweme.getCreateTime()));
            NearbyInfo nearbyInfo = aweme.getNearbyInfo();
            if (nearbyInfo != null && (str2 = nearbyInfo.eventTrack) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = jSONObject.opt(next);
                        if (!TextUtils.isEmpty(next) && objOpt != null) {
                            linkedHashMap.put(next, objOpt.toString());
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.toString();
                }
            }
        }
        return linkedHashMap;
    }
}
