package com.bytedance.android.live.wallet.viewmodel.exchange.base;

import X.C01GW;
import X.C0UO0;
import X.C1142550fq1;
import X.C1149680g1W;
import X.C1150000g22;
import X.C1150020g24;
import X.C1151740g4q;
import X.C11NJ;
import X.C1796540wqq;
import X.C2097608Jq;
import X.C2348809Ig;
import X.C452501pT;
import X.EnumC1796260wqO;
import X.InterfaceC1150010g23;
import Y.AfS186S0100000_17;
import Y.AfS43S1200000_17;
import android.content.Context;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ExchangeFirstStageVM extends ExchangeDialogVM {
    public final Context LLIZ;
    public final InterfaceC1150010g23 LLIZLLLIL;
    public final C11NJ LLJ = new C11NJ();
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(26));

    public final Map<String, String> QQ2() {
        Pair[] pairArr = new Pair[4];
        int iRQ2 = RQ2();
        pairArr[0] = new Pair("exchange_type", iRQ2 != 0 ? iRQ2 != 1 ? "" : "anchor_income" : "ug_exchange");
        pairArr[1] = new Pair("exchange_scenario", xQ2());
        pairArr[2] = new Pair("charge_reason", zQ2().LJ);
        pairArr[3] = new Pair("request_page", "live_detail");
        return C2097608Jq.LJIIJ(pairArr);
    }

    public abstract int RQ2();

    public abstract void SQ2();

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void OQ2() {
        this.LLIZLLLIL.LJ();
        C11NJ c11nj = this.LLJ;
        C1150020g24 c1150020g24 = (C1150020g24) this.LLJI.getValue();
        c11nj.LIZ(c1150020g24.LIZ().LJIILIIL(new C0UO0()).LJJIJIIJIL(new AfS43S1200000_17(c1150020g24, null, this.LLIZ, 1)).LJJIIZ(new C1151740g4q(this, 1)).LJJLL(new AfS186S0100000_17(this, 23), new AfS186S0100000_17(this, 24)));
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public void onShow() {
        C1150020g24 c1150020g24 = (C1150020g24) this.LLJI.getValue();
        if (c1150020g24 != null) {
            c1150020g24.LIZIZ(0, RQ2(), 111);
        }
        String strLIZ = C1142550fq1.LIZ(1);
        if (strLIZ != null) {
            C1142550fq1.LIZJ(strLIZ, "daily_ug_consume_task", zQ2().LIZLLL);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJ.LJ();
    }

    public ExchangeFirstStageVM(Context context, InterfaceC1150010g23 interfaceC1150010g23) {
        this.LLIZ = context;
        this.LLIZLLLIL = interfaceC1150010g23;
    }

    public final void PQ2(C1150000g22 c1150000g22, Throwable th) {
        String str;
        try {
            Map<String, String> mapQQ2 = QQ2();
            if (th != null || (c1150000g22 != null && (th = c1150000g22.LIZ) != null)) {
                C1149680g1W.LIZIZ(th, mapQQ2);
            } else {
                mapQQ2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                if (c1150000g22 != null && Boolean.valueOf(c1150000g22.LIZIZ) != null) {
                    if (c1150000g22.LIZIZ) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    str = "-1";
                }
                mapQQ2.put("kyc_hit_cache", str);
            }
            C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_exchange_kyc_return", C2348809Ig.LIZLLL(C2097608Jq.LJIIZILJ(mapQQ2)), null, null, null, "wallet");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
