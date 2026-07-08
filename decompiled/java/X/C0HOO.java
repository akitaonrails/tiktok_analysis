package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HOO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HOO {
    public static final /* synthetic */ C0HOO LIZ = new C0HOO();

    public static C0HOM LIZLLL(C0HOM c0hom) {
        C0HOM c0hom2 = C1372605Yu.LIZIZ;
        if (!Intrinsics.LJFF(c0hom, c0hom2)) {
            c0hom2 = C0HON.LIZIZ;
            if (!Intrinsics.LJFF(c0hom, c0hom2)) {
                C1372505Yt c1372505Yt = C1372505Yt.LIZIZ;
                if (Intrinsics.LJFF(c0hom, c1372505Yt)) {
                    return c1372505Yt;
                }
                if (c0hom instanceof C1372405Ys) {
                    Object objLJJJLL = C13LP.LJJJLL((List) ((C1372405Ys) c0hom).LIZIZ);
                    if (objLJJJLL != null) {
                        return new C1372405Ys(objLJJJLL);
                    }
                } else if (!(c0hom instanceof C0HKV)) {
                    if (c0hom instanceof C05Z7) {
                        Object objLJJJLL2 = C13LP.LJJJLL((List) ((C05Z7) c0hom).LIZIZ);
                        if (objLJJJLL2 != null) {
                            return new C05Z7(objLJJJLL2);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    return c0hom;
                }
            }
        }
        return c0hom2;
    }

    public static AnonymousClass0951 LIZ(List list, InterfaceC497601wk interfaceC497601wk) throws Exception {
        C1372405Ys c1372405Ys;
        T t;
        if (list.size() == 1) {
            return LJ(interfaceC497601wk, (C05YD) C13LP.LJJJJZI(list));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object value = ((C05YD) it2.next()).getValue();
            if ((value instanceof C1372405Ys) && (c1372405Ys = (C1372405Ys) value) != null && (t = c1372405Ys.LIZIZ) != 0) {
                arrayList.add(t);
            }
        }
        C1372405Ys c1372405Ys2 = new C1372405Ys(arrayList);
        if (arrayList.size() != list.size() && C1948707kD.LIZ().isDebug()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[combineAndWrapCreated] data inconsistency error: ");
            sbLIZ.append(arrayList.size());
            sbLIZ.append(", ");
            sbLIZ.append(list.size());
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        C462990IDp c462990IDp = new C462990IDp((InterfaceC346201Wa[]) C13LP.LLIIII(list).toArray(new InterfaceC346201Wa[0]), list, 0);
        C05YW.LIZ.getClass();
        return C09IC.LJJIJIL(c462990IDp, interfaceC497601wk, C1370905Yd.LIZIZ, c1372405Ys2);
    }

    public static AnonymousClass0951 LJ(InterfaceC497601wk interfaceC497601wk, C05YD c05yd) {
        C463000IDq c463000IDq = new C463000IDq(c05yd, 41);
        C05YW.LIZ.getClass();
        return C09IC.LJJIJIL(c463000IDq, interfaceC497601wk, C1370905Yd.LIZIZ, ((C0HOM) c05yd.getValue()).LIZ());
    }

    public static C0HOM LIZIZ(InterfaceC439080HJq interfaceC439080HJq, String str, int i) {
        if (interfaceC439080HJq instanceof C1372105Yp) {
            C1372105Yp c1372105Yp = (C1372105Yp) interfaceC439080HJq;
            return new C1372405Ys(new C440440HOw(c1372105Yp.LIZ, c1372105Yp.LIZIZ, str, c1372105Yp.LIZJ, i));
        }
        if (Intrinsics.LJFF(interfaceC439080HJq, C439090HJr.LIZ)) {
            return C0HON.LIZIZ;
        }
        if (interfaceC439080HJq instanceof C0HK3) {
            C0HK3 c0hk3 = (C0HK3) interfaceC439080HJq;
            return new C0HKV(c0hk3.LIZ, c0hk3.LIZIZ);
        }
        if (Intrinsics.LJFF(interfaceC439080HJq, C1341305Mt.LIZ)) {
            return C1372505Yt.LIZIZ;
        }
        if (Intrinsics.LJFF(interfaceC439080HJq, C1341405Mu.LIZ)) {
            return C1372605Yu.LIZIZ;
        }
        if (interfaceC439080HJq instanceof C0HK4) {
            return new C0HKV(null, ((C0HK4) interfaceC439080HJq).LIZ);
        }
        if (interfaceC439080HJq instanceof C438980HJg) {
            C438980HJg c438980HJg = (C438980HJg) interfaceC439080HJq;
            return new C05Z7(new C440440HOw(c438980HJg.LIZ, "", str, c438980HJg.LIZIZ, i));
        }
        throw new C1954807lC();
    }

    public static AnonymousClass0951 LIZJ(final C05YD c05yd, InterfaceC497601wk interfaceC497601wk, final String str, final int i) {
        InterfaceC346201Wa<C0HOM<? extends C440440HOw>> interfaceC346201Wa = new InterfaceC346201Wa<C0HOM<? extends C440440HOw>>() { // from class: X.0HOQ
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super C0HOM<? extends C440440HOw>> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = c05yd.collect(new C0HOR(interfaceC346701Wf, str, i), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
        C05YW.LIZ.getClass();
        return C09IC.LJJIJIL(interfaceC346201Wa, interfaceC497601wk, C1370905Yd.LIZIZ, LIZIZ((InterfaceC439080HJq) c05yd.getValue(), str, i));
    }
}
