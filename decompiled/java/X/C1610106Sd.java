package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.router.EcomMemMonitorSparkViewCollector$postAddKitView$1", f = "EcomMemMonitorSparkViewCollector.kt", l = {}, m = "invokeSuspend")
public final class C1610106Sd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1541990qEH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610106Sd(InterfaceC1541990qEH interfaceC1541990qEH, InterfaceC1364105Vn<? super C1610106Sd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1541990qEH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1610106Sd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomMemMonitorSparkViewCollector@7d6f.postAddKitView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1610306Sf c1610306Sf = C1610306Sf.LIZ;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LL;
        synchronized (c1610306Sf) {
            try {
                C1610306Sf.LIZJ(null);
                if (!interfaceC1541990qEH.T0()) {
                    List<WeakReference<InterfaceC1541990qEH>> list = C1610306Sf.LIZJ;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        ((LinkedList) C1610306Sf.LIZJ).add(new WeakReference(interfaceC1541990qEH));
                    } else {
                        Iterator<WeakReference<InterfaceC1541990qEH>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().get() == interfaceC1541990qEH) {
                                break;
                            }
                        }
                        ((LinkedList) C1610306Sf.LIZJ).add(new WeakReference(interfaceC1541990qEH));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomMemMonitorSparkViewCollector@7d6f.postAddKitView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
