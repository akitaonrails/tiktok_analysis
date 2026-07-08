package X;

import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0edw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096620edw {
    public static final Map<Object, Integer> LJI;
    public final DataChannel LIZ;
    public final Map<Integer, C1096640edy> LIZIZ;
    public final HashSet<String> LIZJ = new HashSet<>();
    public final HashSet<Integer> LIZLLL = new HashSet<>();
    public final HashMap<Integer, InterfaceC1096630edx> LJ;
    public final C1096610edv LJFF;

    static {
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        LJI = C2097608Jq.LJIIJ(new Pair(C1107810evz.LJJIJIIJIL.LIZ, 1), new Pair(C1107810evz.LJJIJIIJI.LIZ, 6), new Pair(C1107810evz.LJJIIZI, 7), new Pair(C1107810evz.LJJIJ, 8), new Pair(C1107810evz.LJIJJLI.LIZ, 11), new Pair(C1107810evz.LJJJI.LIZ, 14), new Pair(C1107810evz.LJJJIL.LIZ, 16), new Pair(C1107810evz.LJJJJI, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[PHI: r3
      0x007c: PHI (r3v1 java.util.HashSet) = (r3v0 java.util.HashSet), (r3v3 java.util.HashSet) binds: [B:26:0x0079, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.Set<java.lang.String>> LIZ(X.InterfaceC1096630edx r9) {
        /*
            r8 = this;
            java.util.Map r1 = r9.LIZJ()
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r2 = 0
            if (r1 == 0) goto L84
            java.lang.Object r7 = r1.get(r6)
            java.util.Collection r7 = (java.util.Collection) r7
        L12:
            java.util.Map r1 = r9.LIZJ()
            r5 = 1
            if (r1 == 0) goto L82
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r1.get(r0)
            java.util.Collection r4 = (java.util.Collection) r4
        L23:
            java.util.Map<java.lang.Integer, X.0edy> r1 = r8.LIZIZ
            int r0 = r9.LIZLLL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.0edy r0 = (X.C1096640edy) r0
            if (r0 == 0) goto L37
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.String>> r2 = r0.LIZ
        L37:
            r9.LJI()
            if (r2 == 0) goto L74
            java.lang.Object r0 = r2.get(r6)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L74
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
        L49:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r2.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L7c
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
        L5a:
            if (r7 == 0) goto L5f
            r3.addAll(r7)
        L5f:
            if (r4 == 0) goto L64
            r2.addAll(r4)
        L64:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.put(r6, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.put(r0, r2)
            return r1
        L74:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            if (r2 == 0) goto L7c
            goto L49
        L7c:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            goto L5a
        L82:
            r4 = r2
            goto L23
        L84:
            r7 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1096620edw.LIZ(X.0edx):java.util.Map");
    }

    public final void LIZIZ(InterfaceC1096630edx interfaceC1096630edx) {
        if (this.LJ.containsKey(Integer.valueOf(interfaceC1096630edx.LIZLLL()))) {
            return;
        }
        this.LJ.put(Integer.valueOf(interfaceC1096630edx.LIZLLL()), interfaceC1096630edx);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0edv] */
    public C1096620edw(DataChannel dataChannel, Map<Integer, C1096640edy> map, Map<Integer, ? extends InterfaceC1096630edx> map2) {
        this.LIZ = dataChannel;
        this.LIZIZ = map;
        HashMap<Integer, InterfaceC1096630edx> map3 = new HashMap<>();
        this.LJ = map3;
        this.LJFF = new InterfaceC1107760evu() { // from class: X.0edv
            @Override // X.InterfaceC1107760evu
            public final void LIZ() {
            }

            @Override // X.InterfaceC1107760evu
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1107760evu
            public final void LIZIZ(C1107810evz c1107810evz, boolean z, C1107780evw c1107780evw) {
                Set<Map.Entry> setEntrySet;
                int iIntValue;
                Integer num;
                Map<Integer, Set<String>> mapLIZ;
                Integer numValueOf;
                Set<String> set;
                String str = c1107810evz.LIZ;
                InterfaceC1097760efm interfaceC1097760efm = (InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class);
                Set<Map.Entry<Integer, C1096640edy>> setEntrySet2 = this.LIZ.LIZIZ.entrySet();
                C1096620edw c1096620edw = this.LIZ;
                Iterator<T> it2 = setEntrySet2.iterator();
                HashMap map4 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    InterfaceC1096630edx interfaceC1096630edx = c1096620edw.LJ.get(entry.getKey());
                    if (interfaceC1096630edx != null) {
                        mapLIZ = c1096620edw.LIZ(interfaceC1096630edx);
                    } else {
                        mapLIZ = null;
                    }
                    if (z) {
                        String str2 = c1107810evz.LIZ;
                        if (interfaceC1096630edx != null) {
                            numValueOf = Integer.valueOf(interfaceC1096630edx.LIZLLL());
                        } else {
                            numValueOf = null;
                        }
                        if (mapLIZ != null && (set = mapLIZ.get(1)) != null && set.contains(str2) && interfaceC1096630edx != null && interfaceC1096630edx.LJ(true)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[tryHideExclusiveBusiness] ");
                            sbLIZ.append(numValueOf);
                            sbLIZ.append(" hide , because ");
                            sbLIZ.append(str2);
                            C20441214yg.LJ("matao-test", C2188811AlT.LIZIZ(sbLIZ));
                            if (interfaceC1096630edx.LJFF(str2, c1107780evw.LIZIZ)) {
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_component_show_control");
                                c474500IjALIZ.LJIJJLI(c1096620edw.LIZ);
                                c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(c1096620edw.LIZ.gg0(UserIsAnchorChannel.class), Boolean.TRUE) ? 1 : 0), "is_anchor");
                                c474500IjALIZ.LJJII(numValueOf, "component_id");
                                c474500IjALIZ.LJJII(str2, "avoid_component_type");
                                c474500IjALIZ.LJJII("exclusive", "control_reason");
                                c474500IjALIZ.LJJII(1, "is_already_show");
                                c474500IjALIZ.LIZ();
                            }
                        }
                    } else if (interfaceC1096630edx != null && interfaceC1096630edx.LIZIZ() && mapLIZ != null) {
                        HashSet hashSet = new HashSet();
                        Set<String> set2 = mapLIZ.get(1);
                        if (set2 != null) {
                            hashSet.addAll(set2);
                        }
                        Set<String> set3 = mapLIZ.get(0);
                        if (set3 != null) {
                            hashSet.addAll(set3);
                        }
                        if (hashSet.contains(str) && !interfaceC1096630edx.LJ(false) && interfaceC1097760efm.LIZIZ(c1096620edw.LIZ, new ArrayList(hashSet)).LIZ) {
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            map4.put(Integer.valueOf(interfaceC1096630edx.LIZLLL()), mapLIZ.get(1));
                        }
                    }
                }
                if (map4 != null && (setEntrySet = map4.entrySet()) != null) {
                    C1096620edw c1096620edw2 = this.LIZ;
                    for (Map.Entry entry2 : setEntrySet) {
                        Set set4 = (Set) entry2.getValue();
                        if (set4 != null) {
                            Iterator it3 = set4.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next = it3.next();
                                c1096620edw2.getClass();
                                Map<Object, Integer> map5 = C1096620edw.LJI;
                                if (map5.containsKey(next) && (num = (Integer) ((LinkedHashMap) map5).get(next)) != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                if (map4.containsKey(Integer.valueOf(iIntValue))) {
                                    if (next == null) {
                                    }
                                }
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[businessObserver] ");
                        sbLIZ2.append(((Number) entry2.getKey()).intValue());
                        sbLIZ2.append(" resume , because ");
                        sbLIZ2.append(str);
                        C20441214yg.LJ("matao-test", C2188811AlT.LIZIZ(sbLIZ2));
                        InterfaceC1096630edx interfaceC1096630edx2 = c1096620edw2.LJ.get(entry2.getKey());
                        if (interfaceC1096630edx2 != null) {
                            interfaceC1096630edx2.LIZ();
                        }
                    }
                }
            }
        };
        map3.putAll(map2);
    }
}
