package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0P5A, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P5A implements IEvent {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;

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

    public C0P5A(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? true : z3;
        z4 = (i & 8) != 0 ? false : z4;
        str = (i & 16) != 0 ? null : str;
        str2 = (i & 32) != 0 ? null : str2;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = str;
        this.LJFF = str2;
    }
}
