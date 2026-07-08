package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Geg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C420760Geg extends FrameLayout {
    public C16F5 LL;

    public void setCountDownListener(InterfaceC357101a5 interfaceC357101a5) {
    }

    public C420760Geg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CountDownView, 0, 0);
        typedArrayObtainStyledAttributes.getInteger(R$styleable.CountDownView_count_down, 4000);
        typedArrayObtainStyledAttributes.recycle();
        Context context2 = getContext();
        C16F5 c16f5 = new C16F5(getContext(), null);
        this.LL = c16f5;
        c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, context2));
        this.LL.setTextColor(getResources().getColor(R.color.a3m));
        this.LL.setTextSize(60.0f);
        this.LL.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.LL, layoutParams);
        AnimationUtils.loadAnimation(context2, R.anim.gy);
    }
}
