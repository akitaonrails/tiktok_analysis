package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bZE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978380bZE implements C01HZ {
    public static final C978380bZE LIZ = new C978380bZE();
    public static final Map<EnumC499801x6, C13E8<C915890ZwR>> LIZIZ = new LinkedHashMap();

    static {
        new C13E8();
    }

    @Override // X.C01HZ
    public final void LIZ(EnumC499801x6 enumC499801x6, C915890ZwR c915890ZwR) {
        Integer numValueOf;
        Object next;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        C13E8 c13e8 = (C13E8) linkedHashMap.get(enumC499801x6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregisterPlay ");
        sbLIZ.append(c915890ZwR);
        sbLIZ.append(" size:");
        Object objLJFF = null;
        if (c13e8 != null) {
            numValueOf = Integer.valueOf(c13e8.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        c915890ZwR.LIZIZ = EnumC356420DyC.REMOVED;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateNode node:");
        sbLIZ2.append(c915890ZwR);
        C2188811AlT.LIZIZ(sbLIZ2);
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((Iterable) ((Map.Entry) it2.next()).getValue()).iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(next, c915890ZwR)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C915890ZwR c915890ZwR2 = (C915890ZwR) next;
            if (c915890ZwR2 != null) {
                c915890ZwR2.LIZIZ = c915890ZwR.LIZIZ;
            }
        }
        if (c13e8 != null) {
            objLJFF = c13e8.LJFF();
        }
        if (Intrinsics.LJFF(objLJFF, c915890ZwR)) {
            if (c13e8 != null) {
                c13e8.LJIILJJIL();
            }
            for (C915890ZwR c915890ZwR3 = (C915890ZwR) c13e8.LJFF(); c915890ZwR3 != null && c915890ZwR3.LIZIZ == EnumC356420DyC.REMOVED; c915890ZwR3 = (C915890ZwR) c13e8.LJFF()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("unregisterPlay pop removed node ");
                sbLIZ3.append(c915890ZwR3);
                C2188811AlT.LIZIZ(sbLIZ3);
                c13e8.LJIILJJIL();
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("not poll as top stack is not ");
        sbLIZ4.append(c915890ZwR);
        C2188811AlT.LIZIZ(sbLIZ4);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C01HZ
    public final void LIZIZ(EnumC499801x6 enumC499801x6, C915890ZwR c915890ZwR, EnumC499801x6 enumC499801x62) {
        C13E8 c13e8;
        Object obj;
        AbstractCollection c13e82;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerPlay nodeTag:");
        sbLIZ.append(enumC499801x6);
        sbLIZ.append(" node:");
        sbLIZ.append(c915890ZwR);
        sbLIZ.append(" inheritingTraceNodeStack:");
        sbLIZ.append(enumC499801x62);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<EnumC499801x6, C13E8<C915890ZwR>> map = LIZIZ;
        if (!map.containsKey(enumC499801x6)) {
            if (enumC499801x6 != EnumC499801x6.ALL) {
                if (enumC499801x62 == null || (c13e82 = (C13DZ) ((LinkedHashMap) map).get(enumC499801x62)) == null) {
                    c13e82 = new C13E8();
                }
                C13E8 c13e83 = new C13E8();
                c13e83.addAll(c13e82);
                obj = c13e83;
            } else {
                obj = C13BV.INSTANCE;
            }
            c13e8 = new C13E8();
            c13e8.addAll(obj);
            map.put(enumC499801x6, (C13E8<C915890ZwR>) c13e8);
        } else {
            c13e8 = (C13E8) ((LinkedHashMap) map).get(enumC499801x6);
            if (c13e8 == null) {
                return;
            }
        }
        c13e8.addFirst(c915890ZwR);
    }
}
