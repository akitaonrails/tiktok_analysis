package X;

import android.text.SpannableString;
import android.text.style.ClickableSpan;
import com.bytedance.ies.im.core.api.model.RichTextInfo;

/* JADX INFO: renamed from: X.0IBY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IBY {
    public static void LIZ(CharSequence charSequence, SpannableString spannableString, RichTextInfo richTextInfo, ClickableSpan clickableSpan, boolean z) {
        int iMin = Math.min(richTextInfo.getStartPosition() + richTextInfo.length, ((String) charSequence).length());
        C786410Ut5.p2(spannableString, clickableSpan, richTextInfo.getStartPosition(), iMin, 33);
        if (z) {
            C786410Ut5.p2(spannableString, new C444920HcY(102, false), richTextInfo.getStartPosition(), iMin, 33);
        }
    }
}
