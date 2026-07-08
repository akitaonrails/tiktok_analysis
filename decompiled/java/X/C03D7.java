package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03D7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03D7 extends LinearLayout {
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public final SmartImageView LL;
    public final LinearLayout LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;

    public C03D7(Context context) {
        super(context, null, 0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        int i = LLILZIL;
        int i2 = LLILZLL;
        setPadding(i, i2, i, i2);
        setOrientation(0);
        setGravity(16);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(LinearLayout.generateViewId());
        int i3 = LLIZ;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
        layoutParams2.setMarginEnd(LLIZLLLIL);
        layoutParams2.gravity = 48;
        C786410Ut5.G6(smartImageView, layoutParams2);
        this.LL = smartImageView;
        addView(smartImageView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(LinearLayout.generateViewId());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(8388611);
        this.LLILLJJLI = linearLayout;
        addView(linearLayout);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(LinearLayout.generateViewId());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(LLJI);
        C786410Ut5.R6(tuxTextView, layoutParams3);
        tuxTextView.setTuxFont(71);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        this.LLILZ = tuxTextView;
        addView(tuxTextView);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(LinearLayout.generateViewId());
        int i4 = LLJ;
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(i4, i4));
        tuxIconView.setIconRes(R.raw.icon_chevron_right_offset_ltr);
        tuxIconView.setTintColorRes(R.attr.a1k);
        this.LLILLL = tuxIconView;
        addView(tuxIconView);
    }
}
