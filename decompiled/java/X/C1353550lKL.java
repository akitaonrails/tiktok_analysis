package X;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;

/* JADX INFO: renamed from: X.0lKL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353550lKL {
    public static final void LIZ(int i, int i2, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        CharacterStyle[] characterStyleArr;
        SpannableStringBuilder spannableStringBuilder2;
        InterfaceC1353590lKP[] interfaceC1353590lKPArr;
        if (i2 > 0) {
            CharSequence charSequenceSubSequence = null;
            if (charSequence != null) {
                charSequenceSubSequence = charSequence.subSequence(i, i2 + i);
            }
            boolean z = charSequenceSubSequence instanceof SpannableStringBuilder;
            if (z) {
                SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) charSequenceSubSequence;
                if ((spannableStringBuilder3 == null || (interfaceC1353590lKPArr = (InterfaceC1353590lKP[]) spannableStringBuilder3.getSpans(0, ((SpannableStringBuilder) charSequenceSubSequence).length(), InterfaceC1353590lKP.class)) == null || interfaceC1353590lKPArr.length <= 0) && z && (spannableStringBuilder = (SpannableStringBuilder) charSequenceSubSequence) != null && (characterStyleArr = (CharacterStyle[]) spannableStringBuilder.getSpans(0, ((SpannableStringBuilder) charSequenceSubSequence).length(), CharacterStyle.class)) != null) {
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MentionSpan) && !(characterStyle instanceof StyleSpan) && !(characterStyle instanceof CommentEmojiSpan) && (charSequence instanceof SpannableStringBuilder) && (spannableStringBuilder2 = (SpannableStringBuilder) charSequence) != null) {
                            spannableStringBuilder2.removeSpan(characterStyle);
                        }
                    }
                }
            }
        }
    }
}
