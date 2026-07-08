package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425340Gm4 implements InterfaceC1891350zJl {
    public final Integer LL;
    public final Integer LLILLJJLI;
    public final Function1<View, Unit> LLILLL;
    public final Function1<Function1<? super Boolean, Unit>, Unit> LLILZ;

    public C425340Gm4() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C425340Gm4)) {
            return false;
        }
        C425340Gm4 c425340Gm4 = (C425340Gm4) obj;
        return Intrinsics.LJFF(this.LL, c425340Gm4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c425340Gm4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c425340Gm4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c425340Gm4.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<Function1<? super Boolean, Unit>, Unit> function12 = this.LLILZ;
        return iHashCode3 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonActionItem(textRes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textColorRes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subscriberActionState=");
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

    /* JADX WARN: Multi-variable type inference failed */
    public C425340Gm4(Integer num, Integer num2, Function1<? super View, Unit> function1, Function1<? super Function1<? super Boolean, Unit>, Unit> function12) {
        this.LL = num;
        this.LLILLJJLI = num2;
        this.LLILLL = function1;
        this.LLILZ = function12;
    }
}
