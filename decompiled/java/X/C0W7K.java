package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.FacebookSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W7K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7K {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C0W7K();
    }

    public static final void LJFF() {
        if (!FacebookSdk.LJII()) {
            throw new C2202821BJg("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final void LIZJ(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Container '");
                sbLIZ.append("requests");
                sbLIZ.append("' cannot contain null values");
                throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (!collection.isEmpty()) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Container '");
        sbLIZ2.append("requests");
        sbLIZ2.append("' cannot be empty");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final boolean LIZ(Context context, String str) throws Throwable {
        List listLJJJJZ;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            listLJJJJZ = C2204961BRm.LJJJJZ(packageManager, intent, 64, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloWY4WiiLW+O", new String[]{"019e5"}));
        } else {
            listLJJJJZ = null;
        }
        if (listLJJJJZ == null) {
            return false;
        }
        Iterator it2 = listLJJJJZ.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it2.next()).activityInfo;
            if (!Intrinsics.LJFF(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.LJFF(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static final void LIZIZ(String str, String str2) {
        if (str.length() > 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Argument '");
        sbLIZ.append(str2);
        sbLIZ.append("' cannot be empty");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final void LIZLLL(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Argument '");
        sbLIZ.append(str);
        sbLIZ.append("' cannot be null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJ(String str, String str2) {
        if (str != null && str.length() > 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Argument '");
        sbLIZ.append(str2);
        sbLIZ.append("' cannot be null or empty");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
