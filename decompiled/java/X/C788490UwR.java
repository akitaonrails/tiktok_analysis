package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788490UwR implements Serializable {
    public static final int $stable = 0;
    public final String followStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C788490UwR) && Intrinsics.LJFF(this.followStatus, ((C788490UwR) obj).followStatus);
    }

    public int hashCode() {
        return this.followStatus.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestEventTracking(followStatus=");
        sbLIZ.append(this.followStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788490UwR(String str) {
        this.followStatus = str;
    }
}
