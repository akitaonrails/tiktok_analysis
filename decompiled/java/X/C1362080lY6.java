package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362080lY6 implements InterfaceC1361730lXX {
    public final C1363280la2 LL;
    public final int LLILLJJLI;
    public final C1362180lYG LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362080lY6)) {
            return false;
        }
        C1362080lY6 c1362080lY6 = (C1362080lY6) obj;
        return Intrinsics.LJFF(this.LL, c1362080lY6.LL) && this.LLILLJJLI == c1362080lY6.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1362080lY6.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteFriendsPowerItem(inviteContact=");
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
        if ((interfaceC1891350zJl instanceof C1362080lY6) && Intrinsics.LJFF(((C1362080lY6) interfaceC1891350zJl).LLILLL, this.LLILLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1362080lY6;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1362080lY6) && !Intrinsics.LJFF(((C1362080lY6) interfaceC1891350zJl).LLILLL, this.LLILLL)) {
            return "payload_ui_state";
        }
        return null;
    }

    public C1362080lY6(C1363280la2 c1363280la2, int i, C1362180lYG c1362180lYG) {
        this.LL = c1363280la2;
        this.LLILLJJLI = i;
        this.LLILLL = c1362180lYG;
    }
}
