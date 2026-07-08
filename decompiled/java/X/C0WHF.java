package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: X.0WHF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WHF implements C0WHT {
    public static final C0WHF LIZ = new C0WHF();

    @Override // X.C0WHT
    public final Intent LIZ(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    @Override // X.C0WHT
    public final C0WGR LIZIZ(Context context) {
        return C0WGR.UNKNOWN;
    }
}
