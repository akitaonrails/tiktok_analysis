package X;

import com.ss.android.ugc.aweme.im.b2c.analytics.B2CAnalyticsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.B2CAnalyticsAssem$onCreate$3", f = "B2CAnalyticsAssem.kt", l = {74}, m = "invokeSuspend")
public final class C05LT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ B2CAnalyticsAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LT(B2CAnalyticsAssem b2CAnalyticsAssem, InterfaceC1364105Vn<? super C05LT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = b2CAnalyticsAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("B2CAnalyticsAssem@fef6.onCreate$3");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("B2CAnalyticsAssem@fef6.onCreate$3");
                return objLJFF;
            }
        }
        B2CAnalyticsAssem b2CAnalyticsAssem = this.LLILLJJLI;
        C23250099c.LIZLLL(b2CAnalyticsAssem.LLJILJIL, null, null, new C1593706Lv(b2CAnalyticsAssem, null, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("B2CAnalyticsAssem@fef6.onCreate$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
