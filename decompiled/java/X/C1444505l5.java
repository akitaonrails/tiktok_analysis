package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05l5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.supplier.FcpPolicySupplierImpl$handleApplyResult$1", f = "FcpPolicySupplierImpl.kt", l = {228}, m = "invokeSuspend")
public final class C1444505l5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1445005lA LLILLL;
    public final /* synthetic */ Set<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444505l5(C1445005lA c1445005lA, Set<String> set, InterfaceC1364105Vn<? super C1444505l5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1445005lA;
        this.LLILZ = set;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1444505l5 c1444505l5 = new C1444505l5(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1444505l5.LLILLJJLI = obj;
        return c1444505l5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpPolicySupplierImpl@c44d.handleApplyResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                Collection<InterfaceC1444205l2> collectionValues = this.LLILLL.LIZJ.values();
                Set<String> set = this.LLILZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1444405l4(set, (InterfaceC1444205l2) it2.next(), null), 3));
                }
                this.LL = 1;
                if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("FcpPolicySupplierImpl@c44d.handleApplyResult$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpPolicySupplierImpl@c44d.handleApplyResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
