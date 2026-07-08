package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0563, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0563 {
    public static final LruCache<String, Integer> LIZ = new LruCache<>(500);

    public static void LIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        LIZ.put(C2188811AlT.LIZIZ(sbLIZ), Integer.valueOf(i));
    }
}
