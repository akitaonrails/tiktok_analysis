package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0W5R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0W5R extends C0W5G {
    @Override // X.C0W5G
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    public final List<AwemeToolFeedbackInfo> LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C0W5E.LIZ.getClass();
        List listLJ = C0W5E.LJ(jCurrentTimeMillis, "record_start");
        List listLJ2 = C0W5E.LJ(jCurrentTimeMillis, "record_error");
        List listLJ3 = C0W5E.LJ(jCurrentTimeMillis, "record_success");
        List listLJ4 = C0W5E.LJ(jCurrentTimeMillis, "camera_start");
        List listLJ5 = C0W5E.LJ(jCurrentTimeMillis, "camera_error");
        List listLJ6 = C0W5E.LJ(jCurrentTimeMillis, "camera_success");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listLJ2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new AwemeToolFeedbackECode(((C0VLB) it2.next()).LIZLLL, null));
        }
        arrayList.add(new AwemeToolFeedbackInfo("record", listLJ.size(), listLJ3.size(), 0, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = listLJ5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new AwemeToolFeedbackECode(((C0VLB) it3.next()).LIZLLL, null));
        }
        arrayList.add(new AwemeToolFeedbackInfo("camera start", listLJ4.size(), listLJ6.size(), 0, arrayList3));
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C0W5G
    public final boolean LIZ(String str) {
        switch (str.hashCode()) {
            case -2122358630:
                if (!str.equals("record_error")) {
                    return false;
                }
                return true;
            case -2109385996:
                if (!str.equals("record_start")) {
                    return false;
                }
                return true;
            case -785402647:
                if (!str.equals("camera_success")) {
                    return false;
                }
                return true;
            case -603764626:
                if (!str.equals("camera_error")) {
                    return false;
                }
                return true;
            case -590791992:
                if (!str.equals("camera_start")) {
                    return false;
                }
                return true;
            case 134640149:
                if (!str.equals("record_success")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }
}
