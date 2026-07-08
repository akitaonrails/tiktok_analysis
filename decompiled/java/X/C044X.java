package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.044X, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$fetchSkuInfoSea$2", f = "SeaPdpViewModel.kt", l = {2655}, m = "invokeSuspend")
public final class C044X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SeaPdpViewModel LL;
    public Object LLILLJJLI;
    public SkuItem LLILLL;
    public int LLILZ;
    public final /* synthetic */ SeaPdpViewModel LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C044X(SeaPdpViewModel seaPdpViewModel, Boolean bool, InterfaceC1364105Vn<? super C044X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = seaPdpViewModel;
        this.LLILZLL = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C044X(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0502 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 1433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C044X.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
