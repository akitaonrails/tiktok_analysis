package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import wh6.AbS687S0100000_4;

/* JADX INFO: renamed from: X.0DcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342820DcG implements C0SH7 {
    public Function1<? super View, Unit> LIZ;

    @Override // X.C0SH7
    public final View LIZ(Context context) {
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37))));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_x_mark;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.I7(new AbS687S0100000_4(this, 3), tuxIconView);
        return tuxIconView;
    }
}
