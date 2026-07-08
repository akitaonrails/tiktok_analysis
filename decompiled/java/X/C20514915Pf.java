package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15Pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20514915Pf extends C16G0 {
    public final ViewGroup LLJJL;
    public final C1057450dcl LLJJLIIIJLLLLLLLZ;
    public final C20516215Ps LLJL;
    public boolean LLJLIL;
    public BottomSheetBehavior<LinearLayout> LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public Integer LLJLLL;

    public final void LJJ() {
        try {
            this.LLJLL = true;
            C786410Ut5.LJJJLZIJ(this, this.LLJJL);
            Function1<? super Integer, Unit> function1 = this.LLJJLIIIJLLLLLLLZ.LJIILJJIL;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(this.LLJLLIL));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIJJLI() {
        if (this.LLJLL) {
            return;
        }
        this.LLJL.LIZ(false);
        C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS131S0100000_31(this, 163));
    }

    public final void LJIL() {
        ViewGroup.LayoutParams c19me;
        View viewFindViewWithTag = this.LLJJL.findViewWithTag(C20514915Pf.class);
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
        setTag(C20514915Pf.class);
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

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (motionEvent.getAction() == 0) {
                this.LLJLIL = this.LLJL.LIZJ(rawX, rawY);
            }
        }
        if (!this.LLJLIL) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C20514915Pf(ViewGroup viewGroup, C1057450dcl c1057450dcl, Context context) {
        super(context, null, 0);
        this.LLJJL = viewGroup;
        this.LLJJLIIIJLLLLLLLZ = c1057450dcl;
        this.LLJLIL = true;
        C786410Ut5.Sd(R.layout.g8, C786410Ut5.ne(context), this);
        setId(R.id.z09);
        C20516215Ps c20516215Ps = (C20516215Ps) findViewById(R.id.pd0);
        this.LLJL = c20516215Ps;
        c20516215Ps.setDismiss(new AwS575S0100000_31(this, 1496));
        this.LLJL.LIZIZ(this.LLJJLIIIJLLLLLLLZ);
        BottomSheetBehavior<LinearLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(c20516215Ps);
        this.LLJLILLLLZIIL = bottomSheetBehaviorFrom;
        (bottomSheetBehaviorFrom != null ? bottomSheetBehaviorFrom : null).addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.155l
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                if (i == 5) {
                    C20514915Pf c20514915Pf = this.LIZ;
                    c20514915Pf.LLJLLIL = 1;
                    c20514915Pf.LJJ();
                }
            }
        });
        C786410Ut5.x3(getViewTreeObserver(), new C16HN(this, 7));
    }
}
