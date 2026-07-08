package X;

import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0FRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390240FRu {
    public static final int LIZ(EditText editText, int i) {
        if (editText == null) {
            return 0;
        }
        try {
            if (editText.getLayout() == null) {
                return new StaticLayout(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUKFwR0riBatCDgVPjNGrE6oYw=", null)), editText.getPaint(), i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
            }
            return editText.getLayout().getLineCount();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static boolean LIZIZ(EditText editText, int i) {
        Editable editableLLJILLL;
        if (editText == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUKFwR0riBatCDgVPjNGrE6oYw=", null))) == null || editableLLJILLL.length() == 0) {
            return false;
        }
        if (LIZ(editText, editText.getMaxWidth()) <= i && C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUKFwR0riBatCDgVPjNGrE6oYw=", null)).length() <= 50) {
            return false;
        }
        String string = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUKFwR0riBatCDgVPjNGrE6oYw=", null)).toString();
        int i2 = i * 40;
        if (string.length() >= i2) {
            string = string.substring(0, i2);
        }
        if (string.length() > 50) {
            string = string.substring(0, 50);
        }
        String strSubstring = string.substring(0, string.length() - 1);
        for (int length = strSubstring.length() - 1; length >= 0 && Character.isHighSurrogate(strSubstring.charAt(length)); length--) {
            strSubstring = strSubstring.substring(0, length);
        }
        editText.setText(strSubstring);
        return true;
    }
}
