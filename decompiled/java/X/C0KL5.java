package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KL5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.productfetch.SubscribeProductFetchStrategy$fetchProduct$1$1", f = "SubscribeProductFetchStrategy.kt", l = {51, 53}, m = "invokeSuspend")
public final class C0KL5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0KLA LLILLJJLI;
    public final /* synthetic */ C0KL3 LLILLL;
    public final /* synthetic */ InterfaceC511950K5x LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KL5(C0KLA c0kla, C0KL3 c0kl3, InterfaceC511950K5x interfaceC511950K5x, InterfaceC1364105Vn<? super C0KL5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kla;
        this.LLILLL = c0kl3;
        this.LLILZ = interfaceC511950K5x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KL5(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SubscribeProductFetchStrategy@a194.fetchProduct$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    String str = (String) obj;
                    str.getClass();
                    this.LLILLJJLI.LJIIJJI = str;
                    super/*X.0KLE*/.LIZIZ(this.LLILZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SubscribeProductFetchStrategy@a194.fetchProduct$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.LJI) {
                C0KL3 c0kl3 = this.LLILLL;
                this.LL = 1;
                c0kl3.getClass();
                Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C515860KKy(null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("SubscribeProductFetchStrategy@a194.fetchProduct$1$1");
                    return objLJFF;
                }
            }
        }
        C0KL8 c0kl8 = C0KL8.LIZ;
        this.LL = 2;
        obj = c0kl8.LIZIZ(this, null);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("SubscribeProductFetchStrategy@a194.fetchProduct$1$1");
            return objLJFF;
        }
        String str2 = (String) obj;
        str2.getClass();
        this.LLILLJJLI.LJIIJJI = str2;
        super/*X.0KLE*/.LIZIZ(this.LLILZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SubscribeProductFetchStrategy@a194.fetchProduct$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
