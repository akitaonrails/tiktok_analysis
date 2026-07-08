package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZIB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIB implements InputFilter {
    public final C0ZIE LL;
    public final int LLILLJJLI;
    public final EditText LLILLL;
    public boolean LLILZ;

    public C0ZIB(C0ZIA c0zia, int i, EditText editText) {
        this.LL = c0zia;
        this.LLILLJJLI = i;
        this.LLILLL = editText;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i3 == i4 && Intrinsics.LJFF(charSequence, "")) {
            return null;
        }
        if (i3 == i4 && this.LLILZ) {
            this.LLILZ = false;
            return null;
        }
        if (i3 < this.LLILLJJLI) {
            C0ZIE c0zie = this.LL;
            if (c0zie != null) {
                ((C0ZIA) c0zie).LIZ.LLLLIILLL = true;
            }
            this.LLILZ = true;
            final int selectionStart = this.LLILLL.getSelectionStart();
            final int selectionEnd = this.LLILLL.getSelectionEnd();
            final int length = this.LLILLL.length();
            this.LLILLL.setText(spanned);
            HandlerHook.viewPost(this.LLILLL, new Runnable() { // from class: X.0ZIC
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ChainFilter@f9bd.filter$1");
                    try {
                        if (length == this.LL.LLILLL.length()) {
                            this.LL.LLILLL.setSelection(selectionStart, selectionEnd);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ChainFilter@f9bd.filter$1");
                }
            });
            return spanned.subSequence(i3, i4);
        }
        return charSequence;
    }
}
