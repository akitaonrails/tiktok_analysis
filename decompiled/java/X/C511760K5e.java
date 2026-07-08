package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0K5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511760K5e extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscriptionSceneContext LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Uri LLJILLL;
    public final /* synthetic */ Map<String, String> LLJJ;
    public final /* synthetic */ Function1<Uri, Boolean> LLJJI;
    public final /* synthetic */ Context LLJJIII;
    public final /* synthetic */ C259800zU<Fragment> LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C511760K5e(SubscriptionSceneContext subscriptionSceneContext, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Uri uri, Map<String, String> map, Function1<? super Uri, Boolean> function1, Context context, C259800zU<Fragment> c259800zU) {
        super(0);
        this.LL = subscriptionSceneContext;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = str8;
        this.LLJIJIL = str9;
        this.LLJILJIL = str10;
        this.LLJILJILJ = str11;
        this.LLJILLL = uri;
        this.LLJJ = map;
        this.LLJJI = function1;
        this.LLJJIII = context;
        this.LLJJIJI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        String str2;
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_change_price_sheet_agree");
        C0K61.LIZ(c511970K5z, this.LL);
        c511970K5z.LIZIZ(this.LLILLJJLI, "show_entrance");
        c511970K5z.LIZIZ("notify_and_consent", "show_type");
        c511970K5z.LIZIZ(this.LLILLL, "old_price");
        c511970K5z.LIZIZ(this.LLILZ, "new_price");
        c511970K5z.LIZIZ(Integer.valueOf(this.LLILZIL), "subscribe_month");
        c511970K5z.LIZIZ("auto_sub", "subscribe_type");
        c511970K5z.LIZIZ(this.LLILZLL, "renewal_time");
        c511970K5z.LIZLLL();
        C511740K5c c511740K5c = C511740K5c.LIZ;
        String str3 = this.LLIZ;
        String str4 = this.LLIZLLLIL;
        String str5 = this.LLJ;
        String str6 = this.LLILLJJLI;
        String str7 = this.LLJI;
        String str8 = this.LLJIJIL;
        String str9 = this.LLJILJIL;
        String str10 = this.LLJILJILJ;
        Uri uri = this.LLJILLL;
        SubscriptionSceneContext subscriptionSceneContext = this.LL;
        Map<String, String> map = this.LLJJ;
        c511740K5c.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C511740K5c.LIZIZ(uri, map));
        Object obj = linkedHashMap.get("package_id");
        String str11 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("package_id", obj);
        Object pageName = linkedHashMap.get("page_type");
        String str12 = (String) pageName;
        if ((str12 == null || str12.length() == 0) || pageName == null) {
            pageName = EnumC513400KBm.PACKAGE_PAGE.getPageName();
        }
        linkedHashMap.put("page_type", pageName);
        linkedHashMap.put("from_id", str5);
        linkedHashMap.put("room_id", str9);
        long jLongValue = 0;
        if (subscriptionSceneContext != null) {
            Long lValueOf = Long.valueOf(subscriptionSceneContext.anchorUid);
            if (lValueOf.longValue() > 0) {
                jLongValue = lValueOf.longValue();
            }
        }
        linkedHashMap.put("log_anchor_id", String.valueOf(jLongValue));
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("subscribe_state", str4);
        linkedHashMap.put("anchor_id", str3);
        linkedHashMap.put("sec_anchor_id", str3);
        linkedHashMap.put("need_high_state_page", "false");
        linkedHashMap.put("privilege_show_type", "vertical");
        linkedHashMap.put("privilege_page", "main_page");
        linkedHashMap.put("use_spark", "1");
        linkedHashMap.put("user_present", "1");
        linkedHashMap.put("is_native", "1");
        if (subscriptionSceneContext == null || (str = subscriptionSceneContext.requestId) == null) {
            str = "";
        }
        linkedHashMap.put("request_id", str);
        if (subscriptionSceneContext != null && (str2 = subscriptionSceneContext.videoId) != null) {
            str11 = str2;
        }
        linkedHashMap.put("video_id", str11);
        linkedHashMap.put("show_entrance", str6);
        linkedHashMap.put("from_sub_enter", "price_change");
        linkedHashMap.put("previous_page", "price_change");
        linkedHashMap.put("extra_log_pb", str7);
        linkedHashMap.put("log_param", str8);
        linkedHashMap.put("room_id", str9);
        linkedHashMap.put("anchor_username", str10);
        linkedHashMap.put("sub_source", "normal_sub");
        C2089008Gi c2089008Gi = new C2089008Gi("sslocal://webcast_subscribe/pgc_sub_package");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c2089008Gi.LIZLLL((String) entry.getKey(), (String) entry.getValue());
        }
        this.LLJJI.invoke(UriProtector.parse(c2089008Gi.LJ()));
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLJJIII);
        if (c19egLIZIZ != null) {
            C259800zU<Fragment> c259800zU = this.LLJJIJI;
            C511740K5c.LIZ.getClass();
            ((C0K5Y) C511740K5c.LIZIZ.getValue()).LIZ().LIZ(c19egLIZIZ, new AwS586S0100000_7(c259800zU, (C259800zU<Fragment>) 512));
        }
        return Unit.LIZ;
    }
}
