package X;

import android.app.Dialog;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aU5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC936750aU5 implements InterfaceC943940afg {
    public Dialog LIZ;

    @Override // X.InterfaceC943940afg
    public String tag() {
        return "LiveDialog";
    }

    @Override // X.InterfaceC943940afg
    public final void dismiss() {
        Dialog dialog = this.LIZ;
        if (dialog != null) {
            dialog.dismiss();
            C785410UrT.LIZ(dialog);
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC943940afg
    public final boolean isVisible() {
        Dialog dialog = this.LIZ;
        return dialog != null && dialog.isShowing();
    }

    @Override // X.InterfaceC943940afg
    public final void LIZ(AwS559S0100000_15 awS559S0100000_15) {
        Dialog dialog = this.LIZ;
        if (dialog != null) {
            dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(awS559S0100000_15, 31));
        }
    }
}
