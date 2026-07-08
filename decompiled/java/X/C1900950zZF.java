package X;

import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900950zZF {
    public static void LIZLLL(List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LJ(((NoticeItems) it2.next()).items);
            }
        }
    }

    public static void LJ(List list) {
        EnumC624380OeK enumC624380OeK;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BaseNotice baseNotice = (BaseNotice) it2.next();
                NoticeGroupAttrs noticeGroupAttrsLJI = C1903780zdo.LJI(baseNotice.type);
                if (noticeGroupAttrsLJI != null) {
                    enumC624380OeK = noticeGroupAttrsLJI.clearOccasion;
                } else {
                    enumC624380OeK = null;
                }
                if (enumC624380OeK != EnumC624380OeK.AfterClick) {
                    baseNotice.hasRead = true;
                    GeneralTemplateNotice generalTemplateNotice = baseNotice.templateNotice;
                    if (generalTemplateNotice != null) {
                        generalTemplateNotice.hasRead = true;
                    }
                }
            }
        }
    }

    public static List LIZ(List list, BaseNotice baseNotice) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.LJFF(((BaseNotice) obj).nid, baseNotice.nid)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != list.size()) {
            return arrayList;
        }
        return list;
    }

    public static void LIZIZ(List list, BaseNotice baseNotice) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            NoticeItems noticeItems = (NoticeItems) it2.next();
            List<? extends MusNotice> list2 = noticeItems.items;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (MusNotice musNotice : list2) {
                    if (!Intrinsics.LJFF(musNotice.nid, baseNotice.nid)) {
                        arrayList.add(musNotice);
                    }
                }
                List<? extends MusNotice> list3 = noticeItems.items;
                if (list3 == null || arrayList.size() != list3.size()) {
                    noticeItems.setItems(arrayList);
                    return;
                }
            }
        }
    }

    public static List LIZJ(List list, NoticeDisableActionInfo noticeDisableActionInfo, boolean z) {
        Map<String, Integer> map;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MusNotice musNoticeLIZ = (MusNotice) it2.next();
            String str = noticeDisableActionInfo.disableKey;
            NoticeDisableInfo noticeDisableInfo = musNoticeLIZ.disableInfo;
            if (noticeDisableInfo != null && (map = noticeDisableInfo.disableDetails) != null && map.containsKey(str)) {
                musNoticeLIZ = C634610Oup.LIZ(musNoticeLIZ, noticeDisableActionInfo, z);
            }
            arrayList.add(musNoticeLIZ);
        }
        return arrayList;
    }
}
