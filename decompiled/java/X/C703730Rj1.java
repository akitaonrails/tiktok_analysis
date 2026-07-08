package X;

/* JADX INFO: renamed from: X.0Rj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703730Rj1 {
    public InterfaceC703750Rj3 LIZ;
    public int LIZIZ;

    public C703730Rj1(InterfaceC703750Rj3 interfaceC703750Rj3, int i) {
        this.LIZ = interfaceC703750Rj3;
        this.LIZIZ = i;
    }

    public static C703730Rj1 LIZ(C703730Rj1 c703730Rj1, InterfaceC703750Rj3 interfaceC703750Rj3, int i, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC703750Rj3 = c703730Rj1.LIZ;
        }
        if ((i2 & 2) != 0) {
            i = c703730Rj1.LIZIZ;
        }
        c703730Rj1.getClass();
        return new C703730Rj1(interfaceC703750Rj3, i);
    }
}
