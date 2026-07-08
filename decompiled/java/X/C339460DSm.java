package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0DSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339460DSm {
    public WeakReference<ViewGroup> LIZ;
    public WeakReference<FrameLayout> LIZIZ;

    public final void LIZ(FrameLayout frameLayout) {
        WeakReference<FrameLayout> weakReference;
        FrameLayout frameLayout2;
        if (frameLayout == null) {
            return;
        }
        WeakReference<ViewGroup> weakReference2 = this.LIZ;
        if ((weakReference2 == null || weakReference2.get() == null) && (weakReference = this.LIZIZ) != null && (frameLayout2 = weakReference.get()) != null) {
            View view = frameLayout;
            while (true) {
                if (frameLayout2.getParent() != view.getParent()) {
                    if (!(frameLayout2.getParent() instanceof View) || !(view.getParent() instanceof View)) {
                        break;
                    }
                    frameLayout2 = (View) frameLayout2.getParent();
                    view = (View) view.getParent();
                } else {
                    ViewParent parent = frameLayout2.getParent();
                    if (parent != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("found nearestParent: ");
                        sbLIZ.append(parent);
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LIZ = new WeakReference<>(parent);
                    }
                }
            }
        }
        this.LIZIZ = new WeakReference<>(frameLayout);
    }

    public final FrameLayout LIZIZ(boolean z) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        WeakReference<FrameLayout> weakReference = this.LIZIZ;
        if (weakReference != null) {
            frameLayout = weakReference.get();
        } else {
            frameLayout = null;
        }
        WeakReference<ViewGroup> weakReference2 = this.LIZ;
        if (weakReference2 == null || (viewGroup = weakReference2.get()) == null || frameLayout == null) {
            return null;
        }
        while (frameLayout.getParent() != null && frameLayout.getParent() != viewGroup) {
            if (!(frameLayout.getParent() instanceof View)) {
                return null;
            }
            frameLayout = (View) frameLayout.getParent();
        }
        ArrayList<View> arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            arrayList.add(viewGroup.getChildAt(i));
        }
        arrayList.remove(frameLayout);
        if (arrayList.size() == 0) {
            return null;
        }
        C786410Ut5.j4("begin to find nearby child, current pos: [top:%s, bottom:%s]", new Object[]{Integer.valueOf(frameLayout.getTop()), Integer.valueOf(frameLayout.getBottom())});
        if (z) {
            for (View view : arrayList) {
                int top = view.getTop() - frameLayout.getBottom();
                if (top >= 0 && top <= 200) {
                    C786410Ut5.j4("found nearby child, isBelowCurrent: [top:%s, bottom:%s]", new Object[]{Integer.valueOf(view.getTop()), Integer.valueOf(view.getBottom())});
                    return (FrameLayout) view.findViewWithTag("SIM_KIT_VIDEO_CONTAINER_TAG");
                }
            }
            return null;
        }
        for (View view2 : arrayList) {
            int top2 = frameLayout.getTop() - view2.getBottom();
            if (top2 >= 0 && top2 <= 200) {
                C786410Ut5.j4("found nearby child, isAboveCurrent: [top:%s, bottom:%s]", new Object[]{Integer.valueOf(view2.getTop()), Integer.valueOf(view2.getBottom())});
                return (FrameLayout) view2.findViewWithTag("SIM_KIT_VIDEO_CONTAINER_TAG");
            }
        }
        return null;
    }
}
