package X;

import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.18K6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18K6 {
    public static final String LIZ(Object obj) {
        C18KJ.LIZ.getClass();
        WeakHashMap<Object, String> weakHashMap = C18KJ.LIZJ;
        String str = weakHashMap.get(obj);
        if (str == null || str.length() == 0) {
            String string = UUID.randomUUID().toString();
            weakHashMap.put(obj, string);
            return string;
        }
        return str;
    }
}
