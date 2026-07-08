package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06lL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1700906lL extends AbstractC1492605sq {
    public final String LJ;

    public C1700906lL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1700906lL) && Intrinsics.LJFF(this.LJ, ((C1700906lL) obj).LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode();
    }

    @Override // X.AbstractC1492605sq
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelLoadContactEventKey(randomId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1700906lL(int i) {
        String strLIZ = C1017903yT.LIZ();
        super("aweme_im_share_panel_load_contact", strLIZ, EnumC1492905st.TEA, 4);
        this.LJ = strLIZ;
    }
}
