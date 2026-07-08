package com.bytedance.android.live.rank.impl.list.viewmodel;

import X.AbstractC1809750xC9;
import X.C036E;
import X.C0J1R;
import X.C0UO0;
import X.C1085110eLN;
import X.C1790730whT;
import X.C1790870whh;
import X.C1809970xCV;
import X.C1810000xCY;
import X.C1810070xCf;
import X.C1810080xCg;
import X.C1810110xCj;
import X.C1810120xCk;
import X.C1810160xCo;
import X.C1810210xCt;
import X.C1810410xDD;
import X.C1811310xEf;
import X.C235000vU;
import X.C480460Ism;
import X.C497740JfY;
import X.EnumC1811400xEo;
import X.InterfaceC1810130xCl;
import X.InterfaceC1810230xCv;
import Y.AfS0S0420000_27;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.ranklist.LynxRankView;

/* JADX INFO: loaded from: classes28.dex */
public final class RankPageViewModel extends ViewModel {
    public boolean LL;
    public DataChannel LLILLJJLI;
    public EnumC1811400xEo LLILLL = EnumC1811400xEo.DEFAULT;
    public RankTypeV2 LLILZ;
    public boolean LLILZIL;
    public final MutableLiveData<List<AbstractC1809750xC9>> LLILZLL;
    public final MutableLiveData<C1810160xCo> LLIZ;
    public List<? extends SubRankTabInfo> LLIZLLLIL;
    public final MutableLiveData<C1810000xCY> LLJ;
    public final MutableLiveData<C1790730whT> LLJI;
    public final MutableLiveData<List<RankListV2Response.Bulletin>> LLJIJIL;
    public final MutableLiveData<LynxRankView> LLJILJIL;
    public final MutableLiveData<RankListV2Response.RankView> LLJILJILJ;
    public final MutableLiveData<C1790870whh> LLJILLL;
    public final MutableLiveData<RankListV2Response.RankView> LLJJ;
    public int LLJJI;
    public RankTypeV2 LLJJIII;
    public String LLJJIJI;

    public final void wQ2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1809970xCV(vQ2(this.LLJJIII)));
        this.LLILZLL.postValue(arrayList);
    }

    public RankPageViewModel() {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LJJIJIIJI;
        this.LLILZ = rankTypeV22;
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = new MutableLiveData<>();
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>();
        this.LLJILJIL = new MutableLiveData<>();
        this.LLJILJILJ = new MutableLiveData<>();
        this.LLJILLL = new MutableLiveData<>();
        this.LLJJ = new MutableLiveData<>();
        this.LLJJIII = rankTypeV22;
    }

    public final void AQ2(int i) {
        int i2;
        int i3;
        SubRankTabInfo subRankTabInfo;
        SubRankTabInfo subRankTabInfo2;
        this.LLJJI = i;
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        List<? extends SubRankTabInfo> list = this.LLIZLLLIL;
        if (list != null && (subRankTabInfo2 = (SubRankTabInfo) ListProtector.get(list, i)) != null) {
            i2 = subRankTabInfo2.rankType;
        } else {
            i2 = -1;
        }
        List<? extends SubRankTabInfo> list2 = this.LLIZLLLIL;
        if (list2 != null && (subRankTabInfo = (SubRankTabInfo) ListProtector.get(list2, this.LLJJI)) != null) {
            i3 = subRankTabInfo.LIZ;
        } else {
            i3 = 0;
        }
        this.LLJJIII = C235000vU.LIZ(i2, i3);
    }

    public final C1810410xDD vQ2(RankTypeV2 rankTypeV2) {
        return new C1810410xDD(this.LLILLL, rankTypeV2, rankTypeV2, this.LLILZ, this.LLILZIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(java.lang.String r22, com.bytedance.android.livesdk.rank.api.RankTypeV2 r23, boolean r24, boolean r25, X.InterfaceC1810130xCl r26, X.C1810070xCf r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel.xQ2(java.lang.String, com.bytedance.android.livesdk.rank.api.RankTypeV2, boolean, boolean, X.0xCl, X.0xCf, boolean):void");
    }

    public final void yQ2(Throwable th, int i, int i2, boolean z, boolean z2, InterfaceC1810130xCl interfaceC1810130xCl, C1810070xCf c1810070xCf) {
        if (z) {
            wQ2();
        } else {
            interfaceC1810130xCl.LIZJ();
        }
        if (!z2) {
            C1810210xCt.LJI(th, i, i2, c1810070xCf.LIZ, c1810070xCf.LIZIZ, c1810070xCf.LIZJ, c1810070xCf.LIZLLL);
        }
    }

    public final void zQ2(final RankTypeV2 rankTypeV2, final Fragment fragment, long j, long j2, final boolean z, final boolean z2, final C1810070xCf c1810070xCf, final InterfaceC1810130xCl interfaceC1810130xCl, C1810080xCg c1810080xCg) {
        long j3;
        long j4;
        RankTypeV2 rankTypeV22;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1810110xCj(vQ2(this.LLJJIII)));
            this.LLILZLL.postValue(arrayList);
            String str = this.LLJJIJI;
            if (str != null) {
                xQ2(str, rankTypeV2, true, false, interfaceC1810130xCl, c1810070xCf, false);
                return;
            }
            String strLIZ = C1085110eLN.LIZ(rankTypeV2.type, rankTypeV2.rankPhase, this.LLILZIL);
            if (strLIZ != null) {
                xQ2(strLIZ, rankTypeV2, true, false, interfaceC1810130xCl, c1810070xCf, true);
                return;
            }
            C497740JfY.LJII();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C1810120xCk(vQ2(this.LLJJIII)));
                this.LLILZLL.postValue(arrayList2);
                return;
            }
        } else if (!z2) {
            this.LLIZ.postValue(new C1810160xCo(vQ2(rankTypeV2), false));
            this.LLJI.postValue(new C1790730whT(vQ2(rankTypeV2), ""));
        }
        if (fragment.isAdded()) {
            if (z) {
                C1811310xEf.LIZIZ();
                if (c1810080xCg != null) {
                    rankTypeV22 = c1810080xCg.LIZLLL;
                } else {
                    rankTypeV22 = null;
                }
                if (Intrinsics.LJFF(rankTypeV22, rankTypeV2)) {
                    InterfaceC1810230xCv interfaceC1810230xCv = new InterfaceC1810230xCv() { // from class: X.0xCb
                        @Override // X.InterfaceC1810230xCv
                        public final void LIZ(Throwable th) {
                            if (fragment.isAdded()) {
                                RankPageViewModel rankPageViewModel = this;
                                RankTypeV2 rankTypeV23 = rankTypeV2;
                                rankPageViewModel.yQ2(th, rankTypeV23.type, rankTypeV23.rankPhase, z, z2, interfaceC1810130xCl, c1810070xCf);
                            }
                        }

                        @Override // X.InterfaceC1810230xCv
                        public final void LIZIZ(String str2) {
                            if (fragment.isAdded()) {
                                this.xQ2(str2, rankTypeV2, z, z2, interfaceC1810130xCl, c1810070xCf, false);
                            }
                        }
                    };
                    String str2 = c1810080xCg.LIZ;
                    if (str2 == null) {
                        if (c1810080xCg.LIZIZ == null) {
                            c1810080xCg.LIZJ = interfaceC1810230xCv;
                            return;
                        }
                    } else {
                        interfaceC1810230xCv.LIZIZ(str2);
                    }
                    Throwable th = c1810080xCg.LIZIZ;
                    if (th == null) {
                        return;
                    }
                    interfaceC1810230xCv.LIZ(th);
                    return;
                }
            }
            if (!z2) {
                C1810210xCt.LIZLLL(rankTypeV2.type, rankTypeV2.rankPhase);
            }
            if (!this.LL) {
                C480460Ism.LIZ().getClass();
                RankApi rankApi = (RankApi) C480460Ism.LIZLLL(RankApi.class);
                String strValueOf = String.valueOf(rankTypeV2.type);
                if (this.LLILZIL) {
                    j4 = -1;
                } else {
                    j4 = 0;
                }
                rankApi.getRankListV2(j2, j, strValueOf, 1, j4, true, rankTypeV2.rankPhase).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new AfS0S0420000_27(this, rankTypeV2, z, z2, interfaceC1810130xCl, c1810070xCf, 0), new AfS0S0420000_27(this, rankTypeV2, z, z2, interfaceC1810130xCl, c1810070xCf, 1));
                return;
            }
            C480460Ism.LIZ().getClass();
            RankApi rankApi2 = (RankApi) C480460Ism.LIZLLL(RankApi.class);
            int i = rankTypeV2.type;
            if (this.LLILZIL) {
                j3 = -1;
            } else {
                j3 = 0;
            }
            rankApi2.getOfflineRankList(j2, i, j3, false, true).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new AfS0S0420000_27(this, rankTypeV2, z, z2, interfaceC1810130xCl, c1810070xCf, 2), new AfS0S0420000_27(this, rankTypeV2, z, z2, interfaceC1810130xCl, c1810070xCf, 3));
        }
    }
}
