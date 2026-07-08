package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.iap.component.impl.PgcPaymentServiceImpl$fetchOrSingle$2$component$1", f = "PgcPaymentServiceImpl.kt", l = {228}, m = "invokeSuspend")
public final class C376401dC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C1615950s9Z>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1616850sB1 LLILLL;
    public final /* synthetic */ C1616880sB4 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C376401dC(C1616850sB1 c1616850sB1, C1616880sB4 c1616880sB4, InterfaceC1364105Vn<? super C376401dC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1616850sB1;
        this.LLILZ = c1616880sB4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C376401dC c376401dC = new C376401dC(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c376401dC.LLILLJJLI = obj;
        return c376401dC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PgcPaymentServiceImpl@624d.fetchOrSingle$2$component$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                AbstractC19484711Kz<C1615950s9Z> abstractC19484711KzLIZJ = this.LLILLL.LIZJ(this.LLILZ, false);
                this.LL = 1;
                obj = C11UD.LIZIZ(abstractC19484711KzLIZJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.fetchOrSingle$2$component$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C1615950s9Z) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("PgcPaymentServiceImpl@624d.fetchOrSingle$2$component$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C1615950s9Z>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
