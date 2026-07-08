package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546410Lbr {
    public final InterfaceC546090LbL LIZ;
    public final Source LIZIZ;
    public final CreativeInfo LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;
    public final CreativeModel LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C546410Lbr)) {
            return false;
        }
        C546410Lbr c546410Lbr = (C546410Lbr) obj;
        return Intrinsics.LJFF(this.LIZ, c546410Lbr.LIZ) && this.LIZIZ == c546410Lbr.LIZIZ && Intrinsics.LJFF(this.LIZJ, c546410Lbr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c546410Lbr.LIZLLL) && Intrinsics.LJFF(this.LJ, c546410Lbr.LJ) && Intrinsics.LJFF(this.LJFF, c546410Lbr.LJFF) && Intrinsics.LJFF(this.LJI, c546410Lbr.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CreativeModel creativeModel = this.LJFF;
        int iHashCode3 = (iHashCode2 + (creativeModel == null ? 0 : creativeModel.hashCode())) * 31;
        String str2 = this.LJI;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCDraftSaveParams(aigcBusinessKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mediaPathList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", creativeModel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", coverPath=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C546410Lbr(InterfaceC546090LbL interfaceC546090LbL, Source source, CreativeInfo creativeInfo, List<String> list, String str, CreativeModel creativeModel, String str2) {
        this.LIZ = interfaceC546090LbL;
        this.LIZIZ = source;
        this.LIZJ = creativeInfo;
        this.LIZLLL = list;
        this.LJ = str;
        this.LJFF = creativeModel;
        this.LJI = str2;
    }
}
