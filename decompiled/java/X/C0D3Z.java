package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3Z {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a A[PHI: r4
      0x000a: PHI (r4v4 java.util.List) = (r4v0 java.util.List), (r4v5 java.util.List) binds: [B:6:0x0008, B:4:0x0004] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e A[PHI: r4
      0x000e: PHI (r4v3 java.util.List) = (r4v0 java.util.List), (r4v4 java.util.List) binds: [B:6:0x0008, B:8:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C332910D3h LIZIZ(X.C0D3V r10) {
        /*
            if (r10 == 0) goto L6
            java.util.List<X.0D2z> r4 = r10.skuOptions
            if (r4 != 0) goto La
        L6:
            X.13BV r4 = X.C13BV.INSTANCE
            if (r10 == 0) goto Le
        La:
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.selectedSkuOptions
            if (r0 != 0) goto L12
        Le:
            java.util.Map r0 = X.C2097608Jq.LJ()
        L12:
            java.util.Map r3 = LIZ(r4, r0)
            int r2 = r3.size()
            int r0 = r0.size()
            r1 = 0
            if (r2 == r0) goto L51
            r5 = 1
        L22:
            int r7 = r4.size()
            int r6 = r3.size()
            X.0D3h r4 = new X.0D3h
            if (r7 <= 0) goto L4f
            if (r6 != r7) goto L4f
            r8 = 1
        L31:
            if (r10 == 0) goto L4d
            java.lang.String r0 = r10.selectedVariantId
            if (r0 == 0) goto L4d
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L4d
            r0 = 0
        L3e:
            r9 = r0 ^ 1
            if (r10 == 0) goto L47
            boolean r0 = r10.availableForSale
            if (r0 != 0) goto L47
            r1 = 1
        L47:
            r10 = r1 ^ 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L4d:
            r0 = 1
            goto L3e
        L4f:
            r8 = 0
            goto L31
        L51:
            r5 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D3Z.LIZIZ(X.0D3V):X.0D3h");
    }

    public static Map LIZ(List list, Map map) {
        if (!map.isEmpty() && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C332830D2z c332830D2z = (C332830D2z) it2.next();
                String str = (String) map.get(c332830D2z.type);
                if (str != null) {
                    List<C332800D2w> list2 = c332830D2z.options;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<C332800D2w> it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (u.LJIJI(it3.next().value, str, true)) {
                                linkedHashMap.put(c332830D2z.type, str);
                                break;
                            }
                        }
                    }
                }
            }
            return linkedHashMap;
        }
        return map;
    }
}
