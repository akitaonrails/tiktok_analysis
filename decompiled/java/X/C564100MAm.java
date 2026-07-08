package X;

/* JADX INFO: renamed from: X.0MAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564100MAm {
    public final C523470Kfx LIZ = new C523470Kfx("light_record_register");
    public final C523470Kfx LIZIZ = new C523470Kfx("light_record_first_frame");
    public final C523470Kfx LIZJ = new C523470Kfx("light_record_not_executed_node");

    public final C523470Kfx LIZ(InterfaceC1408530ml1 interfaceC1408530ml1) {
        int i = C564110MAn.LIZ[interfaceC1408530ml1.LIZJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return this.LIZJ;
                }
                return this.LIZIZ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }
}
