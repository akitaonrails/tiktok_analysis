package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.core.upload.SmartSliceModel;

/* JADX INFO: renamed from: X.0nZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439950nZh {
    public static SmartSliceModel LIZ() {
        try {
            return (SmartSliceModel) SettingsManager.LIZLLL().LJIIIIZZ("network_smart_slice_model", SmartSliceModel.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
