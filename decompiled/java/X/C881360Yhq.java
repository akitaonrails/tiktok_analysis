package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0Yhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881360Yhq {
    public static final C01GW<C881360Yhq> LIZ = C452501pT.LIZIZ(new C881380Yhs());

    public static Context LIZIZ() {
        Activity currentActivity = C2213981Bky.LIZIZ.getCurrentActivity();
        return currentActivity == null ? C1383370m6R.LIZ : currentActivity;
    }

    public static List LIZ(C0Y8T c0y8t, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C05RV c05rvLIZJ;
        EnumC1669706gJ enumC1669706gJLIZ;
        FilterTabType filterTabType;
        C878950Ydx c878950Ydx;
        InterfaceC877200Yb8 interfaceC877200Yb8LJIJI;
        InterfaceC1669506gH interfaceC1669506gHLIZIZ;
        List list;
        NoticeFeature noticeFeatureLIZ;
        if (c0y8t == null) {
            return C13BV.INSTANCE;
        }
        C06QI c06qi = NoticeFeature.LIZ;
        NoticeFeature noticeFeatureLIZ2 = c06qi.LIZ();
        if (noticeFeatureLIZ2 != null) {
            c05rvLIZJ = noticeFeatureLIZ2.LIZJ();
        } else {
            c05rvLIZJ = null;
        }
        if (c05rvLIZJ != C05RV.BUSINESS_INBOX) {
            list = C13BV.INSTANCE;
        } else {
            ArrayList arrayList = new ArrayList();
            if (C879070Ye9.LIZ(c0y8t)) {
                String strLJIIJ = C1383370m6R.LJIIJ(2131845297);
                C0Z8G.Companion.getClass();
                arrayList.add(new C880460YgO(strLJIIJ, "ad", 0, C881370Yhr.LIZ()));
            }
            String strValueOf = String.valueOf(C0YNP.LJII(c0y8t.getConversationId()));
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJIJI = C069P.LIZ().LJ().LJIJI(strValueOf);
            IIMBusinessChatService.LIZ.getClass();
            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
            if (iIMBusinessChatService == null || (interfaceC1669506gHLIZIZ = iIMBusinessChatService.LIZIZ()) == null || (enumC1669706gJLIZ = interfaceC1669506gHLIZIZ.LIZ(iMUserLJIJI)) == null) {
                enumC1669706gJLIZ = EnumC1669706gJ.NONE;
            }
            if (enumC1669706gJLIZ != EnumC1669706gJ.NONE && enumC1669706gJLIZ != null) {
                String strLJIIJ2 = C1383370m6R.LJIIJ(enumC1669706gJLIZ.getDisplayText());
                String mobValue = enumC1669706gJLIZ.getMobValue();
                C0Z8G.Companion.getClass();
                arrayList.add(new C880460YgO(strLJIIJ2, mobValue, 0, C881370Yhr.LIZ()));
            }
            if (c0y8t.getConversationTags().contains(EnumC879080YeA.LEAD.getValue())) {
                String strLJIIJ3 = C1383370m6R.LJIIJ(2131845299);
                C0Z8G.Companion.getClass();
                arrayList.add(new C880460YgO(strLJIIJ3, "lead", 0, C881370Yhr.LIZ()));
            }
            if (iIMBusinessChatService != null && (interfaceC877200Yb8LJIJI = iIMBusinessChatService.LJIJI()) != null && interfaceC877200Yb8LJIJI.LIZIZ(c0y8t)) {
                String strLJIIJ4 = C1383370m6R.LJIIJ(2131855838);
                C0Z8G.Companion.getClass();
                arrayList.add(new C880460YgO(strLJIIJ4, "service+", 0, C881370Yhr.LIZ()));
            }
            if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
                filterTabType = c878950Ydx.LLILLL;
            } else {
                filterTabType = null;
            }
            list = arrayList;
            if (filterTabType == FilterTabType.SPAM) {
                Set<String> conversationTags = c0y8t.getConversationTags();
                list = arrayList;
                if (conversationTags != null) {
                    list = arrayList;
                    if (conversationTags.contains(EnumC879080YeA.FILTERED_MSG.getValue())) {
                        String strLJIIJ5 = C1383370m6R.LJIIJ(2131845365);
                        C0Z8G.Companion.getClass();
                        arrayList.add(new C880460YgO(strLJIIJ5, "filtered_msg", 0, C881370Yhr.LIZ()));
                        list = arrayList;
                    }
                }
            }
        }
        if (list.size() > 1 && (noticeFeatureLIZ = c06qi.LIZ()) != null && noticeFeatureLIZ.LIZLLL()) {
            ArrayList arrayList2 = new ArrayList();
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            if (objLJJJLZIJ != null) {
                arrayList2.add(objLJJJLZIJ);
            }
            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            if (objLJJJLZIJ2 != null) {
                arrayList2.add(objLJJJLZIJ2);
            }
            return arrayList2;
        }
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (objLJJJLL != null) {
            return Collections.singletonList(objLJJJLL);
        }
        return null;
    }

    public static String LIZJ(long j, long j2) {
        long j3 = j - j2;
        if (j3 < 0) {
            return "";
        }
        if (C1387310mCn.LJII(j2)) {
            if (0 <= j3 && j3 < 60000) {
                return LIZIZ().getString(2131828582);
            }
            if (60000 <= j3 && j3 < 3600000) {
                return LIZIZ().getString(2131828583, Integer.valueOf((int) (j3 / 60000)));
            }
            if (3600000 <= j3 && j3 < 25200000) {
                return LIZIZ().getString(2131828581, Integer.valueOf((int) (j3 / 3600000)));
            }
            if (25200000 <= j3 && j3 < 86400000) {
                return LIZIZ().getString(2131828584);
            }
            return LIZIZ().getString(2131828579);
        }
        long jLIZIZ = C1387310mCn.LIZIZ(1);
        C1387320mCo c1387320mCoLIZJ = C1387310mCn.LIZJ();
        long j4 = c1387320mCoLIZJ.LIZ - jLIZIZ;
        c1387320mCoLIZJ.LIZ = j4;
        long j5 = c1387320mCoLIZJ.LIZIZ - jLIZIZ;
        c1387320mCoLIZJ.LIZIZ = j5;
        if (j2 < j5 && j4 <= j2) {
            return LIZIZ().getString(2131828585);
        }
        long jLIZIZ2 = C1387310mCn.LIZJ().LIZ - C1387310mCn.LIZIZ(6);
        if (j2 < c1387320mCoLIZJ.LIZ && jLIZIZ2 <= j2) {
            return LIZIZ().getString(2131828580, Integer.valueOf((int) ((C1387310mCn.LIZJ().LIZIZ - j2) / 86400000)));
        }
        return LIZIZ().getString(2131828579);
    }
}
