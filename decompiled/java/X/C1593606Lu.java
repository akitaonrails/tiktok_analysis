package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1593606Lu implements InterfaceC0148002o {
    public final IMUser LL;
    public final AnonymousClass0699 LLILLJJLI;
    public final AnonymousClass0699 LLILLL;
    public final InterfaceC910720Zo6 LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1593606Lu)) {
            return false;
        }
        C1593606Lu c1593606Lu = (C1593606Lu) obj;
        return Intrinsics.LJFF(this.LL, c1593606Lu.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1593606Lu.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1593606Lu.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1593606Lu.LLILZ);
    }

    public final int hashCode() {
        IMUser iMUser = this.LL;
        int iHashCode = (iMUser == null ? 0 : iMUser.hashCode()) * 31;
        AnonymousClass0699 anonymousClass0699 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (anonymousClass0699 == null ? 0 : anonymousClass0699.hashCode())) * 31;
        AnonymousClass0699 anonymousClass06992 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (anonymousClass06992 == null ? 0 : anonymousClass06992.hashCode())) * 31;
        InterfaceC910720Zo6 interfaceC910720Zo6 = this.LLILZ;
        return iHashCode3 + (interfaceC910720Zo6 != null ? interfaceC910720Zo6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatCommonVmState(userProfile=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", latestUserProfile=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", latestIMChatSourceUserProfile=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", unreadData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1593606Lu(IMUser iMUser, AnonymousClass0699 anonymousClass0699, AnonymousClass0699 anonymousClass06992, InterfaceC910720Zo6 interfaceC910720Zo6) {
        this.LL = iMUser;
        this.LLILLJJLI = anonymousClass0699;
        this.LLILLL = anonymousClass06992;
        this.LLILZ = interfaceC910720Zo6;
    }

    public static C1593606Lu LIZ(C1593606Lu c1593606Lu, IMUser iMUser, AnonymousClass0699 anonymousClass0699, AnonymousClass0699 anonymousClass06992, InterfaceC910720Zo6 interfaceC910720Zo6, int i) {
        if ((i & 1) != 0) {
            iMUser = c1593606Lu.LL;
        }
        if ((i & 2) != 0) {
            anonymousClass0699 = c1593606Lu.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            anonymousClass06992 = c1593606Lu.LLILLL;
        }
        if ((i & 8) != 0) {
            interfaceC910720Zo6 = c1593606Lu.LLILZ;
        }
        c1593606Lu.getClass();
        return new C1593606Lu(iMUser, anonymousClass0699, anonymousClass06992, interfaceC910720Zo6);
    }
}
