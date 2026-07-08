package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C993620bxo implements InterfaceC1891350zJl {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C993620bxo)) {
            return false;
        }
        C993620bxo c993620bxo = (C993620bxo) obj;
        return Intrinsics.LJFF(this.LL, c993620bxo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c993620bxo.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICommentBannerItem(onClickHide=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onClickViewInsights=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C993620bxo(AwS132S1200000_16 awS132S1200000_16, AwS132S1200000_16 awS132S1200000_162) {
        this.LL = awS132S1200000_16;
        this.LLILLJJLI = awS132S1200000_162;
    }
}
