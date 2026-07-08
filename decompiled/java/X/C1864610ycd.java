package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchResultFragment;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;

/* JADX INFO: renamed from: X.0ycd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864610ycd implements TextView.OnEditorActionListener {
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

    public C1864610ycd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C1864610ycd c1864610ycd, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 4) {
            ((InputInnerAssem) c1864610ycd.l0).zp();
            return true;
        }
        return false;
    }

    public static final boolean onEditorAction$1(C1864610ycd c1864610ycd, TextView textView, int i, KeyEvent keyEvent) {
        Editable editableLLJILLL;
        if (i == 3) {
            EditText editText = ((LiveSearchResultFragment) c1864610ycd.l0).LL;
            String string = null;
            if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7S+2DnkbzffxjyqvOq01IYdy3U3sot4Nq0BUPT9XZNE/sSZ7pF27HePL3ouwTvs=", null))) != null) {
                string = editableLLJILLL.toString();
            }
            ((LiveSearchResultFragment) c1864610ycd.l0).VR(string);
            ((LiveSearchResultFragment) c1864610ycd.l0).OR(false);
            return true;
        }
        return true;
    }
}
