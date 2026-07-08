package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850550XYf extends AbstractC849240XTe {
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C850550XYf)) {
            return false;
        }
        C850550XYf c850550XYf = (C850550XYf) obj;
        return Intrinsics.LJFF(this.LJI, c850550XYf.LJI) && Intrinsics.LJFF(this.LJII, c850550XYf.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c850550XYf.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((this.LJI.hashCode() * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmailChangeQueryObj(code=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", email=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", ticket=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C850550XYf(String str, String str2, String str3) {
        super(22);
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = str3;
    }
}
