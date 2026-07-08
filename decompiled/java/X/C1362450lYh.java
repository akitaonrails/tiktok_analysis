package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362450lYh implements InterfaceC1361730lXX {
    public final C1363190lZt LL;
    public final int LLILLJJLI;
    public final C1362180lYG LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362450lYh)) {
            return false;
        }
        C1362450lYh c1362450lYh = (C1362450lYh) obj;
        return Intrinsics.LJFF(this.LL, c1362450lYh.LL) && this.LLILLJJLI == c1362450lYh.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1362450lYh.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBoardPowerItem(bulletinBoardContact=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1362450lYh(C1363190lZt c1363190lZt, int i, C1362180lYG c1362180lYG) {
        this.LL = c1363190lZt;
        this.LLILLJJLI = i;
        this.LLILLL = c1362180lYG;
    }
}
