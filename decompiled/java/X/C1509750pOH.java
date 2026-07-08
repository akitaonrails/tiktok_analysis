package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ml.feature.contentscore.ScoreData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pOH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509750pOH {
    public static final C1509750pOH LIZ = new C1509750pOH();
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final ConcurrentHashMap<String, ScoreData> LIZLLL;
    public static final List<InterfaceC1509840pOQ> LJ;
    public static final ConcurrentLinkedQueue<String> LJFF;
    public static final ConcurrentHashMap<String, Integer> LJI;
    public static final List<String> LJII;

    static {
        AccountUserService accountUserServiceLJIIJ;
        AccountUserService accountUserServiceLJIIJ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content_score_data_");
        String curUserId = null;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        String curUserId2 = null;
        if (iAccountService != null && (accountUserServiceLJIIJ2 = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ2.getCurUserId();
        }
        sbLIZ.append(curUserId);
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("content_score_order_");
        IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService2 != null && (accountUserServiceLJIIJ = iAccountService2.LJIIJ()) != null) {
            curUserId2 = accountUserServiceLJIIJ.getCurUserId();
        }
        sbLIZ2.append(curUserId2);
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        LIZLLL = new ConcurrentHashMap<>();
        LJ = new ArrayList();
        LJFF = new ConcurrentLinkedQueue<>();
        LJI = new ConcurrentHashMap<>();
        if (C0BMB.LIZ()) {
            C1511690pRP.LIZIZ(new Runnable() { // from class: X.0pOI
                public static void LIZ() {
                    String strLIZIZ = C0R1F.LIZIZ(C1509750pOH.LIZIZ);
                    if ((!Intrinsics.LJFF(strLIZIZ, "")) && strLIZIZ != null) {
                        C1509750pOH.LIZLLL.putAll((ConcurrentHashMap) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strLIZIZ, new TypeToken<ConcurrentHashMap<String, ScoreData>>() { // from class: X.0pOM
                        }.getType()));
                    }
                    String strLIZIZ2 = C0R1F.LIZIZ(C1509750pOH.LIZJ);
                    if (!(!Intrinsics.LJFF(strLIZIZ2, "")) || strLIZIZ2 == null) {
                        return;
                    }
                    C1509750pOH.LJFF.addAll((ConcurrentLinkedQueue) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strLIZIZ2, new TypeToken<ConcurrentLinkedQueue<String>>() { // from class: X.0pON
                    }.getType()));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ContentScoreManager@943c.<init>$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ContentScoreManager@943c.<init>$1");
                }
            });
        }
        LJII = C1697810uHb.LJIIJJI("10014", "10083", "10018", "10071");
    }

    public static void LIZ() {
        C0R1F.LIZLLL(LIZIZ, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), LIZLLL));
        C0R1F.LIZLLL(LIZJ, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), LJFF));
    }
}
