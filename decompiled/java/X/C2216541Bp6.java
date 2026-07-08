package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216541Bp6 extends C09AY implements Function0<InterfaceC2216671BpJ> {
    public final /* synthetic */ C2216561Bp8 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216541Bp6(C2216561Bp8 c2216561Bp8) {
        super(0);
        this.LL = c2216561Bp8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [X.1Bou, X.1BpJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1Bou[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2216671BpJ invoke() throws Exception {
        InterfaceC2201231BDd interfaceC2201231BDd;
        Object key;
        C2216631BpF c2216631BpF;
        C2216571Bp9 next;
        InterfaceC2217241BqE<?, ?> interfaceC2217241BqE;
        C2216571Bp9 next2;
        C2216561Bp8 c2216561Bp8 = this.LL;
        ?? r19 = (InterfaceC2216801BpW) ((InterfaceC2216421Bou) ((C2216431Bov) ((HashMap) c2216561Bp8.LLILLL.LJFF).get(c2216561Bp8.T2())).LIZ(InterfaceC2216801BpW.class));
        C2216441Bow c2216441Bow = c2216561Bp8.LLILLL;
        C1456610o0Z c1456610o0ZH2 = c2216561Bp8.H2();
        List<C2216631BpF> list = c2216561Bp8.Z1().LIZ;
        c2216441Bow.getClass();
        Iterator it2 = ((ArrayList) list).iterator();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (!it2.hasNext()) {
                Class clsLIZ = C2216411Bot.LIZ(InterfaceC2216671BpJ.class);
                if (clsLIZ != null) {
                    if (z) {
                        if (z2) {
                            C443120HZe c443120HZe = (C443120HZe) ((LinkedHashMap) C2216411Bot.LIZJ).get(clsLIZ);
                            if (!Intrinsics.LJFF(InterfaceC2216671BpJ.class, c443120HZe != null ? c443120HZe.getSecond() : null)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Request ");
                                sbLIZ.append(InterfaceC2216671BpJ.class.getName());
                                sbLIZ.append(" mismatch with real ModelNullWriter");
                                throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } else {
                            C443120HZe c443120HZe2 = (C443120HZe) ((LinkedHashMap) C2216411Bot.LIZJ).get(clsLIZ);
                            if (!Intrinsics.LJFF(InterfaceC2216671BpJ.class, c443120HZe2 != null ? c443120HZe2.getThird() : null)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Request ");
                                sbLIZ2.append(InterfaceC2216671BpJ.class.getName());
                                sbLIZ2.append(" mismatch with real ModelWriteNullReader");
                                throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                    } else if (!z2) {
                        C443120HZe c443120HZe3 = (C443120HZe) ((LinkedHashMap) C2216411Bot.LIZJ).get(clsLIZ);
                        if (!Intrinsics.LJFF(InterfaceC2216671BpJ.class, c443120HZe3 != null ? c443120HZe3.getFirst() : null)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Request ");
                            sbLIZ3.append(InterfaceC2216671BpJ.class.getName());
                            sbLIZ3.append(" mismatch with real ModelWriter");
                            throw new Exception(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                }
                if (r19 != 0) {
                    boolean z3 = false;
                    for (Annotation annotation : C2216561Bp8.class.getAnnotations()) {
                        if ((annotation instanceof InterfaceC2201231BDd) && (interfaceC2201231BDd = (InterfaceC2201231BDd) annotation) != null) {
                            C13IQ[] c13iqArrLIZIZ = C13LE.LIZIZ(interfaceC2201231BDd.scopes());
                            C13IQ[] c13iqArrLIZIZ2 = C13LE.LIZIZ(interfaceC2201231BDd.models());
                            for (C13IQ c13iq : c13iqArrLIZIZ) {
                                for (C13IQ c13iq2 : c13iqArrLIZIZ2) {
                                    if (Intrinsics.LJFF(C09R7.LIZ(c13iq), c1456610o0ZH2.LIZ)) {
                                        Class clsLIZ2 = C09R7.LIZ(c13iq2);
                                        Class<?> cls = r19.getClass();
                                        Iterator it3 = ((LinkedHashMap) C2216411Bot.LIZ).entrySet().iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                key = null;
                                                break;
                                            }
                                            Map.Entry entry = (Map.Entry) it3.next();
                                            key = entry.getKey();
                                            if (Intrinsics.LJFF(entry.getValue(), cls)) {
                                                break;
                                            }
                                        }
                                        if (Intrinsics.LJFF(clsLIZ2, key)) {
                                            z3 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!(r19 instanceof InterfaceC2216611BpD) && !z3) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(C2216561Bp8.class.getName());
                        sbLIZ4.append(" can not request ");
                        sbLIZ4.append(InterfaceC2216671BpJ.class.getName());
                        sbLIZ4.append(" without permission");
                        throw new Exception(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                for (Map.Entry entry2 : ((HashMap) c2216441Bow.LJI).entrySet()) {
                    Class cls2 = (Class) entry2.getKey();
                    ?? r1 = (List) entry2.getValue();
                    if (!Intrinsics.LJFF(cls2, C2216561Bp8.class) && r19 != 0 && r1.contains(r19)) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(C2216561Bp8.class.getName());
                        sbLIZ5.append(" request duplicated permission with ");
                        sbLIZ5.append(cls2.getName());
                        throw new Exception(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
                if (r19 == 0) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (!((HashMap) c2216441Bow.LJI).containsKey(C2216561Bp8.class)) {
                    ((HashMap) c2216441Bow.LJI).put(C2216561Bp8.class, C1697810uHb.LJ(new InterfaceC2216421Bou[]{r19}));
                }
                List list2 = (List) ((HashMap) c2216441Bow.LJI).get(C2216561Bp8.class);
                if (list2 != null) {
                    list2.add(r19);
                }
                return r19;
            }
            Object next3 = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            c2216631BpF = (C2216631BpF) next3;
            if (r19 != 0) {
                Iterator<C2216571Bp9> it4 = r19.LIZ().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    if (Intrinsics.LJFF(next.LIZ.getName(), c2216631BpF.LIZ.getName())) {
                        break;
                    }
                }
                C2216571Bp9 c2216571Bp9 = next;
                if (c2216571Bp9 == null || (interfaceC2217241BqE = c2216571Bp9.LIZIZ) == null) {
                    break;
                }
                Iterator<C2216571Bp9> it5 = r19.LIZ().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                    if (Intrinsics.LJFF(next2.LIZ.getName(), c2216631BpF.LIZ.getName())) {
                        break;
                    }
                }
                C2216571Bp9 c2216571Bp92 = next2;
                z2 = c2216571Bp92 != null ? c2216571Bp92.LIZLLL : false;
                r19 = (InterfaceC2216421Bou) interfaceC2217241BqE.get(r19);
                if (z2) {
                    z = true;
                }
                if ((r19 instanceof InterfaceC2216611BpD) && c2216631BpF.LIZIZ >= 0) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(c2216631BpF.LIZIZ, ((InterfaceC2216611BpD) r19).LIZIZ());
                    r19 = objLJJJLZIJ instanceof InterfaceC2216421Bou ? (InterfaceC2216421Bou) objLJJJLZIJ : null;
                    z = true;
                }
            }
            i = i2;
            r19 = r19;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("can not convert property ");
        sbLIZ6.append(c2216631BpF.LIZ.getName());
        sbLIZ6.append(" to writer property");
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ6));
    }
}
