package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS140S0400000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700150RdF {
    public final C0RXZ LIZ;
    public final InterfaceC700200RdK LIZIZ;

    public static List LJFF() {
        return C1697810uHb.LJIIJJI(new Pair("enable", null), new Pair("density", null), new Pair("active", null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0225  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C700170RdH r44) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700150RdF.LIZIZ(X.0RdH):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700150RdF.LIZLLL(java.lang.String):void");
    }

    public final void LJ(String str) {
        Set setLLIIJI;
        String identifier;
        InterfaceC1443605kw result;
        List<String> listLIZ;
        InterfaceC1444205l2 interfaceC1444205l2 = this.LIZ.LJIIJ().LIZIZ;
        if (interfaceC1444205l2 == null || (result = interfaceC1444205l2.getResult()) == null || (listLIZ = result.LIZ()) == null || (setLLIIJI = C13LP.LLIIJI(listLIZ)) == null) {
            setLLIIJI = C08CX.INSTANCE;
        }
        if (str != null && str.length() != 0) {
            C1445005lA c1445005lALJIIJ = this.LIZ.LJIIJ();
            InterfaceC1444205l2 interfaceC1444205l22 = c1445005lALJIIJ.LIZIZ;
            if (interfaceC1444205l22 != null) {
                identifier = interfaceC1444205l22.getIdentifier();
            } else {
                identifier = null;
            }
            for (InterfaceC1444205l2 interfaceC1444205l23 : c1445005lALJIIJ.LIZJ.values()) {
                if (interfaceC1444205l23.getNodeType() != EnumC1450305m1.BY_PASS && !Intrinsics.LJFF(interfaceC1444205l23.getIdentifier(), identifier) && interfaceC1444205l23.LJ().LJFF()) {
                    if (setLLIIJI.contains(interfaceC1444205l23.getIdentifier())) {
                        String identifier2 = interfaceC1444205l23.getIdentifier();
                        EnumC699110RbZ enumC699110RbZ = EnumC699110RbZ.N2ONE;
                        C0RZ2 c0rz2 = C0RZ2.SUCCEED;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("KMP decision success! Winner under ");
                        sbLIZ.append(identifier);
                        sbLIZ.append('.');
                        C2188811AlT.LIZIZ(sbLIZ);
                        C697890RZb.LIZIZ(str, identifier2, enumC699110RbZ, c0rz2);
                    } else {
                        String identifier3 = interfaceC1444205l23.getIdentifier();
                        EnumC699110RbZ enumC699110RbZ2 = EnumC699110RbZ.N2ONE;
                        C0RZ2 c0rz22 = C0RZ2.FAILED;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("KMP decision failed! Lost competition under ");
                        sbLIZ2.append(identifier);
                        sbLIZ2.append('.');
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C697890RZb.LIZIZ(str, identifier3, enumC699110RbZ2, c0rz22);
                    }
                }
            }
        }
    }

    public C700150RdF(C0RXZ c0rxz, C701390RfF c701390RfF) {
        this.LIZ = c0rxz;
        this.LIZIZ = c701390RfF;
    }

    public final C700950ReX LIZ(Map<String, C700970ReZ> map, AbstractC701310Rf7 abstractC701310Rf7) {
        List<String> listLIZ;
        AbstractC701310Rf7 abstractC701310Rf72;
        InterfaceC1443605kw result;
        InterfaceC1444205l2 interfaceC1444205l2 = this.LIZ.LJIIJ().LIZIZ;
        if (interfaceC1444205l2 == null || (result = interfaceC1444205l2.getResult()) == null || (listLIZ = result.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            C700970ReZ c700970ReZ = map.get(it2.next());
            if (c700970ReZ != null) {
                arrayList.add(c700970ReZ);
            }
        }
        C13BV c13bv = C13BV.INSTANCE;
        if (abstractC701310Rf7 instanceof C701320Rf8) {
            abstractC701310Rf72 = C701320Rf8.LIZ;
        } else {
            abstractC701310Rf72 = C701300Rf6.LIZ;
        }
        return new C700950ReX(arrayList, arrayList, c13bv, c13bv, abstractC701310Rf72);
    }

    public final void LIZJ(C700170RdH c700170RdH, C700260RdQ c700260RdQ, Function1 function1) {
        AbstractC1443905kz c1443205ks;
        List list;
        if (c700170RdH == null) {
            function1.invoke(null);
            return;
        }
        LIZIZ(c700170RdH);
        if (this.LIZ.LJIIJ().LIZJ.isEmpty()) {
            function1.invoke(null);
            return;
        }
        C698680Ras c698680Ras = c700260RdQ.LIZ;
        if (c698680Ras != null && !(c700260RdQ.LIZIZ instanceof C701320Rf8)) {
            this.LIZ.LJIIIZ(new Pair<>("signal", C700230RdN.LIZ(c698680Ras)), LJFF(), new AwS140S0400000_11(function1, (Function1<? super C700950ReX, Unit>) this, (C700150RdF) c700170RdH, (C700170RdH) c700260RdQ, (C700260RdQ) 0));
            return;
        }
        if (c700260RdQ.LIZIZ instanceof C701320Rf8) {
            if (c698680Ras == null || (list = c698680Ras.LIZIZ) == null) {
                list = C13BV.INSTANCE;
            }
            c1443205ks = new C1443205ks(list);
        } else {
            c1443205ks = C1443805ky.LIZ;
        }
        this.LIZ.LJ(C1697810uHb.LJIIJJI(new Pair("enable", null), new Pair("signal", null), new Pair("density", null), new Pair("active", null)), c1443205ks, new AwS140S0400000_11(function1, (Function1<? super C700950ReX, Unit>) this, (C700150RdF) c700170RdH, (C700170RdH) c700260RdQ, (C700260RdQ) 1));
    }
}
