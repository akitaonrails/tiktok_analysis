package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895910ZCr implements InterfaceC0148002o {
    public final IMUser LL;
    public final String LLILLJJLI;
    public final AbstractC895980ZCy LLILLL;
    public final AbstractC895970ZCx LLILZ;

    public C895910ZCr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895910ZCr)) {
            return false;
        }
        C895910ZCr c895910ZCr = (C895910ZCr) obj;
        return Intrinsics.LJFF(this.LL, c895910ZCr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c895910ZCr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c895910ZCr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c895910ZCr.LLILZ);
    }

    public final int hashCode() {
        IMUser iMUser = this.LL;
        return ((((((iMUser == null ? 0 : iMUser.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileItemVMState(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", businessInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", relationLabelMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", relationButtonMode=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C895910ZCr(int i) {
        this(null, "", C0ZD2.LIZ, C0ZD1.LIZ);
    }

    public C895910ZCr(IMUser iMUser, String str, AbstractC895980ZCy abstractC895980ZCy, AbstractC895970ZCx abstractC895970ZCx) {
        this.LL = iMUser;
        this.LLILLJJLI = str;
        this.LLILLL = abstractC895980ZCy;
        this.LLILZ = abstractC895970ZCx;
    }

    public static C895910ZCr LIZ(C895910ZCr c895910ZCr, IMUser iMUser, String str, AbstractC895980ZCy abstractC895980ZCy, AbstractC895970ZCx abstractC895970ZCx, int i) {
        if ((i & 1) != 0) {
            iMUser = c895910ZCr.LL;
        }
        if ((i & 2) != 0) {
            str = c895910ZCr.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC895980ZCy = c895910ZCr.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC895970ZCx = c895910ZCr.LLILZ;
        }
        c895910ZCr.getClass();
        return new C895910ZCr(iMUser, str, abstractC895980ZCy, abstractC895970ZCx);
    }
}
