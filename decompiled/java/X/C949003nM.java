package X;

import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03nM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C949003nM {
    public static void LIZ(TuxTextView tuxTextView, ECRichText eCRichText, String str) {
        CharSequence charSequenceLJLILLLLZI;
        SpannableStringBuilder spannableStringBuilderLIZ = C03C8.LIZ(tuxTextView, eCRichText, str, null, C431490Gvz.LIZ, false, 20);
        if (spannableStringBuilderLIZ != null) {
            charSequenceLJLILLLLZI = a0.LJLILLLLZI(spannableStringBuilderLIZ);
        } else {
            charSequenceLJLILLLLZI = null;
        }
        tuxTextView.setText(charSequenceLJLILLLLZI);
    }
}
