package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0J7B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7B implements IEvent {
    public final boolean LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

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

    public C0J7B(boolean z, Aweme aweme, String str, String str2, Integer num, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = num;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
    }
}
