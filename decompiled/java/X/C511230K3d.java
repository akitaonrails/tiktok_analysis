package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0K3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511230K3d {
    public static final void LIZ(Context context, Throwable th, int i) {
        if (th == null) {
            C0JCX.LIZIZ(i, context);
            return;
        }
        String strLIZ = C09OK.LIZ(null, th).LIZ();
        if (strLIZ != null && strLIZ.length() != 0) {
            C0JCX.LIZJ(context, strLIZ);
        } else {
            C0JCX.LIZIZ(i, context);
        }
    }
}
