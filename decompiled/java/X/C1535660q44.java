package X;

import com.ss.android.ugc.aweme.hybridkit.experiment.SparkTransparentLoadingConfigModel;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0q44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535660q44 {
    public static final SparkTransparentLoadingConfigModel LIZ;
    public static final C01GW LIZIZ;

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZ = new SparkTransparentLoadingConfigModel(false, c13bv);
        new SparkTransparentLoadingConfigModel(true, c13bv);
        LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(122));
    }

    public static final SparkTransparentLoadingConfigModel LIZ() {
        return (SparkTransparentLoadingConfigModel) LIZIZ.getValue();
    }
}
