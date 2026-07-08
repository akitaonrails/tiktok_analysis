package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0O0S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O0S {
    public static final List<String> LIZ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (TextUtils.isDigitsOnly((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<C0VNS> LIZIZ(List<C0VNS> list) {
        ArrayList arrayList = new ArrayList();
        for (C0VNS c0vns : list) {
            if (TextUtils.isDigitsOnly(c0vns.LIZ)) {
                arrayList.add(c0vns);
            }
        }
        return arrayList;
    }
}
