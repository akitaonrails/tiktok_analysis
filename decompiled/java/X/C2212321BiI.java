package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212321BiI {
    public final List<String> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<String> LJI;

    public final boolean LIZIZ() {
        boolean z = false;
        if (!TextUtils.isEmpty(this.LJFF) && C2212081Bhu.LIZIZ(this.LJI)) {
            Iterator<String> it2 = this.LJI.iterator();
            while (it2.hasNext()) {
                z |= !TextUtils.isEmpty(it2.next());
            }
        }
        return z;
    }

    public final boolean LIZJ() {
        if (this.LIZIZ <= 0 || this.LIZJ <= 0 || C2212081Bhu.LIZ(this.LIZ) || C2211541Bh2.LIZ(this.LIZLLL)) {
            return false;
        }
        String str = (String) ListProtector.get(this.LIZ, 0);
        if (C2211541Bh2.LIZ(str) && this.LIZ.size() >= 2) {
            str = (String) ListProtector.get(this.LIZ, 1);
            if (C2211541Bh2.LIZ(str) && this.LIZ.size() >= 3) {
                str = (String) ListProtector.get(this.LIZ, 2);
            }
        }
        return !C2211541Bh2.LIZ(str);
    }

    public static List<String> LIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("url");
                if (!C2211541Bh2.LIZ(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
        }
        return arrayList;
    }

    public C2212321BiI(List<String> list, int i, int i2, String str, String str2, List<String> list2, String str3) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = list2;
    }
}
