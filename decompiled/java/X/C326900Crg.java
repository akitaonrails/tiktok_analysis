package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326900Crg implements InterfaceC326970Crn {
    public final Message LLILLJJLI;
    public final Integer LL = -2000;
    public final int LLILLL = 2131828530;
    public final int LLILZ = 2131828529;
    public final int LLILZIL = C321460Ciu.LIZ();
    public int LLILZLL = C1919107fR.LIZ();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326900Crg)) {
            return false;
        }
        C326900Crg c326900Crg = (C326900Crg) obj;
        return Intrinsics.LJFF(this.LL, c326900Crg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c326900Crg.LLILLJJLI) && this.LLILLL == c326900Crg.LLILLL && this.LLILZ == c326900Crg.LLILZ;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Message message = this.LLILLJJLI;
        return ((((iHashCode + (message != null ? message.hashCode() : 0)) * 31) + this.LLILLL) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerRetryMessage(msgType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", plaintTextResourceId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", interativeTextResourceId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return String.valueOf(this.LLILZIL);
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC326970Crn
    public final Integer getMsgType() {
        return this.LL;
    }

    public C326900Crg(Message message) {
        this.LLILLJJLI = message;
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILZLL = i;
    }
}
