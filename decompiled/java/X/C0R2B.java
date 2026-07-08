package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R2B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R2B extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Long LLJ;
    public final /* synthetic */ Aweme LLJI;
    public final /* synthetic */ Map<String, String> LLJIJIL;
    public final /* synthetic */ String LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R2B(Context context, String str, Map<String, String> map, String str2, String str3, String str4, long j, String str5, Long l, Aweme aweme, Map<String, String> map2, String str6) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = j;
        this.LLIZLLLIL = str5;
        this.LLJ = l;
        this.LLJI = aweme;
        this.LLJIJIL = map2;
        this.LLJILJIL = str6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//aweme/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, this.LLILLJJLI);
        smartRouteBuildRoute.withParam("video_from", "from_chat_inner_cell");
        smartRouteBuildRoute.withParam("key_from_chat_room_real_aid", this.LLILLJJLI);
        smartRouteBuildRoute.withParam("enter_method", this.LLILLL.get("enter_method"));
        smartRouteBuildRoute.withParam("enter_from", this.LLILLL.get("enter_from"));
        smartRouteBuildRoute.withParam("process_id", this.LLILLL.get("process_id"));
        smartRouteBuildRoute.withParam("search_id", this.LLILZ);
        smartRouteBuildRoute.withParam("message_id", this.LLILZIL);
        smartRouteBuildRoute.withParam("sub_process_id", this.LLILZLL);
        smartRouteBuildRoute.withParam("action_item_id", this.LLIZ);
        smartRouteBuildRoute.withParam("tikbot_layer", this.LLIZLLLIL);
        smartRouteBuildRoute.withParam("innerfeed_entrance_group_id", this.LLILLJJLI);
        smartRouteBuildRoute.withParam("tako_chat_id", this.LLILLL.get("tako_chat_id"));
        smartRouteBuildRoute.withParam("tako_session_id", this.LLILLL.get("tako_session_id"));
        smartRouteBuildRoute.withParam("innerfeed_entrance_rank", String.valueOf(this.LLJ));
        Aweme aweme = this.LLJI;
        smartRouteBuildRoute.withParam("profile_enterprise_type", aweme != null ? Integer.valueOf(AwemeExtKt.getEnterpriseType(aweme)) : null);
        smartRouteBuildRoute.withParam("page_type", 38);
        Map<String, String> map = this.LLJIJIL;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                smartRouteBuildRoute.withParam(entry.getKey(), entry.getValue());
            }
        }
        String str = this.LLJILJIL;
        if (str != null && str.length() > 0) {
            smartRouteBuildRoute.withParam("source_btm_token", str);
        }
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "chat");
        c2344009Gk.LJIIIIZZ("group_id", this.LLILLJJLI);
        C20684815ws.LJIILLIIL("feed_enter", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
