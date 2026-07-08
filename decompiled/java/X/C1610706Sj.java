package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS403S0200000_2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06Sj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.memory.EcomMemoryMonitor$onLowMemoryAsync$1$notifiedViewList$1", f = "EcomMemoryMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1610706Sj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends InterfaceC1541990qEH>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Set<InterfaceC1541990qEH> LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1610706Sj(Set<? extends InterfaceC1541990qEH> set, JSONObject jSONObject, InterfaceC1364105Vn<? super C1610706Sj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = set;
        this.LLILLL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1610706Sj c1610706Sj = new C1610706Sj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1610706Sj.LL = obj;
        return c1610706Sj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("EcomMemoryMonitor@ac15.onLowMemoryAsync$1$notifiedViewList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set<InterfaceC1541990qEH> set = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (!((InterfaceC1541990qEH) obj2).T0()) {
                arrayList.add(obj2);
            }
        }
        JSONObject jSONObject = this.LLILLL;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) obj3;
            try {
                interfaceC1541990qEH.LIZ("ec_memory_warning_notify", jSONObject);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1610606Si c1610606Si = C1610606Si.LIZ;
                new AwS403S0200000_2(interfaceC1541990qEH, thM5exceptionOrNullimpl, 48);
                c1610606Si.getClass();
                C1610606Si.LIZIZ();
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                arrayList2.add(obj3);
            }
        }
        C1C7U.LIZIZ("EcomMemoryMonitor@ac15.onLowMemoryAsync$1$notifiedViewList$1");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends InterfaceC1541990qEH>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
