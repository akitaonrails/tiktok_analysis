package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03D2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03D2 extends LinearLayout {
    public final TuxTextView LL;

    public C03D2(Context context) {
        super(context, null, 0);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(LinearLayout.generateViewId());
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        tuxIconView.setIconRes(R.raw.icon_star_fill);
        tuxIconView.setTintColorRes(R.attr.ny);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(LinearLayout.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setTuxFont(61);
        this.LL = tuxTextView;
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setId(LinearLayout.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams2.gravity = 16;
        C786410Ut5.M6(tuxIconView2, layoutParams2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.drawable.b75;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ng);
        tuxIconView2.setTuxIcon(c419910GdJ);
        setId(R.id.v7o);
        setOrientation(0);
        setGravity(16);
        addView(tuxIconView);
        addView(tuxTextView);
        addView(tuxIconView2);
    }
}
