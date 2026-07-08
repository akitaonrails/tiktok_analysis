package X;

import Y.ACListenerS119S0200000_16;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;
import wh6.AbS697S0100000_16;

/* JADX INFO: renamed from: X.0cbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018030cbB extends C16G0 {
    public final ViewGroup LLJJL;
    public final C1017830car LLJJLIIIJLLLLLLLZ;
    public final C1018040cbC LLJL;
    public boolean LLJLIL;
    public final BottomSheetBehavior<LinearLayout> LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public Integer LLJLLL;

    public final void LJJ() {
        try {
            this.LLJLL = true;
            C786410Ut5.LJJJLZIJ(this, this.LLJJL);
            Function1<? super Integer, Unit> function1 = this.LLJJLIIIJLLLLLLLZ.LJIIJ;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(this.LLJLLIL));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIL() {
        ViewGroup.LayoutParams c19me;
        View viewFindViewWithTag = this.LLJJL.findViewWithTag(C1018030cbB.class);
        if (viewFindViewWithTag != null) {
            C786410Ut5.LJJJLZIJ(viewFindViewWithTag, this.LLJJL);
        }
        ViewGroup viewGroup = this.LLJJL;
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            c19me = layoutParams;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 80;
            c19me = layoutParams2;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 80;
            c19me = layoutParams3;
        } else if (viewGroup instanceof C1CRB) {
            C1CRC c1crc = new C1CRC(-1);
            c1crc.LIZLLL = C2230281CQw.LIZ(getContext(), "100%", "layout_bottom");
            c19me = c1crc;
        } else {
            c19me = viewGroup instanceof ConstraintLayout ? new C19ME(-1, -2) : new ViewGroup.LayoutParams(-1, -2);
        }
        setTag(C1018030cbB.class);
        this.LLJJL.addView(this, c19me);
        if (this.LLJJL instanceof ConstraintLayout) {
            C19MB c19mb = new C19MB();
            c19mb.LJII((ConstraintLayout) this.LLJJL);
            c19mb.LJIIIIZZ(R.id.z09, 4, 0, 4);
            c19mb.LIZIZ((ConstraintLayout) this.LLJJL);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final ViewGroup getParent() {
        return this.LLJJL;
    }

    public final void LJIJJLI(int i) {
        this.LLJLLIL = i;
        if (!this.LLJLL) {
            this.LLJL.LIZ(false);
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 142));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            boolean z = true;
            if (motionEvent != null && motionEvent.getAction() == 0) {
                C1018040cbC c1018040cbC = this.LLJL;
                int[] iArr = new int[2];
                c1018040cbC.LLILLL.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int measuredWidth = c1018040cbC.LLILLL.getMeasuredWidth() + i;
                int measuredHeight = c1018040cbC.LLILLL.getMeasuredHeight() + i2;
                if (i2 > rawY || rawY > measuredHeight || i > rawX || rawX > measuredWidth) {
                    z = false;
                }
                this.LLJLIL = z;
            }
        }
        if (!this.LLJLIL) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1018030cbB(ViewGroup viewGroup, C1017830car c1017830car, Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        super(context, null, 0);
        this.LLJJL = viewGroup;
        this.LLJJLIIIJLLLLLLLZ = c1017830car;
        this.LLJLIL = true;
        C786410Ut5.Sd(R.layout.eb5, C786410Ut5.ne(context), this);
        setId(R.id.z09);
        C1018040cbC c1018040cbC = (C1018040cbC) findViewById(R.id.pd0);
        this.LLJL = c1018040cbC;
        BottomSheetBehavior<LinearLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(c1018040cbC);
        this.LLJLILLLLZIIL = bottomSheetBehaviorFrom;
        c1018040cbC.setDismiss(new AwS560S0100000_16(this, 734));
        c1018040cbC.LLJJ = c1017830car;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(c1018040cbC.getContext(), R.style.y0);
        ViewGroup viewGroup2 = c1018040cbC.LL;
        viewGroup2.setBackgroundColor(C2441009hQ.LJIIL(C475630Ikz.LIZIZ(R.attr.zh, contextThemeWrapper), 255));
        viewGroup2.setLayoutMode(1);
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        int iLIZIZ = C497820Jfg.LIZIZ(viewGroup2.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(430));
        layoutParams.width = (iLIZIZ > iLIZIZ2 ? iLIZIZ2 : iLIZIZ) + viewGroup2.getPaddingLeft() + viewGroup2.getPaddingRight();
        C786410Ut5.X5(layoutParams, viewGroup2);
        C426750GoL.LJIIL(c1018040cbC.LLILLJJLI, null, null, null, Integer.valueOf(c1017830car.LJI), 23);
        C427690Gpr.LJ(c1018040cbC.LLILLL, C418440Gaw.LIZIZ(16));
        C786410Ut5.K7(c1018040cbC.LLILLL, new ACListenerS119S0200000_16(c1018040cbC, c1017830car, 22));
        CharSequence charSequence = c1017830car.LIZ;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z5 = !z;
        CharSequence charSequence2 = c1017830car.LIZIZ;
        if (charSequence2 != null && charSequence2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z6 = !z2;
        CharSequence charSequence3 = c1017830car.LIZLLL;
        if (charSequence3 != null && charSequence3.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z7 = !z3;
        TuxTextView tuxTextView = c1018040cbC.LLILZIL;
        if (z5) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        if (z5) {
            tuxTextView.setTextDirection(5);
            tuxTextView.setText(c1017830car.LIZ);
        }
        if (!z6 && !z7) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) tuxTextView.getLayoutParams();
            layoutParams2.addRule(15);
            C786410Ut5.R6(tuxTextView, layoutParams2);
        }
        ViewGroup viewGroup3 = c1018040cbC.LLIZLLLIL;
        if (z6) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLZ(i2, viewGroup3);
        c1018040cbC.LLIZLLLIL.setClickable(false);
        c1018040cbC.LLIZLLLIL.setLongClickable(false);
        TuxIconView tuxIconView = c1018040cbC.LLIZ;
        if (c1017830car.LIZJ) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i3);
        if (z6) {
            c1018040cbC.LLILZLL.setTextDirection(5);
            c1018040cbC.LLILZLL.setText(c1017830car.LIZIZ);
            c1018040cbC.LLILZLL.setMovementMethod(C431260Gvc.LIZ);
        }
        if (!z5 && !z7) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) c1018040cbC.LLIZLLLIL.getLayoutParams();
            layoutParams3.addRule(15);
            C786410Ut5.X5(layoutParams3, c1018040cbC.LLIZLLLIL);
        }
        TuxTextView tuxTextView2 = c1018040cbC.LLJ;
        View view = c1018040cbC.LLJI;
        if (z7) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, view);
        CharSequence charSequence4 = c1017830car.LIZLLL;
        if (z7) {
            tuxTextView2.setTextDirection(5);
            tuxTextView2.setText(charSequence4);
            tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
            tuxTextView2.setClickable(false);
            tuxTextView2.setLongClickable(false);
        }
        if (!z5 && !z6) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) tuxTextView2.getLayoutParams();
            layoutParams4.addRule(15);
            C786410Ut5.W5(c1018040cbC.LLJI, layoutParams4);
        }
        C786410Ut5.I7(new AbS697S0100000_16(c1017830car, 5), c1018040cbC.LLJI);
        CharSequence charSequence5 = c1017830car.LJ;
        if (charSequence5 != null && charSequence5.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z8 = true ^ z4;
        C197039127h c197039127h = c1018040cbC.LLJIJIL;
        C786410Ut5.LLLLLLJ(c197039127h, z8 ? 0 : 8);
        if (z8) {
            c197039127h.setText(c1017830car.LJ);
            C786410Ut5.I7(new AbS697S0100000_16(c1017830car, 7), c197039127h);
        }
        C786410Ut5.I7(new AbS697S0100000_16(c1017830car, 6), c1018040cbC.LLJILLL);
        Function1<? super SmartImageView, Unit> function1 = c1017830car.LJIIJJI;
        if (function1 != null) {
            function1.invoke(c1018040cbC.LLILZ);
        }
        c1017830car.LJIILIIL = new AwS560S0100000_16(c1018040cbC, 735);
        c1017830car.LJIILJJIL = new AwS560S0100000_16(c1018040cbC, 736);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) c1018040cbC.LLJILJIL.getLayoutParams();
        layoutParams5.addRule(15);
        C786410Ut5.d6(c1018040cbC.LLJILJIL, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) c1018040cbC.LLJILJILJ.getLayoutParams();
        layoutParams6.addRule(15);
        C786410Ut5.e6(c1018040cbC.LLJILJILJ, layoutParams6);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0cbD
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view2, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i5, View view2) {
                if (i5 == 5) {
                    C1018030cbB c1018030cbB = this.LIZ;
                    c1018030cbB.LLJLLIL = 1;
                    c1018030cbB.LJJ();
                }
            }
        });
        C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1077390e8v(this, 3));
    }
}
