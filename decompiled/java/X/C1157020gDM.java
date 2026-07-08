package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157020gDM implements InterfaceC1891350zJl {
    public final Board LL;
    public final long LLILLJJLI;
    public final long LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157020gDM)) {
            return false;
        }
        C1157020gDM c1157020gDM = (C1157020gDM) obj;
        return Intrinsics.LJFF(this.LL, c1157020gDM.LL) && this.LLILLJJLI == c1157020gDM.LLILLJJLI && this.LLILLL == c1157020gDM.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntelligentDecorationBoardForYouItemData(template=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", totalIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", globalContentOffsetY=");
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
        if (interfaceC1891350zJl instanceof C1157020gDM) {
            return Intrinsics.LJFF(((C1157020gDM) interfaceC1891350zJl).LL, this.LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1157020gDM(Board board, long j, long j2) {
        this.LL = board;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }
}
