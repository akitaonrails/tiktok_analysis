package X;

import java.util.List;

/* JADX INFO: renamed from: X.0YDU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDU extends AbstractC866690XzH<C0YDW> implements C0YDW {
    @Override // X.C0YDW
    public final List<Long> LJJI() {
        C13BV c13bv = C13BV.INSTANCE;
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getAllUnAvailableConvShortIds"));
        return c0yedLIZIZ != null ? c0yedLIZIZ.LJIJI().LJI().LJJI() : c13bv;
    }

    @Override // X.C0YDW
    public final void LJJIJIL() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("prefetchConvShortIdsIfNeed"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJI().LJJIJIL();
        }
    }

    public C0YDU(C0YEF c0yef) {
        super(c0yef, "ConvPrefetchIdProxy");
    }

    @Override // X.C0YDW
    public final boolean LJIJJ(C0YMW c0ymw) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("isRecoverableFailure"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJI().LJIJJ(c0ymw);
    }

    @Override // X.AbstractC866690XzH
    public final C0YDW LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LJI();
    }
}
