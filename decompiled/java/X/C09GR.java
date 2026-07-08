package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09GR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GR {
    public static PermissionState LIZ(int i) {
        PermissionState next;
        Iterator<PermissionState> it2 = PermissionState.getEntries().iterator();
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
