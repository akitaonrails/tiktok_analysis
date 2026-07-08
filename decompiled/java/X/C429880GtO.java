package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429880GtO extends FrameLayout implements InterfaceC1584710rLB {
    public final ISocialTabProtocol LL;
    public ConstraintLayout LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public int LLILZLL;
    public final C01GW LLIZ;

    private final boolean getHitTopTabUiAlignmentExp() {
        return ((Boolean) this.LLIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1584710rLB
    public final void LJIIL() {
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.eh);
        }
    }

    @Override // X.InterfaceC1584710rLB
    public final void LJIJJLI() {
        View view = this.LLILLL;
        if (view != null) {
            C339190DRl.LIZLLL(view);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            C339190DRl.LIZIZ(tuxTextView);
        }
    }

    @Override // X.InterfaceC1584710rLB
    public final void LJIL() {
        View view = this.LLILLL;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            C339190DRl.LIZIZ(tuxTextView);
        }
        this.LLILZLL = 0;
    }

    @Override // X.InterfaceC1584710rLB
    public final boolean LJJ() {
        TuxTextView tuxTextView = this.LLILZ;
        return tuxTextView != null && tuxTextView.getVisibility() == 0;
    }

    @Override // X.InterfaceC1584710rLB
    public final boolean Xd() {
        View view = this.LLILLL;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.InterfaceC1584710rLB
    public final String tag() {
        return this.LL.getTag();
    }

    @Override // X.InterfaceC1584710rLB
    public final void LJIJI() {
        LJIL();
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.ee);
        }
    }

    @Override // X.InterfaceC1584710rLB
    public int getDotCount() {
        return this.LLILZLL;
    }

    public final ISocialTabProtocol getProtocol() {
        return this.LL;
    }

    @Override // X.InterfaceC1584710rLB
    public View getTitleView() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1584710rLB
    public final void LJIJJ(int i) {
        View view = this.LLILLL;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        if (i > 99) {
            i = 99;
        } else if (i <= 0) {
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                C339190DRl.LIZIZ(tuxTextView);
            }
            this.LLILZLL = 0;
            return;
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            C339190DRl.LIZLLL(tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(String.valueOf(i));
        }
        this.LLILZLL = i;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LL.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public C429880GtO(Context context, ISocialTabProtocol iSocialTabProtocol) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams2;
        super(context);
        this.LL = iSocialTabProtocol;
        this.LLIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(468));
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null || C20673215v0.LIZLLL(R.layout.f_1, activityLIZ, this, true) == null) {
            C786410Ut5.Sd(R.layout.f_1, C786410Ut5.ne(context), this);
        }
        this.LLILLL = findViewById(R.id.wxi);
        this.LLILZ = (TuxTextView) findViewById(R.id.tv_tab_dot_count);
        this.LLILZIL = (TuxTextView) findViewById(R.id.wz3);
        this.LLILLJJLI = (ConstraintLayout) findViewById(R.id.wxb);
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setText(iSocialTabProtocol.mc(tuxTextView.getContext()));
            tuxTextView.setTextSize(1, 17.0f);
            tuxTextView.setTextColorRes(R.attr.ee);
        }
        if (getHitTopTabUiAlignmentExp()) {
            ConstraintLayout constraintLayout = this.LLILLJJLI;
            if (constraintLayout != null) {
                constraintLayout.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            }
            ConstraintLayout constraintLayout2 = this.LLILLJJLI;
            if (constraintLayout2 != null && (layoutParams2 = constraintLayout2.getLayoutParams()) != null) {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                ConstraintLayout constraintLayout3 = this.LLILLJJLI;
                if (constraintLayout3 != null) {
                    C786410Ut5.m6(constraintLayout3, layoutParams2);
                }
            }
            View view = this.LLILLL;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                View view2 = this.LLILLL;
                if (view2 != null) {
                    C786410Ut5.W5(view2, marginLayoutParams2);
                }
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            ViewGroup.LayoutParams layoutParams3 = tuxTextView2 != null ? tuxTextView2.getLayoutParams() : null;
            if ((layoutParams3 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                TuxTextView tuxTextView3 = this.LLILZ;
                if (tuxTextView3 != null) {
                    C786410Ut5.R6(tuxTextView3, marginLayoutParams);
                }
            }
        }
    }
}
