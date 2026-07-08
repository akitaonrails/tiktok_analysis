package X;

import com.ss.android.ugc.aweme.feed.scatter.report.EventReportData;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308190C6f {
    public static final C01GW LIZ;
    public static final Set<String> LIZIZ;
    public static final String LIZJ;

    static {
        EventReportData eventReportData;
        List<String> list;
        Set<String> set;
        String strLJJLIIIJ;
        EventReportData eventReportData2;
        List<String> list2;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3202));
        LIZ = c01gwLIZIZ;
        if (!C0BPR.LIZ() || (eventReportData = (EventReportData) c01gwLIZIZ.getValue()) == null || (list = eventReportData.eventList) == null) {
            set = C08CX.INSTANCE;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(list);
            set = linkedHashSet;
        }
        LIZIZ = set;
        if (!C0BPR.LIZ() || (eventReportData2 = (EventReportData) c01gwLIZIZ.getValue()) == null || (list2 = eventReportData2.keyList) == null) {
            strLJJLIIIJ = null;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                int iLIZIZ = C307820C4u.LIZJ.LIZIZ(it2.next());
                if (iLIZIZ > 0 && !linkedHashSet2.contains(Integer.valueOf(iLIZIZ))) {
                    linkedHashSet2.add(Integer.valueOf(iLIZIZ));
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(linkedHashSet2, null, null, null, 0, null, null, 63);
        }
        LIZJ = strLJJLIIIJ;
    }
}
