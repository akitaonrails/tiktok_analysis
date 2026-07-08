package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.pumbaa.common.business.pl.CrossStackPageStack;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813160Vv8 {
    public static String LIZ;
    public static C796440VMc<String> LIZIZ;
    public static String LIZLLL;
    public static Integer LJ;
    public static final C796440VMc<Integer> LIZJ = new C796440VMc<>(3, null, null, 6, null);
    public static final Map<Integer, String> LJFF = Collections.synchronizedMap(new LinkedHashMap<Integer, String>() { // from class: X.083z
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Integer, String>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Integer, String>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Integer> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<String> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Integer> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<String> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return containsKey((Integer) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsValue((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof Integer)) {
                return null;
            }
            return get((Integer) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof Integer)) {
                return null;
            }
            return remove((Integer) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Integer, String> entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(Integer num) {
            return super.containsKey((Object) num);
        }

        public /* bridge */ boolean containsValue(String str) {
            return super.containsValue((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ String get(Object obj) {
            if (!(obj instanceof Integer)) {
                return null;
            }
            return get((Integer) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ String remove(Object obj) {
            if (!(obj instanceof Integer)) {
                return null;
            }
            return remove((Integer) obj);
        }

        public /* bridge */ String get(Integer num) {
            return (String) super.get((Object) num);
        }

        public /* bridge */ String remove(Integer num) {
            return (String) super.remove((Object) num);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof Integer)) {
                return obj2;
            }
            return getOrDefault((Integer) obj, (String) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof Integer) || !(obj2 instanceof String)) {
                return false;
            }
            return remove((Integer) obj, (String) obj2);
        }

        public final /* bridge */ String getOrDefault(Object obj, String str) {
            if (!(obj instanceof Integer)) {
                return str;
            }
            return getOrDefault((Integer) obj, str);
        }

        public /* bridge */ boolean remove(Integer num, String str) {
            return super.remove((Object) num, (Object) str);
        }

        public /* bridge */ String getOrDefault(Integer num, String str) {
            return (String) super.getOrDefault((Object) num, str);
        }
    });

    public static void LIZIZ() {
        if (C825320WZe.LJ()) {
            LIZIZ = new C796440VMc<>(3, null, null, 6, null);
            C822890WPv c822890WPv = C822890WPv.LIZ;
            C813180VvA.LIZJ.add(new AbstractC813200VvC() { // from class: X.0VYU
                @Override // X.AbstractC813200VvC
                public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    super.onFragmentDestroyed(fragmentManager, fragment);
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ(fragment);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                        ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0r = viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILZLL;
                        if (viewOnAttachStateChangeListenerC790870V0r != null) {
                            C19719512Dh.LIZ(viewOnAttachStateChangeListenerC790870V0r.LLILZIL).remove(viewOnAttachStateChangeListenerC790870V0rLIZIZ);
                        }
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LIZ(false);
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILZLL = null;
                    }
                    ((ConcurrentHashMap) ViewOnAttachStateChangeListenerC790870V0r.LLIZ).remove(Integer.valueOf(fragment.hashCode()));
                }

                @Override // X.AbstractC813200VvC
                public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                    super.onFragmentDetached(fragmentManager, fragment);
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ(fragment);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                        ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0r = viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILZLL;
                        if (viewOnAttachStateChangeListenerC790870V0r != null) {
                            C19719512Dh.LIZ(viewOnAttachStateChangeListenerC790870V0r.LLILZIL).remove(viewOnAttachStateChangeListenerC790870V0rLIZIZ);
                        }
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LIZ(false);
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILZLL = null;
                    }
                    ((ConcurrentHashMap) ViewOnAttachStateChangeListenerC790870V0r.LLIZ).remove(Integer.valueOf(fragment.hashCode()));
                }

                @Override // X.AbstractC813200VvC
                public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                    super.onFragmentPaused(fragmentManager, fragment);
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ(fragment);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILLL = false;
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LIZ(false);
                    }
                }

                @Override // X.AbstractC813200VvC
                public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                    super.onFragmentResumed(fragmentManager, fragment);
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ(fragment);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILLL = true;
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LIZ(true);
                    }
                }

                @Override // X.AbstractC813200VvC
                public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
                    super.onFragmentStarted(fragmentManager, fragment);
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ(fragment);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILLL = true;
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LIZ(true);
                    }
                }

                @Override // X.AbstractC813200VvC
                public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
                    super.onFragmentStopped(fragmentManager, fragment);
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ(fragment);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILLL = false;
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LIZ(false);
                    }
                }

                @Override // X.AbstractC813200VvC
                public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                    Fragment parentFragment;
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0r;
                    super.onFragmentAttached(fragmentManager, fragment, context);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ViewOnAttachStateChangeListenerC790870V0r.LLIZ;
                    concurrentHashMap.put(Integer.valueOf(fragment.hashCode()), new ViewOnAttachStateChangeListenerC790870V0r(fragment));
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ(fragment);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                        Fragment fragment2 = viewOnAttachStateChangeListenerC790870V0rLIZIZ.LL.get();
                        if (fragment2 != null && (parentFragment = fragment2.getParentFragment()) != null && (viewOnAttachStateChangeListenerC790870V0r = (ViewOnAttachStateChangeListenerC790870V0r) concurrentHashMap.get(Integer.valueOf(parentFragment.hashCode()))) != null) {
                            viewOnAttachStateChangeListenerC790870V0rLIZIZ.LLILZLL = viewOnAttachStateChangeListenerC790870V0r;
                            ((HashSet) viewOnAttachStateChangeListenerC790870V0r.LLILZIL).add(viewOnAttachStateChangeListenerC790870V0rLIZIZ);
                        }
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ.LIZ(true);
                    }
                }

                @Override // X.AbstractC813200VvC
                public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
                    super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ(fragment);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC790870V0rLIZIZ);
                    }
                }
            });
            C813120Vv4.LIZ.add(new AbstractC813150Vv7() { // from class: X.0Vv6
                @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    String name = activity.getClass().getName();
                    if (!Intrinsics.LJFF(name, C813160Vv8.LIZ)) {
                        C813160Vv8.LIZ = name;
                        C813160Vv8.LIZ(name);
                    }
                }
            });
        }
    }

    public static void LIZ(String str) {
        C796440VMc<String> c796440VMc = LIZIZ;
        if (c796440VMc != null) {
            c796440VMc.offer(str);
        }
        LIZLLL = str;
        if (CrossStackPageStack.LIZ.enablePageMap) {
            int iHashCode = str.hashCode();
            Map<Integer, String> map = LJFF;
            if (map.get(Integer.valueOf(iHashCode)) == null) {
                map.put(Integer.valueOf(iHashCode), str);
            }
            LIZJ.offer(Integer.valueOf(iHashCode));
            LJ = Integer.valueOf(iHashCode);
        }
    }
}
