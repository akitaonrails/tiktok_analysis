package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCPost;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$realNavigatePost$2", f = "NavigateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LOR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ NavigateServiceImpl LLILLL;
    public final /* synthetic */ AIGCPost LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOR(Aweme aweme, Context context, NavigateServiceImpl navigateServiceImpl, AIGCPost aIGCPost, InterfaceC1364105Vn<? super C0LOR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = context;
        this.LLILLL = navigateServiceImpl;
        this.LLILZ = aIGCPost;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigatePost$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme aweme = this.LL;
        if (aweme != null && (aweme.getIsTikTokStory() || this.LL.getAwemeType() == 40)) {
            C546820LcW.LIZIZ.LIZ("NavigateServiceImpl", "navigatePost -> story detail (single)");
            Context context = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://story/detail/");
            sbLIZ.append(this.LL.getAid());
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_DEFAULT");
            smartRouteBuildRoute.withParam("enter_from", "personal_homepage");
            NavigateServiceImpl navigateServiceImpl = this.LLILLL;
            Aweme aweme2 = this.LL;
            navigateServiceImpl.getClass();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("video_id", aweme2.getAid(), bundle);
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme2.getAid(), bundle);
            bundle.putInt("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme2));
            bundle.putInt("from_post_list", 0);
            bundle.putBoolean("isNowType", false);
            C786410Ut5.LJJJI("video_from", "STORY_ENTRANCE_DEFAULT", bundle);
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
        } else {
            C546820LcW.LIZIZ.LIZ("NavigateServiceImpl", "realNavigatePost -> aweme detail");
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this.LLILLJJLI, "aweme://aweme/detail/");
            smartRouteBuildRoute2.withParam(FollowStatusChangeMethod.PARAM_UID, this.LLILZ.awemeId);
            smartRouteBuildRoute2.open();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigatePost$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
