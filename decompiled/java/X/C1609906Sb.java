package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.router.EcomMemMonitorSparkViewCollector$getActiveKitViewList$2", f = "EcomMemMonitorSparkViewCollector.kt", l = {}, m = "invokeSuspend")
public final class C1609906Sb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Set<? extends InterfaceC1541990qEH>>, Object> {
    public C1609906Sb(InterfaceC1364105Vn<? super C1609906Sb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1609906Sb(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Set setLLIIJI;
        C1C7U.LIZ("EcomMemMonitorSparkViewCollector@7d6f.getActiveKitViewList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        synchronized (C1610306Sf.LIZ) {
            try {
                C1610306Sf.LIZJ(null);
                List<WeakReference<InterfaceC1541990qEH>> list = C1610306Sf.LIZJ;
                ArrayList arrayList = new ArrayList();
                Iterator<WeakReference<InterfaceC1541990qEH>> it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1541990qEH interfaceC1541990qEH = it2.next().get();
                    if (interfaceC1541990qEH != null) {
                        arrayList.add(interfaceC1541990qEH);
                    }
                }
                setLLIIJI = C13LP.LLIIJI(arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("EcomMemMonitorSparkViewCollector@7d6f.getActiveKitViewList$2");
        return setLLIIJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Set<? extends InterfaceC1541990qEH>> interfaceC1364105Vn) {
        return new C1609906Sb(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
