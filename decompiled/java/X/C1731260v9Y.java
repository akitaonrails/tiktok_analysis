package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v9Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731260v9Y implements InterfaceC1731410v9n {
    public final C428440Gr4 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1343));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1345));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1348));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1344));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1347));
    public Function0<Unit> LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    public final boolean LIZJ() {
        return this.LJII && this.LJIIIIZZ && this.LJIIIZ && this.LJIIJ && !this.LJIIJJI;
    }

    public C1731260v9Y(C428440Gr4 c428440Gr4) {
        this.LIZ = c428440Gr4;
        c428440Gr4.setSubLayoutId(R.layout.bue);
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZ(TemplateItem templateItem) {
        String str;
        TemplateField next;
        String str2;
        TemplateField next2;
        TemplateField next3;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        Integer numValueOf;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText;
        TemplateField next4;
        String str3;
        TemplateFieldData templateFieldData3;
        TemplateFieldProduct templateFieldProduct2;
        TemplateFieldData templateFieldData4;
        TemplateFieldProduct templateFieldProduct3;
        if (templateItem.getType() != 9) {
            return;
        }
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        C1723530ux5.LIZLLL(this.LIZ, templateItem.gy(), new AwS570S0100000_26(this, 1346));
        Iterator<TemplateField> it2 = templateItem.T5().iterator();
        while (true) {
            str = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.fieldName, "product_image")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TemplateField templateField = next;
        if (templateField != null && (templateFieldData4 = templateField.fieldData) != null && (templateFieldProduct3 = templateFieldData4.fieldProduct) != null) {
            str2 = templateFieldProduct3.productImage;
        } else {
            str2 = null;
        }
        SmartImageView smartImageView = (SmartImageView) this.LIZJ.getValue();
        if (str2 != null && str2.length() != 0) {
            C12ES.LJIILL(0, smartImageView);
            if (this.LJI == null) {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str2);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LIZLLL);
            } else {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(str2);
                c1331670kl3LIZLLL2.LJJIJL(this.LIZ.getContext());
                c1331670kl3LIZLLL2.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LIZLLL2.LJJII(new C1775630wJ7(smartImageView, this, 9));
            }
        } else {
            this.LJIIIIZZ = true;
        }
        if (C123100dR.LIZ(str2)) {
            BillboardGiveawayInfo billboardGiveawayInfoVI = templateItem.vI();
            if (billboardGiveawayInfoVI != null && billboardGiveawayInfoVI.activityStatus == 2 && this.LJ.getValue() != null) {
                C12ES.LJIILL(0, (View) this.LJ.getValue());
                Iterator<TemplateField> it3 = templateItem.T5().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next4 = it3.next();
                        if (Intrinsics.LJFF(next4.fieldName, "giveaway_click_image")) {
                            break;
                        }
                    } else {
                        next4 = null;
                        break;
                    }
                }
                TemplateField templateField2 = next4;
                if (templateField2 != null && (templateFieldData3 = templateField2.fieldData) != null && (templateFieldProduct2 = templateFieldData3.fieldProduct) != null) {
                    str3 = templateFieldProduct2.productImage;
                } else {
                    str3 = null;
                }
                SmartImageView smartImageView2 = (SmartImageView) this.LJ.getValue();
                if (str3 != null && str3.length() != 0) {
                    if (this.LJI == null) {
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL3 = C1326790kdB.LIZLLL(str3);
                        c1331670kl3LIZLLL3.LJJ(smartImageView2);
                        C786410Ut5.h3(c1331670kl3LIZLLL3);
                    } else {
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL4 = C1326790kdB.LIZLLL(str3);
                        c1331670kl3LIZLLL4.LJJIJL(this.LIZ.getContext());
                        c1331670kl3LIZLLL4.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LIZLLL4.LJJII(new C1775630wJ7(smartImageView2, this, 8));
                    }
                } else {
                    this.LJIIJ = true;
                }
            } else {
                this.LJIIJ = true;
                View view = (View) this.LJ.getValue();
                if (view != null) {
                    C03DZ.LIZ(view);
                }
            }
        } else {
            C03DZ.LIZ((View) this.LIZJ.getValue());
            View view2 = (View) this.LJ.getValue();
            if (view2 != null) {
                C03DZ.LIZ(view2);
            }
        }
        Iterator<TemplateField> it4 = templateItem.T5().iterator();
        while (true) {
            if (it4.hasNext()) {
                next2 = it4.next();
                if (Intrinsics.LJFF(next2.fieldName, "customize_text")) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        TemplateField templateField3 = next2;
        if (templateField3 != null && (templateFieldData2 = templateField3.fieldData) != null && (templateFieldText = templateFieldData2.fieldText) != null) {
            ((TextView) this.LIZLLL.getValue()).setText(templateFieldText.content);
            C1723530ux5.LIZJ((TuxTextView) this.LIZLLL.getValue(), templateFieldText.lineLimit);
        }
        C1730290v7z.LIZ.getClass();
        String strLIZIZ = C1730290v7z.LIZIZ(templateItem, null);
        if (strLIZIZ != null) {
            ((TextView) this.LJFF.getValue()).setText(strLIZIZ);
            TuxTextView tuxTextView = (TuxTextView) this.LJFF.getValue();
            BillboardGiveawayInfo billboardGiveawayInfoVI2 = templateItem.vI();
            if (billboardGiveawayInfoVI2 != null && (numValueOf = Integer.valueOf(billboardGiveawayInfoVI2.activityStatus)) != null && numValueOf.intValue() == 2) {
                if (tuxTextView != null) {
                    tuxTextView.setTextColorRes(R.attr.vv);
                }
            } else if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.a1k);
            }
            C12ES.LJIILL(0, (View) this.LJFF.getValue());
        } else {
            C03DZ.LIZ((View) this.LJFF.getValue());
        }
        Iterator<TemplateField> it5 = templateItem.T5().iterator();
        while (true) {
            if (it5.hasNext()) {
                next3 = it5.next();
                if (Intrinsics.LJFF(next3.fieldName, "product_image_empty")) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        TemplateField templateField4 = next3;
        if (templateField4 != null && (templateFieldData = templateField4.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null) {
            str = templateFieldProduct.productImage;
        }
        SmartImageView smartImageView3 = (SmartImageView) this.LIZIZ.getValue();
        if (str != null && str.length() != 0) {
            if (this.LJI == null) {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL5 = C1326790kdB.LIZLLL(str);
                c1331670kl3LIZLLL5.LJJ(smartImageView3);
                C786410Ut5.h3(c1331670kl3LIZLLL5);
                return;
            }
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL6 = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL6.LJJIJL(this.LIZ.getContext());
            c1331670kl3LIZLLL6.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LIZLLL6.LJJII(new C1775630wJ7(smartImageView3, this, 7));
            return;
        }
        this.LJIIIZ = true;
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZIZ(AwS407S0200000_6 awS407S0200000_6) {
        this.LJI = awS407S0200000_6;
    }
}
