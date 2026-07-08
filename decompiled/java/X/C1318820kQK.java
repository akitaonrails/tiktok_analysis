package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import j27.s;

/* JADX INFO: renamed from: X.0kQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318820kQK extends C20094213jo {
    public final UIGroup LIZ;
    public final View LIZIZ;
    public C1318810kQJ LJ;
    public LynxBaseUI LJI;
    public int LIZJ = Integer.MIN_VALUE;
    public int LIZLLL = Integer.MIN_VALUE;
    public boolean LJFF = true;

    public final boolean LIZIZ() {
        s sVar;
        C1310360kCg c1310360kCgLJIIL;
        UIGroup uIGroup = this.LIZ;
        if (uIGroup == null || (sVar = uIGroup.mContext) == null || (c1310360kCgLJIIL = sVar.LJIIL()) == null) {
            return false;
        }
        return c1310360kCgLJIIL.LJIIJ();
    }

    public C1318820kQK(UIGroup uIGroup) {
        if (uIGroup != null && uIGroup.getAccessibilityHostView() != null) {
            this.LIZ = uIGroup;
            View accessibilityHostView = uIGroup.getAccessibilityHostView();
            this.LIZIZ = accessibilityHostView;
            C786410Ut5.R2(uIGroup.mContext, "accessibility");
            this.LJ = new C1318810kQJ(this);
            accessibilityHostView.setFocusable(true);
            if (accessibilityHostView.getImportantForAccessibility() == 0) {
                accessibilityHostView.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("host ui or host view is null");
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        if (!LIZIZ()) {
            return false;
        }
        InterfaceC1311410kEN interfaceC1311410kENHitTest = this.LIZ.hitTest((int) motionEvent.getX(), (int) motionEvent.getY());
        while (true) {
            if (interfaceC1311410kENHitTest == null) {
                break;
            }
            if (!(interfaceC1311410kENHitTest instanceof LynxBaseUI)) {
                interfaceC1311410kENHitTest = interfaceC1311410kENHitTest.parent();
            } else if (interfaceC1311410kENHitTest instanceof LynxBaseUI) {
                LynxBaseUI parentBaseUI = (LynxBaseUI) interfaceC1311410kENHitTest;
                while (!this.LJ.LJIIJ(parentBaseUI)) {
                    parentBaseUI = parentBaseUI.getParentBaseUI();
                    if (parentBaseUI == null) {
                        return false;
                    }
                }
                int iLJ = this.LJ.LJ(parentBaseUI);
                if (iLJ == -1) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action != 9) {
                    if (action != 10) {
                        return false;
                    }
                    int i = this.LIZLLL;
                    if (i != Integer.MIN_VALUE && i != Integer.MIN_VALUE) {
                        LIZLLL(Integer.MIN_VALUE, 128);
                        LIZLLL(this.LIZLLL, 256);
                        this.LIZLLL = Integer.MIN_VALUE;
                    }
                    return true;
                }
                if (this.LIZLLL != iLJ) {
                    LIZLLL(iLJ, 128);
                    LIZLLL(this.LIZLLL, 256);
                    this.LIZLLL = iLJ;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        int i2;
        s sVar;
        if (!LIZIZ() || (i2 = this.LIZJ) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.LIZJ = Integer.MIN_VALUE;
            this.LIZIZ.invalidate();
            this.LJI = null;
            LIZLLL(i2, 65536);
        }
        this.LIZJ = i;
        this.LJI = ((C1318900kQS) ListProtector.get(this.LJ.LLIZ, i)).LIZ;
        this.LIZIZ.invalidate();
        LIZLLL(i, 32768);
        UIGroup uIGroup = this.LIZ;
        if (uIGroup != null && (sVar = uIGroup.mContext) != null && sVar.LJIIL() != null) {
            C1310360kCg.LJIIJJI(this.LJI);
            return true;
        }
        return true;
    }

    @Override // X.C20094213jo
    public final C1318860kQO getAccessibilityNodeProvider(View view) {
        if (this.LJ == null) {
            this.LJ = new C1318810kQJ(this);
        }
        return this.LJ;
    }

    public final void LIZLLL(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !LIZIZ() || (parent = this.LIZIZ.getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatLIZ = this.LJ.LIZ(i);
            if (accessibilityNodeInfoCompatLIZ != null) {
                accessibilityEventObtain.getText().add(accessibilityNodeInfoCompatLIZ.getText());
                accessibilityEventObtain.setContentDescription(accessibilityNodeInfoCompatLIZ.getContentDescription());
                accessibilityEventObtain.setScrollable(accessibilityNodeInfoCompatLIZ.isScrollable());
                accessibilityEventObtain.setPassword(accessibilityNodeInfoCompatLIZ.isPassword());
                accessibilityEventObtain.setEnabled(accessibilityNodeInfoCompatLIZ.isEnabled());
                accessibilityEventObtain.setChecked(accessibilityNodeInfoCompatLIZ.isChecked());
                accessibilityEventObtain.setClassName(accessibilityNodeInfoCompatLIZ.getClassName());
            }
            accessibilityEventObtain.setSource(this.LIZIZ, i);
            accessibilityEventObtain.setPackageName(this.LIZIZ.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.LIZIZ.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(this.LIZIZ, accessibilityEventObtain);
    }
}
