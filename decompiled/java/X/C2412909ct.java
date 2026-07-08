package X;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: X.09ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2412909ct {
    public final Context LIZ;
    public Map<String, String> LIZIZ;

    public C2412909ct(Context context) {
        this.LIZ = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0WEF LIZ(java.lang.String r12) {
        /*
            r11 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.LIZIZ
            r2 = 0
            r10 = 0
            if (r0 != 0) goto L84
            android.content.Context r4 = r11.LIZ
            android.content.pm.PackageManager r3 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            if (r3 == 0) goto L7e
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r1.<init>(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r0 = r3.getServiceInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            if (r0 == 0) goto L7e
            android.os.Bundle r8 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a
            if (r8 == 0) goto L7e
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r9 = r0.iterator()
        L2e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r6 = r9.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r8.get(r6)     // Catch: java.lang.Exception -> L3f java.lang.OutOfMemoryError -> L44
            goto L49
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L48
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L48:
            r3 = r10
        L49:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L2e
            java.lang.String r0 = "backend:"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L2e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = ","
            r0 = -1
            java.lang.String[] r5 = r3.split(r1, r0)
            int r4 = r5.length
            r3 = 0
        L60:
            if (r3 >= r4) goto L2e
            r0 = r5[r3]
            java.lang.String r1 = r0.trim()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L77
            r0 = 8
            java.lang.String r0 = r6.substring(r0)
            r7.put(r1, r0)
        L77:
            int r3 = r3 + 1
            goto L60
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7e:
            java.util.Map r7 = java.util.Collections.emptyMap()
        L82:
            r11.LIZIZ = r7
        L84:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.LIZIZ
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L8f
            return r10
        L8f:
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb2 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lbc
            java.lang.Class<X.0WEF> r0 = X.C0WEF.class
            java.lang.Class r1 = r1.asSubclass(r0)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb2 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lbc
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb2 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lbc
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb2 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lbc
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb2 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lbc
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb2 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lbc
            X.0WEF r0 = (X.C0WEF) r0     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb2 java.lang.IllegalAccessException -> Lb7 java.lang.ClassNotFoundException -> Lbc
            return r0
        La8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r10
        Lad:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r10
        Lb2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r10
        Lb7:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r10
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2412909ct.LIZ(java.lang.String):X.0WEF");
    }
}
