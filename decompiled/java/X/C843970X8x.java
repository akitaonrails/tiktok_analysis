package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0X8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.search.SearchEntityCardMixPageHost$requestExposureAttribution$1$1", f = "SearchEntityCardMixPageHost.kt", l = {}, m = "invokeSuspend")
public final class C843970X8x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1880920z2w LL;
    public final /* synthetic */ C843940X8u LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843970X8x(C1880920z2w c1880920z2w, C843940X8u c843940X8u, InterfaceC1364105Vn<? super C843970X8x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1880920z2w;
        this.LLILLJJLI = c843940X8u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C843970X8x(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C843920X8s c843920X8sJe0;
        C1C7U.LIZ("SearchEntityCardMixPageHost@5618.requestExposureAttribution$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService != null && (c843920X8sJe0 = iGamePartnershipService.Je0()) != null) {
            c843920X8sJe0.LJIIL(this.LL.LL, this.LLILLJJLI, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchEntityCardMixPageHost@5618.requestExposureAttribution$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
