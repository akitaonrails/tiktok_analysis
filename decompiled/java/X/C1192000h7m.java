package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192000h7m {
    public final Function0<Unit> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1192000h7m)) {
            return false;
        }
        C1192000h7m c1192000h7m = (C1192000h7m) obj;
        return Intrinsics.LJFF(this.LIZ, c1192000h7m.LIZ) && this.LIZIZ == c1192000h7m.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslateConfig(onClickExtra=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resetBeforeBind=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1192000h7m() {
        this(AFwS206S0000000_18.get$arr$(726), false);
    }

    public C1192000h7m(Function0<Unit> function0, boolean z) {
        this.LIZ = function0;
        this.LIZIZ = z;
    }
}
