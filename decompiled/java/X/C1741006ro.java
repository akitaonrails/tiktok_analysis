package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1741006ro implements InterfaceC871370YGh {
    public final Function0<C868200Y4c> LIZ;
    public final ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>>> LIZIZ = new ConcurrentHashMap<>();
    public final CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>> LIZJ = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<String, ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>>>> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>>> LJ = new ConcurrentHashMap<>();

    public C1741006ro(AwS546S0100000_2 awS546S0100000_2) {
        this.LIZ = awS546S0100000_2;
        C1741506rt c1741506rt = new C1741506rt() { // from class: X.06rf
            @Override // X.InterfaceC868420Y4y
            public final void LLILZ(C869590Y9l c869590Y9l) {
                InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(c869590Y9l) { // from class: X.06ri
                    public final C869590Y9l LJIIJJI;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1740406ri) && Intrinsics.LJFF(this.LJIIJJI, ((C1740406ri) obj).LJIIJJI);
                    }

                    public final int hashCode() {
                        return this.LJIIJJI.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Recalled(message=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LJIIJJI = c869590Y9l;
                    }
                };
                C1741006ro c1741006ro = this.LL;
                C1740506rj<C1740406ri> c1740506rj = InterfaceC1740206rg.LJFF;
                c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                this.LL.LJI(c869590Y9l.getConversationId(), c1740506rj, interfaceC1740206rg);
            }

            @Override // X.InterfaceC868420Y4y
            public final void mf(C869590Y9l c869590Y9l) {
                InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(c869590Y9l) { // from class: X.06re
                    public final C869590Y9l LJIIJJI;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1740006re) && Intrinsics.LJFF(this.LJIIJJI, ((C1740006re) obj).LJIIJJI);
                    }

                    public final int hashCode() {
                        return this.LJIIJJI.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Deleted(message=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LJIIJJI = c869590Y9l;
                    }
                };
                C1741006ro c1741006ro = this.LL;
                C1740506rj<C1740006re> c1740506rj = InterfaceC1740206rg.LJ;
                c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                this.LL.LJI(c869590Y9l.getConversationId(), c1740506rj, interfaceC1740206rg);
            }

            @Override // X.InterfaceC868420Y4y
            public final void ns(String str) {
                InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(str) { // from class: X.00ie
                    public final String LJIIJJI;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C155400ie) && Intrinsics.LJFF(this.LJIIJJI, ((C155400ie) obj).LJIIJJI);
                    }

                    public final int hashCode() {
                        return this.LJIIJJI.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("InConversationDeleted(conversationId=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LJIIJJI = str;
                    }
                };
                C1741006ro c1741006ro = this.LL;
                C1740506rj<C155400ie> c1740506rj = InterfaceC1740206rg.LJI;
                c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                this.LL.LJI(str, c1740506rj, interfaceC1740206rg);
            }

            @Override // X.InterfaceC868420Y4y
            public final void Jk(C869590Y9l c869590Y9l, int i) {
                InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(i, c869590Y9l) { // from class: X.06ra
                    public final int LJIIJJI;
                    public final C869590Y9l LJIIL;
                    public final C0Y8T LJIILIIL = null;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1739606ra)) {
                            return false;
                        }
                        C1739606ra c1739606ra = (C1739606ra) obj;
                        return this.LJIIJJI == c1739606ra.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1739606ra.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1739606ra.LJIILIIL);
                    }

                    public final int hashCode() {
                        int iHashCode = ((this.LJIIJJI * 31) + this.LJIIL.hashCode()) * 31;
                        C0Y8T c0y8t = this.LJIILIIL;
                        return iHashCode + (c0y8t == null ? 0 : c0y8t.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Added(statusCode=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(", message=");
                        sbLIZ.append(this.LJIIL);
                        sbLIZ.append(", conversation=");
                        sbLIZ.append(this.LJIILIIL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LJIIJJI = i;
                        this.LJIIL = c869590Y9l;
                    }
                };
                C1741006ro c1741006ro = this.LL;
                C1740506rj<C1739606ra> c1740506rj = InterfaceC1740206rg.LIZJ;
                c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                this.LL.LJI(c869590Y9l.getConversationId(), c1740506rj, interfaceC1740206rg);
            }

            @Override // X.InterfaceC868420Y4y
            public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
                InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(i, c869590Y9l, c0yc9) { // from class: X.06rZ
                    public final int LJIIJJI;
                    public final C869590Y9l LJIIL;
                    public final C0YC9 LJIILIIL;
                    public final C0Y8T LJIILJJIL = null;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1739506rZ)) {
                            return false;
                        }
                        C1739506rZ c1739506rZ = (C1739506rZ) obj;
                        return this.LJIIJJI == c1739506rZ.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1739506rZ.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1739506rZ.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1739506rZ.LJIILJJIL);
                    }

                    public final int hashCode() {
                        int iHashCode = ((((this.LJIIJJI * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31;
                        C0Y8T c0y8t = this.LJIILJJIL;
                        return iHashCode + (c0y8t == null ? 0 : c0y8t.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Sent(statusCode=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(", message=");
                        sbLIZ.append(this.LJIIL);
                        sbLIZ.append(", metrics=");
                        sbLIZ.append(this.LJIILIIL);
                        sbLIZ.append(", conversation=");
                        sbLIZ.append(this.LJIILJJIL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LJIIJJI = i;
                        this.LJIIL = c869590Y9l;
                        this.LJIILIIL = c0yc9;
                    }
                };
                C1741006ro c1741006ro = this.LL;
                C1740506rj<C1739506rZ> c1740506rj = InterfaceC1740206rg.LIZIZ;
                c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                this.LL.LJI(c869590Y9l.getConversationId(), c1740506rj, interfaceC1740206rg);
            }

            @Override // X.InterfaceC868420Y4y
            public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
                boolean z;
                CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>> copyOnWriteArraySet;
                InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(list, i, c0y7p) { // from class: X.06rc
                    public final List<C869590Y9l> LJIIJJI;
                    public final int LJIIL;
                    public final C0Y7P LJIILIIL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1739806rc)) {
                            return false;
                        }
                        C1739806rc c1739806rc = (C1739806rc) obj;
                        return Intrinsics.LJFF(this.LJIIJJI, c1739806rc.LJIIJJI) && this.LJIIL == c1739806rc.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1739806rc.LJIILIIL);
                    }

                    public final int hashCode() {
                        return (((this.LJIIJJI.hashCode() * 31) + this.LJIIL) * 31) + this.LJIILIIL.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Received(messages=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(", messageSource=");
                        sbLIZ.append(this.LJIIL);
                        sbLIZ.append(", extra=");
                        sbLIZ.append(this.LJIILIIL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LJIIJJI = list;
                        this.LJIIL = i;
                        this.LJIILIIL = c0y7p;
                    }
                };
                C1741006ro c1741006ro = this.LL;
                C1740506rj<C1739806rc> c1740506rj = InterfaceC1740206rg.LIZ;
                c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                C1741006ro c1741006ro2 = this.LL;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C869590Y9l c869590Y9l : list) {
                    String conversationId = c869590Y9l.getConversationId();
                    Object arrayList = linkedHashMap.get(conversationId);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(conversationId, arrayList);
                    }
                    ((List) arrayList).add(c869590Y9l);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    List list2 = (List) entry.getValue();
                    ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>>> concurrentHashMap = c1741006ro2.LIZLLL.get(key);
                    CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>> copyOnWriteArraySet2 = c1741006ro2.LJ.get(key);
                    boolean z2 = false;
                    if (concurrentHashMap != null && concurrentHashMap.containsKey(c1740506rj.LIZ)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (copyOnWriteArraySet2 == null || copyOnWriteArraySet2.isEmpty()) {
                        z2 = true;
                    }
                    boolean z3 = !z2;
                    if (z || z3) {
                        InterfaceC1740206rg interfaceC1740206rg2 = new InterfaceC1740206rg(list2, i, c0y7p) { // from class: X.06rc
                            public final List<C869590Y9l> LJIIJJI;
                            public final int LJIIL;
                            public final C0Y7P LJIILIIL;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C1739806rc)) {
                                    return false;
                                }
                                C1739806rc c1739806rc = (C1739806rc) obj;
                                return Intrinsics.LJFF(this.LJIIJJI, c1739806rc.LJIIJJI) && this.LJIIL == c1739806rc.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1739806rc.LJIILIIL);
                            }

                            public final int hashCode() {
                                return (((this.LJIIJJI.hashCode() * 31) + this.LJIIL) * 31) + this.LJIILIIL.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Received(messages=");
                                sbLIZ.append(this.LJIIJJI);
                                sbLIZ.append(", messageSource=");
                                sbLIZ.append(this.LJIIL);
                                sbLIZ.append(", extra=");
                                sbLIZ.append(this.LJIILIIL);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.LJIIJJI = list2;
                                this.LJIIL = i;
                                this.LJIILIIL = c0y7p;
                            }
                        };
                        if (concurrentHashMap != null && (copyOnWriteArraySet = concurrentHashMap.get(c1740506rj.LIZ)) != null) {
                            C1741006ro.LJFF(copyOnWriteArraySet, interfaceC1740206rg2);
                        }
                        if (copyOnWriteArraySet2 != null) {
                            C1741006ro.LJFF(copyOnWriteArraySet2, interfaceC1740206rg2);
                        }
                    }
                }
            }

            @Override // X.InterfaceC868420Y4y
            public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
                this.LL.LJ(InterfaceC1740206rg.LJIIIIZZ, new InterfaceC1740206rg(i, c0ya6) { // from class: X.06rb
                    public final int LJIIJJI;
                    public final C0YA6 LJIIL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1739706rb)) {
                            return false;
                        }
                        C1739706rb c1739706rb = (C1739706rb) obj;
                        return this.LJIIJJI == c1739706rb.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1739706rb.LJIIL);
                    }

                    public final int hashCode() {
                        return (this.LJIIJJI * 31) + this.LJIIL.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ReactionSent(statusCode=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(", propertyChange=");
                        sbLIZ.append(this.LJIIL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LJIIJJI = i;
                        this.LJIIL = c0ya6;
                    }
                });
            }

            @Override // X.InterfaceC868420Y4y
            public final void gb(C0Y3I c0y3i, List<C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
                Map<String, String> map2;
                C1741006ro c1741006ro = this.LL;
                for (C869590Y9l c869590Y9l : list) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (map != null && (map2 = map.get(c869590Y9l.getUuid())) != null && !Intrinsics.LJFF(map2, c869590Y9l.getExt())) {
                        linkedHashSet.add(EnumC1740306rh.EXT);
                    }
                    if (linkedHashSet.isEmpty()) {
                        linkedHashSet.add(EnumC1740306rh.CONTENT);
                    }
                    InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(c869590Y9l, linkedHashSet, i) { // from class: X.06rd
                        public final C869590Y9l LJIIJJI = null;
                        public final C869590Y9l LJIIL;
                        public final Set<EnumC1740306rh> LJIILIIL;
                        public final int LJIILJJIL;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C1739906rd)) {
                                return false;
                            }
                            C1739906rd c1739906rd = (C1739906rd) obj;
                            return Intrinsics.LJFF(this.LJIIJJI, c1739906rd.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1739906rd.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1739906rd.LJIILIIL) && this.LJIILJJIL == c1739906rd.LJIILJJIL;
                        }

                        public final int hashCode() {
                            C869590Y9l c869590Y9l2 = this.LJIIJJI;
                            return ((((((c869590Y9l2 == null ? 0 : c869590Y9l2.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL;
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Updated(oldMessage=");
                            sbLIZ.append(this.LJIIJJI);
                            sbLIZ.append(", message=");
                            sbLIZ.append(this.LJIIL);
                            sbLIZ.append(", changes=");
                            sbLIZ.append(this.LJIILIIL);
                            sbLIZ.append(", messageSource=");
                            sbLIZ.append(this.LJIILJJIL);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LJIIL = c869590Y9l;
                            this.LJIILIIL = linkedHashSet;
                            this.LJIILJJIL = i;
                        }
                    };
                    C1740506rj<C1739906rd> c1740506rj = InterfaceC1740206rg.LIZLLL;
                    c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                    c1741006ro.LJI(c869590Y9l.getConversationId(), c1740506rj, interfaceC1740206rg);
                }
            }

            @Override // X.InterfaceC868420Y4y
            public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
                Map<String, List<C0YA1>> mapLJ = map2;
                Map<String, List<C0YA1>> mapLJ2 = map;
                if (mapLJ2 == null) {
                    mapLJ2 = C2097608Jq.LJ();
                }
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(c869590Y9l, mapLJ2, mapLJ, l, l2) { // from class: X.06rY
                    public final C869590Y9l LJIIJJI;
                    public final Map<String, List<C0YA1>> LJIIL;
                    public final Map<String, List<C0YA1>> LJIILIIL;
                    public final Long LJIILJJIL;
                    public final Long LJIILL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1739406rY)) {
                            return false;
                        }
                        C1739406rY c1739406rY = (C1739406rY) obj;
                        return Intrinsics.LJFF(this.LJIIJJI, c1739406rY.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1739406rY.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1739406rY.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1739406rY.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1739406rY.LJIILL);
                    }

                    public final int hashCode() {
                        int iHashCode = ((((this.LJIIJJI.hashCode() * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31;
                        Long l3 = this.LJIILJJIL;
                        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
                        Long l4 = this.LJIILL;
                        return iHashCode2 + (l4 != null ? l4.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ReactionReceived(message=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(", oldReactions=");
                        sbLIZ.append(this.LJIIL);
                        sbLIZ.append(", newReactions=");
                        sbLIZ.append(this.LJIILIIL);
                        sbLIZ.append(", updateTimestamp=");
                        sbLIZ.append(this.LJIILJJIL);
                        sbLIZ.append(", senderUid=");
                        sbLIZ.append(this.LJIILL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LJIIJJI = c869590Y9l;
                        this.LJIIL = mapLJ2;
                        this.LJIILIIL = mapLJ;
                        this.LJIILJJIL = l;
                        this.LJIILL = l2;
                    }
                };
                C1741006ro c1741006ro = this.LL;
                C1740506rj<C1739406rY> c1740506rj = InterfaceC1740206rg.LJIIIZ;
                c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                this.LL.LJI(c869590Y9l.getConversationId(), c1740506rj, interfaceC1740206rg);
            }
        };
        InterfaceC870660YDo interfaceC870660YDo = new InterfaceC870660YDo() { // from class: X.06rm
            @Override // X.InterfaceC870660YDo
            public final void LIZ(long j, long j2, long j3, String str) {
                InterfaceC1740206rg interfaceC1740206rg = new InterfaceC1740206rg(str, j, j2, j3) { // from class: X.00if
                    public final String LJIIJJI;
                    public final long LJIIL;
                    public final long LJIILIIL;
                    public final long LJIILJJIL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C155500if)) {
                            return false;
                        }
                        C155500if c155500if = (C155500if) obj;
                        return Intrinsics.LJFF(this.LJIIJJI, c155500if.LJIIJJI) && this.LJIIL == c155500if.LJIIL && this.LJIILIIL == c155500if.LJIILIIL && this.LJIILJJIL == c155500if.LJIILJJIL;
                    }

                    public final int hashCode() {
                        return (((((this.LJIIJJI.hashCode() * 31) + C786410Ut5.Y2(this.LJIIL)) * 31) + C786410Ut5.Y2(this.LJIILIIL)) * 31) + C786410Ut5.Y2(this.LJIILJJIL);
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ReadStatusUpdated(conversationId=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(", userId=");
                        sbLIZ.append(this.LJIIL);
                        sbLIZ.append(", msgId=");
                        sbLIZ.append(this.LJIILIIL);
                        sbLIZ.append(", readIndex=");
                        sbLIZ.append(this.LJIILJJIL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LJIIJJI = str;
                        this.LJIIL = j;
                        this.LJIILIIL = j2;
                        this.LJIILJJIL = j3;
                    }
                };
                C1741006ro c1741006ro = this.LIZ;
                C1740506rj<C155500if> c1740506rj = InterfaceC1740206rg.LJIIJ;
                c1741006ro.LJ(c1740506rj, interfaceC1740206rg);
                this.LIZ.LJI(str, c1740506rj, interfaceC1740206rg);
            }
        };
        InterfaceC870020YBc interfaceC870020YBc = new InterfaceC870020YBc() { // from class: X.06rk
            @Override // X.InterfaceC870020YBc
            public final void LIZ(C870370YCl c870370YCl) {
                this.LIZ.LJ(InterfaceC1740206rg.LJII, new InterfaceC1740206rg(c870370YCl) { // from class: X.06rl
                    public final C870370YCl LJIIJJI;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1740706rl) && Intrinsics.LJFF(this.LJIIJJI, ((C1740706rl) obj).LJIIJJI);
                    }

                    public final int hashCode() {
                        return this.LJIIJJI.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MediaAvailable(info=");
                        sbLIZ.append(this.LJIIJJI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LJIIJJI = c870370YCl;
                    }
                });
            }
        };
        C868200Y4c c868200Y4c = ((C0Y52) awS546S0100000_2.l0).LIZ;
        c868200Y4c.LJIIJ(c1741506rt);
        ((CopyOnWriteArraySet) c868200Y4c.LJIIIZ).add(interfaceC870660YDo);
        c868200Y4c.LJIIIZ(interfaceC870020YBc);
    }

    @Override // X.InterfaceC871370YGh
    public final InterfaceC866920Xze LIZJ(final InterfaceC1741206rq<? super InterfaceC1740206rg> interfaceC1741206rq) {
        this.LIZJ.add(interfaceC1741206rq);
        return new InterfaceC866920Xze() { // from class: X.06rp
            @Override // X.InterfaceC866920Xze
            public final void unsubscribe() {
                this.LIZ.LIZJ.remove(interfaceC1741206rq);
            }
        };
    }

    public static void LJFF(CopyOnWriteArraySet copyOnWriteArraySet, InterfaceC1740206rg interfaceC1740206rg) {
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC1741206rq) it2.next()).onEvent(interfaceC1740206rg);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final <T extends InterfaceC1740206rg> void LJ(C1740506rj<T> c1740506rj, T t) {
        CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>> copyOnWriteArraySet = this.LIZIZ.get(c1740506rj.LIZ);
        if (copyOnWriteArraySet != null) {
            LJFF(copyOnWriteArraySet, t);
        }
        LJFF(this.LIZJ, t);
    }

    public final <T extends InterfaceC1740206rg> void LJI(String str, C1740506rj<T> c1740506rj, T t) {
        CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>> copyOnWriteArraySet;
        ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>>> concurrentHashMap = this.LIZLLL.get(str);
        if (concurrentHashMap != null && (copyOnWriteArraySet = concurrentHashMap.get(c1740506rj.LIZ)) != null) {
            LJFF(copyOnWriteArraySet, t);
        }
        CopyOnWriteArraySet<InterfaceC1741206rq<InterfaceC1740206rg>> copyOnWriteArraySet2 = this.LJ.get(str);
        if (copyOnWriteArraySet2 != null) {
            LJFF(copyOnWriteArraySet2, t);
        }
    }
}
