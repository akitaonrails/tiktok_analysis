package X;

import com.lynx.tasm.behavior.ui.view.UIComponent;

/* JADX INFO: renamed from: X.0kQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1319120kQo {
    public final C1318570kPv LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{type='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", key='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("'}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1319120kQo(C1318570kPv c1318570kPv, String str) {
        this.LIZ = c1318570kPv;
        this.LIZIZ = str;
        this.LIZJ = c1318570kPv.getLayoutPosition();
        UIComponent uIComponent = c1318570kPv.LL.LLILLJJLI;
        if (uIComponent != null) {
            this.LIZLLL = uIComponent.LLILLJJLI;
            this.LJ = uIComponent.getSign();
        }
    }
}
