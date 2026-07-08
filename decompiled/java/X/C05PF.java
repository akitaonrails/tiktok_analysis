package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05PF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fundraiser.native.pages.fundraiser.FundraiserPageComposeKt$FundraiserPageScreen$7$1", f = "FundraiserPageCompose.kt", l = {}, m = "invokeSuspend")
public final class C05PF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P1<Float> LL;
    public final /* synthetic */ C05P0<Float> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05PF(C05P1<Float> c05p1, C05P0<Float> c05p0, InterfaceC1364105Vn<? super C05PF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p1;
        this.LLILLJJLI = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FundraiserPageComposeKt@f3c9.FundraiserPageScreen$7$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setValue(Float.valueOf(this.LL.getValue().floatValue()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FundraiserPageComposeKt@f3c9.FundraiserPageScreen$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
