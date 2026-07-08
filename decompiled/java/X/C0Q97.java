package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q97, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q97 implements InterfaceC1891350zJl {
    public final C0Q96 LL;
    public final Map<String, String> LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q97)) {
            return false;
        }
        C0Q97 c0q97 = (C0Q97) obj;
        return Intrinsics.LJFF(this.LL, c0q97.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q97.LLILLJJLI) && this.LLILLL == c0q97.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Map<String, String> map = this.LLILLJJLI;
        return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchUserFeedbackItem(searchUserFeedback=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mobParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isNeedLine=");
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

    public C0Q97(C0Q96 c0q96, Map<String, String> map, boolean z) {
        this.LL = c0q96;
        this.LLILLJJLI = map;
        this.LLILLL = z;
    }
}
