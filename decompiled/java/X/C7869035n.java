package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.IAiTryOnAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.035n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7869035n {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ECBaseFragment eCBaseFragment, Context context, PropButton propButton, String str, IAiTryOnAbility iAiTryOnAbility, InterfaceC7870035o interfaceC7870035o) {
        SizeGuide sizeGuide = null;
        if (str == null || !(!a0.LJJJIL(str))) {
            str = propButton.schema;
        }
        Integer num = propButton.buttonAction;
        if (num != null && num.intValue() == 0) {
            Integer num2 = propButton.buttonType;
            if (num2 != null) {
                if (num2.intValue() == 1) {
                    if (interfaceC7870035o != null) {
                        PropButtonExtraInfo propButtonExtraInfo = propButton.extraInfo;
                        if (propButtonExtraInfo != null) {
                            sizeGuide = propButtonExtraInfo.sizeGuide;
                        }
                        interfaceC7870035o.gb(eCBaseFragment, sizeGuide, str);
                        return;
                    }
                    return;
                }
                if (num2.intValue() == 2) {
                    if (iAiTryOnAbility == null) {
                        return;
                    }
                    iAiTryOnAbility.nC(eCBaseFragment, context, str, null);
                    return;
                }
            }
            C1019103yf.LIZ(EnumC1014603xw.ERR_SKU_PROP_SELECTION_BUTTON_UNSUPPORTED_TYPE, null, null);
        }
    }
}
