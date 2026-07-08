package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KBR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBR {
    public final boolean LIZ;
    public final EnumC1105670esX LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public C0KBR(boolean z, EnumC1105670esX enumC1105670esX, int i) {
        this(z, enumC1105670esX, i, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KBR)) {
            return false;
        }
        C0KBR c0kbr = (C0KBR) obj;
        return this.LIZ == c0kbr.LIZ && this.LIZIZ == c0kbr.LIZIZ && this.LIZJ == c0kbr.LIZJ && this.LIZLLL == c0kbr.LIZLLL && Intrinsics.LJFF(this.LJ, c0kbr.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelStateInfo(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelBusiness=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", panelId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0KBR(boolean z, EnumC1105670esX enumC1105670esX, int i, int i2) {
        this(i, 0, enumC1105670esX, "", z);
    }

    public C0KBR(int i, int i2, EnumC1105670esX enumC1105670esX, String str, boolean z) {
        this.LIZ = z;
        this.LIZIZ = enumC1105670esX;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str;
    }
}
