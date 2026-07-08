package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DMS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DMS extends C09AY implements Function0<Unit> {
    public C0DMS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19EG activity;
        List<C0DMT> list = C1582020rGq.LIZ;
        try {
            AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
            int length = abstractC1387200mCcArrLJII.length;
            int i = 0;
            while (true) {
                activity = null;
                if (i >= length) {
                    break;
                }
                AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
                if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                    Fragment fragmentLIZLLL = abstractC1387200mCc.LIZLLL();
                    if (fragmentLIZLLL != null) {
                        activity = fragmentLIZLLL.getActivity();
                    }
                } else {
                    i++;
                }
            }
            final JSONObject jSONObject = new JSONObject(C1582020rGq.LIZLLL);
            for (C0DMT c0dmt : (ArrayList) C1582020rGq.LIZ) {
                jSONObject.put(c0dmt.LIZ, c0dmt.LIZJ);
            }
            if (activity != null) {
                for (Map.Entry entry : C0DML.LIZ(activity).entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            Iterator<String> it2 = C1582020rGq.LJ.iterator();
            long jLongValue = 0;
            while (it2.hasNext()) {
                Long l = C1582020rGq.LIZLLL.get(it2.next());
                jLongValue += l != null ? l.longValue() : 0L;
            }
            jSONObject.put("total_duration", jLongValue);
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.00kR
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TabPerfMonitor@66ce.reportTabColdBoot$4");
                    try {
                        C20684815ws.LJIJ("tab_framework_perf_launch", jSONObject);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TabPerfMonitor@66ce.reportTabColdBoot$4");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
