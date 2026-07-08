package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C895403ei implements InterfaceC1891350zJl {
    public final String LL;
    public final ExceptionUX LLILLJJLI;
    public final SaveDisplayInfo LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895403ei)) {
            return false;
        }
        C895403ei c895403ei = (C895403ei) obj;
        return Intrinsics.LJFF(this.LL, c895403ei.LL) && Intrinsics.LJFF(this.LLILLJJLI, c895403ei.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c895403ei.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        ExceptionUX exceptionUX = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        SaveDisplayInfo saveDisplayInfo = this.LLILLL;
        return iHashCode2 + (saveDisplayInfo != null ? saveDisplayInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ATMSaveNewCardItem(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", exceptionUX=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", richContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C895403ei(String str, ExceptionUX exceptionUX, SaveDisplayInfo saveDisplayInfo) {
        this.LL = str;
        this.LLILLJJLI = exceptionUX;
        this.LLILLL = saveDisplayInfo;
    }
}
