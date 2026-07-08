package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.setting.IMSettingBridgeApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06FU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06FU extends C09AY implements Function0<IMSettingBridgeApi> {
    public C06FU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.saas.host.api.setting.IMSettingBridgeApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMSettingBridgeApi invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IMSettingBridgeApi.class);
    }
}
