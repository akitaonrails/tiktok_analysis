package X;

import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583360rJ0 extends FrameLayout {
    public TuxTextView LL;
    public C197039127h LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1593850rZv.LIZ.getClass();
        C1593850rZv.LIZIZ("show");
    }

    public C1583360rJ0(Context context) {
        int i;
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.em0, C786410Ut5.ne(context), this);
        this.LL = (TuxTextView) findViewById(R.id.t_4);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.t_3);
        this.LLILLJJLI = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 130));
        }
        C197039127h c197039127h2 = this.LLILLJJLI;
        if (c197039127h2 != null) {
            if (C426750GoL.LIZLLL(c197039127h2.getContext())) {
                i = R.raw.icon_arrow_right_circle_fill;
            } else {
                i = R.raw.icon_arrow_left_circle_fill;
            }
            c197039127h2.setButtonStartIcon(Integer.valueOf(i));
            c197039127h2.setTextColorRes(R.attr.u_);
            c197039127h2.setIconTintColorRes(R.attr.u_);
            c197039127h2.setButtonVariant(1);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            c197039127h2.setBackground(c384050F3z.LIZ(c197039127h2.getContext()));
            c197039127h2.setTuxFont(33);
            c197039127h2.LJJLI(true);
        }
    }

    public final void setTitle(String str) {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }
}
