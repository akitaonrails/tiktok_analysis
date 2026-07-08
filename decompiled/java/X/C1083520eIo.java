package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.ServiceSkuRoutingConfigSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1083520eIo extends C2217421BqW implements Function0<Boolean> {
    public C1083520eIo(C1123050fKZ c1123050fKZ) {
        super(0, c1123050fKZ, C1123050fKZ.class, "ignoreFrequencyForTest", "ignoreFrequencyForTest()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.receiver.getClass();
        return Boolean.valueOf(ServiceSkuRoutingConfigSetting.INSTANCE.ignoreFrequencyForTest());
    }
}
