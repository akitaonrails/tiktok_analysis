package X;

import com.ss.android.ugc.aweme.ecommerce.ug.landing.GetLandingShopTabResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05H4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol$Companion$awaitLandingGet$2", f = "LandMallProtocol.kt", l = {}, m = "invokeSuspend")
public final class C05H4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GetLandingShopTabResponse LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05H4(GetLandingShopTabResponse getLandingShopTabResponse, String str, InterfaceC1364105Vn<? super C05H4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = getLandingShopTabResponse;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05H4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandMallProtocol$Companion@47b7.awaitLandingGet$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.data == null) {
            C1570870qyr.LIZ().erase(this.LLILLJJLI);
        } else {
            C1570870qyr.LIZ().storeString(this.LLILLJJLI, C1741890vQh.LJIIIIZZ(this.LL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LandMallProtocol$Companion@47b7.awaitLandingGet$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
