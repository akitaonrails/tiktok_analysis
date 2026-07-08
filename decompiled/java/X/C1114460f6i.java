package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114460f6i implements ISendCommentEvent {
    public final List<EmoteModel> LIZ;
    public final ISendCommentEvent.Sender LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1114460f6i)) {
            return false;
        }
        C1114460f6i c1114460f6i = (C1114460f6i) obj;
        return Intrinsics.LJFF(this.LIZ, c1114460f6i.LIZ) && this.LIZIZ == c1114460f6i.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1114460f6i.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendEmoteEvent(emotes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sender=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", args=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1114460f6i(List<? extends EmoteModel> list, ISendCommentEvent.Sender sender, Map<String, ? extends Object> map) {
        this.LIZ = list;
        this.LIZIZ = sender;
        this.LIZJ = map;
    }
}
