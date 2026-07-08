package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03C9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03C9 {
    public static final SpannableStringBuilder LIZ(View view, SpannableStringBuilder spannableStringBuilder, boolean z, int i) {
        if (!z && i > 0) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, view.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                if (spannableStringBuilder != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, spannableStringBuilder.length(), 33);
                }
            } else {
                return null;
            }
        }
        return spannableStringBuilder;
    }

    public static final void LIZIZ(TextView textView, ECRichText eCRichText, boolean z, int i, String str, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq, boolean z2) {
        if (textView == null) {
            return;
        }
        textView.setText(LIZ(textView, C03C8.LIZ(textView, eCRichText, str, interfaceC1631620sYq, null, z2, 8), z, i));
    }
}
