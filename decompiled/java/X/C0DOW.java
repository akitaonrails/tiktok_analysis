package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.0DOW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, boolean z) {
        FragmentManager supportFragmentManager;
        if (z) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C770750ULh c770750ULh = new C770750ULh();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_tick_circle_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a0i);
                c770750ULh.LIZ = c419910GdJ.LIZ(context);
                c770750ULh.LIZLLL = 3;
                c770750ULh.LJ = context.getResources().getString(2131844810);
                C0DOX[] c0doxArr = {new C0DOX(2, context.getResources().getString(2131844816), context.getResources().getString(2131844813)), new C0DOX(1, context.getResources().getString(2131844811), context.getResources().getString(2131844817)), new C0DOX(0, context.getResources().getString(2131844812), context.getResources().getString(2131844814))};
                ((ArrayList) c770750ULh.LJI).clear();
                ((ArrayList) c770750ULh.LJI).addAll(C13LQ.LJJLL(c0doxArr));
                c770750ULh.LJIILLIIL = true;
                c770750ULh.LJI(context.getResources().getString(2131844815), AFwS232S0000000_4.get$arr$(168));
                c770750ULh.LIZIZ().LIZ.show(supportFragmentManager, "submitDiscardIntroSheet");
                return;
            }
            return;
        }
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ2 == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ2);
        c1389890mGx.LJIIJ(context.getResources().getString(2131844810));
        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
        c1389890mGx.LJII(R.attr.a0i);
        c1389890mGx.LJIIJJI();
    }
}
