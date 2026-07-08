package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.live.TopLiveProductViewNew$preloadImage$2", f = "TopLiveProductViewNew.kt", l = {}, m = "invokeSuspend")
public final class C665910QAb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C0QAZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665910QAb(C0QAZ c0qaz, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c0qaz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C665910QAb(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopLiveProductViewNew@8093.preloadImage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
        if (interfaceC1325460kb2LIZJ != null && interfaceC1325460kb2LIZJ.LJIIIZ(UriProtector.parse(this.LL))) {
            C099F c099f = this.LLILLJJLI.LLJLLL;
            if (c099f != null) {
                Boolean.valueOf(c099f.LJJLIIIJILLIZJL(Unit.LIZ));
            }
        } else if (C1202504n9.LIZ() && C214900sF.LIZ()) {
            C099F c099f2 = this.LLILLJJLI.LLJLLL;
            if (c099f2 != null) {
                Boolean.valueOf(c099f2.LJJLIIIJILLIZJL(Unit.LIZ));
            }
        } else {
            C1331660kl2.LJIIIZ(this.LL).LJJII(new C0R4P(this.LLILLJJLI, 1));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopLiveProductViewNew@8093.preloadImage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
