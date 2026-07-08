package X;

import java.util.List;

/* JADX INFO: renamed from: X.0bII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967880bII {
    public final String LIZ;
    public final List<C1283230jUv> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicLayoutContext(layoutId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uiPos=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C967880bII(String str, List<C1283230jUv> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
