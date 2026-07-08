package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Vwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814070Vwb {
    public final Bundle LIZ;

    public final Bundle LJI() {
        Bundle bundle = new Bundle(this.LIZ);
        for (String str : this.LIZ.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public C814070Vwb(Bundle bundle) {
        this.LIZ = new Bundle(bundle);
    }

    public static boolean LJFF(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(String str) {
        String strLJ = LJ(str);
        if (!"1".equals(strLJ) && !Boolean.parseBoolean(strLJ)) {
            return false;
        }
        return true;
    }

    public final Integer LIZIZ(String str) {
        String strLJ = LJ(str);
        if (!TextUtils.isEmpty(strLJ)) {
            try {
                return Integer.valueOf(CastIntegerProtector.parseInt(strLJ));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public final JSONArray LIZJ(String str) {
        String strLJ = LJ(str);
        if (!TextUtils.isEmpty(strLJ)) {
            try {
                return new JSONArray(strLJ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public final String LJ(String str) {
        String strReplace;
        Bundle bundle = this.LIZ;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                strReplace = str;
            } else {
                strReplace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.LIZ.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public final String LIZLLL(Resources resources, String str, String str2) {
        int iN3;
        String[] strArr;
        String strLJ = LJ(str2);
        if (!TextUtils.isEmpty(strLJ)) {
            return strLJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("_loc_key");
        String strLJ2 = LJ(C2188811AlT.LIZIZ(sbLIZ));
        String string = null;
        if (TextUtils.isEmpty(strLJ2) || (iN3 = C786410Ut5.n3(resources, strLJ2, "string", str)) == 0) {
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append("_loc_args");
        JSONArray jSONArrayLIZJ = LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        if (jSONArrayLIZJ == null) {
            strArr = null;
        } else {
            int length = jSONArrayLIZJ.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayLIZJ.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(iN3);
        }
        try {
            string = resources.getString(iN3, strArr);
            return string;
        } catch (MissingFormatArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return string;
        }
    }
}
