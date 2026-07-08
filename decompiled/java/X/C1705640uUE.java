package X;

/* JADX INFO: renamed from: X.0uUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705640uUE implements InterfaceC1705650uUF {
    @Override // X.InterfaceC1705650uUF
    public final void preload() {
        InterfaceC1705630uUD interfaceC1705630uUDLIZ = C1706390uVR.LIZ();
        if (interfaceC1705630uUDLIZ != null) {
            interfaceC1705630uUDLIZ.preload();
        }
    }

    @Override // X.InterfaceC1705650uUF
    public final Object LIZIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC1705630uUD interfaceC1705630uUDLIZ = C1706390uVR.LIZ();
        if (interfaceC1705630uUDLIZ != null) {
            return interfaceC1705630uUDLIZ.LIZIZ(true, interfaceC1364105Vn);
        }
        return null;
    }

    @Override // X.InterfaceC1705650uUF
    public final Object LIZ(int i, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC1705630uUD interfaceC1705630uUDLIZ = C1706390uVR.LIZ();
        if (interfaceC1705630uUDLIZ != null) {
            return interfaceC1705630uUDLIZ.LIZ(i, str, str2, interfaceC1364105Vn);
        }
        return null;
    }
}
