package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Oup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634610Oup {
    public static final Boolean LIZIZ(BaseNotice baseNotice) {
        Map<String, Integer> map;
        Map<String, Integer> map2;
        NoticeDisableInfo noticeDisableInfo = baseNotice.disableInfo;
        if (noticeDisableInfo != null && (map = noticeDisableInfo.disableDetails) != null) {
            boolean z = false;
            if (!map.isEmpty()) {
                NoticeDisableInfo noticeDisableInfo2 = baseNotice.disableInfo;
                if (noticeDisableInfo2 != null && (map2 = noticeDisableInfo2.disableDetails) != null && map2.containsValue(1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            return null;
        }
        return null;
    }

    public static final Boolean LIZJ(BaseNotice baseNotice) {
        Integer num;
        boolean z;
        NoticeDisableInfo noticeDisableInfo = baseNotice.disableInfo;
        if (noticeDisableInfo != null && (num = noticeDisableInfo.disableType) != null) {
            if (num.intValue() == EnumC634620Ouq.FEEDBACK.ordinal()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public static final MusNotice LIZ(MusNotice musNotice, NoticeDisableActionInfo noticeDisableActionInfo, boolean z) {
        Map<String, Integer> map;
        NoticeDisableInfo noticeDisableInfo = musNotice.disableInfo;
        if (noticeDisableInfo != null && (map = noticeDisableInfo.disableDetails) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (z) {
                linkedHashMap.put(noticeDisableActionInfo.disableKey, 1);
            } else {
                Iterator it2 = linkedHashMap.keySet().iterator();
                while (it2.hasNext()) {
                    linkedHashMap.put(it2.next(), 0);
                }
            }
            MusNotice musNoticeMo291clone = musNotice.mo291clone();
            musNoticeMo291clone.disableInfo = new NoticeDisableInfo(linkedHashMap, noticeDisableInfo.turnOffDialogInfo, noticeDisableInfo.turnOnDialogInfo, noticeDisableInfo.disableType, noticeDisableInfo.feedbackDialogInfo);
            return musNoticeMo291clone;
        }
        return musNotice;
    }
}
