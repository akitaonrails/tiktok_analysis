package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867960yi2 implements InterfaceC111300bX {
    public final AbstractC1865990yer LL;
    public final AbstractC1865640yeI LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867960yi2)) {
            return false;
        }
        C1867960yi2 c1867960yi2 = (C1867960yi2) obj;
        return Intrinsics.LJFF(this.LL, c1867960yi2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1867960yi2.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxWidgetInitModel(identity=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadMode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1867960yi2(AbstractC1865990yer abstractC1865990yer) {
        C1865630yeH c1865630yeH = C1865630yeH.LIZ;
        this.LL = abstractC1865990yer;
        this.LLILLJJLI = c1865630yeH;
    }
}
