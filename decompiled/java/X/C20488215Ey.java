package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.15Ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20488215Ey<R> {
    public final CopyOnWriteArrayList<InterfaceC20488315Ez<R>> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(InterfaceC20488315Ez<R> interfaceC20488315Ez) {
        this.LIZ.add(interfaceC20488315Ez);
    }

    public final Object LIZIZ(InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        for (InterfaceC20488315Ez<R> interfaceC20488315Ez : this.LIZ) {
            if (interfaceC20488315Ez.LIZIZ()) {
                return interfaceC20488315Ez.LIZ(interfaceC1364105Vn);
            }
        }
        return null;
    }
}
