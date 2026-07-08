package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0Wvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839020Wvk {
    public final int LIZ;
    public final int[] LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoDFID{dfid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetApiList=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C839020Wvk(int i, int[] iArr) {
        this.LIZ = i;
        this.LIZIZ = iArr;
    }
}
