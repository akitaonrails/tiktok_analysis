package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowInsets;

/* JADX INFO: renamed from: X.0SK0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SK0 {
    public static int LIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 35) {
            C0IKF.LIZ.getClass();
            C19738412Ko c19738412KoLIZIZ = C465320IMo.LIZ().LIZIZ(context);
            Rect rectLIZ = c19738412KoLIZIZ.LIZ();
            c19738412KoLIZIZ.LIZIZ.LIZIZ(WindowInsets.Type.systemBars());
            return rectLIZ.width();
        }
        return C418440Gaw.LIZLLL(context);
    }
}
