package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795430VIf {
    public final InterfaceC795440VIg LIZ;
    public final boolean LIZIZ;

    public C795430VIf(Context context, String str, InterfaceC795440VIg interfaceC795440VIg) {
        ApplicationInfo applicationInfoV3;
        Bundle bundle;
        context = Build.VERSION.SDK_INT >= 24 ? C795420VIe.LIZ(context) : context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("com.google.firebase.common.prefs:");
        sbLIZ.append(str);
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = interfaceC795440VIg;
        boolean z = true;
        if (sharedPreferencesLIZJ.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferencesLIZJ.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfoV3 = C786410Ut5.V3(packageManager, context.getPackageName(), 128)) != null && (bundle = applicationInfoV3.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z = applicationInfoV3.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZIZ = z;
    }
}
