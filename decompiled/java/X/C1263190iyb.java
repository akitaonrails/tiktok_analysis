package X;

import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263190iyb {
    public final EnumC1262370ixH LIZ;
    public final String LIZIZ;
    public final List<EnumC1070410dxf> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final PlaceUserInfo LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1263190iyb() {
        int i = 0;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 0 == true ? 1 : 0, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263190iyb)) {
            return false;
        }
        C1263190iyb c1263190iyb = (C1263190iyb) obj;
        return this.LIZ == c1263190iyb.LIZ && Intrinsics.LJFF(this.LIZIZ, c1263190iyb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1263190iyb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1263190iyb.LIZLLL) && Intrinsics.LJFF(this.LJ, c1263190iyb.LJ) && this.LJFF == c1263190iyb.LJFF && this.LJI == c1263190iyb.LJI && this.LJII == c1263190iyb.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1263190iyb.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MafRequestParams(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageToken=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", platform=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", secTargetUserId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", newMafCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isFetchAfterAuth=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", placeUserInfo=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1263190iyb LIZ(C1263190iyb c1263190iyb, String str, List list, String str2, String str3, boolean z, int i) {
        EnumC1262370ixH enumC1262370ixH;
        int i2;
        int i3;
        String str4 = str3;
        String str5 = str2;
        boolean z2 = z;
        List list2 = list;
        String str6 = str;
        PlaceUserInfo placeUserInfo = null;
        if ((i & 1) != 0) {
            enumC1262370ixH = c1263190iyb.LIZ;
        } else {
            enumC1262370ixH = null;
        }
        if ((i & 2) != 0) {
            str6 = c1263190iyb.LIZIZ;
        }
        if ((i & 4) != 0) {
            list2 = c1263190iyb.LIZJ;
        }
        if ((i & 8) != 0) {
            str5 = c1263190iyb.LIZLLL;
        }
        if ((i & 16) != 0) {
            str4 = c1263190iyb.LJ;
        }
        if ((i & 32) != 0) {
            i2 = c1263190iyb.LJFF;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            i3 = c1263190iyb.LJI;
        } else {
            i3 = 0;
        }
        if ((i & 128) != 0) {
            z2 = c1263190iyb.LJII;
        }
        if ((i & 256) != 0) {
            placeUserInfo = c1263190iyb.LJIIIIZZ;
        }
        c1263190iyb.getClass();
        return new C1263190iyb(enumC1262370ixH, str6, list2, str5, str4, i2, i3, z2, placeUserInfo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1263190iyb(EnumC1262370ixH enumC1262370ixH, List list, String str, String str2, int i, int i2, PlaceUserInfo placeUserInfo, int i3) {
        String str3;
        int i4 = i2;
        String str4 = str2;
        String str5 = str;
        List list2 = list;
        int i5 = i;
        EnumC1262370ixH enumC1262370ixH2 = (i3 & 1) != 0 ? EnumC1262370ixH.FIND_FRIENDS : enumC1262370ixH;
        if ((i3 & 2) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(enumC1262370ixH2, str3, (i3 & 4) != 0 ? null : list2, (i3 & 8) != 0 ? null : str5, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? 20 : i5, (i3 & 64) != 0 ? 0 : i4, false, (i3 & 256) == 0 ? placeUserInfo : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1263190iyb(EnumC1262370ixH enumC1262370ixH, String str, List<? extends EnumC1070410dxf> list, String str2, String str3, int i, int i2, boolean z, PlaceUserInfo placeUserInfo) {
        this.LIZ = enumC1262370ixH;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = z;
        this.LJIIIIZZ = placeUserInfo;
    }
}
