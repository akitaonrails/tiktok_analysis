package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.lynx.xelement.input.LynxUIInput;
import com.lynx.xelement.input.LynxUITextArea;

/* JADX INFO: renamed from: X.19LS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LS implements TextView.OnEditorActionListener {
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

    public C19LS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C19LS c19ls, TextView textView, int i, KeyEvent keyEvent) {
        LynxUIInput lynxUIInput = (LynxUIInput) c19ls.l0;
        if (i != 0 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6) {
            return false;
        }
        lynxUIInput.LJJJ();
        if (i == 5) {
            return false;
        }
        if (!lynxUIInput.LLJJIJI) {
            lynxUIInput.blur(null, null);
        }
        if (lynxUIInput.LLJJIJI) {
            return false;
        }
        return true;
    }

    public static final boolean onEditorAction$1(C19LS c19ls, TextView textView, int i, KeyEvent keyEvent) {
        LynxUITextArea lynxUITextArea = (LynxUITextArea) c19ls.l0;
        lynxUITextArea.LJJJ();
        if (lynxUITextArea.LJJJIL()) {
            lynxUITextArea.blur(null, null);
        }
        return lynxUITextArea.LLJJIJI;
    }
}
