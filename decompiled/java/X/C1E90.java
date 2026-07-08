package X;

import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.settingsrequest.SettingsLegacyImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.util.List;

/* JADX INFO: renamed from: X.1E90, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E90 implements ISettingsLegacyApi {
    public static final C1E90 LIZIZ = new C1E90();
    public final /* synthetic */ ISettingsLegacyApi LIZ;

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final List<InterfaceC345370DgN> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final C310720CFy LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final void LIZJ(WeakHandler weakHandler, int i, int i2) {
        this.LIZ.LIZJ(weakHandler, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final PopupSetting LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final int LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final void preloadPushSettingsManager() {
        this.LIZ.preloadPushSettingsManager();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.LIZ.shouldUseRecyclerPartialUpdate();
    }

    public C1E90() {
        ISettingsLegacyApi iSettingsLegacyApi;
        Object objLIZ = C04TD.LIZ(ISettingsLegacyApi.class, false);
        if (objLIZ != null) {
            iSettingsLegacyApi = (ISettingsLegacyApi) objLIZ;
        } else {
            if (C04TD.X4 == null) {
                synchronized (ISettingsLegacyApi.class) {
                    if (C04TD.X4 == null) {
                        C04TD.X4 = new SettingsLegacyImpl();
                    }
                }
            }
            iSettingsLegacyApi = C04TD.X4;
        }
        this.LIZ = iSettingsLegacyApi;
    }
}
