package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VC9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC9 {
    public static final long[] LIZLLL = {120000, 300000, 600000, 1800000, 3600000};
    public List<String> LIZ;
    public final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public volatile boolean LIZJ = true;

    public static long LIZ(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return 0L;
        }
        long[] jArr = LIZLLL;
        if (i2 >= 5) {
            return jArr[4];
        }
        return jArr[i2];
    }

    public final void LIZIZ(List list) {
        if (!C08GN.LIZIZ(list) && C08GN.LIZIZ(this.LIZ)) {
            LinkedList linkedList = new LinkedList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    URL url = new URL((String) it2.next());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(url.getHost());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("/monitor/collect/batch/");
                    linkedList.add(C2188811AlT.LIZIZ(sbLIZ2));
                } catch (MalformedURLException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LIZ = linkedList;
        }
    }
}
