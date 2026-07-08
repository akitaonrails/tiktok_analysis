package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0sFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619850sFr implements IEvent {
    public final Aweme LIZ;
    public final String LIZIZ;

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

    public C1619850sFr(Aweme aweme, String str) {
        this.LIZ = aweme;
        this.LIZIZ = str;
    }
}
