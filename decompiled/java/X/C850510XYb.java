package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850510XYb extends AbstractC849240XTe {
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C850510XYb)) {
            return false;
        }
        C850510XYb c850510XYb = (C850510XYb) obj;
        return Intrinsics.LJFF(this.LJI, c850510XYb.LJI) && Intrinsics.LJFF(this.LJII, c850510XYb.LJII);
    }

    public final int hashCode() {
        return (this.LJI.hashCode() * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmailBindQueryObj(email=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C850510XYb(String str, String str2) {
        super(8);
        this.LJI = str;
        this.LJII = str2;
    }
}
