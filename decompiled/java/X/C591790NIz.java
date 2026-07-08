package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.goda.GodaV2Manager$getPageValue$valueFromStores$1", f = "GodaV2Manager.kt", l = {174, 175}, m = "invokeSuspend")
public final class C591790NIz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ C0NJ1 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591790NIz(C0NJ1 c0nj1, String str, InterfaceC1364105Vn<? super C591790NIz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nj1;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591790NIz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GodaV2Manager@ed2a.getPageValue$valueFromStores$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("GodaV2Manager@ed2a.getPageValue$valueFromStores$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0NJE c0njeLIZJ = this.LLILLJJLI.LIZJ();
            String str = this.LLILLL;
            this.LL = 1;
            obj = c0njeLIZJ.LIZ(str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GodaV2Manager@ed2a.getPageValue$valueFromStores$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            C0NJE c0njeLIZ = this.LLILLJJLI.LIZ();
            String str2 = this.LLILLL;
            this.LL = 2;
            obj = c0njeLIZ.LIZ(str2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GodaV2Manager@ed2a.getPageValue$valueFromStores$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GodaV2Manager@ed2a.getPageValue$valueFromStores$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
