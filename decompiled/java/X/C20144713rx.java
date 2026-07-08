package X;

import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.13rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20144713rx extends AbstractC1202400hOY {
    public static final C20144813ry Companion = new Object() { // from class: X.13ry
    };
    public final int LL;

    public final C20144713rx copy(int i) {
        return new C20144713rx(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20144713rx) && this.LL == ((C20144713rx) obj).LL;
    }

    public int hashCode() {
        return this.LL;
    }

    @Override // X.AbstractC1202400hOY
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataflowID(dataflowID=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getDataflowID() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20144713rx(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("0x");
        CharsKt__CharJVMKt.checkRadix(16);
        sbLIZ.append(Integer.toString(i, 16));
        super(C2188811AlT.LIZIZ(sbLIZ), "DataflowID");
        this.LL = i;
        attachCustomInfo("dataflowID", Integer.valueOf(i));
    }
}
