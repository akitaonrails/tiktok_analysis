package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393390mMb implements InterfaceC0148002o {
    public final C0SYN LL;
    public final AbstractC1623806Xk<C737030Svd> LLILLJJLI;
    public final C730120SkU LLILLL;
    public final AbstractC1623806Xk<C737030Svd> LLILZ;
    public final AbstractC1623806Xk<C484220Iyq> LLILZIL;
    public final AbstractC1623806Xk<C697110RWb> LLILZLL;
    public final AbstractC1623806Xk<C888460YtI> LLIZ;
    public final AbstractC1623806Xk<C486890J7n> LLIZLLLIL;
    public final AbstractC1623806Xk<C10BQ> LLJ;
    public final FollowStatus LLJI;

    public C1393390mMb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1393390mMb)) {
            return false;
        }
        C1393390mMb c1393390mMb = (C1393390mMb) obj;
        return Intrinsics.LJFF(this.LL, c1393390mMb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1393390mMb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1393390mMb.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1393390mMb.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1393390mMb.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1393390mMb.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1393390mMb.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1393390mMb.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1393390mMb.LLJ) && Intrinsics.LJFF(this.LLJI, c1393390mMb.LLJI);
    }

    public final int hashCode() {
        C0SYN c0syn = this.LL;
        int iHashCode = (((c0syn == null ? 0 : c0syn.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C730120SkU c730120SkU = this.LLILLL;
        int iHashCode2 = (((((((((((((iHashCode + (c730120SkU == null ? 0 : c730120SkU.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31;
        FollowStatus followStatus = this.LLJI;
        return iHashCode2 + (followStatus != null ? followStatus.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3EventState(diggEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", diggUpdateEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", syncDiggStateEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", itemDeleteEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", jsBroadCastEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", privateModelEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", blockUserEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", unBlockUserEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", privateRealChangeEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", followStatusChangeEvent=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1393390mMb(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(null, c491101vh, null, c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, null);
    }

    public C1393390mMb(C0SYN c0syn, AbstractC1623806Xk<C737030Svd> abstractC1623806Xk, C730120SkU c730120SkU, AbstractC1623806Xk<C737030Svd> abstractC1623806Xk2, AbstractC1623806Xk<C484220Iyq> abstractC1623806Xk3, AbstractC1623806Xk<C697110RWb> abstractC1623806Xk4, AbstractC1623806Xk<C888460YtI> abstractC1623806Xk5, AbstractC1623806Xk<C486890J7n> abstractC1623806Xk6, AbstractC1623806Xk<C10BQ> abstractC1623806Xk7, FollowStatus followStatus) {
        this.LL = c0syn;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = c730120SkU;
        this.LLILZ = abstractC1623806Xk2;
        this.LLILZIL = abstractC1623806Xk3;
        this.LLILZLL = abstractC1623806Xk4;
        this.LLIZ = abstractC1623806Xk5;
        this.LLIZLLLIL = abstractC1623806Xk6;
        this.LLJ = abstractC1623806Xk7;
        this.LLJI = followStatus;
    }

    public static C1393390mMb LIZ(C1393390mMb c1393390mMb, C0SYN c0syn, C1623606Xi c1623606Xi, C730120SkU c730120SkU, C1623606Xi c1623606Xi2, C1623606Xi c1623606Xi3, C1623606Xi c1623606Xi4, C1623606Xi c1623606Xi5, C1623606Xi c1623606Xi6, C1623606Xi c1623606Xi7, FollowStatus followStatus, int i) {
        FollowStatus followStatus2 = followStatus;
        AbstractC1623806Xk<C10BQ> abstractC1623806Xk = c1623606Xi7;
        AbstractC1623806Xk<C486890J7n> abstractC1623806Xk2 = c1623606Xi6;
        AbstractC1623806Xk<C888460YtI> abstractC1623806Xk3 = c1623606Xi5;
        AbstractC1623806Xk<C697110RWb> abstractC1623806Xk4 = c1623606Xi4;
        AbstractC1623806Xk<C484220Iyq> abstractC1623806Xk5 = c1623606Xi3;
        AbstractC1623806Xk<C737030Svd> abstractC1623806Xk6 = c1623606Xi2;
        C730120SkU c730120SkU2 = c730120SkU;
        AbstractC1623806Xk<C737030Svd> abstractC1623806Xk7 = c1623606Xi;
        C0SYN c0syn2 = c0syn;
        if ((i & 1) != 0) {
            c0syn2 = c1393390mMb.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk7 = c1393390mMb.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c730120SkU2 = c1393390mMb.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk6 = c1393390mMb.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk5 = c1393390mMb.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk4 = c1393390mMb.LLILZLL;
        }
        if ((i & 64) != 0) {
            abstractC1623806Xk3 = c1393390mMb.LLIZ;
        }
        if ((i & 128) != 0) {
            abstractC1623806Xk2 = c1393390mMb.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            abstractC1623806Xk = c1393390mMb.LLJ;
        }
        if ((i & 512) != 0) {
            followStatus2 = c1393390mMb.LLJI;
        }
        c1393390mMb.getClass();
        return new C1393390mMb(c0syn2, abstractC1623806Xk7, c730120SkU2, abstractC1623806Xk6, abstractC1623806Xk5, abstractC1623806Xk4, abstractC1623806Xk3, abstractC1623806Xk2, abstractC1623806Xk, followStatus2);
    }
}
