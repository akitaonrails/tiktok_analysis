package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0Qni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681160Qni implements IEvent {
    public final MusicModel LIZ;
    public final String LIZIZ;
    public final String LIZJ;

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

    public C681160Qni(MusicModel musicModel, String str, String str2) {
        this.LIZ = musicModel;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
