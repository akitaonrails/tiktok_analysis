package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.pay.SubscribePurchaseStrategy$queryOrder$1", f = "SubscribePurchaseStrategy.kt", l = {224}, m = "invokeSuspend")
public final class C516360KMw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C516200KMg LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0KJK LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516360KMw(C516200KMg c516200KMg, String str, C0KJK c0kjk, boolean z, String str2, InterfaceC1364105Vn<? super C516360KMw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c516200KMg;
        this.LLILLL = str;
        this.LLILZ = c0kjk;
        this.LLILZIL = z;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C516360KMw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscribePurchaseStrategy@752.queryOrder$1");
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
            C516190KMf c516190KMf = (C516190KMf) this.LLILLJJLI.LJII.getValue();
            String str = this.LLILLL;
            C0KJK c0kjk = this.LLILZ;
            boolean z = this.LLILZIL;
            String str2 = this.LLILZLL;
            C516430KNd c516430KNd = new C516430KNd(this.LLILLJJLI);
            this.LL = 1;
            if (c516190KMf.LIZLLL(str, c0kjk, z, str2, c516430KNd, this) == objLJFF) {
                C1C7U.LIZIZ("SubscribePurchaseStrategy@752.queryOrder$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscribePurchaseStrategy@752.queryOrder$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
