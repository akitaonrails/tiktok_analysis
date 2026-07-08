package X;

/* JADX INFO: renamed from: X.1DMD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DMD extends AbstractC2239611ClD {
    public final C1DMJ LJI;

    @Override // X.AbstractC2239611ClD
    public final String LIZ() {
        return this.LJI.LIZIZ().getAbsolutePath();
    }

    @Override // X.AbstractC2239611ClD
    public final String LIZIZ() {
        return this.LJI.LIZ().getAbsolutePath();
    }

    @Override // X.AbstractC2239611ClD
    public final String LIZJ() {
        String absolutePath = this.LJI.LIZJ().getAbsolutePath();
        new C0VSJ(absolutePath).mkdirs();
        return absolutePath;
    }

    public C1DMD(C1DMJ c1dmj) {
        super(c1dmj.getWorkspace().getAbsolutePath());
        this.LJI = c1dmj;
    }
}
