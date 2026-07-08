package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343410DdD extends FrameLayout {
    public final C426320Gne LL;
    public final TuxTextView LLILLJJLI;

    public C343410DdD(Context context) {
        super(context, null, 0);
        C426320Gne c426320Gne = new C426320Gne(context, null, 6);
        this.LL = c426320Gne;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextColorRes(R.attr.zi);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTuxFont(72);
        tuxTextView.setTextAlignment(4);
        this.LLILLJJLI = tuxTextView;
        setBackgroundColor(C343420DdE.LIZJ(R.attr.a1a, context));
        addView(c426320Gne, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), 17));
        addView(tuxTextView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void setProgress$im_camera_card_release(int i) {
        this.LL.LIZ(i, false);
        TuxTextView tuxTextView = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        invalidate();
    }
}
