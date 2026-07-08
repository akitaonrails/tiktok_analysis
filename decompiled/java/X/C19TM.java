package X;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.19TM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19TM extends C0DL6 {
    public final /* synthetic */ C19TJ LL;

    public C19TM(C19TJ c19tj) {
        this.LL = c19tj;
    }

    @Override // X.C0DL6, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.LL.LIZ.getEditText();
        if (editText instanceof AutoCompleteTextView) {
            final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (this.LL.LJIILIIL.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !this.LL.LIZJ.hasFocus()) {
                autoCompleteTextView.dismissDropDown();
            }
            HandlerHook.viewPost(autoCompleteTextView, new Runnable() { // from class: X.19TR
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DropdownMenuEndIconDelegate@5319.<field>$1$afterTextChanged$1");
                    try {
                        boolean zIsPopupShowing = autoCompleteTextView.isPopupShowing();
                        this.LLILLJJLI.LL.LJ(zIsPopupShowing);
                        this.LLILLJJLI.LL.LJIIIIZZ = zIsPopupShowing;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DropdownMenuEndIconDelegate@5319.<field>$1$afterTextChanged$1");
                }
            });
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
}
