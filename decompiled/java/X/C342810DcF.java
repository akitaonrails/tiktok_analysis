package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342810DcF implements C0SH7 {
    @Override // X.C0SH7
    public final View LIZ(Context context) {
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new ViewGroup.MarginLayoutParams(-2, -2));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        tuxIconView.setTuxIcon(c419910GdJ);
        return tuxIconView;
    }
}
