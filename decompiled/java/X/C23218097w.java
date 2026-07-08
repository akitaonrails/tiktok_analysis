package X;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.097w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23218097w {
    public static final C01GW LIZ = C452501pT.LIZIZ(new AnonymousClass0981());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C23220097y());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C23221097z());

    public static C11HT LIZ(InterfaceC2098308Jx interfaceC2098308Jx) {
        C23219097x c23219097x = (C23219097x) ((C098J) LIZ.getValue()).get(interfaceC2098308Jx.getRequestId());
        if (c23219097x != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch from cache ");
            sbLIZ.append(interfaceC2098308Jx.getPath());
            C20441214yg.LIZIZ("MixRequestCache", C2188811AlT.LIZIZ(sbLIZ));
            LIZIZ(interfaceC2098308Jx);
            AnonymousClass0984<?> anonymousClass0984 = c23219097x.LIZ;
            anonymousClass0984.getClass();
            return new C11HT(anonymousClass0984);
        }
        return LIZIZ(interfaceC2098308Jx);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.01kM, java.lang.Object] */
    public static C11HT LIZIZ(final InterfaceC2098308Jx interfaceC2098308Jx) {
        C19476611Hw c19476611HwLJL = interfaceC2098308Jx.LIZ().LJJIJLIJ().LJL(C11S5.LIZ());
        C1701890uOB.LIZIZ(1, "initialCapacity");
        C11RS c11rsLJLZ = C11RS.LJLZ(new C19501211Ri(c19476611HwLJL, 1));
        final C259800zU c259800zU = new C259800zU();
        ?? LJJLL = c11rsLJLZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.093W
            public final /* synthetic */ boolean LL = true;

            @Override // X.C09JN
            public final void accept(T t) {
                C1C7U.LIZ("MixRequestCache@ed9f.fetchRemote$1$1");
                if (this.LL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cache success, path = ");
                    sbLIZ.append(interfaceC2098308Jx.getPath());
                    C20441214yg.LIZIZ("MixRequestCache", C2188811AlT.LIZIZ(sbLIZ));
                    C259800zU<InterfaceC420801kM> c259800zU2 = c259800zU;
                    if (c259800zU2.element != null) {
                        Object value = C23218097w.LIZJ.getValue();
                        C19719512Dh.LIZ(value).remove(c259800zU2.element);
                    }
                }
                C1C7U.LIZIZ("MixRequestCache@ed9f.fetchRemote$1$1");
            }
        }, new C09JN() { // from class: X.093X
            public final /* synthetic */ boolean LL = true;

            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MixRequestCache@ed9f.fetchRemote$1$2");
                if (this.LL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cache error, path = ");
                    sbLIZ.append(interfaceC2098308Jx.getPath());
                    C20441214yg.LIZIZ("MixRequestCache", C2188811AlT.LIZIZ(sbLIZ));
                    String requestId = interfaceC2098308Jx.getRequestId();
                    ((C098J) C23218097w.LIZ.getValue()).LIZ(requestId);
                    ((HashMap) C23218097w.LIZIZ.getValue()).remove(requestId);
                    C259800zU<InterfaceC420801kM> c259800zU2 = c259800zU;
                    if (c259800zU2.element != null) {
                        Object value = C23218097w.LIZJ.getValue();
                        C19719512Dh.LIZ(value).remove(c259800zU2.element);
                    }
                }
                C1C7U.LIZIZ("MixRequestCache@ed9f.fetchRemote$1$2");
            }
        });
        c259800zU.element = LJJLL;
        ((HashSet) LIZJ.getValue()).add(LJJLL);
        ((C098J) LIZ.getValue()).put(interfaceC2098308Jx.getRequestId(), new C23219097x(interfaceC2098308Jx, c11rsLJLZ));
        HashMap map = (HashMap) LIZIZ.getValue();
        String requestId = interfaceC2098308Jx.getRequestId();
        AnonymousClass0980 anonymousClass0980 = new AnonymousClass0980();
        c11rsLJLZ.LJLLLLLL(anonymousClass0980);
        map.put(requestId, anonymousClass0980.LL);
        return new C11HT(c11rsLJLZ);
    }
}
