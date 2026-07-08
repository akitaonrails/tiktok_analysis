package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356320lOo {
    public static boolean LIZ(int i) {
        return C1357700lR2.LJI.getValue().contains(Integer.valueOf(i));
    }

    public static void LIZLLL(Context context) {
        float f;
        C20593115i5.LIZ.getClass();
        if (C20593115i5.LJIILIIL()) {
            return;
        }
        C20595015iO.LIZ.getClass();
        if (C20595015iO.LIZIZ(context) || C20595015iO.LJ() || !C1357700lR2.LJII.compareAndSet(false, true)) {
            return;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f2 = displayMetrics.density;
            int i3 = displayMetrics.densityDpi;
            C1356330lOp c1356330lOp = C1356330lOp.LIZ;
            c1356330lOp.getClass();
            int i4 = C1356330lOp.LIZ().thresholdWidthDp;
            float f3 = 0.0f;
            if (i > 0 && i3 > 0) {
                f = (i * 160.0f) / i3;
                if (f > 0.0f) {
                    f3 = i4 / f;
                }
            } else {
                f = 0.0f;
            }
            c1356330lOp.getClass();
            boolean z = C1356330lOp.LIZ().enabled;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportDeviceInfoOnce: widthPx=");
            sbLIZ.append(i);
            sbLIZ.append(", heightPx=");
            sbLIZ.append(i2);
            sbLIZ.append(", density=");
            sbLIZ.append(f2);
            sbLIZ.append(", densityDpi=");
            sbLIZ.append(i3);
            sbLIZ.append(", thresholdWidthDp=");
            sbLIZ.append(i4);
            sbLIZ.append(", actualWidthDp=");
            sbLIZ.append(f);
            sbLIZ.append(", biasScale=");
            sbLIZ.append(f3);
            sbLIZ.append(", isHitExperiment=");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            C1350920lG6.LJIJ(i, i2, f2, i3, i4, f, f3, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1344030l4z.LIZIZ("CommentDensityContextWrapper", "reportDeviceInfoOnce failed", th);
        }
    }

    public static Context LJFF(Context context) {
        Context contextLIZ;
        int i;
        Activity activityLIZ;
        if (context instanceof C1357700lR2) {
            return context;
        }
        C20593115i5.LIZ.getClass();
        if (C20593115i5.LJIILIIL()) {
            return context;
        }
        C20595015iO.LIZ.getClass();
        if (C20595015iO.LIZIZ(context) || C20595015iO.LJ()) {
            return context;
        }
        WeakHashMap<Context, WeakReference<C1357700lR2>> weakHashMap = C1357700lR2.LJIIIZ;
        synchronized (weakHashMap) {
            try {
                WeakReference<C1357700lR2> weakReference = weakHashMap.get(context);
                if (weakReference != null) {
                    C1357700lR2 c1357700lR2 = weakReference.get();
                    if (c1357700lR2 == null) {
                        weakHashMap.remove(context);
                    }
                    if (c1357700lR2 != null) {
                        return c1357700lR2;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1356330lOp c1356330lOp = C1356330lOp.LIZ;
        c1356330lOp.getClass();
        if (C1356330lOp.LIZ().enabled && C1356330lOp.LIZ().skipInMultiWindow && (i = Build.VERSION.SDK_INT) >= 24 && (activityLIZ = C1388190mED.LIZ(context)) != null && (activityLIZ.isInMultiWindowMode() || (i >= 26 && activityLIZ.isInPictureInPictureMode()))) {
            return context;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int i2 = displayMetrics.densityDpi;
        int i3 = displayMetrics.widthPixels;
        if (i3 > 0 && i2 > 0 && f > 0.0f) {
            float f2 = i3;
            float f3 = f2 / f;
            c1356330lOp.getClass();
            float f4 = i2;
            float f5 = C1356330lOp.LIZ().thresholdWidthDp;
            float f6 = f5 / ((f2 * 160.0f) / f4);
            if (f3 < f5 || (C1356330lOp.LIZ().enabled && C1356330lOp.LIZ().supportUiScaleUp)) {
                if ((f3 < f5 && (!C1356330lOp.LIZ().enabled || !C1356330lOp.LIZ().supportUiScaleDown)) || Math.abs(f6 - 1.0f) <= C1356330lOp.LIZ().biasScaleIgnoreThreshold) {
                    return context;
                }
                float f7 = C1356330lOp.LIZ().biasScaleMaxBias;
                float fLIZLLL = C13LZ.LIZLLL(f6, 1.0f - f7, f7 + 1.0f);
                if (C1357700lR2.LJIIIIZZ.compareAndSet(false, true)) {
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ().registerComponentCallbacks(new ComponentCallbacks() { // from class: X.0lOq
                        @Override // android.content.ComponentCallbacks
                        @InterfaceC1294060jmO
                        public final void onLowMemory() {
                        }

                        @Override // android.content.ComponentCallbacks
                        public final void onConfigurationChanged(Configuration configuration) {
                            C844470XAv.LIZ.getClass();
                            C844470XAv.LIZ().getResources().getDisplayMetrics();
                            if (configuration.fontScale > 0.0f) {
                                C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
                            }
                            C01GW<Map<String, Integer>> c01gw2 = C1357700lR2.LJFF;
                        }
                    });
                }
                int iLIZIZ = C814420VxA.LIZIZ(((((f5 / fLIZLLL) * f4) / 160.0f) / C1356330lOp.LIZ().designWidthDp) * 160);
                Configuration configuration = context.getResources().getConfiguration();
                float f8 = iLIZIZ / f4;
                Configuration configuration2 = new Configuration(configuration);
                configuration2.densityDpi = iLIZIZ;
                int i4 = configuration.screenWidthDp;
                if (i4 > 0) {
                    configuration2.screenWidthDp = C814420VxA.LIZIZ(i4 / f8);
                }
                int i5 = configuration.screenHeightDp;
                if (i5 > 0) {
                    configuration2.screenHeightDp = C814420VxA.LIZIZ(i5 / f8);
                }
                int i6 = configuration.smallestScreenWidthDp;
                if (i6 > 0) {
                    configuration2.smallestScreenWidthDp = C814420VxA.LIZIZ(i6 / f8);
                }
                Context contextCreateConfigurationContext = context.createConfigurationContext(configuration2);
                if (!C1356330lOp.LIZ().enabled || !C1356330lOp.LIZ().unwrapBaseToActivity || (contextLIZ = C1388190mED.LIZ(context)) == null) {
                    contextLIZ = context;
                }
                C1357700lR2 c1357700lR22 = new C1357700lR2(contextLIZ, context, context, contextCreateConfigurationContext.getResources());
                LIZJ(context, c1357700lR22);
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    try {
                        ViewConfiguration.get(c1357700lR22);
                        return c1357700lR22;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1344030l4z.LIZIZ("CommentDensityContextWrapper", "seedViewConfigurationCache failed", th2);
                    }
                }
                return c1357700lR22;
            }
            return context;
        }
        return context;
    }

    public static List LIZIZ(Context context, List list) {
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        LIZLLL(context);
        C1356330lOp.LIZ.getClass();
        if (!C1356330lOp.LIZ().enabled) {
            return Collections.singletonList(new Pair(context, list));
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            boolean zLIZ = LIZ(iIntValue);
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (zLIZ) {
                arrayList.add(numValueOf);
            } else {
                arrayList2.add(numValueOf);
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.singletonList(new Pair(context, arrayList2));
        }
        if (arrayList2.isEmpty()) {
            return Collections.singletonList(new Pair(LJFF(context), arrayList));
        }
        return C1697810uHb.LJIIJJI(new Pair(context, arrayList2), new Pair(LJFF(context), arrayList));
    }

    public static void LIZJ(Context context, C1357700lR2 c1357700lR2) {
        WeakHashMap<Context, WeakReference<C1357700lR2>> weakHashMap = C1357700lR2.LJIIIZ;
        synchronized (weakHashMap) {
            try {
                weakHashMap.put(context, new WeakReference<>(c1357700lR2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Context LJ(int i, Context context) {
        LIZLLL(context);
        C1356330lOp.LIZ.getClass();
        if (!C1356330lOp.LIZ().enabled || !LIZ(i)) {
            return context;
        }
        return LJFF(context);
    }
}
