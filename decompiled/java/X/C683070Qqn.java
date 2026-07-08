package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683070Qqn implements InterfaceC683020Qqi {
    public final Integer LIZ;
    public final String LIZIZ;
    public final EnumC683060Qqm LIZJ;

    public C683070Qqn() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C683070Qqn)) {
            return false;
        }
        C683070Qqn c683070Qqn = (C683070Qqn) obj;
        return Intrinsics.LJFF(this.LIZ, c683070Qqn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c683070Qqn.LIZIZ) && this.LIZJ == c683070Qqn.LIZJ;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tux(tuxIconIdentifier=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C683070Qqn(String str, EnumC683060Qqm enumC683060Qqm, int i) {
        str = (i & 2) != 0 ? null : str;
        enumC683060Qqm = (i & 4) != 0 ? EnumC683060Qqm.WIDTH_68 : enumC683060Qqm;
        this.LIZ = null;
        this.LIZIZ = str;
        this.LIZJ = enumC683060Qqm;
    }
}
