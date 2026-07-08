package X;

/* JADX INFO: renamed from: X.0Y19, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y19 extends AbstractC866690XzH<InterfaceC866880Xza> implements InterfaceC866880Xza {
    public C0Y19(C0YEF c0yef) {
        super(c0yef, "ValidConvCheckerProxy");
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC866880Xza LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LJIJJ();
    }

    @Override // X.InterfaceC866880Xza
    public final boolean LLJZIJLIL(boolean z, String str, C869590Y9l c869590Y9l, long j) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("isValidConversation"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIJJ().LLJZIJLIL(z, str, c869590Y9l, j);
    }
}
