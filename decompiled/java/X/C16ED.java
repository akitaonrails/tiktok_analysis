package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.16ED, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16ED implements IEvent {
    public final Aweme LIZ;
    public final String LIZIZ;
    public boolean LIZJ = true;

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

    public C16ED(Aweme aweme, String str) {
        this.LIZ = aweme;
        this.LIZIZ = str;
    }
}
