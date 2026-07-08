package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YRY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRY extends AbstractC874240YRi<C874190YRd> {
    public final String LIZ;
    public final C874220YRg LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final C0YQG LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YRY)) {
            return false;
        }
        C0YRY c0yry = (C0YRY) obj;
        return Intrinsics.LJFF(this.LIZ, c0yry.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yry.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0yry.LIZJ) && this.LIZLLL == c0yry.LIZLLL && Intrinsics.LJFF(this.LJ, c0yry.LJ) && this.LJFF == c0yry.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoUploadParameterData(creationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", callbacks=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", filePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", encryptType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", authConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", uploadScene=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC874240YRi
    public final C874220YRg LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC874240YRi
    public final String LIZIZ() {
        return this.LIZ;
    }

    public final C874190YRd LIZJ(C0YH7 c0yh7, C0YHF c0yhf) {
        return new C874190YRd(this, c0yh7, c0yhf, this.LIZIZ);
    }

    public C0YRY(String str, C874220YRg c874220YRg, String str2, int i, C0YQG c0yqg, int i2) {
        super(str, c874220YRg);
        this.LIZ = str;
        this.LIZIZ = c874220YRg;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = c0yqg;
        this.LJFF = i2;
    }
}
