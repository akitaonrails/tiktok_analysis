package Y;

import X.C09JN;
import X.C1810070xCf;
import X.C1C7U;
import X.InterfaceC1810130xCl;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;

/* JADX INFO: loaded from: classes28.dex */
public class AfS0S0420000_27 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0420000_27 afS0S0420000_27, Object obj) {
        C1C7U.LIZ("RankPageViewModel@22c7.requestListData$disposable$1");
        ((RankPageViewModel) afS0S0420000_27.l0).xQ2((String) obj, (RankTypeV2) afS0S0420000_27.l1, afS0S0420000_27.z4, afS0S0420000_27.z5, (InterfaceC1810130xCl) afS0S0420000_27.l2, (C1810070xCf) afS0S0420000_27.l3, false);
        C1C7U.LIZIZ("RankPageViewModel@22c7.requestListData$disposable$1");
    }

    public static final void accept$1(AfS0S0420000_27 afS0S0420000_27, Object obj) {
        C1C7U.LIZ("RankPageViewModel@22c7.requestListData$disposable$2");
        RankPageViewModel rankPageViewModel = (RankPageViewModel) afS0S0420000_27.l0;
        RankTypeV2 rankTypeV2 = (RankTypeV2) afS0S0420000_27.l1;
        rankPageViewModel.yQ2((Throwable) obj, rankTypeV2.type, rankTypeV2.rankPhase, afS0S0420000_27.z4, afS0S0420000_27.z5, (InterfaceC1810130xCl) afS0S0420000_27.l2, (C1810070xCf) afS0S0420000_27.l3);
        C1C7U.LIZIZ("RankPageViewModel@22c7.requestListData$disposable$2");
    }

    public static final void accept$2(AfS0S0420000_27 afS0S0420000_27, Object obj) {
        C1C7U.LIZ("RankPageViewModel@22c7.requestListData$disposable$3");
        ((RankPageViewModel) afS0S0420000_27.l0).xQ2((String) obj, (RankTypeV2) afS0S0420000_27.l1, afS0S0420000_27.z4, afS0S0420000_27.z5, (InterfaceC1810130xCl) afS0S0420000_27.l2, (C1810070xCf) afS0S0420000_27.l3, false);
        C1C7U.LIZIZ("RankPageViewModel@22c7.requestListData$disposable$3");
    }

    public static final void accept$3(AfS0S0420000_27 afS0S0420000_27, Object obj) {
        C1C7U.LIZ("RankPageViewModel@22c7.requestListData$disposable$4");
        RankPageViewModel rankPageViewModel = (RankPageViewModel) afS0S0420000_27.l0;
        RankTypeV2 rankTypeV2 = (RankTypeV2) afS0S0420000_27.l1;
        rankPageViewModel.yQ2((Throwable) obj, rankTypeV2.type, rankTypeV2.rankPhase, afS0S0420000_27.z4, afS0S0420000_27.z5, (InterfaceC1810130xCl) afS0S0420000_27.l2, (C1810070xCf) afS0S0420000_27.l3);
        C1C7U.LIZIZ("RankPageViewModel@22c7.requestListData$disposable$4");
    }

    public AfS0S0420000_27(RankPageViewModel rankPageViewModel, RankTypeV2 rankTypeV2, boolean z, boolean z2, InterfaceC1810130xCl interfaceC1810130xCl, C1810070xCf c1810070xCf, int i) {
        this.$t = i;
        this.l0 = rankPageViewModel;
        this.l1 = rankTypeV2;
        this.z4 = z;
        this.z5 = z2;
        this.l2 = interfaceC1810130xCl;
        this.l3 = c1810070xCf;
    }
}
