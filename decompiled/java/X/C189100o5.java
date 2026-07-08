package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.00o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C189100o5 {
    public static final <T> List<T> LIZ(List<? extends T> list) {
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return C13LP.LJJJJLI(list);
    }

    public static final List<String> LIZIZ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
