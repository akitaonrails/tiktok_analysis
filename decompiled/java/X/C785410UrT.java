package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.0UrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785410UrT {
    public static final void LIZ(Dialog dialog) {
        if (C07GT.LIZ() && dialog != null) {
            C214905198l.LIZLLL(new C743740TFk(dialog));
        }
    }

    public static final void LIZIZ(Dialog dialog) {
        Window window;
        View decorView;
        if (C07GT.LIZ() && dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            C214905198l.LIZJ(decorView, new C743740TFk(dialog));
        }
    }
}
