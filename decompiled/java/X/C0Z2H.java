package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.ManageGroupFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Z2H, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2H extends C09AY implements Function2<BaseActionViewModel<?>, Activity, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C0Z2I LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z2H(String str, long j, C0Z2I c0z2i) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = c0z2i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BaseActionViewModel<?> baseActionViewModel, Activity activity) {
        String str;
        Activity activity2 = activity;
        String str2 = this.LL;
        long j = this.LLILLJJLI;
        C0Z2I c0z2i = this.LLILLL;
        if (activity2 != null) {
            IMGroupChatDetailAnalytics iMGroupChatDetailAnalytics = IMGroupChatDetailAnalytics.LIZ;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("enter_from", "group_setting");
            if (c0z2i.LIZJ(j) > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[1] = new Pair("has_unread_audit_request", str);
            iMGroupChatDetailAnalytics.LJFF("click_group_management", pairArr, C0I0B.LJFF.LIZIZ());
            String str3 = ManageGroupFragment._pnsPageId;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity2, "//im/new/detail/manage_group");
            smartRouteBuildRoute.withParam("key_conversation_id", str2);
            smartRouteBuildRoute.open(3333);
        }
        return Unit.LIZ;
    }
}
