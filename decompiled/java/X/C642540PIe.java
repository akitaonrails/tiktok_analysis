package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642540PIe implements InterfaceC326970Crn {
    public final String LL;
    public final Integer LLILLJJLI;
    public int LLILLL;

    public C642540PIe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C642540PIe) && Intrinsics.LJFF(this.LL, ((C642540PIe) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMemoryHintMessage(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC326970Crn
    public final Integer getMsgType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return this.LL;
    }

    public C642540PIe(int i) {
        this.LL = C1017903yT.LIZ();
        this.LLILLJJLI = -8000;
        this.LLILLL = C1919107fR.LIZ();
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLL = i;
    }
}
