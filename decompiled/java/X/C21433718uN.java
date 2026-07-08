package X;

import java.util.Map;

/* JADX INFO: renamed from: X.18uN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21433718uN extends AbstractC21434718uX implements InterfaceC21448418wk {
    @Override // X.InterfaceC21435018ua
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC21435018ua
    public final InterfaceC21436718ur LIZJ() {
        throw new ClassCastException("Cannot cast Inline instance to Block");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineImpl{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", start=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", attributes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21433718uN(String str, int i, Map<String, String> map) {
        super(str, i, map);
    }
}
