package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03JO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JO extends LinearLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;

    public C03JO(Context context) {
        super(context, null, 0);
        setOrientation(0);
        setGravity(16);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        setClickable(true);
        setFocusable(true);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setTintColorRes(R.attr.a1h);
        this.LL = tuxIconView;
        addView(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(102);
        tuxTextView.setTextColorRes(R.attr.a1h);
        this.LLILLJJLI = tuxTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        addView(tuxTextView, layoutParams);
        addView(new View(context), new LinearLayout.LayoutParams(0, 0, 1.0f));
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setIconRes(R.raw.icon_tick_fill_small);
        tuxIconView2.setTintColorRes(R.attr.a1h);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        this.LLILLL = tuxIconView2;
        addView(tuxIconView2, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
    }

    public final void setItemSelected(boolean z) {
        int i;
        TuxIconView tuxIconView = this.LLILLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }
}
