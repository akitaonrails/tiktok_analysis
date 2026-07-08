package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2088608Ge {
    public static final /* synthetic */ int LJII = 0;
    public final int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final Set<String> LIZLLL = new HashSet();
    public final Set<String> LJ = new HashSet();
    public final Set<String> LJFF = new HashSet();
    public final Set<Pattern> LJI = new HashSet();

    public abstract boolean LIZ(Request request, Map<String, List<String>> map);

    public abstract void LIZLLL(JSONObject jSONObject);

    public AbstractC2088608Ge(int i) {
        this.LIZ = i;
        this.LIZIZ = i;
    }

    public static boolean LIZIZ(Set<?> set) {
        if (set != null && !set.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ(Request request) {
        if (this.LIZJ && !C2088708Gf.LIZJ().LIZJ.get()) {
            return false;
        }
        if (!LIZIZ(this.LIZLLL)) {
            String host = request.getHost();
            if (!TextUtils.isEmpty(host)) {
                Iterator it2 = ((HashSet) this.LIZLLL).iterator();
                while (it2.hasNext()) {
                    if (C2088908Gh.LIZIZ(host, (String) it2.next())) {
                    }
                }
            }
            return false;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            Logger.debug();
            return false;
        }
        int length = path.length();
        if (length > 1) {
            int i = length - 1;
            if (path.substring(i).equals("/")) {
                path = path.substring(0, i);
            }
        }
        if (!LIZIZ(this.LJ) && ((HashSet) this.LJ).contains(path)) {
            return true;
        }
        if (!LIZIZ(this.LJFF)) {
            Iterator it3 = ((HashSet) this.LJFF).iterator();
            while (it3.hasNext()) {
                if (path.startsWith((String) it3.next())) {
                    return true;
                }
            }
        }
        if (!LIZIZ(this.LJI)) {
            for (Pattern pattern : (HashSet) this.LJI) {
                if (pattern != null) {
                    try {
                        if (pattern.matcher(path).matches()) {
                            return true;
                        }
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return false;
    }

    public final void LJ(JSONObject jSONObject) {
        LJFF(jSONObject.optJSONArray("host_group"), this.LIZLLL);
        LJFF(jSONObject.optJSONArray("equal_group"), this.LJ);
        LJFF(jSONObject.optJSONArray("prefix_group"), this.LJFF);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pattern_group");
        Set<Pattern> set = this.LJI;
        if (jSONArrayOptJSONArray != null && set != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    String string = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            ((HashSet) set).add(PatternProtector.compile(string, 2));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
    }

    public static void LJFF(JSONArray jSONArray, Set set) {
        if (jSONArray != null && set != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                    if (!TextUtils.isEmpty(string)) {
                        ((HashSet) set).add(string);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
    }
}
