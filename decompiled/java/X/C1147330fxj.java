package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147330fxj {
    public final long LIZ;
    public final String LIZIZ;
    public final ImageModel LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<C1147350fxl> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147330fxj)) {
            return false;
        }
        C1147330fxj c1147330fxj = (C1147330fxj) obj;
        return this.LIZ == c1147330fxj.LIZ && Intrinsics.LJFF(this.LIZIZ, c1147330fxj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1147330fxj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1147330fxj.LIZLLL) && this.LJ == c1147330fxj.LJ && this.LJFF == c1147330fxj.LJFF && Intrinsics.LJFF(this.LJI, c1147330fxj.LJI);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        ImageModel imageModel = this.LIZJ;
        return ((((((((iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftTabModel(tabId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paginationToken=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isPinnedTab=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", gifts=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147330fxj(long j, String str, ImageModel imageModel, String str2, boolean z, boolean z2, List<C1147350fxl> list) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = imageModel;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = list;
    }

    public static C1147330fxj LIZ(C1147330fxj c1147330fxj, long j, String str, ImageModel imageModel, String str2, boolean z, List list, int i) {
        boolean z2;
        List list2 = list;
        String str3 = str2;
        ImageModel imageModel2 = imageModel;
        String str4 = str;
        boolean z3 = z;
        long j2 = j;
        if ((i & 1) != 0) {
            j2 = c1147330fxj.LIZ;
        }
        if ((i & 2) != 0) {
            str4 = c1147330fxj.LIZIZ;
        }
        if ((i & 4) != 0) {
            imageModel2 = c1147330fxj.LIZJ;
        }
        if ((i & 8) != 0) {
            str3 = c1147330fxj.LIZLLL;
        }
        if ((i & 16) != 0) {
            z2 = c1147330fxj.LJ;
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = c1147330fxj.LJFF;
        }
        if ((i & 64) != 0) {
            list2 = c1147330fxj.LJI;
        }
        return new C1147330fxj(j2, str4, imageModel2, str3, z2, z3, list2);
    }
}
