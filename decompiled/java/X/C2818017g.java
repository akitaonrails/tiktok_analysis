package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.017g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2818017g {
    public static final /* synthetic */ int LIZ = 0;

    public static Uri LIZ(String str, String str2, JSONObject jSONObject, HashMap map) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Uri uriBuild = UriProtector.parse(str);
        map.put("source_btm_token", str2);
        if (!uriBuild.isOpaque()) {
            try {
                Uri.Builder builderBuildUpon = uriBuild.buildUpon();
                Set setKeySet = map.keySet();
                builderBuildUpon.clearQuery();
                for (String str3 : UriProtector.getQueryParameterNames(uriBuild)) {
                    if (!setKeySet.contains(str3)) {
                        Iterator<String> it2 = UriProtector.getQueryParameters(uriBuild, str3).iterator();
                        while (it2.hasNext()) {
                            builderBuildUpon.appendQueryParameter(str3, it2.next());
                        }
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    String str5 = (String) entry.getValue();
                    str5.toString();
                    builderBuildUpon.appendQueryParameter(str4, str5);
                }
                uriBuild = builderBuildUpon.build();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (uriBuild.isHierarchical()) {
            return C2817017f.LIZ(uriBuild, "trackParams", C786410Ut5.J3(jSONObject));
        }
        return uriBuild;
    }
}
