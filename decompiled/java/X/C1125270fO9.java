package X;

import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder;
import com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.LiveFastFirstRechargeHolderDummy;
import com.bytedance.android.livesdk.impl.revenue.strategy.firstrecharge.LiveFastFirstRechargeHolder;

/* JADX INFO: renamed from: X.0fO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125270fO9 {
    public static ILiveFastFirstRechargeHolder LIZ() {
        LiveFastFirstRechargeHolder liveFastFirstRechargeHolderED = ((IRevenueStrategyService) C1161920gLG.LIZJ(IRevenueStrategyService.class)).ED();
        return liveFastFirstRechargeHolderED == null ? new LiveFastFirstRechargeHolderDummy() : liveFastFirstRechargeHolderED;
    }
}
