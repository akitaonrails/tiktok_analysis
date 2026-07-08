package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03JA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JA extends AbstractC339510DSr<C03J5> {
    @Override // X.AbstractC339510DSr
    public final boolean LIZ(C03J5 c03j5, C03J5 c03j52) {
        return Intrinsics.LJFF(c03j5, c03j52);
    }

    @Override // X.AbstractC339510DSr
    public final boolean LIZIZ(C03J5 c03j5, C03J5 c03j52) {
        C03J5 c03j53 = c03j5;
        C03J5 c03j54 = c03j52;
        if (c03j53.LJI == c03j54.LJI && c03j53.LJFF == c03j54.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC339510DSr
    public final Object LIZJ(C03J5 c03j5, C03J5 c03j52) {
        C03J5 c03j53 = c03j5;
        C03J5 c03j54 = c03j52;
        if (Intrinsics.LJFF(c03j53.LIZ, c03j54.LIZ) && Intrinsics.LJFF(c03j53.LIZIZ, c03j54.LIZIZ) && c03j53.LIZLLL == c03j54.LIZLLL && c03j53.LJ == c03j54.LJ) {
            return "select_diff";
        }
        return null;
    }
}
