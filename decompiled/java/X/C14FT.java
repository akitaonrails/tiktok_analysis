package X;

import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14FT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FT implements C14G2 {
    public final List<Pair<String, Long>> LIZ;
    public final C0PHT LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Map<String, List<TakoKeyFramePoint>> LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14FT)) {
            return false;
        }
        C14FT c14ft = (C14FT) obj;
        return Intrinsics.LJFF(this.LIZ, c14ft.LIZ) && Intrinsics.LJFF(this.LIZIZ, c14ft.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c14ft.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c14ft.LIZLLL) && Intrinsics.LJFF(this.LJ, c14ft.LJ) && Intrinsics.LJFF(this.LJFF, c14ft.LJFF) && Intrinsics.LJFF(this.LJI, c14ft.LJI) && Intrinsics.LJFF(this.LJII, c14ft.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c14ft.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c14ft.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c14ft.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c14ft.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c14ft.LJIIL) && this.LJIILIIL == c14ft.LJIILIIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31;
        String str = this.LJIIJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, List<TakoKeyFramePoint>> map = this.LJIIJJI;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.LJIIL;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    @Override // X.C14G2
    public final void isLog() {
    }

    public final String toString() {
        return "TakoEnterDetailAction(awemeIdListWithIndex=" + this.LIZ + ", streamRoot=" + this.LIZIZ + ", enterAid=" + this.LIZJ + ", outId=" + this.LIZLLL + ", takoOutSearchId=" + this.LJ + ", conversationId=" + this.LJFF + ", msgId=" + this.LJI + ", uuid=" + this.LJII + ", isMixedLayout=" + this.LJIIIIZZ + ", responseType=" + this.LJIIIZ + ", responseRank=" + this.LJIIJ + ", keyframePointsBindingToAweme=" + this.LJIIJJI + ", inspirationSessionId=" + this.LJIIL + ", enableLoadMore=" + this.LJIILIIL + ')';
    }

    static {
        ((TakoContextAbilityImpl) C144I.LIZ()).uk0().LIZ(C13LE.LIZ(C14FT.class), AFwS318S0000000_30.get$arr$(46));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14FT(List<Pair<String, Long>> list, C0PHT c0pht, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, ? extends List<TakoKeyFramePoint>> map, String str10, boolean z) {
        this.LIZ = list;
        this.LIZIZ = c0pht;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = map;
        this.LJIIL = str10;
        this.LJIILIIL = z;
    }
}
