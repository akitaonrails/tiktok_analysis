package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361600lXK implements InterfaceC1361730lXX {
    public final C1363320la6 LL;
    public final int LLILLJJLI;
    public final C1362180lYG LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361600lXK)) {
            return false;
        }
        C1361600lXK c1361600lXK = (C1361600lXK) obj;
        return Intrinsics.LJFF(this.LL, c1361600lXK.LL) && this.LLILLJJLI == c1361600lXK.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1361600lXK.LLILLL) && this.LLILZ == c1361600lXK.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FakeUpvoteIMContactPowerItem(fakeUpvoteContact=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uiState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", upvoteStatus=");
        sbLIZ.append(this.LLILZ);
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
        if (interfaceC1891350zJl instanceof C1361600lXK) {
            C1361600lXK c1361600lXK = (C1361600lXK) interfaceC1891350zJl;
            if (c1361600lXK.LLILZ == this.LLILZ && Intrinsics.LJFF(c1361600lXK.LLILLL, this.LLILLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1361600lXK;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1361600lXK)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C1361600lXK c1361600lXK = (C1361600lXK) interfaceC1891350zJl;
        if (c1361600lXK.LLILZ != this.LLILZ) {
            arrayList.add("payload_key_upvote_status");
        }
        if (!Intrinsics.LJFF(c1361600lXK.LLILLL, this.LLILLL)) {
            arrayList.add("payload_ui_state");
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    public C1361600lXK(C1363320la6 c1363320la6, int i, C1362180lYG c1362180lYG, int i2) {
        this.LL = c1363320la6;
        this.LLILLJJLI = i;
        this.LLILLL = c1362180lYG;
        this.LLILZ = i2;
    }
}
