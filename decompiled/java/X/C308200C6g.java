package X;

import Y.ARunnableS104S0100000_4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS190S0000000_4;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308200C6g {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1073));

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static void LIZIZ(int i, int i2) {
        int i3;
        try {
            if ((LIZ() & 16) == 16) {
                JSONObject jSONObject = new JSONObject();
                if (C1906580ziK.LJI()) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                C823050WQl.LIZJ().execute(new ARunnableS104S0100000_4(jSONObject.put("is_background", i3).put("cache_size", i).put("cache_source", i2), 21));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
