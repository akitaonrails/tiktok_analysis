package X;

import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0DSZ {
    public final Context LIZ;
    public final Function0<Unit> LIZIZ;
    public final C01GW LIZJ;

    public void LIZ(LinearLayout linearLayout) {
        throw null;
    }

    public C0DSZ(Context context, Function0<Unit> function0) {
        this.LIZ = context;
        this.LIZIZ = function0;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 547));
        this.LIZJ = c01gwLIZIZ;
        View view = (View) c01gwLIZIZ.getValue();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.mjp);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.a9(tuxIconView, new ACListenerS108S0200000_4(this, tuxIconView, 29));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZ = R.raw.icon_chevron_left_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        tuxIconView.setTuxIcon(c419910GdJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), -1);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.M6(tuxIconView, layoutParams);
        C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 16);
        viewGroup.addView(tuxIconView);
        LIZ((LinearLayout) view.findViewById(R.id.dma));
        view.findViewById(R.id.tks);
    }
}
