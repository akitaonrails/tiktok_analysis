package com.bytedance.android.live_settings;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public final class MonitorImpl implements Monitor {
    public final boolean isDebug;

    @Override // com.bytedance.android.live_settings.Monitor
    public void reportSettingReadPerformance(String str, long j, String str2) {
    }

    public MonitorImpl(boolean z) {
        this.isDebug = z;
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public void reportException(String str, String str2) throws Throwable {
        if (!this.isDebug) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ));
    }
}
