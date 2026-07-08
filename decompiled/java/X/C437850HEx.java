package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437850HEx extends AbstractC437860HEy {
    public Function0<Unit> LLILZIL;
    public Function0<Unit> LLILZLL;

    @Override // X.AbstractC437860HEy
    public final View LIZ() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        C786410Ut5.e6(relativeLayout, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66))));
        C426750GoL.LJIIL(relativeLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(16, R.id.s72);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setId(R.id.s74);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView2.setId(R.id.s74);
        C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView2.setTuxFont(81);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        tuxTextView2.setText(tuxTextView2.getContext().getString(2131847380));
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(tuxTextView2);
        relativeLayout.addView(linearLayout);
        C197039127h c197039127h = new C197039127h(getContext(), null, 6, 0);
        c197039127h.setId(R.id.s72);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, R.id.s71);
        layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.J6(c197039127h, layoutParams2);
        c197039127h.setText(c197039127h.getContext().getString(R.string.gm7));
        c197039127h.setButtonSize(1);
        c197039127h.setButtonVariant(1);
        c197039127h.setTuxFont(52);
        relativeLayout.addView(c197039127h);
        C197039127h c197039127h2 = new C197039127h(getContext(), null, 6, 0);
        c197039127h2.setId(R.id.s71);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), -2);
        layoutParams3.addRule(21);
        layoutParams3.addRule(15);
        C786410Ut5.J6(c197039127h2, layoutParams3);
        c197039127h2.setButtonSize(1);
        c197039127h2.setButtonVariant(0);
        c197039127h2.setTuxFont(52);
        c197039127h2.setText(c197039127h2.getContext().getString(2131823125));
        relativeLayout.addView(c197039127h2);
        addView(relativeLayout);
        return relativeLayout;
    }

    public final void setAcceptCallback(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public final void setDeleteCallback(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    public C437850HEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
