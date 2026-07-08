package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS290S0000000_7;
import njp.a;

/* JADX INFO: renamed from: X.0KP9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.impl.pay.FansPurchaseStrategy$queryOrder$1", f = "FansPurchaseStrategy.kt", l = {52}, m = "invokeSuspend")
public final class C0KP9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0KP7 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0KP3 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KP9(C0KP7 c0kp7, String str, C0KP3 c0kp3, boolean z, String str2, InterfaceC1364105Vn<? super C0KP9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kp7;
        this.LLILLL = str;
        this.LLILZ = c0kp3;
        this.LLILZIL = z;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KP9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FansPurchaseStrategy@cd98.queryOrder$1");
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
            C0KP7 c0kp7 = this.LLILLJJLI;
            String str = this.LLILLL;
            C0KP3 c0kp3 = this.LLILZ;
            boolean z = this.LLILZIL;
            String str2 = this.LLILZLL;
            AFwS290S0000000_7 aFwS290S0000000_7 = AFwS290S0000000_7.get$arr$(0);
            this.LL = 1;
            if (c0kp7.LIZIZ(str, c0kp3, z, str2, aFwS290S0000000_7, this) == objLJFF) {
                C1C7U.LIZIZ("FansPurchaseStrategy@cd98.queryOrder$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FansPurchaseStrategy@cd98.queryOrder$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
