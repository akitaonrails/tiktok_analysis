package X;

import android.content.Context;
import com.bytedance.android.livesdk.internal.Live;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingData;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponseV2;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Di9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346470Di9 implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C346470Di9 c346470Di9, C15O7 c15o7) {
        C1C7U.LIZ("ChildModeServiceImpl@bc79.closeChildModeAndRestart$2");
        if (c15o7 != null && ((Boolean) c15o7.LJIIL()).booleanValue()) {
            ((ChildModeServiceImpl) c346470Di9.l0).LJIILL((Context) c346470Di9.l1);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChildModeServiceImpl@bc79.closeChildModeAndRestart$2");
        return unit;
    }

    public static final Object then$1(C346470Di9 c346470Di9, C15O7 c15o7) {
        C1C7U.LIZ("ChildModeServiceImpl@bc79.openChildModeAndRestart$2");
        if (c15o7 != null && ((Boolean) c15o7.LJIIL()).booleanValue()) {
            ((ChildModeServiceImpl) c346470Di9.l0).LJIILL((Context) c346470Di9.l1);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChildModeServiceImpl@bc79.openChildModeAndRestart$2");
        return unit;
    }

    public static final Object then$2(C346470Di9 c346470Di9, C15O7 c15o7) {
        C1AKK liteService;
        LiveSDKSettingData liveSDKSettingData;
        C325490CpP c325490CpP = (C325490CpP) c346470Di9.l0;
        Context context = (Context) c346470Di9.l1;
        c325490CpP.getClass();
        C1C7U.LIZ("LiveSDKSettingManager@9dc2.syncLiveSDKSettings$1L");
        if (!c15o7.LJIILL()) {
            LiveSDKSettingResponseV2 liveSDKSettingResponseV2 = (LiveSDKSettingResponseV2) c15o7.LJIIL();
            if (((liveSDKSettingResponseV2 != null && liveSDKSettingResponseV2.status_code == 0 && (liveSDKSettingData = liveSDKSettingResponseV2.data) != null && liveSDKSettingData.fullSettings != null) || liveSDKSettingResponseV2.data.incrementSettings != null) && (liteService = Live.getLiteService()) != null) {
                LiveSDKSettingData liveSDKSettingData2 = liveSDKSettingResponseV2.data;
                liteService.LJJIIZI(context, liveSDKSettingData2.fullSettings, liveSDKSettingData2.incrementSettings, liveSDKSettingData2.settingDesc, liveSDKSettingData2.updateType, liveSDKSettingData2.deletedKeys, null);
            }
        } else if ((c15o7.LJIIJJI() instanceof C1494690ozz) && ((C1494690ozz) c15o7.LJIIJJI()).getStatusCode() == 404) {
            c325490CpP.LIZIZ(context, C0CPQ.V1);
        }
        C1C7U.LIZIZ("LiveSDKSettingManager@9dc2.syncLiveSDKSettings$1L");
        return null;
    }

    public C346470Di9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
