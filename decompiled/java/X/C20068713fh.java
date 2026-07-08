package X;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: X.13fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20068713fh implements InterfaceC20058813e6 {
    public final View LIZ;
    public final C07P1 LIZIZ;
    public final AutofillManager LIZJ;
    public final AutofillId LIZLLL;

    public C20068713fh(View view, C07P1 c07p1) {
        AutofillId autofillId;
        this.LIZ = view;
        this.LIZIZ = c07p1;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.LIZJ = autofillManager;
            view.setImportantForAutofill(1);
            C20078613hI c20078613hILIZ = C20077413h6.LIZ(view);
            if (c20078613hILIZ != null && (autofillId = (AutofillId) c20078613hILIZ.LIZ) != null) {
                this.LIZLLL = autofillId;
                return;
            } else {
                C1696250uF5.LIZJ("Required value was null.");
                throw new C2197108jB();
            }
        }
        "Autofill service could not be located.".toString();
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
