package X;

import Y.AComparatorS517S0100000_20;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import j27.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318830kQL extends AccessibilityNodeProvider {
    public final int LIZ;
    public final UIGroup LIZIZ;
    public final View LIZLLL;
    public final AccessibilityManager LJ;
    public boolean LJFF;
    public final ArrayList<C1318890kQR> LIZJ = new ArrayList<>();
    public boolean LJI = false;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;

    public C1318830kQL(UIGroup uIGroup) {
        this.LIZIZ = uIGroup;
        this.LIZLLL = uIGroup.getRealParentView();
        this.LJ = (AccessibilityManager) C786410Ut5.R2(uIGroup.mContext, "accessibility");
        this.LIZ = uIGroup.mContext.LLJJJ.heightPixels / 50;
    }

    public static String LIZJ(LynxBaseUI lynxBaseUI) {
        CharSequence accessibilityLabel = lynxBaseUI.getAccessibilityLabel();
        if (accessibilityLabel == null) {
            accessibilityLabel = "";
        }
        return accessibilityLabel.toString();
    }

    public static Rect LJ(LynxBaseUI lynxBaseUI) {
        Rect rect = new Rect();
        if (lynxBaseUI instanceof LynxUI) {
            View view = ((LynxUI) lynxBaseUI).mView;
            if (lynxBaseUI instanceof UIShadowProxy) {
                LynxBaseUI lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI).LL;
                if (lynxBaseUI2 instanceof LynxUI) {
                    view = ((LynxUI) lynxBaseUI2).mView;
                }
            }
            LJFF(rect, view);
            int i = rect.left;
            rect.set(i, rect.top, lynxBaseUI.getWidth() + i, rect.top + lynxBaseUI.getHeight());
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            for (LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI(); parentBaseUI != null; parentBaseUI = parentBaseUI.getParentBaseUI()) {
                if (parentBaseUI instanceof LynxUI) {
                    View realParentView = ((LynxUI) parentBaseUI).mView;
                    if (parentBaseUI instanceof UIGroup) {
                        realParentView = ((UIGroup) parentBaseUI).getRealParentView();
                    }
                    LJFF(rect, realParentView);
                    rect.offset(-realParentView.getScrollX(), -realParentView.getScrollY());
                    rect.offset(lynxBaseUI.getLeft(), lynxBaseUI.getTop());
                    int i2 = rect.left;
                    rect.set(i2, rect.top, lynxBaseUI.getWidth() + i2, rect.top + lynxBaseUI.getHeight());
                    return rect;
                }
            }
        }
        return rect;
    }

    public final void LIZIZ(View view) {
        boolean z;
        boolean z2 = true;
        if (view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (view.getImportantForAccessibility() != 1 && (view.getImportantForAccessibility() == 2 || TextUtils.isEmpty(view.getContentDescription()))) {
            z2 = false;
        }
        if (z && z2) {
            Rect rect = new Rect();
            LJFF(rect, view);
            this.LIZJ.add(new C1318890kQR(rect, view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LIZIZ(viewGroup.getChildAt(i));
            }
        }
    }

    public final String LIZLLL(LynxBaseUI lynxBaseUI) {
        if (!LJI(lynxBaseUI)) {
            return "";
        }
        String strLIZJ = LIZJ(lynxBaseUI);
        if (TextUtils.isEmpty(strLIZJ)) {
            for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.mChildren) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) strLIZJ);
                sbLIZ.append(LIZJ(lynxBaseUI2));
                strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        strLIZJ.toString();
        return strLIZJ;
    }

    public final boolean LJI(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI == null) {
            return false;
        }
        int i = lynxBaseUI.mAccessibilityElementStatus;
        if (i == -1) {
            return this.LJII;
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    public final boolean LJII(MotionEvent motionEvent) {
        InterfaceC1311410kEN interfaceC1311410kENHitTest = this.LIZIZ.hitTest((int) motionEvent.getX(), (int) motionEvent.getY());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHover with target = ");
        sbLIZ.append(interfaceC1311410kENHitTest);
        sbLIZ.append(" event: [");
        sbLIZ.append((int) motionEvent.getX());
        sbLIZ.append(", ");
        sbLIZ.append((int) motionEvent.getY());
        sbLIZ.append(e3.f);
        LynxLog.i("LynxAccessibilityNodeProvider", C2188811AlT.LIZIZ(sbLIZ));
        while (interfaceC1311410kENHitTest != null && !(interfaceC1311410kENHitTest instanceof LynxBaseUI)) {
            interfaceC1311410kENHitTest = interfaceC1311410kENHitTest.parent();
        }
        if (interfaceC1311410kENHitTest == null || !(interfaceC1311410kENHitTest instanceof LynxBaseUI)) {
            return false;
        }
        LynxBaseUI parentBaseUI = (LynxBaseUI) interfaceC1311410kENHitTest;
        while (!LJI(parentBaseUI)) {
            parentBaseUI = parentBaseUI.getParentBaseUI();
            if (parentBaseUI == null) {
                return false;
            }
        }
        int size = this.LIZJ.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((C1318890kQR) ListProtector.get(this.LIZJ, size)).LIZ == parentBaseUI) {
                    break;
                }
                size--;
            } else {
                size = -1;
                break;
            }
        }
        Rect rect = new Rect();
        LJFF(rect, this.LIZLLL);
        int x = ((int) motionEvent.getX()) + rect.left;
        int y = ((int) motionEvent.getY()) + rect.top;
        for (int size2 = this.LIZJ.size() - 1; size2 >= size && size2 >= 0; size2--) {
            if (((C1318890kQR) ListProtector.get(this.LIZJ, size2)).LIZJ.contains(x, y)) {
                size = size2;
                break;
            }
        }
        if (size < 0) {
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onHover confirm virtualViewId = ");
        sbLIZ2.append(size);
        LynxLog.i("LynxAccessibilityNodeProvider", C2188811AlT.LIZIZ(sbLIZ2));
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action != 9) {
                if (action == 10) {
                    LJIIIIZZ(motionEvent, size);
                }
                return true;
            }
            motionEvent.setAction(9);
            LJIIIIZZ(motionEvent, size);
            return true;
        }
        LJIIIIZZ(motionEvent, size);
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        boolean z;
        Map<String, C1299120juY> map;
        Map<String, C1299120juY> map2;
        s sVar;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createAccessibilityNodeInfo: ");
        sbLIZ.append(i);
        LynxLog.i("LynxAccessibilityNodeProvider", C2188811AlT.LIZIZ(sbLIZ));
        if (i == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.LIZLLL);
            this.LIZJ.clear();
            LIZ(this.LIZIZ, new ArrayList());
            Collections.sort(this.LIZJ, new AComparatorS517S0100000_20(this, 0));
            if (this.LJI) {
                ArrayList arrayList = new ArrayList();
                for (C1318890kQR c1318890kQR : this.LIZJ) {
                    LynxBaseUI lynxBaseUI = c1318890kQR.LIZ;
                    if (lynxBaseUI != null && c1318890kQR.LIZLLL) {
                        ArrayList<String> arrayList2 = lynxBaseUI.mAccessibilityElements;
                        if (arrayList2 != null && (sVar = this.LIZIZ.mContext) != null && sVar.LJIILIIL() != null) {
                            C1311720kEs c1311720kEsLJIILIIL = this.LIZIZ.mContext.LJIILIIL();
                            Iterator<String> it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                LynxBaseUI lynxBaseUILJIIL = c1311720kEsLJIILIIL.LJIIL(it2.next());
                                if (lynxBaseUILJIIL != null && (!(lynxBaseUILJIIL instanceof LynxUI) || ((LynxUI) lynxBaseUILJIIL).mView.isAttachedToWindow())) {
                                    if (lynxBaseUILJIIL instanceof UIShadowProxy) {
                                        lynxBaseUILJIIL = ((UIShadowProxy) lynxBaseUILJIIL).LL;
                                    }
                                    if (LJI(lynxBaseUILJIIL)) {
                                        arrayList.add(new C1318890kQR(lynxBaseUILJIIL, LJ(lynxBaseUILJIIL)));
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList.add(c1318890kQR);
                    }
                }
                this.LIZJ.clear();
                this.LIZJ.addAll(arrayList);
                this.LJI = false;
            }
            this.LIZLLL.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            for (int i2 = 0; i2 < this.LIZJ.size(); i2++) {
                accessibilityNodeInfoObtain.addChild(this.LIZLLL, i2);
            }
            Rect rect = new Rect();
            LJFF(rect, this.LIZLLL);
            int i3 = rect.left;
            rect.set(i3, rect.top, this.LIZIZ.getWidth() + i3, rect.top + this.LIZIZ.getHeight());
            return accessibilityNodeInfoObtain;
        }
        if (i >= 0 && i < this.LIZJ.size()) {
            C1318890kQR c1318890kQR2 = (C1318890kQR) ListProtector.get(this.LIZJ, i);
            AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(this.LIZLLL, i);
            this.LIZLLL.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain2);
            LynxBaseUI lynxBaseUI2 = c1318890kQR2.LIZ;
            if (lynxBaseUI2 != null) {
                Rect rectLJ = LJ(lynxBaseUI2);
                c1318890kQR2.LIZJ = rectLJ;
                accessibilityNodeInfoObtain2.setBoundsInScreen(rectLJ);
                accessibilityNodeInfoObtain2.setClassName(c1318890kQR2.LIZ.getClass().getName());
                String strLIZLLL = LIZLLL(c1318890kQR2.LIZ);
                accessibilityNodeInfoObtain2.setContentDescription(strLIZLLL);
                accessibilityNodeInfoObtain2.setText(strLIZLLL);
                accessibilityNodeInfoObtain2.setScrollable(c1318890kQR2.LIZ.isScrollable());
                accessibilityNodeInfoObtain2.setLongClickable(c1318890kQR2.LIZ.isLongClickable());
                accessibilityNodeInfoObtain2.setFocusable(c1318890kQR2.LIZ.isFocusable());
                LynxBaseUI lynxBaseUI3 = c1318890kQR2.LIZ;
                if (lynxBaseUI3 != null && (map2 = lynxBaseUI3.mEvents) != null && (map2.containsKey("click") || lynxBaseUI3.mEvents.containsKey("tap"))) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfoObtain2.setClickable(z);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Label for UI: ");
                sbLIZ2.append(i);
                sbLIZ2.append(", ");
                sbLIZ2.append(strLIZLLL);
                LynxLog.i("LynxAccessibilityNodeProvider", C2188811AlT.LIZIZ(sbLIZ2));
                LynxBaseUI lynxBaseUI4 = c1318890kQR2.LIZ;
                if (lynxBaseUI4.mAccessibilityEnableTap && (map = lynxBaseUI4.mEvents) != null && (map.containsKey("click") || lynxBaseUI4.mEvents.containsKey("tap"))) {
                    accessibilityNodeInfoObtain2.addAction(16);
                }
            } else {
                View view = c1318890kQR2.LIZIZ;
                if (view != null && view.isAttachedToWindow()) {
                    c1318890kQR2.LIZIZ.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain2);
                    accessibilityNodeInfoObtain2.setSource(this.LIZLLL, i);
                }
            }
            accessibilityNodeInfoObtain2.setParent(this.LIZLLL);
            accessibilityNodeInfoObtain2.addAction(64);
            accessibilityNodeInfoObtain2.setAccessibilityFocused(false);
            accessibilityNodeInfoObtain2.setFocused(false);
            accessibilityNodeInfoObtain2.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
            accessibilityNodeInfoObtain2.addAction(8192);
            accessibilityNodeInfoObtain2.setVisibleToUser(true);
            return accessibilityNodeInfoObtain2;
        }
        return null;
    }

    public static void LJFF(Rect rect, View view) {
        rect.set(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public final void LIZ(LynxBaseUI lynxBaseUI, List<Rect> list) {
        if (lynxBaseUI.mAccessibilityElements != null) {
            C1318890kQR c1318890kQR = new C1318890kQR(lynxBaseUI, LJ(lynxBaseUI));
            c1318890kQR.LIZLLL = true;
            this.LIZJ.add(c1318890kQR);
            this.LJI = true;
            return;
        }
        for (int size = lynxBaseUI.getChildren().size() - 1; size >= 0; size--) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) ListProtector.get(lynxBaseUI.getChildren(), size);
            if ((!(lynxBaseUI2 instanceof LynxUI) || ((LynxUI) lynxBaseUI2).mView.isAttachedToWindow()) && !(lynxBaseUI2 instanceof InterfaceC1313080kH4)) {
                LIZ(lynxBaseUI2, list);
            }
        }
        if (lynxBaseUI != this.LIZIZ) {
            if (lynxBaseUI instanceof UIShadowProxy) {
                lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LL;
            }
            if (LJI(lynxBaseUI)) {
                Rect rectLJ = LJ(lynxBaseUI);
                if (!this.LJIIIIZZ) {
                    ArrayList arrayList = (ArrayList) list;
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((Rect) it2.next()).contains(rectLJ)) {
                                break;
                            }
                        } else {
                            this.LIZJ.add(new C1318890kQR(lynxBaseUI, rectLJ));
                            break;
                        }
                    }
                    arrayList.add(rectLJ);
                } else {
                    this.LIZJ.add(new C1318890kQR(lynxBaseUI, rectLJ));
                }
            }
            if ((lynxBaseUI instanceof LynxUI) && lynxBaseUI.mChildren.isEmpty()) {
                T t = ((LynxUI) lynxBaseUI).mView;
                if (t instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) t;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        LIZIZ(viewGroup.getChildAt(i));
                    }
                }
            }
        }
    }

    public final void LJIIIIZZ(MotionEvent motionEvent, int i) {
        int action = motionEvent.getAction();
        if (!this.LJFF) {
            if (action == 9 || action == 7) {
                LJIIIZ(i, 128);
                this.LJFF = true;
            }
        } else if (action == 10 || action == 7) {
            this.LJFF = false;
            LJIIIZ(i, 256);
        }
        if (action != 9) {
            if (action == 10) {
                this.LIZLLL.setHovered(false);
                return;
            }
            return;
        }
        this.LIZLLL.setHovered(true);
    }

    public final void LJIIIZ(int i, int i2) {
        if (this.LJ.isTouchExplorationEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            if (i >= 0) {
                C1318890kQR c1318890kQR = (C1318890kQR) ListProtector.get(this.LIZJ, i);
                if (c1318890kQR.LIZ != null) {
                    accessibilityEventObtain.setPackageName(this.LIZLLL.getContext().getPackageName());
                    accessibilityEventObtain.setClassName(c1318890kQR.LIZ.getClass().getName());
                    accessibilityEventObtain.setEnabled(true);
                    accessibilityEventObtain.setContentDescription(LIZLLL(c1318890kQR.LIZ));
                } else {
                    View view = c1318890kQR.LIZIZ;
                    if (view != null) {
                        view.onInitializeAccessibilityEvent(accessibilityEventObtain);
                    } else {
                        return;
                    }
                }
                accessibilityEventObtain.setSource(this.LIZLLL, i);
                this.LIZLLL.invalidate();
                if (this.LIZLLL.getParent() == null) {
                    LynxLog.e("LynxAccessibilityNodeProvider", "sendAccessibilityEventForLynxUI failed, parent is null.");
                } else {
                    this.LIZLLL.getParent().requestSendAccessibilityEvent(this.LIZLLL, accessibilityEventObtain);
                }
            }
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        LynxBaseUI lynxBaseUI;
        String strLIZJ;
        String strLIZJ2;
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        String lowerCase = str.toLowerCase();
        if (i == -1) {
            for (int i2 = 0; i2 < this.LIZJ.size(); i2++) {
                if (((C1318890kQR) ListProtector.get(this.LIZJ, i2)).LIZ != null && (strLIZJ2 = LIZJ(((C1318890kQR) ListProtector.get(this.LIZJ, i2)).LIZ)) != null) {
                    strLIZJ2.toString();
                    if (strLIZJ2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(createAccessibilityNodeInfo(i2));
                    }
                }
            }
        } else if (i > 0 && i < this.LIZJ.size() && (lynxBaseUI = ((C1318890kQR) ListProtector.get(this.LIZJ, i)).LIZ) != null && (strLIZJ = LIZJ(lynxBaseUI)) != null) {
            strLIZJ.toString();
            if (strLIZJ.toLowerCase().contains(lowerCase)) {
                arrayList.add(createAccessibilityNodeInfo(i));
            }
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        s sVar;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performAction on virtualViewId ");
        sbLIZ.append(i);
        sbLIZ.append(" action ");
        sbLIZ.append(i2);
        LynxLog.i("LynxAccessibilityNodeProvider", C2188811AlT.LIZIZ(sbLIZ));
        if (i != -1 && i >= 0 && i < this.LIZJ.size()) {
            if (i2 != 16) {
                if (i2 != 64) {
                    if (i2 == 128) {
                        LJIIIZ(i, 65536);
                        return true;
                    }
                } else {
                    LJIIIZ(i, 32768);
                    LJIIIZ(i, 4);
                    return true;
                }
            } else {
                C1318890kQR c1318890kQR = (C1318890kQR) ListProtector.get(this.LIZJ, i);
                LynxBaseUI lynxBaseUI = c1318890kQR.LIZ;
                if (lynxBaseUI != null && (sVar = lynxBaseUI.mContext) != null && sVar.LLIZ != null && lynxBaseUI.mAccessibilityEnableTap) {
                    Rect rect = c1318890kQR.LIZJ;
                    C1298900juC c1298900juC = new C1298900juC(rect.centerX(), rect.centerY());
                    C1298900juC c1298900juC2 = new C1298900juC(rect.centerX() - rect.left, rect.centerY() - rect.top);
                    Map<String, C1299120juY> map = lynxBaseUI.mEvents;
                    if (map != null) {
                        if (map.containsKey("tap")) {
                            lynxBaseUI.mContext.LLIZ.LIZLLL(new C1298740jtw(lynxBaseUI.getSign(), "tap", c1298900juC2, c1298900juC2, c1298900juC));
                        } else if (lynxBaseUI.mEvents.containsKey("click")) {
                            lynxBaseUI.mContext.LLIZ.LIZLLL(new C1298740jtw(lynxBaseUI.getSign(), "click", c1298900juC2, c1298900juC2, c1298900juC));
                            return true;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
