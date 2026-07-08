package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.1D01, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D01 implements IEvent {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final IBaseListFragmentPanel LIZLLL;

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

    public C1D01(int i, Aweme aweme, IBaseListFragmentPanel iBaseListFragmentPanel, String str) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = iBaseListFragmentPanel;
    }
}
