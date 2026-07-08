package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191750h7N {
    public final Function0<Integer> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function1<PoiReviewsApi.PoiReviewModel, Integer> LIZJ;
    public final Function1<InterfaceC1191840h7W, InterfaceC665370Q7z> LIZLLL;
    public final Function0<String> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191750h7N)) {
            return false;
        }
        C1191750h7N c1191750h7N = (C1191750h7N) obj;
        return Intrinsics.LJFF(this.LIZ, c1191750h7N.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1191750h7N.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1191750h7N.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1191750h7N.LIZLLL) && Intrinsics.LJFF(this.LJ, c1191750h7N.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobConfig(isTopProvider=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mobOperationGuard=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reviewStatusProvider=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", vScopeProvider=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", expandClickEnterMethodProvider=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1191750h7N(Function0 function0, Function0 function02) {
        this(function0, function02, AFwS206S0000000_18.get$arr$(733), AFwS256S0000000_18.get$arr$(957), AFwS256S0000000_18.get$arr$(958));
    }

    public C1191750h7N(Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = function03;
    }
}
