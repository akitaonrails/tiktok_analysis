package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07sK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1999007sK {
    public final boolean LIZ;
    public final EnumC1990707qz LIZIZ;
    public final boolean LIZJ;
    public final EnumC1998907sJ LIZLLL;
    public final List<C954460awe> LJ;
    public final List<C954460awe> LJFF;
    public final List<C954460awe> LJI;
    public final Map<Long, GiftGalleryBadgeInfo> LJII;

    public C1999007sK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1999007sK)) {
            return false;
        }
        C1999007sK c1999007sK = (C1999007sK) obj;
        return this.LIZ == c1999007sK.LIZ && this.LIZIZ == c1999007sK.LIZIZ && this.LIZJ == c1999007sK.LIZJ && this.LIZLLL == c1999007sK.LIZLLL && Intrinsics.LJFF(this.LJ, c1999007sK.LJ) && Intrinsics.LJFF(this.LJFF, c1999007sK.LJFF) && Intrinsics.LJFF(this.LJI, c1999007sK.LJI) && Intrinsics.LJFF(this.LJII, c1999007sK.LJII);
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendRankQuickMatchRuntimeContext(isPanelEntryActive=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", protocolMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestSent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inviteSurface=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", panelHosts=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", selfTeamHosts=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", rivalTeamHosts=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", leagueInfoMap=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1999007sK(int i) {
        EnumC1990707qz enumC1990707qz = EnumC1990707qz.NONE;
        EnumC1998907sJ enumC1998907sJ = EnumC1998907sJ.NONE;
        C13BV c13bv = C13BV.INSTANCE;
        this(false, enumC1990707qz, false, enumC1998907sJ, c13bv, c13bv, c13bv, C2097608Jq.LJ());
    }

    public C1999007sK(boolean z, EnumC1990707qz enumC1990707qz, boolean z2, EnumC1998907sJ enumC1998907sJ, List<C954460awe> list, List<C954460awe> list2, List<C954460awe> list3, Map<Long, GiftGalleryBadgeInfo> map) {
        this.LIZ = z;
        this.LIZIZ = enumC1990707qz;
        this.LIZJ = z2;
        this.LIZLLL = enumC1998907sJ;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = list3;
        this.LJII = map;
    }

    public static C1999007sK LIZ(C1999007sK c1999007sK, EnumC1990707qz enumC1990707qz, boolean z, EnumC1998907sJ enumC1998907sJ, List list, List list2, List list3, Map map, int i) {
        boolean z2;
        Map map2 = map;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        EnumC1998907sJ enumC1998907sJ2 = enumC1998907sJ;
        boolean z3 = z;
        EnumC1990707qz enumC1990707qz2 = enumC1990707qz;
        if ((i & 1) != 0) {
            z2 = c1999007sK.LIZ;
        } else {
            z2 = true;
        }
        if ((i & 2) != 0) {
            enumC1990707qz2 = c1999007sK.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c1999007sK.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC1998907sJ2 = c1999007sK.LIZLLL;
        }
        if ((i & 16) != 0) {
            list6 = c1999007sK.LJ;
        }
        if ((i & 32) != 0) {
            list5 = c1999007sK.LJFF;
        }
        if ((i & 64) != 0) {
            list4 = c1999007sK.LJI;
        }
        if ((i & 128) != 0) {
            map2 = c1999007sK.LJII;
        }
        c1999007sK.getClass();
        return new C1999007sK(z2, enumC1990707qz2, z3, enumC1998907sJ2, list6, list5, list4, map2);
    }
}
