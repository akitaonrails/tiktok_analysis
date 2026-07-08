package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LO7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$realNavigateCameoPreview$2", f = "NavigateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LO7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ CameoDraft LLILLJJLI;
    public final /* synthetic */ AIGCDraft LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LO7(Context context, AIGCDraft aIGCDraft, CameoDraft cameoDraft, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = cameoDraft;
        this.LLILLL = aIGCDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LO7(this.LL, this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigateCameoPreview$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//cameo/profile/draft_detail");
        smartRouteBuildRoute.withParam("cameo_draft", this.LLILLJJLI);
        smartRouteBuildRoute.withParam("aigc_entrance_info", this.LLILLL.aigcEntranceInfo);
        smartRouteBuildRoute.open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCameoPreview$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
