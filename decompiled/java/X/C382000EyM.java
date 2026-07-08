package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382000EyM {
    public final EnumC381980EyK LIZ;
    public final C382170Eyd LIZIZ;
    public final EnumC381960EyI LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final C382180Eye LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382000EyM)) {
            return false;
        }
        C382000EyM c382000EyM = (C382000EyM) obj;
        return this.LIZ == c382000EyM.LIZ && Intrinsics.LJFF(this.LIZIZ, c382000EyM.LIZIZ) && this.LIZJ == c382000EyM.LIZJ && Intrinsics.LJFF(this.LIZLLL, c382000EyM.LIZLLL) && Intrinsics.LJFF(this.LJ, c382000EyM.LJ) && Intrinsics.LJFF(this.LJFF, c382000EyM.LJFF) && Intrinsics.LJFF(this.LJI, c382000EyM.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C382170Eyd c382170Eyd = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (c382170Eyd == null ? 0 : c382170Eyd.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C382180Eye c382180Eye = this.LJI;
        return iHashCode3 + (c382180Eye != null ? c382180Eye.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAITaskSubmitRequest(taskType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", parentTaskInput=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", iconPath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reuseTaskId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", effectI2VParam=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382000EyM(EnumC381980EyK enumC381980EyK, C382170Eyd c382170Eyd, EnumC381960EyI enumC381960EyI, String str, String str2, String str3, C382180Eye c382180Eye, int i) {
        enumC381980EyK = (i & 1) != 0 ? EnumC381980EyK.EDITOR_PRO_AIGC_T2V : enumC381980EyK;
        str = (i & 8) != 0 ? "" : str;
        str2 = (i & 16) != 0 ? "" : str2;
        str3 = (i & 32) != 0 ? null : str3;
        c382180Eye = (i & 64) != 0 ? null : c382180Eye;
        this.LIZ = enumC381980EyK;
        this.LIZIZ = c382170Eyd;
        this.LIZJ = enumC381960EyI;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = c382180Eye;
    }
}
