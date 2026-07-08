package X;

import com.bytedance.geckox.policy.meta.file.ChannelFileRecordSettings;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07PA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07PA {
    public static final ChannelFileRecordSettings LIZ = new ChannelFileRecordSettings(false, null, 0, 0, 15, null);

    public static final ChannelFileRecordSettings LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ChannelFileRecordSettings channelFileRecordSettings = LIZ;
            ChannelFileRecordSettings channelFileRecordSettings2 = (ChannelFileRecordSettings) settingsManagerLIZLLL.LJIIIIZZ("report_geckosdk_file_info", ChannelFileRecordSettings.class, channelFileRecordSettings);
            return channelFileRecordSettings2 != null ? channelFileRecordSettings2 : channelFileRecordSettings;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Object obj = (Void) c098200Yq;
            return obj != null ? (ChannelFileRecordSettings) obj : LIZ;
        }
    }
}
