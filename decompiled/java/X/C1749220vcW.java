package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749220vcW extends TuxTextView implements InterfaceC1237370iIx {
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public final Animation LLJJJJLIIL;

    public C1749220vcW(Context context) {
        super(context, null, R.attr.xz);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxFormCounterView, R.attr.xz, 0);
        this.LLJJJJJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxFormCounterView__tux_formCounterErrorColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        this.LLJJJJLIIL = translateAnimation;
        translateAnimation.setInterpolator(new CycleInterpolator(2.0f));
        translateAnimation.setDuration(500L);
    }

    public final void setErrorColor(int i) {
        this.LLJJJJJIL = i;
    }

    @Override // X.InterfaceC1237370iIx
    public final void LJJII(int i, CharSequence charSequence) {
        int length;
        if (charSequence != null) {
            length = charSequence.length();
        } else {
            length = 0;
        }
        if (length <= i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(length);
            sbLIZ.append('/');
            sbLIZ.append(i);
            setText(C2188811AlT.LIZIZ(sbLIZ));
            this.LLJJJJ = false;
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strValueOf = String.valueOf(length);
        spannableStringBuilder.append((CharSequence) strValueOf).append((CharSequence) "/").append((CharSequence) String.valueOf(i));
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(this.LLJJJJJIL), 0, strValueOf.length(), 17);
        setText(spannableStringBuilder);
        if (this.LLJJJJ) {
            return;
        }
        startAnimation(this.LLJJJJLIIL);
        this.LLJJJJ = true;
    }
}
