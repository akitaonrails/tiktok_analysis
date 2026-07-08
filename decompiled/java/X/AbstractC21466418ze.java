package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21466418ze {
    public abstract void addTarget(Object obj, View view);

    public abstract void addTargets(Object obj, ArrayList<View> arrayList);

    public void animateToEnd(Object obj) {
    }

    public void animateToStart(Object obj, Runnable runnable) {
    }

    public abstract void beginDelayedTransition(ViewGroup viewGroup, Object obj);

    public abstract boolean canHandle(Object obj);

    public abstract Object cloneTransition(Object obj);

    public Object controlDelayedTransition(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isSeekingSupported(Object obj) {
        return false;
    }

    public abstract Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3);

    public abstract Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3);

    public abstract void removeTarget(Object obj, View view);

    public abstract void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList);

    public abstract void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public void setCurrentPlayTime(Object obj, float f) {
    }

    public abstract void setEpicenter(Object obj, Rect rect);

    public abstract void setEpicenter(Object obj, View view);

    public abstract void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList);

    public abstract void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object wrapTransitionInSet(Object obj);

    public static boolean isNullOrEmpty(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public ArrayList<String> prepareSetNameOverridesReordered(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) ListProtector.get(arrayList, i);
            arrayList2.add(C14K9.LJIIJ(view));
            C14K9.LJIJJLI(view, null);
        }
        return arrayList2;
    }

    public static void bfsAddViewChildren(List<View> list, View view) {
        int size = list.size();
        if (containedBeforeIndex(list, view, size)) {
            return;
        }
        if (C14K9.LJIIJ(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) ListProtector.get(list, i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!containedBeforeIndex(list, childAt, size) && C14K9.LJIIJ(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public void getBoundsOnScreen(View view, Rect rect) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r2[0], r2[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static boolean containedBeforeIndex(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (ListProtector.get(list, i2) == view) {
                return true;
            }
        }
        return false;
    }

    public void setListenerForTransitionEnd(Fragment fragment, Object obj, C20148513sZ c20148513sZ, Runnable runnable) {
        setListenerForTransitionEnd(fragment, obj, c20148513sZ, null, runnable);
    }

    public void setListenerForTransitionEnd(Fragment fragment, Object obj, C20148513sZ c20148513sZ, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    public void setNameOverridesReordered(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) ListProtector.get(arrayList, i);
            String strLJIIJ = C14K9.LJIIJ(view2);
            arrayList4.add(strLJIIJ);
            if (strLJIIJ != null) {
                C14K9.LJIJJLI(view2, null);
                String str = map.get(strLJIIJ);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(ListProtector.get(arrayList3, i2))) {
                        C14K9.LJIJJLI((View) ListProtector.get(arrayList2, i2), strLJIIJ);
                        break;
                    }
                    i2++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new Runnable() { // from class: X.14LB
            public final void LIZ() {
                for (int i3 = 0; i3 < size; i3++) {
                    C14K9.LJIJJLI((View) ListProtector.get(arrayList2, i3), (String) ListProtector.get(arrayList3, i3));
                    C14K9.LJIJJLI((View) ListProtector.get(arrayList, i3), (String) ListProtector.get(arrayList4, i3));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}
