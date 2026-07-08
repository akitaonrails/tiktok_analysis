package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1473205pi {
    public static final C1473205pi LIZ = new C1473205pi();
    public static final Map<String, Set<String>> LIZIZ = new LinkedHashMap();
    public static final Type LIZJ = new TypeToken<Map<String, Boolean>>() { // from class: X.05pl
    }.getType();
    public static final C1227904rF LIZLLL = C1227904rF.LIZ;

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static void LIZLLL(Map map) {
        if (map == null) {
            return;
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Map<String, Set<String>> map2 = LIZIZ;
                Set<String> linkedHashSet = (Set) ((LinkedHashMap) map2).get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    map2.put(str, linkedHashSet);
                }
                if (str2 != null) {
                    try {
                        C1227904rF c1227904rF = LIZLLL;
                        Type type = LIZJ;
                        c1227904rF.getClass();
                        Map map3 = (Map) C1227904rF.LIZJ(str2, type);
                        if (map3 != null) {
                            for (Map.Entry entry2 : map3.entrySet()) {
                                String str3 = (String) entry2.getKey();
                                Boolean bool = (Boolean) entry2.getValue();
                                if (str3 != null && Intrinsics.LJFF(bool, Boolean.TRUE)) {
                                    linkedHashSet.add(str3);
                                }
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static Set LIZIZ(int i, String str) {
        if (str == null) {
            return null;
        }
        try {
            Map<String, Set<String>> map = LIZIZ;
            Set set = (Set) ((LinkedHashMap) map).get(str);
            if (set == null) {
                Set<String> setLIZIZ = C1473005pg.LIZIZ(i, str);
                if (setLIZIZ == null) {
                    return null;
                }
                map.put(str, setLIZIZ);
                return setLIZIZ;
            }
            return set;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r9, java.util.List r10, java.util.List r11, X.InterfaceC1364105Vn r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C1473405pk
            if (r0 == 0) goto L9a
            r5 = r12
            X.05pk r5 = (X.C1473405pk) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L58
            if (r0 != r4) goto La1
            java.lang.Object r10 = r5.LL
            java.util.List r10 = (java.util.List) r10
            X.C155000ia.LIZIZ(r2)
        L27:
            java.util.Map r2 = (java.util.Map) r2
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L38
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L38
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L38:
            java.util.Iterator r1 = r10.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r1.next()
            if (r2 == 0) goto L3c
            java.lang.Object r0 = r2.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L3c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            r7 = 1
            goto L33
        L58:
            X.C155000ia.LIZIZ(r2)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r3 = r10.iterator()
        L61:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Set r2 = LIZIZ(r9, r0)
            r0 = r11
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L78:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r1.next()
            if (r2 == 0) goto L78
            boolean r0 = r2.contains(r0)
            if (r0 != r4) goto L78
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L8f:
            r5.LL = r10
            r5.LLILZ = r4
            java.lang.Object r2 = r8.LIZJ(r9, r10, r11, r5)
            if (r2 != r6) goto L27
            return r6
        L9a:
            X.05pk r5 = new X.05pk
            r5.<init>(r8, r12)
            goto L12
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1473205pi.LIZ(int, java.util.List, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r9, java.util.List r10, java.util.List r11, X.InterfaceC1364105Vn r12) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1473205pi.LIZJ(int, java.util.List, java.util.List, X.05Vn):java.lang.Object");
    }
}
