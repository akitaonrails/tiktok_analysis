package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BE9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BE9 extends C05F1 {
    public final /* synthetic */ long LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ C1BEL LLILLL;

    @Override // X.C05F0
    public final void LIZ() {
        C1BEC c1becLIZIZ = C1BEC.LIZIZ();
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LL;
        c1becLIZIZ.getClass();
        try {
            new JSONObject().put("cost", jUptimeMillis);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1BEE.LIZ();
        C1BE4 c1be4 = C1BE8.LIZIZ().LIZLLL;
        C1BEL c1bel = this.LLILLL;
        c1be4.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("track_call_start:");
        sbLIZ.append(c1bel.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        String str = c1bel.LIZIZ;
        C1BE6 c1be6 = (C1BE6) ((ConcurrentHashMap) c1be4.LIZ).get(str);
        if (c1be6 == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("track_tracker_invalid:no tracker available for ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        C1BEN c1ben = (C1BEN) c1be6;
        boolean zLJI = MethodIDManager.LJI(137344);
        if (!(c1bel instanceof C1BEK)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("incompatible event type: ");
            sbLIZ3.append(c1bel.getClass().getName());
            C2188811AlT.LIZIZ(sbLIZ3);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!c1ben.LIZIZ.LIZ) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1BEK c1bek = (C1BEK) c1bel;
        List<String> list = c1bek.LJFF;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("http://") && !str2.startsWith("https://"))) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("not a valid http url:");
                    sbLIZ4.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    arrayList.add(str2);
                }
            }
            list.removeAll(arrayList);
            if (!list.isEmpty()) {
                c1bek.LJFF = list;
                C1BEB.LIZIZ().getClass();
                C2201451BDz.LIZLLL.LIZ();
                C1BEE.LIZ();
                if (C2201451BDz.LIZLLL.LIZIZ()) {
                    c1ben.LJFF(c1bek, false);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (c1ben.LIZIZ.LIZIZ) {
                    c1bek.LJIIIZ++;
                    c1ben.LIZJ.LIZIZ(c1bek);
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C1BE9(long j, View view, C1BEL c1bel) {
        this.LL = j;
        this.LLILLJJLI = view;
        this.LLILLL = c1bel;
    }
}
