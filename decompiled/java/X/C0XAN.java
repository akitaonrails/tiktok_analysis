package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0XAN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XAN {
    public volatile boolean LIZ;
    public final List<C0XAR> LIZIZ = new ArrayList();
    public int LIZJ = 0;

    public final void LIZ() {
        for (C0XAR c0xar : (ArrayList) this.LIZIZ) {
            if (c0xar != null) {
                c0xar.LIZ();
            }
        }
        this.LIZJ = 0;
        this.LIZ = false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigJankPool{isUse=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bigJankInfos=");
        sbLIZ.append(Arrays.toString(((ArrayList) this.LIZIZ).toArray()));
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
