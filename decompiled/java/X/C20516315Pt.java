package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS75S0200000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20516315Pt extends LinearLayout {
    public final AttributeSet LL;
    public final int LLILLJJLI;
    public final RelativeLayout LLILLL;
    public final C1CRB LLILZ;
    public final RelativeLayout LLILZIL;
    public final FrameLayout LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final C197039127h LLJ;
    public final TuxIconView LLJI;
    public final LinearLayout LLJIJIL;
    public final RelativeLayout LLJILJIL;
    public C20516415Pu LLJILJILJ;
    public final float LLJILLL;
    public TuxTextView LLJJ;
    public FrameLayout LLJJI;
    public Function0<Unit> LLJJIII;

    public final Function0<Unit> getDismiss() {
        return this.LLJJIII;
    }

    private final void setupSuffixView(boolean z) {
        int iIntValue;
        int i;
        ViewGroup viewGroup;
        if (this.LLJJI != null) {
            return;
        }
        Integer numLIZ = C1308910kAL.LIZ(R.attr.a1q, getContext());
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -65536;
        }
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setTextDirection(5);
        if (z) {
            i = 72;
        } else {
            i = 62;
        }
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setMaxLines(1);
        C786410Ut5.LLLLZLL(tuxTextView, 4);
        this.LLJJ = tuxTextView;
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewParent parent = this.LLIZLLLIL.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            int iIndexOfChild = viewGroup.indexOfChild(this.LLIZLLLIL);
            ViewGroup.LayoutParams layoutParams = this.LLIZLLLIL.getLayoutParams();
            C786410Ut5.LJJJLZIJ(this.LLIZLLLIL, viewGroup);
            frameLayout.addView(this.LLIZLLLIL, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(tuxTextView, new FrameLayout.LayoutParams(-2, -2, 51));
            frameLayout.setId(this.LLIZLLLIL.getId());
            this.LLIZLLLIL.setId(View.generateViewId());
            viewGroup.addView(frameLayout, iIndexOfChild, layoutParams);
            this.LLJJI = frameLayout;
        }
    }

    public final void LIZ(boolean z) {
        float f;
        float f2;
        float f3;
        long j;
        float f4 = 0.0f;
        if (z) {
            f2 = this.LLJILLL;
            f = 0.0f;
        } else {
            f = this.LLJILLL;
            f2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationY", f2, f).setDuration(348L);
        duration.setInterpolator(new InterpolatorC448120Hhi(1.71f));
        float[] fArr = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr[1] = f4;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", fArr);
        if (z) {
            j = 150;
        } else {
            j = 100;
        }
        ObjectAnimator duration2 = objectAnimatorOfFloat.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration2, duration);
        animatorSet.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C20516415Pu r26) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20516315Pt.LIZIZ(X.15Pu):void");
    }

    public final void setDismiss(Function0<Unit> function0) {
        this.LLJJIII = function0;
    }

    public C20516315Pt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = attributeSet;
        this.LLILLJJLI = 0;
        this.LLJILLL = C418440Gaw.LIZIZ(20);
        C786410Ut5.Sd(R.layout.g6, C786410Ut5.ne(context), this);
        this.LLILLL = (RelativeLayout) findViewById(R.id.bxd);
        this.LLILZ = (C1CRB) findViewById(R.id.id5);
        this.LLILZIL = (RelativeLayout) findViewById(R.id.evm);
        this.LLILZLL = (FrameLayout) findViewById(R.id.vzg);
        this.LLIZ = (TuxTextView) findViewById(R.id.title);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.o8v);
        this.LLJ = (C197039127h) findViewById(R.id.pcs);
        this.LLJI = (TuxIconView) findViewById(R.id.h4q);
        this.LLJIJIL = (LinearLayout) findViewById(R.id.tks);
        this.LLJILJIL = (RelativeLayout) findViewById(R.id.mjp);
    }

    public final void LIZJ(CharSequence charSequence, CharSequence charSequence2, Function1<? super View, Unit> function1) {
        boolean z;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL(this.LLIZLLLIL, 8);
            TuxTextView tuxTextView = this.LLJJ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        C786410Ut5.LLLLZLL(this.LLIZLLLIL, 0);
        if (charSequence2 != null && charSequence2.length() != 0) {
            this.LLIZLLLIL.setEllipsize(null);
            this.LLIZLLLIL.setText(charSequence);
            TuxTextView tuxTextView2 = this.LLJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(charSequence2);
                if (function1 != null) {
                    C786410Ut5.h9(tuxTextView2, new ACListenerS141S0100000_6((Function1) function1, 89));
                } else {
                    C786410Ut5.h9(tuxTextView2, null);
                    tuxTextView2.setClickable(false);
                }
            }
            HandlerHook.viewPost(this.LLIZLLLIL, new ARunnableS75S0200000_6(this, charSequence, 67));
            return;
        }
        this.LLIZLLLIL.setEllipsize(TextUtils.TruncateAt.END);
        this.LLIZLLLIL.setText(charSequence);
        TuxTextView tuxTextView3 = this.LLJJ;
        if (tuxTextView3 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView3, 8);
    }
}
