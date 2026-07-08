package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17vg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21187017vg {
    public final String LIZ;
    public final EnumC21186417va LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParamError(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", required=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", verifier=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ruleId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", bizId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LIZ() {
        if (this.LIZJ && this.LIZIZ != EnumC21186417va.SUCCESS) {
            return EnumC21187117vh.CRITICAL.getValue();
        }
        EnumC21186417va enumC21186417va = this.LIZIZ;
        return (enumC21186417va == EnumC21186417va.REDUNDANT || enumC21186417va == EnumC21186417va.SUCCESS) ? EnumC21187117vh.WARNING.getValue() : EnumC21187117vh.ERROR.getValue();
    }

    public final int hashCode() {
        return this.LIZ.hashCode() + this.LIZIZ.hashCode() + C786410Ut5.Z2(this.LIZJ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21187017vg)) {
            return false;
        }
        C21187017vg c21187017vg = (C21187017vg) obj;
        if (Intrinsics.LJFF(this.LIZ, c21187017vg.LIZ) && this.LIZIZ == c21187017vg.LIZIZ && this.LIZJ == c21187017vg.LIZJ) {
            return true;
        }
        return false;
    }

    public C21187017vg(String str, EnumC21186417va enumC21186417va, boolean z, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = enumC21186417va;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
    }
}
