package X;

import Y.ACListenerS124S0200000_21;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0m51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382490m51 implements InterfaceC1370040lkw {
    public BottomSheetBehavior<FrameLayout> LIZ;
    public boolean LIZIZ = true;
    public boolean LIZJ = true;
    public boolean LIZLLL;

    @Override // X.InterfaceC1370040lkw
    public final void LIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC1370040lkw
    public final void LIZIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC1370040lkw
    public final void LJFF(Dialog dialog) {
    }

    @Override // X.InterfaceC1370040lkw
    public final void LIZJ(boolean z) {
        if (this.LIZIZ != z) {
            this.LIZIZ = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LIZ;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // X.InterfaceC1370040lkw
    public final void LJ(boolean z) {
        if (z && !this.LIZIZ) {
            this.LIZIZ = true;
        }
        this.LIZJ = z;
        this.LIZLLL = true;
    }

    @Override // X.InterfaceC1370040lkw
    public final View LIZLLL(final Dialog dialog, int i, View view, ViewGroup.LayoutParams layoutParams, C1361400lX0 c1361400lX0) {
        View viewLJLLJ = C786410Ut5.LJLLJ(c1361400lX0, R.layout.bji, null);
        ViewGroup viewGroup = (ViewGroup) viewLJLLJ.findViewById(R.id.exx);
        if (i != 0 && view == null) {
            view = C786410Ut5.Td(C786410Ut5.ne(c1361400lX0), i, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fpl);
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewGroup2);
        this.LIZ = bottomSheetBehaviorFrom;
        if (bottomSheetBehaviorFrom != null) {
            bottomSheetBehaviorFrom.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0m52
                @Override // X.AbstractC1177930gl5
                public final void LIZJ(View view2, float f) {
                }

                @Override // X.AbstractC1177930gl5
                public final void LIZLLL(int i2, View view2) {
                    if (i2 == 5) {
                        dialog.cancel();
                    }
                }
            });
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LIZ;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setHideable(this.LIZIZ);
        }
        if (layoutParams == null) {
            viewGroup2.addView(view);
        } else {
            viewGroup2.addView(view, layoutParams);
        }
        C786410Ut5.I7(new ACListenerS124S0200000_21(dialog, this, 54), viewGroup.findViewById(R.id.yg_));
        q0.LJIJ(viewGroup2, new C20094213jo() { // from class: X.0m50
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (this.LIZ.LIZIZ) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                } else {
                    accessibilityNodeInfoCompat.setDismissable(false);
                }
            }

            @Override // X.C20094213jo
            public final boolean performAccessibilityAction(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576 && this.LIZ.LIZIZ) {
                    dialog.cancel();
                    return true;
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        viewGroup2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0m53
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        return viewLJLLJ;
    }
}
