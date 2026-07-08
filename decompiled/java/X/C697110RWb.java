package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0RWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697110RWb implements IEvent {
    public final PrivateUrlModel LIZ;
    public final Aweme LIZIZ;
    public final int LIZJ;

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

    public C697110RWb(int i, Aweme aweme, PrivateUrlModel privateUrlModel) {
        this.LIZ = privateUrlModel;
        this.LIZIZ = aweme;
        this.LIZJ = i;
    }
}
