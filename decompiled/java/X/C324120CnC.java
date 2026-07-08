package X;

import android.net.Uri;
import com.bytedance.router.RouteIntent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor$routeShopV3$3", f = "StoreInterceptor.kt", l = {739}, m = "invokeSuspend")
public final class C324120CnC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1738990vM1 LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ C1739060vM8 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ RouteIntent LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Map<String, Object> LLJ;
    public final /* synthetic */ C1211320hcw LLJI;
    public final /* synthetic */ boolean LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324120CnC(C1738990vM1 c1738990vM1, Uri uri, C1739060vM8 c1739060vM8, String str, RouteIntent routeIntent, String str2, String str3, Map<String, Object> map, C1211320hcw c1211320hcw, boolean z, InterfaceC1364105Vn<? super C324120CnC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1738990vM1;
        this.LLILLL = uri;
        this.LLILZ = c1739060vM8;
        this.LLILZIL = str;
        this.LLILZLL = routeIntent;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = map;
        this.LLJI = c1211320hcw;
        this.LLJIJIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324120CnC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreInterceptor@c22c.routeShopV3$3");
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
            this.LLILLJJLI.LJIILIIL = C1530470pvh.LIZ(this.LLILLL);
            C1739060vM8 c1739060vM8 = this.LLILZ;
            String str = this.LLILZIL;
            C1738990vM1 c1738990vM1 = this.LLILLJJLI;
            RouteIntent routeIntent = this.LLILZLL;
            String str2 = this.LLIZ;
            String str3 = this.LLIZLLLIL;
            Map<String, Object> map = this.LLJ;
            C1211320hcw c1211320hcw = this.LLJI;
            boolean z = this.LLJIJIL;
            this.LL = 1;
            c1739060vM8.getClass();
            C23250099c.LIZIZ(C2296808zG.LIZ(getContext()), null, null, new C324070Cn7(c1739060vM8, c1738990vM1, str, null), 3);
            C23250099c.LIZIZ(C2296808zG.LIZ(getContext()), null, null, new C324080Cn8(c1739060vM8, c1738990vM1, str, null), 3);
            C23250099c.LIZIZ(C2296808zG.LIZ(getContext()), null, null, new C1739080vMA(c1739060vM8, map, str, z, c1738990vM1, c1211320hcw, null), 3);
            C23250099c.LIZIZ(C2296808zG.LIZ(getContext()), null, null, new C324110CnB(c1739060vM8, c1738990vM1, routeIntent, str, str2, str3, map, null), 3);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("StoreInterceptor@c22c.routeShopV3$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreInterceptor@c22c.routeShopV3$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
