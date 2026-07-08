package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.utils.MapDeserializerDoubleAsIntFix;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QGS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGS {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(694));

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static JSONObject LIZ() {
        if (LIZJ()) {
            return null;
        }
        String string = LIZIZ().getString("search_intermediate_recom_reponse", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                return new JSONObject((HashMap) GsonProtectorUtils.fromJson(MapDeserializerDoubleAsIntFix.LIZ, string, MapDeserializerDoubleAsIntFix.LIZIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static boolean LIZJ() {
        long j = LIZIZ().getLong("search_intermediate_recom_reponse_time", -1L);
        return j == -1 || C278320AvW.LIZ(j);
    }
}
