package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0Vta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812200Vta {
    public final Context LIZ;
    public String LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;

    public final synchronized String LIZ() {
        if (this.LIZIZ == null) {
            LJ();
        }
        return this.LIZIZ;
    }

    public final synchronized String LIZIZ() {
        if (this.LIZJ == null) {
            LJ();
        }
        return this.LIZJ;
    }

    public final boolean LIZLLL() {
        synchronized (this) {
            if (this.LJ != 0) {
                return true;
            }
            PackageManager packageManager = this.LIZ.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return false;
            }
            if (!C811660Vsi.LIZ()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                    this.LJ = 1;
                    return true;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                this.LJ = 2;
                return true;
            }
            if (C811660Vsi.LIZ()) {
                this.LJ = 2;
            } else {
                this.LJ = 1;
            }
            return this.LJ != 0;
        }
    }

    public final synchronized void LJ() {
        try {
            PackageInfo packageInfoY3 = C786410Ut5.Y3(this.LIZ.getPackageManager(), this.LIZ.getPackageName(), 0);
            if (packageInfoY3 != null) {
                this.LIZIZ = Integer.toString(packageInfoY3.versionCode);
                this.LIZJ = packageInfoY3.versionName;
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C812200Vta(Context context) {
        this.LIZ = context;
    }

    public static String LIZJ(C818880WAk c818880WAk) {
        c818880WAk.LIZ();
        String str = c818880WAk.LIZJ.LJ;
        if (str != null) {
            return str;
        }
        c818880WAk.LIZ();
        String str2 = c818880WAk.LIZJ.LIZIZ;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }
}
