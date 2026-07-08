package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0l30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342800l30 implements IEvent {
    public final int LIZ;
    public final Comment LIZIZ;

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

    public C1342800l30(Comment comment, int i) {
        this.LIZ = i;
        this.LIZIZ = comment;
    }
}
