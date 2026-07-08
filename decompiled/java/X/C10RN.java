package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.configuration.scene.UGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.realtimedecision.RealtimeDecisionInterceptor;
import defpackage.f9;
import defpackage.g9;
import defpackage.i9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10RN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RN {
    public static RealtimeDecisionInterceptor LIZIZ;
    public static int LJ;
    public static final C10RN LIZ = new C10RN();
    public static List<String> LIZJ = new ArrayList();
    public static List<String> LIZLLL = new ArrayList();
    public static final Keva LJFF = Keva.getRepo("RealtimeDecision");
    public static int LJI = -1;
    public static final C10QK LJII = new i9() { // from class: X.10QK
        @Override // defpackage.i9
        public final void LIZ(List<Integer> list) {
            if (((ArrayList) list).contains(103)) {
                String strLIZJ = UGStrategyTriggerAbility.LJI().LIZJ();
                if (strLIZJ.length() > 0) {
                    C10RN.LJFF.storeString("forecast_group", strLIZJ);
                }
                UGStrategyTriggerAbility.LJI().LIZIZ(g9.STRATEGY_SCENE_FORECAST_LOGIN);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updated listener + ");
                sbLIZ.append(strLIZJ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            f9.LIZ.getClass();
            ((CopyOnWriteArrayList) f9.LIZJ).clear();
        }
    };

    public static void LIZ(IPluginService.PluginConfigResponse pluginConfigResponse) {
        IPluginService.PluginData next;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        IPluginService.DailyLoginData dailyLoginData;
        IPluginService.InFeedLoginConfigStruct inFeedLoginConfigStruct;
        Integer num;
        Integer num2;
        List<String> list;
        List<String> list2;
        int iIntValue;
        Integer num3;
        LIZJ = null;
        LIZLLL = null;
        IPluginService.SubscribeNuEventInfo subscribeNuEventInfo = pluginConfigResponse.subscribeNuEventInfo;
        int iIntValue2 = -1;
        if (subscribeNuEventInfo != null && (num2 = subscribeNuEventInfo.uploadIntervalSeconds) != null) {
            if (num2.intValue() != -1) {
                if (LIZIZ == null) {
                    RealtimeDecisionInterceptor realtimeDecisionInterceptor = new RealtimeDecisionInterceptor();
                    LIZIZ = realtimeDecisionInterceptor;
                    C20684815ws.LIZ(realtimeDecisionInterceptor);
                }
                IPluginService.SubscribeNuEventInfo subscribeNuEventInfo2 = pluginConfigResponse.subscribeNuEventInfo;
                if (subscribeNuEventInfo2 != null) {
                    list = subscribeNuEventInfo2.eventList;
                } else {
                    list = null;
                }
                LIZJ = list;
                if (subscribeNuEventInfo2 != null) {
                    list2 = subscribeNuEventInfo2.realtimeEventList;
                } else {
                    list2 = null;
                }
                LIZLLL = list2;
                if (subscribeNuEventInfo2 != null && (num3 = subscribeNuEventInfo2.uploadIntervalSeconds) != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                LJ = iIntValue;
            } else {
                RealtimeDecisionInterceptor realtimeDecisionInterceptor2 = LIZIZ;
                if (realtimeDecisionInterceptor2 != null) {
                    C20684815ws.LJIJJLI(realtimeDecisionInterceptor2);
                }
            }
        }
        List<IPluginService.PluginData> list3 = pluginConfigResponse.featureList;
        if (list3 != null) {
            Iterator<IPluginService.PluginData> it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.id == EnumC19241510Pl.DAILY_LOGIN.getValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IPluginService.PluginData pluginData = next;
            if (pluginData != null && (pluginDataWrapper = pluginData.configData) != null && (dailyLoginData = pluginDataWrapper.dailyLoginData) != null) {
                IPluginService.InFeedLoginConfigStruct inFeedLoginConfigStruct2 = dailyLoginData.feedLoginConfig;
                if (inFeedLoginConfigStruct2 != null) {
                    if (Intrinsics.LJFF(inFeedLoginConfigStruct2.isEnabled, Boolean.TRUE)) {
                        if (dailyLoginData != null && (inFeedLoginConfigStruct = dailyLoginData.feedLoginConfig) != null && (num = inFeedLoginConfigStruct.showOnVV) != null) {
                            iIntValue2 = num.intValue();
                        }
                        LJI = iIntValue2;
                    }
                    if (dailyLoginData == null) {
                        return;
                    }
                }
                if (Intrinsics.LJFF(dailyLoginData.shouldTerminatePrediction, Boolean.TRUE)) {
                    LJFF.storeBoolean("should_terminate", true);
                }
            }
        }
    }
}
