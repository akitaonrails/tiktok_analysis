package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.010v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2651010v {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(227));

    public static void LIZ(long j, Long l) {
        try {
            Long lValueOf = Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
            if (lValueOf != null && l != null && l.longValue() != 0) {
                Long lValueOf2 = Long.valueOf(j);
                Map map = (Map) LIZ.getValue();
                long jLongValue = lValueOf.longValue();
                long jLongValue2 = l.longValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(jLongValue);
                sbLIZ.append('_');
                sbLIZ.append(jLongValue2);
                map.put(C2188811AlT.LIZIZ(sbLIZ), lValueOf2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("PreviewRemainTimeDataCenter", e.getMessage());
        }
    }

    public static long LIZIZ(long j, Long l) {
        try {
            Long lValueOf = Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
            if (lValueOf != null && l != null && l.longValue() != 0) {
                long jLongValue = lValueOf.longValue();
                long jLongValue2 = l.longValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(jLongValue);
                sbLIZ.append('_');
                sbLIZ.append(jLongValue2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C01GW c01gw = LIZ;
                Long l2 = (Long) ((Map) c01gw.getValue()).get(strLIZIZ);
                if (l2 == null) {
                    ((Map) c01gw.getValue()).put(strLIZIZ, Long.valueOf(j));
                    return j;
                }
                if (l2.longValue() > j) {
                    ((Map) c01gw.getValue()).put(strLIZIZ, Long.valueOf(j));
                    return j;
                }
                return l2.longValue();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("PreviewRemainTimeDataCenter", e.getMessage());
        }
        return j;
    }
}
