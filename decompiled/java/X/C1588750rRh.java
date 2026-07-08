package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588750rRh {
    public static final C1588750rRh LIZ = new C1588750rRh();

    public static FollowFeedList LIZ(EnumC1588720rRe enumC1588720rRe, EnumC1588650rRX enumC1588650rRX) {
        String strLIZIZ;
        int i;
        List<String> listLIZLLL;
        int[] iArrLIZ = C422830Gi1.LIZ(101);
        String str = "";
        int i2 = 0;
        if (iArrLIZ == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iArrLIZ[0]);
            sbLIZ.append('_');
            sbLIZ.append(iArrLIZ[1]);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        String strLIZ = C1489110oqz.LIZ("feed");
        try {
            int i3 = C1588730rRf.LIZ[enumC1588720rRe.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new C1954807lC();
                }
            } else {
                i2 = 1;
            }
            C804900Vho.LIZ.getClass();
            String strLIZJ = C804900Vho.LIZJ();
            C607670NsT c607670NsT = C607670NsT.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (((AccountUserService) C0XQ7.LJFF()).LIZLLL()) {
                i = 1;
            } else {
                i = 2;
            }
            int iLJIILL = ComplianceServiceProvider.LJIILIIL().LJIILL();
            String strLIZLLL = AnonymousClass1440.LIZLLL();
            String strLJ = C486660J6q.LJ();
            String strLIZLLL2 = C486660J6q.LIZLLL();
            boolean zLIZJ = C1601690rmZ.LIZJ();
            SharePrefCache.inst().getIsContactsUploaded().LIZ().booleanValue();
            String strLJII = ComplianceServiceProvider.LJJI().LJII();
            if (strLJII != null) {
                str = strLJII;
            }
            C13BV c13bv = C13BV.INSTANCE;
            IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null);
            if (iFollowReadService != null) {
                listLIZLLL = iFollowReadService.LIZLLL();
            } else {
                listLIZLLL = null;
            }
            try {
                FollowFeedList followFeedListLIZ = c607670NsT.LIZ(0, 0L, 1, 0, 0, jCurrentTimeMillis, null, null, null, i, 0, strLIZIZ, strLIZ, iLJIILL, str, strLIZLLL, strLJ, strLIZLLL2, zLIZJ, c13bv, enumC1588650rRX, i2, listLIZLLL, null, strLIZJ);
                if (followFeedListLIZ.getItems() == null || followFeedListLIZ.getItems().isEmpty()) {
                    return null;
                }
                C607610NsN.LIZ.getClass();
                C23250099c.LIZLLL(C607610NsN.LIZ(), null, null, new C607630NsP(followFeedListLIZ, i2, 0L, null), 3);
                Iterator<FollowFeed> it2 = followFeedListLIZ.getItems().iterator();
                while (it2.hasNext()) {
                    it2.next().setFromPreload(true);
                }
                return followFeedListLIZ;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
