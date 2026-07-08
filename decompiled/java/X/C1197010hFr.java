package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0hFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197010hFr {
    public static final C1197010hFr LIZ = new C1197010hFr();
    public static final LruCache<String, String> LIZIZ = new LruCache<>(127);

    public static String LIZ(String str, String str2) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
