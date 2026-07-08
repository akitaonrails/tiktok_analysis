package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zlx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908830zlx extends C1908870zm1 {
    public final User LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final boolean LJI;
    public final EnumC1387060mCO LJII;
    public final EnumC2274741E1w LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Map<String, String> LJIIJ;
    public final Map<C0SY7, C1908890zm3> LJIIJJI;
    public final Map<C0SY7, Integer> LJIIL;
    public final Map<C0SY7, Boolean> LJIILIIL;
    public final boolean LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final ViewModelStoreOwner LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final C0ZD9 LJIJI;
    public final boolean LJIJJ;
    public final C00IW LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final boolean LJJIII;
    public final boolean LJJIIJ;
    public final boolean LJJIIJZLJL;
    public final C735600StK LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public final Function0<Unit> LJJIJIIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1908830zlx)) {
            return false;
        }
        C1908830zlx c1908830zlx = (C1908830zlx) obj;
        return Intrinsics.LJFF(this.LIZJ, c1908830zlx.LIZJ) && this.LIZLLL == c1908830zlx.LIZLLL && this.LJ == c1908830zlx.LJ && this.LJFF == c1908830zlx.LJFF && this.LJI == c1908830zlx.LJI && this.LJII == c1908830zlx.LJII && this.LJIIIIZZ == c1908830zlx.LJIIIIZZ && this.LJIIIZ == c1908830zlx.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1908830zlx.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1908830zlx.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1908830zlx.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1908830zlx.LJIILIIL) && this.LJIILJJIL == c1908830zlx.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c1908830zlx.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1908830zlx.LJIILLIIL) && this.LJIIZILJ == c1908830zlx.LJIIZILJ && this.LJIJ == c1908830zlx.LJIJ && Intrinsics.LJFF(this.LJIJI, c1908830zlx.LJIJI) && this.LJIJJ == c1908830zlx.LJIJJ && this.LJIJJLI == c1908830zlx.LJIJJLI && this.LJIL == c1908830zlx.LJIL && this.LJJ == c1908830zlx.LJJ && this.LJJI == c1908830zlx.LJJI && this.LJJIFFI == c1908830zlx.LJJIFFI && this.LJJII == c1908830zlx.LJJII && this.LJJIII == c1908830zlx.LJJIII && this.LJJIIJ == c1908830zlx.LJJIIJ && this.LJJIIJZLJL == c1908830zlx.LJJIIJZLJL && Intrinsics.LJFF(this.LJJIIZ, c1908830zlx.LJJIIZ) && this.LJJIIZI == c1908830zlx.LJJIIZI && this.LJJIJ == c1908830zlx.LJJIJ && Intrinsics.LJFF(this.LJJIJIIJI, c1908830zlx.LJJIJIIJI);
    }

    public final int hashCode() {
        User user = this.LIZJ;
        int iHashCode = (((((((((((((((user == null ? 0 : user.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        Map<String, String> map = this.LJIIJ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<C0SY7, C1908890zm3> map2 = this.LJIIJJI;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<C0SY7, Integer> map3 = this.LJIIL;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<C0SY7, Boolean> map4 = this.LJIILIIL;
        int iHashCode5 = (((iHashCode4 + (map4 == null ? 0 : map4.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31;
        LifecycleOwner lifecycleOwner = this.LJIILL;
        int iHashCode6 = (iHashCode5 + (lifecycleOwner == null ? 0 : lifecycleOwner.hashCode())) * 31;
        ViewModelStoreOwner viewModelStoreOwner = this.LJIILLIIL;
        int iHashCode7 = (((((iHashCode6 + (viewModelStoreOwner == null ? 0 : viewModelStoreOwner.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31) + C786410Ut5.Z2(this.LJIJ)) * 31;
        C0ZD9 c0zd9 = this.LJIJI;
        int iHashCode8 = (((((((((((((((((((((((((((iHashCode7 + (c0zd9 == null ? 0 : c0zd9.hashCode())) * 31) + C786410Ut5.Z2(this.LJIJJ)) * 31) + this.LJIJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LJIL)) * 31) + C786410Ut5.Z2(this.LJJ)) * 31) + C786410Ut5.Z2(this.LJJI)) * 31) + C786410Ut5.Z2(this.LJJIFFI)) * 31) + C786410Ut5.Z2(this.LJJII)) * 31) + C786410Ut5.Z2(this.LJJIII)) * 31) + C786410Ut5.Z2(this.LJJIIJ)) * 31) + C786410Ut5.Z2(this.LJJIIJZLJL)) * 31) + this.LJJIIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJJIIZI)) * 31) + C786410Ut5.Z2(this.LJJIJ)) * 31;
        Function0<Unit> function0 = this.LJJIJIIJI;
        return iHashCode8 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        return "RelationButtonConfig(user=" + this.LIZJ + ", enterChat=" + this.LIZLLL + ", isQuickChat=" + this.LJ + ", quickChatViewType=" + this.LJFF + ", ignoreFollowRequestedToastFrequency=" + this.LJI + ", mutualFollowText=" + this.LJII + ", scene=" + this.LJIIIIZZ + ", unfollowAlert=" + this.LJIIIZ + ", requestParams=" + this.LJIIJ + ", stateToTxtAndClickMap=" + this.LJIIJJI + ", stateToStartIconDrawableIdMap=" + this.LJIIL + ", clearIconTintColorMap=" + this.LJIILIIL + ", isFromRecommendScene=" + this.LJIILJJIL + ", lifecycleOwner=" + this.LJIILL + ", viewModelStoreOwner=" + this.LJIILLIIL + ", needReportFollowBackBtnShow=" + this.LJIIZILJ + ", lazyUpdateUI=" + this.LJIJ + ", nudgeInfo=" + this.LJIJI + ", forceDarkMode=" + this.LJIJJ + ", greetStatus=" + this.LJIJJLI + ", hasGreetMsg=" + this.LJIL + ", enableRecUserCellRedesign=" + this.LJJ + ", enableConnectNow=" + this.LJJI + ", canMessageAfterFollow=" + this.LJJIFFI + ", needCheckMafCanMessage=" + this.LJJII + ", showPrivateAccountToast=" + this.LJJIII + ", customizeMessageAfterFollow=" + this.LJJIIJ + ", noDoubleBind=" + this.LJJIIJZLJL + ", mobCallback=" + this.LJJIIZ + ", shouldChangeFollowBackCopy=" + this.LJJIIZI + ", enableMessageInFindSchoolFriendsPage=" + this.LJJIJ + ", mobMsgCallback=" + this.LJJIJIIJI + ')';
    }

    @Override // X.C1908870zm1
    public final LifecycleOwner LIZ() {
        return this.LJIILL;
    }

    @Override // X.C1908870zm1
    public final User LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.C1908870zm1
    public final ViewModelStoreOwner LIZJ() {
        return this.LJIILLIIL;
    }

    @Override // X.C1908870zm1
    public final boolean LIZLLL() {
        return this.LJIILJJIL;
    }

    public C1908830zlx(User user, boolean z, boolean z2, int i, boolean z3, EnumC1387060mCO enumC1387060mCO, EnumC2274741E1w enumC2274741E1w, boolean z4, Map<String, String> map, Map<C0SY7, C1908890zm3> map2, Map<C0SY7, Integer> map3, Map<C0SY7, Boolean> map4, boolean z5, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, boolean z6, boolean z7, C0ZD9 c0zd9, boolean z8, C00IW c00iw, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, C735600StK c735600StK, boolean z17, boolean z18, Function0<Unit> function0) {
        super(user, z5, lifecycleOwner, viewModelStoreOwner);
        this.LIZJ = user;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = i;
        this.LJI = z3;
        this.LJII = enumC1387060mCO;
        this.LJIIIIZZ = enumC2274741E1w;
        this.LJIIIZ = z4;
        this.LJIIJ = map;
        this.LJIIJJI = map2;
        this.LJIIL = map3;
        this.LJIILIIL = map4;
        this.LJIILJJIL = z5;
        this.LJIILL = lifecycleOwner;
        this.LJIILLIIL = viewModelStoreOwner;
        this.LJIIZILJ = z6;
        this.LJIJ = z7;
        this.LJIJI = c0zd9;
        this.LJIJJ = z8;
        this.LJIJJLI = c00iw;
        this.LJIL = z9;
        this.LJJ = z10;
        this.LJJI = z11;
        this.LJJIFFI = z12;
        this.LJJII = z13;
        this.LJJIII = z14;
        this.LJJIIJ = z15;
        this.LJJIIJZLJL = z16;
        this.LJJIIZ = c735600StK;
        this.LJJIIZI = z17;
        this.LJJIJ = z18;
        this.LJJIJIIJI = function0;
    }
}
