package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09QR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.diversion.pdpshare.EcSearchOutOfAppManager$tryRedirectShopPdpToShopSearch$1$1$1", f = "EcSearchOutOfAppManager.kt", l = {79}, m = "invokeSuspend")
public final class C09QR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C557050Lt1 LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function2<String, Context, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09QR(long j, C557050Lt1 c557050Lt1, C259800zU<String> c259800zU, long j2, Function2<? super String, ? super Context, Unit> function2, InterfaceC1364105Vn<? super C09QR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c557050Lt1;
        this.LLILZ = c259800zU;
        this.LLILZIL = j2;
        this.LLILZLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09QR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchOutOfAppManager@382f.tryRedirectShopPdpToShopSearch$1$1$1");
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
                C1C7U.LIZIZ("EcSearchOutOfAppManager@382f.tryRedirectShopPdpToShopSearch$1$1$1");
                return objLJFF;
            }
        }
        if (this.LLILLL.LIZ(false, true)) {
            C09QZ c09qz = C09QZ.LIZ;
            String str = this.LLILZ.element;
            long j2 = this.LLILZIL;
            long j3 = this.LLILLJJLI;
            Function2<String, Context, Unit> function2 = this.LLILZLL;
            c09qz.getClass();
            C09QZ.LIZIZ(j2, j3, str, function2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchOutOfAppManager@382f.tryRedirectShopPdpToShopSearch$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
