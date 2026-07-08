package X;

import X.C1BU1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1BTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205481BTm<T extends C1BU1> extends AbstractC2205581BTw<T> {
    public static final C1BS6 LJ = new C1BS6(1.0d);
    public final int LIZIZ = 80;
    public final Collection<C2205471BTl<T>> LIZJ = new LinkedHashSet();
    public final C2205501BTo<C2205471BTl<T>> LIZLLL = new C2205501BTo<>(new C1BU8(0.0d, 1.0d, 0.0d, 1.0d), 0);

    @Override // X.InterfaceC2205541BTs
    public final void LIZIZ() {
        synchronized (this.LIZLLL) {
            try {
                this.LIZJ.clear();
                C2205501BTo<C2205471BTl<T>> c2205501BTo = this.LIZLLL;
                c2205501BTo.LIZLLL = null;
                Set<T> set = c2205501BTo.LIZJ;
                if (set != 0) {
                    set.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2205541BTs
    public final Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.LIZLLL) {
            try {
                Iterator<C2205471BTl<T>> it2 = this.LIZJ.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next().LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkedHashSet;
    }

    @Override // X.InterfaceC2205541BTs
    public final int LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2205541BTs
    public final boolean LIZLLL(Collection<T> collection) {
        boolean zAdd;
        Iterator<T> it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            C2205471BTl<T> c2205471BTl = new C2205471BTl<>(it2.next());
            synchronized (this.LIZLLL) {
                try {
                    zAdd = this.LIZJ.add(c2205471BTl);
                    if (zAdd) {
                        C2205501BTo<C2205471BTl<T>> c2205501BTo = this.LIZLLL;
                        c2205501BTo.getClass();
                        C1BSB c1bsb = c2205471BTl.LIZIZ;
                        C1BU8 c1bu8 = c2205501BTo.LIZ;
                        double d = c1bsb.LIZ;
                        double d2 = c1bsb.LIZIZ;
                        if (c1bu8.LIZ <= d && d <= c1bu8.LIZJ && c1bu8.LIZIZ <= d2 && d2 <= c1bu8.LIZLLL) {
                            c2205501BTo.LIZ(d, d2, c2205471BTl);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (zAdd) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC2205541BTs
    public final Set<? extends InterfaceC1177120gjm<T>> LJI(float f) throws Throwable {
        C1BU8 c1bu8;
        double dIntValue;
        int i = (int) f;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.LIZLLL) {
            try {
                for (C2205471BTl<T> c2205471BTl : this.LIZJ) {
                    if (!hashSet.contains(c2205471BTl)) {
                        Pair<Integer, Integer> pairLIZIZ = c2205471BTl.LIZ.LIZIZ();
                        if (pairLIZIZ != null && pairLIZIZ.getFirst().intValue() != 0 && pairLIZIZ.getSecond().intValue() != 0) {
                            double d = i;
                            try {
                                dIntValue = (((double) pairLIZIZ.getFirst().intValue()) / Math.pow(2.0d, d)) / 256.0d;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                            try {
                                double dIntValue2 = (((double) pairLIZIZ.getSecond().intValue()) / Math.pow(2.0d, d)) / 256.0d;
                                C1BSB c1bsb = c2205471BTl.LIZIZ;
                                double d2 = dIntValue / 2.0d;
                                double d3 = dIntValue2 / 2.0d;
                                double d4 = c1bsb.LIZ;
                                double d5 = d4 - d2;
                                double d6 = d2 + d4;
                                double d7 = c1bsb.LIZIZ;
                                c1bu8 = new C1BU8(d5, d6, d7 - d3, d7 + d3);
                            } catch (Throwable th3) {
                                th = th3;
                                while (true) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        } else {
                            double dPow = (((double) this.LIZIZ) / Math.pow(2.0d, i)) / 256.0d;
                            C1BSB c1bsb2 = c2205471BTl.LIZIZ;
                            double d8 = dPow / 2.0d;
                            double d9 = c1bsb2.LIZ;
                            double d10 = d9 - d8;
                            double d11 = d8 + d9;
                            double d12 = c1bsb2.LIZIZ;
                            c1bu8 = new C1BU8(d10, d11, d12 - d8, d12 + d8);
                        }
                        C2205501BTo<C2205471BTl<T>> c2205501BTo = this.LIZLLL;
                        c2205501BTo.getClass();
                        ArrayList<C2205471BTl> arrayList = new ArrayList();
                        c2205501BTo.LIZIZ(c1bu8, arrayList);
                        if (arrayList.size() == 1) {
                            hashSet2.add(c2205471BTl);
                            hashSet.add(c2205471BTl);
                            map.put(c2205471BTl, Double.valueOf(0.0d));
                        } else {
                            C1178500gm0 c1178500gm0 = new C1178500gm0(c2205471BTl.LIZ.getPosition());
                            hashSet2.add(c1178500gm0);
                            for (C2205471BTl c2205471BTl2 : arrayList) {
                                Double d13 = (Double) map.get(c2205471BTl2);
                                C1BSB c1bsb3 = c2205471BTl2.LIZIZ;
                                C1BSB c1bsb4 = c2205471BTl.LIZIZ;
                                double d14 = c1bsb3.LIZ - c1bsb4.LIZ;
                                double d15 = c1bsb3.LIZIZ - c1bsb4.LIZIZ;
                                double d16 = (d14 * d14) + (d15 * d15);
                                if (d13 != null) {
                                    if (d13.doubleValue() >= d16) {
                                        ((C1178500gm0) map2.get(c2205471BTl2)).LIZIZ.remove(c2205471BTl2.LIZ);
                                    }
                                }
                                map.put(c2205471BTl2, Double.valueOf(d16));
                                c1178500gm0.LIZIZ.add(c2205471BTl2.LIZ);
                                map2.put(c2205471BTl2, c1178500gm0);
                            }
                            hashSet.addAll(arrayList);
                        }
                    }
                }
                return hashSet2;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // X.InterfaceC2205541BTs
    public final boolean LIZ(T t, T t2) {
        synchronized (this.LIZLLL) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<C2205471BTl<T>> it2 = this.LIZJ.iterator();
                int i = -1;
                int i2 = -1;
                while (it2.hasNext()) {
                    i2++;
                    C2205471BTl<T> next = it2.next();
                    if (next.LIZ == t) {
                        it2.remove();
                        i = i2;
                    } else {
                        arrayList.add(next);
                    }
                }
                if (i == -1) {
                    return false;
                }
                arrayList.add(i, new C2205471BTl(t2));
                this.LIZJ.clear();
                this.LIZJ.addAll(arrayList);
                C2205501BTo<C2205471BTl<T>> c2205501BTo = this.LIZLLL;
                c2205501BTo.LIZLLL = null;
                Set<T> set = c2205501BTo.LIZJ;
                if (set != 0) {
                    set.clear();
                }
                for (C2205471BTl<T> c2205471BTl : this.LIZJ) {
                    C2205501BTo<C2205471BTl<T>> c2205501BTo2 = this.LIZLLL;
                    c2205501BTo2.getClass();
                    C1BSB c1bsb = c2205471BTl.LIZIZ;
                    C1BU8 c1bu8 = c2205501BTo2.LIZ;
                    double d = c1bsb.LIZ;
                    double d2 = c1bsb.LIZIZ;
                    if (c1bu8.LIZ <= d && d <= c1bu8.LIZJ && c1bu8.LIZIZ <= d2 && d2 <= c1bu8.LIZLLL) {
                        c2205501BTo2.LIZ(d, d2, c2205471BTl);
                    }
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
