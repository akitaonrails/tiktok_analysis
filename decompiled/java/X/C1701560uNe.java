package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701560uNe implements InterfaceC0148002o {
    public final Function1<Context, String> LL;
    public final Function1<Context, String> LLILLJJLI;
    public final Function1<Context, Unit> LLILLL;

    public C1701560uNe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1701560uNe)) {
            return false;
        }
        C1701560uNe c1701560uNe = (C1701560uNe) obj;
        return Intrinsics.LJFF(this.LL, c1701560uNe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1701560uNe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1701560uNe.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PauseInteractionsBannerState(msg=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", linkText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onClickLink=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1701560uNe(int i) {
        this(AFwS268S0000000_26.get$arr$(687), AFwS268S0000000_26.get$arr$(688), AFwS268S0000000_26.get$arr$(689));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1701560uNe(Function1<? super Context, String> function1, Function1<? super Context, String> function12, Function1<? super Context, Unit> function13) {
        this.LL = function1;
        this.LLILLJJLI = function12;
        this.LLILLL = function13;
    }
}
