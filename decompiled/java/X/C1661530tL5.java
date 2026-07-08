package X;

import com.ss.android.vesdk.VECameraSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tL5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661530tL5 extends C09AY implements Function1<VECameraSettings.Builder, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1661530tL5(float f, boolean z) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VECameraSettings.Builder builder) {
        VECameraSettings.Builder builder2 = builder;
        builder2.setDefaultZoomRatio(this.LL);
        builder2.setDefaultZoomUsingZoomV2(true);
        builder2.setCameraZoomLimitFactor(1.0f);
        if (this.LLILLJJLI) {
            builder2.enableHDR10BitRecord(true);
            builder2.setDynamicRangeProfile(2L);
            builder2.setCameraModeType(VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE);
        } else {
            builder2.enableHDR10BitRecord(false);
            builder2.setDynamicRangeProfile(1L);
            builder2.setCameraModeType(VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE);
        }
        return Unit.LIZ;
    }
}
