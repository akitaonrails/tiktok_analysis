package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.model.EcomSnapBoostResultEvent$Companion$sendEcomSnapBoostResultEvent$1", f = "EcomSnapBoostResultEvent.kt", l = {}, m = "invokeSuspend")
public final class C13040058k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1489405sK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13040058k(String str, String str2, long j, C1489405sK c1489405sK, InterfaceC1364105Vn<? super C13040058k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = c1489405sK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13040058k(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomSnapBoostResultEvent$Companion@8a7c.sendEcomSnapBoostResultEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1018703yb.LIZLLL("rd_tiktokec_snapboost_result", new C1489305sJ(this.LLILLL, this.LLILZ, this.LL, this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomSnapBoostResultEvent$Companion@8a7c.sendEcomSnapBoostResultEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
