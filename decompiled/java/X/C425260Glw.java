package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Glw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425260Glw implements InterfaceC1891350zJl {
    public final Integer LL;
    public final Integer LLILLJJLI;
    public final C419910GdJ LLILLL;
    public final Function1<View, Unit> LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final Function1<Function1<? super Boolean, Unit>, Unit> LLIZ;

    public C425260Glw() {
        this(null, null, null, null, 0, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C425260Glw)) {
            return false;
        }
        C425260Glw c425260Glw = (C425260Glw) obj;
        return Intrinsics.LJFF(this.LL, c425260Glw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c425260Glw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c425260Glw.LLILLL) && Intrinsics.LJFF(this.LLILZ, c425260Glw.LLILZ) && this.LLILZIL == c425260Glw.LLILZIL && this.LLILZLL == c425260Glw.LLILZLL && Intrinsics.LJFF(this.LLIZ, c425260Glw.LLIZ);
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
        C419910GdJ c419910GdJ = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LLILZ;
        int iHashCode4 = (((((iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31;
        Function1<Function1<? super Boolean, Unit>, Unit> function12 = this.LLIZ;
        return iHashCode4 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionItem(textRes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textColorRes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", iconHeightDp=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", iconWidthDp=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", subscriberActionState=");
        sbLIZ.append(this.LLIZ);
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
    public C425260Glw(Integer num, Integer num2, C419910GdJ c419910GdJ, Function1<? super View, Unit> function1, int i, int i2, Function1<? super Function1<? super Boolean, Unit>, Unit> function12) {
        this.LL = num;
        this.LLILLJJLI = num2;
        this.LLILLL = c419910GdJ;
        this.LLILZ = function1;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = function12;
    }
}
