package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS621S0100000_7;
import njp.a;

/* JADX INFO: renamed from: X.0KMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.pay.SubscribePurchaseStrategy$queryOrder$1", f = "SubscribePurchaseStrategy.kt", l = {225}, m = "invokeSuspend")
public final class C516370KMx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0KMY LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0KFM LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516370KMx(C0KMY c0kmy, String str, C0KFM c0kfm, boolean z, String str2, InterfaceC1364105Vn<? super C516370KMx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kmy;
        this.LLILLL = str;
        this.LLILZ = c0kfm;
        this.LLILZIL = z;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C516370KMx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscribePurchaseStrategy@e575.queryOrder$1");
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
            C516180KMe c516180KMe = (C516180KMe) this.LLILLJJLI.LJII.getValue();
            String str = this.LLILLL;
            C0KFM c0kfm = this.LLILZ;
            boolean z = this.LLILZIL;
            String str2 = this.LLILZLL;
            AwS621S0100000_7 awS621S0100000_7 = new AwS621S0100000_7(this.LLILLJJLI, 49);
            this.LL = 1;
            if (c516180KMe.LIZLLL(str, c0kfm, z, str2, awS621S0100000_7, this) == objLJFF) {
                C1C7U.LIZIZ("SubscribePurchaseStrategy@e575.queryOrder$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscribePurchaseStrategy@e575.queryOrder$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
