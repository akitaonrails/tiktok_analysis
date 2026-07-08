package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.ui.style.CommonColor;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.ui.style.TextStyle;

/* JADX INFO: renamed from: X.187E, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187E {
    public static final void LIZ(TextStyle textStyle, TuxTextView tuxTextView) {
        Integer color;
        CommonColor commonColor = textStyle.color;
        if (commonColor != null && (color = commonColor.parseColor(tuxTextView.getContext(), true)) != null) {
            tuxTextView.setTextColor(color.intValue());
        }
        Integer num = textStyle.font;
        if (num != null) {
            int iIntValue = num.intValue();
            InterfaceC1003930cER.LJIILIIL.getClass();
            tuxTextView.setTuxFont(C1003920cEQ.LIZ(iIntValue));
        }
    }
}
