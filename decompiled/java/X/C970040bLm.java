package X;

/* JADX INFO: renamed from: X.0bLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970040bLm implements InterfaceC953300aum {
    public int LIZ;
    public final /* synthetic */ C969930bLb LIZIZ;

    @Override // X.InterfaceC953300aum
    public final void onCancelSuccess() {
        this.LIZIZ.notifyItemChanged(this.LIZ);
    }

    public C970040bLm(C969930bLb c969930bLb) {
        this.LIZIZ = c969930bLb;
    }
}
