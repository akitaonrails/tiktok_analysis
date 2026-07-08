package X;

import com.ss.android.ugc.aweme.ad.feed.idelpreload.exp.IdlePreloadFeatureConfig;
import com.ss.android.ugc.aweme.api.component.idlepreload.eventrack.CommerceIdlePreloadEventTracker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006690cIt {
    public final List<IdlePreloadFeatureConfig> LIZ;
    public final double LIZIZ;
    public final Map<String, Double> LIZJ;
    public final C0NO4 LIZLLL;
    public final CommerceIdlePreloadEventTracker LJ;
    public final C054G LJFF;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1006690cIt.LIZ():boolean");
    }

    public C1006690cIt(List<IdlePreloadFeatureConfig> list, double d) {
        LinkedHashMap linkedHashMap;
        this.LIZ = list;
        this.LIZIZ = d;
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
            for (IdlePreloadFeatureConfig idlePreloadFeatureConfig : list) {
                Pair pair = new Pair(idlePreloadFeatureConfig.resourceName, Double.valueOf(idlePreloadFeatureConfig.weight));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        this.LIZJ = linkedHashMap;
        this.LIZLLL = new C0NO4();
        this.LJ = new CommerceIdlePreloadEventTracker();
        this.LJFF = C2296808zG.LIZ(C0PEM.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.0cIy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.0cIx] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final C1006740cIy LIZIZ(String str, C1001810cB1 c1001810cB1) {
        double dDoubleValue;
        EnumC584580MwK enumC584580MwK;
        C1006780cJ2 c1006780cJ2;
        ?? c1006740cIy;
        final EnumC1006720cIw enumC1006720cIw;
        Double d;
        Map<String, Double> map = this.LIZJ;
        if (map != null && (d = map.get(str)) != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        boolean z = true;
        if (Intrinsics.LJFF(str, EnumC1006700cIu.DASH_STATE.getValue())) {
            this.LIZLLL.getClass();
            int i = C1006790cJ3.LIZ[C1BCA.LJFF().LIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            enumC1006720cIw = EnumC1006720cIw.UNKNOWN;
                        } else {
                            enumC1006720cIw = EnumC1006720cIw.LOW;
                        }
                    } else {
                        enumC1006720cIw = EnumC1006720cIw.MEDIUM;
                    }
                } else {
                    enumC1006720cIw = EnumC1006720cIw.HIGH;
                }
            } else {
                enumC1006720cIw = EnumC1006720cIw.CRITICAL;
            }
            ?? r5 = new C1006740cIy(enumC1006720cIw) { // from class: X.0cIx
                public final EnumC1006720cIw LIZJ;
                public final EnumC1006700cIu LIZLLL = EnumC1006700cIu.DASH_STATE;

                @Override // X.C1006740cIy
                public final int LIZ() {
                    int i2 = C1006710cIv.LIZ[this.LIZJ.ordinal()];
                    if (i2 == 1) {
                        return 100;
                    }
                    if (i2 == 2) {
                        return 75;
                    }
                    if (i2 != 3) {
                        return i2 != 4 ? 0 : 25;
                    }
                    return 50;
                }

                @Override // X.C1006740cIy
                public final boolean LIZJ() {
                    return this.LIZJ == EnumC1006720cIw.CRITICAL;
                }

                @Override // X.C1006740cIy
                public final EnumC1006700cIu LIZIZ() {
                    return this.LIZLLL;
                }

                {
                    this.LIZJ = enumC1006720cIw;
                }
            };
            c1001810cB1.LIZIZ = r5;
            c1006740cIy = r5;
        } else if (Intrinsics.LJFF(str, EnumC1006700cIu.SCROLL_STATE.getValue())) {
            this.LIZLLL.getClass();
            C1006770cJ1 c1006770cJ1 = new C1006770cJ1(C1BCA.LJIIJ().LIZ);
            c1001810cB1.LIZJ = c1006770cJ1;
            c1006740cIy = c1006770cJ1;
        } else if (Intrinsics.LJFF(str, EnumC1006700cIu.MAIN_THREAD_STATE.getValue())) {
            this.LIZLLL.getClass();
            C1006760cJ0 c1006760cJ0 = new C1006760cJ0(C1BCA.LJII().LIZ);
            c1001810cB1.LIZLLL = c1006760cJ0;
            c1006740cIy = c1006760cJ0;
        } else if (Intrinsics.LJFF(str, EnumC1006700cIu.FAST_SCROLL_STATE.getValue())) {
            this.LIZLLL.getClass();
            String str2 = C584590MwL.LIZIZ;
            if (str2 == null || (enumC584580MwK = C584590MwL.LIZ.get(str2)) == null) {
                c1006780cJ2 = new C1006780cJ2();
            } else {
                c1006780cJ2 = new C1006780cJ2();
                c1006780cJ2.LIZIZ = enumC584580MwK;
            }
            if (c1006780cJ2.LIZIZ != EnumC584580MwK.FAST) {
                z = false;
            }
            C1006750cIz c1006750cIz = new C1006750cIz(z);
            c1001810cB1.LJ = c1006750cIz;
            c1006740cIy = c1006750cIz;
        } else {
            c1006740cIy = new C1006740cIy();
        }
        c1006740cIy.LIZIZ = dDoubleValue;
        return c1006740cIy;
    }
}
