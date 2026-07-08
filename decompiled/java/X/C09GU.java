package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.PlaySpeed;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09GU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GU {
    public static PlaySpeed LIZ(int i) {
        PlaySpeed next;
        Iterator<PlaySpeed> it2 = PlaySpeed.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
