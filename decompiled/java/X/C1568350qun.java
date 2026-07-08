package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.guide.BagGuidanceAnimRequestHelper$requestBagAnimation$1", f = "BagGuidanceAnimRequestHelper.kt", l = {60}, m = "invokeSuspend")
public final class C1568350qun extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C21213017zs LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568350qun(long j, C21213017zs c21213017zs, Long l, InterfaceC1364105Vn<? super C1568350qun> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c21213017zs;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568350qun(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BagGuidanceAnimRequestHelper@8fa.requestBagAnimation$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("BagGuidanceAnimRequestHelper@8fa.requestBagAnimation$1");
                return objLJFF;
            }
        }
        C21213017zs c21213017zs = this.LLILLL;
        c21213017zs.LIZJ = true;
        C21212917zr c21212917zr = c21213017zs.LIZLLL;
        if (c21212917zr != null) {
            this.LLILZ.longValue();
            c21212917zr.LJFF(null, true);
        }
        this.LLILLL.LIZLLL = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BagGuidanceAnimRequestHelper@8fa.requestBagAnimation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
