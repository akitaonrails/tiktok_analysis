package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2035807yG implements IEvent {
    public final boolean LIZ = true;
    public final List<Comment> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2035807yG)) {
            return false;
        }
        C2035807yG c2035807yG = (C2035807yG) obj;
        return this.LIZ == c2035807yG.LIZ && Intrinsics.LJFF(this.LIZIZ, c2035807yG.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        List<Comment> list = this.LIZIZ;
        return iZ2 + (list == null ? 0 : list.hashCode());
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
        sbLIZ.append("CommentSecondarySyncEvent(isAddComment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", commentList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2035807yG(List list) {
        this.LIZIZ = list;
    }
}
