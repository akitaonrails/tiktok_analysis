package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VPH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPH {
    public static final C0VPH LIZ = new C0VPH();
    public static final List<InterfaceC1186810gzP> LIZIZ = Collections.singletonList(new InterfaceC1186810gzP() { // from class: X.0gzO
        @Override // X.InterfaceC1186810gzP
        public final Map LIZ() throws Throwable {
            String strLJFF = null;
            String strLIZJ = C18JG.LIZJ(null);
            if (strLIZJ != null) {
                try {
                    strLJFF = C18JG.LJFF(strLIZJ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return C2097908Jt.LIZJ(new Pair("bcm_chain", strLJFF));
        }

        @Override // X.InterfaceC1186810gzP
        public final void getName() {
        }
    });

    public static Map LIZ(String str) {
        boolean z;
        Object obj;
        String string;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Object obj2 = null;
        if (z) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObject.isNull(next)) {
                    string = null;
                } else {
                    string = JSONObjectProtectorUtils.getString(jSONObject, next);
                }
                linkedHashMap.put(next, string);
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            new AwS557S0100000_13(thM5exceptionOrNullimpl, 178).invoke();
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (Map) obj2;
    }
}
