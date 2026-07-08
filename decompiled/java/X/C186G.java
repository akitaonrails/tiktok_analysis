package X;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TopBrand;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.186G, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C186G extends ConstraintLayout {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public LinearLayout LLILZ;

    public C186G(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final View getBrandBgCoverFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.civ);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final C427660Gpo getBrandLogoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cjc);
            this.LL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final TuxTextView getBrandNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cje);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getContentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eux);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setBrandBgCoverFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setBrandLogoFromXml(C427660Gpo c427660Gpo) {
        this.LL = c427660Gpo;
    }

    public final void setBrandNameFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setContentContainerFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void e0(TopBrand topBrand, C186J c186j) {
        Integer numValueOf;
        Integer numValueOf2;
        C03IT imageUrlModel;
        Image image = topBrand.icon;
        ViewGroup.LayoutParams layoutParams = null;
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            C427660Gpo.LJIIJJI(getBrandLogoFromXml(), imageUrlModel, false, null, null, false, false, null, new C463040IDu(null, new AwS576S0100000_32(this, 175), 6), false, null, 862);
        } else {
            C0H1U.LIZIZ(getBrandLogoFromXml());
        }
        String str = topBrand.text;
        if (str != null && str.length() != 0) {
            getBrandNameFromXml().setText(str);
            try {
                Integer numValueOf3 = Integer.valueOf(Color.parseColor(topBrand.textColor));
                if (numValueOf3 != null) {
                    getBrandNameFromXml().setTextColor(numValueOf3.intValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C12ES.LJIILL(0, this);
        String str2 = topBrand.backgroundColor;
        if (str2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            try {
                numValueOf = Integer.valueOf(Color.parseColor(str2));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                numValueOf = null;
            }
            c384050F3z.LIZ = numValueOf;
            c384050F3z.LJIIJ = Float.valueOf(c186j.LIZ);
            c384050F3z.LJIIJJI = Float.valueOf(c186j.LIZIZ);
            setBackground(c384050F3z.LIZ(getContext()));
            View brandBgCoverFromXml = getBrandBgCoverFromXml();
            C384050F3z c384050F3z2 = new C384050F3z();
            try {
                numValueOf2 = Integer.valueOf(Color.parseColor("#D9F5F5F5"));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                numValueOf2 = null;
            }
            c384050F3z2.LIZ = numValueOf2;
            c384050F3z2.LJIIJ = Float.valueOf(c186j.LIZ);
            c384050F3z2.LJIIJJI = Float.valueOf(c186j.LIZIZ);
            brandBgCoverFromXml.setBackground(c384050F3z2.LIZ(getContext()));
            C12ES.LJIILL(0, getBrandBgCoverFromXml());
        } else {
            C0H1U.LIZIZ(getBrandBgCoverFromXml());
        }
        if (c186j.LJ > 0 || c186j.LJFF > 0) {
            getContentContainerFromXml().setPadding(c186j.LJ, 0, c186j.LJFF, 0);
        }
        int i = c186j.LIZLLL;
        if (i > 0) {
            C1744700vVE.LJIIIIZZ(i, this);
        }
        if (c186j.LIZJ > 0) {
            getBrandNameFromXml().setTuxFont(c186j.LIZJ);
        }
        if (c186j.LJI > 0) {
            C427660Gpo brandLogoFromXml = getBrandLogoFromXml();
            ViewGroup.LayoutParams layoutParams2 = brandLogoFromXml.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = layoutParams2;
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams3 != null) {
                int i2 = c186j.LJI;
                layoutParams3.width = i2;
                layoutParams3.height = i2;
                C786410Ut5.W5(brandLogoFromXml, layoutParams3);
            }
        }
    }

    public C186G(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1701430uNR.LIZ(context, R.layout.bwk, this, true);
    }

    public /* synthetic */ C186G(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
