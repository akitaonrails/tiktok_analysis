package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00UM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00UM implements InterfaceC951240arS<Object> {
    public final C01ZA LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00UM)) {
            return false;
        }
        C00UM c00um = (C00UM) obj;
        return Intrinsics.LJFF(this.LIZ, c00um.LIZ) && this.LIZIZ == c00um.LIZIZ && Intrinsics.LJFF(this.LIZJ, c00um.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizTextHeaderTemplateRecordInfo(textHeaderRecordInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", originMediaNodeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C00UM)) {
            return false;
        }
        return Intrinsics.LJFF(obj, this);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        if ((obj instanceof C00UM) && ((C00UM) obj).LIZ.LIZLLL == this.LIZ.LIZLLL) {
            return true;
        }
        return false;
    }

    public C00UM(C01ZA c01za, int i, String str) {
        this.LIZ = c01za;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
