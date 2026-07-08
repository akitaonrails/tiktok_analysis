package X;

import Y.ACListenerS151S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990470bsj extends LinearLayout {
    public TuxIconView LL;
    public ImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;
    public ValueAnimator LLILZIL;

    public final ImageView getStarAtlasTcmIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vxc);
            this.LLILLJJLI = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final TuxTextView getStarAtlasToastFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vxd);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getTcmCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xfu);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILZIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.LLILZIL;
    }

    public final View getUnderView() {
        return this.LLILZ;
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.LLILZIL = valueAnimator;
    }

    public final void setStarAtlasTcmIconFromXml(ImageView imageView) {
        this.LLILLJJLI = imageView;
    }

    public final void setStarAtlasToastFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTcmCloseFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setUnderView(View view) {
        this.LLILZ = view;
    }

    public C990470bsj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.LJLLJ(context, R.layout.ia6, this);
        setOrientation(1);
        C786410Ut5.a9(getTcmCloseFromXml(), new ACListenerS151S0100000_16(this, 56));
        String string = getContext().getString(2131848638);
        String string2 = getContext().getString(2131848637);
        SpannableString spannableString = new SpannableString(getContext().getString(2131848637, string));
        int iLJJJ = a0.LJJJ(string2, "%s", 0, false, 6);
        int iLJJJ2 = a0.LJJJ(string2, "%s", 0, false, 6) + string.length();
        if (iLJJJ >= 0 && iLJJJ2 <= spannableString.length()) {
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, iLJJJ2, 33);
        }
        getStarAtlasTcmIconFromXml().setImageResource(R.drawable.c7n);
        getStarAtlasToastFromXml().setText(spannableString);
        setLayerType(1, null);
    }
}
