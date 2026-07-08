package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;

/* JADX INFO: renamed from: X.16H7, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H7 implements TextView.OnEditorActionListener {
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

    public C16H7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C16H7 c16h7, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            EditShareSelectFragment editShareSelectFragment = (EditShareSelectFragment) c16h7.l0;
            editShareSelectFragment.UR(editShareSelectFragment.getView());
            return false;
        }
        return false;
    }

    public static final boolean onEditorAction$1(C16H7 c16h7, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            C20097413kK.LIZ((C1748440vbG) c16h7.l0);
            return true;
        }
        return false;
    }
}
