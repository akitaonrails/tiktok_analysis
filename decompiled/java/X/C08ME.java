package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveThreadOptSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.08ME, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ME {
    public static final Set<String> LIZ;
    public static final Object LIZIZ;
    public static boolean LIZJ;

    static {
        HashSet hashSet = new HashSet();
        LIZ = hashSet;
        try {
            List<String> targetThreadNamePrefix = LiveThreadOptSetting.INSTANCE.getTargetThreadNamePrefix();
            if (targetThreadNamePrefix == null || targetThreadNamePrefix.isEmpty()) {
                hashSet.add("LivePerformance");
                hashSet.add("TTM");
                hashSet.add("pty-");
                hashSet.add("NetNormal");
                hashSet.add("CAITTMStrategy");
                hashSet.add("Jit");
            } else {
                for (String str : targetThreadNamePrefix) {
                    if (str != null && !str.trim().isEmpty()) {
                        ((HashSet) LIZ).add(str);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            Thread.class.getDeclaredField("nativePeer").setAccessible(true);
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            LIZIZ = declaredField.get(null);
            cls.getDeclaredMethod("getInt", Long.TYPE).setAccessible(true);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        LIZJ = false;
    }

    public static List<Integer> LIZ() {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it2 = C08MA.LIZ(LIZ).iterator();
            while (it2.hasNext()) {
                int i = ((C08MB) it2.next()).LIZIZ;
                if (i > 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[PHI: r0
      0x0030: PHI (r0v7 int) = (r0v6 int), (r0v13 int) binds: [B:16:0x002a, B:18:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r4) {
        /*
            boolean r0 = com.bytedance.common.jato.JatoXL.isInited()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.List r1 = LIZ()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L14
            return
        L14:
            r0 = 1
            X.C08ME.LIZJ = r0
            r3 = 3
            com.bytedance.android.livesdk.livesetting.performance.LiveThreadOptSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveThreadOptSetting.INSTANCE     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.getSlowDownOps()     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 3
        L24:
            r3 = r3 & r0
            if (r3 != 0) goto L28
            return
        L28:
            r0 = -20
            if (r4 < r0) goto L30
            r0 = 19
            if (r4 <= r0) goto L31
        L30:
            r4 = r0
        L31:
            java.util.Iterator r2 = r1.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            r0 = r3 & 1
            if (r0 == 0) goto L4c
            com.bytedance.common.jato.JatoXL.setPriority(r1, r4)
        L4c:
            r0 = r3 & 2
            if (r0 == 0) goto L35
            com.bytedance.common.jato.boost.CpusetManager.bindLittleCore(r1)
            goto L35
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08ME.LIZIZ(int):void");
    }
}
