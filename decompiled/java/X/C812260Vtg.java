package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0Vtg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812260Vtg {
    public final Context LIZ;
    public int LIZIZ;
    public int LIZJ;

    public C812260Vtg(Context context) {
        this.LIZ = context;
    }

    public final synchronized int LIZ() {
        int i = this.LIZJ;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.LIZ.getPackageManager();
        if (C812450Vtz.LIZ(this.LIZ).LIZ.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i2 = 1;
        if (!C811660Vsi.LIZ()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.LIZJ = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.LIZJ = 2;
            return 2;
        }
        if (C811660Vsi.LIZ()) {
            this.LIZJ = 2;
            i2 = 2;
        } else {
            this.LIZJ = 1;
        }
        return i2;
    }
}
