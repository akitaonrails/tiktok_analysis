package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xTM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820420xTM extends AbstractC1820610xTf {
    public final String LIZ;
    public final String LIZIZ;
    public final C1820520xTW LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1820420xTM)) {
            return false;
        }
        C1820420xTM c1820420xTM = (C1820420xTM) obj;
        return Intrinsics.LJFF(this.LIZ, c1820420xTM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1820420xTM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1820420xTM.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyValue(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1820420xTM(String str, String str2, C1820520xTW c1820520xTW) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1820520xTW;
    }
}
