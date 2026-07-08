package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.155V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C155V implements IEvent {
    public final MusicModel LIZ;
    public final boolean LIZIZ;

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

    public C155V(MusicModel musicModel, boolean z) {
        this.LIZ = musicModel;
        this.LIZIZ = z;
    }
}
