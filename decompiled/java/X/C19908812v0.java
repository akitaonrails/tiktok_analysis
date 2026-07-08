package X;

/* JADX INFO: renamed from: X.12v0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19908812v0 implements InterfaceC19909112v3 {
    public final InterfaceC19909112v3[] LIZ;

    public C19908812v0(InterfaceC19909112v3... interfaceC19909112v3Arr) {
        this.LIZ = interfaceC19909112v3Arr;
    }

    @Override // X.InterfaceC19909112v3
    public final InterfaceC19909012v2 LIZ(Class cls) {
        int i = 0;
        do {
            InterfaceC19909112v3 interfaceC19909112v3 = this.LIZ[i];
            if (interfaceC19909112v3.LIZIZ(cls)) {
                return interfaceC19909112v3.LIZ(cls);
            }
            i++;
        } while (i < 2);
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // X.InterfaceC19909112v3
    public final boolean LIZIZ(Class cls) {
        int i = 0;
        while (!this.LIZ[i].LIZIZ(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }
}
