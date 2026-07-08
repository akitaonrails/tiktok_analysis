package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0quj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568310quj implements IEvent {
    public final int LIZ;
    public final Aweme LIZIZ;
    public final IBaseListFragmentPanel LIZJ;
    public final Boolean LIZLLL;

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

    public C1568310quj(int i, Aweme aweme, FullFeedFragmentPanel fullFeedFragmentPanel) {
        this(i, aweme, fullFeedFragmentPanel, Boolean.FALSE);
    }

    public C1568310quj(int i, Aweme aweme, BaseListFragmentPanel baseListFragmentPanel, Boolean bool) {
        this.LIZ = i;
        this.LIZIZ = aweme;
        this.LIZJ = baseListFragmentPanel;
        this.LIZLLL = bool;
    }
}
