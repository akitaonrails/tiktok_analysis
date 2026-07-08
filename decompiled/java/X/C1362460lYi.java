package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362460lYi implements InterfaceC1361730lXX {
    public final C1363310la5 LL;
    public final int LLILLJJLI;
    public final C1362180lYG LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362460lYi)) {
            return false;
        }
        C1362460lYi c1362460lYi = (C1362460lYi) obj;
        return Intrinsics.LJFF(this.LL, c1362460lYi.LL) && this.LLILLJJLI == c1362460lYi.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1362460lYi.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareToStoryPowerItem(shareToStoryContact=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uiState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1361730lXX
    public final IMContact LJLJJI() {
        return this.LL;
    }

    @Override // X.InterfaceC1361730lXX
    public final int getPosition() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1362460lYi) && Intrinsics.LJFF(((C1362460lYi) interfaceC1891350zJl).LLILLL, this.LLILLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1362460lYi;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1362460lYi) && !Intrinsics.LJFF(((C1362460lYi) interfaceC1891350zJl).LLILLL, this.LLILLL)) {
            return "payload_ui_state";
        }
        return null;
    }

    public C1362460lYi(C1363310la5 c1363310la5, int i, C1362180lYG c1362180lYG) {
        this.LL = c1363310la5;
        this.LLILLJJLI = i;
        this.LLILLL = c1362180lYG;
    }
}
