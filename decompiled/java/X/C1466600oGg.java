package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0oGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466600oGg implements TextView.OnEditorActionListener {
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

    public C1466600oGg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C1466600oGg c1466600oGg, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            ((C1427290nFH) c1466600oGg.l0).LLLLIL().LIZJ.invoke();
            return true;
        }
        return false;
    }

    public static final boolean onEditorAction$1(C1466600oGg c1466600oGg, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            ((C1427280nFG) c1466600oGg.l0).LLLLLJIL();
            return true;
        }
        return false;
    }
}
