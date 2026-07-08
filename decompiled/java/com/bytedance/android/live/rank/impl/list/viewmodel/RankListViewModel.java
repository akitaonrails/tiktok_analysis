package com.bytedance.android.live.rank.impl.list.viewmodel;

import X.AbstractC1809750xC9;
import X.C1133830fbx;
import X.C1790870whh;
import X.C1809780xCC;
import X.C1809870xCL;
import X.C1809930xCR;
import X.C1809940xCS;
import X.C1809950xCT;
import X.C1809970xCV;
import X.C1809980xCW;
import X.C1810000xCY;
import X.C1810410xDD;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingNewUISetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.ranklist.RankExtraInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class RankListViewModel extends ViewModel {
    public C1810410xDD LL;
    public RankListV2Response.RankView LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final MutableLiveData<List<AbstractC1809750xC9>> LLILZIL;
    public final MutableLiveData<RankListV2Response.RankInfo> LLILZLL;
    public final MutableLiveData<C1809980xCW> LLIZ;
    public final MutableLiveData<C1810000xCY> LLIZLLLIL;
    public final MutableLiveData<List<RankListV2Response.Bulletin>> LLJ;
    public final MutableLiveData<C1790870whh> LLJI;
    public final MutableLiveData<C1809780xCC> LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public RankListV2Response.ClassExtra LLJILLL;

    public final boolean zQ2() {
        RankTypeV2 rankTypeV2 = this.LL.LIZIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        return Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI) && LivePopularityRankingNewUISetting.INSTANCE.getValue();
    }

    public RankListViewModel() {
        C1810410xDD c1810410xDD = C1810410xDD.LJI;
        this.LL = C1810410xDD.LJI;
        this.LLILZIL = new MutableLiveData<>();
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>();
    }

    public final void wQ2(boolean z) {
        if (!z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1809970xCV(this.LL));
            this.LLILZIL.postValue(arrayList);
            this.LLILZLL.postValue(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0395 A[PHI: r9
      0x0395: PHI (r9v14 int) = (r9v13 int), (r9v19 int), (r9v19 int) binds: [B:249:0x0391, B:82:0x0127, B:84:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x039a A[PHI: r8 r9
      0x039a: PHI (r8v8 int) = (r8v7 int), (r8v11 int), (r8v11 int) binds: [B:252:0x0396, B:87:0x0131, B:89:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x039a: PHI (r9v15 int) = (r9v14 int), (r9v18 int), (r9v18 int) binds: [B:252:0x0396, B:87:0x0131, B:89:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8 A[PHI: r5
      0x00f8: PHI (r5v50 int) = (r5v49 int), (r5v52 int), (r5v52 int) binds: [B:63:0x00f5, B:56:0x00dc, B:58:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankView r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel.vQ2(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView, boolean):void");
    }

    public final void xQ2(List<AbstractC1809750xC9> list, RankListV2Response.RankView rankView) {
        Object c1809950xCT;
        RankListV2Response.ClassExtra classExtra;
        List<RankListV2Response.RankInfo> list2 = rankView.ranks;
        if (list2 != null) {
            boolean zZQ2 = zQ2();
            int i = 0;
            int i2 = 3;
            if (list2.size() > 3) {
                if (zZQ2) {
                    int i3 = 0;
                    do {
                        ((ArrayList) list).add(new C1809950xCT((RankListV2Response.RankInfo) ListProtector.get(list2, i3), this.LL));
                        i3++;
                    } while (i3 < 3);
                } else {
                    ((ArrayList) list).add(new C1809930xCR(this.LL, list2.subList(0, Math.min(3, list2.size()))));
                }
            }
            if (list2.size() <= 3) {
                i2 = 0;
            }
            int size = list2.size();
            while (i2 < size) {
                List<RankListV2Response.CutOffLine> list3 = rankView.cutOffLine;
                if (list3 != null && i < list3.size() && i2 == ((int) ((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).cutOffIndex)) {
                    ((ArrayList) list).add(new C1809870xCL(C1133830fbx.LJIILIIL(((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).content, "").toString()));
                    i++;
                }
                RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) ListProtector.get(list2, i2);
                if (Intrinsics.LJFF(this.LL.LIZIZ, RankTypeV2.LJIL)) {
                    ImageModel imageModel = rankInfo.creatorImage;
                    if (imageModel == null) {
                        RankExtraInfo rankExtraInfo = rankView.rankExtraInfo;
                        if (rankExtraInfo != null && (classExtra = rankExtraInfo.classExtra) != null) {
                            imageModel = classExtra.creatorClassImage;
                        } else {
                            imageModel = null;
                        }
                    }
                    rankInfo.creatorImage = imageModel;
                }
                if (zZQ2) {
                    c1809950xCT = new C1809940xCS(rankInfo, this.LL);
                } else {
                    c1809950xCT = new C1809950xCT(rankInfo, this.LL);
                }
                ((ArrayList) list).add(c1809950xCT);
                i2++;
            }
            if (i < rankView.cutOffLine.size() && list2.size() <= ((int) ((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).cutOffIndex)) {
                ((ArrayList) list).add(new C1809870xCL(C1133830fbx.LJIILIIL(((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).content, "").toString()));
            }
        }
    }

    public final void yQ2(List<AbstractC1809750xC9> list, RankListV2Response.RankView rankView) {
        Object c1809950xCT;
        RankListV2Response.ClassExtra classExtra;
        List<RankListV2Response.RankInfo> list2 = rankView.ranks;
        if (list2 != null) {
            boolean zZQ2 = zQ2();
            int size = list2.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                List<RankListV2Response.CutOffLine> list3 = rankView.cutOffLine;
                if (list3 != null && i < list3.size() && i2 == ((int) ((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).cutOffIndex)) {
                    ((ArrayList) list).add(new C1809870xCL(C1133830fbx.LJIILIIL(((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).content, "").toString()));
                    i++;
                }
                RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) ListProtector.get(list2, i2);
                if (Intrinsics.LJFF(this.LL.LIZIZ, RankTypeV2.LJIL)) {
                    ImageModel imageModel = rankInfo.creatorImage;
                    if (imageModel == null) {
                        RankExtraInfo rankExtraInfo = rankView.rankExtraInfo;
                        if (rankExtraInfo != null && (classExtra = rankExtraInfo.classExtra) != null) {
                            imageModel = classExtra.creatorClassImage;
                        } else {
                            imageModel = null;
                        }
                    }
                    rankInfo.creatorImage = imageModel;
                }
                if (zZQ2) {
                    c1809950xCT = new C1809940xCS(rankInfo, this.LL);
                } else {
                    c1809950xCT = new C1809950xCT(rankInfo, this.LL);
                }
                ((ArrayList) list).add(c1809950xCT);
            }
            if (i < rankView.cutOffLine.size() && list2.size() <= ((int) ((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).cutOffIndex)) {
                ((ArrayList) list).add(new C1809870xCL(C1133830fbx.LJIILIIL(((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).content, "").toString()));
            }
        }
    }
}
