package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516040KLq extends C09AY implements InterfaceC1631620sYq<String, String, Thread, Unit> {
    public C516040KLq() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, String str2, Thread thread) throws JSONException {
        Activity topActivity = C1931507hR.LIZ().getTopActivity();
        String simpleName = null;
        if (topActivity != null) {
            simpleName = topActivity.getClass().getSimpleName();
        }
        if (Intrinsics.LJFF(simpleName, "ProxyBillingActivity")) {
            C516050KLr.LIZ.getClass();
            Map<String, List<C0KM2>> map = C516050KLr.LIZIZ;
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    C0KM4 c0km4 = ((C0KM2) obj).LIZJ;
                    if (c0km4 == C0KM4.CREATED || c0km4 == C0KM4.IAP_STARTED) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C516000KLm.LIZ.LJ(null, ((C0KM2) it3.next()).LIZ, -1L, C0KPI.FAILED.getValue(), 1001, "", "normal_sub", "crash_callback", C2097608Jq.LJ(), new C516100KLw(0), 0, null);
                }
            }
        }
        return Unit.LIZ;
    }
}
