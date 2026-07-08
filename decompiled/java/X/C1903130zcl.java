package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS112S1000000_28;

/* JADX INFO: renamed from: X.0zcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903130zcl {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ;

    public final Keva LIZ() {
        return (Keva) this.LIZ.getValue();
    }

    public final boolean LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZ().getLong("last_exposure_timestamp", 0L);
        C1903610zdX.LIZ.getClass();
        long j = 60;
        return jCurrentTimeMillis >= (((((long) C1903610zdX.LIZIZ().exposureCooldownDays) * ((long) 24)) * j) * j) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public C1903130zcl(String str) {
        this.LIZ = C452501pT.LIZIZ(new AwS112S1000000_28(str, 20));
    }
}
