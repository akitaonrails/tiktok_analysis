package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642530PId implements InterfaceC326970Crn {
    public final String LL;
    public final Integer LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C642530PId) && Intrinsics.LJFF(this.LL, ((C642530PId) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoFirstSugTitle(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return String.valueOf(this.LLILZ);
    }

    public C642530PId() {
        this(C1017903yT.LIZ());
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC326970Crn
    public final Integer getMsgType() {
        return this.LLILLJJLI;
    }

    public C642530PId(String str) {
        this.LL = str;
        this.LLILLJJLI = -4000;
        this.LLILLL = C1919107fR.LIZ();
        this.LLILZ = C321460Ciu.LIZ();
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLL = i;
    }
}
