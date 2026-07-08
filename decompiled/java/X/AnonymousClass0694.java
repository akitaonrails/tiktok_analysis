package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0694, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0694 implements InterfaceC0148002o {
    public final boolean LL;
    public final IMUser LLILLJJLI;
    public final boolean LLILLL;

    public AnonymousClass0694() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0694)) {
            return false;
        }
        AnonymousClass0694 anonymousClass0694 = (AnonymousClass0694) obj;
        return this.LL == anonymousClass0694.LL && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0694.LLILLJJLI) && this.LLILLL == anonymousClass0694.LLILLL;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        IMUser iMUser = this.LLILLJJLI;
        return ((iZ2 + (iMUser == null ? 0 : iMUser.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleChatNoticeVmState(isMessageRequestUpgraded=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mafUser=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", receivedMinorProtectionNotice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ AnonymousClass0694(int i) {
        this(null, false, false);
    }

    public AnonymousClass0694(IMUser iMUser, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = iMUser;
        this.LLILLL = z2;
    }

    public static AnonymousClass0694 LIZ(AnonymousClass0694 anonymousClass0694, boolean z, IMUser iMUser, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = anonymousClass0694.LL;
        }
        if ((i & 2) != 0) {
            iMUser = anonymousClass0694.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = anonymousClass0694.LLILLL;
        }
        anonymousClass0694.getClass();
        return new AnonymousClass0694(iMUser, z, z2);
    }
}
