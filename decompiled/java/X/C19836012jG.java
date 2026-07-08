package X;

/* JADX INFO: renamed from: X.12jG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19836012jG {
    public static InterfaceC19836212jI LIZ;

    public static synchronized void LIZ(C19835712jD c19835712jD) {
        if (LIZ == null) {
            LIZ = c19835712jD;
        } else {
            throw new IllegalStateException("init() already called");
        }
    }
}
