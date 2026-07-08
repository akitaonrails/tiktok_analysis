package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06YW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06YW extends LinearLayout {
    public final C888120Ysk LL;
    public final TuxTextView LLILLJJLI;
    public boolean LLILLL;

    public final void LIZ() {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (this.LLILLL) {
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setTuxFont(62);
        } else {
            tuxTextView.setTextColorRes(R.attr.a1i);
            tuxTextView.setTuxFont(61);
        }
        if (!this.LLILLL) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            setBackground(c384050F3z.LIZ(getContext()));
            return;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z2.LJFF = Integer.valueOf(R.attr.a00);
        setBackground(c384050F3z2.LIZ(getContext()));
    }

    public final C888120Ysk getOption() {
        return this.LL;
    }

    public final boolean getOptionSelected() {
        return this.LLILLL;
    }

    public final void setOptionSelected(boolean z) {
        if (this.LLILLL != z) {
            this.LLILLL = z;
            LIZ();
        }
    }

    public C06YW(Context context, C888120Ysk c888120Ysk) {
        super(context);
        this.LL = c888120Ysk;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setGravity(17);
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        tuxTextView.setText(c888120Ysk.LIZ);
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
        this.LLILLJJLI = tuxTextView;
        setOrientation(0);
        setGravity(17);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C426750GoL.LJIIIZ(this, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
        addView(tuxTextView);
        LIZ();
    }
}
