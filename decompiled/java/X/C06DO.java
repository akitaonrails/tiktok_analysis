package X;

import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import java.util.Map;

/* JADX INFO: renamed from: X.06DO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06DO {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C869590Y9l c869590Y9l) {
        SystemContent systemContent;
        SystemContent.Key[] template;
        Object localCache = c869590Y9l.getLocalCache(501);
        Map<String, String> extra = null;
        if (localCache != null && (localCache instanceof SystemContent) && (systemContent = (SystemContent) localCache) != null && (template = systemContent.getTemplate()) != null) {
            int length = template.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                SystemContent.Key key = template[i];
                if (key.getAction() == 200001) {
                    extra = key.getExtra();
                    break;
                }
                i++;
            }
        }
        return LIZJ(c869590Y9l.getConversationId(), extra);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r6) {
        /*
            X.06Ey r0 = X.C1575806Ey.LIZJ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.StreakData r5 = X.C1575806Ey.LJII(r6)
            r4 = 0
            if (r5 == 0) goto L60
            boolean r0 = X.C1567806Bw.LJ(r5)
            r3 = 1
            if (r0 != r3) goto L60
        L13:
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isRestorable: convId="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = ", status="
            r2.append(r0)
            r1 = 0
            if (r5 == 0) goto L5e
            X.06Gk r0 = X.C1567806Bw.LJIIIIZZ(r5, r4)
        L2d:
            r2.append(r0)
            java.lang.String r0 = ", restorable="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = ", remainRestoreCnt="
            r2.append(r0)
            if (r5 == 0) goto L5c
            int r0 = r5.remainRestoreCnt
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L45:
            r2.append(r0)
            java.lang.String r0 = ", restorableBefore="
            r2.append(r0)
            if (r5 == 0) goto L55
            long r0 = r5.restoreAvailableTime
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L55:
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            return r3
        L5c:
            r0 = r1
            goto L45
        L5e:
            r0 = r1
            goto L2d
        L60:
            r3 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06DO.LIZIZ(java.lang.String):boolean");
    }

    public static boolean LIZJ(String str, Map map) {
        String str2;
        Long lLJIILIIL;
        if (map != null && (str2 = (String) map.get("streak_badge_restorable_before")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            if (LIZIZ(str) && C1567806Bw.LJI() < jLongValue) {
                return true;
            }
            return false;
        }
        return false;
    }
}
