package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343430DdF extends FrameLayout {
    public final TuxTextView LL;

    public C343430DdF(Context context) {
        super(context, null, 0);
        TuxTextView tuxTextViewLIZIZ = C343420DdE.LIZIZ(context);
        this.LL = tuxTextViewLIZIZ;
        setBackgroundColor(C343420DdE.LIZJ(R.attr.a1a, context));
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_play_fill);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        tuxIconView.setTintColorRes(R.attr.zi);
        tuxIconView.LIZJ(true);
        tuxIconView.setContentDescription(null);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(tuxIconView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
        View view = new View(context);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        linearLayout.addView(view);
        linearLayout.addView(tuxTextViewLIZIZ, new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -2, 17));
        addView(C343420DdE.LIZ(context));
    }

    public final void setText$im_camera_card_release(InterfaceC460300I3g interfaceC460300I3g) {
        TuxTextView tuxTextView = this.LL;
        C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
        Context context = getContext();
        c460270I3d.getClass();
        tuxTextView.setText(C460270I3d.LIZ(interfaceC460300I3g, context));
    }
}
