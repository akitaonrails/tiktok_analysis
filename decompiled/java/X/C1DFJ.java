package X;

/* JADX INFO: renamed from: X.1DFJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFJ implements C13WP {
    public final boolean LL;

    @Override // X.C13WP
    public final C2252701DFc getList() {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Empty{");
        sbLIZ.append(this.LL ? "Active" : "New");
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13WP
    public final boolean isActive() {
        return this.LL;
    }

    public C1DFJ(boolean z) {
        this.LL = z;
    }
}
