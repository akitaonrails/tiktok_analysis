package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157010gDL implements InterfaceC1891350zJl {
    public final Board LL;
    public final long LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157010gDL)) {
            return false;
        }
        C1157010gDL c1157010gDL = (C1157010gDL) obj;
        return Intrinsics.LJFF(this.LL, c1157010gDL.LL) && this.LLILLJJLI == c1157010gDL.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntelligentTemplateForYouDecorationItem(template=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", globalContentOffsetY=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1157010gDL) {
            return Intrinsics.LJFF(((C1157010gDL) interfaceC1891350zJl).LL, this.LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1157010gDL(Board board, long j) {
        this.LL = board;
        this.LLILLJJLI = j;
    }
}
