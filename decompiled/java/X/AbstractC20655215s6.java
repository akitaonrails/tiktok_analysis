package X;

/* JADX INFO: renamed from: X.15s6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20655215s6 {
    public C20681515wL LIZ;

    public void LIZIZ() {
    }

    public abstract String LIZJ();

    public final C20681515wL LIZ() {
        C20681515wL c20681515wL = this.LIZ;
        if (c20681515wL != null) {
            return c20681515wL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get processor null, operator: ");
        sbLIZ.append(LIZJ());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
