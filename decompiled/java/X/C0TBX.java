package X;

import Y.AfS181S0100000_12;
import Y.AfS45S1100000_12;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostRefreshUserWhenMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostRefreshUserWhenMatchTimeoutSetting;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0TBX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TBX {
    public static final C974110bSL LIZ = new C974110bSL();

    public static C11JF LIZ(final String str, InterfaceC742240T9q interfaceC742240T9q) {
        if (!LiveCohostRefreshUserWhenMatchSetting.INSTANCE.isEnable()) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callSource=");
        sbLIZ.append(str);
        sbLIZ.append(", handleRefreshUser: trigger refresh");
        C20441214yg.LJIIIZ("CoHostRefreshUserHelper", C2188811AlT.LIZIZ(sbLIZ));
        return (C11JF) C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0aqh
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<C920590a41> c09aj) {
                C1C7U.LIZ("CoHostRefreshUserHelper@8ffc.handleRefreshUser$refreshUserDisposable$1");
                IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
                final String str2 = str;
                final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                iMultiHostServiceLJII.LJLZ(new InterfaceC950010apT<C920590a41>() { // from class: X.0aqi
                    @Override // X.InterfaceC950010apT
                    public final void LIZ(C920640a46 c920640a46) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("callSource=");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(", handleRefreshUser: refresh server api success");
                        C20441214yg.LJIIIZ("CoHostRefreshUserHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        c19482611Ke.onNext(c920640a46);
                        c19482611Ke.onComplete();
                    }

                    @Override // X.InterfaceC950010apT
                    public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("callSource=");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(", handleRefreshUser: refresh server api failed");
                        C20441214yg.LJIIIZ("CoHostRefreshUserHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        if (th != null) {
                            c19482611Ke.onError(th);
                        }
                    }
                });
                C1C7U.LIZIZ("CoHostRefreshUserHelper@8ffc.handleRefreshUser$refreshUserDisposable$1");
            }
        }).LJLJI(LiveCohostRefreshUserWhenMatchTimeoutSetting.INSTANCE.getValue(), TimeUnit.MILLISECONDS).LJJLL(new AfS181S0100000_12(interfaceC742240T9q, 33), new AfS45S1100000_12(interfaceC742240T9q, str, 1));
    }
}
