package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: renamed from: X.037l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7919037l {
    public static final void LIZ(TuxTextView tuxTextView, QuantityNoticeInfo quantityNoticeInfo, String str) {
        if (quantityNoticeInfo == null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        ECRichText eCRichText = quantityNoticeInfo.desc;
        if (eCRichText != null) {
            C03C8.LIZJ(tuxTextView, eCRichText, str, null);
        } else if (C123100dR.LIZ(quantityNoticeInfo.descText)) {
            tuxTextView.setText(quantityNoticeInfo.descText);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
    }
}
