package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.00FA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FA {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public List<C0MZZ> LJ;

    public C00FA() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoDirectory(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", path=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", coverPath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", photos=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00FA(Object obj) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = arrayList;
    }
}
