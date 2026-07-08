package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ykn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883190Ykn extends AbstractC883300Yky {
    public final String toString() {
        return "Initial";
    }

    public final int hashCode() {
        return C883190Ykn.class.hashCode();
    }

    @Override // X.AbstractC883300Yky
    public final AbstractC883300Yky LIZ(AbstractC883060Yka abstractC883060Yka) {
        if (abstractC883060Yka instanceof C876260YZc) {
            C876260YZc c876260YZc = (C876260YZc) abstractC883060Yka;
            AbstractC877810Yc7 abstractC877810Yc7 = c876260YZc.LIZ;
            this.LIZ = abstractC877810Yc7;
            if (Intrinsics.LJFF(abstractC877810Yc7, C877820Yc8.LIZ)) {
                return new C883230Ykr();
            }
            if (abstractC877810Yc7 instanceof C877830Yc9) {
                return new C883170Ykl(((C877830Yc9) c876260YZc.LIZ).LIZ);
            }
            throw new C1954807lC();
        }
        if (!(abstractC883060Yka instanceof C0YUJ) && !(abstractC883060Yka instanceof C883310Ykz)) {
            C0I0B.LJFF.LIZJ();
            if (!C894660Z7w.LIZJ()) {
                return this;
            }
            throw new IllegalStateException("Unexpected action on this state");
        }
        return new C883230Ykr();
    }

    public final boolean equals(Object obj) {
        return obj instanceof C883190Ykn;
    }
}
