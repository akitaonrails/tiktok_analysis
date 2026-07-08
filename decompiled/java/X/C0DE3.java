package X;

import Y.ACListenerS108S0200000_4;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS215S0300000_6;

/* JADX INFO: renamed from: X.0DE3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DE3 {
    public final C19EG LIZ;
    public final C0DD8 LIZIZ;
    public final PdpViewModel LIZJ;

    public final void LIZIZ(C0D3O c0d3o) {
        Object parent;
        View view;
        ViewParent parent2;
        int iIntValue;
        int i = 8;
        if (c0d3o == null) {
            C786410Ut5.LJZL(8, this.LIZIZ.LLIZLLLIL.LL);
            return;
        }
        C786410Ut5.LJZL(0, this.LIZIZ.LLIZLLLIL.LL);
        this.LIZIZ.LLIZLLLIL.LLILLJJLI.setText(c0d3o.shopName);
        ImageView imageView = (ImageView) this.LIZIZ.LL.findViewById(R.id.l7i);
        View view2 = null;
        if (imageView != null) {
            parent = imageView.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        ImageView imageView2 = (ImageView) this.LIZIZ.LL.findViewById(R.id.l7k);
        if (imageView2 != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, imageView2.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -855310;
            }
            LIZ(iIntValue, imageView2);
        }
        if (C0FG3.LIZIZ(c0d3o.shopLogo)) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            if (imageView != null) {
                C0D8X.LIZ().LIZ(c0d3o.shopLogo, imageView, 0.0f, new AwS215S0300000_6(this, imageView, imageView2, 20));
            }
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
            }
        } else if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TextView textView = (TextView) this.LIZIZ.LL.findViewById(R.id.z70);
        if (textView != null) {
            textView.setText(c0d3o.shopName);
        }
        ImageView imageView3 = (ImageView) this.LIZIZ.LL.findViewById(R.id.l7j);
        if (imageView3 != null) {
            parent2 = imageView3.getParent();
        } else {
            parent2 = null;
        }
        if (parent2 instanceof View) {
            view2 = (View) parent2;
        }
        if (C0FG3.LIZIZ(c0d3o.shopLogo)) {
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            if (imageView3 != null) {
                C0D8X.LIZ().LIZ(c0d3o.shopLogo, imageView3, 0.0f, null);
            }
        } else if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        TextView textView2 = (TextView) this.LIZIZ.LL.findViewById(R.id.cmk);
        if (textView2 != null) {
            textView2.setText("Shop");
            if (c0d3o.showShopButton) {
                i = 0;
            }
            C786410Ut5.LLIL(textView2, i);
        }
        ACListenerS108S0200000_4 aCListenerS108S0200000_4 = new ACListenerS108S0200000_4(c0d3o, this, 25);
        if (textView2 != null) {
            C786410Ut5.T7(textView2, aCListenerS108S0200000_4);
        }
        TextView textView3 = (TextView) this.LIZIZ.LL.findViewById(R.id.z71);
        if (textView3 != null) {
            C786410Ut5.T7(textView3, aCListenerS108S0200000_4);
        }
    }

    public static void LIZ(int i, ImageView imageView) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, C2441009hQ.LJIIL(-16777216, 51)});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        imageView.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(i), gradientDrawable}));
    }

    public C0DE3(C19EG c19eg, C0DD8 c0dd8, PdpViewModel pdpViewModel) {
        this.LIZ = c19eg;
        this.LIZIZ = c0dd8;
        this.LIZJ = pdpViewModel;
    }
}
