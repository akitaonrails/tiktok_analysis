package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0rg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597620rg0 {
    public final C1169404ho LIZ;
    public final Map<EnumC1597060rf6, InterfaceC1597700rg8<?>> LIZIZ;

    public static C1158310gFR LJFF(List list) {
        String str;
        Object next;
        String str2;
        Object next2;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1158300gFQ c1158300gFQ = (C1158300gFQ) it2.next();
            linkedHashMap.putAll(c1158300gFQ.LIZ);
            linkedHashMap2.putAll(c1158300gFQ.LIZLLL);
            linkedHashSet.addAll(c1158300gFQ.LJ);
        }
        Iterator it3 = list.iterator();
        while (true) {
            str = null;
            if (it3.hasNext()) {
                next = it3.next();
                if (((C1158300gFQ) next).LIZ.keySet().contains(EnumC1597060rf6.STORY)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1158300gFQ c1158300gFQ2 = (C1158300gFQ) next;
        if (c1158300gFQ2 != null) {
            str2 = c1158300gFQ2.LIZIZ;
        } else {
            str2 = null;
        }
        Iterator it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                next2 = it4.next();
                if (((C1158300gFQ) next2).LIZIZ != null) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        C1158300gFQ c1158300gFQ3 = (C1158300gFQ) next2;
        if (c1158300gFQ3 != null) {
            str = c1158300gFQ3.LIZIZ;
        }
        if (str2 != null) {
            str = str2;
        }
        if (!list.isEmpty()) {
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                if (((C1158300gFQ) it5.next()).LIZJ) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return new C1158310gFR(linkedHashMap, str, z, linkedHashMap2, linkedHashSet);
    }

    public final Map<InterfaceC1597700rg8<?>, List<EnumC1597060rf6>> LJ(List<? extends EnumC1597060rf6> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1597060rf6 enumC1597060rf6 : list) {
            InterfaceC1597700rg8<?> interfaceC1597700rg8 = this.LIZIZ.get(enumC1597060rf6);
            if (interfaceC1597700rg8 == null) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("groupByFetcherIdentity: no fetcher for bizType=");
                sbLIZ.append(enumC1597060rf6);
                C1720106oR.LIZ("SkylightDataPipeline", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                Object arrayList = linkedHashMap.get(interfaceC1597700rg8);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(interfaceC1597700rg8, arrayList);
                }
                ((List) arrayList).add(enumC1597060rf6);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1597620rg0(C1169404ho c1169404ho, Map<EnumC1597060rf6, ? extends InterfaceC1597700rg8<?>> map) {
        this.LIZ = c1169404ho;
        this.LIZIZ = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0040, code lost:
    
        if (r4 == r7) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:13:0x0053, B:27:0x00d8], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba A[LOOP:0: B:23:0x00b4->B:25:0x00ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1596730reZ r15, X.InterfaceC1364105Vn<? super X.C1158310gFR> r16) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597620rg0.LIZ(X.0reZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<? extends X.EnumC1597060rf6> r8, X.C1596730reZ r9, X.InterfaceC1364105Vn<? super X.C1158310gFR> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1597670rg5
            if (r0 == 0) goto L76
            r5 = r10
            X.0rg5 r5 = (X.C1597670rg5) r5
            int r2 = r5.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r5.LLIZ = r2
        L12:
            java.lang.Object r0 = r5.LLILZIL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLIZ
            r4 = 1
            if (r1 == 0) goto L5f
            if (r1 != r4) goto L81
            java.lang.Object r3 = r5.LLILZ
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r5.LLILLL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r5.LLILLJJLI
            java.util.List r1 = (java.util.List) r1
            X.0reZ r9 = r5.LL
            X.C155000ia.LIZIZ(r0)
        L30:
            r3.add(r0)
            r3 = r1
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            X.0rg8 r1 = (X.InterfaceC1597700rg8) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r5.LL = r9
            r5.LLILLJJLI = r3
            r5.LLILLL = r2
            r5.LLILZ = r3
            r5.LLIZ = r4
            java.lang.Object r0 = r7.LIZJ(r1, r0, r9, r5)
            if (r0 != r6) goto L5d
            return r6
        L5d:
            r1 = r3
            goto L30
        L5f:
            X.C155000ia.LIZIZ(r0)
            java.util.Map r0 = r7.LJ(r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
            goto L34
        L76:
            X.0rg5 r5 = new X.0rg5
            r5.<init>(r7, r10)
            goto L12
        L7c:
            X.0gFR r0 = LJFF(r3)
            return r0
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597620rg0.LIZIZ(java.util.List, X.0reZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.EnumC1597060rf6 r15, X.C1596730reZ r16, X.InterfaceC1364105Vn<? super X.C1160260gIa<? extends X.InterfaceC1891350zJl>> r17) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597620rg0.LIZLLL(X.0rf6, X.0reZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.EnumC1597060rf6 r6, X.C1596730reZ r7, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1891350zJl>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1597690rg7
            if (r0 == 0) goto L33
            r4 = r8
            X.0rg7 r4 = (X.C1597690rg7) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 != r0) goto L39
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0gIa r3 = (X.C1160260gIa) r3
            java.util.List<T extends X.0zJl> r0 = r3.LIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LIZLLL(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L33:
            X.0rg7 r4 = new X.0rg7
            r4.<init>(r5, r8)
            goto L12
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597620rg0.LJI(X.0rf6, X.0reZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:38:0x0134, B:50:0x014a], limit reached: 126 */
    /* JADX WARN: Path cross not found for [B:46:0x0143, B:43:0x013d], limit reached: 126 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[LOOP:0: B:14:0x005f->B:16:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195 A[LOOP:1: B:56:0x018f->B:58:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6 A[LOOP:2: B:60:0x01c0->B:62:0x01c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028b  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0rg0] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f3 -> B:31:0x0115). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1597700rg8<?> r13, java.util.List<? extends X.EnumC1597060rf6> r14, X.C1596730reZ r15, X.InterfaceC1364105Vn<? super X.C1158300gFQ> r16) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597620rg0.LIZJ(X.0rg8, java.util.List, X.0reZ, X.05Vn):java.lang.Object");
    }
}
