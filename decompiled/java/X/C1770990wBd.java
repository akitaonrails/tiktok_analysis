package X;

import android.app.Activity;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770990wBd {
    public static final C1770990wBd LIZ = new C1770990wBd();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(334));

    public static Activity LIZ() {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return null;
        }
        InterfaceC1603190roz.LJJIJIIJI.getClass();
        if (!C0SPD.LIZ() || !(activityLJFF instanceof C19EG)) {
            return null;
        }
        C19EG c19eg = (C19EG) activityLJFF;
        if (Intrinsics.LJFF(C343710Ddh.LIZ(c19eg).CQ2(), "SHOP_MALL")) {
            return null;
        }
        if (Intrinsics.LJFF("HOME", C343710Ddh.LIZ(c19eg).CQ2()) && Hox.LLJILJIL.LIZ(c19eg).KQ2("Shop")) {
            return null;
        }
        return activityLJFF;
    }

    public static String LIZJ(n nVar) {
        Object obj;
        Set set;
        Object c098200Yq;
        if (nVar == null) {
            set = null;
        } else {
            try {
                TreeSet treeSet = new TreeSet();
                C13LQ.LJJLIIIJL(treeSet, new String[0]);
                Iterator<T> it2 = nVar.entrySet().iterator();
                while (it2.hasNext()) {
                    try {
                        c098200Yq = ((k) ((Map.Entry) it2.next()).getValue()).LJIILIIL().LJJIJIL();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    Set set2 = (Set) c098200Yq;
                    if (set2 != null) {
                        treeSet.addAll(set2);
                    }
                }
                boolean z = !treeSet.isEmpty();
                TreeSet treeSet2 = treeSet;
                if (!z) {
                    treeSet2 = null;
                }
                C189200o6.m2constructorimpl(treeSet2);
                obj = treeSet2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C098200Yq c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
                obj = c098200Yq2;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj2 = obj;
            if (zM7isFailureimpl) {
                obj2 = null;
            }
            set = (Set) obj2;
        }
        if (set == null) {
            return null;
        }
        return C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62);
    }

    public static n LIZIZ(n nVar, n nVar2) {
        Object c098200Yq;
        Object c098200Yq2;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        Set<String> setLJJIJIL;
        Set<String> setLJJIJIL2;
        k kVarLJJIIZ4 = null;
        if (nVar == null) {
            return null;
        }
        try {
            if (!Intrinsics.LJFF(nVar, nVar2)) {
                n nVar3 = new n();
                n nVar4 = new n();
                n nVar5 = new n();
                HashSet<String> hashSet = new HashSet();
                hashSet.addAll(nVar.LJJIJIL());
                hashSet.addAll(nVar2.LJJIJIL());
                for (String str : hashSet) {
                    k kVarLJJIIZ5 = nVar.LJJIIZ(str);
                    k kVarLJJIIZ6 = nVar2.LJJIIZ(str);
                    if (!Intrinsics.LJFF(kVarLJJIIZ5, kVarLJJIIZ6)) {
                        if (!(kVarLJJIIZ5 instanceof n) && !(kVarLJJIIZ6 instanceof n)) {
                            nVar4.LJJIFFI(str, nVar.LJJIIZ(str));
                            nVar5.LJJIFFI(str, nVar2.LJJIIZ(str));
                        } else {
                            try {
                                c098200Yq = kVarLJJIIZ5.LJIILIIL();
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = kVarLJJIIZ4;
                            }
                            n nVar6 = (n) c098200Yq;
                            try {
                                c098200Yq2 = kVarLJJIIZ6.LJIILIIL();
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                                c098200Yq2 = kVarLJJIIZ4;
                            }
                            n nVar7 = (n) c098200Yq2;
                            n nVar8 = new n();
                            n nVar9 = new n();
                            HashSet<String> hashSet2 = new HashSet();
                            if (nVar6 != null && (setLJJIJIL2 = nVar6.LJJIJIL()) != null) {
                                hashSet2.addAll(setLJJIJIL2);
                            }
                            if (nVar7 != null && (setLJJIJIL = nVar7.LJJIJIL()) != null) {
                                hashSet2.addAll(setLJJIJIL);
                            }
                            for (String str2 : hashSet2) {
                                if (nVar6 != null) {
                                    kVarLJJIIZ4 = nVar6.LJJIIZ(str2);
                                }
                                if (nVar7 == null) {
                                    kVarLJJIIZ = null;
                                } else {
                                    kVarLJJIIZ = nVar7.LJJIIZ(str2);
                                }
                                if (!Intrinsics.LJFF(kVarLJJIIZ4, kVarLJJIIZ)) {
                                    if (nVar6 == null) {
                                        kVarLJJIIZ2 = null;
                                    } else {
                                        kVarLJJIIZ2 = nVar6.LJJIIZ(str2);
                                    }
                                    nVar8.LJJIFFI(str2, kVarLJJIIZ2);
                                    if (nVar7 == null) {
                                        kVarLJJIIZ3 = null;
                                    } else {
                                        kVarLJJIIZ3 = nVar7.LJJIIZ(str2);
                                    }
                                    nVar9.LJJIFFI(str2, kVarLJJIIZ3);
                                }
                                kVarLJJIIZ4 = null;
                            }
                            nVar4.LJJIFFI(str, nVar8);
                            nVar5.LJJIFFI(str, nVar9);
                            kVarLJJIIZ4 = null;
                        }
                    }
                }
                nVar3.LJJIFFI("preload", nVar4);
                nVar3.LJJIFFI("now", nVar5);
                return nVar3;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(boolean r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770990wBd.LIZLLL(boolean, X.05Vn):java.lang.Object");
    }
}
