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

/* JADX INFO: renamed from: X.0v9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731240v9W implements InterfaceC1731410v9n {
    public final C428440Gr4 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1361));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1359));
    public Function0<Unit> LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public C1731240v9W(C428440Gr4 c428440Gr4) {
        this.LIZ = c428440Gr4;
        c428440Gr4.setSubLayoutId(R.layout.buh);
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZ(TemplateItem templateItem) {
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        String str;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText;
        if (templateItem.getType() != 6) {
            return;
        }
        this.LJ = false;
        this.LJFF = false;
        this.LJI = false;
        C1723530ux5.LIZLLL(this.LIZ, templateItem.gy(), new AwS570S0100000_26(this, 1360));
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, templateItem.T5());
        if (templateField != null && (templateFieldData2 = templateField.fieldData) != null && (templateFieldText = templateFieldData2.fieldText) != null) {
            ((TextView) this.LIZIZ.getValue()).setText(templateFieldText.content);
            String str2 = templateFieldText.content;
            if (str2 != null && str2.length() != 0) {
                C03DZ.LIZJ((View) this.LIZIZ.getValue());
            } else {
                C03DZ.LIZ((View) this.LIZIZ.getValue());
            }
            C1723530ux5.LIZJ((TuxTextView) this.LIZIZ.getValue(), templateFieldText.lineLimit);
        }
        TemplateField templateField2 = (TemplateField) C13LP.LJJJLZIJ(1, templateItem.T5());
        if (templateField2 != null && (templateFieldData = templateField2.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null && (str = templateFieldProduct.productImage) != null) {
            SmartImageView smartImageView = (SmartImageView) this.LIZJ.getValue();
            if (this.LIZLLL == null) {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LIZLLL);
                return;
            }
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL2.LJJIJL(this.LIZ.getContext());
            c1331670kl3LIZLLL2.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LIZLLL2.LJJII(new C1775630wJ7(smartImageView, this, 12));
        }
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZIZ(AwS407S0200000_6 awS407S0200000_6) {
        this.LIZLLL = awS407S0200000_6;
    }
}
