package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642550PIf implements InterfaceC326970Crn {
    public final String LL;
    public int LLILLJJLI;
    public final Integer LLILLL;

    public C642550PIf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C642550PIf) && Intrinsics.LJFF(this.LL, ((C642550PIf) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIBotPinnedDisclaimerMessage(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC326970Crn
    public final Integer getMsgType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return this.LL;
    }

    public C642550PIf(int i) {
        this.LL = C1017903yT.LIZ();
        this.LLILLJJLI = C1919107fR.LIZ();
        this.LLILLL = -3000;
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLJJLI = i;
    }
}
