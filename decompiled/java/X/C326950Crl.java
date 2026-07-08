package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326950Crl implements InterfaceC326970Crn {
    public final String LL;
    public final Integer LLILLJJLI = Integer.valueOf(C386801es.DEFAULT);
    public int LLILLL = C1919107fR.LIZ();
    public final int LLILZ = C321460Ciu.LIZ();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C326950Crl) && Intrinsics.LJFF(this.LL, ((C326950Crl) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoTimeMessage(createAt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return String.valueOf(this.LLILZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC326970Crn
    public final Integer getMsgType() {
        return this.LLILLJJLI;
    }

    public C326950Crl(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLL = i;
    }
}
