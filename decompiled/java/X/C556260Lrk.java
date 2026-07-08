package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556260Lrk {
    public final Object LIZ;
    public final EnumC2251001D8o LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C556260Lrk)) {
            return false;
        }
        C556260Lrk c556260Lrk = (C556260Lrk) obj;
        return Intrinsics.LJFF(this.LIZ, c556260Lrk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c556260Lrk.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OuterMsg dispatchPath:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" info:");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C556260Lrk(Object obj, EnumC2251001D8o enumC2251001D8o) {
        this.LIZ = obj;
        this.LIZIZ = enumC2251001D8o;
    }
}
