package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0CpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325490CpP implements C0CPK {
    public static final C325490CpP LIZIZ = new C325490CpP();
    public final InterfaceC313110CPd LIZ;

    public C325490CpP() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(Live.getLiveDomain());
        this.LIZ = (InterfaceC313110CPd) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C2188811AlT.LIZIZ(sbLIZ)).create(InterfaceC313110CPd.class);
    }

    @Override // X.C0CPK
    public final void LIZ(Context context) {
        LIZIZ(context, null);
    }

    @Override // X.C0CPK
    public final void LIZJ(final String str) {
        HashMap map = new HashMap();
        INetworkService iNetworkService = (INetworkService) C1161920gLG.LIZJ(INetworkService.class);
        if (iNetworkService != null) {
            iNetworkService.Co1(map);
        }
        try {
            this.LIZ.LIZ(map).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0CpQ
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    LiveSDKSettingResponse liveSDKSettingResponse;
                    BaseResponse.ServerTimeExtra serverTimeExtra;
                    String str2 = str;
                    C1C7U.LIZ("LiveSDKSettingManager@9dc2.diffLiveSettingWithCache$1L");
                    if (!c15o7.LJIILL() && (liveSDKSettingResponse = (LiveSDKSettingResponse) c15o7.LJIIL()) != null && liveSDKSettingResponse.status_code == 0 && liveSDKSettingResponse.data != null && (serverTimeExtra = liveSDKSettingResponse.extra) != null) {
                        String str3 = serverTimeExtra.logid;
                        C1AKK liteService = Live.getLiteService();
                        if (liteService != null) {
                            liteService.LLIIIILZ(liveSDKSettingResponse.data, str2, str3);
                        }
                    }
                    C1C7U.LIZIZ("LiveSDKSettingManager@9dc2.diffLiveSettingWithCache$1L");
                    return null;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0CPK
    public final void LIZIZ(Context context, C0CPQ c0cpq) {
        boolean z;
        boolean z2;
        HashMap map = new HashMap();
        INetworkService iNetworkService = (INetworkService) C1161920gLG.LIZJ(INetworkService.class);
        if (iNetworkService != null) {
            iNetworkService.Co1(map);
        }
        IHostSetting iHostSetting = (IHostSetting) C1161920gLG.LIZJ(IHostSetting.class);
        boolean z3 = true;
        if (c0cpq == C0CPQ.V1) {
            z = true;
        } else {
            z = false;
        }
        if (c0cpq == C0CPQ.V2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || (!z2 && !iHostSetting.pO2().settingsApiOptEnable)) {
            z3 = false;
        }
        if (z3) {
            boolean zNK = iHostSetting.nK();
            String strTA0 = iHostSetting.tA0();
            map.put("force_full", Boolean.toString(zNK));
            if (!TextUtils.isEmpty(strTA0)) {
                map.put("client_setting_desc", strTA0);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on webcast settings requestV2: force_full - ");
            sbLIZ.append(zNK);
            sbLIZ.append(" client_setting_desc - ");
            sbLIZ.append(strTA0);
            C20441214yg.LIZIZ("LiveSDKSettingManager", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.LIZIZ(map).LIZLLL(new C346470Di9(this, context, 2));
            return;
        }
        C20441214yg.LIZIZ("LiveSDKSettingManager", "on webcast settings requestV1");
        this.LIZ.LIZ(map).LIZLLL(new C346480DiA(context, 8));
    }
}
