package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318810kQJ extends C1318860kQO {
    public final WeakReference<C1318820kQK> LL;
    public final UIGroup LLILLJJLI;
    public final View LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public final ArrayList<C1318900kQS> LLIZ;

    public final AccessibilityNodeInfoCompat LIZIZ() {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(this.LLILLL);
        this.LLILLL.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompatObtain.unwrap());
        LIZJ(this.LLILLJJLI, this.LLIZ);
        if (accessibilityNodeInfoCompatObtain.getChildCount() > 0 && this.LLIZ.size() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Views cannot have both real and virtual children, with real child count = ");
            sbLIZ.append(accessibilityNodeInfoCompatObtain.getChildCount());
            sbLIZ.append("and virtual child count = ");
            sbLIZ.append(this.LLIZ.size());
            LynxLog.e("LynxA11yNodeProvider", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createNodeForHost with child count = ");
        sbLIZ2.append(this.LLIZ.size());
        LynxLog.i("LynxA11yNodeProvider", C2188811AlT.LIZIZ(sbLIZ2));
        for (int i = 0; i < this.LLIZ.size(); i++) {
            accessibilityNodeInfoCompatObtain.addChild(this.LLILLL, i);
        }
        LynxBaseUI lynxBaseUI = this.LL.get().LJI;
        int i2 = this.LL.get().LIZJ;
        if (lynxBaseUI != null && lynxBaseUI.mAccessibilityKeepFocused && i2 != -1) {
            for (int i3 = 0; i3 < this.LLIZ.size(); i3++) {
                LynxBaseUI lynxBaseUI2 = ((C1318900kQS) ListProtector.get(this.LLIZ, i3)).LIZ;
                if (lynxBaseUI2 != null && lynxBaseUI2 == lynxBaseUI && i3 != i2 && LJIIIIZZ(lynxBaseUI2, new Rect())) {
                    performAction(i3, 64, null);
                }
            }
        }
        return accessibilityNodeInfoCompatObtain;
    }

    public C1318810kQJ(C1318820kQK c1318820kQK) {
        if (c1318820kQK != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Create LynxNodeProvider for ");
            sbLIZ.append(c1318820kQK.LIZ);
            LynxLog.i("LynxA11yNodeProvider", C2188811AlT.LIZIZ(sbLIZ));
            this.LL = new WeakReference<>(c1318820kQK);
            UIGroup uIGroup = c1318820kQK.LIZ;
            this.LLILLJJLI = uIGroup;
            this.LLILLL = c1318820kQK.LIZIZ;
            this.LLIZ = new ArrayList<>();
            DisplayMetrics displayMetrics = uIGroup.mContext.LLJJJ;
            this.LLILZ = displayMetrics.widthPixels / 50;
            this.LLILZIL = displayMetrics.heightPixels / 50;
        }
    }

    public static String LJFF(LynxBaseUI lynxBaseUI) {
        CharSequence accessibilityLabel = lynxBaseUI.getAccessibilityLabel();
        if (accessibilityLabel == null) {
            accessibilityLabel = "";
        }
        return accessibilityLabel.toString();
    }

    public static Rect LJI(LynxBaseUI lynxBaseUI) {
        Rect rect = new Rect();
        if (lynxBaseUI instanceof LynxUI) {
            View view = ((LynxUI) lynxBaseUI).mView;
            if (lynxBaseUI instanceof UIShadowProxy) {
                LynxBaseUI lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI).LL;
                if (lynxBaseUI2 instanceof LynxUI) {
                    view = ((LynxUI) lynxBaseUI2).mView;
                }
            }
            LJII(rect, view);
            int i = rect.left;
            rect.set(i, rect.top, lynxBaseUI.getWidth() + i, rect.top + lynxBaseUI.getHeight());
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            for (LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI(); parentBaseUI != null; parentBaseUI = parentBaseUI.getParentBaseUI()) {
                if (parentBaseUI instanceof LynxUI) {
                    View accessibilityHostView = ((LynxUI) parentBaseUI).mView;
                    if (parentBaseUI instanceof UIGroup) {
                        accessibilityHostView = ((UIGroup) parentBaseUI).getAccessibilityHostView();
                    }
                    LJII(rect, accessibilityHostView);
                    rect.offset(-accessibilityHostView.getScrollX(), -accessibilityHostView.getScrollY());
                    rect.offset(lynxBaseUI.getLeft(), lynxBaseUI.getTop());
                    int i2 = rect.left;
                    rect.set(i2, rect.top, lynxBaseUI.getWidth() + i2, rect.top + lynxBaseUI.getHeight());
                    return rect;
                }
            }
        }
        return rect;
    }

    public final AccessibilityNodeInfoCompat LIZ(int i) {
        String strLJFF;
        boolean z;
        View accessibilityHostView;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        if (i != -1 && i < this.LLIZ.size()) {
            accessibilityNodeInfoCompatObtain.setEnabled(true);
            accessibilityNodeInfoCompatObtain.setFocusable(true);
            accessibilityNodeInfoCompatObtain.setClassName(this.LLILLJJLI.getClass().getName());
            Rect rect = C1310360kCg.LJIILL;
            accessibilityNodeInfoCompatObtain.setBoundsInParent(rect);
            accessibilityNodeInfoCompatObtain.setBoundsInScreen(rect);
            accessibilityNodeInfoCompatObtain.setParent(this.LLILLL);
            accessibilityNodeInfoCompatObtain.setSource(this.LLILLL, i);
            accessibilityNodeInfoCompatObtain.setPackageName(this.LLILLL.getContext().getPackageName());
            C1318900kQS c1318900kQS = (C1318900kQS) ListProtector.get(this.LLIZ, i);
            LynxBaseUI lynxBaseUI = c1318900kQS.LIZ;
            if (lynxBaseUI != null) {
                while (true) {
                    if (lynxBaseUI == this.LLILLJJLI) {
                        break;
                    }
                    if ((lynxBaseUI instanceof UIGroup) && lynxBaseUI.isScrollContainer() && (accessibilityHostView = ((UIGroup) lynxBaseUI).getAccessibilityHostView()) != null) {
                        accessibilityNodeInfoCompatObtain.setParent(accessibilityHostView);
                        break;
                    }
                    lynxBaseUI = (LynxBaseUI) lynxBaseUI.mParent;
                    if (lynxBaseUI == null) {
                        break;
                    }
                }
                LynxBaseUI lynxBaseUI2 = c1318900kQS.LIZ;
                if (!LJIIJ(lynxBaseUI2)) {
                    strLJFF = "";
                } else {
                    strLJFF = LJFF(lynxBaseUI2);
                    if (TextUtils.isEmpty(strLJFF)) {
                        for (LynxBaseUI lynxBaseUI3 : lynxBaseUI2.getChildren()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append((Object) strLJFF);
                            sbLIZ.append(LJFF(lynxBaseUI3));
                            strLJFF = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                    strLJFF.toString();
                }
                accessibilityNodeInfoCompatObtain.setText(strLJFF);
                accessibilityNodeInfoCompatObtain.setContentDescription(strLJFF);
                accessibilityNodeInfoCompatObtain.setClassName(c1318900kQS.LIZ.getClass().getName());
                LynxBaseUI lynxBaseUI4 = c1318900kQS.LIZ;
                if (lynxBaseUI4 != null && lynxBaseUI4.getEvents() != null && (lynxBaseUI4.getEvents().containsKey("click") || lynxBaseUI4.getEvents().containsKey("tap"))) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfoCompatObtain.setClickable(z);
                if (c1318900kQS.LIZ.mAccessibilityEnableTap) {
                    accessibilityNodeInfoCompatObtain.addAction(16);
                }
                accessibilityNodeInfoCompatObtain.setBoundsInParent(c1318900kQS.LIZ.getBoundingClientRect());
                Rect rect2 = new Rect();
                boolean zLJIIIIZZ = LJIIIIZZ(c1318900kQS.LIZ, rect2);
                accessibilityNodeInfoCompatObtain.setVisibleToUser(zLJIIIIZZ);
                if (zLJIIIIZZ) {
                    accessibilityNodeInfoCompatObtain.setBoundsInScreen(rect2);
                }
                if (this.LL.get().LIZJ == i) {
                    accessibilityNodeInfoCompatObtain.setAccessibilityFocused(true);
                    accessibilityNodeInfoCompatObtain.addAction(128);
                } else {
                    accessibilityNodeInfoCompatObtain.setAccessibilityFocused(false);
                    accessibilityNodeInfoCompatObtain.addAction(64);
                    return accessibilityNodeInfoCompatObtain;
                }
            }
            return accessibilityNodeInfoCompatObtain;
        }
        LynxLog.e("LynxA11yNodeProvider", "createNodeForChild: check virtualViewId failed");
        return accessibilityNodeInfoCompatObtain;
    }

    public final int LJ(LynxBaseUI lynxBaseUI) {
        ArrayList<C1318900kQS> arrayList;
        if (lynxBaseUI != null && (arrayList = this.LLIZ) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C1318900kQS) ListProtector.get(this.LLIZ, size)).LIZ == lynxBaseUI) {
                    return size;
                }
            }
        }
        return -1;
    }

    public final boolean LJIIJ(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI == null) {
            return false;
        }
        if (lynxBaseUI.mAccessibilityElementStatus == -1 && this.LL.get() != null) {
            return this.LL.get().LJFF;
        }
        if (lynxBaseUI.mAccessibilityElementStatus != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C1318860kQO
    public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        C1318900kQS c1318900kQS;
        try {
            if (-1 == i) {
                return AccessibilityNodeInfoCompat.obtain(LIZIZ());
            }
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(LIZ(i));
            if (i != -1 && i < this.LLIZ.size() && (c1318900kQS = (C1318900kQS) ListProtector.get(this.LLIZ, i)) != null) {
                LynxBaseUI lynxBaseUI = c1318900kQS.LIZ;
                if ((lynxBaseUI instanceof LynxUI) && ((LynxUI) lynxBaseUI).mView != 0) {
                    ((LynxUI) lynxBaseUI).mView.setImportantForAccessibility(2);
                }
            }
            return accessibilityNodeInfoCompatObtain;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createAccessibilityNodeInfo with virtual view id = ");
            sbLIZ.append(i);
            sbLIZ.append(" with virtual children size = ");
            sbLIZ.append(this.LLIZ.size());
            sbLIZ.append(", and exception msg = ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("LynxA11yNodeProvider", C2188811AlT.LIZIZ(sbLIZ));
            return AccessibilityNodeInfoCompat.obtain();
        }
    }

    public static void LJII(Rect rect, View view) {
        rect.set(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public final void LIZJ(final LynxBaseUI lynxBaseUI, ArrayList<C1318900kQS> arrayList) {
        LynxBaseUI lynxBaseUILJIIL;
        if (lynxBaseUI != null && arrayList != null) {
            arrayList.clear();
            LIZLLL(lynxBaseUI, arrayList);
            Collections.sort(arrayList, new Comparator() { // from class: X.0kQP
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i;
                    int i2;
                    Rect rect = ((C1318900kQS) obj).LIZIZ;
                    Rect rect2 = ((C1318900kQS) obj2).LIZIZ;
                    if (lynxBaseUI.isAccessibilityDirectionVertical()) {
                        int i3 = rect.left - rect2.left;
                        int i4 = this.LLILLJJLI.LLILZIL;
                        int i5 = rect.top;
                        if (i4 == 0) {
                            i2 = rect2.top;
                        } else {
                            i5 /= i4;
                            i2 = rect2.top / i4;
                        }
                        int i6 = i5 - i2;
                        if (i6 != 0) {
                            return i6;
                        }
                        return i3;
                    }
                    int i7 = this.LLILLJJLI.LLILZ;
                    if (i7 == 0) {
                        i = rect.left - rect2.left;
                    } else {
                        i = (rect.left / i7) - (rect2.left / i7);
                    }
                    int i8 = rect.top - rect2.top;
                    if (i == 0) {
                        return i8;
                    }
                    return i;
                }
            });
            if (this.LLILZLL) {
                ArrayList<C1318900kQS> arrayList2 = new ArrayList<>();
                Iterator<C1318900kQS> it2 = arrayList.iterator();
                while (true) {
                    boolean z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1318900kQS next = it2.next();
                    LynxBaseUI lynxBaseUI2 = next.LIZ;
                    if (lynxBaseUI2 != null && next.LIZJ) {
                        ArrayList<String> arrayList3 = lynxBaseUI2.mAccessibilityElementsA11y;
                        if (arrayList3 == null) {
                            arrayList3 = lynxBaseUI2.mAccessibilityElements;
                            if (arrayList3 != null) {
                            }
                        } else {
                            z = true;
                        }
                        s sVar = this.LLILLJJLI.mContext;
                        if (sVar != null && sVar.LJIILIIL() != null) {
                            C1311720kEs c1311720kEsLJIILIIL = this.LLILLJJLI.mContext.LJIILIIL();
                            for (String str : arrayList3) {
                                if (z) {
                                    lynxBaseUILJIIL = c1311720kEsLJIILIIL.LJIIJ(str);
                                } else {
                                    lynxBaseUILJIIL = c1311720kEsLJIILIIL.LJIIL(str);
                                }
                                if (lynxBaseUILJIIL != null && (!(lynxBaseUILJIIL instanceof LynxUI) || ((LynxUI) lynxBaseUILJIIL).mView.isAttachedToWindow())) {
                                    LJIIIZ(lynxBaseUILJIIL, arrayList2);
                                }
                            }
                        }
                    } else {
                        arrayList2.add(next);
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                this.LLILZLL = false;
            }
            boolean z2 = lynxBaseUI instanceof UIList;
            if (z2) {
                Iterator<ArrayList<C1318900kQS>> it3 = ((UIList) lynxBaseUI).LLJLIL.values().iterator();
                while (it3.hasNext()) {
                    for (C1318900kQS c1318900kQS : it3.next()) {
                        c1318900kQS.LIZ = null;
                        c1318900kQS.LIZIZ = C1310360kCg.LJIILL;
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (C1318900kQS c1318900kQS2 : arrayList) {
                if (c1318900kQS2.LIZLLL) {
                    ArrayList<C1318900kQS> arrayList5 = new ArrayList<>();
                    LIZJ(c1318900kQS2.LIZ, arrayList5);
                    LynxBaseUI lynxBaseUI3 = c1318900kQS2.LIZ;
                    if (lynxBaseUI3 instanceof UIComponent) {
                        InterfaceC1313090kH5 interfaceC1313090kH5 = lynxBaseUI3.mParent;
                        if (interfaceC1313090kH5 instanceof UIList) {
                            UIList uIList = (UIList) interfaceC1313090kH5;
                            String str2 = ((UIComponent) lynxBaseUI3).LLILLJJLI;
                            if (!uIList.LLJLIL.containsKey(str2)) {
                                uIList.LLJL.add(str2);
                            }
                            uIList.LLJLIL.put(str2, arrayList5);
                        }
                    }
                    arrayList4.addAll(arrayList5);
                } else {
                    arrayList4.add(c1318900kQS2);
                }
            }
            arrayList.clear();
            if (z2) {
                UIList uIList2 = (UIList) lynxBaseUI;
                Iterator<String> it4 = uIList2.LLJL.iterator();
                while (it4.hasNext()) {
                    arrayList4.addAll(uIList2.LLJLIL.get(it4.next()));
                }
            }
            arrayList.addAll(arrayList4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.lynx.tasm.behavior.ui.LynxBaseUI r6, java.util.ArrayList<X.C1318900kQS> r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L73
            if (r6 == 0) goto L73
            boolean r0 = r6 instanceof com.lynx.tasm.behavior.ui.LynxUI
            if (r0 == 0) goto L13
            r0 = r6
            com.lynx.tasm.behavior.ui.LynxUI r0 = (com.lynx.tasm.behavior.ui.LynxUI) r0
            T extends android.view.View r0 = r0.mView
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L73
        L13:
            boolean r0 = r6 instanceof X.InterfaceC1313080kH4
            if (r0 != 0) goto L73
            java.util.ArrayList<java.lang.String> r1 = r6.mAccessibilityElements
            java.util.ArrayList<java.lang.String> r0 = r6.mAccessibilityElementsA11y
            r4 = 1
            if (r1 != 0) goto L63
            if (r0 != 0) goto L63
            java.util.List r0 = r6.getChildren()
            int r3 = r0.size()
            int r3 = r3 - r4
        L29:
            if (r3 < 0) goto L5f
            java.util.List r0 = r6.getChildren()
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.lynx.tasm.behavior.ui.LynxBaseUI r2 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r2
            boolean r0 = r2 instanceof com.lynx.tasm.behavior.ui.LynxUI
            if (r0 == 0) goto L5b
            r0 = r2
            com.lynx.tasm.behavior.ui.LynxUI r0 = (com.lynx.tasm.behavior.ui.LynxUI) r0
            T extends android.view.View r0 = r0.mView
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L58
            boolean r0 = r2.isAccessibilityHostUI()
            if (r0 == 0) goto L5b
            android.graphics.Rect r1 = LJI(r2)
            X.0kQS r0 = new X.0kQS
            r0.<init>(r2, r1)
            r0.LIZLLL = r4
            r7.add(r0)
        L58:
            int r3 = r3 + (-1)
            goto L29
        L5b:
            r5.LIZLLL(r2, r7)
            goto L58
        L5f:
            r5.LJIIIZ(r6, r7)
            return
        L63:
            android.graphics.Rect r1 = LJI(r6)
            X.0kQS r0 = new X.0kQS
            r0.<init>(r6, r1)
            r0.LIZJ = r4
            r7.add(r0)
            r5.LLILZLL = r4
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1318810kQJ.LIZLLL(com.lynx.tasm.behavior.ui.LynxBaseUI, java.util.ArrayList):void");
    }

    public final boolean LJIIIIZZ(LynxBaseUI lynxBaseUI, Rect rect) {
        if (lynxBaseUI == null) {
            return false;
        }
        Rect rect2 = new Rect();
        if (lynxBaseUI instanceof LynxUI) {
            View view = ((LynxUI) lynxBaseUI).mView;
            if (lynxBaseUI instanceof UIShadowProxy) {
                LynxBaseUI lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI).LL;
                if (lynxBaseUI2 instanceof LynxUI) {
                    view = ((LynxUI) lynxBaseUI2).mView;
                }
            }
            if (view.getGlobalVisibleRect(rect)) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect.offset(iArr[0] - rect.left, iArr[1] - rect.top);
                return true;
            }
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            LynxBaseUI parentBaseUI = lynxBaseUI;
            while ((parentBaseUI instanceof LynxFlattenUI) && parentBaseUI != this.LLILLJJLI) {
                rect2.left += parentBaseUI.getOriginLeft();
                rect2.top += parentBaseUI.getOriginTop();
                parentBaseUI = parentBaseUI.getParentBaseUI();
            }
            if (parentBaseUI != null && (parentBaseUI instanceof LynxUI)) {
                View accessibilityHostView = ((LynxUI) parentBaseUI).mView;
                if (parentBaseUI instanceof UIGroup) {
                    accessibilityHostView = ((UIGroup) parentBaseUI).getAccessibilityHostView();
                }
                Rect rect3 = new Rect();
                int[] iArr2 = new int[2];
                if (accessibilityHostView.getLocalVisibleRect(rect3)) {
                    rect2.right = rect2.left + lynxBaseUI.getWidth();
                    rect2.bottom = rect2.top + lynxBaseUI.getHeight();
                    if (rect2.intersect(rect3)) {
                        accessibilityHostView.getLocationOnScreen(iArr2);
                        rect.set(rect2);
                        rect.offset(iArr2[0] - accessibilityHostView.getScrollX(), iArr2[1] - accessibilityHostView.getScrollY());
                        return true;
                    }
                }
            }
        }
        rect.set(0, 0, lynxBaseUI.getWidth(), lynxBaseUI.getHeight());
        return false;
    }

    public final void LJIIIZ(LynxBaseUI lynxBaseUI, ArrayList<C1318900kQS> arrayList) {
        if (lynxBaseUI != null && lynxBaseUI != this.LLILLJJLI) {
            if (lynxBaseUI instanceof UIShadowProxy) {
                lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LL;
            }
            if (LJIIJ(lynxBaseUI)) {
                arrayList.add(new C1318900kQS(lynxBaseUI, LJI(lynxBaseUI)));
            }
        }
    }

    @Override // X.C1318860kQO
    public final List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str, int i) {
        LynxBaseUI lynxBaseUI;
        String strLJFF;
        String strLJFF2;
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        String lowerCase = str.toLowerCase();
        if (i == -1) {
            for (int i2 = 0; i2 < this.LLIZ.size(); i2++) {
                if (((C1318900kQS) ListProtector.get(this.LLIZ, i2)).LIZ != null && (strLJFF2 = LJFF(((C1318900kQS) ListProtector.get(this.LLIZ, i2)).LIZ)) != null) {
                    strLJFF2.toString();
                    if (strLJFF2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(createAccessibilityNodeInfo(i2));
                    }
                }
            }
        } else if (i > -1 && i < this.LLIZ.size() && (lynxBaseUI = ((C1318900kQS) ListProtector.get(this.LLIZ, i)).LIZ) != null && (strLJFF = LJFF(lynxBaseUI)) != null) {
            strLJFF.toString();
            if (strLJFF.toLowerCase().contains(lowerCase)) {
                arrayList.add(createAccessibilityNodeInfo(i));
            }
        }
        return arrayList;
    }

    @Override // X.C1318860kQO
    public final boolean performAction(int i, int i2, Bundle bundle) {
        s sVar;
        boolean zRequestChildUIRectangleOnScreen = false;
        if (i >= -1 && i < this.LLIZ.size()) {
            WeakReference<C1318820kQK> weakReference = this.LL;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            C1318820kQK c1318820kQK = this.LL.get();
            if (i != -1) {
                LynxBaseUI lynxBaseUI = ((C1318900kQS) ListProtector.get(this.LLIZ, i)).LIZ;
                c1318820kQK.getClass();
                if (i2 != 16) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 != 16908342 || lynxBaseUI == null) {
                                return false;
                            }
                            if (lynxBaseUI instanceof LynxUI) {
                                return ((LynxUI) lynxBaseUI).mView.performAccessibilityAction(i2, bundle);
                            }
                            if (!(lynxBaseUI instanceof LynxFlattenUI)) {
                                return false;
                            }
                            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
                            Rect rect = new Rect(0, 0, lynxBaseUI.getWidth(), lynxBaseUI.getHeight());
                            Rect rect2 = new Rect();
                            while (true) {
                                LynxBaseUI lynxBaseUI2 = lynxBaseUI;
                                lynxBaseUI = parentBaseUI;
                                if (lynxBaseUI == null || lynxBaseUI == c1318820kQK.LIZ) {
                                    return zRequestChildUIRectangleOnScreen;
                                }
                                rect2.set(rect);
                                zRequestChildUIRectangleOnScreen |= lynxBaseUI.requestChildUIRectangleOnScreen(lynxBaseUI2, rect2, true);
                                rect.offset(lynxBaseUI2.getOriginLeft() - lynxBaseUI2.getScrollX(), lynxBaseUI2.getOriginTop() - lynxBaseUI2.getScrollY());
                                parentBaseUI = lynxBaseUI.getParentBaseUI();
                            }
                        } else {
                            if (c1318820kQK.LIZJ != i) {
                                return false;
                            }
                            c1318820kQK.LIZJ = Integer.MIN_VALUE;
                            c1318820kQK.LIZIZ.invalidate();
                            c1318820kQK.LJI = null;
                            c1318820kQK.LIZLLL(i, 65536);
                            return true;
                        }
                    } else {
                        return c1318820kQK.LIZJ(i);
                    }
                } else {
                    C1318900kQS c1318900kQS = (C1318900kQS) ListProtector.get(c1318820kQK.LJ.LLIZ, i);
                    LynxBaseUI lynxBaseUI3 = c1318900kQS.LIZ;
                    if (lynxBaseUI3 == null || (sVar = lynxBaseUI3.mContext) == null || sVar.LLIZ == null || !lynxBaseUI3.mAccessibilityEnableTap) {
                        return false;
                    }
                    Rect rect3 = c1318900kQS.LIZIZ;
                    C1298900juC c1298900juC = new C1298900juC(rect3.centerX(), rect3.centerY());
                    C1298900juC c1298900juC2 = new C1298900juC(rect3.centerX() - rect3.left, rect3.centerY() - rect3.top);
                    if (lynxBaseUI3.getEvents() != null) {
                        Map<String, C1299120juY> events = lynxBaseUI3.getEvents();
                        if (events.containsKey("tap")) {
                            lynxBaseUI3.mContext.LLIZ.LIZLLL(new C1298740jtw(lynxBaseUI3.getSign(), "tap", c1298900juC2, c1298900juC2, c1298900juC));
                        }
                        if (events.containsKey("click")) {
                            lynxBaseUI3.mContext.LLIZ.LIZLLL(new C1298740jtw(lynxBaseUI3.getSign(), "click", c1298900juC2, c1298900juC2, c1298900juC));
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
            } else {
                return c1318820kQK.LIZIZ.performAccessibilityAction(i2, bundle);
            }
        } else {
            LynxLog.e("LynxA11yNodeProvider", "performAction: check virtualViewId failed");
            return false;
        }
    }
}
