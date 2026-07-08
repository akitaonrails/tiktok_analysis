package X;

import Y.AfS0S0101100_7;
import Y.AfS1S0201100_7;
import com.bytedance.android.live.ToolbarTipEvent;
import com.bytedance.android.live.setting.LiveToolbarTipsGuideStrategyLogSetting;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.other.LiveTipsMigrateStrategyFrameworkSetting;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.strategy.StrategyApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS147S0101000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyCheckData;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyFilter;
import webcast.api.room.ToolBarInfo;
import webcast.api.room.ToolbarTipsCheckParams;

/* JADX INFO: renamed from: X.0IzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484630IzV extends AbstractC484600IzS {
    public final int LJII = 9;

    @Override // X.AbstractC484600IzS
    public final void LIZJ() {
        if (LiveToolbarTipsGuideStrategyLogSetting.INSTANCE.getValue()) {
            Pair[] pairArr = new Pair[3];
            DataChannel dataChannel = this.LIZLLL;
            pairArr[0] = new Pair("room_id", String.valueOf(dataChannel != null ? C500260Jjc.LJJLIIIJ(dataChannel) : 0L));
            pairArr[1] = new Pair("event_type", "4");
            pairArr[2] = new Pair("strategy_scene", String.valueOf(this.LJII));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_increase_strategy_trigger");
            c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.AbstractC484600IzS
    public final boolean LJI() {
        String str;
        Map map;
        if (this.LJ == null) {
            return false;
        }
        if (LiveTipsMigrateStrategyFrameworkSetting.INSTANCE.getValue()) {
            return true;
        }
        Object feature = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getFeature("ttm_live", "live_toolbar_tips_filter_feature", 2);
        if ((feature instanceof Map) && (map = (Map) feature) != null) {
            StrategyData strategyData = this.LJ;
            obj = map.get(strategyData != null ? strategyData.strategyId : null);
        }
        return (obj instanceof String) && (str = (String) obj) != null && str.length() == 0;
    }

    @Override // X.AbstractC484600IzS
    public final int LIZIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC484600IzS
    public final AbstractC484590IzR LIZ(final StrategyFilter strategyFilter) {
        return new AbstractC484590IzR(strategyFilter) { // from class: X.0IzQ
            @Override // X.AbstractC484590IzR
            public final boolean LJFF(DataChannel dataChannel) {
                return true;
            }

            @Override // X.AbstractC484590IzR
            public final boolean LIZ(DataChannel dataChannel, StrategyData strategyData) {
                List<InterfaceC484670IzZ> listLIZJ;
                Object obj;
                Map map;
                String str;
                C1102690enj c1102690enjHy0 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).hy0(dataChannel);
                String str2 = null;
                if (c1102690enjHy0 != null) {
                    listLIZJ = c1102690enjHy0.LIZJ();
                } else {
                    listLIZJ = null;
                }
                Object feature = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getFeature("ttm_live", "live_toolbar_tips_filter_feature", 2);
                if ((feature instanceof Map) && (map = (Map) feature) != null) {
                    if (strategyData != null) {
                        str = strategyData.strategyId;
                    } else {
                        str = null;
                    }
                    obj = map.get(str);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                }
                if (listLIZJ == null || listLIZJ.isEmpty() || str2 == null || str2.length() == 0) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC484590IzR
            public final void LJ(DataChannel dataChannel, EnterRoomConfig enterRoomConfig, StrategyData strategyData, C484610IzT c484610IzT, long j, long j2, AwS373S0200000_7 awS373S0200000_7) {
                ArrayList arrayList;
                Object obj;
                String str;
                String str2;
                Map map;
                String str3;
                long j3 = enterRoomConfig.mRoomsData.roomId;
                int i = c484610IzT.LIZ.triggerType;
                C1102690enj c1102690enjHy0 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).hy0(dataChannel);
                if (c1102690enjHy0 != null) {
                    List<InterfaceC484670IzZ> listLIZJ = c1102690enjHy0.LIZJ();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = ((ArrayList) listLIZJ).iterator();
                    while (it2.hasNext()) {
                        Integer componentType = ((InterfaceC484670IzZ) it2.next()).getComponentType();
                        if (componentType != null) {
                            arrayList2.add(componentType);
                        }
                    }
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = new ArrayList();
                }
                Object feature = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getFeature("ttm_live", "live_toolbar_tips_filter_feature", 2);
                String str4 = null;
                if ((feature instanceof Map) && (map = (Map) feature) != null) {
                    if (strategyData != null) {
                        str3 = strategyData.strategyId;
                    } else {
                        str3 = null;
                    }
                    obj = map.get(str3);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str4 = (String) obj;
                }
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                LIZLLL(i, j3);
                C480460Ism.LIZ().getClass();
                StrategyApi strategyApi = (StrategyApi) C480460Ism.LIZIZ(StrategyApi.class);
                if (strategyApi != null) {
                    int i2 = this.LIZ;
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                    long j4 = roomsData.enterUserId;
                    if (strategyData == null || (str = strategyData.actionType) == null) {
                        str = "";
                    }
                    long j5 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    String str6 = roomsData.enterFromMerge;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = c484610IzT.LIZ.triggerId;
                    if (strategyData != null && (str2 = strategyData.strategyId) != null) {
                        str5 = str2;
                    }
                    Gson gson = C19748512Ol.LIZIZ;
                    ToolbarTipsCheckParams toolbarTipsCheckParams = new ToolbarTipsCheckParams();
                    toolbarTipsCheckParams.showComTypes = arrayList;
                    toolbarTipsCheckParams.params = str4;
                    C11NZ<C470580Icq> c11nzStrategyCheck = strategyApi.strategyCheck(i2, j3, j4, str, j5, i, j2, str6, str7, str5, GsonProtectorUtils.toJson(gson, toolbarTipsCheckParams));
                    if (c11nzStrategyCheck != null) {
                        c11nzStrategyCheck.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS1S0201100_7(this, j3, i, awS373S0200000_7, 1), new AfS0S0101100_7(this, j3, i, 1));
                    }
                }
            }
        };
    }

    @Override // X.AbstractC484600IzS
    public final void LIZLLL(String str, boolean z) {
        if (!LiveToolbarTipsGuideStrategyLogSetting.INSTANCE.getValue()) {
            return;
        }
        long jLJJLIIIJ = 0;
        if (z) {
            Pair[] pairArr = new Pair[3];
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
            }
            pairArr[0] = new Pair("room_id", String.valueOf(jLJJLIIIJ));
            pairArr[1] = new Pair("event_type", "5");
            pairArr[2] = new Pair("strategy_scene", String.valueOf(this.LJII));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_increase_strategy_trigger");
            c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
            c474500IjALIZ.LIZ();
            return;
        }
        Pair[] pairArr2 = new Pair[4];
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel2);
        }
        pairArr2[0] = new Pair("room_id", String.valueOf(jLJJLIIIJ));
        pairArr2[1] = new Pair("event_type", "6");
        if (str == null) {
            str = "";
        }
        pairArr2[2] = new Pair("trigger_type", str);
        pairArr2[3] = new Pair("strategy_scene", String.valueOf(this.LJII));
        Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(pairArr2);
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_increase_strategy_trigger");
        c474500IjALIZ2.LJJIIZI(mapLJIIIIZZ2);
        c474500IjALIZ2.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC484600IzS
    public final void LJ(C470580Icq c470580Icq, C484610IzT c484610IzT) {
        StrategyCheckData strategyCheckData;
        ShowMode showMode;
        ToolBarInfo toolBarInfo;
        String str;
        DataChannel dataChannel;
        if (c470580Icq != null && (strategyCheckData = (StrategyCheckData) c470580Icq.data) != null && (showMode = strategyCheckData.showMode) != null && (toolBarInfo = showMode.toolbar) != null && (str = toolBarInfo.tips) != null) {
            long j = showMode.durationMs;
            Integer numValueOf = Integer.valueOf(toolBarInfo.subComType);
            numValueOf.intValue();
            if (j > 0) {
                int iIntValue = numValueOf.intValue();
                HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
                if (C1102420enI.LIZLLL(16, this.LIZLLL, "watch", false, false).LIZ && (dataChannel = this.LIZLLL) != null) {
                    C1106150etJ c1106150etJ = new C1106150etJ();
                    c1106150etJ.LIZ = iIntValue;
                    c1106150etJ.LIZIZ = str;
                    c1106150etJ.LIZJ = j;
                    c1106150etJ.LJI = new AwS147S0101000_7(this, iIntValue, 3);
                    dataChannel.LC0(ToolbarTipEvent.class, c1106150etJ.LIZ());
                }
            }
        }
    }
}
