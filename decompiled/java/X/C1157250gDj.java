package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157250gDj {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157250gDj)) {
            return false;
        }
        C1157250gDj c1157250gDj = (C1157250gDj) obj;
        return Intrinsics.LJFF(this.LIZ, c1157250gDj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1157250gDj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1157250gDj.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleInfo(amount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tooltip=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imgUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157250gDj() {
        this("", "", "");
    }

    public C1157250gDj(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
