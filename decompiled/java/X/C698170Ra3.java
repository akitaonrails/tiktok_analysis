package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ra3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698170Ra3 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C698170Ra3() {
        this(null, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C698170Ra3)) {
            return false;
        }
        C698170Ra3 c698170Ra3 = (C698170Ra3) obj;
        return Intrinsics.LJFF(this.LIZ, c698170Ra3.LIZ) && this.LIZIZ == c698170Ra3.LIZIZ && this.LIZJ == c698170Ra3.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconModel(iconToken=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconWidth=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconHeight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C698170Ra3(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
