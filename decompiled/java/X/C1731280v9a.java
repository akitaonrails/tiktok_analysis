package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0v9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731280v9a implements InterfaceC1731410v9n {
    public final C428440Gr4 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1354));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1355));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1358));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1357));
    public Function0<Unit> LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public C1731280v9a(C428440Gr4 c428440Gr4) {
        this.LIZ = c428440Gr4;
        c428440Gr4.setSubLayoutId(R.layout.bug);
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZ(TemplateItem templateItem) {
        String str;
        TemplateFieldProduct templateFieldProduct;
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        Integer numLIZ;
        int iIntValue;
        TemplateFieldData templateFieldData2;
        TemplateFieldData templateFieldData3;
        TemplateFieldProduct templateFieldProduct2;
        if (templateItem.getType() != 3) {
            return;
        }
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        C1723530ux5.LIZLLL(this.LIZ, templateItem.gy(), new AwS570S0100000_26(this, 1356));
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(2, templateItem.T5());
        String str2 = null;
        if (templateField != null && (templateFieldData3 = templateField.fieldData) != null && (templateFieldProduct2 = templateFieldData3.fieldProduct) != null) {
            str = templateFieldProduct2.productImage;
        } else {
            str = null;
        }
        SmartImageView smartImageView = (SmartImageView) this.LIZIZ.getValue();
        if (str != null && str.length() != 0) {
            if (this.LJFF == null) {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LIZLLL);
            } else {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(str);
                c1331670kl3LIZLLL2.LJJIJL(this.LIZ.getContext());
                c1331670kl3LIZLLL2.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LIZLLL2.LJJII(new C1775630wJ7(smartImageView, this, 10));
            }
        } else {
            this.LJIIIIZZ = true;
        }
        TemplateField templateField2 = (TemplateField) C13LP.LJJJLZIJ(0, templateItem.T5());
        if (templateField2 != null && (templateFieldData2 = templateField2.fieldData) != null) {
            templateFieldProduct = templateFieldData2.fieldProduct;
            if (templateFieldProduct != null) {
                str2 = templateFieldProduct.productImage;
            }
        } else {
            templateFieldProduct = null;
        }
        SmartImageView smartImageView2 = (SmartImageView) this.LIZJ.getValue();
        if (str2 != null && str2.length() != 0) {
            if (this.LJFF == null) {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL3 = C1326790kdB.LIZLLL(str2);
                c1331670kl3LIZLLL3.LJJ(smartImageView2);
                C786410Ut5.h3(c1331670kl3LIZLLL3);
            } else {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL4 = C1326790kdB.LIZLLL(str2);
                c1331670kl3LIZLLL4.LJJIJL(this.LIZ.getContext());
                c1331670kl3LIZLLL4.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LIZLLL4.LJJII(new C1775630wJ7(smartImageView2, this, 11));
            }
        } else {
            this.LJII = true;
        }
        if (C123100dR.LIZ(str2) && (numLIZ = templateFieldProduct.LIZ()) != null && (iIntValue = numLIZ.intValue()) > 0) {
            C12ES.LJIILL(0, (View) this.LIZLLL.getValue());
            ((TextView) this.LIZLLL.getValue()).setText(String.valueOf(iIntValue));
            View view = (View) this.LIZLLL.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.e3, this.LIZ.getContext());
            c384050F3z.LJIIIIZZ = Float.valueOf(C341940Daq.LIZ(6.0d));
            c384050F3z.LJIIJJI = Float.valueOf(C341940Daq.LIZ(6.0d));
            view.setBackground(c384050F3z.LIZ(this.LIZ.getContext()));
        }
        TemplateField templateField3 = (TemplateField) C13LP.LJJJLZIJ(1, templateItem.T5());
        if (templateField3 != null && (templateFieldData = templateField3.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) this.LJ.getValue()).setText(templateFieldText.content);
            C1723530ux5.LIZJ((TuxTextView) this.LJ.getValue(), templateFieldText.lineLimit);
        }
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZIZ(AwS407S0200000_6 awS407S0200000_6) {
        this.LJFF = awS407S0200000_6;
    }
}
