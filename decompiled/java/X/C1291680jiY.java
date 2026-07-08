package X;

/* JADX INFO: renamed from: X.0jiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291680jiY {
    public static volatile C1291680jiY LIZIZ;
    public C1291710jib LIZ;

    public final void LIZ(String str, Exception exc) {
        InterfaceC1291720jic interfaceC1291720jic;
        C1291710jib c1291710jib = this.LIZ;
        if (c1291710jib != null && (interfaceC1291720jic = c1291710jib.LIZ) != null) {
            interfaceC1291720jic.LIZ(str, exc);
        }
        C1291710jib c1291710jib2 = this.LIZ;
        if (c1291710jib2 != null && c1291710jib2.LIZIZ) {
            throw new RuntimeException(exc);
        }
    }
}
