package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeHitCacheOptimizationSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0x59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805410x59 {
    public static final /* synthetic */ int LIZ = 0;

    public static Diamond LIZLLL(List list) {
        ArrayList<Diamond> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (Diamond diamond : arrayList) {
            if (diamond.LIZ == 0) {
                return diamond;
            }
        }
        return null;
    }

    public static Diamond LIZ(List list, C1803830x2b c1803830x2b) {
        long j = c1803830x2b.LJII;
        if (j > 0 && !C1841090y0h.LIZ(list)) {
            for (Diamond diamond : (ArrayList) list) {
                int i = diamond.count;
                if (c1803830x2b.LJ == 0) {
                    i += diamond.givingCount;
                }
                if (i >= j) {
                    return diamond;
                }
            }
            return (Diamond) C13LP.LJJLIIIJJI(list);
        }
        return null;
    }

    public static Diamond LIZIZ(Integer num, List list) {
        if (num == null) {
            return null;
        }
        for (Diamond diamond : (ArrayList) list) {
            if (num.intValue() == diamond.id && diamond.LIZ == 0) {
                return diamond;
            }
        }
        return null;
    }

    public static Diamond LIZJ(List list, Integer num, Integer num2, C1803830x2b c1803830x2b) {
        ArrayList<Diamond> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return null;
        }
        long j = c1803830x2b.LJII;
        if (LiveRechargeHitCacheOptimizationSetting.INSTANCE.getValue().enable && j > 0 && j <= r1.getValue().coinsThreshold) {
            return LIZ(list, c1803830x2b);
        }
        if (C1804050x2x.LIZ().LIZ()) {
            Diamond diamondLIZ = LIZ(list, c1803830x2b);
            if (diamondLIZ != null) {
                return diamondLIZ;
            }
            Diamond diamondLIZIZ = LIZIZ(num, list);
            if (diamondLIZIZ != null) {
                return diamondLIZIZ;
            }
        } else {
            Diamond diamondLIZIZ2 = LIZIZ(num, list);
            if (diamondLIZIZ2 != null) {
                return diamondLIZIZ2;
            }
            Diamond diamondLIZ2 = LIZ(list, c1803830x2b);
            if (diamondLIZ2 != null) {
                return diamondLIZ2;
            }
        }
        if (num == null) {
            return null;
        }
        Integer num3 = (Integer) DataChannelGlobal.LLILZ.gg0(AnonymousClass1688.class);
        if (num3 == null || num3.intValue() != 0) {
            num2 = num3;
        }
        for (Diamond diamond : arrayList) {
            int i = diamond.id;
            if (num2 != null && num2.intValue() == i && diamond.LIZ == 0) {
                return diamond;
            }
        }
        return null;
    }
}
