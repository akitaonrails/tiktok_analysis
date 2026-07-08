package X;

/* JADX INFO: renamed from: X.0YDV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDV extends AbstractC866690XzH<C0YDY> implements C0YDY {
    public C0YDV(C0YEF c0yef) {
        super(c0yef, "MsgPropertyModelProxy");
    }

    @Override // X.C0YDY
    public final C0YA1 LLJLL(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLastMessagePropertyFromDBSync"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIL().LLJLL(str);
    }

    @Override // X.AbstractC866690XzH
    public final C0YDY LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LJIIL();
    }

    @Override // X.C0YDY
    public final long LJJLIIIJLJLI(long j, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getOldestMessageIndexWithUnreadMessagePropertyFromDBSync"));
        if (c0yedLIZIZ == null) {
            return 0L;
        }
        return c0yedLIZIZ.LJIJI().LJIIL().LJJLIIIJLJLI(j, str);
    }

    @Override // X.C0YDY
    public final long LJLIL(long j, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getPropertyCountFromDBSync"));
        if (c0yedLIZIZ == null) {
            return 0L;
        }
        return c0yedLIZIZ.LJIJI().LJIIL().LJLIL(j, str);
    }
}
