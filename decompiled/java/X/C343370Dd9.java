package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343370Dd9 extends FrameLayout {
    public final TuxTextView LL;
    public final C197039127h LLILLJJLI;

    public C343370Dd9(Context context) {
        super(context, null, 0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextAlignment(4);
        tuxTextView.setTextColor(C343420DdE.LIZJ(R.attr.zi, context));
        tuxTextView.setTuxFont(103);
        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108)));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(C912070ZqH.LIZIZ.LJIL(context, 2131831773, new String[0]));
        this.LL = tuxTextView;
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 81);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C786410Ut5.J6(c197039127h, layoutParams);
        c197039127h.setText(context.getString(2131831784));
        c197039127h.setButtonSize(1);
        c197039127h.setButtonVariant(0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
        c197039127h.setBackground(c384050F3z.LIZ(context));
        c197039127h.setTextColorRes(R.attr.z_);
        C427690Gpr.LJ(c197039127h, C418440Gaw.LIZIZ(5));
        this.LLILLJJLI = c197039127h;
        setBackgroundColor(C343420DdE.LIZJ(R.attr.a1a, context));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 1);
        layoutParams2.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), 0, 0);
        addView(tuxTextView, layoutParams2);
        addView(c197039127h);
    }

    public final void setOnRevealClickListener(Function1<? super View, Unit> function1) {
        C786410Ut5.U8(this.LLILLJJLI, new ACListenerS139S0100000_4(function1, 90));
    }
}
