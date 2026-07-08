package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ykl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883170Ykl extends AbstractC883300Yky {
    public final long LIZIZ;

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Waiting-");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("ms");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C883170Ykl(long j) {
        this.LIZIZ = j;
    }

    @Override // X.AbstractC883300Yky
    public final AbstractC883300Yky LIZ(AbstractC883060Yka abstractC883060Yka) {
        if (abstractC883060Yka instanceof C876260YZc) {
            AbstractC877810Yc7 abstractC877810Yc7 = ((C876260YZc) abstractC883060Yka).LIZ;
            this.LIZ = abstractC877810Yc7;
            if (Intrinsics.LJFF(abstractC877810Yc7, C877820Yc8.LIZ)) {
                return new C883230Ykr();
            }
            if (!(abstractC877810Yc7 instanceof C877830Yc9)) {
                throw new C1954807lC();
            }
        } else {
            if (abstractC883060Yka instanceof C0YUJ) {
                return new C883230Ykr();
            }
            if (abstractC883060Yka instanceof C883310Ykz) {
                if (((C883310Ykz) abstractC883060Yka).LIZ) {
                    return new C883230Ykr();
                }
            } else {
                C0I0B.LJFF.LIZJ();
                if (C894660Z7w.LIZJ()) {
                    throw new IllegalStateException("Unexpected action on this state");
                }
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C883170Ykl) && this.LIZIZ == ((C883170Ykl) obj).LIZIZ) {
            return true;
        }
        return false;
    }
}
