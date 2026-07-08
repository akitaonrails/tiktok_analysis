package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ubp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710350ubp extends AbstractC1710370ubr {
    public final C1710320ubm LLILLL;
    public final Function0<C1709570uaZ> LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1710350ubp)) {
            return false;
        }
        C1710350ubp c1710350ubp = (C1710350ubp) obj;
        return Intrinsics.LJFF(this.LLILLL, c1710350ubp.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1710350ubp.LLILZ) && this.LLILZIL == c1710350ubp.LLILZIL;
    }

    public final int hashCode() {
        return (((this.LLILLL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCDateElementPowerItem(eleVO=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", dataProvider=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", imeAction=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1710370ubr
    public final C1710320ubm LIZ() {
        return this.LLILLL;
    }

    public C1710350ubp(C1710320ubm c1710320ubm, AwS570S0100000_26 awS570S0100000_26) {
        super(c1710320ubm, awS570S0100000_26);
        this.LLILLL = c1710320ubm;
        this.LLILZ = awS570S0100000_26;
        this.LLILZIL = 5;
    }
}
