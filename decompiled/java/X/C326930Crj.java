package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326930Crj implements InterfaceC326970Crn {
    public final String LL;
    public final Integer LLILLJJLI;
    public int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C326930Crj) && Intrinsics.LJFF(this.LL, ((C326930Crj) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoShareTitleMessage(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C326930Crj() {
        this("");
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

    public C326930Crj(String str) {
        this.LL = str;
        this.LLILLJJLI = -10000;
        this.LLILLL = C1919107fR.LIZ();
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLL = i;
    }
}
