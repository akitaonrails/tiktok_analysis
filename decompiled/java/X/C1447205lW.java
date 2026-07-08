package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05lW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1447205lW extends C2217421BqW implements Function2<C1447405lY, InterfaceC1445905lJ, C1447405lY> {
    public C1447205lW(Object obj) {
        super(2, obj, C1447605la.class, "reduce", "reduce(Lcom/tiktok/kmp/fcp/supplier/FcpSlotState;Lcom/tiktok/kmp/fcp/redux/Action;)Lcom/tiktok/kmp/fcp/supplier/FcpSlotState;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1447405lY invoke(C1447405lY c1447405lY, InterfaceC1445905lJ interfaceC1445905lJ) {
        boolean z;
        C1447405lY c1447405lY2 = c1447405lY;
        InterfaceC1445905lJ interfaceC1445905lJ2 = interfaceC1445905lJ;
        C1447605la c1447605la = (C1447605la) this.receiver;
        c1447605la.getClass();
        if (interfaceC1445905lJ2 instanceof C1447505lZ) {
            C1447505lZ c1447505lZ = (C1447505lZ) interfaceC1445905lJ2;
            return C1447405lY.LIZ(c1447405lY2, c1447505lZ.LIZ, c1447505lZ.LIZIZ, null, null, null, 28);
        }
        if (interfaceC1445905lJ2 instanceof C1447005lU) {
            List<String> list = ((C1447005lU) interfaceC1445905lJ2).LIZ;
            if (list.isEmpty()) {
                return c1447405lY2;
            }
            ArrayList arrayList = new ArrayList(c1447405lY2.LIZLLL);
            ArrayList arrayList2 = new ArrayList(c1447405lY2.LJ);
            for (String str : list) {
                if (c1447605la.LIZ.LJ.invoke(str).intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1447605la.LIZ.LIZIZ.invoke(str, Boolean.valueOf(z));
                if (z) {
                    c1447605la.LIZ.LIZLLL.invoke(str, Boolean.TRUE);
                    if (arrayList.contains(str)) {
                        if (!arrayList2.contains(str)) {
                            arrayList2.add(str);
                        }
                    } else {
                        arrayList2.remove(str);
                    }
                } else {
                    c1447605la.LIZ.LIZLLL.invoke(str, Boolean.FALSE);
                    arrayList.remove(str);
                    arrayList2.remove(str);
                }
            }
            return C1447405lY.LIZ(c1447405lY2, null, null, null, arrayList, arrayList2, 7);
        }
        if (interfaceC1445905lJ2 instanceof C1447705lb) {
            List<String> list2 = ((C1447705lb) interfaceC1445905lJ2).LIZ;
            if (list2.isEmpty()) {
                return c1447405lY2;
            }
            ArrayList arrayList3 = new ArrayList(c1447405lY2.LIZJ);
            ArrayList arrayList4 = new ArrayList(c1447405lY2.LIZLLL);
            ArrayList arrayList5 = new ArrayList(c1447405lY2.LJ);
            for (String str2 : list2) {
                arrayList5.remove(str2);
                Function2<String, Boolean, Unit> function2 = c1447605la.LIZ.LIZLLL;
                Boolean bool = Boolean.FALSE;
                function2.invoke(str2, bool);
                if (c1447605la.LIZ.LJI.invoke(str2).booleanValue()) {
                    c1447605la.LIZ.LJFF.invoke(str2, Integer.valueOf(c1447605la.LIZ.LJ.invoke(str2).intValue() - 1));
                    c1447605la.LIZ.LIZIZ.invoke(str2, bool);
                    arrayList4.remove(str2);
                    arrayList3.remove(str2);
                }
            }
            return C1447405lY.LIZ(c1447405lY2, null, null, arrayList3, arrayList4, arrayList5, 3);
        }
        if (interfaceC1445905lJ2 instanceof C1447805lc) {
            return C1447405lY.LIZ(c1447405lY2, null, null, C13LP.LLIIII(((C1447805lc) interfaceC1445905lJ2).LIZ.LIZ()), null, null, 27);
        }
        if (interfaceC1445905lJ2 instanceof C1447105lV) {
            Set setLLIIJI = C13LP.LLIIJI(((C1447105lV) interfaceC1445905lJ2).LIZ);
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj : (ArrayList) C13LP.LJLIL(c1447405lY2.LIZIZ, c1447405lY2.LIZ)) {
                boolean zContains = setLLIIJI.contains(obj);
                c1447605la.LIZ.LIZIZ.invoke((String) obj, Boolean.valueOf(zContains));
                if (zContains) {
                    arrayList6.add(obj);
                    if (c1447605la.LIZ.LIZJ.invoke((String) obj).booleanValue()) {
                        arrayList7.add(obj);
                    }
                }
            }
            return C1447405lY.LIZ(c1447405lY2, null, null, null, arrayList6, arrayList7, 7);
        }
        if (!(interfaceC1445905lJ2 instanceof C1448205lg)) {
            return c1447405lY2;
        }
        C13BV c13bv = C13BV.INSTANCE;
        return C1447405lY.LIZ(c1447405lY2, null, null, c13bv, c13bv, c13bv, 3);
    }
}
