package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264760j18 implements InterfaceC111300bX {
    public final User LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final Function0<Boolean> LLILZ;
    public final Function0<String> LLILZIL;
    public final Function0<String> LLILZLL;
    public final InterfaceC1073860e3E LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final boolean LLJ;
    public final Function2<C1749280vcc, Exception, Unit> LLJI;
    public final Function0<Boolean> LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264760j18)) {
            return false;
        }
        C1264760j18 c1264760j18 = (C1264760j18) obj;
        return Intrinsics.LJFF(this.LL, c1264760j18.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1264760j18.LLILLJJLI) && this.LLILLL == c1264760j18.LLILLL && Intrinsics.LJFF(this.LLILZ, c1264760j18.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1264760j18.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1264760j18.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1264760j18.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1264760j18.LLIZLLLIL) && this.LLJ == c1264760j18.LLJ && Intrinsics.LJFF(this.LLJI, c1264760j18.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1264760j18.LLJIJIL);
    }

    public final int hashCode() {
        User user = this.LL;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        InterfaceC1073860e3E interfaceC1073860e3E = this.LLIZ;
        return ((((((((iHashCode2 + (interfaceC1073860e3E != null ? interfaceC1073860e3E.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode();
    }

    public final String toString() {
        return "FollowingListHierarchyData(user=" + this.LL + ", uid=" + this.LLILLJJLI + ", isMyself=" + this.LLILLL + ", checkFetchRecommendUser=" + this.LLILZ + ", getEnterFrom=" + this.LLILZIL + ", getPreviousPage=" + this.LLILZLL + ", behaviorMonitor=" + this.LLIZ + ", showEmpty=" + this.LLIZLLLIL + ", isLazyMode=" + this.LLJ + ", updateErrorViewIfNeeded=" + this.LLJI + ", getShouldDisplayWeakGuide=" + this.LLJIJIL + ')';
    }

    public C1264760j18(User user, String str, boolean z, C1263600izG c1263600izG, C1264750j17 c1264750j17, C1264540j0m c1264540j0m, InterfaceC1073860e3E interfaceC1073860e3E, C1264710j13 c1264710j13, boolean z2, C1264720j14 c1264720j14, C1264780j1A c1264780j1A) {
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c1263600izG;
        this.LLILZIL = c1264750j17;
        this.LLILZLL = c1264540j0m;
        this.LLIZ = interfaceC1073860e3E;
        this.LLIZLLLIL = c1264710j13;
        this.LLJ = z2;
        this.LLJI = c1264720j14;
        this.LLJIJIL = c1264780j1A;
    }
}
