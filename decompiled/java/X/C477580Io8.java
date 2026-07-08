package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutLandingBySkylightRoomSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnableLandingHangoutTabByStrategySetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTopTabSwitch;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.LiveTab;

/* JADX INFO: renamed from: X.0Io8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477580Io8 {
    public long LIZIZ;
    public long LIZJ;
    public long LJ;
    public Long LJI;
    public EnterRoomConfig LJII;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(250));
    public int LIZLLL = -1;
    public List<EnterRoomConfig> LJFF = new ArrayList();

    public final long LIZLLL() {
        if (this.LJ == 0) {
            return 0L;
        }
        return System.currentTimeMillis() - this.LJ;
    }

    public static List LIZIZ() {
        FeedExtra feedExtra;
        List<LiveTab> list;
        InterfaceC476860Imy interfaceC476860ImyLIZIZ = C474850Ijj.LIZIZ();
        if (interfaceC476860ImyLIZIZ == null) {
            return C13BV.INSTANCE;
        }
        if (!((CommonSkylightDataManager) interfaceC476860ImyLIZIZ).LJI()) {
            return C13BV.INSTANCE;
        }
        BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIL = interfaceC476860ImyLIZIZ.LJIIL(EnumC471790Ien.ROOM, Boolean.FALSE);
        return (baseListResponseLJIIL == null || (feedExtra = (FeedExtra) baseListResponseLJIIL.extra) == null || (list = feedExtra.tabs) == null) ? C13BV.INSTANCE : list;
    }

    public static List LIZJ() {
        FeedExtra feedExtra;
        List<LiveTab> list;
        InterfaceC476860Imy interfaceC476860ImyLIZIZ = C474850Ijj.LIZIZ();
        if (interfaceC476860ImyLIZIZ == null) {
            return C13BV.INSTANCE;
        }
        BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIL = interfaceC476860ImyLIZIZ.LJIIL(EnumC471790Ien.ROOM, Boolean.FALSE);
        return (baseListResponseLJIIL == null || (feedExtra = (FeedExtra) baseListResponseLJIIL.extra) == null || (list = feedExtra.tabs) == null) ? C13BV.INSTANCE : list;
    }

    public final void LJFF() {
        long tabStayTimeSecondsThreshold = LiveTopTabSwitch.getTabStayTimeSecondsThreshold();
        long jLJ = LJ(0);
        long jLJ2 = LJ(1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("discoverTabStayTime=");
        sbLIZ.append(jLJ);
        sbLIZ.append(", hangoutTabStayTime=");
        sbLIZ.append(jLJ2);
        C20441214yg.LJIIIZ("LiveTopTabHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (jLJ2 >= tabStayTimeSecondsThreshold || jLJ >= tabStayTimeSecondsThreshold) {
            if (jLJ2 < tabStayTimeSecondsThreshold) {
                C20441214yg.LJIIIZ("LiveTopTabHelper", "store landing position 0");
                ((Keva) this.LIZ.getValue()).storeInt("landing_tab_position", 0);
            } else if (jLJ < tabStayTimeSecondsThreshold) {
                C20441214yg.LJIIIZ("LiveTopTabHelper", "store landing position 1");
                ((Keva) this.LIZ.getValue()).storeInt("landing_tab_position", 1);
            } else if (this.LIZLLL == 0) {
                C20441214yg.LJIIIZ("LiveTopTabHelper", "store landing position 0");
                ((Keva) this.LIZ.getValue()).storeInt("landing_tab_position", 0);
            } else {
                C20441214yg.LJIIIZ("LiveTopTabHelper", "store landing position 1");
                ((Keva) this.LIZ.getValue()).storeInt("landing_tab_position", 1);
            }
        }
    }

    public final int LIZ(EnterRoomConfig enterRoomConfig) {
        String str;
        int i;
        C1090000eTG c1090000eTGO3;
        if (enterRoomConfig != null) {
            try {
                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                if (logData != null && (str = logData.landingTab) != null) {
                    C479670IrV.LIZ.getClass();
                    C479670IrV.LIZLLL = "config";
                    if (Intrinsics.LJFF(str, "hangout")) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getLandingTabPosition from enterRoomConfig: ");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIZ("LiveTopTabHelper", C2188811AlT.LIZIZ(sbLIZ));
                    return i;
                }
                C189200o6.m2constructorimpl(null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } else {
            C189200o6.m2constructorimpl(null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (HangoutLandingBySkylightRoomSetting.INSTANCE.getValue() && C477600IoA.LIZIZ == 1 && C477600IoA.LIZJ >= jCurrentTimeMillis) {
            C479670IrV.LIZ.getClass();
            C479670IrV.LIZLLL = "skylight_room";
            C20441214yg.LJIIIZ("LiveTopTabHelper", "getLandingTabPosition from hangout landing message");
            return 1;
        }
        if (MultiGuestEnableLandingHangoutTabByStrategySetting.isEnable() && (c1090000eTGO3 = ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).O3(EnumC1094630eaj.DEFAULT, EnumC467180ITs.SERVER_FEATURE.getGroupName(), EnumC464240IIk.MG_TOPLIVE_LAND_STRATEGY.getKey())) != null) {
            Object obj = c1090000eTGO3.LIZJ;
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = "";
                }
                if (TextUtils.equals(str2, "1")) {
                    C479670IrV.LIZ.getClass();
                    C479670IrV.LIZLLL = "strategy";
                    C20441214yg.LJIIIZ("LiveTopTabHelper", "getLandingTabPosition from live feature MG_TOPLIVE_LAND_STRATEGY: 1");
                    return 1;
                }
            }
        }
        C479670IrV.LIZ.getClass();
        C479670IrV.LIZLLL = "stay_duration";
        int i2 = ((Keva) this.LIZ.getValue()).getInt("landing_tab_position", 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getLandingTabPosition from keva: ");
        sbLIZ2.append(i2);
        C20441214yg.LJIIIZ("LiveTopTabHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return i2;
    }

    public final long LJ(int i) {
        long jCurrentTimeMillis;
        if (i != 0) {
            if (i != 1) {
                jCurrentTimeMillis = 0;
            } else {
                jCurrentTimeMillis = this.LIZJ;
            }
        } else {
            jCurrentTimeMillis = this.LIZIZ;
        }
        if (i == this.LIZLLL) {
            jCurrentTimeMillis += System.currentTimeMillis() - this.LJ;
        }
        return jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
