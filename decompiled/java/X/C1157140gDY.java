package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157140gDY implements InterfaceC1891350zJl {
    public final GroupAccessCriteriaCollection LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157140gDY)) {
            return false;
        }
        C1157140gDY c1157140gDY = (C1157140gDY) obj;
        return Intrinsics.LJFF(this.LL, c1157140gDY.LL) && this.LLILLJJLI == c1157140gDY.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WhoCanJoinItem(setting=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1157140gDY)) {
            return false;
        }
        C1157140gDY c1157140gDY = (C1157140gDY) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1157140gDY.LL, this.LL) || c1157140gDY.LLILLJJLI != this.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1157140gDY)) {
            return false;
        }
        return Intrinsics.LJFF(((C1157140gDY) interfaceC1891350zJl).LL, this.LL);
    }

    public C1157140gDY(GroupAccessCriteriaCollection groupAccessCriteriaCollection, boolean z) {
        this.LL = groupAccessCriteriaCollection;
        this.LLILLJJLI = z;
    }
}
