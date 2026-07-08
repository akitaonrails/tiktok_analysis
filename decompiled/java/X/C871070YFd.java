package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.client.configs.BatchAckSamplingConfig;

/* JADX INFO: renamed from: X.0YFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871070YFd {
    public static final BatchAckSamplingConfig LIZ = new BatchAckSamplingConfig(0, null, null, null, 15, null);

    public static BatchAckSamplingConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BatchAckSamplingConfig batchAckSamplingConfig = LIZ;
        BatchAckSamplingConfig batchAckSamplingConfig2 = (BatchAckSamplingConfig) settingsManagerLIZLLL.LJIIIIZZ("imsdk_e2e_latency_event_config", BatchAckSamplingConfig.class, batchAckSamplingConfig);
        return batchAckSamplingConfig2 != null ? batchAckSamplingConfig2 : batchAckSamplingConfig;
    }
}
