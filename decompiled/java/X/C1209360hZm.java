package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0hZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209360hZm implements IEvent {
    public final boolean LIZ;
    public final Aweme LIZIZ;
    public final IBaseListFragmentPanel LIZJ;

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

    public C1209360hZm(boolean z, Aweme aweme, IBaseListFragmentPanel iBaseListFragmentPanel) {
        this.LIZ = z;
        this.LIZIZ = aweme;
        this.LIZJ = iBaseListFragmentPanel;
    }
}
