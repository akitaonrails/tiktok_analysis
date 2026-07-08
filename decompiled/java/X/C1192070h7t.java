package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192070h7t {
    public final Function1<View, FragmentManager> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Boolean> LJII;
    public final Function2<PoiReviewsApi.PoiReviewModel, Boolean, Unit> LJIIIIZZ;
    public final Function1<PoiReviewsApi.PoiReviewModel, Boolean> LJIIIZ;

    public C1192070h7t() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1192070h7t)) {
            return false;
        }
        C1192070h7t c1192070h7t = (C1192070h7t) obj;
        return Intrinsics.LJFF(this.LIZ, c1192070h7t.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1192070h7t.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1192070h7t.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1192070h7t.LIZLLL) && Intrinsics.LJFF(this.LJ, c1192070h7t.LJ) && Intrinsics.LJFF(this.LJFF, c1192070h7t.LJFF) && Intrinsics.LJFF(this.LJI, c1192070h7t.LJI) && Intrinsics.LJFF(this.LJII, c1192070h7t.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1192070h7t.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1192070h7t.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        Function2<PoiReviewsApi.PoiReviewModel, Boolean, Unit> function2 = this.LJIIIIZZ;
        return ((iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MenuPanelConfig(fmProvider=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canDeleteProvider=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", beforeReportPanelOpen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", afterTranslateClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", afterSeeOriginalClick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", afterReportClick=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onDeleteClick=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", forceTreatAsNonAuthor=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", customReportRouter=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", showRegularReportPredicate=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1192070h7t(Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, AFwS206S0000000_18 aFwS206S0000000_18, AFwS256S0000000_18 aFwS256S0000000_18, int i) {
        function02 = (i & 4) != 0 ? AFwS206S0000000_18.get$arr$(731) : function02;
        aFwS206S0000000_18 = (i & 128) != 0 ? AFwS206S0000000_18.get$arr$(732) : aFwS206S0000000_18;
        aFwS256S0000000_18 = (i & 512) != 0 ? AFwS256S0000000_18.get$arr$(956) : aFwS256S0000000_18;
        this.LIZ = function1;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = function04;
        this.LJFF = function05;
        this.LJI = function06;
        this.LJII = aFwS206S0000000_18;
        this.LJIIIIZZ = null;
        this.LJIIIZ = aFwS256S0000000_18;
    }
}
