package Y;

import X.AbstractC19987213Ig;
import X.C13G9;
import X.C13GA;
import X.C13GS;
import X.C13HG;
import X.C13IQ;
import X.C13JJ;
import X.C13LP;
import X.C19987613Ik;
import X.C2097608Jq;
import X.InterfaceC19983313Gt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class AObjectS299S0200000_30 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$0(AObjectS299S0200000_30 aObjectS299S0200000_30) {
        return new C13G9((C13HG) ((C13GA) aObjectS299S0200000_30.l0).LIZ.invoke((C13IQ) aObjectS299S0200000_30.l1));
    }

    public static final Object invoke$1(AObjectS299S0200000_30 aObjectS299S0200000_30) {
        boolean z;
        String lowerCase;
        String[] strArrNames;
        InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) aObjectS299S0200000_30.l0;
        AbstractC19987213Ig abstractC19987213Ig = (AbstractC19987213Ig) aObjectS299S0200000_30.l1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (abstractC19987213Ig.LIZ.LJIIL && Intrinsics.LJFF(interfaceC19983313Gt.LIZIZ(), C13GS.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        C19987613Ik.LJ(interfaceC19983313Gt, abstractC19987213Ig);
        int iLJ = interfaceC19983313Gt.LJ();
        for (int i = 0; i < iLJ; i++) {
            List<Annotation> listLJFF = interfaceC19983313Gt.LJFF(i);
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : listLJFF) {
                if (annotation instanceof C13JJ) {
                    arrayList.add(annotation);
                }
            }
            C13JJ c13jj = (C13JJ) C13LP.LJLL(arrayList);
            if (c13jj != null && (strArrNames = c13jj.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (z) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                    }
                    C19987613Ik.LIZ(linkedHashMap, interfaceC19983313Gt, lowerCase2, i);
                }
            }
            if (z && (lowerCase = interfaceC19983313Gt.LIZJ(i).toLowerCase(Locale.ROOT)) != null) {
                C19987613Ik.LIZ(linkedHashMap, interfaceC19983313Gt, lowerCase, i);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return C2097608Jq.LJ();
        }
        return linkedHashMap;
    }

    public AObjectS299S0200000_30(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
