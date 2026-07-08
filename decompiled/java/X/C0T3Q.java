package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3Q implements IEvent {
    public final Comment LIZ;
    public final Aweme LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0T3Q)) {
            return false;
        }
        C0T3Q c0t3q = (C0T3Q) obj;
        return Intrinsics.LJFF(this.LIZ, c0t3q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0t3q.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Aweme aweme = this.LIZIZ;
        return iHashCode + (aweme == null ? 0 : aweme.hashCode());
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentCollectEvent(comment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T3Q(Comment comment, Aweme aweme) {
        this.LIZ = comment;
        this.LIZIZ = aweme;
    }
}
