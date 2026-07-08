package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09GX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GX {
    public static TakoPosition LIZ(int i) {
        TakoPosition next;
        Iterator<TakoPosition> it2 = TakoPosition.getEntries().iterator();
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
