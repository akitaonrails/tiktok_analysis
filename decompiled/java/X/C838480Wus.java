package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.util.Objects;

/* JADX INFO: renamed from: X.0Wus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838480Wus {
    public static int LIZ(Context context, String str) throws Throwable {
        int iLIZJ;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp != null) {
            if (packageName == null) {
                String[] strArrLJJJJLL = C2204961BRm.LJJJJLL(context.getPackageManager(), iMyUid, new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OVlZa/GLYDdJRtWDzWJwuQaZ", new String[]{"01789"}));
                if (strArrLJJJJLL == null || strArrLJJJJLL.length <= 0) {
                    return -1;
                }
                packageName = strArrLJJJJLL[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManagerLIZJ = C838500Wuu.LIZJ(context);
                if (C838500Wuu.LIZ(appOpsManagerLIZJ, strPermissionToOp, Binder.getCallingUid(), packageName) == 0) {
                    iLIZJ = C838500Wuu.LIZ(appOpsManagerLIZJ, strPermissionToOp, iMyUid, C838500Wuu.LIZIZ(context));
                } else {
                    return -2;
                }
            } else {
                iLIZJ = C838490Wut.LIZJ((AppOpsManager) C838490Wut.LIZ(context, AppOpsManager.class), strPermissionToOp, packageName);
            }
            if (iLIZJ != 0) {
                return -2;
            }
        }
        return 0;
    }
}
