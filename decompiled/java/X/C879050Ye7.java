package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ye7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879050Ye7 {
    public static volatile boolean LIZJ;
    public static String LJ;
    public static EnumC871430YGn LJI;
    public static final C879050Ye7 LIZ = new C879050Ye7();
    public static final Map<String, Long> LIZIZ = new LinkedHashMap();
    public static int LIZLLL = -1;
    public static final Map<EnumC871430YGn, C886260Ypk> LJFF = new LinkedHashMap();

    public final synchronized void LIZ(String str) {
        Map<String, Long> map = LIZIZ;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, Long.valueOf(SystemClock.uptimeMillis()));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.util.List r18, boolean r19, java.lang.String r20, X.EnumC871430YGn r21) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879050Ye7.LIZIZ(java.util.List, boolean, java.lang.String, X.0YGn):void");
    }
}
