package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.113n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194393113n extends FrameLayout {
    public C194394113o LL;
    public C194390113k LLILLJJLI;
    public final C01GW LLILLL;

    private final C1361400lX0 getDarkCtx() {
        return (C1361400lX0) this.LLILLL.getValue();
    }

    public C194393113n(Context context) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        TuxIconView tuxIconView2;
        RadiusLayout radiusLayout;
        super(context, null);
        this.LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1001));
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d3t, this, false);
        addView(viewTd);
        int i = R.id.et7;
        RadiusLayout radiusLayout2 = (RadiusLayout) C1616006Uk.LIZ(R.id.et7, viewTd);
        if (radiusLayout2 != null) {
            i = R.id.l8s;
            TuxIconView tuxIconView3 = (TuxIconView) C1616006Uk.LIZ(R.id.l8s, viewTd);
            if (tuxIconView3 != null) {
                i = R.id.ltz;
                TuxIconView tuxIconView4 = (TuxIconView) C1616006Uk.LIZ(R.id.ltz, viewTd);
                if (tuxIconView4 != null) {
                    i = R.id.tv_search;
                    TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_search, viewTd);
                    if (tuxTextView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
                        this.LL = new C194394113o(constraintLayout, radiusLayout2, tuxIconView3, tuxIconView4, tuxTextView2);
                        if (constraintLayout != null) {
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
                            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
                            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1b, getDarkCtx());
                            constraintLayout.setBackground(c384050F3z.LIZ(getDarkCtx()));
                        }
                        C194394113o c194394113o = this.LL;
                        if (c194394113o != null && (radiusLayout = c194394113o.LLILLJJLI) != null) {
                            C786410Ut5.I7(new AkS95S0100000_29(this, 83), radiusLayout);
                        }
                        C194394113o c194394113o2 = this.LL;
                        if (c194394113o2 != null && (tuxIconView2 = c194394113o2.LLILZ) != null) {
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                            c419910GdJ.LIZ = R.raw.icon_magnifying_glass;
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                            tuxIconView2.setTuxIcon(c419910GdJ);
                        }
                        C194394113o c194394113o3 = this.LL;
                        if (c194394113o3 != null && (tuxTextView = c194394113o3.LLILZIL) != null) {
                            tuxTextView.setText(tuxTextView.getContext().getString(2131834082));
                        }
                        C194394113o c194394113o4 = this.LL;
                        if (c194394113o4 != null && (tuxIconView = c194394113o4.LLILLL) != null) {
                            C786410Ut5.I7(new AkS95S0100000_29(this, 84), tuxIconView);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
