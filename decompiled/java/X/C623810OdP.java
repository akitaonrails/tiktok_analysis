package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterOption;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0OdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623810OdP {
    public static boolean LIZ(List list) {
        List<MissionFilterOption> list2;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MissionFilterConfig missionFilterConfig = (MissionFilterConfig) it2.next();
                MissionFilterOption.Companion.getClass();
                if (missionFilterConfig != null && (list2 = missionFilterConfig.options) != null) {
                    for (MissionFilterOption missionFilterOption : list2) {
                        if (missionFilterOption == null || !missionFilterOption.isChecked()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean LIZIZ(List list) {
        List<MissionFilterOption> list2;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MissionFilterConfig missionFilterConfig = (MissionFilterConfig) it2.next();
                MissionFilterOption.Companion.getClass();
                if (missionFilterConfig != null && (list2 = missionFilterConfig.options) != null) {
                    for (MissionFilterOption missionFilterOption : list2) {
                        if (missionFilterOption == null || missionFilterOption.isChecked()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
