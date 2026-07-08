package X;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: X.0uD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695010uD5 {
    public static final String[] LIZ = new String[0];

    public static void LIZ(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void LIZIZ(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        int i2;
        CharSequence charSequenceSubSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        charSequence.getClass();
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        if (i3 > i4) {
            i = i4;
        } else {
            i = i3;
        }
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i >= 0 && i3 <= length) {
            int i5 = editorInfo.inputType & 4095;
            if (i5 != 129 && i5 != 225 && i5 != 18) {
                if (length <= 2048) {
                    LIZJ(editorInfo, charSequence, i, i3);
                    return;
                }
                int i6 = i3 - i;
                if (i6 > 1024) {
                    i2 = 0;
                } else {
                    i2 = i6;
                }
                int i7 = 2048 - i2;
                int iMin = Math.min(charSequence.length() - i3, i7 - Math.min(i, (int) (((double) i7) * 0.8d)));
                int iMin2 = Math.min(i, i7 - iMin);
                int i8 = i - iMin2;
                if (Character.isLowSurrogate(charSequence.charAt(i8))) {
                    i8++;
                    iMin2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i3 + iMin) - 1))) {
                    iMin--;
                }
                int i9 = iMin2 + i2 + iMin;
                if (i2 != i6) {
                    charSequenceSubSequence = TextUtils.concat(charSequence.subSequence(i8, i8 + iMin2), charSequence.subSequence(i3, iMin + i3));
                } else {
                    charSequenceSubSequence = charSequence.subSequence(i8, i9 + i8);
                }
                LIZJ(editorInfo, charSequenceSubSequence, iMin2, i2 + iMin2);
                return;
            }
            LIZJ(editorInfo, null, 0, 0);
            return;
        }
        LIZJ(editorInfo, null, 0, 0);
    }

    public static void LIZJ(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        C786410Ut5.LJJIJIIJI(editorInfo.extras, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
