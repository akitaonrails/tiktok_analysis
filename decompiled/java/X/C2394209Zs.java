package X;

import Y.ARunnableS72S0200000_3;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09Zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2394209Zs {
    public static final <T> Object LIZ(C0X9S<T> c0x9s, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(new C2394309Zt(c0x9s));
        c0x9s.enqueue(new InterfaceC594300NSq<T>() { // from class: X.09Zr
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<T> c0x9s2, Throwable th) {
                InterfaceC20236714Gf interfaceC20236714Gf = c2252611DEt;
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<T> c0x9s2, C0X52<T> c0x52) {
                if (c0x52.LIZJ()) {
                    T t = c0x52.LIZIZ;
                    if (t == null) {
                        Method method = ((C1974107oJ) c0x9s2.request().tag(C1974107oJ.class)).LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Response from ");
                        sbLIZ.append(method.getDeclaringClass().getName());
                        sbLIZ.append('.');
                        sbLIZ.append(method.getName());
                        sbLIZ.append(" was null but response body type was declared as non-null");
                        C1501730pBL c1501730pBL = new C1501730pBL(C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC20236714Gf interfaceC20236714Gf = c2252611DEt;
                        C098200Yq c098200Yq = new C098200Yq(c1501730pBL);
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC20236714Gf.resumeWith(c098200Yq);
                        return;
                    }
                    InterfaceC20236714Gf interfaceC20236714Gf2 = c2252611DEt;
                    C189200o6.m2constructorimpl(t);
                    interfaceC20236714Gf2.resumeWith(t);
                    return;
                }
                InterfaceC20236714Gf interfaceC20236714Gf3 = c2252611DEt;
                C098200Yq c098200Yq2 = new C098200Yq(new C09HQ(c0x52));
                C189200o6.m2constructorimpl(c098200Yq2);
                interfaceC20236714Gf3.resumeWith(c098200Yq2);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final Object LIZIZ(Exception exc, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0WQQ.LIZ(C0PEM.LIZ, interfaceC1364105Vn.getContext(), new ARunnableS72S0200000_3(interfaceC1364105Vn, exc, 6));
        Object objLJFF = C099R.LJFF();
        if (objLJFF == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJFF == C099R.LJFF()) {
            return objLJFF;
        }
        return Unit.LIZ;
    }
}
