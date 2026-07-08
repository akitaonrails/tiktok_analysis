package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05l8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.supplier.FcpPolicySupplierImpl$handleReset$1", f = "FcpPolicySupplierImpl.kt", l = {250}, m = "invokeSuspend")
public final class C1444805l8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1445005lA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444805l8(C1445005lA c1445005lA, InterfaceC1364105Vn<? super C1444805l8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1445005lA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1444805l8 c1444805l8 = new C1444805l8(this.LLILLL, interfaceC1364105Vn);
        c1444805l8.LLILLJJLI = obj;
        return c1444805l8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpPolicySupplierImpl@c44d.handleReset$1");
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
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1444705l7((InterfaceC1444205l2) it2.next(), null), 3));
                }
                this.LL = 1;
                if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("FcpPolicySupplierImpl@c44d.handleReset$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpPolicySupplierImpl@c44d.handleReset$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
