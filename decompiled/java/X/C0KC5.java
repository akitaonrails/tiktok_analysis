package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KC5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KC5 {
    public String LIZ;
    public String LIZIZ;
    public EnumC513420KBo LIZJ;

    public C0KC5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KC5)) {
            return false;
        }
        C0KC5 c0kc5 = (C0KC5) obj;
        return Intrinsics.LJFF(this.LIZ, c0kc5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kc5.LIZIZ) && this.LIZJ == c0kc5.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackagePageStatus(pageStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", specialScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KC5(int i) {
        EnumC513420KBo enumC513420KBo = EnumC513420KBo.NOT_SPECIAL_SCENE;
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = enumC513420KBo;
    }
}
