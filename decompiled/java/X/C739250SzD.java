package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0SzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739250SzD implements IEvent {
    public final int LIZ;
    public final int LIZIZ;
    public final Aweme LIZJ;
    public final String LIZLLL;

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

    public C739250SzD(int i, int i2, Aweme aweme, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = aweme;
        this.LIZLLL = str;
    }
}
