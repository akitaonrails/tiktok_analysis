package X;

import com.bytedance.android.livesdk.gift.model.GiftRealTimeStrategyData;

/* JADX INFO: renamed from: X.012L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012L {
    public GiftRealTimeStrategyData LIZ = new GiftRealTimeStrategyData();

    public final String LIZ(long j) {
        GiftRealTimeStrategyData giftRealTimeStrategyData = this.LIZ;
        if (giftRealTimeStrategyData != null) {
            return giftRealTimeStrategyData.giftidToStrategyEvent.get(Long.valueOf(j));
        }
        return null;
    }
}
