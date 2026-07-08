package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901960ZZy implements InterfaceC902100ZaC {
    public final String LIZ;
    public final InterfaceC902130ZaF LIZIZ;
    public final Function0<Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C901960ZZy)) {
            return false;
        }
        C901960ZZy c901960ZZy = (C901960ZZy) obj;
        return Intrinsics.LJFF(this.LIZ, c901960ZZy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c901960ZZy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c901960ZZy.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorState(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C901960ZZy(String str, InterfaceC902130ZaF interfaceC902130ZaF, Function0<Unit> function0) {
        this.LIZ = str;
        this.LIZIZ = interfaceC902130ZaF;
        this.LIZJ = function0;
    }
}
