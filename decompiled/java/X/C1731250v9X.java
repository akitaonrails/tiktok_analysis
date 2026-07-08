package X;

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

/* JADX INFO: renamed from: X.0v9X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731250v9X implements InterfaceC1731410v9n {
    public final C428440Gr4 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1353));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1350));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1351));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1352));
    public Function0<Unit> LJFF;

    public C1731250v9X(C428440Gr4 c428440Gr4) {
        this.LIZ = c428440Gr4;
        c428440Gr4.setSubLayoutId(R.layout.buf);
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZ(TemplateItem templateItem) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        TemplateFieldData templateFieldData3;
        TemplateFieldText templateFieldText3;
        TemplateFieldData templateFieldData4;
        TemplateFieldText templateFieldText4;
        if (templateItem.getType() != 1) {
            return;
        }
        C1723530ux5.LIZLLL(this.LIZ, templateItem.gy(), new AwS570S0100000_26(this, 1349));
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, templateItem.T5());
        if (templateField != null && (templateFieldData4 = templateField.fieldData) != null && (templateFieldText4 = templateFieldData4.fieldText) != null) {
            ((TextView) this.LIZIZ.getValue()).setText(templateFieldText4.content);
            C1723530ux5.LIZJ((TuxTextView) this.LIZIZ.getValue(), templateFieldText4.lineLimit);
        }
        TemplateField templateField2 = (TemplateField) C13LP.LJJJLZIJ(1, templateItem.T5());
        if (templateField2 != null && (templateFieldData3 = templateField2.fieldData) != null && (templateFieldText3 = templateFieldData3.fieldText) != null) {
            ((TextView) this.LIZJ.getValue()).setText(templateFieldText3.content);
            C1723530ux5.LIZJ((TuxTextView) this.LIZJ.getValue(), templateFieldText3.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LIZJ.getValue(), templateFieldText3.bgColor, 124);
        }
        TemplateField templateField3 = (TemplateField) C13LP.LJJJLZIJ(2, templateItem.T5());
        if (templateField3 != null && (templateFieldData2 = templateField3.fieldData) != null && (templateFieldText2 = templateFieldData2.fieldText) != null) {
            ((TextView) this.LIZLLL.getValue()).setText(templateFieldText2.content);
            C1723530ux5.LIZJ((TuxTextView) this.LIZLLL.getValue(), templateFieldText2.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LIZLLL.getValue(), templateFieldText2.bgColor, 124);
        }
        TemplateField templateField4 = (TemplateField) C13LP.LJJJLZIJ(3, templateItem.T5());
        if (templateField4 != null && (templateFieldData = templateField4.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) this.LJ.getValue()).setText(templateFieldText.content);
            C1723530ux5.LIZJ((TuxTextView) this.LJ.getValue(), templateFieldText.lineLimit);
            C1723530ux5.LJ((TuxTextView) this.LJ.getValue(), templateFieldText.bgColor, 124);
        }
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZIZ(AwS407S0200000_6 awS407S0200000_6) {
        this.LJFF = awS407S0200000_6;
    }
}
