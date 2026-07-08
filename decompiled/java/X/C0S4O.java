package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.infra.viewtree.FeedViewTreeConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0S4O, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4O {
    public static long LIZIZ;
    public static final C0S4O LIZ = new C0S4O();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(15));
    public static final Map<String, Long> LIZLLL = new LinkedHashMap();

    public static boolean LIZ(C0S48 c0s48) {
        long jLongValue;
        FeedViewTreeConfig.LIZ.getClass();
        if (FeedViewTreeConfig.LIZIZ().size() >= c0s48.getId()) {
            Long l = (Long) ((LinkedHashMap) LIZLLL).get(c0s48.getValue());
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if ((System.currentTimeMillis() - jLongValue) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= ((Number) ListProtector.get(FeedViewTreeConfig.LIZIZ(), c0s48.getId() - 1)).longValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(C0S4O c0s4o, C0S48 c0s48, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        c0s4o.getClass();
        C01GW c01gw = LIZJ;
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doViewTreeCapture ");
        sbLIZ.append(c0s48.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = AbstractC1604130rqV.LIZLLL;
        abstractC1604130rqV.LJIIIIZZ(null, "FVT", strLIZIZ);
        FeedViewTreeConfig.LIZ.getClass();
        if (FeedViewTreeConfig.LIZLLL) {
            try {
                if (c0s48 != C0S48.ENTRY_LOCAL_TEST_FEEDBACK) {
                    if (FeedViewTreeConfig.LJI.contains(Integer.valueOf(c0s48.getId()))) {
                        if (!LIZ(c0s48)) {
                            AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) c01gw.getValue();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("checkEntryLimitByTime hit ");
                            sbLIZ2.append(c0s48.getValue());
                            abstractC1604130rqV2.LJIIIIZZ(null, "FVT", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C20342614im.LIZIZ(c0s48, C20342614im.LIZJ(new AwS590S0100000_11(c0s48, 10)), AFwS243S0000000_11.get$arr$(8), new AwS590S0100000_11(c0s48, 11), z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LIZLLL("feed", e);
            }
        }
    }
}
