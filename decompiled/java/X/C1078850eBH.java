package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeAllowListSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0eBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078850eBH {
    public static boolean LIZ(String str) {
        boolean z;
        boolean zLJJJJ;
        int value = LiveALogAndMonitorDegradeSetting.INSTANCE.getValue();
        List<String> list = LiveALogAndMonitorDegradeAllowListSetting.INSTANCE.getValue().aLogList;
        if (value != 1 && value != 2) {
            z = false;
        } else {
            z = true;
        }
        if (!C2093608Ic.LJ(str) && list != null && !list.isEmpty()) {
            zLJJJJ = C13LP.LJJJJ(str, list);
        } else {
            zLJJJJ = false;
        }
        if (!z || zLJJJJ) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(int i, String str) {
        boolean z;
        boolean zContains;
        int value = LiveALogAndMonitorDegradeSetting.INSTANCE.getValue();
        List<String> list = LiveALogAndMonitorDegradeAllowListSetting.INSTANCE.getValue().monitorList;
        if (value == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!C2093608Ic.LJ(str) && list != null && !list.isEmpty()) {
            zContains = list.contains(str);
        } else {
            zContains = false;
        }
        if (!z || zContains) {
            return false;
        }
        if (i != 1) {
            if (i != 2 || ((int) (Math.random() * ((double) LSPassThroughRecordSizeConfig.DEFAULT))) != 1) {
                return true;
            }
            return false;
        }
        if (((int) (Math.random() * ((double) 100))) != 1) {
            return true;
        }
        return false;
    }
}
