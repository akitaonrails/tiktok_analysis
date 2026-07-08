package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Dfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$cleanNonToolStorage$job$1", f = "RecordConditionCheck.kt", l = {}, m = "invokeSuspend")
public final class C345020Dfo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AtomicLong LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345020Dfo(AtomicLong atomicLong, boolean z, InterfaceC1364105Vn<? super C345020Dfo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = atomicLong;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C345020Dfo c345020Dfo = new C345020Dfo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c345020Dfo.LL = obj;
        return c345020Dfo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        EnumC1335420kr6 enumC1335420kr6LIZLLL;
        EnumC1335420kr6 enumC1335420kr6LIZLLL2;
        String strLIZ;
        String strLIZ2;
        EnumC1335420kr6 enumC1335420kr6LIZLLL3;
        EnumC1335420kr6 enumC1335420kr6LIZLLL4;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLL) {
            List<InterfaceC345370DgN> listLJIIJJI = C2427009fA.LJIIJJI();
            arrayList = new ArrayList();
            for (Object obj2 : (ArrayList) listLJIIJJI) {
                InterfaceC345370DgN interfaceC345370DgN = (InterfaceC345370DgN) obj2;
                if (interfaceC345370DgN != null) {
                    enumC1335420kr6LIZLLL3 = interfaceC345370DgN.LIZLLL();
                } else {
                    enumC1335420kr6LIZLLL3 = null;
                }
                if (enumC1335420kr6LIZLLL3 != EnumC1335420kr6.RESOURCE) {
                    if (interfaceC345370DgN != null) {
                        enumC1335420kr6LIZLLL4 = interfaceC345370DgN.LIZLLL();
                    } else {
                        enumC1335420kr6LIZLLL4 = null;
                    }
                    if (enumC1335420kr6LIZLLL4 == EnumC1335420kr6.CACHE) {
                    }
                }
                arrayList.add(obj2);
            }
        } else {
            List<InterfaceC345370DgN> listLJIIJJI2 = C2427009fA.LJIIJJI();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : (ArrayList) listLJIIJJI2) {
                InterfaceC345370DgN interfaceC345370DgN2 = (InterfaceC345370DgN) obj3;
                if (interfaceC345370DgN2 != null) {
                    strLIZ = interfaceC345370DgN2.LIZ();
                } else {
                    strLIZ = null;
                }
                if (!Intrinsics.LJFF(strLIZ, "AV_STORAGE_CLEANER_CACHE")) {
                    if (interfaceC345370DgN2 != null) {
                        strLIZ2 = interfaceC345370DgN2.LIZ();
                    } else {
                        strLIZ2 = null;
                    }
                    if (!Intrinsics.LJFF(strLIZ2, "live_storage_business_tag")) {
                        arrayList2.add(obj3);
                    }
                }
            }
            arrayList = new ArrayList();
            for (Object obj4 : arrayList2) {
                InterfaceC345370DgN interfaceC345370DgN3 = (InterfaceC345370DgN) obj4;
                if (interfaceC345370DgN3 != null) {
                    enumC1335420kr6LIZLLL = interfaceC345370DgN3.LIZLLL();
                } else {
                    enumC1335420kr6LIZLLL = null;
                }
                if (enumC1335420kr6LIZLLL != EnumC1335420kr6.RESOURCE) {
                    if (interfaceC345370DgN3 != null) {
                        enumC1335420kr6LIZLLL2 = interfaceC345370DgN3.LIZLLL();
                    } else {
                        enumC1335420kr6LIZLLL2 = null;
                    }
                    if (enumC1335420kr6LIZLLL2 == EnumC1335420kr6.CACHE) {
                    }
                }
                arrayList.add(obj4);
            }
        }
        C238400w2 c238400w2 = new C238400w2();
        if (((Boolean) C0AUQ.LIZ.getValue()).booleanValue()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c238400w2.element += ((InterfaceC345370DgN) it2.next()).LJ(true);
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c238400w2.element += ((InterfaceC345370DgN) it3.next()).LJII(false);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ((InterfaceC345370DgN) it4.next()).LJII(true);
            }
        }
        return C2286608xc.LJFF(this.LLILLJJLI.addAndGet(c238400w2.element));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
