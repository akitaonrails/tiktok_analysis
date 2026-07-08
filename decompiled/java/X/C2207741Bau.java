package X;

import com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.GeoFencingServiceImpl;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.services.config.ShortVideoConfigImpl;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.IGeofencingService;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;
import defpackage.z1;

/* JADX INFO: renamed from: X.1Bau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207741Bau implements IConfigService {
    public static final C01GW<C2207741Bau> LIZIZ = C452501pT.LIZIZ(new C2207761Baw());
    public final C01GW LIZ = C452501pT.LIZIZ(new C2207751Bav());

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final void userAction(int i) {
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final ICacheService cacheConfig() {
        return (C13VT) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IPrivacyConfig privacyConfig() {
        return new IPrivacyConfig() { // from class: X.1Bas
            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig
            public final CheckDuetReactPermissionResponse checkDuetReactPermission(String str, int i) {
                String str2 = CheckDuetReactPermissionApi.LIZ;
                return ((CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest) C0CHQ.LIZ().getNetworkService().createRetrofit(CheckDuetReactPermissionApi.LIZ, true, CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest.class)).checkDuetReactPermission(str, i).execute().LIZIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IShortVideoConfig shortVideoConfig() {
        return ShortVideoConfigImpl.Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IAVSettingsService avsettingsConfig() {
        return AVSettingsServiceImpl.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IGeofencingService geoFencingConfig() {
        return GeoFencingServiceImpl.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final void updateServerSettings(IESSettingsProxy iESSettingsProxy) {
        AVSettingsServiceImpl.getInstance().updateServerSettings(iESSettingsProxy);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final void mobUserExitEditAction(String str, String str2) {
        Object obj;
        z1.LIZ.getClass();
        if (C1906580ziK.LJII().length != 1) {
            AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
            if (abstractC1387200mCcLIZLLL != null) {
                obj = abstractC1387200mCcLIZLLL.LIZ;
            } else {
                obj = null;
            }
            if (!(obj instanceof InterfaceC20011613Rq)) {
                return;
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("new_draft_id", str2);
        C20684815ws.LJIILLIIL("exit_camera_on_edit_page", c0lab.LIZ);
    }
}
