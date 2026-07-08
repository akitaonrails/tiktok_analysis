package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18uL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21433518uL extends AbstractC21434718uX implements InterfaceC21436718ur {
    public final C21433518uL LJFF;
    public List<C21433518uL> LJI;

    @Override // X.InterfaceC21435018ua
    public final InterfaceC21436718ur LIZJ() {
        return this;
    }

    @Override // X.InterfaceC21435018ua
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC21436718ur
    public final List<InterfaceC21436718ur> LIZ() {
        List<C21433518uL> list = this.LJI;
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockImpl{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", start=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", attributes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", parent=");
        C21433518uL c21433518uL = this.LJFF;
        sbLIZ.append(c21433518uL != null ? c21433518uL.LIZ : null);
        sbLIZ.append(", children=");
        sbLIZ.append(this.LJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC21434718uX, X.InterfaceC21435018ua
    public final Map<String, String> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC21436718ur
    public final C21433518uL parent() {
        return this.LJFF;
    }

    public final void LJFF(int i) {
        if (!isClosed()) {
            this.LIZLLL = i;
            List<C21433518uL> list = this.LJI;
            if (list != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((C21433518uL) it2.next()).LJFF(i);
                }
            }
        }
    }

    public C21433518uL(String str, int i, Map<String, String> map, C21433518uL c21433518uL) {
        super(str, i, map);
        this.LJFF = c21433518uL;
    }
}
