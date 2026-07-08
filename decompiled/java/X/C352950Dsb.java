package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dsb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352950Dsb {
    public final String LIZ;
    public final EnumC355990DxV LIZIZ;
    public final C352690DsB LIZJ;
    public int LIZLLL;
    public String LJ;
    public boolean LJFF;
    public final NLETrackSlot LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C352950Dsb)) {
            return false;
        }
        C352950Dsb c352950Dsb = (C352950Dsb) obj;
        return Intrinsics.LJFF(this.LIZ, c352950Dsb.LIZ) && this.LIZIZ == c352950Dsb.LIZIZ && Intrinsics.LJFF(this.LIZJ, c352950Dsb.LIZJ) && this.LIZLLL == c352950Dsb.LIZLLL && Intrinsics.LJFF(this.LJ, c352950Dsb.LJ) && this.LJFF == c352950Dsb.LJFF && Intrinsics.LJFF(this.LJI, c352950Dsb.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        C352690DsB c352690DsB = this.LIZJ;
        int iHashCode2 = (((iHashCode + (c352690DsB == null ? 0 : c352690DsB.hashCode())) * 31) + this.LIZLLL) * 31;
        String str2 = this.LJ;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayerItemData(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", layer=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", slot=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C352950Dsb(String str, EnumC355990DxV enumC355990DxV, C352690DsB c352690DsB, int i, String str2, boolean z, NLETrackSlot nLETrackSlot) {
        this.LIZ = str;
        this.LIZIZ = enumC355990DxV;
        this.LIZJ = c352690DsB;
        this.LIZLLL = i;
        this.LJ = str2;
        this.LJFF = z;
        this.LJI = nLETrackSlot;
    }
}
