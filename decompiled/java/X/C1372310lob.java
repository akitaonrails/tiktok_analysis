package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0lob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372310lob implements IEvent {
    public final boolean LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public final int LJFF;
    public boolean LJI;
    public Runnable LJII;

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

    public C1372310lob(int i, int i2) {
        this(false, i, i2, 0, 0.0f, 0.0f);
    }

    public C1372310lob(float f, int i, float f2, int i2) {
        this(true, i, i2, 0, f, f2);
    }

    public C1372310lob(boolean z, int i, int i2, int i3) {
        this(z, i, i3, i2, 0.0f, 0.0f);
    }

    public C1372310lob(boolean z, int i, int i2, int i3, float f, float f2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = i2;
        this.LJFF = i3;
    }
}
