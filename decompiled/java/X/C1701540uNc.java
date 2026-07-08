package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701540uNc implements InterfaceC0148002o {
    public final Function1<Context, String> LL;
    public final Function1<Context, String> LLILLJJLI;
    public final Function1<Context, Unit> LLILLL;
    public final Function1<Context, Unit> LLILZ;
    public final Function1<Context, Unit> LLILZIL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1701540uNc() {
        Function1 function1 = null;
        this(function1, function1, function1, function1, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1701540uNc)) {
            return false;
        }
        C1701540uNc c1701540uNc = (C1701540uNc) obj;
        return Intrinsics.LJFF(this.LL, c1701540uNc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1701540uNc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1701540uNc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1701540uNc.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1701540uNc.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonAgeBannerState(msg=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", linkText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onClickLink=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClickClose=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onShow=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1701540uNc(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i) {
        AFwS268S0000000_26 aFwS268S0000000_26;
        function1 = (i & 1) != 0 ? AFwS268S0000000_26.get$arr$(682) : function1;
        function12 = (i & 2) != 0 ? AFwS268S0000000_26.get$arr$(683) : function12;
        function13 = (i & 4) != 0 ? AFwS268S0000000_26.get$arr$(684) : function13;
        function14 = (i & 8) != 0 ? AFwS268S0000000_26.get$arr$(685) : function14;
        if ((i & 16) != 0) {
            aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(686);
        } else {
            aFwS268S0000000_26 = null;
        }
        this((Function1<? super Context, String>) function1, (Function1<? super Context, String>) function12, (Function1<? super Context, Unit>) function13, (Function1<? super Context, Unit>) function14, aFwS268S0000000_26);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1701540uNc(Function1<? super Context, String> function1, Function1<? super Context, String> function12, Function1<? super Context, Unit> function13, Function1<? super Context, Unit> function14, Function1<? super Context, Unit> function15) {
        this.LL = function1;
        this.LLILLJJLI = function12;
        this.LLILLL = function13;
        this.LLILZ = function14;
        this.LLILZIL = function15;
    }
}
