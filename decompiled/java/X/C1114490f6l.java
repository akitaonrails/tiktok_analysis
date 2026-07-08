package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114490f6l {
    public final ISendCommentEvent LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1114490f6l)) {
            return false;
        }
        C1114490f6l c1114490f6l = (C1114490f6l) obj;
        return Intrinsics.LJFF(this.LIZ, c1114490f6l.LIZ) && this.LIZIZ == c1114490f6l.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendCommentResult(subject=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1114490f6l(ISendCommentEvent iSendCommentEvent, boolean z) {
        this.LIZ = iSendCommentEvent;
        this.LIZIZ = z;
    }
}
