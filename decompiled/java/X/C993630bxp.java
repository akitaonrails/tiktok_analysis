package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.audience.WatchLaterHistoryResp;

/* JADX INFO: renamed from: X.0bxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C993630bxp extends AbstractC993580bxk {
    public final WatchLaterHistoryResp.Item LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C993630bxp) && Intrinsics.LJFF(this.LL, ((C993630bxp) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamCardItem(item=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C993630bxp(WatchLaterHistoryResp.Item item) {
        this.LL = item;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Long lValueOf;
        if (interfaceC1891350zJl instanceof C993630bxp) {
            User user = ((C993630bxp) interfaceC1891350zJl).LL.anchor;
            Long lValueOf2 = null;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            User user2 = this.LL.anchor;
            if (user2 != null) {
                lValueOf2 = Long.valueOf(user2.getId());
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
