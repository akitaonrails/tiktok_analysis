package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11B9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11B9 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(271));

    public static void LIZ(JSONObject jSONObject, Function1 function1) {
        try {
            function1.invoke(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
