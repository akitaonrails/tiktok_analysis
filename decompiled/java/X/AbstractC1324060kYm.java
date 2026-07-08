package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1324060kYm extends C20094213jo {
    public static final Rect LJIIJ = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final C1324100kYq LJIIJJI = new InterfaceC1324110kYr<AccessibilityNodeInfoCompat>() { // from class: X.0kYq
    };
    public static final C1324120kYs LJIIL = new Object() { // from class: X.0kYs
    };
    public final AccessibilityManager LJ;
    public final View LJFF;
    public C1324070kYn LJI;
    public final Rect LIZ = new Rect();
    public final Rect LIZIZ = new Rect();
    public final Rect LIZJ = new Rect();
    public final int[] LIZLLL = new int[2];
    public int LJII = Integer.MIN_VALUE;
    public int LJIIIIZZ = Integer.MIN_VALUE;
    public int LJIIIZ = Integer.MIN_VALUE;

    public abstract void LIZJ(List<Integer> list);

    public abstract boolean LJFF(int i, int i2);

    public void LJI(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void LJII(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void LJIIIIZZ(int i, boolean z) {
    }

    public AbstractC1324060kYm(View view) {
        if (view != null) {
            this.LJFF = view;
            this.LJ = (AccessibilityManager) C786410Ut5.H2(view.getContext(), "accessibility");
            view.setFocusable(true);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final boolean LIZ(int i) {
        if (this.LJIIIIZZ != i) {
            return false;
        }
        this.LJIIIIZZ = Integer.MIN_VALUE;
        LJIIIIZZ(i, false);
        LJIIJ(i, 8);
        return true;
    }

    public final AccessibilityNodeInfoCompat LIZIZ(int i) {
        boolean z;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        accessibilityNodeInfoCompatObtain.setEnabled(true);
        accessibilityNodeInfoCompatObtain.setFocusable(true);
        accessibilityNodeInfoCompatObtain.setClassName("android.view.View");
        Rect rect = LJIIJ;
        accessibilityNodeInfoCompatObtain.setBoundsInParent(rect);
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(rect);
        accessibilityNodeInfoCompatObtain.setParent(this.LJFF);
        LJII(i, accessibilityNodeInfoCompatObtain);
        if (accessibilityNodeInfoCompatObtain.getText() == null && accessibilityNodeInfoCompatObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatObtain.getBoundsInParent(this.LIZIZ);
        if (!this.LIZIZ.equals(rect)) {
            int actions = accessibilityNodeInfoCompatObtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    accessibilityNodeInfoCompatObtain.setPackageName(this.LJFF.getContext().getPackageName());
                    accessibilityNodeInfoCompatObtain.setSource(this.LJFF, i);
                    if (this.LJII == i) {
                        accessibilityNodeInfoCompatObtain.setAccessibilityFocused(true);
                        accessibilityNodeInfoCompatObtain.addAction(128);
                    } else {
                        accessibilityNodeInfoCompatObtain.setAccessibilityFocused(false);
                        accessibilityNodeInfoCompatObtain.addAction(64);
                    }
                    if (this.LJIIIIZZ == i) {
                        z = true;
                        accessibilityNodeInfoCompatObtain.addAction(2);
                    } else {
                        z = false;
                        if (accessibilityNodeInfoCompatObtain.isFocusable()) {
                            accessibilityNodeInfoCompatObtain.addAction(1);
                        }
                    }
                    accessibilityNodeInfoCompatObtain.setFocused(z);
                    this.LJFF.getLocationOnScreen(this.LIZLLL);
                    accessibilityNodeInfoCompatObtain.getBoundsInScreen(this.LIZ);
                    if (this.LIZ.equals(rect)) {
                        accessibilityNodeInfoCompatObtain.getBoundsInParent(this.LIZ);
                        if (accessibilityNodeInfoCompatObtain.mParentVirtualDescendantId != -1) {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain2 = AccessibilityNodeInfoCompat.obtain();
                            for (int i2 = accessibilityNodeInfoCompatObtain.mParentVirtualDescendantId; i2 != -1; i2 = accessibilityNodeInfoCompatObtain2.mParentVirtualDescendantId) {
                                accessibilityNodeInfoCompatObtain2.setParent(this.LJFF, -1);
                                accessibilityNodeInfoCompatObtain2.setBoundsInParent(LJIIJ);
                                LJII(i2, accessibilityNodeInfoCompatObtain2);
                                accessibilityNodeInfoCompatObtain2.getBoundsInParent(this.LIZIZ);
                                Rect rect2 = this.LIZ;
                                Rect rect3 = this.LIZIZ;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            accessibilityNodeInfoCompatObtain2.recycle();
                        }
                        this.LIZ.offset(this.LIZLLL[0] - this.LJFF.getScrollX(), this.LIZLLL[1] - this.LJFF.getScrollY());
                    }
                    if (this.LJFF.getLocalVisibleRect(this.LIZJ)) {
                        this.LIZJ.offset(this.LIZLLL[0] - this.LJFF.getScrollX(), this.LIZLLL[1] - this.LJFF.getScrollY());
                        if (this.LIZ.intersect(this.LIZJ)) {
                            accessibilityNodeInfoCompatObtain.setBoundsInScreen(this.LIZ);
                            Rect rect4 = this.LIZ;
                            if (rect4 != null && !rect4.isEmpty() && this.LJFF.getWindowVisibility() == 0) {
                                Object parent = this.LJFF.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view = (View) parent;
                                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfoCompatObtain.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return accessibilityNodeInfoCompatObtain;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final AccessibilityNodeInfoCompat LJ(int i) {
        if (i == -1) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(this.LJFF);
            this.LJFF.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompatObtain.unwrap());
            ArrayList arrayList = new ArrayList();
            LIZJ(arrayList);
            if (accessibilityNodeInfoCompatObtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                accessibilityNodeInfoCompatObtain.addChild(this.LJFF, ((Integer) ListProtector.get(arrayList, i2)).intValue());
            }
            return accessibilityNodeInfoCompatObtain;
        }
        return LIZIZ(i);
    }

    public final boolean LJIIIZ(int i) {
        int i2;
        if ((!this.LJFF.isFocused() && !this.LJFF.requestFocus()) || (i2 = this.LJIIIIZZ) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            LIZ(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.LJIIIIZZ = i;
        LJIIIIZZ(i, true);
        LJIIJ(i, 8);
        return true;
    }

    public final void LJIIJJI(int i) {
        int i2 = this.LJIIIZ;
        if (i2 == i) {
            return;
        }
        this.LJIIIZ = i;
        LJIIJ(i, 128);
        LJIIJ(i2, 256);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kYn] */
    @Override // X.C20094213jo
    public final C1318860kQO getAccessibilityNodeProvider(View view) {
        if (this.LJI == null) {
            this.LJI = new C1318860kQO() { // from class: X.0kYn
                @Override // X.C1318860kQO
                public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
                    return AccessibilityNodeInfoCompat.obtain(this.LL.LJ(i));
                }

                @Override // X.C1318860kQO
                public final AccessibilityNodeInfoCompat findFocus(int i) {
                    int i2;
                    if (i == 2) {
                        i2 = this.LL.LJII;
                    } else {
                        i2 = this.LL.LJIIIIZZ;
                    }
                    if (i2 == Integer.MIN_VALUE) {
                        return null;
                    }
                    return createAccessibilityNodeInfo(i2);
                }

                @Override // X.C1318860kQO
                public final boolean performAction(int i, int i2, Bundle bundle) {
                    int i3;
                    AbstractC1324060kYm abstractC1324060kYm = this.LL;
                    if (i != -1) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 64) {
                                    if (i2 != 128) {
                                        return abstractC1324060kYm.LJFF(i, i2);
                                    }
                                    if (abstractC1324060kYm.LJII == i) {
                                        abstractC1324060kYm.LJII = Integer.MIN_VALUE;
                                        abstractC1324060kYm.LJFF.invalidate();
                                        abstractC1324060kYm.LJIIJ(i, 65536);
                                        return true;
                                    }
                                    return false;
                                }
                                if (abstractC1324060kYm.LJ.isEnabled() && abstractC1324060kYm.LJ.isTouchExplorationEnabled() && (i3 = abstractC1324060kYm.LJII) != i) {
                                    if (i3 != Integer.MIN_VALUE) {
                                        abstractC1324060kYm.LJII = Integer.MIN_VALUE;
                                        abstractC1324060kYm.LJFF.invalidate();
                                        abstractC1324060kYm.LJIIJ(i3, 65536);
                                    }
                                    abstractC1324060kYm.LJII = i;
                                    abstractC1324060kYm.LJFF.invalidate();
                                    abstractC1324060kYm.LJIIJ(i, 32768);
                                    return true;
                                }
                                return false;
                            }
                            return abstractC1324060kYm.LIZ(i);
                        }
                        return abstractC1324060kYm.LJIIIZ(i);
                    }
                    return abstractC1324060kYm.LJFF.performAccessibilityAction(i2, bundle);
                }
            };
        }
        return this.LJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1324060kYm.LIZLLL(int, android.graphics.Rect):boolean");
    }

    public final void LJIIJ(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.LJ.isEnabled() || (parent = this.LJFF.getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatLJ = LJ(i);
            accessibilityEventObtain.getText().add(accessibilityNodeInfoCompatLJ.getText());
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfoCompatLJ.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfoCompatLJ.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfoCompatLJ.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfoCompatLJ.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfoCompatLJ.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfoCompatLJ.getClassName());
            accessibilityEventObtain.setSource(this.LJFF, i);
            accessibilityEventObtain.setPackageName(this.LJFF.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.LJFF.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(this.LJFF, accessibilityEventObtain);
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        LJI(accessibilityNodeInfoCompat);
    }
}
