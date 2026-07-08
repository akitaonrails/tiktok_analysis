package X;

import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.186Q, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C186Q implements AnonymousClass1867<C425870Gmv> {
    public C186V LIZ = new C19345310mJ(0);

    @Override // X.AnonymousClass1867
    public final TuxTextView LIZ(C425870Gmv c425870Gmv) {
        C425870Gmv c425870Gmv2 = c425870Gmv;
        int iIndexOf = this.LIZ.LJIILLIIL().indexOf("format_origin_price");
        if (iIndexOf >= c425870Gmv2.getChildCount()) {
            iIndexOf = -1;
        }
        TuxTextView tuxTextView = new TuxTextView(c425870Gmv2.getContext(), null, 6, 0);
        tuxTextView.setId(R.id.gls);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTuxFont(this.LIZ.LJII());
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(this.LIZ.LIZLLL());
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextPaint paint = tuxTextView.getPaint();
        paint.setFlags(16);
        paint.setAntiAlias(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelSize(R.dimen.ug));
        c425870Gmv2.addView(tuxTextView, iIndexOf, marginLayoutParams);
        return tuxTextView;
    }

    @Override // X.AnonymousClass1867
    public final TuxTextView LIZIZ(C425870Gmv c425870Gmv) {
        C425870Gmv c425870Gmv2 = c425870Gmv;
        int iIndexOf = this.LIZ.LJIILLIIL().indexOf("format_available_price");
        if (iIndexOf >= c425870Gmv2.getChildCount()) {
            iIndexOf = -1;
        }
        TuxTextView tuxTextView = new TuxTextView(c425870Gmv2.getContext(), null, 6, 0);
        tuxTextView.setId(R.id.gma);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setGravity(this.LIZ.LJIIIIZZ());
        c425870Gmv2.addView(tuxTextView, iIndexOf, new ViewGroup.MarginLayoutParams(-2, -2));
        return tuxTextView;
    }

    @Override // X.AnonymousClass1867
    public final TuxTextView LIZJ(C425870Gmv c425870Gmv) {
        C425870Gmv c425870Gmv2 = c425870Gmv;
        int iIndexOf = this.LIZ.LJIILLIIL().indexOf("discount_tag");
        if (iIndexOf >= c425870Gmv2.getChildCount()) {
            iIndexOf = -1;
        }
        AttributeSet attributeSet = null;
        if (this.LIZ.LJIILL().LJ() == EnumC19355010ns.NONE) {
            return null;
        }
        TuxTextView tuxTextView = new TuxTextView(c425870Gmv2.getContext(), attributeSet, 6, 0);
        tuxTextView.setId(R.id.gkp);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(17);
        tuxTextView.setTextAlignment(5);
        if (C19355510nx.LIZ[this.LIZ.LJIILL().LJ().ordinal()] == 1) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = this.LIZ.LJIILL().LIZJ();
            c384050F3z.LIZIZ = this.LIZ.LJIILL().LIZIZ();
            tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
        }
        C426750GoL.LJIIL(tuxTextView, this.LIZ.LJIILL().LJII(), 0, this.LIZ.LJIILL().LJII(), 0, 16);
        Integer numLJI = this.LIZ.LJIILL().LJI();
        if (numLJI != null) {
            tuxTextView.setTuxFont(numLJI.intValue());
        }
        Integer numLJFF = this.LIZ.LJIILL().LJFF();
        if (numLJFF != null) {
            tuxTextView.setTextColorRes(numLJFF.intValue());
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelSize(R.dimen.ug));
        c425870Gmv2.addView(tuxTextView, iIndexOf, marginLayoutParams);
        return tuxTextView;
    }

    @Override // X.AnonymousClass1867
    public final TuxTextView LIZLLL(C425870Gmv c425870Gmv) {
        C425870Gmv c425870Gmv2 = c425870Gmv;
        TuxTextView tuxTextView = new TuxTextView(c425870Gmv2.getContext(), null, 6, 0);
        tuxTextView.setId(R.id.gmc);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setGravity(this.LIZ.LJIIIIZZ());
        tuxTextView.setTuxFont(this.LIZ.LJIILIIL());
        tuxTextView.setTextColorRes(this.LIZ.LJI());
        c425870Gmv2.addView(tuxTextView, new ViewGroup.MarginLayoutParams(-2, -2));
        return tuxTextView;
    }

    @Override // X.AnonymousClass1867
    public final void LJ(C19345310mJ c19345310mJ) {
        this.LIZ = c19345310mJ;
    }
}
