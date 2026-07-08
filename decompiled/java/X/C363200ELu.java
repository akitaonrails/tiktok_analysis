package X;

import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ELu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363200ELu extends FrameLayout implements InterfaceC363010ELb {
    public final TuxTextView LL;
    public final C1295960jpS LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public ValueAnimator LLIZLLLIL;
    public final C01GW LLJ;

    public C363200ELu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC363010ELb
    public View getView() {
        return this;
    }

    private final ContextThemeWrapper getDarkThemeContext() {
        return (ContextThemeWrapper) this.LLJ.getValue();
    }

    @Override // X.InterfaceC363010ELb
    public final void LIZIZ() {
        this.LL.setText("");
        this.LLILLJJLI.setProgress(0.0f);
        LIZ(true, Float.valueOf(0.05f));
    }

    @Override // X.InterfaceC363010ELb
    public View getLoadingProgressView() {
        return this.LLILZLL;
    }

    public final void LJ(float f) {
        this.LLILLJJLI.setProgress(f);
        TuxTextView tuxTextView = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((int) (f * 100));
        sbLIZ.append('%');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setUIConfig(C363210ELv c363210ELv) {
        String str = c363210ELv.LIZ;
        if (str != null) {
            this.LLILLL.setText(str);
        }
        String str2 = c363210ELv.LIZIZ;
        if (str2 != null) {
            C786410Ut5.LLLLZLL(this.LLILZ, 0);
            this.LLILZ.setText(str2);
        }
        Size size = c363210ELv.LIZJ;
        if (size != null) {
            C1295960jpS c1295960jpS = this.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams = c1295960jpS.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = size.getWidth();
                layoutParams.height = size.getHeight();
                C786410Ut5.W5(c1295960jpS, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Integer num = c363210ELv.LIZLLL;
        if (num != null) {
            int iIntValue = num.intValue();
            this.LLILLL.setGravity(iIntValue);
            this.LLILZ.setGravity(iIntValue);
        }
    }

    @Override // X.InterfaceC363010ELb
    public final void LIZ(boolean z, Float f) {
        ValueAnimator valueAnimator = this.LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (f == null) {
            this.LL.setText("");
            this.LLILLJJLI.setProgress(0.0f);
            return;
        }
        float progress = this.LLILLJJLI.getProgress();
        if (z && progress <= f.floatValue()) {
            long jLJFF = C13LZ.LJFF(((long) ((f.floatValue() - progress) * 100)) * 70, 350L, 1500L);
            ValueAnimator valueAnimator2 = this.LLIZLLLIL;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(progress, f.floatValue());
                valueAnimatorOfFloat.setDuration(jLJFF);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 11));
                valueAnimatorOfFloat.start();
                this.LLIZLLLIL = valueAnimatorOfFloat;
                return;
            }
            valueAnimator2.setFloatValues(progress, f.floatValue());
            ValueAnimator valueAnimator3 = this.LLIZLLLIL;
            if (valueAnimator3 != null) {
                valueAnimator3.setDuration(jLJFF);
            }
            ValueAnimator valueAnimator4 = this.LLIZLLLIL;
            if (valueAnimator4 == null) {
                return;
            }
            valueAnimator4.start();
            return;
        }
        LJ(f.floatValue());
    }

    @Override // X.InterfaceC363010ELb
    public final void LIZJ(String str, boolean z) {
        Uri uri = UriProtector.parse(str);
        if (!Intrinsics.LJFF(uri.getScheme(), "content") && !Intrinsics.LJFF(uri.getScheme(), "http") && !Intrinsics.LJFF(uri.getScheme(), "https")) {
            Uri.fromFile(new C0VSJ(str));
        }
    }

    public final void LIZLLL(Integer num, Integer num2) {
        if (num != null) {
            num.intValue();
            getLayoutParams().width = num.intValue() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
        if (num2 != null) {
            num2.intValue();
            getLayoutParams().height = num2.intValue();
        }
        requestLayout();
    }

    public C363200ELu(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 894));
        C786410Ut5.Sd(R.layout.mn, C786410Ut5.ne(context), this);
        this.LL = (TuxTextView) findViewById(R.id.itq);
        this.LLILLL = (TuxTextView) findViewById(R.id.itr);
        View viewFindViewById = findViewById(R.id.itn);
        this.LLILZIL = viewFindViewById;
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.itm);
        c1295960jpS.setAnimation(R.raw.tux_lottie_common_creation_aihexloadingbig);
        this.LLILLJJLI = c1295960jpS;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1a, getDarkThemeContext());
        if (numLIZJ != null) {
            viewFindViewById.setBackgroundColor(numLIZJ.intValue());
        }
        this.LLILZLL = findViewById(R.id.itp);
        this.LLIZ = findViewById(R.id.itl);
        this.LLILZ = (TuxTextView) findViewById(R.id.wej);
    }
}
