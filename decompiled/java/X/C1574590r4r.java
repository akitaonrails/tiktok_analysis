package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS345S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0r4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574590r4r {
    public final Function1<AbstractC1574450r4d, Integer> LIZ;
    public final InterfaceC1631620sYq<C1156830gD3, C208700rF, EnumC1574650r4x, Unit> LIZIZ;
    public final C199596137q LIZJ;
    public final C199596137q LIZLLL;
    public final C199596137q LJ;
    public final ConcurrentHashMap<String, Set<C1156830gD3>> LJFF;
    public final Set<C00EX> LJI;
    public final ThreadLocal<EnumC1574650r4x> LJII;

    public C1574590r4r() {
        this(3, null);
    }

    public final C199596137q LIZIZ(AbstractC1574450r4d abstractC1574450r4d) {
        if (Intrinsics.LJFF(abstractC1574450r4d, C1574380r4W.LIZ)) {
            return this.LIZJ;
        }
        if (Intrinsics.LJFF(abstractC1574450r4d, C1574440r4c.LIZ)) {
            return this.LIZLLL;
        }
        if (abstractC1574450r4d instanceof C1574370r4V) {
            return this.LJ;
        }
        throw new C1954807lC();
    }

    public final C199596137q LIZJ(String str) {
        if (Intrinsics.LJFF(str, "last_watch")) {
            return this.LIZJ;
        }
        if (Intrinsics.LJFF(str, "from_begin")) {
            return this.LIZLLL;
        }
        if (u.LJJIIJZLJL(str, "ep_", false)) {
            return this.LJ;
        }
        return this.LIZJ;
    }

    public final C199596137q LJ(AbstractC1574450r4d abstractC1574450r4d) {
        C199593137n c199593137n = new C199593137n();
        long jIntValue = this.LIZ.invoke(abstractC1574450r4d).intValue();
        if (jIntValue < 1) {
            jIntValue = 1;
        }
        c199593137n.LIZLLL(jIntValue);
        c199593137n.LJ(new AnonymousClass1385() { // from class: X.0r4y
            @Override // X.AnonymousClass1385
            public final void LIZJ(C199603137x<C1156830gD3, C208700rF> c199603137x) {
                C208700rF value;
                C1156830gD3 key = c199603137x.getKey();
                if (key == null || (value = c199603137x.getValue()) == null) {
                    return;
                }
                EnumC1574650r4x enumC1574650r4x = this.LL.LJII.get();
                if (enumC1574650r4x == null) {
                    enumC1574650r4x = EnumC1574650r4x.LRU_EVICTED;
                }
                Set<C1156830gD3> set = this.LL.LJFF.get(value.LIZIZ);
                if (set != null) {
                    C1574590r4r c1574590r4r = this.LL;
                    synchronized (set) {
                        try {
                            set.remove(key);
                            if (set.isEmpty() && c1574590r4r.LJFF.get(value.LIZIZ) == set) {
                                c1574590r4r.LJFF.remove(value.LIZIZ);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                this.LL.LIZIZ.invoke(key, value, enumC1574650r4x);
            }
        });
        return c199593137n.LIZ();
    }

    public final void LJI(C00EX c00ex) {
        this.LJI.remove(c00ex);
    }

    public C1574590r4r(int i, AFwS345S0000000_24 aFwS345S0000000_24) {
        C1574700r52 c1574700r52;
        if ((i & 1) != 0) {
            c1574700r52 = new C1574700r52(C1574690r51.LIZ);
        } else {
            c1574700r52 = null;
        }
        aFwS345S0000000_24 = (i & 2) != 0 ? AFwS345S0000000_24.get$arr$(1) : aFwS345S0000000_24;
        this.LIZ = c1574700r52;
        this.LIZIZ = aFwS345S0000000_24;
        this.LIZJ = LJ(C1574380r4W.LIZ);
        this.LIZLLL = LJ(C1574440r4c.LIZ);
        this.LJ = LJ(new C1574370r4V(0L));
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJII = new ThreadLocal<>();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.00EX, java.lang.Object] */
    public final C00EX LIZ(AbstractC1574450r4d abstractC1574450r4d, List<Long> list) {
        EnumC1574600r4s enumC1574600r4s;
        EnumC1574600r4s.Companion.getClass();
        if (Intrinsics.LJFF(abstractC1574450r4d, C1574380r4W.LIZ)) {
            enumC1574600r4s = EnumC1574600r4s.LAST_WATCH;
        } else if (Intrinsics.LJFF(abstractC1574450r4d, C1574440r4c.LIZ)) {
            enumC1574600r4s = EnumC1574600r4s.FROM_BEGIN;
        } else if (abstractC1574450r4d instanceof C1574370r4V) {
            enumC1574600r4s = EnumC1574600r4s.EPISODE;
        } else {
            throw new C1954807lC();
        }
        final String tag = enumC1574600r4s.getTag();
        final List listLJLLJ = C13LP.LJLLJ(list);
        ?? r2 = new Object(tag, listLJLLJ) { // from class: X.00EX
            public final String LIZ;
            public final List<Long> LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C00EX)) {
                    return false;
                }
                C00EX c00ex = (C00EX) obj;
                return Intrinsics.LJFF(this.LIZ, c00ex.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00ex.LIZIZ);
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InflightKey(variantTag=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", sortedIds=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = tag;
                this.LIZIZ = listLJLLJ;
            }
        };
        if (!this.LJI.add((C00EX) r2)) {
            return null;
        }
        return r2;
    }

    public final void LIZLLL(List list, C1574380r4W c1574380r4W, EnumC1574650r4x enumC1574650r4x) {
        if (list.isEmpty()) {
            return;
        }
        this.LJII.set(enumC1574650r4x);
        try {
            if (c1574380r4W != null) {
                String strLIZ = c1574380r4W.LIZ();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C1156830gD3(((Number) it2.next()).longValue(), strLIZ));
                }
                LIZIZ(c1574380r4W).LIZIZ(arrayList);
            } else {
                HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(list);
                C199596137q c199596137q = this.LIZJ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C1156830gD3(((Number) it3.next()).longValue(), "last_watch"));
                }
                c199596137q.LIZIZ(arrayList2);
                C199596137q c199596137q2 = this.LIZLLL;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new C1156830gD3(((Number) it4.next()).longValue(), "from_begin"));
                }
                c199596137q2.LIZIZ(arrayList3);
                Set setKeySet = this.LJ.LL.keySet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : setKeySet) {
                    if (hashSetLLIFFJFJJ.contains(Long.valueOf(((C1156830gD3) obj).LIZ))) {
                        arrayList4.add(obj);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    this.LJ.LIZIZ(arrayList4);
                }
            }
            this.LJII.set(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJII.set(null);
            throw th;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJFF(long j, AbstractC1574450r4d abstractC1574450r4d, Aweme aweme, AbstractC1574500r4i abstractC1574500r4i) {
        Set<C1156830gD3> setPutIfAbsent;
        Object c1156830gD3 = new C1156830gD3(j, abstractC1574450r4d.LIZ());
        LIZIZ(abstractC1574450r4d).LL.put((K) c1156830gD3, (V) new C208700rF(System.currentTimeMillis(), abstractC1574500r4i.LIZ(), aweme));
        Set setSynchronizedSet = this.LJFF.get(abstractC1574500r4i.LIZ());
        if (setSynchronizedSet == null && (setPutIfAbsent = this.LJFF.putIfAbsent(abstractC1574500r4i.LIZ(), (setSynchronizedSet = Collections.synchronizedSet(new HashSet())))) != null) {
            setSynchronizedSet = setPutIfAbsent;
        }
        setSynchronizedSet.add(c1156830gD3);
    }
}
