package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0YDD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDD extends AbstractC866690XzH<C0YDH> implements C0YDH {
    @Override // X.C0YDH
    public final Map<String, Object> LLLFFI() {
        Map<String, Object> mapLJ = C2097608Jq.LJ();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("generateSnapshotInfo"));
        return c0yedLIZIZ != null ? c0yedLIZIZ.LJIJI().LJII().LLLFFI() : mapLJ;
    }

    public C0YDD(C0YEF c0yef) {
        super(c0yef, "DebugToolHelperProxy");
    }

    @Override // X.AbstractC866690XzH
    public final C0YDH LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LJII();
    }
}
