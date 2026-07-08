package X;

/* JADX INFO: renamed from: X.11NL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NL implements C11NM {
    public final C11NK<C11NM> LIZIZ = new C11NK<>(32);

    @Override // X.C11NM
    public final void release() {
        for (C11NM c11nm : this.LIZIZ.LIZLLL) {
            if (c11nm instanceof C11NM) {
                c11nm.release();
                this.LIZIZ.LIZIZ(c11nm);
            }
        }
    }
}
