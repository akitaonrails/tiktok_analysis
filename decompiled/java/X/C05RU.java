package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.05RU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05RU {
    public static C05RV LIZ(Integer num) {
        C05RV next;
        Iterator<C05RV> it2 = C05RV.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                int enumValue = next.getEnumValue();
                if (num != null && enumValue == num.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C05RV c05rv = next;
        if (c05rv == null) {
            if (num != null && num.intValue() == 5) {
                return C05RV.PRO_CREATOR_INBOX;
            }
            return C05RV.PERSONAL_INBOX;
        }
        return c05rv;
    }
}
