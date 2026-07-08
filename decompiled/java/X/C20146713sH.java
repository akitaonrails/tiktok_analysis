package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13sH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20146713sH implements InterfaceC21252218Eu {
    public static final C20146713sH LL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public static final LinkedList<Activity> LLILLL;
    public static final WeakHashMap<Activity, Object> LLILZ;
    public static C589920NBu<Activity> LLILZIL;
    public static final WeakHashMap<Activity, Object> LLILZLL;
    public static final Object LLIZ;
    public static final WeakHashMap<InterfaceC20146913sJ, Object> LLIZLLLIL;
    public static Boolean LLJ;
    public static long LLJI;
    public static final LazyNonNull LLJIJIL;
    public static final Map<Long, Long> LLJILJIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C20146713sH.class, "foregroundTimestamp", "getForegroundTimestamp()J", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217371BqR};
        LL = new C20146713sH();
        LLILLL = new LinkedList<>();
        LLILZ = new WeakHashMap<>();
        LLILZLL = new WeakHashMap<>();
        LLIZ = new Object();
        LLIZLLLIL = new WeakHashMap<>();
        LLJIJIL = LazyKt.INSTANCE.lazyNonNull(new C084S());
        LLJILJIL = Collections.synchronizedMap(new LinkedHashMap<Long, Long>() { // from class: X.083x
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<Long, Long>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<Long, Long>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<Long> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Long> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Long> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Long> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof Long)) {
                    return false;
                }
                return containsKey((Long) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof Long)) {
                    return false;
                }
                return containsValue((Long) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long get(Object obj) {
                if (!(obj instanceof Long)) {
                    return null;
                }
                return get((Long) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long remove(Object obj) {
                if (!(obj instanceof Long)) {
                    return null;
                }
                return remove((Long) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<Long, Long> entry) {
                if (size() >= 200) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(Long l) {
                return super.containsKey((Object) l);
            }

            public /* bridge */ boolean containsValue(Long l) {
                return super.containsValue((Object) l);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof Long)) {
                    return null;
                }
                return get((Long) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof Long)) {
                    return null;
                }
                return remove((Long) obj);
            }

            public /* bridge */ Long get(Long l) {
                return (Long) super.get((Object) l);
            }

            public /* bridge */ Long remove(Long l) {
                return (Long) super.remove((Object) l);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof Long)) {
                    return obj2;
                }
                return getOrDefault((Long) obj, (Long) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
                    return false;
                }
                return remove((Long) obj, (Long) obj2);
            }

            public final /* bridge */ Long getOrDefault(Object obj, Long l) {
                if (!(obj instanceof Long)) {
                    return l;
                }
                return getOrDefault((Long) obj, l);
            }

            public /* bridge */ boolean remove(Long l, Long l2) {
                return super.remove((Object) l, (Object) l2);
            }

            public /* bridge */ Long getOrDefault(Long l, Long l2) {
                return (Long) super.getOrDefault((Object) l, l2);
            }
        });
    }

    @Override // X.InterfaceC21252218Eu
    public final synchronized Activity getTopActivity() {
        C589920NBu<Activity> c589920NBu;
        c589920NBu = LLILZIL;
        return c589920NBu != null ? c589920NBu.get() : null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC21252218Eu
    public final Set<Activity> LIZIZ() {
        return LLILZLL.keySet();
    }

    @Override // X.InterfaceC21252218Eu
    public final long LJJJJL() {
        return ((Number) LLJIJIL.getValue(this, LLILLJJLI[0])).longValue();
    }

    @Override // X.InterfaceC21252218Eu
    public final boolean isAppBackground() {
        Boolean bool = LLJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC21252218Eu
    public final void LJJJLZIJ(InterfaceC20146913sJ interfaceC20146913sJ) {
        if (interfaceC20146913sJ != null) {
            WeakHashMap<InterfaceC20146913sJ, Object> weakHashMap = LLIZLLLIL;
            if (!weakHashMap.containsKey(interfaceC20146913sJ)) {
                weakHashMap.put(interfaceC20146913sJ, LLIZ);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        LinkedList<Activity> linkedList = LLILLL;
        linkedList.remove(activity);
        linkedList.size();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        LLILZIL = null;
        LLILZLL.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        LLILZIL = new C589920NBu<>(activity);
        LLILZLL.put(activity, LLIZ);
        Boolean bool = LLJ;
        if (bool == null) {
            LLJ = Boolean.FALSE;
            LLJI = System.currentTimeMillis();
            Map<Long, Long> map = LLJILJIL;
            Map.Entry entryLIZLLL = C789730UyR.LIZLLL(map);
            if (entryLIZLLL != null) {
                map.put((Long) entryLIZLLL.getKey(), Long.valueOf(LLJI));
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return;
        }
        LLJ = Boolean.FALSE;
        LLJI = System.currentTimeMillis();
        Map<Long, Long> map2 = LLJILJIL;
        Map.Entry entryLIZLLL2 = C789730UyR.LIZLLL(map2);
        if (entryLIZLLL2 != null) {
            map2.put((Long) entryLIZLLL2.getKey(), Long.valueOf(LLJI));
        }
        WeakHashMap<InterfaceC20146913sJ, Object> weakHashMap = LLIZLLLIL;
        if (weakHashMap.isEmpty()) {
            return;
        }
        Iterator<InterfaceC20146913sJ> it2 = weakHashMap.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        WeakHashMap<Activity, Object> weakHashMap = LLILZ;
        weakHashMap.put(activity, LLIZ);
        if (weakHashMap.size() == 1) {
            LLJIJIL.setValue(this, LLILLJJLI[0], Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        WeakHashMap<Activity, Object> weakHashMap = LLILZ;
        weakHashMap.remove(activity);
        if (Intrinsics.LJFF(LLJ, Boolean.FALSE) && weakHashMap.isEmpty()) {
            LLJ = Boolean.TRUE;
            LLJILJIL.put(Long.valueOf(System.currentTimeMillis()), 0L);
            WeakHashMap<InterfaceC20146913sJ, Object> weakHashMap2 = LLIZLLLIL;
            if (!weakHashMap2.isEmpty()) {
                Iterator<InterfaceC20146913sJ> it2 = weakHashMap2.keySet().iterator();
                while (it2.hasNext()) {
                    it2.next().onAppBackground(activity);
                }
            }
        }
    }

    @Override // X.InterfaceC21252218Eu
    public final ConcurrentHashMap<Long, Long> LJJIJL(long j, long j2) {
        ConcurrentHashMap<Long, Long> concurrentHashMap = new ConcurrentHashMap<>();
        for (Map.Entry<Long, Long> entry : LLJILJIL.entrySet()) {
            if (entry.getKey().longValue() > j && entry.getKey().longValue() < j2 && entry.getValue().longValue() > 0) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        LinkedList<Activity> linkedList = LLILLL;
        linkedList.remove(activity);
        linkedList.add(activity);
        SystemClock.elapsedRealtime();
    }
}
