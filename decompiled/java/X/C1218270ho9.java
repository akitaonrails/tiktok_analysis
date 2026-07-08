package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ho9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218270ho9 implements InterfaceC1891350zJl {
    public final IMUser LL;
    public final AbstractC1219540hqC LLILLJJLI;
    public final AbstractC1218280hoA LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218270ho9)) {
            return false;
        }
        C1218270ho9 c1218270ho9 = (C1218270ho9) obj;
        return Intrinsics.LJFF(this.LL, c1218270ho9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218270ho9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1218270ho9.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageAdminItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", buttonStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1218270ho9)) {
            return false;
        }
        C1218270ho9 c1218270ho9 = (C1218270ho9) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL.getUid(), c1218270ho9.LL.getUid()) || !Intrinsics.LJFF(this.LLILLJJLI, c1218270ho9.LLILLJJLI) || !Intrinsics.LJFF(this.LLILLL, c1218270ho9.LLILLL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1218270ho9)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getUid(), ((C1218270ho9) interfaceC1891350zJl).LL.getUid());
    }

    public C1218270ho9(IMUser iMUser, AbstractC1219540hqC abstractC1219540hqC, AbstractC1218280hoA abstractC1218280hoA) {
        this.LL = iMUser;
        this.LLILLJJLI = abstractC1219540hqC;
        this.LLILLL = abstractC1218280hoA;
    }
}
