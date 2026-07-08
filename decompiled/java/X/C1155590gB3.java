package X;

import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.replay.NotificationBarInfo;

/* JADX INFO: renamed from: X.0gB3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155590gB3 implements InterfaceC0148002o {
    public final NotificationBarInfo LL;

    public C1155590gB3() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155590gB3) && Intrinsics.LJFF(this.LL, ((C1155590gB3) obj).LL);
    }

    public final int hashCode() {
        NotificationBarInfo notificationBarInfo = this.LL;
        if (notificationBarInfo == null) {
            return 0;
        }
        return notificationBarInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationBarVMState(notificationBar=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155590gB3(NotificationBarInfo notificationBarInfo) {
        this.LL = notificationBarInfo;
    }
}
