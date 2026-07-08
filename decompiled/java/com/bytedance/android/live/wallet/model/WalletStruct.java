package com.bytedance.android.live.wallet.model;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletBalanceVersionV2Setting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes28.dex */
public class WalletStruct {
    public BalanceStructExtra LIZ;

    @C09CT("auto_exchange")
    public boolean autoExchange;

    @C09CT("auto_exchange_enable")
    public boolean autoExchangeEnable;

    @C09CT("auto_exchange_map")
    public HashMap<String, Boolean> autoExchangeMap = new HashMap<>();

    @C09CT("auto_exchange_supported")
    public boolean autoExchangeSupported;

    @C09CT("auto_send")
    public boolean autoSend;

    @C09CT("coins_balance_version")
    public volatile long coinBalanceVersion;

    @C09CT("coins_balance_version_v2")
    public volatile long coinsBalanceVersionV2;

    @C09CT("diamond")
    public volatile long diamond;

    @C09CT("frozen_diamond")
    public volatile long frozenDiamond;

    @C09CT("is_periodic_payout")
    public boolean isPeriodicPayout;

    @C09CT("exchange")
    public RevenueExchange revenue;

    public final long LIZ() {
        return LiveWalletBalanceVersionV2Setting.INSTANCE.getValue() ? this.coinsBalanceVersionV2 : this.coinBalanceVersion;
    }

    public final boolean LIZJ() {
        Boolean bool;
        HashMap<String, Boolean> map = this.autoExchangeMap;
        if (map == null || !this.autoExchangeSupported || (bool = map.get("LIVE")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LIZLLL() {
        Boolean bool;
        HashMap<String, Boolean> map = this.autoExchangeMap;
        if (map == null || (bool = map.get("UG")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LIZIZ(long j) {
        long jLIZ = LIZ();
        if (j > 0 && j <= jLIZ) {
            return false;
        }
        return true;
    }

    public final void LJ(long j, long j2, long j3, long j4) {
        synchronized (this) {
            try {
                if (LIZIZ(j2)) {
                    this.coinBalanceVersion = j2;
                    this.diamond = j;
                    this.frozenDiamond = j3;
                    this.coinsBalanceVersionV2 = j4;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
