package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.NetworkTypeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X09, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X09 extends C09AY implements Function0<NetworkTypeConfig> {
    public C0X09() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.NetworkTypeConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final NetworkTypeConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        NetworkTypeConfig networkTypeConfig = C0X08.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("pns_network_type_settings", NetworkTypeConfig.class, networkTypeConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : networkTypeConfig;
    }
}
