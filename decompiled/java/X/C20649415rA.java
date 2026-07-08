package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachSyncConfigModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.SyncOutreachEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15rA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20649415rA {
    public static long LIZIZ;
    public static final C20649415rA LIZ = new C20649415rA();
    public static final OutreachSyncConfigModel LIZJ = new OutreachSyncConfigModel(false, 2, 1, 72, null);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C20652215rc());

    public static boolean LIZ() {
        return ((OutreachSyncConfigModel) LIZLLL.getValue()).enable && C282000B3m.LIZ();
    }

    public static long LIZIZ() {
        long j = LIZIZ;
        if (j != 0) {
            return j;
        }
        int i = ((OutreachSyncConfigModel) LIZLLL.getValue()).syncHours * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT;
        C20648315qz.LIZ.getClass();
        long jLJII = C20648315qz.LJII();
        if (jLJII == 0) {
            jLJII = System.currentTimeMillis();
        }
        long j2 = jLJII - ((long) i);
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentTime: ");
        sbLIZ.append(jLJII);
        sbLIZ.append(", timwindow: ");
        sbLIZ.append(i);
        sbLIZ.append(", getSyncStartTime: ");
        sbLIZ.append(j2);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        LIZIZ = j2;
        return j2;
    }

    public static boolean LIZJ(String str, String str2) {
        List<SyncOutreachEntry> list = ((OutreachSyncConfigModel) LIZLLL.getValue()).syncOutreachKeys;
        boolean zContains = false;
        if (list == null) {
            return false;
        }
        Iterator<SyncOutreachEntry> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SyncOutreachEntry next = it2.next();
            if (Intrinsics.LJFF(next.outreachType, str2)) {
                List<String> list2 = next.outreachKeys;
                if (list2 != null) {
                    zContains = list2.contains(str);
                }
            }
        }
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInSyncList, surveyId: ");
        sbLIZ.append(str);
        sbLIZ.append(", type: ");
        sbLIZ.append(str2);
        sbLIZ.append(", result: ");
        sbLIZ.append(zContains);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        return zContains;
    }
}
