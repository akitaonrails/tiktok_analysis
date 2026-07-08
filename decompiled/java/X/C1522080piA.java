package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0piA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522080piA {
    public final List<C1522070pi9> LIZ;

    public C1522080piA(List<C1522070pi9> list) {
        this.LIZ = list;
    }

    public final C1522100piC LIZ(String str, JSONObject jSONObject) {
        Iterator<C1522070pi9> it2 = this.LIZ.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (TextUtils.equals(it2.next().LIZIZ, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            z = true;
        }
        if (!z) {
            C1522070pi9 c1522070pi9 = (C1522070pi9) ListProtector.get(this.LIZ, numValueOf.intValue());
            long jOptLong = jSONObject.optLong(str) - jSONObject.optLong(c1522070pi9.LIZ);
            if (jOptLong > 0) {
                return new C1522100piC(c1522070pi9.LIZJ, jOptLong);
            }
        }
        return null;
    }
}
