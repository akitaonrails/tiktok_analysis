package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1AII, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AII {
    public long LIZLLL;
    public String LIZ = "";
    public String LIZIZ = "";
    public final List<C1AIM> LIZJ = new ArrayList();
    public String LJ = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerWishesJSBData(saveType='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', entrance='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', wishItems=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateId='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("', templateName='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
