package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.041Z, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C041Z {
    public static final TuxIconView LIZ(int i, Context context) {
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42))));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.z_);
        tuxIconView.setTuxIcon(c419910GdJ);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        tuxIconView.setBackground(c384050F3z.LIZ(context));
        return tuxIconView;
    }
}
