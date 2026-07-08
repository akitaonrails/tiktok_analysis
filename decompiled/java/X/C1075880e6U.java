package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075880e6U extends AbstractC1223210hw7 {
    public final C1261270ivV LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final String LJIIIIZZ = "related_recommend_monitor";
    public final Map<String, String> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1075880e6U)) {
            return false;
        }
        C1075880e6U c1075880e6U = (C1075880e6U) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1075880e6U.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1075880e6U.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1075880e6U.LIZLLL) && this.LJ == c1075880e6U.LJ && this.LJFF == c1075880e6U.LJFF && this.LJI == c1075880e6U.LJI && this.LJII == c1075880e6U.LJII;
    }

    public final int hashCode() {
        return (((((((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelatedRecMon(trackerConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loadTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", recCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", iterateCnt=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LJIIIZ;
    }

    public C1075880e6U(C1261270ivV c1261270ivV, String str, String str2, long j, int i, int i2, int i3) {
        this.LIZIZ = c1261270ivV;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = j;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(c1261270ivV.LIZJ());
        c2344009Gk.LJIIIIZZ("from_scene_type", str);
        c2344009Gk.LJIIIIZZ("from_user_id", str2);
        c2344009Gk.LIZLLL(j, "load_time");
        c2344009Gk.LIZJ(i, "rec_count");
        c2344009Gk.LIZJ(i2, "show_count");
        c2344009Gk.LIZJ(i - i2, "filter_show_count");
        c2344009Gk.LIZJ(i3, "iterate_cnt");
        this.LJIIIZ = c2344009Gk.LIZ;
    }
}
