package X;

/* JADX INFO: renamed from: X.0ppE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526460ppE implements InterfaceC809840Vpm {
    public volatile boolean LIZ = true;
    public volatile InterfaceC809840Vpm LIZIZ;

    @Override // X.InterfaceC809840Vpm
    public final void remove() {
        this.LIZ = false;
        if (this.LIZIZ != null) {
            this.LIZIZ.remove();
        }
    }
}
