package X;

import android.view.inputmethod.ExtractedText;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0uEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695900uEW {
    public static final ExtractedText LIZ(C1686970u07 c1686970u07) {
        ExtractedText extractedText = new ExtractedText();
        String str = c1686970u07.LIZ.LLILLJJLI;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = C1692280u8g.LJI(c1686970u07.LIZIZ);
        extractedText.selectionEnd = C1692280u8g.LJFF(c1686970u07.LIZIZ);
        extractedText.flags = !a0.LJJIJ(c1686970u07.LIZ.LLILLJJLI, '\n') ? 1 : 0;
        return extractedText;
    }
}
