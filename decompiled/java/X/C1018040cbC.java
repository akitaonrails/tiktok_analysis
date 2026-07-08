package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018040cbC extends LinearLayout {
    public final ViewGroup LL;
    public final C1CRB LLILLJJLI;
    public final ViewGroup LLILLL;
    public final SmartImageView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxIconView LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final TuxTextView LLJ;
    public final View LLJI;
    public final C197039127h LLJIJIL;
    public final LinearLayout LLJILJIL;
    public final RelativeLayout LLJILJILJ;
    public final C415590GRh LLJILLL;
    public C1017830car LLJJ;
    public final float LLJJI;
    public Function0<Unit> LLJJIII;

    public final Function0<Unit> getDismiss() {
        return this.LLJJIII;
    }

    public final void LIZ(boolean z) {
        float f;
        float f2;
        float f3;
        long j;
        float f4 = 0.0f;
        if (z) {
            f2 = this.LLJJI;
            f = 0.0f;
        } else {
            f = this.LLJJI;
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

    public final void setDismiss(Function0<Unit> function0) {
        this.LLJJIII = function0;
    }

    public C1018040cbC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJI = C418440Gaw.LIZIZ(20);
        C786410Ut5.Sd(R.layout.eb4, C786410Ut5.ne(context), this);
        this.LL = (ViewGroup) findViewById(R.id.bxd);
        this.LLILLJJLI = (C1CRB) findViewById(R.id.id5);
        this.LLILLL = (ViewGroup) findViewById(R.id.evm);
        this.LLILZ = (SmartImageView) findViewById(R.id.vyq);
        this.LLILZIL = (TuxTextView) findViewById(R.id.title);
        this.LLILZLL = (TuxTextView) findViewById(R.id.o8v);
        this.LLIZ = (TuxIconView) findViewById(R.id.o9h);
        this.LLIZLLLIL = (ViewGroup) findViewById(R.id.o99);
        this.LLJ = (TuxTextView) findViewById(R.id.o8w);
        this.LLJI = findViewById(R.id.o8x);
        this.LLJIJIL = (C197039127h) findViewById(R.id.pcs);
        this.LLJILJIL = (LinearLayout) findViewById(R.id.tks);
        this.LLJILJILJ = (RelativeLayout) findViewById(R.id.mjp);
        this.LLJILLL = (C415590GRh) findViewById(R.id.pd2);
    }
}
