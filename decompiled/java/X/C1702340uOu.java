package X;

import Y.ARunnableS100S0000000_26;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.io.PrintStream;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702340uOu {
    public static void LIZ(Application application) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_fix_bundle_too_large", true, false)) {
            return;
        }
        C1701250uN9 c1701250uN9 = C1701250uN9.LIZ;
        Function1<C1702360uOw, Unit> function1 = new Function1<C1702360uOw, Unit>() { // from class: X.0uOv
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C1702360uOw c1702360uOw) {
                C1702360uOw c1702360uOw2 = c1702360uOw;
                c1702360uOw2.LIZIZ = 512000;
                c1702360uOw2.LIZ = C786410Ut5.h4();
                c1702360uOw2.LIZJ = new Function0<Boolean>() { // from class: X.0Mwu
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(C2214201BlK.LJIIJJI);
                    }
                };
                C1252704vF.LIZIZ.isInitialized().set(true);
                return null;
            }
        };
        c1701250uN9.getClass();
        C1702360uOw c1702360uOw = new C1702360uOw(null);
        function1.invoke(c1702360uOw);
        C1701250uN9.LJII = c1702360uOw.LIZ;
        C1701250uN9.LJIIIZ = c1702360uOw.LIZIZ;
        C1701250uN9.LJIIJ = c1702360uOw.LIZJ;
        application.registerActivityLifecycleCallbacks(new C20688088o() { // from class: X.0uNB
            @Override // X.C20688088o, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                C1701250uN9.LIZ.getClass();
                if (!((WeakHashMap) C1701250uN9.LJ).containsKey(activity)) {
                    WeakHashMap weakHashMap = (WeakHashMap) C1701250uN9.LIZJ;
                    if (weakHashMap.containsKey(activity)) {
                        String str = (String) weakHashMap.get(activity);
                        C19719512Dh.LIZJ(C1701250uN9.LIZIZ).remove(str);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("LargeTransaction, remove memory cache uuid: ");
                        sbLIZ.append(str);
                        C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                ExecutorService executorService = C1701250uN9.LJII;
                if (executorService == null) {
                    executorService = null;
                }
                executorService.execute(new ARunnableS100S0000000_26(16));
                PrintStream printStream = System.err;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onActivityDestroyed clear bundle cache and disk finished---->");
                sbLIZ2.append(activity.toString());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
                boolean z;
                Bundle bundle2;
                C1701250uN9.LIZ.getClass();
                String str = (String) ((WeakHashMap) C1701250uN9.LIZJ).get(activity);
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && (bundle2 = (Bundle) ((ConcurrentHashMap) C1701250uN9.LIZIZ).get(str)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LargeTransaction, ");
                    sbLIZ.append(activity.getClass().getSimpleName());
                    sbLIZ.append(" storeActivityIntent store uuid: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", bundle size ");
                    sbLIZ.append(C838400Wuk.LIZIZ(bundle2));
                    C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C1701250uN9.LIZJ(str, bundle2, false, null);
                }
                if (bundle != null && C838400Wuk.LIZIZ(bundle) >= C1701250uN9.LJIIIZ) {
                    String string = UUID.randomUUID().toString();
                    Bundle bundle3 = new Bundle(bundle);
                    ((ConcurrentHashMap) C1701250uN9.LIZIZ).put(string, bundle3);
                    ((WeakHashMap) C1701250uN9.LIZLLL).put(activity, string);
                    bundle.clear();
                    C786410Ut5.LJJJI("bytedance_tiktok_infra_save_state_bundle_uuid", string, bundle);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LargeTransaction, ");
                    sbLIZ2.append(activity.getClass().getSimpleName());
                    sbLIZ2.append(" storeActivityIntent store state uuid: ");
                    sbLIZ2.append(string);
                    sbLIZ2.append(", bundle size ");
                    sbLIZ2.append(C838400Wuk.LIZIZ(bundle3));
                    C786840Utm.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    C1701250uN9.LIZJ(string, bundle3, false, null);
                }
                ((WeakHashMap) C1701250uN9.LJ).put(activity, Boolean.TRUE);
                PrintStream printStream = System.err;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onActivityPostSaveInstanceState store finished---->");
                sbLIZ3.append(activity.toString());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ3));
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[PHI: r0
              0x006c: PHI (r0v13 android.os.Bundle) = (r0v12 android.os.Bundle), (r0v20 android.os.Bundle) binds: [B:13:0x003e, B:17:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onActivityPreCreated(android.app.Activity r5, android.os.Bundle r6) {
                /*
                    r4 = this;
                    X.0uN9 r0 = X.C1701250uN9.LIZ
                    r0.getClass()
                    if (r6 == 0) goto L72
                    java.lang.String r0 = "bytedance_tiktok_infra_save_state_bundle_uuid"
                    java.lang.String r3 = r6.getString(r0)     // Catch: java.lang.Throwable -> L11
                    r2 = 0
                    if (r3 == 0) goto L72
                    goto L1b
                L11:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                    java.lang.String r0 = "BundleTooLargeFixer restoreActivitySavedInstanceState"
                    X.C1AF0.LJFF(r1, r0)
                    goto L72
                L1b:
                    int r0 = r3.length()
                    if (r0 == 0) goto L72
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "LargeTransaction, restore state uuid: "
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C786840Utm.LIZ(r0)
                    java.util.Map<java.lang.String, android.os.Bundle> r0 = X.C1701250uN9.LIZIZ
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    java.lang.Object r0 = r0.get(r3)
                    android.os.Bundle r0 = (android.os.Bundle) r0
                    if (r0 != 0) goto L6c
                    X.0uN5 r0 = X.C1701250uN9.LJFF
                    X.01GW r0 = r0.LIZ
                    java.lang.Object r1 = r0.getValue()
                    com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
                    byte[] r0 = new byte[r2]
                    byte[] r2 = r1.getBytesJustDisk(r3, r0)
                    int r0 = r2.length
                    if (r0 == 0) goto L72
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "LargeTransaction, restore from disk state uuid: "
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C786840Utm.LIZ(r0)
                    android.os.Bundle r0 = X.C838400Wuk.LIZ(r2)
                    if (r0 == 0) goto L72
                L6c:
                    r6.clear()
                    X.C786410Ut5.LJJIIJZLJL(r6, r0)
                L72:
                    java.io.PrintStream r2 = java.lang.System.err
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "onActivityPreCreated restore finished---->"
                    r1.append(r0)
                    java.lang.String r0 = r5.toString()
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    r2.println(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1701270uNB.onActivityPreCreated(android.app.Activity, android.os.Bundle):void");
            }
        });
    }
}
