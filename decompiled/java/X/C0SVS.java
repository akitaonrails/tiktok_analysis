package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SVS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVS implements C07XH {
    public final C722300SUy LIZ;
    public final CharSequence LIZIZ;
    public final C0SVT LIZJ;
    public final C722300SUy LIZLLL;
    public final Function1<View, Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SVS)) {
            return false;
        }
        C0SVS c0svs = (C0SVS) obj;
        return Intrinsics.LJFF(this.LIZ, c0svs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0svs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0svs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0svs.LIZLLL) && Intrinsics.LJFF(this.LJ, c0svs.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C0SVT c0svt = this.LIZJ;
        int iHashCode2 = (iHashCode + (c0svt == null ? 0 : c0svt.hashCode())) * 31;
        C722300SUy c722300SUy = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (c722300SUy == null ? 0 : c722300SUy.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LJ;
        return iHashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerModel(headIcon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tailIcon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", actionBlock=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0SVS(C722300SUy c722300SUy, CharSequence charSequence, C0SVT c0svt, C722300SUy c722300SUy2, Function1<? super View, Unit> function1) {
        this.LIZ = c722300SUy;
        this.LIZIZ = charSequence;
        this.LIZJ = c0svt;
        this.LIZLLL = c722300SUy2;
        this.LJ = function1;
    }
}
