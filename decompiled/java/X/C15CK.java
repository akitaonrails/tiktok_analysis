package X;

import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15CK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15CK {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final ViewGroup.LayoutParams LIZJ;
    public ViewGroup.LayoutParams LIZLLL;
    public int LJ;
    public final Map<Integer, Long> LJFF;

    public final synchronized boolean LIZIZ(InterfaceC2181691AZz interfaceC2181691AZz) {
        long jLongValue;
        boolean z;
        Long l = (Long) ((LinkedHashMap) this.LJFF).get(Integer.valueOf(interfaceC2181691AZz.hashCode()));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Map<Integer, Long> map = this.LJFF;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (((Number) entry.getValue()).longValue() > jLongValue) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        boolean zIsEmpty = linkedHashMap.isEmpty();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selfRegistrationTime: ");
        sbLIZ.append(jLongValue);
        sbLIZ.append(", isNewestController: ");
        sbLIZ.append(zIsEmpty);
        C20441214yg.LIZIZ("AnchorSurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        if (jLongValue <= 0 || !zIsEmpty) {
            if (!C500260Jjc.LJJIL()) {
                z = false;
            }
        }
        return z;
    }

    public final synchronized void LIZJ(Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJFF.put(Integer.valueOf(obj.hashCode()), Long.valueOf(jCurrentTimeMillis));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerController, controller:");
        sbLIZ.append(obj.hashCode());
        sbLIZ.append(", time:");
        sbLIZ.append(jCurrentTimeMillis);
        C20441214yg.LIZIZ("AnchorSurfaceView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZLLL(InterfaceC2181691AZz interfaceC2181691AZz) {
        if (!LIZIZ(interfaceC2181691AZz)) {
            return false;
        }
        C500260Jjc.LJJJLL(this.LIZIZ);
        C500260Jjc.LJLJLJ(this.LIZIZ, true);
        View view = this.LIZIZ;
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderMediaOverlay(false);
        }
        ViewGroup.LayoutParams layoutParams = this.LIZLLL;
        if (layoutParams == null) {
            layoutParams = this.LIZJ;
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                this.LIZ.addView(this.LIZIZ, this.LJ);
                return true;
            }
        }
        this.LIZ.addView(this.LIZIZ, this.LJ, layoutParams);
        return true;
    }

    public final void LJFF(InterfaceC2181691AZz interfaceC2181691AZz) {
        ViewGroup viewGroup;
        if (!LIZIZ(interfaceC2181691AZz)) {
            return;
        }
        ViewParent parent = this.LIZIZ.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (Intrinsics.LJFF(viewGroup, this.LIZ)) {
            this.LJ = viewGroup.indexOfChild(this.LIZIZ);
            this.LIZLLL = this.LIZIZ.getLayoutParams();
            C500260Jjc.LJJJJIZL(this.LIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("store last layout params, lastViewParent:");
            sbLIZ.append(C500260Jjc.LJIIL(viewGroup));
            sbLIZ.append(", visible:");
            sbLIZ.append(C500260Jjc.LJJJJIZL(this.LIZIZ));
            sbLIZ.append(", originParent:");
            sbLIZ.append(C500260Jjc.LJIIL(this.LIZ));
            C20441214yg.LJIIL("AnchorSurfaceView", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("don't update layout params, lastViewParent:");
        sbLIZ2.append(C500260Jjc.LJIIL(viewGroup));
        sbLIZ2.append(", visible:");
        sbLIZ2.append(C500260Jjc.LJJJJIZL(this.LIZIZ));
        sbLIZ2.append(", originParent:");
        sbLIZ2.append(C500260Jjc.LJIIL(this.LIZ));
        C20441214yg.LJIIL("AnchorSurfaceView", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final synchronized void LJI(InterfaceC2181691AZz interfaceC2181691AZz) {
        Long lRemove = this.LJFF.remove(Integer.valueOf(interfaceC2181691AZz.hashCode()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregisterController, controller:");
        sbLIZ.append(interfaceC2181691AZz.hashCode());
        sbLIZ.append(", time:");
        sbLIZ.append(lRemove);
        C20441214yg.LIZIZ("AnchorSurfaceView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C15CK(View view, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = view.getLayoutParams();
        C500260Jjc.LJJJJIZL(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, anchorRTCView:");
        sbLIZ.append(C500260Jjc.LJIIL(view));
        sbLIZ.append(", isVisible:");
        sbLIZ.append(C500260Jjc.LJJJJIZL(view));
        C20441214yg.LJIIL("AnchorSurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = new LinkedHashMap();
    }

    public final boolean LJ(InterfaceC2181691AZz interfaceC2181691AZz, boolean z) {
        if (!LIZIZ(interfaceC2181691AZz)) {
            return false;
        }
        C500260Jjc.LJLJLJ(this.LIZIZ, z);
        return true;
    }

    public final boolean LJII(InterfaceC2181691AZz interfaceC2181691AZz, Rect rect) {
        FrameLayout.LayoutParams layoutParams;
        if (!LIZIZ(interfaceC2181691AZz)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams2 = this.LIZIZ.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null && layoutParams.leftMargin == rect.left && layoutParams.topMargin == rect.top && layoutParams.width == rect.width() && layoutParams.height == rect.height()) {
            return false;
        }
        View view = this.LIZIZ;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams3.leftMargin = rect.left;
        layoutParams3.topMargin = rect.top;
        C786410Ut5.W5(view, layoutParams3);
        return true;
    }

    public final boolean LIZ(InterfaceC2181691AZz interfaceC2181691AZz, ViewGroup viewGroup, int i, boolean z) {
        int z2;
        Object objValueOf;
        if (!LIZIZ(interfaceC2181691AZz)) {
            return false;
        }
        View view = this.LIZIZ;
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderMediaOverlay(z);
        }
        ViewParent parent = this.LIZIZ.getParent();
        if (this.LIZIZ.getVisibility() == 0) {
            z2 = (int) this.LIZIZ.getZ();
        } else {
            z2 = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addAnchorViewToParent, originParent: ");
        if (parent != null) {
            objValueOf = Integer.valueOf(parent.hashCode());
        } else {
            objValueOf = "null";
        }
        sbLIZ.append(objValueOf);
        sbLIZ.append(", newParent: ");
        sbLIZ.append(viewGroup.hashCode());
        sbLIZ.append(", originZ: ");
        sbLIZ.append(z2);
        sbLIZ.append(", newZ: ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("AnchorSurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(parent, viewGroup) || z2 != i) {
            C500260Jjc.LJJJLL(this.LIZIZ);
            viewGroup.addView(this.LIZIZ, i);
        }
        return true;
    }
}
