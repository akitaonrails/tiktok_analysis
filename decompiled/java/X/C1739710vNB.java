package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739710vNB {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC1756180vnk LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1739710vNB)) {
            return false;
        }
        C1739710vNB c1739710vNB = (C1739710vNB) obj;
        return Intrinsics.LJFF(this.LIZ, c1739710vNB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1739710vNB.LIZIZ) && this.LIZJ == c1739710vNB.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PortableViewConfiguration(viewId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", viewData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1739710vNB(String str, String str2, EnumC1756180vnk enumC1756180vnk) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC1756180vnk;
    }
}
