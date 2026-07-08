package X;

import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0rbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595010rbn implements IEvent {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final InsertStory LIZLLL;

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

    public C1595010rbn(boolean z, boolean z2, boolean z3, InsertStory insertStory, int i) {
        z3 = (i & 4) != 0 ? false : z3;
        insertStory = (i & 8) != 0 ? null : insertStory;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = insertStory;
    }
}
