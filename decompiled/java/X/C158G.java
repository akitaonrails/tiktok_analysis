package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostWidgetWindowLayoutCacheExpireSecondSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.158G, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158G implements Application.ActivityLifecycleCallbacks {
    public static WeakReference<Activity> LLILLL;
    public static final Map<String, Integer> LLILZIL;
    public static final Map<View, Runnable> LLILZLL;
    public static final Map<String, LinkedList<C158I<View, Long>>> LLIZ;
    public static final Map<String, C158H<Integer, Integer, Integer>> LLIZLLLIL;
    public static final C158F LLJ;
    public static boolean LLJI;
    public static final Map<Integer, List<Integer>> LLJIJIL;
    public static final C158G LL = new C158G();
    public static final C01GW LLILLJJLI = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(161));
    public static final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.158F] */
    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LLILZIL = linkedHashMap;
        LLILZLL = new LinkedHashMap();
        LLIZ = new LinkedHashMap();
        LLIZLLLIL = new LinkedHashMap();
        LLJ = new Runnable() { // from class: X.158F
            /* JADX WARN: Multi-variable type inference failed */
            public final void LIZ() {
                if (C158G.LLJI) {
                    C158G c158g = C158G.LL;
                    int i = 0;
                    for (Map.Entry entry : ((LinkedHashMap) C158G.LLIZ).entrySet()) {
                        entry.getKey();
                        LinkedList linkedList = (LinkedList) entry.getValue();
                        while (true) {
                            C158I c158i = (C158I) linkedList.peekFirst();
                            if (c158i == null || ((Number) c158i.LIZIZ).longValue() > C158B.LIZ()) {
                                break;
                            } else {
                                linkedList.pollFirst();
                            }
                        }
                        if (linkedList.size() > 0) {
                            i++;
                        }
                    }
                    if (i <= 0) {
                        ((LinkedHashMap) C158G.LLIZ).clear();
                        if (C158G.LLJI) {
                            C158G.LLJI = false;
                            C158G.LLILZ.removeCallbacks(C158G.LLJ);
                        }
                    }
                    C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C158G.LLILZ, this);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CoHostLayoutCacheHelper@7ec3.checkExpireRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CoHostLayoutCacheHelper@7ec3.checkExpireRunnable$1");
            }
        };
        linkedHashMap.put("CoHostWindowViewLayout", 4);
        LLJIJIL = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        Activity activity;
        Application application;
        Map<String, C158H<Integer, Integer, Integer>> map = LLIZLLLIL;
        if (!map.isEmpty()) {
            boolean z = new SecureRandom().nextInt(LSPassThroughRecordSizeConfig.DEFAULT) <= 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                C158H c158h = (C158H) entry.getValue();
                if (((Number) c158h.LIZIZ).intValue() > 0) {
                    float fFloatValue = (((Number) c158h.LIZ).floatValue() * 1.0f) / ((Number) c158h.LIZIZ).floatValue();
                    Object objValueOf = ((Number) c158h.LIZ).intValue() == 0 ? 1 : Float.valueOf((((Number) c158h.LIZJ).floatValue() * 1.0f) / ((Number) c158h.LIZ).floatValue());
                    if (z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("_hit_count");
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(((Number) c158h.LIZ).intValue()));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append("_cache_count");
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), String.valueOf(((Number) c158h.LIZIZ).intValue()));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str);
                        sbLIZ3.append("_hit_rate");
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), String.valueOf(fFloatValue));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(str);
                        sbLIZ4.append("_miss_count");
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ4), String.valueOf(((Number) c158h.LIZJ).intValue()));
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(str);
                        sbLIZ5.append("_miss_hit_rate");
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ5), objValueOf.toString());
                    }
                    if (C958370b2x.LIZJ()) {
                        new DecimalFormat("0.00%");
                    }
                }
            }
            if (z && !linkedHashMap.isEmpty()) {
                C955610ayV c955610ayV = new C955610ayV();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, (String) entry2.getKey(), entry2.getValue(), true);
                }
                c955610ayV.LJIJJLI("cache_layout_hit_rate");
            }
        }
        if (LLJI) {
            LLJI = false;
            LLILZ.removeCallbacks(LLJ);
        }
        LLILZ.removeCallbacksAndMessages(null);
        ((LinkedHashMap) LLILZLL).clear();
        ((LinkedHashMap) LLIZ).clear();
        ((LinkedHashMap) LLIZLLLIL).clear();
        WeakReference<Activity> weakReference = LLILLL;
        if (weakReference != null && (activity = weakReference.get()) != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        LLILLL = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v46, types: [F, java.lang.Integer] */
    public static View LIZJ(Context context, String str) {
        C19EG c19egLIZ;
        if (((Boolean) LLILLJJLI.getValue()).booleanValue() && context != null && (c19egLIZ = C1124140fMK.LIZ(context)) != null) {
            int size = 0;
            if (!c19egLIZ.isDestroyed() && !c19egLIZ.isFinishing()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('@');
                sbLIZ.append(c19egLIZ.hashCode());
                sbLIZ.append('@');
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                LinkedList linkedList = (LinkedList) ((LinkedHashMap) LLIZ).get(strLIZIZ);
                if (linkedList != null) {
                    C158I c158i = (C158I) linkedList.pollFirst();
                    while (c158i != null) {
                        if (((Number) c158i.LIZIZ).longValue() > C158B.LIZ() && ((View) c158i.LIZ).getParent() == null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getViewFromCache ");
                            sbLIZ2.append(str);
                            sbLIZ2.append(", return ");
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append('@');
                            sbLIZ2.append(c158i.LIZ.hashCode());
                            sbLIZ2.append(", leftSize is ");
                            LinkedList linkedList2 = (LinkedList) ((LinkedHashMap) LLIZ).get(strLIZIZ);
                            if (linkedList2 != null) {
                                size = linkedList2.size();
                            }
                            sbLIZ2.append(size);
                            Logger.i("CoHostLayoutCacheHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            C158H c158h = (C158H) ((LinkedHashMap) LLIZLLLIL).get(str);
                            if (c158h != null) {
                                c158h.LIZ = Integer.valueOf(((Number) c158h.LIZ).intValue() + 1);
                            }
                            F f = c158i.LIZ;
                            if (!(f instanceof View)) {
                                return null;
                            }
                            return (View) f;
                        }
                        LinkedList linkedList3 = (LinkedList) ((LinkedHashMap) LLIZ).get(strLIZIZ);
                        if (linkedList3 == null) {
                            break;
                        }
                        c158i = (C158I) linkedList3.pollFirst();
                    }
                }
                Map<String, C158H<Integer, Integer, Integer>> map = LLIZLLLIL;
                C158H<Integer, Integer, Integer> c158h2 = (C158H) ((LinkedHashMap) map).get(str);
                if (c158h2 == null) {
                    c158h2 = new C158H<>(0, 0, 0);
                }
                map.put(str, c158h2);
                c158h2.LIZJ = Integer.valueOf(c158h2.LIZJ.intValue() + 1);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [S, java.lang.Integer] */
    public static void LIZLLL(Context context, final String str, final View view, long j, long j2, int i) {
        final C19EG c19egLIZ;
        int iIntValue;
        long j3 = j2;
        final long expireSecond = j;
        C158G c158g = LL;
        if ((i & 8) != 0) {
            expireSecond = CoHostWidgetWindowLayoutCacheExpireSecondSetting.INSTANCE.getExpireSecond();
        }
        if ((i & 16) != 0) {
            j3 = 0;
        }
        if (((Boolean) LLILLJJLI.getValue()).booleanValue() && view != null) {
            Activity activity = null;
            if (context != null && (c19egLIZ = C1124140fMK.LIZ(context)) != null && !c19egLIZ.isDestroyed() && !c19egLIZ.isFinishing()) {
                WeakReference<Activity> weakReference = LLILLL;
                if (weakReference != null) {
                    activity = weakReference.get();
                }
                if (!Intrinsics.LJFF(activity, c19egLIZ)) {
                    if (activity != null) {
                        c158g.LIZ();
                        Application application = activity.getApplication();
                        if (application != null) {
                            application.unregisterActivityLifecycleCallbacks(c158g);
                        }
                    }
                    Application application2 = c19egLIZ.getApplication();
                    if (application2 != null) {
                        application2.registerActivityLifecycleCallbacks(c158g);
                    }
                    LLILLL = new WeakReference<>(c19egLIZ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('@');
                sbLIZ.append(c19egLIZ.hashCode());
                sbLIZ.append('@');
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (j3 > 0) {
                    Runnable runnable = new Runnable() { // from class: X.0bBc
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CoHostLayoutCacheHelper@7ec3.recycle$task$1");
                            try {
                                if (!view.isAttachedToWindow()) {
                                    C930540aK4.LJJIJL(view);
                                    C158G c158g2 = C158G.LL;
                                    C158G.LIZLLL(c19egLIZ, str, view, expireSecond, 0L, 16);
                                }
                                C158G.LLILZLL.remove(view);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CoHostLayoutCacheHelper@7ec3.recycle$task$1");
                        }
                    };
                    C786410Ut5.LJLIIL(j3 * ((long) LSPassThroughRecordSizeConfig.DEFAULT), LLILZ, runnable);
                    LLILZLL.put(view, runnable);
                    return;
                }
                Map<String, LinkedList<C158I<View, Long>>> map = LLIZ;
                LinkedList<C158I<View, Long>> linkedList = (LinkedList) ((LinkedHashMap) map).get(strLIZIZ);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
                map.put(strLIZIZ, linkedList);
                for (C158I<View, Long> c158iPeekFirst = linkedList.peekFirst(); c158iPeekFirst != null && c158iPeekFirst.LIZIZ.longValue() <= C158B.LIZ(); c158iPeekFirst = linkedList.peekFirst()) {
                    linkedList.pollFirst();
                }
                int size = linkedList.size();
                Integer num = (Integer) ((LinkedHashMap) LLILZIL).get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                if (size >= iIntValue) {
                    return;
                }
                linkedList.offer(new C158I<>(view, Long.valueOf(C158B.LIZ() + (expireSecond * ((long) LSPassThroughRecordSizeConfig.DEFAULT)))));
                Map<String, C158H<Integer, Integer, Integer>> map2 = LLIZLLLIL;
                C158H<Integer, Integer, Integer> c158h = (C158H) ((LinkedHashMap) map2).get(str);
                if (c158h == null) {
                    c158h = new C158H<>(0, 0, 0);
                }
                map2.put(str, c158h);
                c158h.LIZIZ = Integer.valueOf(c158h.LIZIZ.intValue() + 1);
                if (LLJI) {
                    return;
                }
                LLJI = true;
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, LLILZ, LLJ);
            }
        }
    }
}
