package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS170S0101000_33;
import kotlin.jvm.internal.AwS242S0300000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21661919q5 extends FrameLayout implements C015R {
    public int LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public Function1<? super Integer, Unit> LLJ;
    public ValueAnimator LLJI;
    public final C19290410dS LLJIJIL;
    public InterfaceC21662119q7 LLJILJIL;
    public final C21662019q6 LLJILJILJ;
    public float LLJILLL;

    public boolean LJFF(MotionEvent motionEvent) {
        return false;
    }

    public int getThemeResId() {
        return R.style.z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r6.getLayoutParams().height < (r7.LLILZIL - r7.LLILZ)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.getLayoutParams().height < (r7.LLILZIL - r7.LLILZ)) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r7 = this;
            X.19q6 r0 = r7.LLJILJILJ
            com.bytedance.tux.widget.RadiusLayout r6 = r0.LIZ()
            boolean r0 = r7.LLILLJJLI
            r5 = 0
            if (r0 == 0) goto L2e
            int r0 = r7.LL
            r4 = 1
            r3 = 2
            if (r0 != 0) goto L33
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            int r2 = r0.height
            int r1 = r7.LLILZIL
            int r0 = r7.LLILZ
            int r1 = r1 + r0
            if (r2 > r1) goto L4e
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            int r2 = r0.height
            int r1 = r7.LLILZIL
            int r0 = r7.LLILZ
            int r1 = r1 - r0
            if (r2 >= r1) goto L50
        L2b:
            r7.LIZ(r4)
        L2e:
            r7.LLILLJJLI = r5
            r7.LLIZLLLIL = r5
            return
        L33:
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            int r2 = r0.height
            int r1 = r7.LLILLL
            int r0 = r7.LLILZ
            int r1 = r1 - r0
            if (r2 >= r1) goto L4e
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            int r2 = r0.height
            int r1 = r7.LLILZIL
            int r0 = r7.LLILZ
            int r1 = r1 - r0
            if (r2 >= r1) goto L50
            goto L2b
        L4e:
            r2 = 0
            goto L51
        L50:
            r2 = 1
        L51:
            r0 = 100
            if (r2 == 0) goto L8a
            if (r2 != r4) goto L2b
            int[] r3 = new int[r3]
            X.19q6 r2 = r7.LLJILJILJ
            com.bytedance.tux.widget.RadiusLayout r2 = r2.LIZ()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r2 = r2.height
            r3[r5] = r2
            int r2 = r7.LLILZIL
            r3[r4] = r2
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r3)
            r2.setDuration(r0)
            Y.AUListenerS280S0100000_33 r1 = new Y.AUListenerS280S0100000_33
            r0 = 9
            r1.<init>(r7, r0)
            r2.addUpdateListener(r1)
            X.19q9 r0 = new X.19q9
            r0.<init>()
            r2.addListener(r0)
            r2.start()
            r7.LL = r5
            goto L2e
        L8a:
            int[] r3 = new int[r3]
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            int r2 = r2.height
            r3[r5] = r2
            int r2 = r7.LLILLL
            r3[r4] = r2
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r3)
            r2.setDuration(r0)
            Y.AUListenerS277S0100000_29 r1 = new Y.AUListenerS277S0100000_29
            r0 = 0
            r1.<init>(r6, r0)
            r2.addUpdateListener(r1)
            X.19q8 r0 = new X.19q8
            r0.<init>()
            r2.addListener(r0)
            r2.start()
            r7.LL = r4
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21661919q5.LIZLLL():void");
    }

    public int getBackStackCount() {
        InterfaceC21662119q7 interfaceC21662119q7 = this.LLJILJIL;
        if (interfaceC21662119q7 != null) {
            return interfaceC21662119q7.LJ();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final ValueAnimator getAnim() {
        return this.LLJI;
    }

    public final Function1<Integer, Unit> getDismissListener() {
        return this.LLJ;
    }

    @Override // X.C015R
    public final void LIZ(int i) {
        Function1<? super Integer, Unit> function1 = this.LLJ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public Drawable LIZJ(Context context) {
        return C800330VaR.LIZIZ(context, R.drawable.azp);
    }

    public View LJ(LinearLayout linearLayout) {
        View view = new View(linearLayout.getContext());
        C786410Ut5.W5(view, C341730DaV.LIZIZ(C1287910jcT.LIZ(32), C1287910jcT.LIZ(3), 0, 0, null, null, Integer.valueOf(C1287910jcT.LIZ(5)), Integer.valueOf(C1287910jcT.LIZ(10)), null, null, 828));
        AFwS273S0000000_29.get$arr$(9).invoke(view);
        return view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RadiusLayout radiusLayoutLIZ = this.LLJILJILJ.LIZ();
        if (motionEvent.getY() >= radiusLayoutLIZ.getTop() && motionEvent.getY() < radiusLayoutLIZ.getTop() + this.LLIZ) {
            if (motionEvent.getAction() == 0) {
                this.LLJILLL = motionEvent.getY();
                this.LLJIJIL.LIZ(motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 2 && Math.abs(motionEvent.getY() - this.LLJILLL) > 2.0f) {
                return true;
            }
            this.LLJILLL = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            LIZLLL();
        }
        return this.LLJIJIL.LIZ(motionEvent);
    }

    public final void setAdapter(InterfaceC21662119q7 interfaceC21662119q7) {
        interfaceC21662119q7.LIZIZ(this);
        this.LLJILJIL = interfaceC21662119q7;
    }

    public final void setAnim(ValueAnimator valueAnimator) {
        this.LLJI = valueAnimator;
    }

    public void setCriticalHeight(int i) {
        this.LLILZ = i;
    }

    public void setCurrentHeight(int i) {
        this.LLILZLL = i;
        ViewGroup.LayoutParams layoutParams = this.LLJILJILJ.LIZ().getLayoutParams();
        layoutParams.height = this.LLILZLL;
        C786410Ut5.a6(this.LLJILJILJ.LIZ(), layoutParams);
    }

    public final void setDismissListener(Function1<? super Integer, Unit> function1) {
        this.LLJ = function1;
    }

    public void setMaxHeight(int i) {
        this.LLILLL = i;
        if (i < this.LLILZLL) {
            setCurrentHeight(i);
        }
    }

    public void setMinHeight(int i) {
        this.LLILZIL = i;
        if (i > this.LLILZLL) {
            setCurrentHeight(i);
        }
    }

    public void setToggleAreaHeight(int i) {
        this.LLIZ = i;
    }

    public C21661919q5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = (C12ES.LJIIIIZZ(context) - C12ES.LJIIJJI(context)) - ((int) C12ES.LIZJ(60.0f, context));
        this.LLILZ = (int) C12ES.LIZJ(40.0f, context);
        int iLIZJ = (int) C12ES.LIZJ(406.0f, context);
        this.LLILZIL = iLIZJ;
        this.LLILZLL = iLIZJ;
        this.LLIZ = (int) C12ES.LIZJ(55.0f, context);
        this.LLJIJIL = new C19290410dS(context, new C2189811An5(this, 0), null);
        C21662019q6 c21662019q6 = new C21662019q6(this);
        this.LLJILJILJ = c21662019q6;
        C21661919q5 c21661919q5 = c21662019q6.LIZLLL;
        C786410Ut5.LJJJJIZL(this);
        View view = new View(context);
        C786410Ut5.W5(view, C341730DaV.LIZ(0, 0, 0, 0, null, null, null, 511));
        new AwS612S0100000_33(c21662019q6, 40).invoke(view);
        addView(view);
        RadiusLayout radiusLayout = new RadiusLayout(context, null, 6);
        C786410Ut5.W5(radiusLayout, C341730DaV.LIZ(-1, -2, 0, 0, null, null, 80, 252));
        new AwS242S0300000_33(c21662019q6, c21661919q5, context, 5).invoke(radiusLayout);
        addView(radiusLayout);
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.W5(linearLayout, C341730DaV.LIZ(-1, -1, 0, 0, null, null, 80, 252));
        AFwS279S0000000_33.get$arr$(28).invoke(linearLayout);
        radiusLayout.addView(linearLayout);
        linearLayout.addView(c21661919q5.LJ(linearLayout));
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.W5(frameLayout, C341730DaV.LIZ(-1, -1, 0, 0, null, null, null, 508));
        new AwS612S0100000_33(c21662019q6, 41).invoke(frameLayout);
        linearLayout.addView(frameLayout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.LLILZLL);
        layoutParams.gravity = 80;
        C786410Ut5.a6(c21662019q6.LIZ(), layoutParams);
    }

    @Override // X.C015R
    public final void LIZIZ(C015Q c015q, int i) {
        if (c015q == C015Q.HORIZONTAL) {
            InterfaceC21662119q7 interfaceC21662119q7 = this.LLJILJIL;
            if (interfaceC21662119q7 != null) {
                interfaceC21662119q7.LIZLLL(i);
                return;
            }
            return;
        }
        this.LLJI = new C0HX0().LIZIZ(this.LLJILJILJ.LIZ(), new AwS170S0101000_33(this, i, 1));
    }

    public final void LJI(Bundle bundle, C015Q c015q) {
        if (c015q == C015Q.HORIZONTAL) {
            InterfaceC21662119q7 interfaceC21662119q7 = this.LLJILJIL;
            if (interfaceC21662119q7 != null) {
                FrameLayout frameLayout = this.LLJILJILJ.LIZJ;
                if (frameLayout == null) {
                    frameLayout = null;
                }
                interfaceC21662119q7.LIZJ(bundle, frameLayout, false);
                return;
            }
            return;
        }
        this.LLJI = new C0HX0().LIZIZ(this.LLJILJILJ.LIZ(), new AwS434S0200000_33(this, bundle, 13));
    }
}
