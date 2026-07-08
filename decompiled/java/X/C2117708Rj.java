package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08Rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2117708Rj {
    public final Map<String, String> LIZ = new HashMap();

    public C2117708Rj(String str) {
    }

    public final void LIZ(Bundle bundle) {
        String string;
        Object obj;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Map<String, String> map = this.LIZ;
                try {
                    obj = bundle.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (obj == null || (string = obj.toString()) == null) {
                    string = "";
                }
                ((HashMap) map).put(str, string);
            }
        }
    }
}
