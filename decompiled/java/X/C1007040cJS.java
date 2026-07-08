package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cJS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.preview.MiniGameInstantPlayPreviewLauncher$launch$1$1", f = "MiniGameInstantPlayPreviewLauncher.kt", l = {}, m = "invokeSuspend")
public final class C1007040cJS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ GameCardMaterial LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007040cJS(Activity activity, GameCardMaterial gameCardMaterial, int i, InterfaceC1364105Vn<? super C1007040cJS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = gameCardMaterial;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007040cJS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniGameInstantPlayPreviewLauncher@9d2e.launch$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//minis_instant_play_preview");
        smartRouteBuildRoute.withParam("feed_card_info", this.LLILLJJLI);
        smartRouteBuildRoute.withParam("minis_status", this.LLILLL);
        smartRouteBuildRoute.open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MiniGameInstantPlayPreviewLauncher@9d2e.launch$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
