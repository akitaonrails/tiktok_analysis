package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.utils.SearchPostConsumptionInfoRecord;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R16, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R16 {
    public static String LIZIZ;
    public static final C0R16 LIZ = new C0R16();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0R17());
    public static boolean LIZLLL = true;
    public static final C01GW LJ = C452501pT.LIZIZ(new C0R18());

    public static void LIZ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return;
        }
        String curUserId = accountUserServiceLJIIJ.getCurUserId();
        if (Intrinsics.LJFF(curUserId, LIZIZ)) {
            return;
        }
        LIZIZ = curUserId;
        C0R15 c0r15LIZJ = LIZJ();
        synchronized (c0r15LIZJ) {
            c0r15LIZJ.LIZIZ.clear();
        }
    }

    public static C0R15 LIZJ() {
        return (C0R15) LJ.getValue();
    }

    public static C1517400pac LIZIZ(Long l) {
        boolean zIsEmpty;
        long jLongValue;
        if (LIZLLL) {
            LIZLLL = false;
            return null;
        }
        LIZ();
        C0R15 c0r15LIZJ = LIZJ();
        synchronized (c0r15LIZJ) {
            zIsEmpty = c0r15LIZJ.LIZIZ.isEmpty();
        }
        if (zIsEmpty) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C1517400pac c1517400pac = new C1517400pac(null, arrayList);
        for (SearchPostConsumptionInfoRecord searchPostConsumptionInfoRecord : LIZJ().LIZIZ()) {
            long j = searchPostConsumptionInfoRecord.searchTime;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                LIZ.getClass();
                jLongValue = ((Number) LIZJ.getValue()).longValue();
            }
            if (j + (jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) >= System.currentTimeMillis()) {
                arrayList.add(new C1517370paZ(searchPostConsumptionInfoRecord.searchKeyword, Long.valueOf(searchPostConsumptionInfoRecord.searchTime), searchPostConsumptionInfoRecord.searchType, searchPostConsumptionInfoRecord.searchSource, searchPostConsumptionInfoRecord.getConsumptionList(), ""));
            }
        }
        c1517400pac.search_seq = arrayList;
        return c1517400pac;
    }

    public static void LIZLLL(String str, String str2, C2252061DCq c2252061DCq) {
        LIZ();
        for (SearchPostConsumptionInfoRecord searchPostConsumptionInfoRecord : LIZJ().LIZIZ()) {
            if (Intrinsics.LJFF(searchPostConsumptionInfoRecord.searchId, str)) {
                searchPostConsumptionInfoRecord.updateConsumeDataCache(str2, c2252061DCq);
            }
        }
    }
}
