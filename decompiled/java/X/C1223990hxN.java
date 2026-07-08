package X;

/* JADX INFO: renamed from: X.0hxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223990hxN {
    public final InterfaceC1224270hxp LIZ;

    public C1223990hxN(InterfaceC1224270hxp interfaceC1224270hxp) {
        this.LIZ = interfaceC1224270hxp;
    }

    public final void LIZ(int i, boolean z) {
        if (!this.LIZ.LJJJJI().LIZIZ().LIZ && !z && i > 0) {
            RuntimeException runtimeException = new RuntimeException("search page data list maintain error");
            if (C1223620hwm.LJFF()) {
                throw runtimeException;
            }
        }
    }
}
