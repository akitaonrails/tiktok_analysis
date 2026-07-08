package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vMH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.mix.impl.StorePreloader$startPreloadFirstScreen$1", f = "StorePreloader.kt", l = {}, m = "invokeSuspend")
public final class C1739150vMH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ n LL;
    public final /* synthetic */ C1739160vMI LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739150vMH(n nVar, C1739160vMI c1739160vMI, InterfaceC1364105Vn<? super C1739150vMH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nVar;
        this.LLILLJJLI = c1739160vMI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739150vMH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorePreloader@41f1.startPreloadFirstScreen$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2399609ak.LJFF(this.LL, "gecko_version", C2286608xc.LJFF(C1530470pvh.LIZ(UriProtector.parse("aweme://lynxview?url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F8%2Fteko%2Fresource%2Ftiktok_ecommerce_shop_mix%2Fpages%2Fheader-container%2Ftemplate.js"))));
        C1739170vMJ c1739170vMJLIZLLL = this.LLILLJJLI.LIZLLL(this.LL, false);
        if (c1739170vMJLIZLLL != null) {
            this.LLILLJJLI.LIZIZ.set(c1739170vMJLIZLLL);
            c1739170vMJLIZLLL.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorePreloader@41f1.startPreloadFirstScreen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
