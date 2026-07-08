package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.forest.model.GeckoSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0q0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533560q0g {
    public final String LIZ;
    public final C1533570q0h LIZIZ;
    public final Map<String, C1533570q0h> LIZJ;
    public List<String> LIZLLL;
    public C2027907wz LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public C1535170q3H LJIIJ;

    public final C1533560q0g LIZ() {
        String str = this.LIZ;
        C1533570q0h c1533570q0h = this.LIZIZ;
        C1533570q0h c1533570q0h2 = null;
        String str2 = null;
        if (c1533570q0h != null) {
            String str3 = c1533570q0h.LIZ;
            String str4 = c1533570q0h.LIZIZ;
            Long lValueOf = c1533570q0h.LIZJ;
            if (lValueOf == null) {
                C1533650q0p globalConfig = Forest.Companion.getGlobalConfig();
                lValueOf = globalConfig != null ? Long.valueOf(globalConfig.LIZ) : null;
            }
            String str5 = c1533570q0h.LIZLLL;
            if (str5 == null) {
                C1533650q0p globalConfig2 = Forest.Companion.getGlobalConfig();
                str5 = globalConfig2 != null ? globalConfig2.LIZIZ : null;
            }
            String str6 = c1533570q0h.LJ;
            if (str6 == null) {
                C1533650q0p globalConfig3 = Forest.Companion.getGlobalConfig();
                str6 = globalConfig3 != null ? globalConfig3.LIZJ : null;
            }
            String str7 = c1533570q0h.LJFF;
            if (str7 == null) {
                C1533650q0p globalConfig4 = Forest.Companion.getGlobalConfig();
                if (globalConfig4 != null) {
                    str2 = globalConfig4.LIZLLL;
                }
            } else {
                str2 = str7;
            }
            C1533570q0h c1533570q0h3 = new C1533570q0h(str3, str4, lValueOf, str5, str6, str2, false, 192);
            c1533570q0h3.LIZ = c1533570q0h.LIZ;
            c1533570q0h3.LIZIZ = c1533570q0h.LIZIZ;
            c1533570q0h3.LJI = c1533570q0h.LJI;
            c1533570q0h3.LJII = c1533570q0h.LJII;
            c1533570q0h3.LJIIIIZZ = c1533570q0h.LJIIIIZZ;
            c1533570q0h3.LJIIIZ = c1533570q0h.LJIIIZ;
            c1533570q0h2 = c1533570q0h3;
        }
        C1533560q0g c1533560q0g = new C1533560q0g(str, c1533570q0h2, new LinkedHashMap(this.LIZJ));
        c1533560q0g.LJ = this.LJ;
        c1533560q0g.LIZLLL = this.LIZLLL;
        c1533560q0g.LJI = this.LJI;
        c1533560q0g.LJII = this.LJII;
        c1533560q0g.LJIIIIZZ = this.LJIIIIZZ;
        c1533560q0g.LJIIIZ = this.LJIIIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJFF);
        sbLIZ.append("-copy");
        c1533560q0g.LJFF = C2188811AlT.LIZIZ(sbLIZ);
        return c1533560q0g;
    }

    public final void LIZLLL() {
        this.LJFF = "SparkContainerForest";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{[host]=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",[region]=");
        C1533570q0h c1533570q0h = this.LIZIZ;
        sbLIZ.append(c1533570q0h != null ? c1533570q0h.LJFF : null);
        sbLIZ.append(",[appId]=");
        C1533570q0h c1533570q0h2 = this.LIZIZ;
        sbLIZ.append(c1533570q0h2 != null ? c1533570q0h2.LIZJ : null);
        sbLIZ.append(",[appVersion]=");
        C1533570q0h c1533570q0h3 = this.LIZIZ;
        sbLIZ.append(c1533570q0h3 != null ? c1533570q0h3.LIZLLL : null);
        sbLIZ.append(",[did]=");
        C1533570q0h c1533570q0h4 = this.LIZIZ;
        sbLIZ.append(c1533570q0h4 != null ? c1533570q0h4.LJ : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1533570q0h LIZIZ(java.lang.String r14) {
        /*
            r13 = this;
            java.util.Map<java.lang.String, X.0q0h> r1 = r13.LIZJ
            java.lang.String r6 = ""
            if (r14 != 0) goto L74
            r0 = r6
        L7:
            java.lang.Object r4 = r1.get(r0)
            X.0q0h r4 = (X.C1533570q0h) r4
            if (r4 != 0) goto L28
            boolean r0 = X.C1533950q1J.LJ(r14)
            r1 = 0
            if (r0 == 0) goto L29
            X.0q0h r0 = r13.LIZIZ
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.LIZ
        L1c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r14, r1)
            if (r0 == 0) goto L29
            X.0q0h r4 = r13.LIZIZ
        L24:
            if (r4 != 0) goto L28
        L26:
            X.0q0h r4 = r13.LIZIZ
        L28:
            return r4
        L29:
            if (r14 != 0) goto L2c
            r14 = r6
        L2c:
            X.01GW<java.util.Map<java.lang.String, X.0q0h>> r3 = X.C1533570q0h.LJIIJ
            java.lang.Object r0 = r3.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r0.get(r14)
            X.0q0h r4 = (X.C1533570q0h) r4
            if (r4 != 0) goto L24
            X.0q6J r0 = X.C1537050q6J.LIZ
            r0.getClass()
            X.0qUL r0 = X.C1537050q6J.LIZ(r14)
            if (r0 == 0) goto L26
            X.0qTf r2 = r0.LIZ
            X.0q0h r4 = new X.0q0h
            java.util.List<java.lang.String> r1 = r2.LJ
            r0 = 0
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L57
            r5 = r6
        L57:
            java.io.File r0 = r2.LJIIL
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 == 0) goto L60
            r6 = r0
        L60:
            r7 = 0
            r11 = 0
            r12 = 188(0xbc, float:2.63E-43)
            r8 = r7
            r9 = r7
            r10 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r3.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r14, r4)
            goto L24
        L74:
            r0 = r14
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533560q0g.LIZIZ(java.lang.String):X.0q0h");
    }

    public final boolean LIZJ(String str, C1533510q0b c1533510q0b) {
        C2027907wz c2027907wz = this.LJ;
        if (c2027907wz != null) {
            if (c2027907wz.LIZ(str, c1533510q0b, false)) {
                c1533510q0b.LJIIIIZZ = GeckoSource.INJECTED_PREFIXES_PARSER;
                return true;
            }
        } else {
            List<String> list = this.LIZLLL;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    C1533510q0b c1533510q0bLIZIZ = C1956907lX.LIZIZ(str, it2.next());
                    if (c1533510q0bLIZIZ != null) {
                        c1533510q0b.LJIIIIZZ = GeckoSource.INJECTED_PREFIXES;
                        c1533510q0b.LIZIZ = c1533510q0bLIZIZ.LIZIZ;
                        c1533510q0b.LIZJ = c1533510q0bLIZIZ.LIZJ;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public /* synthetic */ C1533560q0g(String str, C1533570q0h c1533570q0h, int i) {
        this(str, (i & 2) != 0 ? null : c1533570q0h, (i & 4) != 0 ? new LinkedHashMap() : null);
    }

    public /* synthetic */ C1533560q0g(String str, C1533570q0h c1533570q0h, List list) {
        this(str, c1533570q0h, new LinkedHashMap(), list);
    }

    public C1533560q0g(String str, C1533570q0h c1533570q0h, Map<String, C1533570q0h> map) {
        this(str, c1533570q0h, map, new ArrayList());
    }

    public C1533560q0g(String str, C1533570q0h c1533570q0h, Map<String, C1533570q0h> map, List<String> list) {
        String str2;
        this.LIZ = str;
        this.LIZIZ = c1533570q0h;
        this.LIZJ = map;
        this.LIZLLL = list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (c1533570q0h != null) {
            str2 = c1533570q0h.LIZ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2 == null ? "" : str2);
        sbLIZ.append('|');
        String str3 = (String) C13LP.LJJJLL(list);
        sbLIZ.append(str3 != null ? str3 : "");
        this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
        if (ForestExperiment.INSTANCE.getOptimizePrefixParser()) {
            C2027907wz c2027907wz = new C2027907wz();
            c2027907wz.LIZIZ(list);
            this.LJ = c2027907wz;
            this.LIZLLL = null;
        }
        C1533590q0j.LIZ.getClass();
        this.LJI = C1533590q0j.LIZJ;
        this.LJII = false;
        this.LJIIIIZZ = C1533590q0j.LIZIZ;
        this.LJIIIZ = C1533590q0j.LIZLLL;
    }
}
