package X;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: X.15Xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20537215Xu {
    public static final int LIZ() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(7);
        if (i == 1) {
            return 7;
        }
        return i - 1;
    }
}
