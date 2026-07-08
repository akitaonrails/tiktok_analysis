package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019240cd8 {
    public static final C1019240cd8 LIZ = new C1019240cd8();
    public static final List<InterfaceC1019350cdJ> LIZIZ = new ArrayList();
    public static final List<InterfaceC1020260cem> LIZJ = new ArrayList();

    public final synchronized void LIZIZ(InterfaceC1019350cdJ interfaceC1019350cdJ) {
        if (interfaceC1019350cdJ != null) {
            List<InterfaceC1019350cdJ> list = LIZIZ;
            if (((ArrayList) list).contains(interfaceC1019350cdJ)) {
                ((ArrayList) list).remove(interfaceC1019350cdJ);
            }
        }
    }

    public final synchronized void LIZ(String str, String str2, String str3, JSONObject jSONObject) {
        List<InterfaceC1019350cdJ> list = LIZIZ;
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC1019350cdJ) it2.next()).LIZ(str, str2, str3, jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
