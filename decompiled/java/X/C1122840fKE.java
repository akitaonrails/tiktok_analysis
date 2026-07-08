package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.ServiceSkuRoutingConfigSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fKE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122840fKE extends C09AY implements Function0<Float> {
    public C1122840fKE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        C1123050fKZ.LIZ.getClass();
        return Float.valueOf(ServiceSkuRoutingConfigSetting.INSTANCE.getGlobalThreshold());
    }
}
