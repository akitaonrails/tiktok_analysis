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

/* JADX INFO: renamed from: X.0v9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731200v9S implements InterfaceC1731410v9n {
    public final C428440Gr4 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1363));
    public Function0<Unit> LIZJ;

    public C1731200v9S(C428440Gr4 c428440Gr4) {
        this.LIZ = c428440Gr4;
        c428440Gr4.setSubLayoutId(R.layout.bui);
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZ(TemplateItem templateItem) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        if (templateItem.getType() != 2) {
            return;
        }
        C1723530ux5.LIZLLL(this.LIZ, templateItem.gy(), new AwS570S0100000_26(this, 1362));
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, templateItem.T5());
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) this.LIZIZ.getValue()).setText(templateFieldText.content);
            C1723530ux5.LIZJ((TuxTextView) this.LIZIZ.getValue(), templateFieldText.lineLimit);
        }
    }

    @Override // X.InterfaceC1731410v9n
    public final void LIZIZ(AwS407S0200000_6 awS407S0200000_6) {
        this.LIZJ = awS407S0200000_6;
    }
}
