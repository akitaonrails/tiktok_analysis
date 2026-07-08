package X;

/* JADX INFO: renamed from: X.0MSK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSK implements C0MSL<C1322110kVd> {
    public C1322110kVd LL;

    @Override // X.C0MSL
    public final void LIZ() {
    }

    @Override // X.C0MSL
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C0MSL
    public final void LIZJ(boolean z) {
    }

    @Override // X.C0MSL
    public final void pause() {
    }

    @Override // X.C0MSL
    public final void resume() {
    }

    @Override // X.C0MSL
    public final void setDuration(long j) {
    }

    @Override // X.C0MSL
    public final void setDataSource(String str) {
        C1322110kVd c1322110kVd = this.LL;
        if (c1322110kVd != null) {
            c1322110kVd.setImageURI(new C0VSJ(str).toURI().toString());
        }
    }
}
