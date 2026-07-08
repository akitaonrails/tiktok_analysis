package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0SXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722910SXh implements IEvent {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final IBaseListFragmentPanel LIZLLL;
    public final boolean LJ;

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

    public C722910SXh(Aweme aweme, String str, int i, IBaseListFragmentPanel iBaseListFragmentPanel, boolean z) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = iBaseListFragmentPanel;
        this.LJ = z;
    }

    public C722910SXh(Aweme aweme, String str, int i, int i2, IBaseListFragmentPanel iBaseListFragmentPanel) {
        this(aweme, str, i2, iBaseListFragmentPanel, false);
    }
}
