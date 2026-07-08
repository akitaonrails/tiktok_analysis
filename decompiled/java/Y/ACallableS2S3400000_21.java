package Y;

import X.C0BTK;
import X.C1050600dRi;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2189821An6;
import X.C735370Ssx;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ACallableS2S3400000_21 implements Callable {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS2S3400000_21 aCallableS2S3400000_21) throws JSONException {
        JSONObject jSONObject = (JSONObject) aCallableS2S3400000_21.l3;
        Aweme aweme = (Aweme) aCallableS2S3400000_21.l4;
        String str = aCallableS2S3400000_21.s0;
        String str2 = aCallableS2S3400000_21.s1;
        String str3 = aCallableS2S3400000_21.s2;
        C2189821An6 c2189821An6 = (C2189821An6) aCallableS2S3400000_21.l5;
        C19EG c19eg = (C19EG) aCallableS2S3400000_21.l6;
        C1C7U.LIZ("BaseFeedListMobUtils@8111.mobShowEvent$1L");
        try {
            jSONObject.put("display", "full");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("to_user_id", AwemeExtKt.getAuthorUid(aweme));
            jSONObject.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            if (C735370Ssx.LJJIJ(str)) {
                jSONObject.put("enter_fullscreen", "1");
                jSONObject.put("content_type", C735370Ssx.LJFF(aweme));
            }
            if (!TextUtils.isEmpty(AwemeExtKt.getRepostFromGroupId(aweme))) {
                jSONObject.put("is_reposted", "1");
                jSONObject.put("repost_from_group_id", AwemeExtKt.getRepostFromGroupId(aweme));
                jSONObject.put("repost_from_user_id", AwemeExtKt.getRepostFromUserId(aweme));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.LJIIJ(0L, "show", str2, str3, jSONObject);
        if (C735370Ssx.LJJIJ(str)) {
            jSONObject.put("enter_from", str2);
            C20684815ws.LJIJJ("show", jSONObject);
        }
        if (!C0BTK.LIZ()) {
            C1050600dRi.LIZ(aweme, c2189821An6, str, str2, str3, c19eg);
        }
        C1C7U.LIZIZ("BaseFeedListMobUtils@8111.mobShowEvent$1L");
        return null;
    }

    public static final Object call$1(ACallableS2S3400000_21 aCallableS2S3400000_21) {
        JSONObject jSONObject = (JSONObject) aCallableS2S3400000_21.l3;
        Aweme aweme = (Aweme) aCallableS2S3400000_21.l4;
        String str = aCallableS2S3400000_21.s0;
        C2189821An6 c2189821An6 = (C2189821An6) aCallableS2S3400000_21.l5;
        String str2 = aCallableS2S3400000_21.s1;
        String str3 = aCallableS2S3400000_21.s2;
        C19EG c19eg = (C19EG) aCallableS2S3400000_21.l6;
        C1C7U.LIZ("BaseFeedListMobUtils@8111.mobVideoShowEvent$1L");
        try {
            jSONObject.put("display", "full");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("to_user_id", AwemeExtKt.getAuthorUid(aweme));
            jSONObject.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            if (C735370Ssx.LJJIJ(str)) {
                jSONObject.put("enter_fullscreen", "1");
                jSONObject.put("content_type", C735370Ssx.LJFF(aweme));
            }
            if (!TextUtils.isEmpty(AwemeExtKt.getRepostFromGroupId(aweme))) {
                jSONObject.put("is_reposted", "1");
                jSONObject.put("repost_from_group_id", AwemeExtKt.getRepostFromGroupId(aweme));
                jSONObject.put("repost_from_user_id", AwemeExtKt.getRepostFromUserId(aweme));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1050600dRi.LIZ(aweme, c2189821An6, str, str2, str3, c19eg);
        C1C7U.LIZIZ("BaseFeedListMobUtils@8111.mobVideoShowEvent$1L");
        return null;
    }

    public ACallableS2S3400000_21(JSONObject jSONObject, Aweme aweme, String str, C2189821An6 c2189821An6, String str2, String str3, C19EG c19eg, int i) {
        this.$t = i;
        this.l3 = jSONObject;
        this.l4 = aweme;
        this.s0 = str;
        this.l5 = c2189821An6;
        this.s1 = str2;
        this.s2 = str3;
        this.l6 = c19eg;
    }

    public ACallableS2S3400000_21(JSONObject jSONObject, Aweme aweme, String str, Context context, String str2, String str3, C2189821An6 c2189821An6, C19EG c19eg, int i) {
        this.$t = i;
        this.l3 = jSONObject;
        this.l4 = aweme;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l5 = c2189821An6;
        this.l6 = c19eg;
    }
}
