package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C889503dl implements InterfaceC1891350zJl {
    public final String LL;
    public final SaveDisplayInfo LLILLJJLI;
    public final ExceptionUX LLILLL;
    public final Object LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C889503dl)) {
            return false;
        }
        C889503dl c889503dl = (C889503dl) obj;
        return Intrinsics.LJFF(this.LL, c889503dl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c889503dl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c889503dl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c889503dl.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        SaveDisplayInfo saveDisplayInfo = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (saveDisplayInfo == null ? 0 : saveDisplayInfo.hashCode())) * 31;
        ExceptionUX exceptionUX = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        Object obj = this.LLILZ;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveNewCardItem(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", richContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", exceptionUX=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", update=");
        sbLIZ.append(this.LLILZ);
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

    public C889503dl(String str, SaveDisplayInfo saveDisplayInfo, ExceptionUX exceptionUX, Object obj) {
        this.LL = str;
        this.LLILLJJLI = saveDisplayInfo;
        this.LLILLL = exceptionUX;
        this.LLILZ = obj;
    }
}
