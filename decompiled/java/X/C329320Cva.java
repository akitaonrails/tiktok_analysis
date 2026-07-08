package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Cva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329320Cva {
    public static void LIZ(int i, int i2, Aweme aweme) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aweme_id", aweme.getAid());
            jSONObject.put("error_type", String.valueOf(i));
            jSONObject.put("ad_id", aweme.getAwemeRawAd().getAdId());
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_adx_video_error_log", i2, jSONObject);
    }
}
