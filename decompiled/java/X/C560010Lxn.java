package X;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;

/* JADX INFO: renamed from: X.0Lxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560010Lxn implements InterfaceC372760EjS {
    public static final C560010Lxn LIZ = new C560010Lxn();
    public static Toast LIZIZ;

    @Override // X.InterfaceC372760EjS
    public final void LIZ(Context context, String str) {
        if (Build.VERSION.SDK_INT < 28) {
            if (LIZIZ == null) {
                LIZIZ = Toast.makeText(context, "", 0);
            }
            Toast toast = LIZIZ;
            if (toast != null) {
                toast.setText(str);
            }
        } else {
            Toast toast2 = LIZIZ;
            if (toast2 != null) {
                toast2.cancel();
                LIZIZ = null;
            }
            Toast toastMakeText = Toast.makeText(context, "", 0);
            LIZIZ = toastMakeText;
            if (toastMakeText != null) {
                toastMakeText.setText(str);
            }
        }
        Toast toast3 = LIZIZ;
        if (toast3 != null) {
            C786410Ut5.re(toast3);
        }
    }
}
