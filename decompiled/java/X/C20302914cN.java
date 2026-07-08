package X;

import X.C830490Whz;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14cN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20302914cN {
    public static final AnonymousClass1904 LIZ = new AbstractC21466418ze() { // from class: X.1904
        @Override // X.AbstractC21466418ze
        public final boolean isSeekingSupported() {
            return false;
        }

        @Override // X.AbstractC21466418ze
        public final boolean isSeekingSupported(Object obj) {
            return false;
        }

        public static boolean LIZ(Transition transition) {
            if (AbstractC21466418ze.isNullOrEmpty(transition.getTargetIds()) && AbstractC21466418ze.isNullOrEmpty(transition.getTargetNames()) && AbstractC21466418ze.isNullOrEmpty(transition.getTargetTypes())) {
                return false;
            }
            return true;
        }

        @Override // X.AbstractC21466418ze
        public final boolean canHandle(Object obj) {
            return obj instanceof Transition;
        }

        @Override // X.AbstractC21466418ze
        public final Object cloneTransition(Object obj) {
            if (obj != null) {
                return ((Transition) obj).clone();
            }
            return null;
        }

        @Override // X.AbstractC21466418ze
        public final Object wrapTransitionInSet(Object obj) {
            if (obj == null) {
                return null;
            }
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition((Transition) obj);
            return transitionSet;
        }

        @Override // X.AbstractC21466418ze
        public final void addTarget(Object obj, View view) {
            if (obj != null) {
                ((Transition) obj).addTarget(view);
            }
        }

        @Override // X.AbstractC21466418ze
        public final void addTargets(Object obj, ArrayList<View> arrayList) {
            Transition transition = (Transition) obj;
            if (transition == null) {
                return;
            }
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    addTargets(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            if (!LIZ(transition) && AbstractC21466418ze.isNullOrEmpty(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) ListProtector.get(arrayList, i));
                    i++;
                }
            }
        }

        @Override // X.AbstractC21466418ze
        public final void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
            TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
        }

        @Override // X.AbstractC21466418ze
        public final void removeTarget(Object obj, View view) {
            if (obj != null) {
                ((Transition) obj).removeTarget(view);
            }
        }

        @Override // X.AbstractC21466418ze
        public final void setEpicenter(Object obj, View view) {
            if (view != null) {
                final Rect rect = new Rect();
                getBoundsOnScreen(view, rect);
                ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: X.1909
                    @Override // android.transition.Transition.EpicenterCallback
                    public final Rect onGetEpicenter(Transition transition) {
                        return rect;
                    }
                });
            }
        }

        @Override // X.AbstractC21466418ze
        public final void setEpicenter(Object obj, final Rect rect) {
            if (obj != null) {
                ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: X.1908
                    @Override // android.transition.Transition.EpicenterCallback
                    public final Rect onGetEpicenter(Transition transition) {
                        Rect rect2 = rect;
                        if (rect2 != null && !rect2.isEmpty()) {
                            return rect;
                        }
                        return null;
                    }
                });
            }
        }

        @Override // X.AbstractC21466418ze
        public final Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
            Transition ordering = (Transition) obj;
            Transition transition = (Transition) obj2;
            Transition transition2 = (Transition) obj3;
            if (ordering != null) {
                if (transition != null) {
                    ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
                }
            } else if (transition != null) {
                ordering = transition;
            } else {
                ordering = null;
            }
            if (transition2 != null) {
                TransitionSet transitionSet = new TransitionSet();
                if (ordering != null) {
                    transitionSet.addTransition(ordering);
                }
                transitionSet.addTransition(transition2);
                return transitionSet;
            }
            return ordering;
        }

        @Override // X.AbstractC21466418ze
        public final Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
            TransitionSet transitionSet = new TransitionSet();
            if (obj != null) {
                transitionSet.addTransition((Transition) obj);
            }
            if (obj2 != null) {
                transitionSet.addTransition((Transition) obj2);
            }
            if (obj3 != null) {
                transitionSet.addTransition((Transition) obj3);
            }
            return transitionSet;
        }

        @Override // X.AbstractC21466418ze
        public final void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            List<View> targets;
            Transition transition = (Transition) obj;
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    replaceTargets(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                    i++;
                }
                return;
            }
            if (!LIZ(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    while (i < size) {
                        transition.addTarget((View) ListProtector.get(arrayList2, i));
                        i++;
                    }
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        transition.removeTarget((View) ListProtector.get(arrayList, size2));
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // X.AbstractC21466418ze
        public final void scheduleHideFragmentView(Object obj, final View view, final ArrayList<View> arrayList) {
            ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.1905
                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    transition.removeListener(this);
                    C786410Ut5.LJLLLLLL(8, view);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        C786410Ut5.LJLLLLLL(0, (View) ListProtector.get(arrayList, i));
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                    transition.removeListener(this);
                    transition.addListener(this);
                }
            });
        }

        @Override // X.AbstractC21466418ze
        public final void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
            Transition transition = (Transition) obj;
            List<View> targets = transition.getTargets();
            targets.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC21466418ze.bfsAddViewChildren(targets, (View) ListProtector.get(arrayList, i));
            }
            targets.add(view);
            arrayList.add(view);
            addTargets(transition, arrayList);
        }

        @Override // X.AbstractC21466418ze
        public final void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            Transition transition = (Transition) obj;
            if (transition != null) {
                transition.getTargets().clear();
                transition.getTargets().addAll(arrayList2);
                replaceTargets(transition, arrayList, arrayList2);
            }
        }

        @Override // X.AbstractC21466418ze
        public final void setListenerForTransitionEnd(Fragment fragment, Object obj, C20148513sZ c20148513sZ, final Runnable runnable) {
            ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.1907
                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    runnable.run();
                }
            });
        }

        @Override // X.AbstractC21466418ze
        public final void scheduleRemoveTargets(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
            ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.1906
                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    transition.removeListener(this);
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                    Object obj5 = obj2;
                    if (obj5 != null) {
                        replaceTargets(obj5, arrayList, null);
                    }
                    Object obj6 = obj3;
                    if (obj6 != null) {
                        replaceTargets(obj6, arrayList2, null);
                    }
                    Object obj7 = obj4;
                    if (obj7 != null) {
                        replaceTargets(obj7, arrayList3, null);
                    }
                }
            });
        }
    };
    public static final AbstractC21466418ze LIZIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1904] */
    static {
        AbstractC21466418ze abstractC21466418ze;
        try {
            abstractC21466418ze = (AbstractC21466418ze) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            abstractC21466418ze = null;
        }
        LIZIZ = abstractC21466418ze;
    }

    public static final String LIZIZ(C830490Whz<String, String> c830490Whz, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (C830490Whz.a) c830490Whz.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getKey());
        }
        return (String) C13LP.LJJJLL(arrayList);
    }

    public static final void LIZJ(int i, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJLLLLLL(i, (View) it2.next());
        }
    }

    public static final void LIZ(Fragment fragment, Fragment fragment2, boolean z, C830490Whz c830490Whz) {
        AbstractC1322240kVq enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(c830490Whz.LLILLL);
            Iterator it2 = ((C830490Whz.a) c830490Whz.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(c830490Whz.LLILLL);
            Iterator it3 = ((C830490Whz.a) c830490Whz.entrySet()).iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Map.Entry) it3.next()).getKey());
            }
        }
    }
}
