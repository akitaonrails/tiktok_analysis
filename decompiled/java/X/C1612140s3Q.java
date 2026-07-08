package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612140s3Q implements InterfaceC1611890s31 {
    public final /* synthetic */ C1612180s3U LL;

    @Override // X.InterfaceC1611890s31
    public final int LJJIZ() {
        return this.LL.LLILZLL;
    }

    @Override // X.InterfaceC1611890s31
    public final boolean LJJJJI() {
        if (this.LL.LIZ()) {
            if (this.LL.LLIZ < 0) {
                return false;
            }
        } else if (this.LL.LLIZ < 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1611890s31
    public final void LJJLIIIJJI() {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(this.LL.LL)) != null) {
            interfaceC1612220s3YLIZLLL.clear();
        }
        this.LL.getClass();
        this.LL.getClass();
        C1612180s3U c1612180s3U = this.LL;
        c1612180s3U.LLILZLL = 0;
        c1612180s3U.LLIZ = -1;
        c1612180s3U.LLJ = 0;
        c1612180s3U.LLIZLLLIL = 0;
    }

    @Override // X.InterfaceC1611890s31
    public final int LLFFF() {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        C1612180s3U c1612180s3U = this.LL;
        int i = c1612180s3U.LLIZLLLIL - 1;
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        Boolean boolValueOf = Boolean.valueOf(c1612180s3U.LIZ());
        c1611790s2r.getClass();
        int iLJIIL = i + C1611790s2r.LJIIL(boolValueOf);
        C1612180s3U c1612180s3U2 = this.LL;
        c1612180s3U2.getClass();
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        return iLJIIL + C1611790s2r.LJIIL(Boolean.valueOf((miniDramaCacheServiceLIZ == null || (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(c1612180s3U2.LL)) == null) ? false : interfaceC1612220s3YLIZLLL.LJIJJ()));
    }

    @Override // X.InterfaceC1611890s31
    public final int LLLII() {
        return this.LL.LLIZ;
    }

    @Override // X.InterfaceC1611890s31
    public final int LLLZIIL() {
        C1612180s3U c1612180s3U = this.LL;
        int i = c1612180s3U.LLJ - 1;
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        Boolean boolValueOf = Boolean.valueOf(c1612180s3U.LIZ());
        c1611790s2r.getClass();
        return i + C1611790s2r.LJIIL(boolValueOf);
    }

    @Override // X.InterfaceC1611890s31
    public final void c0() {
        this.LL.getClass();
        this.LL.getClass();
    }

    @Override // X.InterfaceC1611890s31
    public final boolean hasNext() {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        return this.LL.LLILZLL <= ((miniDramaCacheServiceLIZ == null || (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(this.LL.LL)) == null) ? 0 : interfaceC1612220s3YLIZLLL.LIZJ());
    }

    public C1612140s3Q(C1612180s3U c1612180s3U) {
        this.LL = c1612180s3U;
    }

    @Override // X.InterfaceC1611890s31
    public final void LJJJZ(int i) {
        Integer second;
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        Boolean boolValueOf = Boolean.valueOf(this.LL.LIZ());
        c1611790s2r.getClass();
        int iLJIIL = (i + 1) - C1611790s2r.LJIIL(boolValueOf);
        Pair<C1612360s3m, Integer> pairLIZIZ = this.LL.LIZIZ();
        if (pairLIZIZ != null) {
            second = pairLIZIZ.getSecond();
        } else {
            second = null;
        }
        C1612180s3U c1612180s3U = this.LL;
        c1612180s3U.getClass();
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(c1612180s3U.LL)) != null && interfaceC1612220s3YLIZLLL.LJIJJ() && second != null && iLJIIL >= second.intValue()) {
            iLJIIL--;
        }
        C1612180s3U c1612180s3U2 = this.LL;
        c1612180s3U2.LLILZLL = iLJIIL;
        c1612180s3U2.LLIZ = iLJIIL - 1;
        c1612180s3U2.LLIZLLLIL = iLJIIL;
        c1612180s3U2.LLJ = iLJIIL;
    }

    @Override // X.InterfaceC1611890s31
    public final void LJZ(int i) {
        this.LL.LLILZLL = i;
    }

    @Override // X.InterfaceC1611890s31
    public final void LLIIIJ(int i) {
        this.LL.LLIZ = i;
    }

    @Override // X.InterfaceC1611890s31
    public final void G(List list, boolean z) {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(this.LL.LL)) != null) {
            interfaceC1612220s3YLIZLLL.LJIILIIL(z, true, C13LP.LLIIJI(list));
        }
    }

    @Override // X.InterfaceC1611890s31
    public final void LJJLIL(Integer num, Integer num2) {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        int iIntValue;
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL2;
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null && (interfaceC1612220s3YLIZLLL2 = miniDramaCacheServiceLIZ.LIZLLL(this.LL.LL)) != null) {
            if (num != null) {
                num.intValue();
            }
            interfaceC1612220s3YLIZLLL2.LIZIZ();
        }
        MiniDramaCacheService miniDramaCacheServiceLIZ2 = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ2 != null && (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ2.LIZLLL(this.LL.LL)) != null) {
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            interfaceC1612220s3YLIZLLL.LJ(iIntValue);
        }
    }

    @Override // X.InterfaceC1611890s31
    public final Aweme LJLJI(C1612360s3m c1612360s3m, List<C1612360s3m> list) {
        PaidContentInfo paidContentInfo;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        PaidContentInfo paidContentInfo2;
        PaidContentInfo paidContentInfo3;
        PaidContentInfo paidContentInfo4;
        Aweme aweme4;
        Aweme aweme5;
        PaidContentInfo paidContentInfo5;
        Aweme aweme6;
        Aweme aweme7;
        Aweme aweme8;
        PaidContentInfo paidContentInfo6;
        PaidContentInfo paidContentInfo7;
        PaidContentInfo paidContentInfo8;
        if (C1611420s2G.LIZIZ(c1612360s3m.LIZ.aweme)) {
            return c1612360s3m.LIZ.aweme;
        }
        if (!c1612360s3m.LIZIZ && !c1612360s3m.LIZJ && !c1612360s3m.LIZ.isIntro() && !c1612360s3m.LJII && ((aweme4 = c1612360s3m.LIZ.aweme) == null || (paidContentInfo8 = aweme4.mPaidContentInfo) == null || !paidContentInfo8.getShouldShowPreview())) {
            ArrayList arrayList = new ArrayList();
            for (C1612360s3m c1612360s3m2 : list) {
                if (!c1612360s3m2.LIZ.isReported()) {
                    arrayList.add(c1612360s3m2);
                }
            }
            int iIndexOf = arrayList.indexOf(c1612360s3m);
            ArrayList arrayList2 = new ArrayList();
            for (C1612360s3m c1612360s3m3 : list) {
                if (!c1612360s3m3.LIZ.isReported()) {
                    arrayList2.add(c1612360s3m3);
                }
            }
            C1612360s3m c1612360s3m4 = (C1612360s3m) C13LP.LJJJLZIJ(iIndexOf - 1, arrayList2);
            if (((c1612360s3m4 != null && !c1612360s3m4.LIZ.isIntro() && (((aweme7 = c1612360s3m4.LIZ.aweme) == null || (paidContentInfo7 = aweme7.mPaidContentInfo) == null || !paidContentInfo7.getShouldShowPreview()) && ((aweme8 = c1612360s3m4.LIZ.aweme) == null || (paidContentInfo6 = aweme8.mPaidContentInfo) == null || !paidContentInfo6.isVideoPurchased()))) || c1612360s3m.LIZJ || c1612360s3m.LIZ.isIntro() || (aweme5 = c1612360s3m.LIZ.aweme) == null || (paidContentInfo5 = aweme5.mPaidContentInfo) == null || paidContentInfo5.getShouldShowPreview()) && ((aweme6 = c1612360s3m.LIZ.aweme) == null || !aweme6.isAd())) {
                return null;
            }
        }
        if (!c1612360s3m.LIZ.isReported()) {
            Aweme aweme9 = c1612360s3m.LIZ.aweme;
            if (aweme9 != null && (paidContentInfo = aweme9.mPaidContentInfo) != null && paidContentInfo.isPartialPreview() && (((aweme = c1612360s3m.LIZ.aweme) != null && (paidContentInfo4 = aweme.mPaidContentInfo) != null && paidContentInfo4.isVideoPurchased()) || (((aweme2 = c1612360s3m.LIZ.aweme) != null && (paidContentInfo3 = aweme2.mPaidContentInfo) != null && paidContentInfo3.isSeriesPurchased()) || ((aweme3 = c1612360s3m.LIZ.aweme) != null && (paidContentInfo2 = aweme3.mPaidContentInfo) != null && paidContentInfo2.isLimitedFreeShortDrama())))) {
                PaidVideoItem paidVideoItem = c1612360s3m.LIZ;
                Aweme aweme10 = paidVideoItem.fullAweme;
                if (aweme10 != null) {
                    return aweme10;
                }
                return paidVideoItem.aweme;
            }
            return c1612360s3m.LIZ.aweme;
        }
        return null;
    }

    @Override // X.InterfaceC1611890s31
    public final int Z(int i, String str) {
        String aid;
        Integer second;
        C1612360s3m first;
        PaidVideoItem paidVideoItem;
        Aweme aweme;
        Pair<C1612360s3m, Integer> pairLIZIZ = this.LL.LIZIZ();
        if (pairLIZIZ != null && (first = pairLIZIZ.getFirst()) != null && (paidVideoItem = first.LIZ) != null && (aweme = paidVideoItem.aweme) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, str)) {
            Pair<C1612360s3m, Integer> pairLIZIZ2 = this.LL.LIZIZ();
            if (pairLIZIZ2 != null && (second = pairLIZIZ2.getSecond()) != null) {
                return second.intValue();
            }
            return 0;
        }
        return i;
    }

    @Override // X.InterfaceC1611890s31
    public final Object LLLLL(String str, String str2, String str3, PineDramaMidInsertRequest pineDramaMidInsertRequest, C1611920s34 c1611920s34) {
        return LJLZ(0, false, true, true, -1L, true, this.LL.LLILLJJLI, "innerfeed", str, null, null, str2, str3, pineDramaMidInsertRequest, c1611920s34);
    }

    @Override // X.InterfaceC1611890s31
    public final Object LJJIJIL(long j, String str, String str2, String str3, String str4, PineDramaMidInsertRequest pineDramaMidInsertRequest, AbstractC23140094w abstractC23140094w) {
        return LJLZ(0, false, true, true, j, true, this.LL.LLILLJJLI, str, str2, null, null, str3, str4, pineDramaMidInsertRequest, abstractC23140094w);
    }

    @Override // X.InterfaceC1611890s31
    public final Object D(int i, boolean z, boolean z2, boolean z3, String str, List list, List list2, String str2, String str3, PineDramaMidInsertRequest pineDramaMidInsertRequest, C1611920s34 c1611920s34) {
        return LJLZ(i, z, z2, false, -1L, z3, this.LL.LLILLJJLI, "innerfeed", str, list, list2, str2, str3, pineDramaMidInsertRequest, c1611920s34);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLZ(int r40, boolean r41, boolean r42, boolean r43, long r44, boolean r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.util.List<java.lang.String> r50, java.util.List<java.lang.String> r51, java.lang.String r52, java.lang.String r53, com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest r54, X.InterfaceC1364105Vn<? super X.C1612000s3C> r55) {
        /*
            Method dump skipped, instruction units count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1612140s3Q.LJLZ(int, boolean, boolean, boolean, long, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest, X.05Vn):java.lang.Object");
    }
}
