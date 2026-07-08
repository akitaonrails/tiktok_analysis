package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421410Gfj extends FrameLayout {
    public Animation LL;
    public C16F5 LLILLJJLI;
    public InterfaceC421430Gfl LLILLL;
    public int LLILZ;
    public boolean LLILZIL;

    public final void setCountDownListener(InterfaceC421430Gfl interfaceC421430Gfl) {
        this.LLILLL = interfaceC421430Gfl;
    }

    public C421410Gfj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CountDownView, 0, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getInteger(R$styleable.CountDownView_count_down, 4000);
        this.LLILZIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CountDownView_remove, true);
        typedArrayObtainStyledAttributes.recycle();
        Context context2 = getContext();
        C16F5 c16f5 = new C16F5(getContext(), null);
        c16f5.LJJJI(R.style.a8r);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0p, context2);
        c16f5.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        c16f5.setTextSize(60.0f);
        c16f5.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(c16f5, layoutParams);
        this.LLILLJJLI = c16f5;
        this.LL = AnimationUtils.loadAnimation(context2, R.anim.cc);
    }
}
