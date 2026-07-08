package X;

import Y.ALAdapterS2S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FSY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FSY extends C0FUM implements C0FUG {
    public static final /* synthetic */ int LLILZ = 0;
    public final FrameLayout LL;
    public final FrameLayout LLILLJJLI;
    public final TuxTextView LLILLL;

    @Override // X.C0FUG
    public final void LIZJ() {
    }

    @Override // X.C0FUG
    public final void LJI() {
    }

    @Override // X.C0FUG
    public final void LJII(MotionEvent motionEvent) {
    }

    @Override // X.C0FUG
    public final void LJIIIIZZ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIILLIIL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIZILJ() {
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
    }

    @Override // X.C0FUG
    public final void LJIJI(int i, boolean z) {
    }

    @Override // X.C0FUG
    public final void LJIL() {
    }

    @Override // X.C0FUG
    public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJJIII() {
    }

    @Override // X.C0FUG
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
    }

    @Override // X.C0FUG
    public final void LJJIJ() {
    }

    @Override // X.C0FUG
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 100;
    }

    public final void LJJIJIL() {
        ViewGroup viewGroup;
        this.LLILLL.animate().alpha(0.0f).setDuration(150L).setInterpolator(C1619980sG4.LJIILIIL()).setListener(new ALAdapterS2S0100000_5(this, 16)).start();
        if (this.LLILLL.getParent() != null) {
            ViewParent parent = this.LLILLL.getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                return;
            }
            C786410Ut5.LJJJLZIJ(this.LLILLL, viewGroup);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        LJJIJIL();
        return this instanceof C1417630mzh;
    }

    public C0FSY(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.LL = frameLayout;
        this.LLILLJJLI = frameLayout2;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(82);
        tuxTextView.setTextColorRes(R.attr.ee);
        C786410Ut5.LLLLZLL(tuxTextView, 4);
        tuxTextView.setShadowLayer(5.0f, 2.0f, 2.0f, R.attr.e3);
        this.LLILLL = tuxTextView;
    }

    public final void LJJIJL(float f, float f2, Integer num, C0FSZ c0fsz) {
        long jIntValue;
        if (this.LLILLL.getParent() != null) {
            C786410Ut5.Jd(this.LLILLL, f);
            C786410Ut5.Od(this.LLILLL, f2);
            C786410Ut5.B5(this.LLILLL, 0.0f);
            C786410Ut5.LLLLZLL(this.LLILLL, 0);
            if (c0fsz != null) {
                c0fsz.LIZ(this.LLILLL);
            }
            this.LLILLL.animate().alpha(1.0f).setDuration(150L).setListener(new ALAdapterS2S0100000_5(this, 17)).setInterpolator(C1619980sG4.LJIILIIL()).start();
            TuxTextView tuxTextView = this.LLILLL;
            ARunnableS105S0100000_5 aRunnableS105S0100000_5 = new ARunnableS105S0100000_5(this, 82);
            if (num != null) {
                jIntValue = num.intValue();
            } else {
                jIntValue = 3000;
            }
            HandlerHook.viewPostDelay(tuxTextView, aRunnableS105S0100000_5, jIntValue);
        }
    }
}
