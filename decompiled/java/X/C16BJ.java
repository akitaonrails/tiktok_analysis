package X;

import Y.ACListenerS165S0100000_31;
import Y.ARunnableS33S0201000_28;
import Y.ATListenerS167S0000000_31;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.sticker.poll.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import u4.q0;

/* JADX INFO: renamed from: X.16BJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16BJ extends C19GU {
    public ViewPagerBottomSheetBehavior<FrameLayout> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final C16BH LLJI;

    @Override // X.C19EK, android.app.Dialog
    public final void onStart() {
        super.onStart();
        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.LLILZLL;
        if (viewPagerBottomSheetBehavior == null || 4 == viewPagerBottomSheetBehavior.LJIIIIZZ) {
            return;
        }
        Reference reference = viewPagerBottomSheetBehavior.LJIILJJIL;
        if (reference == null) {
            viewPagerBottomSheetBehavior.LJIIIIZZ = 4;
            return;
        }
        View view = (View) reference.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                HandlerHook.viewPost(view, new ARunnableS33S0201000_28(viewPagerBottomSheetBehavior, view, 2));
            } else {
                viewPagerBottomSheetBehavior.startSettlingAnimation(view, 4);
            }
        }
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
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
        if (this.LLIZ != z) {
            this.LLIZ = z;
            ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.LLILZLL;
            if (viewPagerBottomSheetBehavior != null) {
                viewPagerBottomSheetBehavior.LJI = z;
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.LLIZ) {
            this.LLIZ = true;
        }
        this.LLIZLLLIL = z;
        this.LLJ = true;
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(LJJZ(view, 0, null));
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(LJJZ(null, i, null));
    }

    public C16BJ(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.bcz, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = R.style.sq;
            }
        }
        super(context, i);
        this.LLIZ = true;
        this.LLIZLLLIL = true;
        this.LLJI = new C16BH(this);
        LJJLL(1);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJJZ(view, 0, layoutParams));
    }

    public final View LJJZ(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.bjw, null);
        ViewGroup viewGroup = (ViewGroup) viewLJLLJ.findViewById(R.id.exx);
        if (i != 0 && view == null) {
            view = C786410Ut5.Td(getLayoutInflater(), i, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fpl);
        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehaviorLIZ = ViewPagerBottomSheetBehavior.LIZ(viewGroup2);
        this.LLILZLL = viewPagerBottomSheetBehaviorLIZ;
        viewPagerBottomSheetBehaviorLIZ.getClass();
        viewPagerBottomSheetBehaviorLIZ.LJIILLIIL = new WeakReference<>(this);
        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.LLILZLL;
        viewPagerBottomSheetBehavior.LJIIZILJ = this.LLJI;
        viewPagerBottomSheetBehavior.LJI = this.LLIZ;
        if (layoutParams == null) {
            viewGroup2.addView(view);
        } else {
            viewGroup2.addView(view, layoutParams);
        }
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 128), viewGroup.findViewById(R.id.yg_));
        q0.LJIJ(viewGroup2, new C20750916Hz(this, 0));
        viewGroup2.setOnTouchListener(new ATListenerS167S0000000_31(0));
        return viewLJLLJ;
    }
}
