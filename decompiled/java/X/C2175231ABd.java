package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.1ABd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175231ABd {
    public static final C2175231ABd LIZ = new C2175231ABd();

    public static boolean LIZ() {
        return ((Boolean) C1726440v1m.LIZ.getValue()).booleanValue() && !C0C64.LJIILLIIL().LJIIIZ(31744, "id_hide_report_entrance", true, false);
    }

    public static void LIZIZ(View view, Aweme aweme) {
        long j;
        String strLIZ;
        AwemeRawAd awemeRawAd;
        Activity activityLIZ = C06MM.LIZ(view.getContext());
        if (AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd() != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isReportEnable()) {
            ComplianceServiceProvider.LJJ().LIZJ(activityLIZ, C1048440dOE.LIZJ(aweme, "creative"));
            return;
        }
        if (AwemeSaaSExtKt.isLive(aweme)) {
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            if (newLiveRoomDataExt != null) {
                try {
                    j = CastLongProtector.parseLong(newLiveRoomDataExt.owner.getUid());
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    j = 0;
                }
                LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
                if (liveRoomStructLJI != null) {
                    strLIZ = C354201Zc.LIZ(RoomStruct.getStreamType(liveRoomStructLJI));
                } else {
                    strLIZ = null;
                }
                interfaceC20673515v3K4.LJJLIIIJ(view.getContext(), newLiveRoomDataExt.id, j, j, newLiveRoomDataExt.owner.getSecUid(), "fast_report", "homepage_hot", "fast_report", aweme.getRequestId(), strLIZ, Boolean.FALSE, null);
                return;
            }
            return;
        }
        ComplianceServiceProvider.LJJ().LJ(activityLIZ, aweme, "homepage_hot");
    }
}
