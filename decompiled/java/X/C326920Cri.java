package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326920Cri implements InterfaceC326970Crn {
    public final C326880Cre LL;
    public final Integer LLILLJJLI = -9000;
    public int LLILLL = C1919107fR.LIZ();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C326920Cri) && Intrinsics.LJFF(this.LL, ((C326920Cri) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageDisclaimerMessage(anchorMessage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return String.valueOf(C321460Ciu.LIZ());
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC326970Crn
    public final Integer getMsgType() {
        return this.LLILLJJLI;
    }

    public C326920Cri(C326880Cre c326880Cre) {
        this.LL = c326880Cre;
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLL = i;
    }
}
