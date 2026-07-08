package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C144100gp implements InterfaceC0148002o {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public C144100gp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C144100gp)) {
            return false;
        }
        C144100gp c144100gp = (C144100gp) obj;
        return this.LL == c144100gp.LL && Intrinsics.LJFF(this.LLILLJJLI, c144100gp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c144100gp.LLILLL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateControlMediaState(visible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C144100gp(int i) {
        this(false, "", "");
    }

    public C144100gp(boolean z, String str, String str2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
