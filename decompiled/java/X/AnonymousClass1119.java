package X;

import android.text.Spanned;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1119, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AnonymousClass1119 {
    public static C448880Hiw[] LIZ(TextView textView) {
        int length;
        CharSequence text = textView.getText();
        if (text != null && (length = text.length()) != 0 && (text instanceof Spanned)) {
            return (C448880Hiw[]) ((Spanned) text).getSpans(0, length, C448880Hiw.class);
        }
        return null;
    }

    public static void LIZIZ(TextView textView) {
        if (textView.getTag(R.id.o0s) == null) {
            return;
        }
        textView.setTag(R.id.o0s, null);
        C448880Hiw[] c448880HiwArrLIZ = LIZ(textView);
        if (c448880HiwArrLIZ != null && c448880HiwArrLIZ.length > 0) {
            for (C448880Hiw c448880Hiw : c448880HiwArrLIZ) {
                c448880Hiw.LLILLJJLI.LIZJ(null);
            }
        }
    }
}
