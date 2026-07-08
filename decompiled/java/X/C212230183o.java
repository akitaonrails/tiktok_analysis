package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;

/* JADX INFO: renamed from: X.183o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212230183o extends C187Z<TuxTextView, AnonymousClass1845, AnonymousClass1849, AnonymousClass1842> {
    public final C197039127h LJII;
    public Boolean LJIIIIZZ;
    public Integer LJIIIZ;

    @Override // X.C187Z
    public final InterfaceC212322187c LJIIJJI() {
        return new AnonymousClass1842() { // from class: X.183s
            @Override // X.AnonymousClass1842
            public final void LIZ(C197039127h c197039127h, int i) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(i);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            }
        };
    }

    public C212230183o(C197039127h c197039127h) {
        super(c197039127h, "buy_layout");
        this.LJII = c197039127h;
        c197039127h.setButtonVariant(-1);
        c197039127h.setTuxFont(62);
        c197039127h.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    }

    public static final InterfaceC212322187c LJIILIIL(Object obj) {
        final AnonymousClass1849 anonymousClass1849 = (AnonymousClass1849) obj;
        return new AnonymousClass1842(anonymousClass1849) { // from class: X.183p
            public final AnonymousClass1849 LIZ;

            {
                this.LIZ = anonymousClass1849;
            }

            @Override // X.AnonymousClass1842
            public final void LIZ(C197039127h c197039127h, int i) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(this.LIZ.LIZ());
                c384050F3z.LIZ = Integer.valueOf(i);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            }
        };
    }

    public final void LJIILJJIL(AnonymousClass1845 anonymousClass1845) {
        String str;
        String str2;
        this.LJIIIIZZ = Boolean.valueOf(anonymousClass1845.LIZ);
        Integer num = anonymousClass1845.LIZIZ;
        if (num != null) {
            this.LJIIIZ = num;
        }
        C182R c182r = UsPopupCardVO.Companion;
        Integer num2 = this.LJIIIZ;
        c182r.getClass();
        BuyButtonProperty buyButtonPropertyLIZJ = C182R.LIZJ(num2);
        this.LJII.setText(buyButtonPropertyLIZJ.displayText);
        if (C960203pA.LIZIZ(this.LJII.getContext()) && C123100dR.LIZ(buyButtonPropertyLIZJ.displayTextColorDarkMode)) {
            str = buyButtonPropertyLIZJ.displayTextColorDarkMode;
        } else {
            str = buyButtonPropertyLIZJ.displayTextColor;
        }
        this.LJII.setTextColor(ColorProtector.parseColor(str));
        if (C960203pA.LIZIZ(this.LJII.getContext()) && C123100dR.LIZ(buyButtonPropertyLIZJ.backgroundColorDarkMode)) {
            str2 = buyButtonPropertyLIZJ.backgroundColorDarkMode;
        } else {
            str2 = buyButtonPropertyLIZJ.backgroundColor;
        }
        LJIIL().LIZ(this.LJII, ColorProtector.parseColor(str2));
    }
}
