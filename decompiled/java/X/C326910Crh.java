package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326910Crh implements InterfaceC326970Crn {
    public final Integer LL;
    public final int LLILLJJLI;
    public int LLILLL;

    public C326910Crh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C326910Crh) && Intrinsics.LJFF(this.LL, ((C326910Crh) obj).LL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoNovelChapterDividerMessage(msgType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return String.valueOf(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC326970Crn
    public final Integer getMsgType() {
        return this.LL;
    }

    public C326910Crh(int i) {
        this.LL = -5000;
        this.LLILLJJLI = C321460Ciu.LIZ();
        this.LLILLL = C1919107fR.LIZ();
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLL = i;
    }
}
