package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.trigger.SeaTriggerHandler$handleCheckPopUp$1$1$1", f = "SeaTrigger.kt", l = {}, m = "invokeSuspend")
public final class C1759120vsU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CheckPopUpResponse LLILLJJLI;
    public final /* synthetic */ SeaPdpViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759120vsU(CheckPopUpResponse checkPopUpResponse, SeaPdpViewModel seaPdpViewModel, InterfaceC1364105Vn<? super C1759120vsU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = checkPopUpResponse;
        this.LLILLL = seaPdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1759120vsU c1759120vsU = new C1759120vsU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1759120vsU.LL = obj;
        return c1759120vsU;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759120vsU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
