package X;

import com.ss.android.ugc.feed.platform.metric.model.DeviceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DD6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DD6 extends C09AY implements Function1<DeviceInfo, Unit> {
    public C1DD6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DeviceInfo deviceInfo) {
        DeviceInfo deviceInfo2 = deviceInfo;
        if (deviceInfo2.screenHeightPageCouldUse > 0 && deviceInfo2.screenWidthPageCouldUse > 0) {
            new C07XC(deviceInfo2);
            C0T6L.LIZLLL();
            C1DD7 c1dd7 = C1DDC.LLILZLL;
            c1dd7.LIZ = deviceInfo2.screenWidthPageCouldUse;
            c1dd7.LIZIZ = deviceInfo2.screenHeightPageCouldUse;
            c1dd7.LIZJ = deviceInfo2.screenDpi;
            c1dd7.LIZLLL = deviceInfo2.screenDip;
            c1dd7.LJ = deviceInfo2.screenResolution;
            c1dd7.LJFF = deviceInfo2.screenRating;
        }
        return Unit.LIZ;
    }
}
