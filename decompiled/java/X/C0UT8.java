package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0UT8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0UT8 extends AbstractC784890Uqd {
    @Override // X.AbstractC784890Uqd
    public final String LIZLLL(Activity activity) {
        return activity.getString(2131855114);
    }

    @Override // X.AbstractC784890Uqd
    public final String LJ(Activity activity) {
        return activity.getString(2131856086);
    }

    @Override // X.AbstractC784890Uqd
    public final String LIZJ(Activity activity, String... strArr) {
        Object[] objArr = new Object[1];
        ArrayList<Integer> arrayList = new ArrayList();
        for (String str : strArr) {
            HashMap map = (HashMap) C202002142e.LIZ;
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : arrayList) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(activity.getString(num.intValue()));
        }
        objArr[0] = sb.toString();
        return activity.getString(2131855113, objArr);
    }
}
