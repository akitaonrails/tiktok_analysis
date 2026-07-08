package X;

import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xLT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815530xLT implements InterfaceC111300bX {
    public final BoardItem LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1815530xLT)) {
            return false;
        }
        C1815530xLT c1815530xLT = (C1815530xLT) obj;
        return Intrinsics.LJFF(this.LL, c1815530xLT.LL) && this.LLILLJJLI == c1815530xLT.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1815530xLT.LLILLL);
    }

    public final int hashCode() {
        BoardItem boardItem = this.LL;
        return ((((boardItem == null ? 0 : boardItem.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardSceneryHierarchyData(boardItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", boardType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1815530xLT(BoardItem boardItem, int i, String str) {
        this.LL = boardItem;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }
}
