package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343450DdH extends FrameLayout {
    public final TuxTextView LL;

    public C343450DdH(Context context) {
        super(context, null, 0);
        TuxTextView tuxTextViewLIZIZ = C343420DdE.LIZIZ(context);
        this.LL = tuxTextViewLIZIZ;
        setBackgroundColor(C343420DdE.LIZJ(R.attr.a1a, context));
        addView(tuxTextViewLIZIZ, new FrameLayout.LayoutParams(-1, -2, 17));
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
