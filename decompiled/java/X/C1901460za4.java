package X;

import com.ss.android.ugc.aweme.notification.ab.UnreadReminderExitData;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0za4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901460za4 {
    public static final UnreadReminderExitData LIZ = new UnreadReminderExitData(0, 5, 21600, 3);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(828));
    public static final boolean LIZJ;

    static {
        LIZJ = LIZ().enable == 1;
    }

    public static UnreadReminderExitData LIZ() {
        return (UnreadReminderExitData) LIZIZ.getValue();
    }
}
