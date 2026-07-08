package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.network.ECNetworkScoreConfigModel;

/* JADX INFO: renamed from: X.0opW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1488200opW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ECNetworkScoreConfigModel.Aggregation.values().length];
        try {
            iArr[ECNetworkScoreConfigModel.Aggregation.MEAN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[ECNetworkScoreConfigModel.Aggregation.P50.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
