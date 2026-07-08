package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.mask.BorderBizViewElement$updateBorderViewV2$1$1", f = "BorderBizViewElement.kt", l = {}, m = "invokeSuspend")
public final class C807420Vls extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C940950aar LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C807420Vls(C940950aar c940950aar, Runnable runnable, InterfaceC1364105Vn<? super C807420Vls> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c940950aar;
        this.LLILLJJLI = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C807420Vls(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BorderBizViewElement@9067.updateBorderViewV2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C940950aar c940950aar = this.LL;
        if (!c940950aar.LLJJI) {
            C937310aUz.LJFF(c940950aar.getRealTag(), "updateBorderViewV2 return runnable.");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BorderBizViewElement@9067.updateBorderViewV2$1$1");
            return unit;
        }
        this.LLILLJJLI.run();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BorderBizViewElement@9067.updateBorderViewV2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
