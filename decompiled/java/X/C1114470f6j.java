package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114470f6j implements ISendCommentEvent {
    public final String LIZ;
    public final ISendCommentEvent.Sender LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1114470f6j)) {
            return false;
        }
        C1114470f6j c1114470f6j = (C1114470f6j) obj;
        return Intrinsics.LJFF(this.LIZ, c1114470f6j.LIZ) && this.LIZIZ == c1114470f6j.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1114470f6j.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendBarrageEvent(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sender=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", args=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1114470f6j(String str, ISendCommentEvent.Sender sender, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = sender;
        this.LIZJ = map;
    }
}
