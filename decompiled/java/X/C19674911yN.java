package X;

import Y.ALAdapterS1S0000000_16;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS98S0200000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11yN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19674911yN {
    public final Context LIZ;
    public final C2212201Bi6 LIZIZ;
    public final RelativeLayout LIZJ;
    public LinearLayout LIZLLL;
    public final InterfaceC19675011yO LJ;
    public final PointF LJFF = new PointF();
    public final int LJI;

    public C19674911yN(Context context, C2212201Bi6 c2212201Bi6, RelativeLayout relativeLayout, C2213141Bjc c2213141Bjc) {
        boolean z;
        boolean z2;
        ObjectAnimator objectAnimatorOfFloat;
        this.LIZ = context;
        this.LIZIZ = c2212201Bi6;
        this.LIZJ = relativeLayout;
        this.LJ = c2213141Bjc;
        this.LJI = ViewConfiguration.get(context).getScaledTouchSlop();
        int i = c2212201Bi6.LLLLII;
        if (i == 7) {
            z = true;
        } else {
            z = false;
        }
        if (z || i == 6) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.LIZLLL = linearLayout;
            linearLayout.setOrientation(1);
            this.LIZLLL.setBackgroundResource(R.drawable.d99);
            this.LIZLLL.setGravity(81);
            if (c2212201Bi6.LLLLII == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.d9c);
                imageView.setClickable(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = (int) C1057810ddL.LIZIZ(4.0f, context);
                this.LIZLLL.addView(imageView, layoutParams);
                HandlerHook.viewPost(imageView, new ARunnableS98S0200000_29(imageView, this, 5));
            }
            TextView textView = new TextView(context);
            textView.setText(c2212201Bi6.LLLLIIIILLL);
            textView.setTextColor(ColorStateList.valueOf(-1));
            textView.setTextSize(1, 15.0f);
            float fLIZIZ = (int) C1057810ddL.LIZIZ(1.0f, context);
            textView.setShadowLayer(fLIZIZ, 0.0f, fLIZIZ, Color.argb(31, 0, 0, 0));
            textView.setClickable(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = (int) C1057810ddL.LIZIZ(54.0f, context);
            this.LIZLLL.addView(textView, layoutParams2);
            if (c2212201Bi6.LLLLIIL > 0) {
                C786410Ut5.LJZL(8, this.LIZLLL);
                HandlerHook.viewPostDelay(this.LIZJ, new ARunnableS106S0100000_6(this, 12), c2212201Bi6.LLLLIIL);
            }
            if (c2212201Bi6.LLLLII == 7) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -C1057810ddL.LIZIZ(8.0f, context), 0.0f);
                objectAnimatorOfFloat.setDuration(2000L);
                objectAnimatorOfFloat.addListener(new ALAdapterS1S0000000_16(0));
            } else {
                objectAnimatorOfFloat = null;
            }
            this.LIZLLL.addOnAttachStateChangeListener(new C12YN(objectAnimatorOfFloat, this, 0));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) C1057810ddL.LIZIZ(114.0f, context));
            layoutParams3.addRule(12);
            relativeLayout.addView(this.LIZLLL, layoutParams3);
        }
    }
}
