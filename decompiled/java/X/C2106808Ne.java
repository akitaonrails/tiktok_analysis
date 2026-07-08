package X;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08Ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2106808Ne {
    public static String[] LIZ;

    public static Map<String, Boolean> LIZ(Context context) {
        boolean z;
        HashMap map = new HashMap();
        String[] strArr = LIZ;
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                map.put(str, Boolean.valueOf(z));
            }
        }
        return map;
    }
}
