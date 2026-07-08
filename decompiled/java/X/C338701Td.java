package X;

import com.bytedance.android.livesdk.model.message.KaraokeQueueListMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C338701Td extends C0U0N {
    public final KaraokeQueueListMessage LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C338701Td) && Intrinsics.LJFF(this.LIZ, ((C338701Td) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KaraokeQueueListMessageAction(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C338701Td(KaraokeQueueListMessage karaokeQueueListMessage) {
        this.LIZ = karaokeQueueListMessage;
    }
}
