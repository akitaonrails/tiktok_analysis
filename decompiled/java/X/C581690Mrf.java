package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0Mrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581690Mrf implements IEvent {
    public final Aweme LIZ;
    public final float LIZIZ;
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

    public C581690Mrf(Aweme aweme, float f, IBaseListFragmentPanel iBaseListFragmentPanel) {
        this.LIZ = aweme;
        this.LIZIZ = f;
        this.LIZJ = iBaseListFragmentPanel;
    }
}
