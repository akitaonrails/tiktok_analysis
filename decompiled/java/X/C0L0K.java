package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0L0K, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0K {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, Function1 function1) {
        String str2;
        HashMap<String, String> mapLIZ = C2179408gK.LIZ(str, null, AFwS239S0000000_8.get$arr$(342));
        try {
            String str3 = mapLIZ.get("com.android.information");
            if (str3 != null && str3.length() != 0) {
                str2 = mapLIZ.get("com.android.information");
            } else {
                str2 = mapLIZ.get("com.apple.quicktime.information");
            }
            if (str2 != null && str2.length() != 0) {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("com.bytedance.info") && new JSONObject(jSONObject.get("com.bytedance.info").toString()).has("is_km_video")) {
                    return ((Boolean) function1.invoke(Boolean.TRUE)).booleanValue();
                }
                return ((Boolean) function1.invoke(Boolean.FALSE)).booleanValue();
            }
            return ((Boolean) function1.invoke(Boolean.FALSE)).booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return ((Boolean) function1.invoke(Boolean.FALSE)).booleanValue();
        }
    }

    public static boolean LIZIZ(Context context, String str, String str2, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        return LIZ(str, new C2386609Wu(context, str2, null, z));
    }
}
