package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy;
import com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.10ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19329210ji {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("repo_in_app_push_");
        Long lLJIILIIL = C2095008Iq.LJIILIIL(((IAccountUserService) C19331310k3.LIZ.getValue()).getCurUserId());
        sbLIZ.append(lLJIILIIL != null ? lLJIILIIL.longValue() : 0L);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static LinkedHashMap LJFF() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), LJ().getString("setting_sync_expire_config", ""), new TypeToken<LinkedHashMap<Integer, Long>>() { // from class: X.10jj
        }.getType());
        return linkedHashMap == null ? new LinkedHashMap() : linkedHashMap;
    }

    public static String LIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("record_ban_strategy_");
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static InnerPushBanStrategy LIZIZ(long j) {
        Object objLIZLLL;
        try {
            objLIZLLL = JsonParseUtils.LIZLLL(InnerPushBanStrategy.class, LJ().getString(LIZ(j), ""));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            objLIZLLL = null;
            if (thM5exceptionOrNullimpl != null) {
                C19331210k2 c19331210k2 = C19331210k2.LIZ;
                EnumC19355710nz enumC19355710nz = EnumC19355710nz.JSON_PARSE_OBJECT;
                String message = thM5exceptionOrNullimpl.getMessage();
                c19331210k2.getClass();
                C19331210k2.LJIIIZ(null, enumC19355710nz, message);
            }
        }
        return (InnerPushBanStrategy) objLIZLLL;
    }

    public static String LIZJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("record_popup_limit_strategy_");
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static InnerPushPopupLimitStrategy LIZLLL(long j) {
        Object objLIZLLL;
        try {
            objLIZLLL = JsonParseUtils.LIZLLL(InnerPushPopupLimitStrategy.class, LJ().getString(LIZJ(j), ""));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            objLIZLLL = null;
            if (thM5exceptionOrNullimpl != null) {
                C19331210k2 c19331210k2 = C19331210k2.LIZ;
                EnumC19355710nz enumC19355710nz = EnumC19355710nz.JSON_PARSE_OBJECT;
                String message = thM5exceptionOrNullimpl.getMessage();
                c19331210k2.getClass();
                C19331210k2.LJIIIZ(null, enumC19355710nz, message);
            }
        }
        return (InnerPushPopupLimitStrategy) objLIZLLL;
    }

    public static void LJI(InnerPushMessage innerPushMessage) {
        List arrayList;
        String strValueOf = String.valueOf(innerPushMessage.getId());
        int iIntValue = ((Number) InnerPushConfig.LJ.getValue()).intValue();
        String string = LJ().getString("record_for_external_displayed_id_list", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = C08JS.LJ(Object[].class, string);
        } else {
            arrayList = new ArrayList();
        }
        C19506911Tn c19506911Tn = new C19506911Tn(arrayList, iIntValue);
        c19506911Tn.LIZ(strValueOf);
        LJ().storeString("record_for_external_displayed_id_list", C08JS.LIZLLL(c19506911Tn.LIZIZ));
    }

    public static void LJII(long j, boolean z) {
        List arrayList;
        String string = LJ().getString("wait_status_messages", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = C08JS.LJ(Object[].class, string);
        } else {
            arrayList = new ArrayList();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.addAll(arrayList);
        String strValueOf = String.valueOf(j);
        if (z) {
            copyOnWriteArraySet.add(strValueOf);
        } else {
            copyOnWriteArraySet.remove(strValueOf);
        }
        LJ().storeString("wait_status_messages", C08JS.LIZLLL(C13LP.LLIIII(copyOnWriteArraySet)));
    }
}
