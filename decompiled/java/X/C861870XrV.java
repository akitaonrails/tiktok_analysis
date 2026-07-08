package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig;
import java.util.Random;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0XrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861870XrV {
    public static final int LIZ = new Random().nextInt(100);
    public static final ToolsBaseInfoConfig LIZIZ = new ToolsBaseInfoConfig(false, Mp4ScreenVideoLoadTimeout.CONTROL, 2000, 50);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(350));

    public static final boolean LIZ() {
        C01GW c01gw = LIZJ;
        return ((ToolsBaseInfoConfig) c01gw.getValue()).enable && ((long) LIZ) <= ((ToolsBaseInfoConfig) c01gw.getValue()).samplingRate;
    }
}
