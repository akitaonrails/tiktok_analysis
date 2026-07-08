package X;

import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08oH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2228708oH extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final EnumC1072790e1V LIZJ;
    public final Long LIZLLL;
    public final Long LJ;
    public final String LJFF = "show_suggested_accounts_pop_up";
    public final Map<String, String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2228708oH)) {
            return false;
        }
        C2228708oH c2228708oH = (C2228708oH) obj;
        return Intrinsics.LJFF(this.LIZIZ, c2228708oH.LIZIZ) && this.LIZJ == c2228708oH.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2228708oH.LIZLLL) && Intrinsics.LJFF(this.LJ, c2228708oH.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
        Long l = this.LIZLLL;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJ;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowRecPopupTracker(enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", method=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastPopupShownDuration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lastNegativeFeedbackDuration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LJI;
    }

    public C2228708oH(String str, EnumC1072790e1V enumC1072790e1V, Long l, Long l2) {
        this.LIZIZ = str;
        this.LIZJ = enumC1072790e1V;
        this.LIZLLL = l;
        this.LJ = l2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("method", enumC1072790e1V.name().toLowerCase(Locale.ENGLISH));
        c2344009Gk.LJ(l, "last_popup_shown_duration");
        c2344009Gk.LJ(l2, "last_negative_feedback_duration");
        this.LJI = c2344009Gk.LIZ;
    }
}
