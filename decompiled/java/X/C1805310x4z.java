package X;

import Y.AObjectS370S0100000_27;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.data.model.wallet.WalletInfoExtra;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.livesetting.wallet.LiveBalanceTrackingSetting;

/* JADX INFO: renamed from: X.0x4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805310x4z implements C09JN<BaseResponse<WalletStruct, WalletInfoExtra>> {
    public final /* synthetic */ EnumC1805800x5m LL;
    public final /* synthetic */ EnumC1805420x5A LLILLJJLI;
    public final /* synthetic */ InterfaceC1803980x2q LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ WalletCenter LLIZ;

    @Override // X.C09JN
    public final void accept(BaseResponse<WalletStruct, WalletInfoExtra> baseResponse) {
        long jLIZ;
        BalanceStructExtra balanceStructExtra;
        RevenueExchange revenueExchange;
        C1C7U.LIZ("WalletCenter@6213.sync$1");
        BaseResponse<WalletStruct, WalletInfoExtra> baseResponse2 = baseResponse;
        WalletStruct walletStruct = baseResponse2.data;
        if (walletStruct != null) {
            WalletCenter walletCenter = this.LLIZ;
            walletCenter.LLJI = EnumC1151140g3s.SUCCESS;
            walletCenter.LJIJI(walletStruct);
            WalletStruct walletStruct2 = this.LLIZ.LL;
            if (walletStruct2 != null) {
                balanceStructExtra = walletStruct2.LIZ;
            } else {
                balanceStructExtra = null;
            }
            WalletExchange walletExchange = WalletExchange.LL;
            boolean zLIZLLL = baseResponse2.data.LIZLLL();
            walletExchange.getClass();
            WalletExchange.LJJIIZ(zLIZLLL);
            WalletExchange.LJJIIJZLJL(baseResponse2.data.LIZJ());
            InterfaceC1094160eZy.P0.LJFF(-1);
            WalletStruct walletStruct3 = this.LLIZ.LL;
            if (walletStruct3 != null && (revenueExchange = walletStruct3.revenue) != null && revenueExchange.enableExchange) {
                walletStruct3.LIZ = balanceStructExtra;
                WalletExchange.LJJIJ(this.LL, this.LLILLJJLI, revenueExchange.currency, revenueExchange.region, revenueExchange.balance, new AObjectS370S0100000_27(this, 7), new AObjectS370S0100000_27(this, 8));
            }
            this.LLILLL.LIZ(baseResponse2.data.diamond);
            WalletCenter walletCenter2 = this.LLIZ;
            walletCenter2.LLILZLL.onNext(Long.valueOf(walletCenter2.No0()));
        } else {
            this.LLILLL.LIZIZ(new C501500Jlc());
        }
        R r = baseResponse2.extra;
        if (r != 0) {
            WalletInfoExtra walletInfoExtra = (WalletInfoExtra) r;
            this.LLIZ.LLILLJJLI = walletInfoExtra;
            if (walletInfoExtra.getRechargeRetentionPopupConfig().containsKey("recharge_cancel_retention_dialog")) {
                C750340Tc0.LIZJ(this.LLIZ.LLILLJJLI.getRechargeRetentionPopupConfig().get("recharge_cancel_retention_dialog"));
            }
            this.LLIZ.LJJI();
        }
        boolean z = false;
        C1803970x2p.LIZ(SystemClock.uptimeMillis() - this.LLILZ, 0, null);
        if (LiveBalanceTrackingSetting.INSTANCE.getValue()) {
            String value = this.LL.getValue();
            String value2 = this.LLILLJJLI.getValue();
            Long lValueOf = Long.valueOf(this.LLILZIL);
            WalletStruct walletStruct4 = this.LLIZ.LL;
            if (walletStruct4 == null) {
                jLIZ = 0;
            } else {
                jLIZ = walletStruct4.LIZ();
            }
            Long lValueOf2 = Long.valueOf(jLIZ);
            boolean zLJIIZILJ = this.LLIZ.LJIIZILJ(this.LLILZLL);
            if (baseResponse2.data != null) {
                z = true;
            }
            C1150880g3S.LIZIZ(value, value2, lValueOf, lValueOf2, zLJIIZILJ, z);
        }
        C1C7U.LIZIZ("WalletCenter@6213.sync$1");
    }

    public C1805310x4z(WalletCenter walletCenter, EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A, InterfaceC1803980x2q interfaceC1803980x2q, long j, long j2, long j3) {
        this.LLIZ = walletCenter;
        this.LL = enumC1805800x5m;
        this.LLILLJJLI = enumC1805420x5A;
        this.LLILLL = interfaceC1803980x2q;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = j3;
    }
}
