package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0On1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629770On1 implements IEvent {
    public final int LIZ;
    public final MusicModel LIZIZ;
    public String LIZJ;

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

    public C629770On1(MusicModel musicModel, int i) {
        this.LIZ = i;
        this.LIZIZ = musicModel;
    }
}
