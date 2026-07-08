package X;

import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.19TT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19TT implements C19TF {
    public final /* synthetic */ C19TG LIZ;

    public C19TT(C19TG c19tg) {
        this.LIZ = c19tg;
    }

    @Override // X.C19TF
    public final void LIZ(C21543419Su c21543419Su, int i) {
        final EditText editText = c21543419Su.getEditText();
        if (editText != null && i == 2) {
            HandlerHook.viewPost(editText, new Runnable() { // from class: X.19TS
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ClearTextEndIconDelegate@e4eb.<field>$4$onEndIconChanged$1");
                    try {
                        editText.removeTextChangedListener(this.LLILLJJLI.LIZ.LIZLLL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ClearTextEndIconDelegate@e4eb.<field>$4$onEndIconChanged$1");
                }
            });
            if (editText.getOnFocusChangeListener() == this.LIZ.LJ) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }
}
