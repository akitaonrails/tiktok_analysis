package X;

import android.widget.AutoCompleteTextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.19TP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19TP implements C19TF {
    public final /* synthetic */ C19TJ LIZ;

    public C19TP(C19TJ c19tj) {
        this.LIZ = c19tj;
    }

    @Override // X.C19TF
    public final void LIZ(C21543419Su c21543419Su, int i) {
        final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) c21543419Su.getEditText();
        if (autoCompleteTextView != null && i == 3) {
            HandlerHook.viewPost(autoCompleteTextView, new Runnable() { // from class: X.19TQ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DropdownMenuEndIconDelegate@5319.<field>$5$onEndIconChanged$1");
                    try {
                        autoCompleteTextView.removeTextChangedListener(this.LLILLJJLI.LIZ.LIZLLL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DropdownMenuEndIconDelegate@5319.<field>$5$onEndIconChanged$1");
                }
            });
            if (autoCompleteTextView.getOnFocusChangeListener() == this.LIZ.LJ) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }
}
