package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0cOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010170cOV {
    public static final C1010190cOX<InterfaceC1010530cP5<? extends Object>> LIZ = new AbstractC1001160c9y<KEY, WeakReference<KEY>>() { // from class: X.0cOX
        {
            C1010200cOY c1010200cOY = C1010200cOY.LL;
            new C1010180cOW();
        }
    };
    public static final C1010210cOZ<InterfaceC1010530cP5<? extends Object>> LIZIZ = new AbstractC1001160c9y<KEY, KEY>() { // from class: X.0cOZ
        {
            new C1010220cOa();
            new C1010230cOb();
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class[] LIZ(X.InterfaceC1010530cP5 r6) {
        /*
            X.0CmK r5 = new X.0CmK
            r0 = 2
            r5.<init>(r0)
            java.lang.Class r0 = r6.getClass()
            r5.LIZ(r0)
            java.lang.Class r0 = r6.getClass()
            java.lang.annotation.Annotation[] r4 = r0.getAnnotations()
            int r3 = r4.length
            r6 = 0
            r2 = 0
        L18:
            r1 = 0
            if (r2 >= r3) goto L24
            r1 = r4[r2]
            boolean r0 = r1 instanceof X.InterfaceC1003940cES
            if (r0 != 0) goto L24
            int r2 = r2 + 1
            goto L18
        L24:
            boolean r0 = r1 instanceof X.InterfaceC1003940cES
            if (r0 == 0) goto L54
            X.0cES r1 = (X.InterfaceC1003940cES) r1
            if (r1 == 0) goto L54
            java.lang.Class[] r0 = r1.service()
            X.13IQ[] r4 = X.C13LE.LIZIZ(r0)
            if (r4 == 0) goto L54
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r4.length
            r3.<init>(r0)
            int r2 = r4.length
            r1 = 0
        L3e:
            if (r1 >= r2) goto L4c
            r0 = r4[r1]
            java.lang.Class r0 = X.C09R7.LIZ(r0)
            r3.add(r0)
            int r1 = r1 + 1
            goto L3e
        L4c:
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Object[] r0 = r3.toArray(r0)
            if (r0 != 0) goto L56
        L54:
            java.lang.Class[] r0 = new java.lang.Class[r6]
        L56:
            r5.LIZIZ(r0)
            int r0 = r5.LIZJ()
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Object[] r0 = r5.LIZLLL(r0)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1010170cOV.LIZ(X.0cP5):java.lang.Class[]");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final <T extends InterfaceC1010530cP5<? extends Object>> T LIZIZ(Class<? extends T> cls) {
        Object objInvoke;
        Object objInvoke2;
        C1010190cOX<InterfaceC1010530cP5<? extends Object>> c1010190cOX = LIZ;
        Object obj = ((LinkedHashMap) c1010190cOX.LIZJ).get(cls);
        Object obj2 = null;
        if (obj == null || (objInvoke = c1010190cOX.LIZIZ.invoke((STORE_TYPE) obj)) == null) {
            objInvoke = null;
        }
        T t = (T) objInvoke;
        if (t == null) {
            C1010210cOZ<InterfaceC1010530cP5<? extends Object>> c1010210cOZ = LIZIZ;
            Object obj3 = ((LinkedHashMap) c1010210cOZ.LIZJ).get(cls);
            if (obj3 != null && (objInvoke2 = c1010210cOZ.LIZIZ.invoke((STORE_TYPE) obj3)) != null) {
                obj2 = objInvoke2;
            }
            return (T) obj2;
        }
        return t;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void LIZJ(InterfaceC1010530cP5<? extends Object> interfaceC1010530cP5) {
        for (Class cls : LIZ(interfaceC1010530cP5)) {
            C1010190cOX<InterfaceC1010530cP5<? extends Object>> c1010190cOX = LIZ;
            c1010190cOX.LIZJ.put((Class<? extends KEY>) cls, (STORE_TYPE) c1010190cOX.LIZ.invoke((KEY) interfaceC1010530cP5));
        }
    }
}
