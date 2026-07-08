package X;

import java.util.List;

/* JADX INFO: renamed from: X.0RlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705290RlX {
    public final List<C705270RlV> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpStandardButtonTemplateField(buttons=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needEnterAnim=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needExitAnim=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C705290RlX(List<C705270RlV> list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
