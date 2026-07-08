package X;

/* JADX INFO: renamed from: X.0WEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820000WEs implements C0WF9 {
    public boolean LIZ;
    public boolean LIZIZ;
    public C0WEV LIZJ;
    public final C819960WEo LIZLLL;

    public C820000WEs(C819960WEo c819960WEo) {
        this.LIZLLL = c819960WEo;
    }

    @Override // X.C0WF9
    public final C0WF9 LIZ(boolean z) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZLLL.LIZJ(this.LIZJ, z ? 1 : 0, this.LIZIZ);
            return this;
        }
        throw new C820040WEw("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // X.C0WF9
    public final C0WF9 LIZJ(String str) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZLLL.LIZ(this.LIZJ, str, this.LIZIZ);
            return this;
        }
        throw new C820040WEw("Cannot encode a second value in the ValueEncoderContext");
    }
}
