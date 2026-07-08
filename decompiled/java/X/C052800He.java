package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.00He, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C052800He {
    public static final boolean LIZ(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C838410Wul.LIZ(context, str)));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).intValue() != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
