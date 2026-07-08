package X;

import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655430PnJ extends AbstractC655400PnG {
    public final SearchInflowMultiAdCardStruct LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C655430PnJ)) {
            return false;
        }
        C655430PnJ c655430PnJ = (C655430PnJ) obj;
        return Intrinsics.LJFF(this.LIZ, c655430PnJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c655430PnJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c655430PnJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c655430PnJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c655430PnJ.LJ);
    }

    public final int hashCode() {
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = this.LIZ;
        int iHashCode = (((((searchInflowMultiAdCardStruct == null ? 0 : searchInflowMultiAdCardStruct.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiAd(multiAdData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", docId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reqId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", feedType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", moduleKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C655430PnJ(SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct, String str, String str2, Integer num, String str3) {
        this.LIZ = searchInflowMultiAdCardStruct;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num;
        this.LJ = str3;
    }
}
