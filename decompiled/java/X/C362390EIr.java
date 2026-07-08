package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362390EIr {
    public final String LIZ;
    public final String LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C362390EIr)) {
            return false;
        }
        C362390EIr c362390EIr = (C362390EIr) obj;
        return Intrinsics.LJFF(this.LIZ, c362390EIr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c362390EIr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c362390EIr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c362390EIr.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITransitionGuideConfig(videoUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoCachePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClickConfirm=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onClickClose=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C362390EIr(String str, String str2, AwS406S0200000_5 awS406S0200000_5, AwS406S0200000_5 awS406S0200000_52) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = awS406S0200000_5;
        this.LIZLLL = awS406S0200000_52;
    }
}
