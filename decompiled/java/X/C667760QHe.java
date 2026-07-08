package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667760QHe implements InterfaceC663970Q2p {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<SearchIntermediateAwemeInfo> LJI;

    public C667760QHe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C667760QHe)) {
            return false;
        }
        C667760QHe c667760QHe = (C667760QHe) obj;
        return this.LIZ == c667760QHe.LIZ && this.LIZIZ == c667760QHe.LIZIZ && this.LIZJ == c667760QHe.LIZJ && this.LIZLLL == c667760QHe.LIZLLL && Intrinsics.LJFF(this.LJ, c667760QHe.LJ) && Intrinsics.LJFF(this.LJFF, c667760QHe.LJFF) && Intrinsics.LJFF(this.LJI, c667760QHe.LJI);
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchIntermediateSuggestState(isLocked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFirstIntermediate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", appLaunchTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", blankPageEnterForm=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", blankPageEnterMethod=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", feedAwemeInfos=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C667760QHe(int i) {
        this(false, true, 0L, 0L, "", "", new ArrayList());
    }

    public C667760QHe(boolean z, boolean z2, long j, long j2, String str, String str2, List<SearchIntermediateAwemeInfo> list) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = list;
    }

    public static C667760QHe LIZ(C667760QHe c667760QHe, boolean z, boolean z2, long j, long j2, String str, String str2, List list, int i) {
        List list2 = list;
        String str3 = str2;
        long j3 = j2;
        long j4 = j;
        String str4 = str;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = c667760QHe.LIZ;
        }
        if ((i & 2) != 0) {
            z3 = c667760QHe.LIZIZ;
        }
        if ((i & 4) != 0) {
            j4 = c667760QHe.LIZJ;
        }
        if ((i & 8) != 0) {
            j3 = c667760QHe.LIZLLL;
        }
        if ((i & 16) != 0) {
            str4 = c667760QHe.LJ;
        }
        if ((i & 32) != 0) {
            str3 = c667760QHe.LJFF;
        }
        if ((i & 64) != 0) {
            list2 = c667760QHe.LJI;
        }
        c667760QHe.getClass();
        return new C667760QHe(z4, z3, j4, j3, str4, str3, list2);
    }
}
