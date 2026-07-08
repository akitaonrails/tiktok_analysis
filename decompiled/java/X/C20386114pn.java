package X;

import com.bytedance.android.livesdk.sei.SeiPlaybookExtra;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20386114pn {
    public static SeiPlaybookExtra LIZ(JSONObject jSONObject) {
        try {
            long j = JSONObjectProtectorUtils.getLong(jSONObject, FollowStatusChangeMethod.PARAM_UID);
            int i = JSONObjectProtectorUtils.getInt(jSONObject, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            String string = JSONObjectProtectorUtils.getString(jSONObject, "title");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "cover_url");
            long jOptLong = jSONObject.optLong("book_id");
            return new SeiPlaybookExtra(Long.valueOf(j), Integer.valueOf(i), string, string2, Long.valueOf(jOptLong), jSONObject.optString("biz_scenes"), Long.valueOf(jSONObject.optLong("state_id")));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
