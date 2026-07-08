package X;

import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatManager$enterScene$1$1$5", f = "EcomLoadRetreatManager.kt", l = {148}, m = "invokeSuspend")
public final class C1507800pL8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcomLoadRetreatConfigScene LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507800pL8(EcomLoadRetreatConfigScene ecomLoadRetreatConfigScene, String str, InterfaceC1364105Vn<? super C1507800pL8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecomLoadRetreatConfigScene;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1507800pL8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomLoadRetreatManager@da7f.enterScene$1$1$5");
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
            long j = this.LLILLJJLI.delayDisableTimeMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EcomLoadRetreatManager@da7f.enterScene$1$1$5");
                return objLJFF;
            }
        }
        C2232408os c2232408os = C1507830pLB.LIZ;
        C1507830pLB.LIZIZ(this.LLILLL, "delay");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomLoadRetreatManager@da7f.enterScene$1$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
