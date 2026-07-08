package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FLM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FLM extends LinearLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final C388780FMe LLILLL;

    public C0FLM(Context context) {
        super(context, null, 0);
        setOrientation(0);
        setGravity(17);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        tuxIconView.setClipToOutline(true);
        tuxIconView.setImportantForAccessibility(2);
        C786410Ut5.M6(tuxIconView, layoutParams);
        tuxIconView.setTintColorRes(R.attr.a1h);
        this.LL = tuxIconView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setTuxFont(52);
        tuxTextView.setTextColorRes(R.attr.a1h);
        this.LLILLJJLI = tuxTextView;
        C388780FMe c388780FMe = new C388780FMe(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        c388780FMe.setOrientation(0);
        layoutParams3.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c388780FMe);
        c388780FMe.setLayoutParams(layoutParams3);
        c388780FMe.addView(tuxIconView);
        c388780FMe.addView(tuxTextView);
        this.LLILLL = c388780FMe;
        addView(c388780FMe);
    }

    public final void setIcon(Integer num) {
        if (num != null) {
            num.intValue();
            this.LL.setIconRes(num.intValue());
        }
    }

    public final void setText(Integer num) {
        if (num != null) {
            num.intValue();
            this.LLILLJJLI.setText(num.intValue());
        } else {
            this.LLILLJJLI.setText("Add yours");
        }
    }
}
