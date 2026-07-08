package X;

import com.ss.android.ugc.feed.platform.metric.model.DeviceInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07XC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XC extends C09AY implements Function0<String> {
    public final /* synthetic */ DeviceInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07XC(DeviceInfo deviceInfo) {
        super(0);
        this.LL = deviceInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeviceInfoCache recovery finish => device info: ");
        sbLIZ.append(this.LL);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
