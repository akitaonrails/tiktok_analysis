package X;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.19TV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19TV implements C19TF {
    public final /* synthetic */ C19TK LIZ;

    public C19TV(C19TK c19tk) {
        this.LIZ = c19tk;
    }

    @Override // X.C19TF
    public final void LIZ(C21543419Su c21543419Su, int i) {
        final EditText editText = c21543419Su.getEditText();
        if (editText != null && i == 1) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            HandlerHook.viewPost(editText, new Runnable() { // from class: X.19TU
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PasswordToggleEndIconDelegate@37ae.<field>$3$onEndIconChanged$1");
                    try {
                        editText.removeTextChangedListener(this.LLILLJJLI.LIZ.LIZLLL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PasswordToggleEndIconDelegate@37ae.<field>$3$onEndIconChanged$1");
                }
            });
        }
    }
}
