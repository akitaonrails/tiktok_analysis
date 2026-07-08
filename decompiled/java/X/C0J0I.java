package X;

import com.bytedance.android.live.ToolbarTipEvent;
import com.bytedance.android.live.setting.LiveToolbarTipsGuideStrategyLogSetting;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarTipsHandlerCheckShortIntervalRequestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS147S0101000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tikcast.api.epiphron.ToolbarTipsCheckFeature;
import tikcast.api.epiphron.ToolbarTipsDecision;

/* JADX INFO: renamed from: X.0J0I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0I extends AbstractC1097820efs<ToolbarTipsCheckFeature, ToolbarTipsDecision> implements C0J0K {
    public static final /* synthetic */ int LJI = 0;
    public String LJ = "";
    public final boolean LJFF;

    @Override // X.AbstractC1097820efs
    public final String LJIIIZ() {
        return "toolbar_tips_decision";
    }

    @Override // X.InterfaceC1097710efh
    public final String getStrategyName() {
        return "toolbar_tips_guide";
    }

    @Override // X.InterfaceC1097710efh
    public final C1933007hg LIZ() {
        return new C1933007hg();
    }

    @Override // X.C0J0L, X.InterfaceC1097710efh
    public final void LIZLLL() {
        if (LiveToolbarTipsGuideStrategyLogSetting.INSTANCE.getValue()) {
            Pair[] pairArr = new Pair[2];
            DataChannel dataChannel = this.LIZ;
            pairArr[0] = new Pair("room_id", String.valueOf(dataChannel != null ? C500260Jjc.LJJLIIIJ(dataChannel) : 0L));
            pairArr[1] = new Pair("event_type", "4");
            LJIJI(C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    @Override // X.AbstractC1097820efs
    public final boolean LJI() {
        return LiveToolbarTipsHandlerCheckShortIntervalRequestSetting.INSTANCE.getValue();
    }

    @Override // X.AbstractC1097820efs
    public final TypeToken<ToolbarTipsDecision> LJIIJ() {
        return new TypeToken<ToolbarTipsDecision>() { // from class: X.0J0J
        };
    }

    public C0J0I() {
        this.LJFF = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest();
    }

    public static List LJIIZILJ() {
        List listLJJLIIIJILLIZJL;
        Integer numValueOf;
        String strLIZ = C484710Izd.LIZ();
        if (strLIZ == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZ, new String[]{","}, 0, 6)) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            try {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next()));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }

    public static List LJIILLIIL(DataChannel dataChannel) {
        C1102690enj c1102690enjHy0 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).hy0(dataChannel);
        if (c1102690enjHy0 != null) {
            List<InterfaceC484670IzZ> listLIZJ = c1102690enjHy0.LIZJ();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) listLIZJ).iterator();
            while (it2.hasNext()) {
                Integer componentType = ((InterfaceC484670IzZ) it2.next()).getComponentType();
                if (componentType != null) {
                    arrayList.add(componentType);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static void LJIJI(Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_increase_strategy_trigger");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII("9_epi", "strategy_scene");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1097710efh
    public final void LIZIZ(C1092890eXv c1092890eXv) {
        Object obj;
        String str;
        Object obj2;
        long jLJJLIIIJ;
        Map<String, Object> map;
        C0J0M c0j0m = c1092890eXv.LIZIZ;
        Object obj3 = null;
        if (c0j0m != null && (map = c0j0m.LJFF) != null) {
            obj = map.get("trigger_feature");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        this.LJ = str;
        C0J0M c0j0m2 = c1092890eXv.LIZIZ;
        if (c0j0m2 != null) {
            obj2 = c0j0m2.LIZIZ;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Boolean) {
            obj3 = obj2;
        }
        if (this.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTrigger, value: ");
            sbLIZ.append(obj3);
            sbLIZ.append(", trigger name: ");
            sbLIZ.append(this.LJ);
            C20441214yg.LJ("ToolbarTipsStrategyHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (Intrinsics.LJFF(obj3, Boolean.TRUE)) {
            Pair[] pairArr = new Pair[3];
            DataChannel dataChannel = this.LIZ;
            long jLJJLIIIJ2 = 0;
            if (dataChannel != null) {
                jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
            } else {
                jLJJLIIIJ = 0;
            }
            pairArr[0] = new Pair("room_id", String.valueOf(jLJJLIIIJ));
            pairArr[1] = new Pair("event_type", "1");
            pairArr[2] = new Pair("trigger_type", this.LJ);
            LJIJI(C2097608Jq.LJIIIIZZ(pairArr));
            Pair[] pairArr2 = new Pair[3];
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                jLJJLIIIJ2 = C500260Jjc.LJJLIIIJ(dataChannel2);
            }
            pairArr2[0] = new Pair("room_id", String.valueOf(jLJJLIIIJ2));
            pairArr2[1] = new Pair("event_type", "2");
            pairArr2[2] = new Pair("trigger_type", this.LJ);
            LJIJI(C2097608Jq.LJIIIIZZ(pairArr2));
            LJIILL(c1092890eXv);
        }
    }

    @Override // X.C0J0K
    public final boolean LJFF(DataChannel dataChannel) {
        boolean z;
        List listLJIILLIIL = LJIILLIIL(dataChannel);
        List listLJIIZILJ = LJIIZILJ();
        C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(16, dataChannel, "watch", false, false);
        if ((!C13LP.LJJL(listLJIILLIIL, listLJIIZILJ).isEmpty()) && c512940K9sLIZLLL.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Filter result: ");
            sbLIZ.append(z);
            sbLIZ.append(", showingToolbarList: ");
            sbLIZ.append(C13LP.LJJLIIIJ(listLJIILLIIL, ",", null, null, 0, null, null, 62));
            sbLIZ.append(", unClickedToolbarList: ");
            sbLIZ.append(C13LP.LJJLIIIJ(listLJIIZILJ, ",", null, null, 0, null, null, 62));
            sbLIZ.append(", frequencyCheckResult: ");
            sbLIZ.append(c512940K9sLIZLLL);
            C20441214yg.LJ("ToolbarTipsStrategyHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
        return z;
    }

    @Override // X.AbstractC1097820efs
    public final Map LJIIIIZZ(ToolbarTipsCheckFeature toolbarTipsCheckFeature) {
        ToolbarTipsCheckFeature toolbarTipsCheckFeature2 = toolbarTipsCheckFeature;
        return C2097608Jq.LJIIIIZZ(new Pair("room_id", String.valueOf(toolbarTipsCheckFeature2.roomId)), new Pair("anchor_id", String.valueOf(toolbarTipsCheckFeature2.anchorId)), new Pair("toolbar_tips_trigger_name", toolbarTipsCheckFeature2.toolbarTipsTriggerName), new Pair("show_com_types", C13LP.LJJLIIIJ(toolbarTipsCheckFeature2.showComTypes, ",", null, null, 0, null, null, 62)), new Pair("unclick_com_types", C13LP.LJJLIIIJ(toolbarTipsCheckFeature2.unclickComTypes, ",", null, null, 0, null, null, 62)), new Pair("watch_duration", String.valueOf(toolbarTipsCheckFeature2.watchDuration)));
    }

    @Override // X.AbstractC1097820efs
    public final void LJIIL(int i) {
        long jLJJLIIIJ;
        if (i != 0 && i != 2) {
            LJIJ(0);
            return;
        }
        Pair[] pairArr = new Pair[4];
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        pairArr[0] = new Pair("room_id", String.valueOf(jLJJLIIIJ));
        pairArr[1] = new Pair("event_type", "3");
        pairArr[2] = new Pair("trigger_type", this.LJ);
        pairArr[3] = new Pair("has_error", "true");
        LJIJI(C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.AbstractC1097820efs
    public final void LJIILIIL(ToolbarTipsDecision toolbarTipsDecision) {
        DataChannel dataChannel;
        ToolbarTipsDecision toolbarTipsDecision2 = toolbarTipsDecision;
        LJIJ(1);
        String str = toolbarTipsDecision2.tips;
        long j = toolbarTipsDecision2.durationMs;
        Integer numValueOf = Integer.valueOf(toolbarTipsDecision2.subComType);
        numValueOf.intValue();
        if (j > 0) {
            int iIntValue = numValueOf.intValue();
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            if (C1102420enI.LIZLLL(16, this.LIZ, "watch", false, false).LIZ && (dataChannel = this.LIZ) != null) {
                C1106150etJ c1106150etJ = new C1106150etJ();
                c1106150etJ.LIZ = iIntValue;
                c1106150etJ.LIZIZ = str;
                c1106150etJ.LIZJ = j;
                c1106150etJ.LJI = new AwS147S0101000_7(this, iIntValue, 4);
                dataChannel.LC0(ToolbarTipEvent.class, c1106150etJ.LIZ());
            }
        }
    }

    public final void LJIJ(int i) {
        long jLJJLIIIJ;
        Pair[] pairArr = new Pair[5];
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        pairArr[0] = new Pair("room_id", String.valueOf(jLJJLIIIJ));
        pairArr[1] = new Pair("event_type", "3");
        pairArr[2] = new Pair("trigger_type", this.LJ);
        pairArr[3] = new Pair("has_error", "false");
        pairArr[4] = new Pair("decision", String.valueOf(i));
        LJIJI(C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.C0J0L, X.InterfaceC1097710efh
    public final void LIZJ(String str, boolean z) {
        if (!LiveToolbarTipsGuideStrategyLogSetting.INSTANCE.getValue()) {
            return;
        }
        long jLJJLIIIJ = 0;
        if (z) {
            Pair[] pairArr = new Pair[2];
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
            }
            pairArr[0] = new Pair("room_id", String.valueOf(jLJJLIIIJ));
            pairArr[1] = new Pair("event_type", "5");
            LJIJI(C2097608Jq.LJIIIIZZ(pairArr));
            return;
        }
        Pair[] pairArr2 = new Pair[3];
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel2);
        }
        pairArr2[0] = new Pair("room_id", String.valueOf(jLJJLIIIJ));
        pairArr2[1] = new Pair("event_type", "6");
        if (str == null) {
            str = "";
        }
        pairArr2[2] = new Pair("trigger_type", str);
        LJIJI(C2097608Jq.LJIIIIZZ(pairArr2));
    }

    @Override // X.AbstractC1097820efs
    public final ToolbarTipsCheckFeature LJIIJJI(DataChannel dataChannel, C1092890eXv c1092890eXv) {
        String str;
        Map<String, Object> map;
        ToolbarTipsCheckFeature toolbarTipsCheckFeature = new ToolbarTipsCheckFeature();
        toolbarTipsCheckFeature.roomId = C500260Jjc.LJJLIIIJ(dataChannel);
        toolbarTipsCheckFeature.anchorId = C500260Jjc.LIZIZ(dataChannel);
        C0J0M c0j0m = c1092890eXv.LIZIZ;
        Object obj = null;
        if (c0j0m != null && (map = c0j0m.LJFF) != null) {
            obj = map.get("trigger_feature");
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        toolbarTipsCheckFeature.toolbarTipsTriggerName = str;
        toolbarTipsCheckFeature.showComTypes = new ArrayList(LJIILLIIL(dataChannel));
        toolbarTipsCheckFeature.unclickComTypes = new ArrayList(LJIIZILJ());
        AwS551S0100000_7 awS551S0100000_7 = this.LIZIZ;
        if (awS551S0100000_7 != null) {
            toolbarTipsCheckFeature.watchDuration = (System.currentTimeMillis() - ((Number) awS551S0100000_7.invoke()).longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return toolbarTipsCheckFeature;
    }
}
