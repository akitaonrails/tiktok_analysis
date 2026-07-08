package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Map;

/* JADX INFO: renamed from: X.0N7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588890N7v {
    public static boolean LIZ;

    public static String LIZ(Map<String, Float> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    Map.Entry<String, Float> entry = null;
                    for (Map.Entry<String, Float> entry2 : map.entrySet()) {
                        if (entry2 != null && (entry == null || entry.getValue().floatValue() < entry2.getValue().floatValue())) {
                            entry = entry2;
                        }
                    }
                    if (entry != null) {
                        return entry.getKey();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.lang.String r12) {
        /*
            r12.getClass()
            int r0 = r12.hashCode()
            r11 = 9
            r10 = 8
            r9 = 7
            r8 = 6
            r7 = 5
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            r2 = 0
            r1 = -1
            switch(r0) {
                case 49: goto L18;
                case 50: goto L21;
                case 51: goto L2a;
                case 52: goto L33;
                case 53: goto L3c;
                case 54: goto L45;
                case 55: goto L4e;
                case 56: goto L57;
                case 57: goto L60;
                case 1444: goto L69;
                case 1445: goto L72;
                case 56601: goto L7c;
                default: goto L17;
            }
        L17:
            return r2
        L18:
            java.lang.String r0 = "1"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r3
        L21:
            java.lang.String r0 = "2"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r4
        L2a:
            java.lang.String r0 = "3"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r5
        L33:
            java.lang.String r0 = "4"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r6
        L3c:
            java.lang.String r0 = "5"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r7
        L45:
            java.lang.String r0 = "6"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r8
        L4e:
            java.lang.String r0 = "7"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r9
        L57:
            java.lang.String r0 = "8"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r10
        L60:
            java.lang.String r0 = "9"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r11
        L69:
            java.lang.String r0 = "-1"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            return r1
        L72:
            java.lang.String r0 = "-2"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            r0 = -2
            return r0
        L7c:
            java.lang.String r0 = "999"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L17
            r0 = 999(0x3e7, float:1.4E-42)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C588890N7v.LIZIZ(java.lang.String):int");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZJ(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 49:
                if (!str.equals("1")) {
                    return "static";
                }
                return "bycar";
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                if (!str.equals("2")) {
                    return "static";
                }
                return "walking";
            case 51:
                if (!str.equals("3")) {
                    return "static";
                }
                return "lying";
            case 52:
                if (!str.equals("4")) {
                    return "static";
                }
                return "by_subway";
            case 53:
                if (!str.equals("5")) {
                    return "static";
                }
                return "driving";
            case 54:
                if (!str.equals("6")) {
                    return "static";
                }
                return "phone_stand";
            case 55:
                if (!str.equals("7")) {
                    return "static";
                }
                return "screen_downward";
            case 56:
                if (!str.equals("8")) {
                    return "static";
                }
                return "screen_upward";
            case 57:
                if (!str.equals("9")) {
                    return "static";
                }
                return "screen_forward";
            case 1445:
                if (!str.equals("-2")) {
                    return "static";
                }
                return "error";
            case 56601:
                if (!str.equals("999")) {
                    return "static";
                }
                return "unknown";
            default:
                return "static";
        }
    }
}
