package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191730h7L {
    public final Function1<PoiReviewsApi.PoiReviewModel, Boolean> LIZ;
    public final Function0<Unit> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Function1<PoiReviewsApi.PoiReviewModel, Unit> LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191730h7L)) {
            return false;
        }
        C1191730h7L c1191730h7L = (C1191730h7L) obj;
        return Intrinsics.LJFF(this.LIZ, c1191730h7L.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1191730h7L.LIZIZ) && this.LIZJ == c1191730h7L.LIZJ && this.LIZLLL == c1191730h7L.LIZLLL && Intrinsics.LJFF(this.LJ, c1191730h7L.LJ) && this.LJFF == c1191730h7L.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Function1<PoiReviewsApi.PoiReviewModel, Unit> function1 = this.LJ;
        return ((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExpandableTextConfig(shouldUseClickOptim=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onExpandableClickExtra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resetBeforeBind=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", disableCollapseOnRepeatClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onClickWhenNotToggleable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", applyCellUxOptMutations=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1191730h7L(Function1 function1, Function0 function0, boolean z) {
        this(function1, function0, z, false, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1191730h7L(Function1<? super PoiReviewsApi.PoiReviewModel, Boolean> function1, Function0<Unit> function0, boolean z, boolean z2, Function1<? super PoiReviewsApi.PoiReviewModel, Unit> function12, boolean z3) {
        this.LIZ = function1;
        this.LIZIZ = function0;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = function12;
        this.LJFF = z3;
    }
}
