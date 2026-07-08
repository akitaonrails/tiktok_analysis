package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850860XZk extends AbstractC849240XTe {
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C850860XZk)) {
            return false;
        }
        C850860XZk c850860XZk = (C850860XZk) obj;
        return Intrinsics.LJFF(this.LJI, c850860XZk.LJI) && Intrinsics.LJFF(this.LJII, c850860XZk.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c850860XZk.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((this.LJI.hashCode() * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForceResetPassObj(password=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", conditionalLoginTicket=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", ticket=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C850860XZk(String str, String str2, String str3) {
        super(13);
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = str3;
    }
}
