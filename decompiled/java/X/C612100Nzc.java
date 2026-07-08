package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;

/* JADX INFO: renamed from: X.0Nzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612100Nzc {
    public static /* synthetic */ BatchUpdatePushSwitchesResp LIZ(C19296410eQ c19296410eQ, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c19296410eQ.batchSetPushSettingItems(str, z, null);
    }
}
