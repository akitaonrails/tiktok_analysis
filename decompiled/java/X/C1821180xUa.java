package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Pair;
import webcast.api.sub.SMBSetupInfoResponse;
import webcast.api.sub.UpdateSMBSetupInfoResponse;

/* JADX INFO: renamed from: X.0xUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821180xUa implements InterfaceC1821220xUe {
    public final /* synthetic */ C1821140xUW LL;

    public C1821180xUa(C1821140xUW c1821140xUW) {
        this.LL = c1821140xUW;
    }

    @Override // X.InterfaceC1821220xUe
    public final C11NZ<C470590Icr<SMBSetupInfoResponse.ResponseData>> r0(boolean z) {
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        final String secUid;
        UserService userService = this.LL.LLILLJJLI;
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null && (secUid = currentUser.getSecUid()) != null) {
            if (z) {
                C19482711Kf c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0xUc
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ<C470590Icr<SMBSetupInfoResponse.ResponseData>> c09aj) {
                        C1C7U.LIZ("OneStopPageRepo@3def.operator$1$createCacheObservable$1");
                        C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                        C1106750euH.LIZ.LJI("/webcast/sub/upsell/one_stop_shop_setup/info/", C2097608Jq.LJIIIIZZ(new Pair("sec_anchor_id", secUid), new Pair("need_setup_data", Boolean.TRUE)), SMBSetupInfoResponse.ResponseData.class, new C1821210xUd(c19482611Ke), new C1821190xUb(this, secUid, c19482611Ke), Mp4ScreenVideoLoadTimeout.CONTROL);
                        C1C7U.LIZIZ("OneStopPageRepo@3def.operator$1$createCacheObservable$1");
                    }
                });
                if (LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
                    C11NZ<C470590Icr<SMBSetupInfoResponse.ResponseData>> sMBOneStopSetupState = this.LL.LL.getSMBOneStopSetupState(secUid, true);
                    C1701890uOB.LIZ(sMBOneStopSetupState, "other is null");
                    return C11NZ.LJIILL(c19482711KfLJIJJLI, sMBOneStopSetupState);
                }
                return c19482711KfLJIJJLI;
            }
            return this.LL.LL.getSMBOneStopSetupState(secUid, true);
        }
        return C11NZ.LJJIJLIJ(new IllegalStateException());
    }

    @Override // X.InterfaceC1821220xUe
    public final C11NZ<C470590Icr<UpdateSMBSetupInfoResponse.ResponseData>> LJJIJL(int i, int i2) {
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        String secUid;
        UserService userService = this.LL.LLILLJJLI;
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null && (secUid = currentUser.getSecUid()) != null) {
            return this.LL.LL.LJFF(i2, i, secUid);
        }
        return C11NZ.LJJIJLIJ(new IllegalStateException());
    }
}
