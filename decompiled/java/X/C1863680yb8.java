package X;

import com.ss.android.ugc.aweme.tako.experiment.ConvListOptConfig;
import com.ss.android.ugc.aweme.tako.experiment.HistoryOptConfig;
import com.ss.android.ugc.aweme.tako.experiment.RefreshLoadingConfig;
import com.ss.android.ugc.aweme.tako.experiment.SkeletonOptConfig;
import com.ss.android.ugc.aweme.tako.experiment.SugOptConfig;
import com.ss.android.ugc.aweme.tako.experiment.WeakNetworkOptConfig;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0yb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863680yb8 {
    public static final WeakNetworkOptConfig LIZ = new WeakNetworkOptConfig(new SugOptConfig(new SkeletonOptConfig(false, false, 0), 0), new ConvListOptConfig(new SkeletonOptConfig(false, false, 0), new RefreshLoadingConfig(false, 0), 0), new HistoryOptConfig(false, 0));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(18));

    public static WeakNetworkOptConfig LIZ() {
        return (WeakNetworkOptConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().convList.skeleton.enable;
    }

    public static boolean LIZJ() {
        if (LIZ().sug.skeleton.enable) {
            return LIZ().sug.skeleton.shimmerEffect;
        }
        return true;
    }

    public static boolean LIZLLL() {
        return LIZ().sug.skeleton.enable;
    }
}
