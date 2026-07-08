package X;

/* JADX INFO: renamed from: X.08eU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2168008eU {
    public static InterfaceC2168208eW LIZ;

    public static synchronized boolean LIZIZ() {
        return LIZ != null;
    }

    public static synchronized void LIZ(C2168108eV c2168108eV) {
        if (LIZ == null) {
            LIZ = c2168108eV;
        } else {
            throw new IllegalStateException("Cannot re-initialize NativeLoader.");
        }
    }
}
