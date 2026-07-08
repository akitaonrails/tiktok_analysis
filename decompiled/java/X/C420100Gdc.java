package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS134S0201000_8;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420100Gdc extends AbstractC420230Gdp {
    public final Context LIZIZ;
    public final AbstractC420130Gdf LIZJ;
    public final Function0<Unit> LIZLLL;
    public final C01GW LJ;
    public final View LJFF;

    @Override // X.InterfaceC1657550tEf
    public final View getItemView() {
        return (View) this.LJ.getValue();
    }

    @Override // X.InterfaceC1657550tEf
    public final void LIZ(boolean z) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        LIZIZ(z);
        boolean z2 = this.LIZJ instanceof C420120Gde;
        int i = R.attr.z_;
        if (z2) {
            View view = this.LJFF;
            if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
                if (!z) {
                    i = R.attr.zi;
                }
                tuxTextView.setTextColorRes(i);
                return;
            }
            return;
        }
        View view2 = this.LJFF;
        if (!(view2 instanceof TuxIconView) || (tuxIconView = (TuxIconView) view2) == null) {
            return;
        }
        if (!z) {
            i = R.attr.zi;
        }
        tuxIconView.setTintColorRes(i);
    }

    public C420100Gdc(Context context, AbstractC420130Gdf abstractC420130Gdf, AwS134S0201000_8 awS134S0201000_8) {
        View view;
        this.LIZIZ = context;
        this.LIZJ = abstractC420130Gdf;
        this.LIZLLL = awS134S0201000_8;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1150));
        this.LJ = c01gwLIZIZ;
        boolean z = abstractC420130Gdf instanceof C420120Gde;
        Float fValueOf = Float.valueOf(58.0f);
        Float fValueOf2 = Float.valueOf(42.0f);
        int i = 0;
        if (z) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
            tuxTextView.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf2)));
            layoutParams.gravity = 17;
            C786410Ut5.R6(tuxTextView, layoutParams);
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)))), null, 26);
            C786410Ut5.B5(tuxTextView, 0.9f);
            tuxTextView.setGravity(17);
            Integer num = abstractC420130Gdf.LIZ;
            if (num != null) {
                tuxTextView.setText(num.intValue());
            }
            tuxTextView.setTuxFont(42);
            view = tuxTextView;
        } else {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            tuxIconView.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf2)));
            layoutParams2.gravity = 17;
            C786410Ut5.M6(tuxIconView, layoutParams2);
            C786410Ut5.x5(tuxIconView, 0.9f);
            C420150Gdh c420150GdhLIZ = abstractC420130Gdf.LIZ();
            view = tuxIconView;
            if (c420150GdhLIZ != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(24.0f)));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(24.0f)));
                c419910GdJ.LIZ = c420150GdhLIZ.LIZ;
                Context context2 = tuxIconView.getContext();
                float f = c420150GdhLIZ.LIZIZ;
                C0GXQ c0gxq = new C0GXQ(context2, c419910GdJ.LIZ);
                c0gxq.LJIIZILJ = f;
                c0gxq.invalidateSelf();
                int i2 = c419910GdJ.LIZIZ;
                if (i2 >= 0) {
                    c0gxq.LJII(i2);
                }
                int i3 = c419910GdJ.LIZJ;
                if (i3 >= 0) {
                    c0gxq.LJ(i3);
                }
                Integer num2 = c419910GdJ.LIZLLL;
                if (num2 != null) {
                    c0gxq.LJFF(num2.intValue());
                }
                Integer num3 = c419910GdJ.LJ;
                if (num3 != null) {
                    c0gxq.LJI(num3.intValue(), context2);
                }
                c0gxq.LIZLLL(c419910GdJ.LJFF);
                c0gxq.LJIILLIIL = c419910GdJ.LJI;
                tuxIconView.setImageDrawable(c0gxq);
                view = tuxIconView;
            }
        }
        this.LJFF = view;
        C786410Ut5.I7(new AkS78S0100000_6(awS134S0201000_8, 16), (View) c01gwLIZIZ.getValue());
        FrameLayout frameLayout = (FrameLayout) c01gwLIZIZ.getValue();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf2)));
        layoutParams3.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams3);
        frameLayout.addView(view);
        LIZ(false);
    }
}
