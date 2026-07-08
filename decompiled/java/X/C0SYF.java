package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0SYF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYF implements IEvent {
    public final boolean LIZ;
    public final Aweme LIZIZ;
    public final IBaseListFragmentPanel LIZJ;
    public final WeakReference<IBaseListFragmentPanel> LIZLLL;

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

    public C0SYF(boolean z, Aweme aweme, IBaseListFragmentPanel iBaseListFragmentPanel, WeakReference<IBaseListFragmentPanel> weakReference) {
        this.LIZ = z;
        this.LIZIZ = aweme;
        this.LIZJ = iBaseListFragmentPanel;
        this.LIZLLL = weakReference;
    }
}
