package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420210Gdn extends AbstractC420230Gdp {
    public final Context LIZIZ;
    public final AbstractC1652960t7G LIZJ;
    public final Function1<AbstractC1652960t7G, Unit> LIZLLL;
    public boolean LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    @Override // X.InterfaceC1657550tEf
    public final View getItemView() {
        return (View) this.LJFF.getValue();
    }

    @Override // X.InterfaceC1657550tEf
    public final void LIZ(boolean z) {
        int i;
        LIZIZ(z);
        this.LJ = z;
        TuxTextView tuxTextView = (TuxTextView) this.LJI.getValue();
        if (this.LJ) {
            i = R.attr.z_;
        } else {
            i = R.attr.zi;
        }
        tuxTextView.setTextColorRes(i);
    }

    public C420210Gdn(Context context, AbstractC1652960t7G abstractC1652960t7G, Function1 function1) {
        int i;
        this.LIZIZ = context;
        this.LIZJ = abstractC1652960t7G;
        this.LIZLLL = function1;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1148));
        this.LJFF = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1149));
        this.LJI = c01gwLIZIZ2;
        FrameLayout frameLayout = (FrameLayout) c01gwLIZIZ.getValue();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(42.0f))));
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams);
        TuxTextView tuxTextView = (TuxTextView) c01gwLIZIZ2.getValue();
        if (this.LJ) {
            i = R.attr.z_;
        } else {
            i = R.attr.zi;
        }
        tuxTextView.setTextColorRes(i);
        LIZIZ(false);
        frameLayout.addView((View) c01gwLIZIZ2.getValue());
        C786410Ut5.O7(frameLayout, new ACListenerS141S0100000_6(this, 112));
    }
}
