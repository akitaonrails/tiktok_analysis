package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901610zaJ {
    public static final void LIZ(C2344009Gk c2344009Gk, C1901230zZh c1901230zZh) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (c1901230zZh != null) {
            str = c1901230zZh.LIZ;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            if (c1901230zZh != null) {
                str3 = c1901230zZh.LIZ;
            } else {
                str3 = null;
            }
            c2344009Gk.LJFF("sort_option_name", str3);
        }
        if (c1901230zZh != null) {
            str2 = c1901230zZh.LIZIZ;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2)) {
            if (c1901230zZh != null) {
                str4 = c1901230zZh.LIZIZ;
            }
            c2344009Gk.LJFF("notification_tab_name", str4);
        }
    }

    public static final List<String> LIZIZ(List<Integer> list, List<NoticeFilterModel> list2) {
        NoticeFilterModel next;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (list2 != null) {
                Iterator<NoticeFilterModel> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (next.filterId == iIntValue) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NoticeFilterModel noticeFilterModel = next;
                if (noticeFilterModel != null && (str = noticeFilterModel.trackingName) != null) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static final String LIZJ(int i, List<NoticeSortModel> list) {
        NoticeSortModel next;
        if (list == null) {
            return null;
        }
        Iterator<NoticeSortModel> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.sortId == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NoticeSortModel noticeSortModel = next;
        if (noticeSortModel == null) {
            return null;
        }
        return noticeSortModel.trackingName;
    }
}
