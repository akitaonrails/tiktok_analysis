package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sync.SyncConfigSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ppW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526640ppW extends C09AY implements Function0<SyncConfigSettings.SyncSdkConfigModel> {
    public C1526640ppW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SyncConfigSettings.SyncSdkConfigModel invoke() {
        try {
            SyncConfigSettings.SyncSdkConfigModel syncSdkConfigModel = SyncConfigSettings.LIZ;
            if (C1519700peK.LIZ.LIZJ()) {
                return SyncConfigSettings.LIZIZ;
            }
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SyncConfigSettings.SyncSdkConfigModel syncSdkConfigModel2 = SyncConfigSettings.LIZ;
            SyncConfigSettings.SyncSdkConfigModel syncSdkConfigModel3 = (SyncConfigSettings.SyncSdkConfigModel) c0c64LJIILLIIL.LJJII(SyncConfigSettings.SyncSdkConfigModel.class, syncSdkConfigModel2, "bsync_sdk_configs", true);
            return syncSdkConfigModel3 == null ? syncSdkConfigModel2 : syncSdkConfigModel3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return SyncConfigSettings.LIZ;
        }
    }
}
