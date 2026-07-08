package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.DeviceMetaInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862250yYp extends C2217421BqW implements Function1<DeviceMetaInfo, Unit> {
    public C1862250yYp(C1862130yYd c1862130yYd) {
        super(1, c1862130yYd, C1862130yYd.class, "onUpdateDeviceMetaInfo", "onUpdateDeviceMetaInfo(Lcom/ss/android/ugc/aweme/tako/ccl/model/api/DeviceMetaInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DeviceMetaInfo deviceMetaInfo) {
        DeviceMetaInfo deviceMetaInfo2 = deviceMetaInfo;
        this.receiver.getClass();
        C1862210yYl c1862210yYl = C1862130yYd.LIZLLL;
        c1862210yYl.getClass();
        if (deviceMetaInfo2 != null) {
            Integer num = deviceMetaInfo2.netLevel;
            if (num != null) {
                c1862210yYl.LIZ(Integer.valueOf(num.intValue()), "net_level");
            }
            Double d = deviceMetaInfo2.deviceScore;
            if (d != null) {
                c1862210yYl.LIZ(Double.valueOf(d.doubleValue()), "device_score");
            }
            Integer num2 = deviceMetaInfo2.deviceLevel;
            if (num2 != null) {
                c1862210yYl.LIZ(Integer.valueOf(num2.intValue()), "device_level");
            }
        }
        return Unit.LIZ;
    }
}
