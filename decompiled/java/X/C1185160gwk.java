package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185160gwk implements InterfaceC1194450hBj {
    public final long LIZ;
    public final List<Aweme> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185160gwk)) {
            return false;
        }
        C1185160gwk c1185160gwk = (C1185160gwk) obj;
        return this.LIZ == c1185160gwk.LIZ && Intrinsics.LJFF(this.LIZIZ, c1185160gwk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1185160gwk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1185160gwk.LIZLLL) && Intrinsics.LJFF(this.LJ, c1185160gwk.LJ) && Intrinsics.LJFF(this.LJFF, c1185160gwk.LJFF);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        List<Aweme> list = this.LIZIZ;
        int iHashCode = (iY2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiShareParamsCacheData(realFavoriteCnt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isClaimed=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", initialPoiEnterFrom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", initialPoiEnterMethod=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", initialPoiFromGroupId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1194450hBj
    public final String LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1194450hBj
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1194450hBj
    public final String LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1194450hBj
    public final long LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1194450hBj
    public final String LJIILIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1194450hBj
    public final List<Aweme> getAwemeList() {
        return this.LIZIZ;
    }

    public C1185160gwk(String str, List list, String str2, String str3, long j, String str4) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
    }
}
