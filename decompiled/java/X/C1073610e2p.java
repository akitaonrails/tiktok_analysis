package X;

import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073610e2p extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final long LIZJ;
    public final EnumC1073720e30 LIZLLL;
    public final EnumC1072790e1V LJ;
    public final Integer LJFF;
    public final String LJI;
    public final Map<String, String> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1073610e2p)) {
            return false;
        }
        C1073610e2p c1073610e2p = (C1073610e2p) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1073610e2p.LIZIZ) && this.LIZJ == c1073610e2p.LIZJ && this.LIZLLL == c1073610e2p.LIZLLL && this.LJ == c1073610e2p.LJ && Intrinsics.LJFF(this.LJFF, c1073610e2p.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31;
        EnumC1072790e1V enumC1072790e1V = this.LJ;
        int iHashCode2 = (iHashCode + (enumC1072790e1V == null ? 0 : enumC1072790e1V.hashCode())) * 31;
        Integer num = this.LJFF;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloseRecPopupTracker(enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clickMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", method=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isNegativeFeedback=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LJII;
    }

    public C1073610e2p(String str, long j, EnumC1073720e30 enumC1073720e30, EnumC1072790e1V enumC1072790e1V, Integer num, int i) {
        String strName;
        j = (i & 2) != 0 ? 0L : j;
        enumC1073720e30 = (i & 4) != 0 ? EnumC1073720e30.BUTTON : enumC1073720e30;
        String lowerCase = null;
        enumC1072790e1V = (i & 8) != 0 ? null : enumC1072790e1V;
        num = (i & 16) != 0 ? null : num;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = enumC1073720e30;
        this.LJ = enumC1072790e1V;
        this.LJFF = num;
        this.LJI = "close_suggested_accounts_pop_up";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String strName2 = enumC1073720e30.name();
        Locale locale = Locale.ENGLISH;
        c2344009Gk.LJIIIIZZ("click_method", strName2.toLowerCase(locale));
        if (enumC1072790e1V != null && (strName = enumC1072790e1V.name()) != null) {
            lowerCase = strName.toLowerCase(locale);
        }
        c2344009Gk.LJIIIIZZ("method", lowerCase);
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJ(num, "is_negative_feedback");
        this.LJII = c2344009Gk.LIZ;
    }
}
