package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpLynxPreloadItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.spark.SeaPdpRecommendStyle1Module$generateListItems$2$1$1", f = "SeaPdpRecommendStyle1Module.kt", l = {52}, m = "invokeSuspend")
public final class C1752580vhw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpLynxPreloadItem LLILLJJLI;
    public final /* synthetic */ C1752600vhy LLILLL;
    public final /* synthetic */ SeaPdpViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752580vhw(PdpLynxPreloadItem pdpLynxPreloadItem, C1752600vhy c1752600vhy, SeaPdpViewModel seaPdpViewModel, InterfaceC1364105Vn<? super C1752580vhw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpLynxPreloadItem;
        this.LLILLL = c1752600vhy;
        this.LLILZ = seaPdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1752580vhw(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpRecommendStyle1Module@c413.generateListItems$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.duration;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpRecommendStyle1Module@c413.generateListItems$2$1$1");
                return objLJFF;
            }
        }
        C1548750qPB.LIZJ(C1548750qPB.LIZ, this.LLILLL.LLILZ, this.LLILZ.LLZIL.LLIZLLLIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpRecommendStyle1Module@c413.generateListItems$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
