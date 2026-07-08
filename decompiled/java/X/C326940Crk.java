package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326940Crk implements InterfaceC326970Crn {
    public final C326880Cre LL;
    public final Integer LLILLJJLI = -8001;
    public int LLILLL = C1919107fR.LIZ();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C326940Crk) && Intrinsics.LJFF(this.LL, ((C326940Crk) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMultiAnswerTabMessage(anchorMessage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multi_answer_tab_");
        sbLIZ.append(this.LL.LLILLL.uuid);
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

    public C326940Crk(C326880Cre c326880Cre) {
        this.LL = c326880Cre;
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILLL = i;
    }
}
