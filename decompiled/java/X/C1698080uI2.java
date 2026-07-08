package X;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.tools.utils.KeyboardUtils;

/* JADX INFO: renamed from: X.0uI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698080uI2 implements TextView.OnEditorActionListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$t) {
            case 0:
                return onEditorAction$0(this, textView, i, keyEvent);
            case 1:
                return onEditorAction$1(this, textView, i, keyEvent);
            default:
                return false;
        }
    }

    public C1698080uI2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C1698080uI2 c1698080uI2, TextView textView, int i, KeyEvent keyEvent) throws Throwable {
        String string;
        if (i != 3) {
            return false;
        }
        C1643710ssL c1643710ssL = (C1643710ssL) c1698080uI2.l0;
        EditText editText = c1643710ssL.LJIIJ;
        if (editText == null) {
            editText = null;
        }
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOOmZZDdyDu6EgziCf02B+m77NtiqzhzSPR2Cb4FNFBZ6xYurpdjFlgTpD1TatgegYN+T45MEuQA7WdsgX9FMg==", null));
        if (editableLLJILLL != null && (string = editableLLJILLL.toString()) != null && string.length() != 0) {
            c1643710ssL.LIZJ().Ep(string);
        } else {
            C1638280sja c1638280sja = C21366318jV.LIZLLL;
            Context context = c1643710ssL.LIZIZ.getContext();
            c1638280sja.getClass();
            C1638280sja.LIZ(2131857691, 0, context).LIZ();
        }
        return true;
    }

    public static final boolean onEditorAction$1(C1698080uI2 c1698080uI2, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            KeyboardUtils.LIZ(((C1749260vca) c1698080uI2.l0).getContext(), ((C1749260vca) c1698080uI2.l0).getEditTextView());
            return true;
        }
        return false;
    }
}
