package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS273S0300000_29;

/* JADX INFO: renamed from: X.11GN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11GN<T extends View> {
    public final T LIZ;
    public final View LIZIZ;
    public final TuxSpinner LIZJ;

    public C11GN(Context context, AttributeSet attributeSet, AwS273S0300000_29 awS273S0300000_29) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, R.attr.z2, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTextCell__tux_textCellLoadingIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellLoadingIconColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout frameLayout = new FrameLayout(context);
        this.LIZIZ = frameLayout;
        T t = (T) awS273S0300000_29.invoke();
        this.LIZ = t;
        T t2 = this.LIZ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        C786410Ut5.W5(t2, layoutParams);
        TuxSpinner tuxSpinner = new TuxSpinner(context, null, 6, 0);
        this.LIZJ = tuxSpinner;
        tuxSpinner.LIZ(resourceId, color);
        TuxSpinner tuxSpinner2 = this.LIZJ;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams2.gravity = 17;
        C786410Ut5.X6(tuxSpinner2, layoutParams2);
        frameLayout.addView(t);
        frameLayout.addView(tuxSpinner);
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 216), frameLayout);
        C786410Ut5.LLZILL(tuxSpinner, 8);
    }
}
