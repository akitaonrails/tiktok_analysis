package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.106C, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C106C {
    public final String LIZ;
    public final C1668880tWw LIZIZ;
    public final C1668880tWw LIZJ;
    public final String LIZLLL;
    public final Function2<Context, String, Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C106C)) {
            return false;
        }
        C106C c106c = (C106C) obj;
        return Intrinsics.LJFF(this.LIZ, c106c.LIZ) && Intrinsics.LJFF(this.LIZIZ, c106c.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c106c.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c106c.LIZLLL) && Intrinsics.LJFF(this.LJ, c106c.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1668880tWw c1668880tWw = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        C1668880tWw c1668880tWw2 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (c1668880tWw2 == null ? 0 : c1668880tWw2.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        Function2<Context, String, Unit> function2 = this.LJ;
        return iHashCode3 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacySettingItemModel(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconFill=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rightLabel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onclick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C106C(String str, C1668880tWw c1668880tWw, C1668880tWw c1668880tWw2, String str2, AwS642S0100000_28 awS642S0100000_28) {
        this.LIZ = str;
        this.LIZIZ = c1668880tWw;
        this.LIZJ = c1668880tWw2;
        this.LIZLLL = str2;
        this.LJ = awS642S0100000_28;
    }
}
