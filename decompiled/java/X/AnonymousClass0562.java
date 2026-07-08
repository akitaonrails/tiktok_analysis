package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;

/* JADX INFO: renamed from: X.0562, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0562 {
    public static final LruCache<String, CommentSurprise> LIZ = new LruCache<>(10);

    public static String LIZ(Integer num, Integer num2, Long l) {
        int iIntValue;
        long jLongValue;
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iIntValue);
        sbLIZ.append('-');
        sbLIZ.append(jLongValue);
        sbLIZ.append('-');
        sbLIZ.append(iIntValue2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
