package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09FF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09FF extends AbstractC1489560ori {
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public final Map<String, Set<String>> LJIIZILJ = new HashMap();

    public final int LJI() {
        int i = this.LJIILJJIL;
        if (i > 0) {
            return i;
        }
        if (this.LJIILL < this.LJIILLIIL) {
            return new Random().nextInt(this.LJIILLIIL - this.LJIILL) + this.LJIILL;
        }
        return 0;
    }

    @Override // X.AbstractC1489560ori
    public final boolean LIZIZ(String str, long j, JSONObject jSONObject) {
        int i;
        int i2;
        LJ(jSONObject);
        String strOptString = jSONObject.optString("tag");
        int i3 = 0;
        if (!TextUtils.isEmpty(strOptString)) {
            for (String str2 : strOptString.split(";")) {
                ArrayList<Pair> arrayList = new ArrayList();
                if (C2089508Gn.LIZIZ(str2, ",", arrayList)) {
                    for (Pair pair : arrayList) {
                        Set hashSet = (Set) ((HashMap) this.LJIIZILJ).get(pair.first);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(pair.second);
                        ((HashMap) this.LJIIZILJ).put(pair.first, hashSet);
                    }
                }
            }
        }
        this.LJIILJJIL = jSONObject.optInt("delay");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("random");
        if (this.LJIILJJIL <= 0 && jSONArrayOptJSONArray != null) {
            if (jSONArrayOptJSONArray.length() != 2) {
                return false;
            }
            try {
                i2 = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray, 0);
            } catch (JSONException e) {
                e = e;
                i2 = 0;
            }
            try {
                i = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray, 1);
            } catch (JSONException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                i = 0;
            }
            if (i2 <= 0 || i <= 0 || i2 >= i) {
                return false;
            }
            i3 = i2;
        } else {
            i = 0;
        }
        this.LJIILL = i3;
        this.LJIILLIIL = i;
        Logger.debug();
        return true;
    }
}
