package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03Bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C803303Bv {
    public static final void LIZ(LinearLayout linearLayout, List<ECRichText> list, boolean z, int i, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq, boolean z2) {
        int i2;
        if (linearLayout == null) {
            return;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        if ((!z2 || z) && list != null) {
            for (ECRichText eCRichText : list) {
                TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                if (z2) {
                    i2 = 20;
                } else {
                    i2 = 4;
                }
                C426750GoL.LJIIL(tuxTextView, 0, Integer.valueOf(C0H9H.LIZIZ(i2)), 0, 0, 16);
                tuxTextView.setMaxLines(2);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setTextAlignment(5);
                C03C9.LIZIZ(tuxTextView, eCRichText, z, i, "RichAddressCardView", interfaceC1631620sYq, true);
                linearLayout.addView(tuxTextView);
            }
        }
    }
}
