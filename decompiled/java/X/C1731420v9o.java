package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0v9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731420v9o implements InterfaceC1731410v9n {
    public final C428440Gr4 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1377));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1369));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1370));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1371));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1372));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1373));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1374));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1375));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1376));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1364));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1365));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1366));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1367));
    public Function0<Unit> LJIILJJIL;

    public C1731420v9o(C428440Gr4 c428440Gr4) {
        this.LIZ = c428440Gr4;
        c428440Gr4.setSubLayoutId(R.layout.buj);
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZ(TemplateItem templateItem) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        TemplateFieldData templateFieldData3;
        TemplateFieldText templateFieldText3;
        TemplateFieldData templateFieldData4;
        TemplateFieldText templateFieldText4;
        TemplateFieldData templateFieldData5;
        TemplateFieldText templateFieldText5;
        TemplateFieldData templateFieldData6;
        TemplateFieldText templateFieldText6;
        TemplateFieldData templateFieldData7;
        TemplateFieldText templateFieldText7;
        TemplateFieldData templateFieldData8;
        TemplateFieldText templateFieldText8;
        TemplateFieldData templateFieldData9;
        TemplateFieldText templateFieldText9;
        TemplateFieldData templateFieldData10;
        TemplateFieldText templateFieldText10;
        TemplateFieldData templateFieldData11;
        TemplateFieldText templateFieldText11;
        TemplateFieldData templateFieldData12;
        TemplateFieldText templateFieldText12;
        TemplateFieldData templateFieldData13;
        TemplateFieldText templateFieldText13;
        TemplateFieldData templateFieldData14;
        TemplateFieldText templateFieldText14;
        TemplateFieldData templateFieldData15;
        TemplateFieldText templateFieldText15;
        TemplateFieldData templateFieldData16;
        TemplateFieldText templateFieldText16;
        TemplateFieldData templateFieldData17;
        TemplateFieldText templateFieldText17;
        TemplateFieldData templateFieldData18;
        TemplateFieldText templateFieldText18;
        if (templateItem.getType() != 5) {
            return;
        }
        C1723530ux5.LIZLLL(this.LIZ, templateItem.gy(), new AwS570S0100000_26(this, 1368));
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, templateItem.T5());
        if (templateField != null && (templateFieldData18 = templateField.fieldData) != null && (templateFieldText18 = templateFieldData18.fieldText) != null) {
            ((TextView) this.LIZIZ.getValue()).setText(templateFieldText18.content);
        }
        TemplateField templateField2 = (TemplateField) C13LP.LJJJLZIJ(1, templateItem.T5());
        String str8 = null;
        if (templateField2 != null && (templateFieldData17 = templateField2.fieldData) != null && (templateFieldText17 = templateFieldData17.fieldText) != null) {
            str = templateFieldText17.content;
        } else {
            str = null;
        }
        ((TextView) this.LIZJ.getValue()).setText(str);
        TemplateField templateField3 = (TemplateField) C13LP.LJJJLZIJ(2, templateItem.T5());
        if (templateField3 != null && (templateFieldData16 = templateField3.fieldData) != null && (templateFieldText16 = templateFieldData16.fieldText) != null) {
            str2 = templateFieldText16.content;
        } else {
            str2 = null;
        }
        ((TextView) this.LIZLLL.getValue()).setText(str2);
        View view = (View) this.LJIIJ.getValue();
        if (!C123100dR.LIZ(str) && !C123100dR.LIZ(str2)) {
            C0H1U.LIZIZ(view);
        } else {
            C12ES.LJIILL(0, view);
        }
        TemplateField templateField4 = (TemplateField) C13LP.LJJJLZIJ(3, templateItem.T5());
        if (templateField4 != null && (templateFieldData15 = templateField4.fieldData) != null && (templateFieldText15 = templateFieldData15.fieldText) != null) {
            str3 = templateFieldText15.content;
        } else {
            str3 = null;
        }
        ((TextView) this.LJ.getValue()).setText(str3);
        TemplateField templateField5 = (TemplateField) C13LP.LJJJLZIJ(4, templateItem.T5());
        if (templateField5 != null && (templateFieldData14 = templateField5.fieldData) != null && (templateFieldText14 = templateFieldData14.fieldText) != null) {
            str4 = templateFieldText14.content;
        } else {
            str4 = null;
        }
        ((TextView) this.LJFF.getValue()).setText(str4);
        View view2 = (View) this.LJIIJJI.getValue();
        if (!C123100dR.LIZ(str3) && !C123100dR.LIZ(str4)) {
            C0H1U.LIZIZ(view2);
        } else {
            C12ES.LJIILL(0, view2);
        }
        TemplateField templateField6 = (TemplateField) C13LP.LJJJLZIJ(5, templateItem.T5());
        if (templateField6 != null && (templateFieldData13 = templateField6.fieldData) != null && (templateFieldText13 = templateFieldData13.fieldText) != null) {
            str5 = templateFieldText13.content;
        } else {
            str5 = null;
        }
        ((TextView) this.LJI.getValue()).setText(str5);
        TemplateField templateField7 = (TemplateField) C13LP.LJJJLZIJ(6, templateItem.T5());
        if (templateField7 != null && (templateFieldData12 = templateField7.fieldData) != null && (templateFieldText12 = templateFieldData12.fieldText) != null) {
            str6 = templateFieldText12.content;
        } else {
            str6 = null;
        }
        ((TextView) this.LJII.getValue()).setText(str6);
        View view3 = (View) this.LJIIL.getValue();
        if (!C123100dR.LIZ(str5) && !C123100dR.LIZ(str6)) {
            C0H1U.LIZIZ(view3);
        } else {
            C12ES.LJIILL(0, view3);
        }
        TemplateField templateField8 = (TemplateField) C13LP.LJJJLZIJ(7, templateItem.T5());
        if (templateField8 != null && (templateFieldData11 = templateField8.fieldData) != null && (templateFieldText11 = templateFieldData11.fieldText) != null) {
            str7 = templateFieldText11.content;
        } else {
            str7 = null;
        }
        ((TextView) this.LJIIIIZZ.getValue()).setText(str7);
        TemplateField templateField9 = (TemplateField) C13LP.LJJJLZIJ(8, templateItem.T5());
        if (templateField9 != null && (templateFieldData10 = templateField9.fieldData) != null && (templateFieldText10 = templateFieldData10.fieldText) != null) {
            str8 = templateFieldText10.content;
        }
        ((TextView) this.LJIIIZ.getValue()).setText(str8);
        View view4 = (View) this.LJIILIIL.getValue();
        if (!C123100dR.LIZ(str7) && !C123100dR.LIZ(str8)) {
            C0H1U.LIZIZ(view4);
        } else {
            C12ES.LJIILL(0, view4);
        }
        TemplateField templateField10 = (TemplateField) C13LP.LJJJLZIJ(0, templateItem.T5());
        if (templateField10 != null && (templateFieldData9 = templateField10.fieldData) != null && (templateFieldText9 = templateFieldData9.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LIZIZ.getValue(), templateFieldText9.lineLimit);
        }
        TemplateField templateField11 = (TemplateField) C13LP.LJJJLZIJ(1, templateItem.T5());
        if (templateField11 != null && (templateFieldData8 = templateField11.fieldData) != null && (templateFieldText8 = templateFieldData8.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LIZJ.getValue(), templateFieldText8.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LIZJ.getValue(), templateFieldText8.bgColor, 44);
        }
        TemplateField templateField12 = (TemplateField) C13LP.LJJJLZIJ(2, templateItem.T5());
        if (templateField12 != null && (templateFieldData7 = templateField12.fieldData) != null && (templateFieldText7 = templateFieldData7.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LIZLLL.getValue(), templateFieldText7.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LIZLLL.getValue(), templateFieldText7.bgColor, 84);
        }
        TemplateField templateField13 = (TemplateField) C13LP.LJJJLZIJ(3, templateItem.T5());
        if (templateField13 != null && (templateFieldData6 = templateField13.fieldData) != null && (templateFieldText6 = templateFieldData6.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LJ.getValue(), templateFieldText6.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LJ.getValue(), templateFieldText6.bgColor, 44);
        }
        TemplateField templateField14 = (TemplateField) C13LP.LJJJLZIJ(4, templateItem.T5());
        if (templateField14 != null && (templateFieldData5 = templateField14.fieldData) != null && (templateFieldText5 = templateFieldData5.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LJFF.getValue(), templateFieldText5.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LJFF.getValue(), templateFieldText5.bgColor, 84);
        }
        TemplateField templateField15 = (TemplateField) C13LP.LJJJLZIJ(5, templateItem.T5());
        if (templateField15 != null && (templateFieldData4 = templateField15.fieldData) != null && (templateFieldText4 = templateFieldData4.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LJI.getValue(), templateFieldText4.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LJI.getValue(), templateFieldText4.bgColor, 44);
        }
        TemplateField templateField16 = (TemplateField) C13LP.LJJJLZIJ(6, templateItem.T5());
        if (templateField16 != null && (templateFieldData3 = templateField16.fieldData) != null && (templateFieldText3 = templateFieldData3.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LJII.getValue(), templateFieldText3.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LJII.getValue(), templateFieldText3.bgColor, 84);
        }
        TemplateField templateField17 = (TemplateField) C13LP.LJJJLZIJ(7, templateItem.T5());
        if (templateField17 != null && (templateFieldData2 = templateField17.fieldData) != null && (templateFieldText2 = templateFieldData2.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LJIIIIZZ.getValue(), templateFieldText2.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LJIIIIZZ.getValue(), templateFieldText2.bgColor, 44);
        }
        TemplateField templateField18 = (TemplateField) C13LP.LJJJLZIJ(8, templateItem.T5());
        if (templateField18 != null && (templateFieldData = templateField18.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            C1723530ux5.LIZJ((TuxTextView) this.LJIIIZ.getValue(), templateFieldText.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LJIIIZ.getValue(), templateFieldText.bgColor, 84);
        }
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZIZ(AwS407S0200000_6 awS407S0200000_6) {
        this.LJIILJJIL = awS407S0200000_6;
    }
}
