package X;

import com.ss.android.ugc.aweme.feed.model.search.BrandZoneCardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655420PnI extends AbstractC655400PnG {
    public final BrandZoneCardStruct LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C655420PnI)) {
            return false;
        }
        C655420PnI c655420PnI = (C655420PnI) obj;
        return Intrinsics.LJFF(this.LIZ, c655420PnI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c655420PnI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c655420PnI.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c655420PnI.LIZLLL) && Intrinsics.LJFF(this.LJ, c655420PnI.LJ);
    }

    public final int hashCode() {
        BrandZoneCardStruct brandZoneCardStruct = this.LIZ;
        int iHashCode = (((((brandZoneCardStruct == null ? 0 : brandZoneCardStruct.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrandAd(brandZoneData=");
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

    public C655420PnI(BrandZoneCardStruct brandZoneCardStruct, String str, String str2, Integer num, String str3) {
        this.LIZ = brandZoneCardStruct;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num;
        this.LJ = str3;
    }
}
