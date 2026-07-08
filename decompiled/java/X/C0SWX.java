package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SWX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SWX {
    public static final C0SWX LIZ = new C0SWX();

    public static final String LIZ(Comment comment) {
        int i;
        boolean z;
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        String strLIZJ = C1342220l24.LIZJ(comment, text, comment.getTextExtra(), false);
        if (TextUtils.isEmpty(strLIZJ)) {
            return "";
        }
        boolean[] zArr = new boolean[strLIZJ.length()];
        if (comment.getTextExtra() != null) {
            for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
                if (textExtraStruct.getType() != 6) {
                    int start = textExtraStruct.getStart();
                    if (start <= 0) {
                        start = 0;
                    }
                    int length = strLIZJ.length();
                    int end = textExtraStruct.getEnd();
                    if (length > end) {
                        length = end;
                    }
                    while (start < length) {
                        zArr[start] = true;
                        start++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int length2 = strLIZJ.length();
        for (int i2 = 0; i2 < length2; i2++) {
            if (!zArr[i2]) {
                sb.append(strLIZJ.charAt(i2));
            }
        }
        String string = sb.toString();
        int length3 = string.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length3) {
            if (!z2) {
                i = i3;
            } else {
                i = length3;
            }
            if (Intrinsics.LJI(string.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i3++;
                }
            } else {
                if (!z) {
                    break;
                }
                length3--;
            }
        }
        return string.subSequence(i3, length3 + 1).toString();
    }
}
