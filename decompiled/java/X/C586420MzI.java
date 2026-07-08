package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0MzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586420MzI implements IEvent {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final float LIZJ;
    public final long LIZLLL;
    public final IBaseListFragmentPanel LJ;
    public final WeakReference<IBaseListFragmentPanel> LJFF;

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

    public C586420MzI(float f, long j, Aweme aweme, IBaseListFragmentPanel iBaseListFragmentPanel, String str, WeakReference weakReference) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = f;
        this.LIZLLL = j;
        this.LJ = iBaseListFragmentPanel;
        this.LJFF = weakReference;
    }
}
