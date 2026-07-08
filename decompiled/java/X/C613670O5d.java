package X;

import X.InterfaceC613710O5h;

/* JADX INFO: renamed from: X.0O5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613670O5d<D extends InterfaceC613710O5h> {
    public final Object LIZ;
    public final C613690O5f LIZIZ;

    public C613670O5d(Object obj, C613690O5f c613690O5f) {
        this.LIZ = obj;
        this.LIZIZ = c613690O5f;
    }

    public static C613670O5d LIZ(C613670O5d c613670O5d, C189200o6 c189200o6, C613690O5f c613690O5f, int i) {
        if ((i & 1) != 0) {
            c189200o6 = C189200o6.m1boximpl(c613670O5d.LIZ);
        }
        if ((i & 2) != 0) {
            c613690O5f = c613670O5d.LIZIZ;
        }
        Object objM10unboximpl = c189200o6.m10unboximpl();
        c613670O5d.getClass();
        return new C613670O5d(objM10unboximpl, c613690O5f);
    }
}
