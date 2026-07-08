package X;

import com.ss.android.ugc.effectmanager.effect.model.FilteredAsset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422890n8B {
    public final boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public List<FilteredAsset> LJI;
    public Integer LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1422890n8B)) {
            return false;
        }
        C1422890n8B c1422890n8B = (C1422890n8B) obj;
        return this.LIZ == c1422890n8B.LIZ && Intrinsics.LJFF(this.LIZIZ, c1422890n8B.LIZIZ) && this.LIZJ == c1422890n8B.LIZJ && this.LIZLLL == c1422890n8B.LIZLLL && this.LJ == c1422890n8B.LJ && this.LJFF == c1422890n8B.LJFF && Intrinsics.LJFF(this.LJI, c1422890n8B.LJI) && Intrinsics.LJFF(this.LJII, c1422890n8B.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateTabFetchTemplateResultExtra(hasMore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadingCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", updateStart=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", failureCache=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fromLoadMore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", filteredAssetList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", positionAfterFavoriteOperations=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1422890n8B LIZ(C1422890n8B c1422890n8B, boolean z, boolean z2) {
        return new C1422890n8B(z, c1422890n8B.LIZIZ, c1422890n8B.LIZJ, c1422890n8B.LIZLLL, c1422890n8B.LJ, z2, c1422890n8B.LJI, c1422890n8B.LJII);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1422890n8B(boolean z, String str, boolean z2, boolean z3, boolean z4, List list, Integer num, int i) {
        int i2;
        List list2 = list;
        boolean z5 = z3;
        boolean z6 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(z, str, z6, i2, (i & 16) != 0 ? false : z5, z4, (List<FilteredAsset>) ((i & 64) != 0 ? null : list2), (i & 128) == 0 ? num : null);
    }

    public C1422890n8B(boolean z, String str, boolean z2, int i, boolean z3, boolean z4, List<FilteredAsset> list, Integer num) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = z2;
        this.LIZLLL = i;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = list;
        this.LJII = num;
    }
}
