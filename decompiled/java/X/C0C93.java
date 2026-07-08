package X;

import com.ss.android.ugc.aweme.experiment.InboxSkylightActivityDisplayConfigValue;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C93, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C93 {
    public static final C0C93 LIZ = new C0C93();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1319));
    public static final InboxSkylightActivityDisplayConfigValue LIZJ = new InboxSkylightActivityDisplayConfigValue(0, 3);

    public static final boolean LIZ(int i) {
        LIZ.getClass();
        InboxSkylightActivityDisplayConfigValue inboxSkylightActivityDisplayConfigValue = (InboxSkylightActivityDisplayConfigValue) LIZIZ.getValue();
        int i2 = inboxSkylightActivityDisplayConfigValue.display_policy;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2 && i >= inboxSkylightActivityDisplayConfigValue.show_when_content_below) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
