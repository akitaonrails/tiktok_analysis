package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.087M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C087M {
    public static List LIZ(JSONArray jSONArray) {
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(jSONArray.length());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int iIntValue = numValueOf.intValue();
        if (iIntValue >= 0) {
            int i = 0;
            while (true) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                if (i == iIntValue) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
