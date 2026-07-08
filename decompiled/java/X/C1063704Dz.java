package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04Dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew$initView$4$2$1$1", f = "SeaPdpBottomNavBarWidgetNew.kt", l = {239}, m = "invokeSuspend")
public final class C1063704Dz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeaPdpBottomNavBarWidgetNew LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063704Dz(SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew, InterfaceC1364105Vn<? super C1063704Dz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpBottomNavBarWidgetNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1063704Dz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpBottomNavBarWidgetNew@8a29.initView$4$2$1$1");
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
            C04AL c04al = C04AL.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILLJJLI.LJIIIIZZ().LLIZ;
            this.LL = 1;
            c04al.getClass();
            if (C04AL.LIZ(pdpEnterParam, 2, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpBottomNavBarWidgetNew@8a29.initView$4$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpBottomNavBarWidgetNew@8a29.initView$4$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
