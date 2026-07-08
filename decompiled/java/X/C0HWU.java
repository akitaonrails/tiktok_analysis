package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HWU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.utils.FrescoUtils$loadBitmap$isInDiskCache$1", f = "FrescoUtils.kt", l = {}, m = "invokeSuspend")
public final class C0HWU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1325540kbA LL;
    public final /* synthetic */ C1325710kbR LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HWU(C1325540kbA c1325540kbA, C1325710kbR c1325710kbR, InterfaceC1364105Vn<? super C0HWU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1325540kbA;
        this.LLILLJJLI = c1325710kbR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HWU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FrescoUtils@2e.loadBitmap$isInDiskCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL.LJIILJJIL(this.LLILLJJLI));
        C1C7U.LIZIZ("FrescoUtils@2e.loadBitmap$isInDiskCache$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
