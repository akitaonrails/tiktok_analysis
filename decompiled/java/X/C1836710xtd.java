package X;

import Y.AUListenerS275S0100000_27;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import tikcast.api.anchor_data.FinishEncourageDecoupling;

/* JADX INFO: renamed from: X.0xtd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836710xtd extends ConstraintLayout {
    public FinishEncourageDecoupling LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public ValueAnimator LLILZIL;
    public AnimatorSet LLILZLL;
    public InterfaceC1836730xtf LLIZ;

    public final void play() {
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(6.0f));
        float f = -fLIZIZ;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LLILLJJLI, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.16666667f, f), Keyframe.ofFloat(0.33333334f, fLIZIZ), Keyframe.ofFloat(0.5f, f), Keyframe.ofFloat(0.6666667f, fLIZIZ), Keyframe.ofFloat(0.8333333f, f), Keyframe.ofFloat(1.0f, 0.0f)));
        objectAnimatorOfPropertyValuesHolder.setDuration(390L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            C500260Jjc.LJIILLIIL(c16f5);
        }
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        fArr[1] = this.LL != null ? r0.diamonds : 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        this.LLILZIL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(400L);
        }
        ValueAnimator valueAnimator = this.LLILZIL;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(C1619980sG4.LIZLLL());
        }
        ValueAnimator valueAnimator2 = this.LLILZIL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS275S0100000_27(this, 28));
        }
        ValueAnimator valueAnimator3 = this.LLILZIL;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public C1836710xtd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1836710xtd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(new C1361400lX0(context, C011Z.LIZ.LJ()), R.layout.gz6, this);
        TextView textView = (TextView) findViewById(R.id.y3b);
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.vlj);
        C16F5 c16f5 = (C16F5) findViewById(R.id.uid);
        this.LLILLL = c16f5;
        C16F5 c16f52 = (C16F5) findViewById(R.id.ftp);
        this.LLILZ = c16f52;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131856127));
        }
        if (c16f52 != null) {
            c16f52.setText(CardStruct.IStatusCode.DEFAULT);
        }
        C1143680frq.LJ(this.LLILLJJLI, "tiktok_live_broadcast_demand_13", "ttlive_end_slr_diamonds.png", ImageView.ScaleType.CENTER_CROP);
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 900, 12.0f, 1.0f, null, -6.0f, 100, null, 144);
        if (c16f52 != null) {
            c16f52.setTypeface(typefaceLIZIZ);
        }
        if (c16f5 != null) {
            c16f5.setTypeface(typefaceLIZIZ);
        }
    }
}
