package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1Czx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248751Czx implements IEvent {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final float LIZJ;
    public final IBaseListFragmentPanel LIZLLL;
    public final WeakReference<IBaseListFragmentPanel> LJ;
    public final long LJFF;
    public final boolean LJI;

    public C2248751Czx() {
        throw null;
    }

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

    public C2248751Czx(float f, long j, Aweme aweme, IBaseListFragmentPanel iBaseListFragmentPanel, String str, WeakReference weakReference) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = f;
        this.LIZLLL = iBaseListFragmentPanel;
        this.LJ = weakReference;
        this.LJFF = j;
        this.LJI = false;
    }
}
