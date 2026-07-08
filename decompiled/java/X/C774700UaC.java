package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0UaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774700UaC {
    public final int LIZ;
    public final int LIZIZ;
    public final int[] LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationInfo(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pos=");
        sbLIZ.append(Arrays.toString(this.LIZJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C774700UaC(int i, int i2, int[] iArr) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = iArr;
    }
}
