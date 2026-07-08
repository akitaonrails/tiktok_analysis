package X;

/* JADX INFO: renamed from: X.0Vq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810000Vq2 {
    public static C810000Vq2 LIZIZ;
    public InterfaceC810020Vq4 LIZ;

    public C810000Vq2(InterfaceC810020Vq4 interfaceC810020Vq4) {
        this.LIZ = interfaceC810020Vq4;
    }

    public static synchronized void LIZ(InterfaceC810020Vq4 interfaceC810020Vq4) {
        if (interfaceC810020Vq4 != null) {
            C810000Vq2 c810000Vq2 = LIZIZ;
            if (c810000Vq2 == null) {
                LIZIZ = new C810000Vq2(interfaceC810020Vq4);
            } else {
                c810000Vq2.LIZ = interfaceC810020Vq4;
            }
        } else {
            throw new IllegalArgumentException("Please use MainInterfaceForPush instance initialization");
        }
    }
}
