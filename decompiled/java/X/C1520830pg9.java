package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520830pg9 extends AbstractC1520800pg6 {
    public static final C1520830pg9 LIZLLL = new C1520830pg9();

    public C1520830pg9() {
        super("unified_bid");
    }

    @Override // X.AbstractC1520800pg6
    public final C1520610pfn LIZJ(List<String> list, EnumC1520910pgH enumC1520910pgH, boolean z) {
        C1520610pfn c1520610pfn = AbstractC1520800pg6.LIZIZ;
        Iterator it2 = C1697810uHb.LJ(C1520810pg7.LIZLLL, new AbstractC1520800pg6() { // from class: X.0pg8
            public static boolean LJ;
            public static boolean LJFF;
            public static final List<String> LJI = new ArrayList();
            public static Map<String, Object> LJII = new LinkedHashMap();
            public static List<Object> LJIIIIZZ = new ArrayList();
            public static List<Object> LJIIIZ = new ArrayList();

            /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.String LIZLLL(java.lang.String r12, java.util.List r13) {
                /*
                    java.util.ArrayList r13 = (java.util.ArrayList) r13
                    java.util.Iterator r11 = r13.iterator()
                    r10 = 0
                    r7 = 0
                    r1 = r10
                    r2 = 0
                La:
                    boolean r0 = r11.hasNext()
                    if (r0 == 0) goto L69
                    java.lang.Object r8 = r11.next()
                    int r9 = r2 + 1
                    if (r2 < 0) goto L65
                    java.util.Map r8 = (java.util.Map) r8
                    java.lang.String r0 = "identifies"
                    java.lang.Object r2 = r8.get(r0)
                    boolean r0 = r2 instanceof java.util.List
                    if (r0 == 0) goto L51
                    java.util.List r2 = (java.util.List) r2
                    if (r2 == 0) goto L51
                    java.util.Iterator r6 = r2.iterator()
                    r5 = 0
                    r4 = 1
                L2e:
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto L4f
                    java.lang.Object r3 = r6.next()
                    int r2 = r5 + 1
                    if (r5 < 0) goto L61
                    boolean r0 = r3 instanceof java.lang.String
                    if (r0 == 0) goto L4d
                    java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                    boolean r0 = kotlin.text.a0.LJJIIZI(r12, r3, r7)
                    if (r0 == 0) goto L4d
                    if (r4 == 0) goto L4d
                    r4 = 1
                L4b:
                    r5 = r2
                    goto L2e
                L4d:
                    r4 = 0
                    goto L4b
                L4f:
                    if (r4 == 0) goto L5d
                L51:
                    java.lang.String r0 = "bid"
                    java.lang.Object r1 = r8.get(r0)
                    boolean r0 = r1 instanceof java.lang.String
                    if (r0 == 0) goto L5f
                    java.lang.String r1 = (java.lang.String) r1
                L5d:
                    r2 = r9
                    goto La
                L5f:
                    r1 = r10
                    goto L5d
                L61:
                    X.C1697810uHb.LJIJI()
                    throw r10
                L65:
                    X.C1697810uHb.LJIJI()
                    throw r10
                L69:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1520820pg8.LIZLLL(java.lang.String, java.util.List):java.lang.String");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:128:0x02e9  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0329 A[PHI: r11
              0x0329: PHI (r11v4 java.util.Map) = (r11v3 java.util.Map), (r11v3 java.util.Map), (r11v3 java.util.Map), (r11v3 java.util.Map), (r11v5 java.util.Map) binds: [B:118:0x02c3, B:120:0x02d0, B:122:0x02d4, B:124:0x02dd, B:117:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:178:0x0324 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00f5 A[PHI: r14
              0x00f5: PHI (r14v2 int) = (r14v5 int), (r14v6 int) binds: [B:40:0x00f3, B:38:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01cb  */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // X.AbstractC1520800pg6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1520610pfn LIZJ(java.util.List<java.lang.String> r20, X.EnumC1520910pgH r21, boolean r22) {
                /*
                    Method dump skipped, instruction units count: 827
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1520820pg8.LIZJ(java.util.List, X.0pgH, boolean):X.0pfn");
            }
        }, new AbstractC1520800pg6() { // from class: X.0pg5
            public static void LIZLLL(long j, String str, boolean z2) {
                C2119208Ry.LIZIZ(null, "regex_perf", C2097608Jq.LJIIIIZZ(new Pair("url", str), new Pair("hit_cache", String.valueOf(z2))), C2097908Jt.LIZJ(new Pair("regex_match_time", Long.valueOf(System.currentTimeMillis() - j))));
            }

            @Override // X.AbstractC1520800pg6
            public final C1520610pfn LIZJ(List<String> list2, EnumC1520910pgH enumC1520910pgH2, boolean z2) {
                String strSubstring;
                boolean zIsEmpty = list2.isEmpty();
                C1520610pfn c1520610pfn2 = AbstractC1520800pg6.LIZIZ;
                if (zIsEmpty || (strSubstring = (String) ListProtector.get(list2, 0)) == null) {
                    return c1520610pfn2;
                }
                boolean z3 = C1520630pfp.LIZ;
                int i = C1520630pfp.LIZIZ;
                if (strSubstring.length() > i) {
                    strSubstring = strSubstring.substring(0, i);
                }
                if (z3 && strSubstring.length() == 0) {
                    return c1520610pfn2;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strLIZIZ = LIZIZ(strSubstring);
                if (strLIZIZ != null) {
                    LIZLLL(jCurrentTimeMillis, strSubstring, true);
                    return new C1520610pfn(strLIZIZ, this.LIZ);
                }
                String str = "";
                if (!z2) {
                    C1520380pfQ.LIZ.getClass();
                    Iterator<C1520780pg4> it3 = C1520380pfQ.LIZJ().LJFF().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C1520780pg4 next = it3.next();
                        if (next.LLILLJJLI.containsMatchIn(strSubstring)) {
                            str = next.LL;
                            break;
                        }
                    }
                    LIZ(strSubstring, str);
                    LIZLLL(jCurrentTimeMillis, strSubstring, false);
                }
                return new C1520610pfn(str, this.LIZ);
            }
        }).iterator();
        while (it2.hasNext()) {
            C1520610pfn c1520610pfnLIZJ = ((AbstractC1520800pg6) it2.next()).LIZJ(list, enumC1520910pgH, z);
            if (c1520610pfnLIZJ.LIZ.length() != 0 && !Intrinsics.LJFF(c1520610pfnLIZJ.LIZ, "__hybrid_default")) {
                return c1520610pfnLIZJ;
            }
        }
        return c1520610pfn;
    }
}
