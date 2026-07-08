package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService;
import com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionRecommendResponse;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612150s3R implements InterfaceC1612220s3Y {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public PaidCollectionRecommendResponse LJI;
    public PaidCollectionPanelResponse LJII;
    public Pair<C1612360s3m, Integer> LJIIIIZZ;
    public final List<C1612360s3m> LJ = new ArrayList();
    public final HashSet<Integer> LJFF = new HashSet<>();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(485));

    @Override // X.InterfaceC1612220s3Y
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1612220s3Y
    public final void clear() {
        this.LIZLLL = 0;
        ((ArrayList) this.LJ).clear();
        this.LJFF.clear();
        this.LIZJ = false;
        this.LIZIZ = false;
        this.LJI = null;
        this.LJII = null;
    }

    @Override // X.InterfaceC1612220s3Y
    public final int LIZJ() {
        return this.LIZLLL - (this.LIZIZ ? 1 : 0);
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LJIIL() {
        MiniDramaPlayProgressService miniDramaPlayProgressService;
        MiniDramaPlayProgressService miniDramaPlayProgressService2 = (MiniDramaPlayProgressService) this.LJIIIZ.getValue();
        int i = 0;
        if (miniDramaPlayProgressService2 == null || !miniDramaPlayProgressService2.isEmpty()) {
            for (Object obj : (ArrayList) this.LJ) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C1612360s3m c1612360s3m = (C1612360s3m) obj;
                Aweme aweme = c1612360s3m.LIZ.aweme;
                if (aweme != null && (miniDramaPlayProgressService = (MiniDramaPlayProgressService) this.LJIIIZ.getValue()) != null) {
                    String aid = aweme.getAid();
                    PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
                    long paidContentResumeTimestamp = paidContentInfo != null ? paidContentInfo.getPaidContentResumeTimestamp() : 0L;
                    long j = LSPassThroughRecordSizeConfig.DEFAULT;
                    Long lLIZIZ = miniDramaPlayProgressService.LIZIZ(paidContentResumeTimestamp * j, aid);
                    if (lLIZIZ != null) {
                        long jLongValue = lLIZIZ.longValue() / j;
                        aweme.mPaidContentInfo.setPaidContentResumeTimestamp(jLongValue);
                        boolean zIsComplete = c1612360s3m.LIZ.isComplete();
                        double paidContentResumeTimestamp2 = ((aweme.mPaidContentInfo != null ? r0.getPaidContentResumeTimestamp() : 0L) * 1.0d) / (c1612360s3m.LIZ.videoDuration / j);
                        MiniDramaPlayProgressService miniDramaPlayProgressService3 = (MiniDramaPlayProgressService) this.LJIIIZ.getValue();
                        if (miniDramaPlayProgressService3 != null) {
                            miniDramaPlayProgressService3.LIZ();
                        }
                        if (paidContentResumeTimestamp2 >= 0.95d) {
                            zIsComplete = true;
                        }
                        aweme.mPaidContentInfo.setPaidContentResumeTimestamp(jLongValue);
                        List<C1612360s3m> list = this.LJ;
                        if (list != null) {
                            PaidVideoItem paidVideoItem = c1612360s3m.LIZ;
                            ListProtector.set(list, i, C1612360s3m.LIZ(c1612360s3m, paidVideoItem.copy(paidVideoItem.paidVideoId, paidVideoItem.isIntro, paidVideoItem.isReported, aweme, paidVideoItem.fullAweme, zIsComplete, paidVideoItem.maxTimestamp, jLongValue, paidVideoItem.videoDuration, paidVideoItem.seqId, paidVideoItem.isLastWatched, paidVideoItem.videoViews, paidVideoItem.isSafetySelected), false, false, false, 254));
                        }
                    }
                }
                i = i2;
            }
        }
    }

    @Override // X.InterfaceC1612220s3Y
    public final PaidVideoItem LJIILJJIL() {
        Object next;
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((C1612360s3m) next).LIZ.isIntro()) {
                break;
            }
        }
        C1612360s3m c1612360s3m = (C1612360s3m) next;
        if (c1612360s3m != null) {
            return c1612360s3m.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1612220s3Y
    public final boolean LJIJJ() {
        C1612360s3m first;
        PaidVideoItem paidVideoItem;
        Pair<C1612360s3m, Integer> pair = this.LJIIIIZZ;
        return (pair == null || (first = pair.getFirst()) == null || (paidVideoItem = first.LIZ) == null || paidVideoItem.aweme == null) ? false : true;
    }

    @Override // X.InterfaceC1612220s3Y
    public final PaidCollectionRecommendResponse LJI() {
        return this.LJI;
    }

    @Override // X.InterfaceC1612220s3Y
    public final Pair<C1612360s3m, Integer> LJII() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1612220s3Y
    public final boolean LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1612220s3Y
    public final boolean LJIIIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1612220s3Y
    public final boolean LJIJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1612220s3Y
    public final PaidCollectionPanelResponse ne() {
        return this.LJII;
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LIZ(boolean z) {
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LIZLLL(boolean z) {
        this.LIZJ = z;
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LJ(int i) {
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LJFF(C1612360s3m c1612360s3m) {
        this.LJIIIIZZ = new Pair<>(c1612360s3m, null);
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LJIILL(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LJIILLIIL(List<C1612360s3m> list) {
        int i;
        int i2;
        String aid;
        String aid2;
        Pair<C1612360s3m, Integer> pair;
        C1612360s3m first;
        PaidVideoItem paidVideoItem;
        C1612360s3m first2;
        PaidVideoItem paidVideoItem2;
        Aweme aweme;
        int i3;
        int i4;
        PaidVideoItem paidVideoItem3;
        PaidVideoItem paidVideoItem4;
        String aid3;
        String aid4;
        C1612360s3m first3;
        PaidVideoItem paidVideoItem5;
        Aweme aweme2;
        String aid5;
        String aid6;
        C1612360s3m first4;
        PaidVideoItem paidVideoItem6;
        Aweme aweme3;
        if (((ArrayList) this.LJ).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                Aweme aweme4 = ((C1612360s3m) obj).LIZ.aweme;
                if (aweme4 != null) {
                    aid5 = aweme4.getAid();
                } else {
                    aid5 = null;
                }
                Pair<C1612360s3m, Integer> pair2 = this.LJIIIIZZ;
                if (pair2 != null && (first4 = pair2.getFirst()) != null && (paidVideoItem6 = first4.LIZ) != null && (aweme3 = paidVideoItem6.aweme) != null) {
                    aid6 = aweme3.getAid();
                } else {
                    aid6 = null;
                }
                if (!Intrinsics.LJFF(aid5, aid6)) {
                    arrayList.add(obj);
                }
            }
            ((ArrayList) this.LJ).addAll(arrayList);
            HashSet<Integer> hashSet = this.LJFF;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((C1612360s3m) it2.next()).LIZ.seqId));
            }
            hashSet.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = (ArrayList) list;
            Iterator it3 = arrayList4.iterator();
            while (true) {
                i = 0;
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                C1612360s3m c1612360s3m = (C1612360s3m) next;
                if (!this.LJFF.contains(Integer.valueOf(c1612360s3m.LIZ.seqId))) {
                    Aweme aweme5 = c1612360s3m.LIZ.aweme;
                    if (aweme5 != null) {
                        aid3 = aweme5.getAid();
                    } else {
                        aid3 = null;
                    }
                    Pair<C1612360s3m, Integer> pair3 = this.LJIIIIZZ;
                    if (pair3 != null && (first3 = pair3.getFirst()) != null && (paidVideoItem5 = first3.LIZ) != null && (aweme2 = paidVideoItem5.aweme) != null) {
                        aid4 = aweme2.getAid();
                    } else {
                        aid4 = null;
                    }
                    if (!Intrinsics.LJFF(aid3, aid4)) {
                        arrayList3.add(next);
                    }
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (true) {
                i2 = -1;
                if (!it4.hasNext()) {
                    break;
                }
                C1612360s3m c1612360s3m2 = (C1612360s3m) it4.next();
                int i5 = c1612360s3m2.LIZ.seqId;
                C1612360s3m c1612360s3m3 = (C1612360s3m) C13LP.LJJLIIIJL(this.LJ);
                if (c1612360s3m3 != null && (paidVideoItem4 = c1612360s3m3.LIZ) != null) {
                    i3 = paidVideoItem4.seqId;
                } else {
                    i3 = 0;
                }
                if (i5 > i3) {
                    ((ArrayList) this.LJ).add(c1612360s3m2);
                    this.LJFF.add(Integer.valueOf(c1612360s3m2.LIZ.seqId));
                } else {
                    int i6 = c1612360s3m2.LIZ.seqId;
                    C1612360s3m c1612360s3m4 = (C1612360s3m) C13LP.LJJJLL(this.LJ);
                    if (c1612360s3m4 != null && (paidVideoItem3 = c1612360s3m4.LIZ) != null) {
                        i4 = paidVideoItem3.seqId;
                    } else {
                        i4 = 0;
                    }
                    if (i6 < i4) {
                        ListProtector.add(this.LJ, 0, c1612360s3m2);
                        this.LJFF.add(Integer.valueOf(c1612360s3m2.LIZ.seqId));
                    } else {
                        ArrayList arrayList5 = (ArrayList) this.LJ;
                        ListIterator listIterator = arrayList5.listIterator(arrayList5.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                if (c1612360s3m2.LIZ.seqId > ((C1612360s3m) listIterator.previous()).LIZ.seqId) {
                                    int iNextIndex = listIterator.nextIndex();
                                    if (iNextIndex >= 0) {
                                        ListProtector.add(this.LJ, iNextIndex + 1, c1612360s3m2);
                                        this.LJFF.add(Integer.valueOf(c1612360s3m2.LIZ.seqId));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.LJIIIIZZ != null) {
                Iterator it5 = arrayList4.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Aweme aweme6 = ((C1612360s3m) it5.next()).LIZ.aweme;
                    if (aweme6 != null) {
                        aid = aweme6.getAid();
                    } else {
                        aid = null;
                    }
                    Pair<C1612360s3m, Integer> pair4 = this.LJIIIIZZ;
                    if (pair4 != null && (first2 = pair4.getFirst()) != null && (paidVideoItem2 = first2.LIZ) != null && (aweme = paidVideoItem2.aweme) != null) {
                        aid2 = aweme.getAid();
                    } else {
                        aid2 = null;
                    }
                    if (Intrinsics.LJFF(aid, aid2)) {
                        if (i > -1 && (pair = this.LJIIIIZZ) != null && (first = pair.getFirst()) != null) {
                            C1612360s3m c1612360s3m5 = (C1612360s3m) C13LP.LJJJLZIJ(i + 1, list);
                            C1612360s3m c1612360s3m6 = (C1612360s3m) ListProtector.get(list, i);
                            C1612360s3m c1612360s3m7 = new C1612360s3m(first.LIZ, c1612360s3m6.LIZIZ, c1612360s3m6.LIZJ, c1612360s3m6.LIZLLL, c1612360s3m6.LJ, c1612360s3m6.LJFF, c1612360s3m6.LJI, false, 128);
                            if (c1612360s3m5 != null && (paidVideoItem = c1612360s3m5.LIZ) != null) {
                                i2 = paidVideoItem.seqId;
                            }
                            this.LJIIIIZZ = new Pair<>(c1612360s3m7, Integer.valueOf(i2));
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        ((ArrayList) this.LJ).size();
        List<C1612360s3m> list2 = this.LJ;
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C1612360s3m c1612360s3m8 : (ArrayList) list2) {
            arrayList6.add(new Pair(Integer.valueOf(c1612360s3m8.LIZ.seqId), Boolean.valueOf(c1612360s3m8.LIZ.isSafetySelected())));
        }
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LJIIZILJ(PaidCollectionPanelResponse paidCollectionPanelResponse) {
        this.LJII = paidCollectionPanelResponse;
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LJIJJLI(PaidCollectionRecommendResponse paidCollectionRecommendResponse) {
        this.LJI = paidCollectionRecommendResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // X.InterfaceC1612220s3Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.String r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1612150s3R.LJIIJ(java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC1612220s3Y
    public final boolean LJIIJJI(int i, int i2) {
        C1612360s3m c1612360s3m;
        PaidVideoItem paidVideoItem;
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((C1612360s3m) it2.next()).LIZ.seqId == i) {
                if (i3 >= 0) {
                    int i4 = (i3 + i2) - 1;
                    int size = ((ArrayList) this.LJ).size() - 1;
                    if (i4 > size) {
                        i4 = size;
                    }
                    int i5 = (i + i2) - 1;
                    int iLIZJ = LIZJ();
                    if (i5 > iLIZJ) {
                        i5 = iLIZJ;
                    }
                    List<C1612360s3m> list = this.LJ;
                    if (list != null && (c1612360s3m = (C1612360s3m) C13LP.LJJJLZIJ(i4, list)) != null && (paidVideoItem = c1612360s3m.LIZ) != null && paidVideoItem.seqId == i5) {
                        z = true;
                    }
                    List<C1612360s3m> list2 = this.LJ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator it3 = ((ArrayList) list2).iterator();
                    while (it3.hasNext()) {
                        arrayList.add(Integer.valueOf(((C1612360s3m) it3.next()).LIZ.seqId));
                    }
                    return z;
                }
            } else {
                i3++;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1612220s3Y
    public final List LJIJI(int i, int i2) {
        boolean z;
        try {
            Iterator it2 = ((ArrayList) this.LJ).iterator();
            int i3 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((C1612360s3m) it2.next()).LIZ.seqId != i) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0 && !((ArrayList) this.LJ).isEmpty()) {
                if (!((ArrayList) this.LJ).isEmpty()) {
                    int i4 = i2 + i3;
                    int size = ((ArrayList) this.LJ).size();
                    if (i4 > size) {
                        i4 = size;
                    }
                    if (i3 == i4) {
                        return C1697810uHb.LJIILJJIL(((ArrayList) this.LJ).get(i3));
                    }
                    return ((ArrayList) this.LJ).subList(i3, i4);
                }
                return new ArrayList();
            }
            return new ArrayList();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new ArrayList();
        }
    }

    @Override // X.InterfaceC1612220s3Y
    public final void LJIILIIL(boolean z, boolean z2, Set set) {
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        PaidContentInfo paidContentInfo3;
        PaidContentInfo paidContentInfo4;
        if (set.isEmpty() && !z) {
            return;
        }
        int i = 0;
        for (Object obj : (ArrayList) this.LJ) {
            int i2 = i + 1;
            if (i >= 0) {
                C1612360s3m c1612360s3m = (C1612360s3m) obj;
                if (!set.contains(Long.valueOf(c1612360s3m.LIZ.paidVideoId)) && !z) {
                    Aweme aweme2 = c1612360s3m.LIZ.aweme;
                    if (aweme2 != null && (paidContentInfo4 = aweme2.mPaidContentInfo) != null) {
                        paidContentInfo4.setLastPurchasedVideoInOrder(false);
                    }
                } else {
                    Aweme aweme3 = c1612360s3m.LIZ.aweme;
                    if (aweme3 != null && (paidContentInfo3 = aweme3.mPaidContentInfo) != null) {
                        paidContentInfo3.setHasPurchasedVideo(z2);
                    }
                    Aweme aweme4 = c1612360s3m.LIZ.fullAweme;
                    if (aweme4 != null && (paidContentInfo2 = aweme4.mPaidContentInfo) != null) {
                        paidContentInfo2.setHasPurchasedVideo(z2);
                    }
                    Long l = (Long) C13LP.LJJLIIIJJIZ(set);
                    long j = c1612360s3m.LIZ.paidVideoId;
                    if (l != null && l.longValue() == j && (aweme = c1612360s3m.LIZ.aweme) != null && (paidContentInfo = aweme.mPaidContentInfo) != null) {
                        paidContentInfo.setLastPurchasedVideoInOrder(true);
                    }
                    ListProtector.set(this.LJ, i, C1612360s3m.LIZ(c1612360s3m, null, z2, z, false, 243));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
