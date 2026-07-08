package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0OM8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OM8 {
    public static C0OM5 LIZ(Integer num) {
        C0OM5 next;
        Iterator<C0OM5> it2 = C0OM5.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                int value = next.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0OM5 c0om5 = next;
        if (c0om5 == null) {
            return C0OM5.BULLETIN_REDDOT_STYLE_NONE;
        }
        return c0om5;
    }
}
