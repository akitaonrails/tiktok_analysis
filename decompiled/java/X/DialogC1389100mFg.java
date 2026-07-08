package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0mFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogC1389100mFg extends C19GU {
    public BottomSheetBehavior<FrameLayout> LLILZLL;
    public FrameLayout LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C1389120mFi LLJIJIL;

    public DialogC1389100mFg() {
        throw null;
    }

    public final boolean LJJZZIII() {
        throw null;
    }

    private void LJJZ() {
        if (this.LLIZ == null) {
            FrameLayout frameLayout = (FrameLayout) C786410Ut5.LJLLJ(getContext(), R.layout.bji, null);
            this.LLIZ = frameLayout;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout.findViewById(R.id.fpl));
            this.LLILZLL = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.LLJIJIL);
            this.LLILZLL.setHideable(this.LLIZLLLIL);
        }
    }

    public final BottomSheetBehavior<FrameLayout> LJJZZI() {
        if (this.LLILZLL == null) {
            LJJZ();
        }
        return this.LLILZLL;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        LJJZZI();
        super.cancel();
    }

    @Override // X.C19EK, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LLILZLL;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.LLILZLL.setState(4);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.LLIZLLLIL != z) {
            this.LLIZLLLIL = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LLILZLL;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
        }
        this.LLJ = z;
        this.LLJI = true;
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(LJL(view, 0, null));
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(LJL(null, i, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0mFi] */
    public DialogC1389100mFg(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.bcz, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = R.style.sq;
            }
        }
        super(context, i);
        this.LLIZLLLIL = true;
        this.LLJ = true;
        this.LLJIJIL = new AbstractC1177930gl5() { // from class: X.0mFi
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i2, View view) {
                if (i2 == 5) {
                    this.LIZ.cancel();
                }
            }
        };
        LJJLL(1);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJL(view, 0, layoutParams));
    }

    private View LJL(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LJJZ();
        ViewGroup viewGroup = (ViewGroup) this.LLIZ.findViewById(R.id.exx);
        if (i != 0 && view == null) {
            view = C786410Ut5.Td(getLayoutInflater(), i, viewGroup, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.LLIZ.findViewById(R.id.fpl);
        C786410Ut5.LJJJJIZL(frameLayout);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0mFh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DialogC1389100mFg dialogC1389100mFg = this.LL;
                if (dialogC1389100mFg.LLIZLLLIL && dialogC1389100mFg.isShowing()) {
                    DialogC1389100mFg dialogC1389100mFg2 = this.LL;
                    if (!dialogC1389100mFg2.LLJI) {
                        TypedArray typedArrayObtainStyledAttributes = dialogC1389100mFg2.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        dialogC1389100mFg2.LLJ = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        dialogC1389100mFg2.LLJI = true;
                    }
                    if (dialogC1389100mFg2.LLJ) {
                        this.LL.cancel();
                    }
                }
            }
        }, viewGroup.findViewById(R.id.yg_));
        q0.LJIJ(frameLayout, new C20094213jo() { // from class: X.0mFf
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (this.LIZ.LLIZLLLIL) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                } else {
                    accessibilityNodeInfoCompat.setDismissable(false);
                }
            }

            @Override // X.C20094213jo
            public final boolean performAccessibilityAction(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576) {
                    DialogC1389100mFg dialogC1389100mFg = this.LIZ;
                    if (dialogC1389100mFg.LLIZLLLIL) {
                        dialogC1389100mFg.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.0mFj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.LLIZ;
    }
}
