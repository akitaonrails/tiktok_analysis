package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS120S1100000_6;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433690GzX implements InterfaceC1891350zJl {
    public final String LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function1<View, Unit> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C433690GzX)) {
            return false;
        }
        C433690GzX c433690GzX = (C433690GzX) obj;
        return Intrinsics.LJFF(this.LL, c433690GzX.LL) && Intrinsics.LJFF(this.LLILLJJLI, c433690GzX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c433690GzX.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAgentHintsItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", longPress=");
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

    public C433690GzX(String str, AwS165S1100000_16 awS165S1100000_16, AwS120S1100000_6 awS120S1100000_6) {
        this.LL = str;
        this.LLILLJJLI = awS165S1100000_16;
        this.LLILLL = awS120S1100000_6;
    }
}
