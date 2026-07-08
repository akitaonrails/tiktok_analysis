package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2128608Vo {
    public final Function1<List<ECPreloadEventData>, Unit> LIZ;
    public final ArrayList<String> LIZIZ = new ArrayList<>();

    public C2128608Vo(AwS582S0100000_3 awS582S0100000_3) {
        this.LIZ = awS582S0100000_3;
        Iterator it2 = ((ArrayList) C2131308Wp.LJ.getValue()).iterator();
        while (it2.hasNext()) {
            String str = ((ECPreloadEventData) it2.next()).name;
            if (str != null) {
                this.LIZIZ.add(str);
            }
        }
        C052K c052k = new C052K() { // from class: X.08Vp
            @Override // X.C052K
            public final void onEvent(String str2, JSONObject jSONObject) {
                if (this.LIZ.LIZIZ.contains(str2)) {
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2128508Vn(this.LIZ, str2, jSONObject, null), 3);
                }
            }
        };
        C13048058s.LIZ.getClass();
        ArrayList<C052K> arrayList = C13048058s.LJ;
        synchronized (arrayList) {
            try {
                arrayList.add(c052k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
