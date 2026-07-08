package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0LmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC553040LmY implements InterfaceC548750Lfd {

    @C040H
    public transient Map<String, C553050LmZ> accessorCache;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    @Override // X.InterfaceC548750Lfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T getValue(X.InterfaceC548900Lfs<T> r9) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, X.0LmZ> r4 = r8.accessorCache
            r7 = 0
            if (r4 != 0) goto L87
            java.lang.Class r0 = r8.getClass()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.reflect.Field[] r6 = r0.getDeclaredFields()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r3 = r6.length
            r2 = 0
        L19:
            if (r2 >= r3) goto L2b
            r1 = r6[r2]
            java.lang.Class<X.0LmW> r0 = X.InterfaceC553020LmW.class
            boolean r0 = r1.isAnnotationPresent(r0)
            if (r0 == 0) goto L28
            r5.add(r1)
        L28:
            int r2 = r2 + 1
            goto L19
        L2b:
            java.util.Iterator r5 = r5.iterator()
        L2f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r3 = r5.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class<X.0LmW> r0 = X.InterfaceC553020LmW.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            X.0LmW r0 = (X.InterfaceC553020LmW) r0
            r2 = 1
            if (r0 == 0) goto L83
            java.lang.String r1 = r0.name()
            if (r1 == 0) goto L83
            int r0 = r1.length()
            if (r0 <= 0) goto L81
            r0 = 1
        L53:
            if (r0 == 0) goto L83
        L55:
            java.lang.Class<X.09CT> r0 = X.C09CT.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            X.09CT r0 = (X.C09CT) r0
            if (r0 == 0) goto L7f
            java.lang.String r0 = r0.value()
        L63:
            if (r1 != 0) goto L6b
            if (r0 != 0) goto L7d
            java.lang.String r1 = r3.getName()
        L6b:
            boolean r0 = r4.containsKey(r1)
            if (r0 != 0) goto L2f
            r3.setAccessible(r2)
            X.0LmZ r0 = new X.0LmZ
            r0.<init>(r3)
            r4.put(r1, r0)
            goto L2f
        L7d:
            r1 = r0
            goto L6b
        L7f:
            r0 = r7
            goto L63
        L81:
            r0 = 0
            goto L53
        L83:
            r1 = r7
            goto L55
        L85:
            r8.accessorCache = r4
        L87:
            java.lang.String r0 = r9.getName()
            java.lang.Object r0 = r4.get(r0)
            X.0LmZ r0 = (X.C553050LmZ) r0
            if (r0 == 0) goto L9e
            java.lang.reflect.Field r0 = r0.LIZ     // Catch: java.lang.Exception -> L9a
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Exception -> L9a
            goto L9f
        L9a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9e:
            r0 = r7
        L9f:
            if (r0 == 0) goto La2
            return r0
        La2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC553040LmY.getValue(X.0Lfs):java.lang.Object");
    }
}
