package com.bytedance.android.live.rank.impl.list.viewmodel;

import X.AbstractC1809750xC9;
import X.C036E;
import X.C09JN;
import X.C0J1R;
import X.C0UO0;
import X.C1809970xCV;
import X.C1810110xCj;
import X.C1810120xCk;
import X.C1810140xCm;
import X.C1810410xDD;
import X.C480460Ism;
import X.C497740JfY;
import X.C501470JlZ;
import X.C501520Jle;
import X.EnumC1811400xEo;
import Y.AfS196S0100000_27;
import android.util.SparseLongArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.rank.impl.list.viewmodel.OfflineRankRootViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public final class OfflineRankRootViewModel extends RankRootViewModel {
    public DataChannel LLJJIJIL;
    public long LLJJJIL;
    public final boolean LLJJIJIIJIL = true;
    public final MutableLiveData<List<AbstractC1809750xC9>> LLJJJ = new MutableLiveData<>();

    public final C1810410xDD AQ2() {
        EnumC1811400xEo enumC1811400xEo = EnumC1811400xEo.DEFAULT;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJJIJIIJI;
        return new C1810410xDD(enumC1811400xEo, rankTypeV2, rankTypeV2, rankTypeV2, this.LLILZLL);
    }

    @Override // com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel
    public final boolean isOffline() {
        return this.LLJJIJIIJIL;
    }

    public final void BQ2(Throwable th) {
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 4052001) {
            this.LLJJJ.postValue(Collections.singletonList(new C1810140xCm(C497740JfY.LJIJI(2131851974), C497740JfY.LJIJI(2131851973))));
        } else {
            this.LLJJJ.postValue(Collections.singletonList(new C1809970xCV(AQ2())));
        }
    }

    public final void CQ2(final int i, Fragment fragment, final Function2<? super RankListV2Response.Data, ? super String, Unit> function2) {
        long j;
        fragment.getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                this.LLJJJ.postValue(Collections.singletonList(new C1810110xCj(AQ2())));
                if (fragment.isAdded()) {
                    C480460Ism.LIZ().getClass();
                    RankApi rankApi = (RankApi) C480460Ism.LIZLLL(RankApi.class);
                    long j2 = this.LLJJJIL;
                    if (this.LLILZLL) {
                        j = -1;
                    } else {
                        j = 0;
                    }
                    rankApi.getOfflineRankList(j2, i, j, true, true).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new C09JN() { // from class: X.0xBY
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            long j3;
                            C1C7U.LIZ("OfflineRankRootViewModel@a83c.requestData$1");
                            String str = (String) obj;
                            OfflineRankRootViewModel offlineRankRootViewModel = this.LL;
                            int i2 = i;
                            Function2<RankListV2Response.Data, String, Unit> function22 = function2;
                            offlineRankRootViewModel.getClass();
                            RankListV2Response.Data dataLIZ = C147700hP.LIZ(str);
                            if (dataLIZ != null && dataLIZ.rankView != null) {
                                SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                                C1810700xDg.LJI(offlineRankRootViewModel.LLJJIJIL, dataLIZ);
                                RankListV2Response.RankView rankView = dataLIZ.rankView;
                                if (rankView != null) {
                                    if (rankView.history) {
                                        j3 = -1;
                                    } else {
                                        j3 = 0;
                                    }
                                    rankView.LIZ = j3;
                                    List<SubRankTabInfo> list = rankView.subTabs;
                                    if (list == null || list.isEmpty()) {
                                        SubRankTabInfo subRankTabInfo = new SubRankTabInfo();
                                        subRankTabInfo.rankType = i2;
                                        rankView.subTabs = Collections.singletonList(subRankTabInfo);
                                    }
                                    function22.invoke(dataLIZ, str);
                                }
                                offlineRankRootViewModel.LLJJJ.postValue(null);
                            } else {
                                offlineRankRootViewModel.BQ2(null);
                            }
                            C1C7U.LIZIZ("OfflineRankRootViewModel@a83c.requestData$1");
                        }
                    }, new AfS196S0100000_27(this, 12));
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJJJ.postValue(Collections.singletonList(new C1810120xCk(AQ2())));
    }
}
