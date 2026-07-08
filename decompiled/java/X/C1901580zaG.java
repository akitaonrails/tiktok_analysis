package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityPod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901580zaG {
    public static final C1901580zaG LIZ = new C1901580zaG();
    public static final long LIZIZ;
    public static final int LIZJ;
    public static volatile C1901590zaH LIZLLL;

    public static SkylightDataResponse LJII() {
        try {
            LIZ.getClass();
            String string = LJI().getString("inbox_skylight_data", "");
            if (string == null || string.length() == 0) {
                return null;
            }
            return (SkylightDataResponse) JsonParseUtils.LIZLLL(SkylightDataResponse.class, string);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("InboxDataCache", "getSkylightData error", thM5exceptionOrNullimpl);
            }
            return null;
        }
    }

    static {
        LIZIZ = ((Number) C0C39.LIZ.getValue()).intValue() == 2 ? 86400000L : 604800000L;
        LIZJ = ((Number) C0ALD.LIZ.getValue()).intValue() * LSPassThroughRecordSizeConfig.DEFAULT;
        LIZLLL = new C1901590zaH(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
    }

    public static void LIZJ() {
        Object c098200Yq;
        try {
            LIZ.getClass();
            LIZLLL = C1901590zaH.LIZ(LIZLLL(), null);
            LJI().erase("inbox_entrance_list_data");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InboxDataCache", "clearInboxEntrance error", thM5exceptionOrNullimpl);
        }
    }

    public static C1901590zaH LIZLLL() {
        if (!Intrinsics.LJFF(LIZLLL.LIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            LIZLLL = new C1901590zaH(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        return LIZLLL;
    }

    public static long LJ() {
        try {
            LIZ.getClass();
            return LJI().getLong("inbox_skylight_data_time", 0L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return -1L;
            }
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InboxDataCache", "getSkylightDataSaveTime error", thM5exceptionOrNullimpl);
            return -1L;
        }
    }

    public static List LJFF() {
        Object c098200Yq;
        try {
            LIZ.getClass();
            List<InboxEntranceCell> list = LIZLLL().LIZJ;
            if (list != null) {
                return list;
            }
            Keva kevaLJI = LJI();
            String string = kevaLJI.getString("inbox_entrance_list_data", "");
            long j = kevaLJI.getLong("inbox_entrance_list_data_time", 0L);
            if (string == null || string.length() == 0) {
                return null;
            }
            List listLIZJ = JsonParseUtils.LIZJ(InboxEntranceCell.class, string);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getInboxEntranceCellList maxAge=");
            long j2 = LIZIZ;
            sbLIZ.append(j2);
            sbLIZ.append(",localTime =");
            sbLIZ.append(j);
            C1720106oR.LJI("InboxDataCache", C2188811AlT.LIZIZ(sbLIZ));
            if (j2 < 0 || System.currentTimeMillis() - j < j2) {
                return listLIZJ;
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InboxDataCache", "getInboxEntranceCellList error", thM5exceptionOrNullimpl);
        }
        return null;
    }

    public static Keva LJI() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return Keva.getRepo(C786410Ut5.j4("inbox_data_%s_repo_v2", Arrays.copyOf(new Object[]{uid}, 1)));
    }

    public static boolean LJIIIIZZ() {
        return System.currentTimeMillis() - LJ() < ((long) LIZJ);
    }

    public static void LJIIJ() {
        Keva kevaLJI = LJI();
        Map<String, ?> all = kevaLJI.getAll();
        if (all != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (u.LJJIIJZLJL(entry.getKey(), "key_live_notice_status_", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                kevaLJI.storeInt((String) ((Map.Entry) it2.next()).getKey(), 0);
            }
        }
    }

    public final void LIZ() {
        String strLJIILJJIL;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        Keva kevaLJI = LJI();
        C844470XAv.LIZ.getClass();
        long jLIZLLL = C844470XAv.LIZLLL();
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ())) == null) {
            strLJIILJJIL = "";
        }
        long j = kevaLJI.getLong("version", 0L);
        String string = kevaLJI.getString("language", "");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("repoVersion = ");
        sbLIZ.append(j);
        sbLIZ.append(",curVersion= ");
        sbLIZ.append(jLIZLLL);
        sbLIZ.append(",curLanguage= ");
        sbLIZ.append(strLJIILJJIL);
        sbLIZ.append(",repoLanguage =");
        sbLIZ.append(string);
        C1720106oR.LJI("InboxDataCache", C2188811AlT.LIZIZ(sbLIZ));
        if (j > 0 && jLIZLLL == j && Intrinsics.LJFF(strLJIILJJIL, string)) {
            return;
        }
        LIZLLL = new C1901590zaH(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C1720106oR.LJI("InboxDataCache", "checkRepoState clearData()");
        LIZIZ(this);
        kevaLJI.storeLong("version", jLIZLLL);
        kevaLJI.storeString("language", strLJIILJJIL);
    }

    public final void LJIIIZ() {
        LIZ();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || LIZLLL().LIZIZ) {
            return;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxDataCache", "loadBuffer");
        LIZLLL = new C1901590zaH(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), true, (C297280Bl0.LIZ() && C2367709Pn.LJIIIIZZ(C1BWL.LIZ())) ? null : LJFF());
    }

    public static void LIZIZ(C1901580zaG c1901580zaG) {
        c1901580zaG.getClass();
        Keva kevaLJI = LJI();
        for (Map.Entry<String, ?> entry : kevaLJI.getAll().entrySet()) {
            String key = entry.getKey();
            entry.getValue();
            if (!C1697810uHb.LJIIJJI("last_visit_activity_subpage", "last_visit_follower_subpage").contains(key)) {
                kevaLJI.erase(key);
            }
        }
    }

    public static void LJIIJJI(ActivityPod activityPod) {
        Object c098200Yq;
        try {
            LIZ.getClass();
            LJI().storeString(activityPod.dataType.name(), JsonParseUtils.LJ(activityPod));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InboxDataCache", "storeActivityCacheData error", thM5exceptionOrNullimpl);
        }
    }

    public static void LJIIL(List list) {
        Object c098200Yq;
        ArrayList arrayList;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (list == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("InboxDataCache", "data == null, storeInboxEntranceCellList return ");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InboxEntranceCell inboxEntranceCell = (InboxEntranceCell) it2.next();
            arrayList2.add(inboxEntranceCell.copy(inboxEntranceCell.cellId, inboxEntranceCell.priority, inboxEntranceCell.unreadCount, inboxEntranceCell.uiInfo, inboxEntranceCell.bizParams, inboxEntranceCell.lastNoticeCreateTime, inboxEntranceCell.canHide, inboxEntranceCell.canPin, inboxEntranceCell.filterType, inboxEntranceCell.group, inboxEntranceCell.systemNoticeType, inboxEntranceCell.exposedInfo, inboxEntranceCell.eventTrackingExtra, inboxEntranceCell.beforeMarkUnreadCount, inboxEntranceCell.beforeMarkUiInfo, null, inboxEntranceCell.latestUnreadNoticeTime, inboxEntranceCell.entranceKey, inboxEntranceCell.functionList));
        }
        LIZ.getClass();
        C1901590zaH c1901590zaHLIZLLL = LIZLLL();
        if (C297280Bl0.LIZ() && C2367709Pn.LJIIIIZZ(C1BWL.LIZ())) {
            arrayList = null;
        } else {
            arrayList = arrayList2;
        }
        LIZLLL = C1901590zaH.LIZ(c1901590zaHLIZLLL, arrayList);
        Keva kevaLJI = LJI();
        kevaLJI.storeString("inbox_entrance_list_data", JsonParseUtils.LJ(arrayList2));
        kevaLJI.storeLong("inbox_entrance_list_data_time", System.currentTimeMillis());
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InboxDataCache", "storeInboxEntranceCellList error", thM5exceptionOrNullimpl);
        }
    }

    public static void LJIILIIL(Long l) {
        Object c098200Yq;
        if (C0C39.LIZ() && l != null) {
            long jLongValue = l.longValue();
            try {
                LIZ.getClass();
                LJI().storeLong("inbox_entrance_list_data_time_server", jLongValue);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("InboxDataCache", "saveInboxEntranceCellServerTime error", thM5exceptionOrNullimpl);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static void LJIILJJIL(SkylightDataResponse skylightDataResponse) {
        Object c098200Yq;
        List<SkylightData> dataList = skylightDataResponse.getDataList();
        boolean z = false;
        if (dataList != null && !dataList.isEmpty()) {
            Iterator<SkylightData> it2 = dataList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().bizType == 1) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("InboxDataCache", "no MUF data,storeSkylightData return ");
            return;
        }
        try {
            String strLJ = JsonParseUtils.LJ(skylightDataResponse);
            LIZ.getClass();
            LJI().storeString("inbox_skylight_data", strLJ);
            LJI().storeLong("inbox_skylight_data_time", System.currentTimeMillis());
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InboxDataCache", "storeSkylightData error", thM5exceptionOrNullimpl);
        }
    }
}
