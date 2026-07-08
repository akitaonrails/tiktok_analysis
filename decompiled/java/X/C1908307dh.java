package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.interceptor.PnsZoneConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1908307dh extends C09AY implements Function0<PnsZoneConfig> {
    public C1908307dh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.aweme.network.interceptor.PnsZoneConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PnsZoneConfig invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("pns_zone_settings_v2", PnsZoneConfig.class, C1908207dg.LIZ);
    }
}
