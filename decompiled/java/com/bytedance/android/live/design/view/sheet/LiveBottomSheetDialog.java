package com.bytedance.android.live.design.view.sheet;

import X.C0TVI;
import X.C14K9;
import X.C16BO;
import X.C16HB;
import X.C20750916Hz;
import X.C419990GdR;
import X.C786410Ut5;
import X.InterfaceC1107740evs;
import Y.ACListenerS165S0100000_31;
import Y.ATListenerS167S0000000_31;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import u4.q0;

/* JADX INFO: loaded from: classes32.dex */
public class LiveBottomSheetDialog extends LifecycleAwareDialog implements InterfaceC1107740evs {
    public static final /* synthetic */ int LLJJJ = 0;
    public LiveBottomSheetBehavior<FrameLayout> LLJILJIL;
    public FrameLayout LLJILJILJ;
    public FrameLayout LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public float LLJJIJI;
    public String LLJJIJIIJIL;
    public final C16BO LLJJIJIL;

    public LiveBottomSheetDialog() {
        throw null;
    }

    @Override // X.C19GJ
    public final boolean LJLI() {
        return true;
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLIIL() {
        if (this.LLJILJILJ == null) {
            FrameLayout frameLayout = (FrameLayout) C786410Ut5.LJLLJ(getContext(), R.layout.dbu, null);
            this.LLJILJILJ = frameLayout;
            frameLayout.findViewById(R.id.exx);
            FrameLayout frameLayout2 = (FrameLayout) this.LLJILJILJ.findViewById(R.id.fpl);
            this.LLJILLL = frameLayout2;
            C14K9.LJIJJ(frameLayout2, new C0TVI() { // from class: X.16BP
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    return c20246014Ju;
                }
            });
            LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehaviorLIZLLL = LiveBottomSheetBehavior.LIZLLL(this.LLJILLL);
            this.LLJILJIL = liveBottomSheetBehaviorLIZLLL;
            liveBottomSheetBehaviorLIZLLL.LIZ(this.LLJJIJIL);
            this.LLJILJIL.setHideable(this.LLJJ);
            this.LLJILJILJ.addOnLayoutChangeListener(new C16HB(this, 8));
        }
    }

    public final void LJLIIIL() {
        if (getWindow() != null) {
            LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.LLJILJIL;
            int expandedOffset = liveBottomSheetBehavior.LJJII - liveBottomSheetBehavior.getExpandedOffset();
            getWindow().setDimAmount(C419990GdR.LIZ(expandedOffset > 0 ? (this.LLJILJIL.LJJII - this.LLJILLL.getTop()) / expandedOffset : 1.0f, 0.0f, 1.0f) * this.LLJJIJI);
        }
    }

    @Override // X.C19GJ, X.C19EK, android.app.Dialog
    public void onStart() throws JSONException {
        super.onStart();
        LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.LLJILJIL;
        if (liveBottomSheetBehavior == null || liveBottomSheetBehavior.LJIJJ != 5) {
            return;
        }
        if (liveBottomSheetBehavior.LJIILLIIL) {
            liveBottomSheetBehavior.setState(3);
        } else {
            liveBottomSheetBehavior.setState(4);
        }
    }

    @Override // X.InterfaceC1107740evs
    public final String getTag() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C19EK, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    public LiveBottomSheetDialog(Context context) {
        this(context, 0);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                i = R.style.as;
            } else if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                i = R.style.au;
            } else {
                i = R.style.at;
            }
            window.setWindowAnimations(i);
            if (Build.VERSION.SDK_INT >= 35 && !window.isFloating()) {
                C14K9.LJIJJ(window.getDecorView(), new C0TVI() { // from class: X.14KH
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                        view.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                        return C20246014Ju.LIZIZ;
                    }
                });
            }
        }
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.backgroundDimAmount, typedValue, true);
        this.LLJJIJI = typedValue.getFloat();
    }

    @Override // X.C19GJ, android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.LLJJ != z) {
            this.LLJJ = z;
            LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.LLJILJIL;
            if (liveBottomSheetBehavior != null) {
                liveBottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // X.C19GJ, android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.LLJJ) {
            this.LLJJ = true;
        }
        this.LLJJI = z;
        this.LLJJIII = true;
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(LJLIL(view, 0, null));
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(LJLIL(null, i, null));
    }

    public LiveBottomSheetDialog(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.c6h, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = R.style.su;
            }
        }
        super(context, i, 0);
        this.LLJJ = true;
        this.LLJJI = true;
        this.LLJJIJIL = new C16BO(this);
        LJJLL(1);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJLIL(view, 0, layoutParams));
    }

    public final View LJLIL(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LJLIIL();
        ViewGroup viewGroup = (ViewGroup) this.LLJILJILJ.findViewById(R.id.exx);
        if (i != 0 && view == null) {
            view = C786410Ut5.Td(getLayoutInflater(), i, viewGroup, false);
        }
        C786410Ut5.LJJJJIZL(this.LLJILLL);
        if (layoutParams == null) {
            this.LLJILLL.addView(view, -1, -1);
        } else {
            this.LLJILLL.addView(view, layoutParams);
        }
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 207), viewGroup.findViewById(R.id.yg_));
        q0.LJIJ(this.LLJILLL, new C20750916Hz(this, 2));
        this.LLJILLL.setOnTouchListener(new ATListenerS167S0000000_31(1));
        return this.LLJILJILJ;
    }
}
