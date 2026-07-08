package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ccl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317650Ccl implements InterfaceC1891350zJl {
    public final UserInvitee LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InvitableItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", inserted=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL.getUid().hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C317650Ccl c317650Ccl;
        if ((interfaceC1891350zJl instanceof C317650Ccl) && (c317650Ccl = (C317650Ccl) interfaceC1891350zJl) != null) {
            return Intrinsics.LJFF(c317650Ccl.LL, this.LL);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C317650Ccl c317650Ccl;
        if ((interfaceC1891350zJl instanceof C317650Ccl) && (c317650Ccl = (C317650Ccl) interfaceC1891350zJl) != null) {
            return Intrinsics.LJFF(this.LL.getUid(), c317650Ccl.LL.getUid());
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C317650Ccl)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getUid(), ((C317650Ccl) obj).LL.getUid());
    }

    public C317650Ccl(UserInvitee userInvitee, boolean z, String str) {
        this.LL = userInvitee;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }
}
