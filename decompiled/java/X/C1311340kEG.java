package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kEG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311340kEG {
    public final WeakReference<UIGroup> LIZ;
    public boolean LIZIZ;
    public final ArrayList<WeakReference<LynxBaseUI>> LIZJ;
    public final ArrayList<WeakReference<LynxBaseUI>> LIZLLL;
    public final HashMap<Integer, WeakReference<LynxBaseUI>> LJ;

    public C1311340kEG(UIGroup uIGroup) {
        if (uIGroup.mView == 0) {
            LynxLog.e("LynxAccessibilityHelper", "Construct LynxAccessibilityHelper with null host ui or view");
            return;
        }
        this.LIZ = new WeakReference<>(uIGroup);
        this.LIZLLL = new ArrayList<>();
        this.LIZJ = new ArrayList<>();
        this.LJ = new HashMap<>();
    }

    public static void LIZJ(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI != null && lynxBaseUI.getChildren() != null) {
            int size = lynxBaseUI.getChildren().size();
            for (int i = 0; i < size; i++) {
                LynxBaseUI childAt = lynxBaseUI.getChildAt(i);
                if (childAt instanceof LynxUI) {
                    ((LynxUI) childAt).mView.setImportantForAccessibility(2);
                }
                LIZJ(childAt);
            }
        }
    }

    public final boolean LIZ(LynxBaseUI lynxBaseUI) {
        boolean z;
        UIGroup uIGroup;
        if (lynxBaseUI == null) {
            return false;
        }
        int i = lynxBaseUI.mAccessibilityElementStatus;
        if (i == -1) {
            z = this.LIZIZ;
        } else if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        WeakReference<UIGroup> weakReference = this.LIZ;
        if (weakReference != null) {
            uIGroup = weakReference.get();
        } else {
            uIGroup = null;
        }
        if (z && uIGroup != null && !this.LJ.isEmpty()) {
            while (lynxBaseUI != uIGroup) {
                if (this.LJ.containsKey(Integer.valueOf(lynxBaseUI.getSign()))) {
                    return true;
                }
                lynxBaseUI = lynxBaseUI.getParentBaseUI();
                if (lynxBaseUI == null) {
                    break;
                }
            }
            return false;
        }
        return z;
    }

    public final void LIZIZ(LynxBaseUI lynxBaseUI) {
        C1311720kEs c1311720kEsLJIILIIL;
        boolean z;
        LynxBaseUI lynxBaseUILJIIL;
        LynxUI lynxUI;
        T t;
        UIGroup uIGroup;
        s sVar;
        WeakReference<UIGroup> weakReference = this.LIZ;
        if (weakReference != null && weakReference.get() != null && (uIGroup = this.LIZ.get()) != null && (sVar = uIGroup.mContext) != null) {
            c1311720kEsLJIILIIL = sVar.LJIILIIL();
        } else {
            c1311720kEsLJIILIIL = null;
        }
        if (lynxBaseUI != null && c1311720kEsLJIILIIL != null) {
            if (lynxBaseUI.mAccessibilityElementsA11y == null && lynxBaseUI.mAccessibilityElements == null) {
                return;
            }
            LIZJ(lynxBaseUI);
            ArrayList<String> arrayList = lynxBaseUI.mAccessibilityElementsA11y;
            int i = 0;
            if (arrayList == null) {
                arrayList = lynxBaseUI.mAccessibilityElements;
                z = false;
            } else {
                z = true;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str != null) {
                    if (z) {
                        lynxBaseUILJIIL = c1311720kEsLJIILIIL.LJIIJ(str);
                    } else {
                        lynxBaseUILJIIL = c1311720kEsLJIILIIL.LJIIL(str);
                    }
                    if ((lynxBaseUILJIIL instanceof LynxUI) && (t = (lynxUI = (LynxUI) lynxBaseUILJIIL).mView) != 0) {
                        t.setImportantForAccessibility(1);
                        arrayList2.add(lynxUI);
                    }
                }
            }
            if (arrayList2.isEmpty() || arrayList2.size() == 1) {
                return;
            }
            int size = arrayList2.size();
            while (i < size - 1) {
                LynxUI lynxUI2 = (LynxUI) ListProtector.get(arrayList2, i);
                i++;
                LynxUI lynxUI3 = (LynxUI) ListProtector.get(arrayList2, i);
                T t2 = lynxUI2.mView;
                T t3 = lynxUI3.mView;
                t2.setId(lynxUI2.getSign());
                t3.setId(lynxUI3.getSign());
                t2.setAccessibilityTraversalBefore(lynxUI3.getSign());
            }
        }
    }
}
