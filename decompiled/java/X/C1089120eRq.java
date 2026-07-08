package X;

import com.bytedance.android.live.dynamicstrategy.LiveClientStrategyPublicScreenFrequency;
import com.bytedance.android.live.dynamicstrategy.LiveEnterDistributionInterval;
import com.bytedance.android.live.dynamicstrategy.LiveLikeParamsMapChanel;
import com.bytedance.android.live.dynamicstrategy.LivePublicScreenDistributionSwitch;
import com.bytedance.android.live.dynamicstrategy.LiveSmallScreenOptRule;
import com.bytedance.android.live.dynamicstrategy.LiveStrategyPublicScreenAnimationDuration;
import com.bytedance.android.live.dynamicstrategy.LiveStrategyReachPublicScreenFrequency;
import com.bytedance.android.live.dynamicstrategy.PublicScreenBackgroundAlpha;
import com.bytedance.android.live.dynamicstrategy.PublicScreenBackgroundAlphaV2;
import com.bytedance.android.live.dynamicstrategy.PublicScreenFirstDelay;
import com.bytedance.android.live.dynamicstrategy.StreamAdaptionInputEnableEvent;
import com.bytedance.android.live.dynamicstrategy.TopMaskVisibilityEvent;
import com.bytedance.android.live.dynamicstrategy.setting.LiveEpiServerFeatureTypesSetting;
import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.setting.LivePublicScreenBgAnimationSwitchSetting;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.dataChannel.LivePortraitScrollAngleData;
import com.bytedance.android.livesdk.dataChannel.LivePortraitScrollSpeedData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveAdaptStrategyAddParamsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LiveChatLineMarginConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LiveLikeEffectLevelConfig;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LivePSAnimationDurationSetting;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LivePanGestureAngleV2;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LivePanGestureSpeed;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LiveStreamCommentAdaptionConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.PublicScreenFrequencyRuleConfig;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.PublicScreenSmallScreenOptRuleConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveAdaptEpiToFeatureCenterExp;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting;
import com.bytedance.android.livesdk.model.message.EpiDecision;
import com.bytedance.android.livesdk.model.message.RoomStreamAdaptationMessage;
import com.bytedance.android.livesdk.signal.LiveEpiExpandLifecycleSetting;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkEPIData;
import com.bytedance.android.livesdkapi.depend.model.live.EPIFeatureValue;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.livestrategy.config.FinalStrategyConfig;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.epiphron.UploadFeatureRequest;
import tikcast.api.privilege.enigma.EnigmaEPIMessage;

/* JADX INFO: renamed from: X.0eRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@InterfaceC1294060jmO
public final class C1089120eRq implements InterfaceC1089430eSL {
    public final DataChannel LIZ;
    public final C01GW LIZIZ;
    public final C1089290eS7 LIZJ;
    public final C1089780eSu LIZLLL;
    public final C1089230eS1 LJ;
    public final C1089240eS2 LJFF;
    public final C1089210eRz LJI;
    public final Map<String, List<C443120HZe<String, String, InterfaceC1093100eYG>>> LJII;
    public final C01GW LJIIIIZZ;
    public final C1088580eQy LJIIIZ;
    public EnumC755280Tjy LJIIJ;
    public final C01GW LJIIJJI;
    public final C1089030eRh LJIIL;

    @Override // X.InterfaceC1089430eSL
    public final void LIZ() {
        C1089880eT4 c1089880eT4;
        C1089870eT3 c1089870eT3 = (C1089870eT3) this.LJIIJJI.getValue();
        final C1089030eRh c1089030eRh = this.LJIIL;
        final C1089280eS6 c1089280eS6 = (C1089280eS6) c1089870eT3.LJIILIIL.getValue();
        c1089280eS6.getClass();
        C0J6B.LIZJ.put(c1089280eS6.LJIIIIZZ, new C0J6D() { // from class: X.0J6H
            @Override // X.C0J6D
            public final void LIZIZ(DownlinkEPIData downlinkEPIData) {
                c1089030eRh.LIZIZ(downlinkEPIData);
                c1089280eS6.LJ = downlinkEPIData.getSwitch();
                c1089280eS6.LIZIZ = downlinkEPIData.getNewDuration();
                C1089280eS6 c1089280eS62 = c1089280eS6;
                if (!c1089280eS62.LJ) {
                    C11JF c11jf = c1089280eS62.LJFF;
                    if (c11jf != null && !c11jf.isDisposed()) {
                        C500260Jjc.LJJLIIIJLJLI(c11jf);
                    }
                    C11JF c11jf2 = c1089280eS62.LJI;
                    if (c11jf2 != null && !c11jf2.isDisposed()) {
                        C500260Jjc.LJJLIIIJLJLI(c11jf2);
                    }
                }
            }
        });
        if (((Boolean) c1089870eT3.LIZLLL.getValue()).booleanValue()) {
            C1089280eS6 c1089280eS62 = (C1089280eS6) c1089870eT3.LJIILIIL.getValue();
            long jLongValue = ((Number) c1089870eT3.LJFF.getValue()).longValue();
            if (c1089280eS62.LJ) {
                if (jLongValue <= 0) {
                    c1089280eS62.LIZLLL(true);
                } else {
                    c1089280eS62.LJ(jLongValue, true);
                }
            }
            if (!c1089870eT3.LJIILJJIL || (c1089880eT4 = c1089870eT3.LJIILL) == null) {
                return;
            }
            C1088580eQy c1088580eQy = c1089870eT3.LIZJ;
            if (((ArrayList) c1088580eQy.LIZIZ).contains(c1089880eT4)) {
                return;
            }
            ((ArrayList) c1088580eQy.LIZIZ).add(c1089880eT4);
            Pair<? extends InterfaceC1100800ekg, C1101180elI> pair = c1088580eQy.LIZJ;
            if (pair != null) {
                c1089880eT4.LIZJ(pair);
            }
        }
    }

    @Override // X.InterfaceC1089430eSL
    public final void LIZLLL() {
        C1089880eT4 c1089880eT4;
        C1089870eT3 c1089870eT3 = (C1089870eT3) this.LJIIJJI.getValue();
        C1089280eS6 c1089280eS6 = (C1089280eS6) c1089870eT3.LJIILIIL.getValue();
        c1089280eS6.getClass();
        C0J6B.LIZJ.remove(c1089280eS6.LJIIIIZZ);
        if (((Boolean) c1089870eT3.LIZLLL.getValue()).booleanValue()) {
            C1089280eS6 c1089280eS62 = (C1089280eS6) c1089870eT3.LJIILIIL.getValue();
            C11JF c11jf = c1089280eS62.LJFF;
            if (c11jf != null && !c11jf.isDisposed()) {
                C500260Jjc.LJJLIIIJLJLI(c11jf);
            }
            C11JF c11jf2 = c1089280eS62.LJI;
            if (c11jf2 != null && !c11jf2.isDisposed()) {
                C500260Jjc.LJJLIIIJLJLI(c11jf2);
            }
            if (!c1089870eT3.LJIILJJIL || (c1089880eT4 = c1089870eT3.LJIILL) == null) {
                return;
            }
            C1088580eQy c1088580eQy = c1089870eT3.LIZJ;
            if (((ArrayList) c1088580eQy.LIZIZ).contains(c1089880eT4)) {
                ((ArrayList) c1088580eQy.LIZIZ).remove(c1089880eT4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0eSS] */
    @Override // X.InterfaceC1089430eSL
    public final void prepare() {
        C1089210eRz c1089210eRz = this.LJI;
        c1089210eRz.LIZIZ.prepare();
        c1089210eRz.LIZ.LJFF(c1089210eRz);
        c1089210eRz.LIZ.prepare();
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).gR(new InterfaceC1089970eTD() { // from class: X.0eSS
            @Override // X.InterfaceC1089970eTD
            public final C1090000eTG O3(EnumC1094630eaj enumC1094630eaj, String str, String str2) {
                InterfaceC1088470eQn interfaceC1088470eQn;
                EnumC1094630eaj enumC1094630eaj2 = EnumC1094630eaj.DEFAULT;
                if (enumC1094630eaj != enumC1094630eaj2 || !Intrinsics.LJFF(str, EnumC467180ITs.EPI.getGroupName()) || (interfaceC1088470eQn = (InterfaceC1088470eQn) ((LinkedHashMap) this.LIZ.LJFF.LLIZ).get(str2)) == null) {
                    return null;
                }
                return new C1090000eTG(C0J0Q.ROOM, enumC1094630eaj2, interfaceC1088470eQn.LIZ());
            }
        });
    }

    @Override // X.InterfaceC1089430eSL
    public final void release() {
        C1089210eRz c1089210eRz = this.LJI;
        c1089210eRz.LIZIZ.release();
        c1089210eRz.LIZ.release();
        Iterator it2 = ((LinkedHashMap) this.LJII).entrySet().iterator();
        while (it2.hasNext()) {
            for (C443120HZe c443120HZe : (Iterable) ((Map.Entry) it2.next()).getValue()) {
                ((ILiveDecisionService) this.LJIIIIZZ.getValue()).sl((String) c443120HZe.getFirst(), (String) c443120HZe.getSecond(), (InterfaceC1093100eYG) c443120HZe.getThird());
            }
        }
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).d22();
        ((LinkedHashMap) this.LJII).clear();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // X.InterfaceC1089430eSL
    public final C1088580eQy LIZJ() {
        return this.LJIIIZ;
    }

    public C1089120eRq(final DataChannel dataChannel) {
        C1089030eRh c1089030eRh;
        this.LIZ = dataChannel;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(316));
        this.LIZIZ = c01gwLIZIZ;
        C1089290eS7 c1089290eS7 = new C1089290eS7(LiveStrategyParamsSwitchSetting.getValue().repeatSkip);
        this.LIZJ = c1089290eS7;
        final C1089720eSo c1089720eSo = new C1089720eSo();
        final C1089780eSu c1089780eSu = new C1089780eSu(c1089290eS7);
        this.LIZLLL = c1089780eSu;
        C1089230eS1 c1089230eS1 = new C1089230eS1();
        this.LJ = c1089230eS1;
        final C1089240eS2 c1089240eS2 = new C1089240eS2(c1089230eS1, C500260Jjc.LJIIZILJ(dataChannel));
        this.LJFF = c1089240eS2;
        boolean value = LiveAdaptStrategyAddParamsSetting.INSTANCE.getValue();
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            Long.valueOf(room.getId()).toString();
        }
        final C1089210eRz c1089210eRz = new C1089210eRz(c1089240eS2, c1089230eS1);
        this.LJI = c1089210eRz;
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(315));
        LiveEpiFeatureMigrateToFeatureCenterSetting liveEpiFeatureMigrateToFeatureCenterSetting = LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE;
        if (liveEpiFeatureMigrateToFeatureCenterSetting.getValue()) {
            c1089210eRz.LJ((List) C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(314)).getValue());
        }
        C1089550eSX c1089550eSX = new C1089550eSX(dataChannel, c1089720eSo);
        c1089550eSX.LIZ(new AbstractC1089560eSY<Float>(c1089720eSo, c1089210eRz) { // from class: X.0eSK
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.PUBLIC_SCREEN_FREQUENCY.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final boolean LIZJ(Float f) {
                if (f.floatValue() > 0.0f) {
                    return true;
                }
                return false;
            }

            {
                super(new C1089100eRo(), c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                float fFloatValue = ((Number) obj).floatValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    String.valueOf(fFloatValue);
                    interfaceC1089790eSv.LIZ();
                }
                dataChannel2.zW(LiveStrategyReachPublicScreenFrequency.class, Integer.valueOf(C814420VxA.LIZIZ(fFloatValue * LSPassThroughRecordSizeConfig.DEFAULT)));
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Long>(c1089210eRz) { // from class: X.0eSU
            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.ENTER_DISTRIBUTION_INTERVAL.getType();
            }

            {
                C1089990eTF c1089990eTF = new C1089990eTF();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(Long l) {
                l.longValue();
                return true;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                dataChannel2.zW(LiveEnterDistributionInterval.class, Long.valueOf(((Number) obj).longValue()));
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Boolean>(c1089720eSo, c1089210eRz) { // from class: X.0eSQ
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.PUBLIC_SCREEN_DISTRIBUTION_SWITCH.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(Boolean bool) {
                bool.booleanValue();
                return true;
            }

            {
                super(new C1933007hg(), null, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    String.valueOf(zBooleanValue);
                    interfaceC1089790eSv.LIZ();
                }
                dataChannel2.zW(LivePublicScreenDistributionSwitch.class, Boolean.valueOf(zBooleanValue));
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Float>(c1089720eSo, c1089210eRz) { // from class: X.0eSA
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.PUBLIC_SCREEN_BACKGROUND_ALPHA.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final boolean LIZJ(Float f) {
                double dFloatValue = f.floatValue();
                if (0.0d <= dFloatValue && dFloatValue <= 1.0d) {
                    return true;
                }
                return false;
            }

            {
                super(new C1089100eRo(), null, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                float fFloatValue = ((Number) obj).floatValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.PUBLIC_SCREEN_BACKGROUND_ALPHA.getType();
                    String.valueOf(fFloatValue);
                    interfaceC1089790eSv.LIZ();
                }
                dataChannel2.zW(PublicScreenBackgroundAlpha.class, new int[]{0, C814420VxA.LIZIZ(fFloatValue * 255) << 24});
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Integer>(c1089720eSo, c1089210eRz) { // from class: X.0eSM
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.PUBLIC_SCREEN_FIRST_DELAY.getType();
            }

            {
                super(new C1932907hf(), c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                int iIntValue = ((Number) obj).intValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.PUBLIC_SCREEN_FIRST_DELAY.getType();
                    String.valueOf(iIntValue);
                    interfaceC1089790eSv.LIZ();
                }
                dataChannel2.zW(PublicScreenFirstDelay.class, Integer.valueOf(iIntValue));
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Integer>(c1089720eSo, c1089210eRz) { // from class: X.0eSE
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_TRACKING_ENABLE.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(Integer num) {
                num.intValue();
                return true;
            }

            {
                super(new C1932907hf(), c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                int iIntValue = ((Number) obj).intValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_TRACKING_ENABLE.getType();
                    String.valueOf(iIntValue);
                    interfaceC1089790eSv.LIZ();
                }
                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJI(iIntValue, EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_TRACKING_ENABLE.getType());
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Integer>(c1089720eSo, c1089210eRz) { // from class: X.0eSG
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_TRAY_ANIMATION_ENABLE.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(Integer num) {
                num.intValue();
                return true;
            }

            {
                super(new C1932907hf(), c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                int iIntValue = ((Number) obj).intValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_TRAY_ANIMATION_ENABLE.getType();
                    String.valueOf(iIntValue);
                    interfaceC1089790eSv.LIZ();
                }
                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJI(iIntValue, EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_TRAY_ANIMATION_ENABLE.getType());
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Integer>(c1089720eSo, c1089210eRz) { // from class: X.0eSD
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_LYNX_GIFT_ENABLE.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(Integer num) {
                num.intValue();
                return true;
            }

            {
                super(new C1932907hf(), c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                int iIntValue = ((Number) obj).intValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_LYNX_GIFT_ENABLE.getType();
                    String.valueOf(iIntValue);
                    interfaceC1089790eSv.LIZ();
                }
                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJI(iIntValue, EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_LYNX_GIFT_ENABLE.getType());
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Integer>(c1089720eSo, c1089210eRz) { // from class: X.0eSH
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_COMBO_SOUND_ENABLE.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(Integer num) {
                num.intValue();
                return true;
            }

            {
                super(new C1932907hf(), c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                int iIntValue = ((Number) obj).intValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_COMBO_SOUND_ENABLE.getType();
                    String.valueOf(iIntValue);
                    interfaceC1089790eSv.LIZ();
                }
                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJI(iIntValue, EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_COMBO_SOUND_ENABLE.getType());
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Integer>(c1089720eSo, c1089210eRz) { // from class: X.0eSF
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_AI_ANALYSIS_ENABLE.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(Integer num) {
                num.intValue();
                return true;
            }

            {
                super(new C1932907hf(), c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                int iIntValue = ((Number) obj).intValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_AI_ANALYSIS_ENABLE.getType();
                    String.valueOf(iIntValue);
                    interfaceC1089790eSv.LIZ();
                }
                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJI(iIntValue, EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_AI_ANALYSIS_ENABLE.getType());
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<Integer>(c1089720eSo, c1089210eRz) { // from class: X.0eSI
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_LOWER_MESSAGE_BUFFER_ENABLE.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(Integer num) {
                num.intValue();
                return true;
            }

            {
                super(new C1932907hf(), c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                int iIntValue = ((Number) obj).intValue();
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_LOWER_MESSAGE_BUFFER_ENABLE.getType();
                    String.valueOf(iIntValue);
                    interfaceC1089790eSv.LIZ();
                }
                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJI(iIntValue, EnumC1089410eSJ.EPI_LIVE_GIFT_OVERLOAD_DOWNGRADE_LOWER_MESSAGE_BUFFER_ENABLE.getType());
            }
        });
        if (LivePublicScreenBgAnimationSwitchSetting.INSTANCE.getValue()) {
            c1089550eSX.LIZ(new AbstractC1089560eSY<List<? extends Float>>(c1089720eSo, c1089210eRz) { // from class: X.0eRu
                public final InterfaceC1089790eSv LJ;

                @Override // X.AbstractC1089560eSY
                public final String LIZIZ() {
                    return EnumC1089410eSJ.PUBLIC_SCREEN_BACKGROUND_ALPHA_V2.getType();
                }

                @Override // X.AbstractC1089560eSY
                public final boolean LIZJ(List<? extends Float> list) {
                    List<? extends Float> list2 = list;
                    if (list2.size() < 3 || ((Number) ListProtector.get(list2, 0)).floatValue() < 0.0f || ((Number) ListProtector.get(list2, 0)).floatValue() > 1.0f || ((Number) ListProtector.get(list2, 1)).floatValue() > 1.0f) {
                        return false;
                    }
                    if ((((Number) ListProtector.get(list2, 1)).floatValue() < 0.0f && ((Number) ListProtector.get(list2, 1)).floatValue() != -1.0f) || ((Number) ListProtector.get(list2, 2)).floatValue() < 0.0f || ((Number) ListProtector.get(list2, 2)).floatValue() > 1.0f) {
                        return false;
                    }
                    return true;
                }

                {
                    super(new C1936207iC(new C1089100eRo()), null, c1089210eRz);
                    this.LJ = c1089720eSo;
                }

                @Override // X.AbstractC1089560eSY
                public final void LIZ(DataChannel dataChannel2, Object obj) {
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Float fValueOf = Float.valueOf(0.0f);
                    arrayList.add(fValueOf);
                    arrayList2.add(fValueOf);
                    if (((Number) ListProtector.get(list, 1)).floatValue() == -1.0f) {
                        arrayList2.add(fValueOf);
                        arrayList.add(fValueOf);
                    } else {
                        arrayList2.add(ListProtector.get(list, 0));
                        arrayList.add(ListProtector.get(list, 1));
                    }
                    arrayList2.add(Float.valueOf(1.0f));
                    arrayList.add(ListProtector.get(list, 2));
                    C1080610eE7 c1080610eE7 = new C1080610eE7(C13LP.LLI(arrayList), C13LP.LLI(arrayList2));
                    InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                    if (interfaceC1089790eSv != null) {
                        EnumC1089410eSJ.PUBLIC_SCREEN_BACKGROUND_ALPHA.getType();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("t[0]: ");
                        sbLIZ.append(((Number) ListProtector.get(list, 0)).floatValue());
                        sbLIZ.append("   t[1]:");
                        sbLIZ.append(((Number) ListProtector.get(list, 1)).floatValue());
                        sbLIZ.append("  t[2]:");
                        sbLIZ.append(((Number) ListProtector.get(list, 2)).floatValue());
                        C2188811AlT.LIZIZ(sbLIZ);
                        interfaceC1089790eSv.LIZ();
                    }
                    dataChannel2.zW(PublicScreenBackgroundAlphaV2.class, c1080610eE7);
                }
            });
        }
        c1089550eSX.LIZ(new AbstractC1089560eSY<List<? extends Integer>>(c1089720eSo, c1089210eRz) { // from class: X.0eSC
            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.EPI_FEED_GESTURE_ANGLE.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final boolean LIZJ(List<? extends Integer> list) {
                return !list.isEmpty();
            }

            {
                C1936207iC c1936207iC = new C1936207iC(new C1932907hf());
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    DataChannelGlobal.LLILZ.HQ2(LivePortraitScrollAngleData.class, ListProtector.get(list, 0));
                }
            }
        });
        c1089550eSX.LIZ(new AbstractC1089560eSY<EnigmaEPIMessage>(c1089720eSo, c1089210eRz) { // from class: X.0eSV
            public final InterfaceC1089790eSv LJ;

            @Override // X.AbstractC1089560eSY
            public final String LIZIZ() {
                return EnumC1089410eSJ.EPI_ENIGMA_MESSAGE.getType();
            }

            @Override // X.AbstractC1089560eSY
            public final /* bridge */ /* synthetic */ boolean LIZJ(EnigmaEPIMessage enigmaEPIMessage) {
                return true;
            }

            {
                super(new InterfaceC1936307iD<EnigmaEPIMessage>(c1089720eSo) { // from class: X.0eSa
                    public final InterfaceC1089790eSv LIZ;

                    {
                        this.LIZ = c1089720eSo;
                    }

                    @Override // X.InterfaceC1936307iD
                    public final EnigmaEPIMessage parse(String str) {
                        EnigmaEPIMessage enigmaEPIMessage = new EnigmaEPIMessage();
                        try {
                            return (EnigmaEPIMessage) C19748512Ol.LIZIZ.LJII(str, EnigmaEPIMessage.class);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            InterfaceC1089790eSv interfaceC1089790eSv = this.LIZ;
                            if (interfaceC1089790eSv != null) {
                                th.toString();
                                interfaceC1089790eSv.LIZIZ();
                            }
                            return enigmaEPIMessage;
                        }
                    }
                }, c1089720eSo, c1089210eRz);
                this.LJ = c1089720eSo;
            }

            @Override // X.AbstractC1089560eSY
            public final void LIZ(DataChannel dataChannel2, Object obj) {
                Room roomLJJLIIIIJ;
                EnigmaEPIMessage enigmaEPIMessage = (EnigmaEPIMessage) obj;
                InterfaceC1089790eSv interfaceC1089790eSv = this.LJ;
                if (interfaceC1089790eSv != null) {
                    EnumC1089410eSJ.EPI_ENIGMA_MESSAGE.getType();
                    String.valueOf(enigmaEPIMessage.epiAction);
                    interfaceC1089790eSv.LIZ();
                }
                if (enigmaEPIMessage.epiAction == 1 && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null) {
                    ((IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class)).ia2(roomLJJLIIIIJ, 1L, AFwS205S0000000_17.get$arr$(147), AFwS254S0000000_17.get$arr$(106), dataChannel2);
                }
            }
        });
        final C1088580eQy c1088580eQy = new C1088580eQy(dataChannel);
        this.LJIIIZ = c1088580eQy;
        this.LJIIJ = EnumC755280Tjy.VIEWER;
        this.LJIIJJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 548));
        if (!liveEpiFeatureMigrateToFeatureCenterSetting.getValue() && !LiveAdaptEpiToFeatureCenterExp.INSTANCE.getEnable()) {
            c1089030eRh = new C1089030eRh(dataChannel);
            LJ(c1089030eRh, null);
        } else {
            c1089030eRh = new C1089030eRh(dataChannel);
            LJ(c1089030eRh, new InterfaceC1089750eSr<EpiDecision>() { // from class: X.0eRr
                @Override // X.InterfaceC1089750eSr
                public final void LIZ(C0J0Q c0j0q, Object obj, String str) {
                    Map<String, String> map;
                    C0J0Q c0j0q2;
                    Map<String, Float> map2;
                    C0J0Q c0j0q3;
                    Map<String, Long> map3;
                    EpiDecision epiDecision = (EpiDecision) obj;
                    if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
                        EPIFeatureValue ePIFeatureValue = epiDecision.LIZ;
                        if (ePIFeatureValue != null && (map3 = ePIFeatureValue.intFeature) != null) {
                            C1089120eRq c1089120eRq = this.LIZ;
                            for (Map.Entry<String, Long> entry : map3.entrySet()) {
                                C0J0E c0j0eLIZ = C0J0F.LIZ(entry.getKey());
                                if (c0j0eLIZ != null) {
                                    ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) c1089120eRq.LJIIIIZZ.getValue();
                                    C0J0Q c0j0q4 = C0J0Q.ROOM;
                                    if (c0j0q == c0j0q4) {
                                        if (C500260Jjc.LJIIZILJ(c1089120eRq.LIZ)) {
                                            c0j0q4 = C0J0Q.ANCHOR;
                                        }
                                    } else {
                                        c0j0q4 = c0j0q;
                                    }
                                    iLiveDecisionService.bg(c0j0q4, c0j0eLIZ.LIZ, entry.getValue(), c0j0eLIZ.LIZJ, false);
                                }
                            }
                        }
                        EPIFeatureValue ePIFeatureValue2 = epiDecision.LIZ;
                        if (ePIFeatureValue2 != null && (map2 = ePIFeatureValue2.floatFeature) != null) {
                            C1089120eRq c1089120eRq2 = this.LIZ;
                            for (Map.Entry<String, Float> entry2 : map2.entrySet()) {
                                C0J0E c0j0eLIZ2 = C0J0F.LIZ(entry2.getKey());
                                if (c0j0eLIZ2 != null) {
                                    ILiveDecisionService iLiveDecisionService2 = (ILiveDecisionService) c1089120eRq2.LJIIIIZZ.getValue();
                                    if (C500260Jjc.LJIIZILJ(c1089120eRq2.LIZ)) {
                                        c0j0q3 = C0J0Q.ANCHOR;
                                    } else {
                                        c0j0q3 = C0J0Q.ROOM;
                                    }
                                    iLiveDecisionService2.bg(c0j0q3, c0j0eLIZ2.LIZ, entry2.getValue(), c0j0eLIZ2.LIZJ, false);
                                }
                            }
                        }
                        EPIFeatureValue ePIFeatureValue3 = epiDecision.LIZ;
                        if (ePIFeatureValue3 != null && (map = ePIFeatureValue3.stringFeature) != null) {
                            C1089120eRq c1089120eRq3 = this.LIZ;
                            for (Map.Entry<String, String> entry3 : map.entrySet()) {
                                C0J0E c0j0eLIZ3 = C0J0F.LIZ(entry3.getKey());
                                if (c0j0eLIZ3 != null) {
                                    ILiveDecisionService iLiveDecisionService3 = (ILiveDecisionService) c1089120eRq3.LJIIIIZZ.getValue();
                                    if (C500260Jjc.LJIIZILJ(c1089120eRq3.LIZ)) {
                                        c0j0q2 = C0J0Q.ANCHOR;
                                    } else {
                                        c0j0q2 = C0J0Q.ROOM;
                                    }
                                    iLiveDecisionService3.bg(c0j0q2, c0j0eLIZ3.LIZ, entry3.getValue(), c0j0eLIZ3.LIZJ, false);
                                }
                            }
                            return;
                        }
                        return;
                    }
                    if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
                        Map<String, String> map4 = epiDecision.serverFeatures;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry4 : map4.entrySet()) {
                            if (LiveEpiServerFeatureTypesSetting.INSTANCE.getValue(entry4) != null) {
                                linkedHashMap.put(entry4.getKey(), entry4.getValue());
                            }
                        }
                        C1089120eRq c1089120eRq4 = this.LIZ;
                        for (Map.Entry<String, String> entry5 : linkedHashMap.entrySet()) {
                            Object value2 = LiveEpiServerFeatureTypesSetting.INSTANCE.getValue(entry5);
                            if (value2 != null) {
                                String key = entry5.getKey();
                                c1089120eRq4.getClass();
                                if (key != null) {
                                    c1089120eRq4.LJFF.LJ(C0J0Q.ROOM, value2, key);
                                }
                            }
                        }
                        return;
                    }
                    if (LiveAdaptEpiToFeatureCenterExp.INSTANCE.getEnable()) {
                        Map<String, String> map5 = epiDecision.serverFeatures;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry<String, String> entry6 : map5.entrySet()) {
                            if (LiveAdaptEpiToFeatureCenterExp.INSTANCE.getAdaptKeyList().contains(entry6.getKey())) {
                                linkedHashMap2.put(entry6.getKey(), entry6.getValue());
                            }
                        }
                        for (Map.Entry entry7 : linkedHashMap2.entrySet()) {
                            ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).zG1(C0J0Q.APP, (String) entry7.getKey(), (String) entry7.getValue(), EnumC467180ITs.EPI.getGroupName());
                        }
                    }
                }
            });
        }
        this.LJIIL = c1089030eRh;
        LJ(new AbstractC1089020eRg<Float>(dataChannel) { // from class: X.0eRk
            {
                C1084800eKs c1084800eKs = new AbstractC1084540eKS<Float>() { // from class: X.0eKs
                    {
                        Float.valueOf(2.0f);
                    }
                };
                C1089100eRo c1089100eRo = new C1089100eRo();
            }
        }, null);
        LJ(new AbstractC1089040eRi<Float>(dataChannel) { // from class: X.0eRl
            {
                C1084120eJm c1084120eJm = new AbstractC1084540eKS<Float>() { // from class: X.0eJm
                    {
                        Float.valueOf(255.0f);
                    }
                };
                C1089100eRo c1089100eRo = new C1089100eRo();
            }
        }, null);
        LJ(new AbstractC1089040eRi<Float>(dataChannel) { // from class: X.0eRm
            {
                C1084130eJn c1084130eJn = new AbstractC1084540eKS<Float>() { // from class: X.0eJn
                    {
                        Float.valueOf(255.0f);
                    }
                };
                C1089100eRo c1089100eRo = new C1089100eRo();
            }
        }, null);
        LJ(new AbstractC1088480eQo<Integer>(dataChannel) { // from class: X.0eRc
            {
                C1088990eRd c1088990eRd = new AbstractC1084540eKS<Integer>() { // from class: X.0eRd
                };
                C1088950eRZ c1088950eRZ = new C1088950eRZ(new C1932907hf());
            }
        }, null);
        LJ(new AbstractC1088480eQo<String>(dataChannel) { // from class: X.0eRa
            {
                C1084760eKo c1084760eKo = new AbstractC1084540eKS<String>() { // from class: X.0eKo
                };
                C1088950eRZ c1088950eRZ = new C1088950eRZ(new C1089010eRf());
            }
        }, null);
        LJ(new AbstractC1088480eQo<Integer>(dataChannel) { // from class: X.0eRb
            {
                C1089000eRe c1089000eRe = C1089000eRe.LIZLLL;
                C1088950eRZ c1088950eRZ = new C1088950eRZ(new C1932907hf());
            }
        }, null);
        LJ(new AbstractC1089040eRi<Integer>(dataChannel) { // from class: X.0eRj
            {
                C1084260eK0 c1084260eK0 = new AbstractC1084540eKS<Integer>() { // from class: X.0eK0
                };
                C1932907hf c1932907hf = new C1932907hf();
            }
        }, null);
        LJ(new AbstractC1087280eOs<Integer, Unit>(dataChannel) { // from class: X.0eKx
            {
                C1084100eJk c1084100eJk = C1084100eJk.LIZLLL;
            }

            @Override // X.AbstractC1088350eQb
            public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
                return uploadFeatureRequest.roomFeature;
            }

            @Override // X.AbstractC1087280eOs
            public final Integer LJIIIIZZ(CopyOnWriteArrayList<C1087320eOw<Unit>> copyOnWriteArrayList) {
                return Integer.valueOf(copyOnWriteArrayList.size());
            }
        }, null);
        LJ(new AbstractC1084380eKC<Integer, C1083410eId>(dataChannel) { // from class: X.0eK7
            {
                C1084360eKA c1084360eKA = new AbstractC1084540eKS<Integer>() { // from class: X.0eKA
                    {
                        C0J0Q c0j0q = C0J0Q.LIVE;
                    }
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Integer.valueOf(((C1083410eId) obj).LIZIZ);
            }
        }, null);
        LJ(new AbstractC1084380eKC<Integer, C1083410eId>(dataChannel) { // from class: X.0eK6
            {
                C1084350eK9 c1084350eK9 = new AbstractC1084540eKS<Integer>() { // from class: X.0eK9
                    {
                        C0J0Q c0j0q = C0J0Q.LIVE;
                    }
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Integer.valueOf(((C1083410eId) obj).LIZJ);
            }
        }, null);
        LJ(new AbstractC1084380eKC<Integer, C1083410eId>(dataChannel) { // from class: X.0eK5
            {
                C1084300eK4 c1084300eK4 = new AbstractC1084540eKS<Integer>() { // from class: X.0eK4
                };
            }

            @Override // X.AbstractC1084380eKC, X.AbstractC1088350eQb
            public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
                return uploadFeatureRequest.roomFeature;
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Integer.valueOf(((C1083410eId) obj).LIZ);
            }
        }, null);
        LJ(new AbstractC1084380eKC<Integer, Integer>(dataChannel) { // from class: X.0eK8
            {
                C1084370eKB c1084370eKB = new AbstractC1084540eKS<Integer>() { // from class: X.0eKB
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Integer.valueOf(((Number) obj).intValue());
            }
        }, null);
        LJFF(new C1088290eQV(), value);
        LJFF(new AbstractC1088260eQS<Integer, Boolean>(dataChannel) { // from class: X.0eJw
            {
                C1084230eJx c1084230eJx = new AbstractC1084540eKS<Integer>() { // from class: X.0eJx
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Integer LJII(Boolean bool) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
        }, true);
        LJ(new AbstractC1088350eQb<Boolean>() { // from class: X.0eQT
            @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
            public final void release() {
            }

            {
                C1084610eKZ c1084610eKZ = new AbstractC1084540eKS<Boolean>() { // from class: X.0eKZ
                    {
                        Boolean bool = Boolean.FALSE;
                        C0J0Q c0j0q = C0J0Q.APP;
                    }
                };
            }

            @Override // X.AbstractC1089300eS8
            public final Object LIZLLL() {
                return Boolean.valueOf(C497740JfY.LJJ());
            }

            @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
            public final void LJ() {
                LJFF(Boolean.valueOf(C497740JfY.LJJ()));
            }

            @Override // X.AbstractC1088350eQb
            public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
                return uploadFeatureRequest.baseInfo;
            }
        }, null);
        LJ(new AbstractC1084390eKD<Long, C1084430eKH>(dataChannel) { // from class: X.0eKE
            {
                C1084190eJt c1084190eJt = new AbstractC1084540eKS<Long>() { // from class: X.0eJt
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Long.valueOf(((C1084430eKH) obj).LIZ);
            }
        }, null);
        LJ(new AbstractC1084390eKD<Long, C1084430eKH>(dataChannel) { // from class: X.0eKL
            {
                C1084490eKN c1084490eKN = new AbstractC1084540eKS<Long>() { // from class: X.0eKN
                    {
                        C0J0Q c0j0q = C0J0Q.APP;
                    }
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Long.valueOf(((C1084430eKH) obj).LIZIZ);
            }
        }, null);
        LJ(new AbstractC1084390eKD<Long, C1084430eKH>(dataChannel) { // from class: X.0eKK
            {
                C1084510eKP c1084510eKP = new AbstractC1084540eKS<Long>() { // from class: X.0eKP
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Long.valueOf(((C1084430eKH) obj).LJFF);
            }
        }, null);
        LJ(new AbstractC1084390eKD<Boolean, C1084430eKH>(dataChannel) { // from class: X.0eKG
            {
                C1084210eJv c1084210eJv = new AbstractC1084540eKS<Boolean>() { // from class: X.0eJv
                    {
                        Boolean bool = Boolean.FALSE;
                    }
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                boolean z;
                C1084430eKH c1084430eKH = (C1084430eKH) obj;
                if (c1084430eKH.LIZIZ == c1084430eKH.LJFF) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, null);
        LJ(new AbstractC1084390eKD<Boolean, C1084430eKH>(dataChannel) { // from class: X.0eKJ
            {
                C1084520eKQ c1084520eKQ = new AbstractC1084540eKS<Boolean>() { // from class: X.0eKQ
                    {
                        Boolean bool = Boolean.FALSE;
                    }
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Boolean.valueOf(((C1084430eKH) obj).LIZLLL);
            }
        }, null);
        LJ(new AbstractC1084390eKD<Integer, C1084430eKH>(dataChannel) { // from class: X.0eKF
            {
                C1084200eJu c1084200eJu = new AbstractC1084540eKS<Integer>() { // from class: X.0eJu
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return Integer.valueOf(((C1084430eKH) obj).LJ);
            }
        }, null);
        LJ(new AbstractC1084390eKD<String, C1084430eKH>(dataChannel) { // from class: X.0eKI
            {
                C1084500eKO c1084500eKO = new AbstractC1084540eKS<String>() { // from class: X.0eKO
                    {
                        C0J0Q c0j0q = C0J0Q.APP;
                    }
                };
            }

            @Override // X.AbstractC1084390eKD, X.AbstractC1088350eQb
            public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
                return uploadFeatureRequest.baseInfo;
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return ((C1084430eKH) obj).LIZJ;
            }
        }, null);
        LJ(new AbstractC1084390eKD<String, C1084430eKH>(dataChannel) { // from class: X.0eKM
            {
                C1084530eKR c1084530eKR = new AbstractC1084540eKS<String>() { // from class: X.0eKR
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Object LJII(Object obj) {
                return ((C1084430eKH) obj).LJI.getType();
            }
        }, null);
        LJ(new C1088280eQU(), null);
        LJFF(new C1088310eQX(), value);
        LJFF(new C1088320eQY(), value);
        LJFF(new C1088300eQW(), value);
        LJFF(new C1088360eQc(), value);
        LJFF(new C1088430eQj(), value);
        LJFF(new C1088440eQk(), value);
        LJ(new C1088420eQi(), null);
        LJ(new AbstractC1088400eQg<Integer>() { // from class: X.0eQh
            public final int LLILLL;

            @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
            public final void release() {
            }

            {
                C1084620eKa c1084620eKa = new AbstractC1084540eKS<Integer>() { // from class: X.0eKa
                    {
                        C0J0Q c0j0q = C0J0Q.APP;
                    }
                };
                this.LLILLL = 1;
            }

            @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
            public final void LJ() {
                LJFF(Integer.valueOf(this.LLILLL));
            }

            @Override // X.AbstractC1088400eQg, X.AbstractC1088350eQb
            public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
                return uploadFeatureRequest.userProfile;
            }
        }, null);
        LJ(new AbstractC1084840eKw<Boolean, Unit>(dataChannel) { // from class: X.0eKz
            {
                C1084090eJj c1084090eJj = C1084090eJj.LIZLLL;
            }

            @Override // X.AbstractC1087280eOs
            public final Object LJIIIIZZ(CopyOnWriteArrayList copyOnWriteArrayList) {
                return Boolean.valueOf(!copyOnWriteArrayList.isEmpty());
            }
        }, null);
        LJ(new AbstractC1084840eKw<Boolean, Unit>(dataChannel) { // from class: X.0eL0
            {
                C1084110eJl c1084110eJl = C1084110eJl.LIZLLL;
            }

            @Override // X.AbstractC1087280eOs
            public final Object LJIIIIZZ(CopyOnWriteArrayList copyOnWriteArrayList) {
                return Boolean.valueOf(!copyOnWriteArrayList.isEmpty());
            }
        }, null);
        LJ(new AbstractC1084840eKw<Integer, Unit>(dataChannel) { // from class: X.0eKy
            {
                C1084270eK1 c1084270eK1 = new AbstractC1084540eKS<Integer>() { // from class: X.0eK1
                };
            }

            @Override // X.AbstractC1087280eOs
            public final Object LJIIIIZZ(CopyOnWriteArrayList copyOnWriteArrayList) {
                Integer numValueOf = Integer.valueOf(copyOnWriteArrayList.size());
                DataChannelGlobal.LLILZ.JQ2(C1148110fyz.class, Integer.valueOf(numValueOf.intValue()));
                return numValueOf;
            }
        }, null);
        LJ(new AbstractC1088550eQv<Float>(c1088580eQy) { // from class: X.0eR1
            {
                C1084140eJo c1084140eJo = new AbstractC1084540eKS<Float>() { // from class: X.0eJo
                    {
                        Float.valueOf(0.0f);
                    }
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                Float fValueOf;
                InterfaceC1100970ekx interfaceC1100970ekxLIZJ;
                InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) pair.getFirst();
                if (interfaceC1100800ekg != null && (interfaceC1100970ekxLIZJ = interfaceC1100800ekg.LIZJ()) != null) {
                    fValueOf = Float.valueOf(interfaceC1100970ekxLIZJ.LIZJ(15));
                } else {
                    fValueOf = null;
                }
                LJFF(fValueOf);
            }
        }, null);
        LJ(new AbstractC1088550eQv<Integer>(c1088580eQy) { // from class: X.0eQt
            {
                C1084560eKU c1084560eKU = new AbstractC1084540eKS<Integer>() { // from class: X.0eKU
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                EnumC1101170elH enumC1101170elH;
                Integer numValueOf;
                C1101180elI c1101180elI = (C1101180elI) pair.getSecond();
                Integer num = null;
                if (c1101180elI != null && (enumC1101170elH = c1101180elI.LIZLLL) != null && (numValueOf = Integer.valueOf(enumC1101170elH.ordinal())) != null) {
                    numValueOf.intValue();
                    num = numValueOf;
                }
                LJFF(num);
            }
        }, null);
        LJ(new AbstractC1088550eQv<Float>(c1088580eQy) { // from class: X.0eQu
            {
                C1084810eKt c1084810eKt = new AbstractC1084540eKS<Float>() { // from class: X.0eKt
                    {
                        Float.valueOf(0.0f);
                    }
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                Float fValueOf;
                C1101180elI c1101180elI = (C1101180elI) pair.getSecond();
                if (c1101180elI != null) {
                    fValueOf = Float.valueOf(c1101180elI.LIZIZ);
                } else {
                    fValueOf = null;
                }
                LJFF(fValueOf);
            }
        }, null);
        LJ(new AbstractC1088550eQv<Float>(c1088580eQy) { // from class: X.0eQs
            {
                C1084180eJs c1084180eJs = new AbstractC1084540eKS<Float>() { // from class: X.0eJs
                    {
                        Float.valueOf(1001.0f);
                    }
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                float score = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().getScore();
                if (-100.0f <= score && score != 0.0f && score <= 100.0f) {
                    LJFF(Float.valueOf(score));
                }
            }
        }, null);
        LJ(new AbstractC1088550eQv<Double>(c1088580eQy) { // from class: X.0eST
            {
                C1089690eSl c1089690eSl = new AbstractC1084540eKS<Double>() { // from class: X.0eSl
                    {
                        Double.valueOf(0.0d);
                    }
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                Double dValueOf;
                InterfaceC1100960ekw interfaceC1100960ekwLIZIZ;
                InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) pair.getFirst();
                if (interfaceC1100800ekg != null && (interfaceC1100960ekwLIZIZ = interfaceC1100800ekg.LIZIZ()) != null) {
                    dValueOf = Double.valueOf(interfaceC1100960ekwLIZIZ.LIZ());
                } else {
                    dValueOf = null;
                }
                LJFF(dValueOf);
            }

            @Override // X.AbstractC1088550eQv, X.AbstractC1088350eQb
            public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
                return uploadFeatureRequest.performance;
            }
        }, null);
        LJ(new AbstractC1088550eQv<Float>(c1088580eQy) { // from class: X.0eQr
            {
                C1084820eKu c1084820eKu = new AbstractC1084540eKS<Float>() { // from class: X.0eKu
                    {
                        Float.valueOf(0.0f);
                    }
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                Float fValueOf;
                C1101180elI c1101180elI = (C1101180elI) pair.getSecond();
                if (c1101180elI != null) {
                    fValueOf = Float.valueOf(c1101180elI.LIZ);
                } else {
                    fValueOf = null;
                }
                LJFF(fValueOf);
            }

            @Override // X.AbstractC1088550eQv, X.AbstractC1088350eQb
            public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
                return uploadFeatureRequest.userProfile;
            }
        }, null);
        LJ(new AbstractC1088550eQv<Float>(c1088580eQy) { // from class: X.0eSb
            {
                C1089710eSn c1089710eSn = new AbstractC1084540eKS<Float>() { // from class: X.0eSn
                    {
                        Float.valueOf(0.0f);
                    }
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                Float fValueOf;
                InterfaceC1100980eky interfaceC1100980ekyLJIIJ;
                InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) pair.getFirst();
                if (interfaceC1100800ekg != null && (interfaceC1100980ekyLJIIJ = interfaceC1100800ekg.LJIIJ()) != null) {
                    fValueOf = Float.valueOf(interfaceC1100980ekyLJIIJ.LJFF());
                } else {
                    fValueOf = null;
                }
                LJFF(fValueOf);
            }
        }, null);
        LJ(new AbstractC1088550eQv<Float>(c1088580eQy) { // from class: X.0eQz
            {
                C1084660eKe c1084660eKe = new AbstractC1084540eKS<Float>() { // from class: X.0eKe
                    {
                        Float.valueOf(0.0f);
                    }
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                Float fValueOf;
                InterfaceC1100950ekv interfaceC1100950ekvLJ;
                InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) pair.getFirst();
                if (interfaceC1100800ekg != null && (interfaceC1100950ekvLJ = interfaceC1100800ekg.LJ()) != null) {
                    fValueOf = Float.valueOf(interfaceC1100950ekvLJ.getBatteryTemperature());
                } else {
                    fValueOf = null;
                }
                LJFF(fValueOf);
            }

            @Override // X.AbstractC1088550eQv, X.AbstractC1088350eQb
            public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
                return uploadFeatureRequest.performance;
            }
        }, null);
        LJ(new AbstractC1088550eQv<Float>(c1088580eQy) { // from class: X.0eR2
            {
                C1088630eR3 c1088630eR3 = new AbstractC1084540eKS<Float>() { // from class: X.0eR3
                    {
                        Float.valueOf(0.0f);
                    }
                };
            }

            @Override // X.InterfaceC1088570eQx
            public final void LIZJ(Pair pair) {
                Float fValueOf;
                InterfaceC1100970ekx interfaceC1100970ekxLIZJ;
                InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) pair.getFirst();
                if (interfaceC1100800ekg != null && (interfaceC1100970ekxLIZJ = interfaceC1100800ekg.LIZJ()) != null) {
                    fValueOf = Float.valueOf(interfaceC1100970ekxLIZJ.LJII(15));
                } else {
                    fValueOf = null;
                }
                LJFF(fValueOf);
            }
        }, null);
        LJFF(new C1088380eQe(), value);
        LJ(new AbstractC1088260eQS<Float, Float>(dataChannel) { // from class: X.0eJq
            {
                C1084150eJp c1084150eJp = new AbstractC1084540eKS<Float>() { // from class: X.0eJp
                    {
                        Float.valueOf(0.0f);
                    }
                };
            }

            @Override // X.AbstractC1088260eQS
            public final Float LJII(Float f) {
                return Float.valueOf(f.floatValue());
            }
        }, null);
        LJ(new AbstractC1087280eOs<Integer, Unit>(dataChannel) { // from class: X.0eL2
            {
                C1084290eK3 c1084290eK3 = new AbstractC1084540eKS<Integer>() { // from class: X.0eK3
                };
                AbstractC1087300eOu<M> abstractC1087300eOu = new AbstractC1087300eOu<M>() { // from class: X.0eOv
                    @Override // X.AbstractC1087300eOu
                    public final void LIZ(List<C1087320eOw<M>> list, long j, long j2) {
                    }
                };
            }

            @Override // X.AbstractC1087280eOs
            public final Integer LJIIIIZZ(CopyOnWriteArrayList<C1087320eOw<Unit>> copyOnWriteArrayList) {
                return Integer.valueOf(copyOnWriteArrayList.size());
            }
        }, null);
        LJ(new AbstractC1087280eOs<Integer, Integer>(dataChannel) { // from class: X.0eL1
            {
                C1084280eK2 c1084280eK2 = new AbstractC1084540eKS<Integer>() { // from class: X.0eK2
                };
            }

            @Override // X.AbstractC1087280eOs
            public final Integer LJIIIIZZ(CopyOnWriteArrayList<C1087320eOw<Integer>> copyOnWriteArrayList) {
                int iIntValue = 0;
                if (copyOnWriteArrayList.isEmpty()) {
                    return 0;
                }
                Iterator<C1087320eOw<Integer>> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    Integer num = it2.next().LIZIZ;
                    if (num != null) {
                        iIntValue += num.intValue();
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("message count is: ");
                sbLIZ.append(iIntValue);
                C20441214yg.LIZIZ("publicscreen_animation", C2188811AlT.LIZIZ(sbLIZ));
                return Integer.valueOf(iIntValue);
            }
        }, null);
        LJ(new AbstractC1089040eRi<Float>(dataChannel) { // from class: X.0eRn
            {
                C1084170eJr c1084170eJr = new AbstractC1084540eKS<Float>() { // from class: X.0eJr
                    {
                        Float.valueOf(0.0f);
                    }
                };
                C1089100eRo c1089100eRo = new C1089100eRo();
            }
        }, null);
        LJ(new AbstractC1088480eQo<C1088940eRY>(dataChannel) { // from class: X.0eRW
            {
                C1088930eRX c1088930eRX = C1088930eRX.LIZLLL;
                InterfaceC1088490eQp<C1088940eRY, Room> interfaceC1088490eQp = new InterfaceC1088490eQp<C1088940eRY, Room>() { // from class: X.0eRV
                    @Override // X.InterfaceC1088490eQp
                    public final int LIZ() {
                        return C001A.ROOM_STREAM_ADAPTATION_MESSAGE.getIntType();
                    }

                    @Override // X.InterfaceC1088500eQq
                    public final /* bridge */ /* synthetic */ Object LIZIZ(Object obj, AbstractC1088260eQS abstractC1088260eQS) {
                        return null;
                    }

                    @Override // X.InterfaceC1088490eQp
                    public final void LIZJ(IMessage iMessage, AbstractC1089300eS8<C1088940eRY> abstractC1089300eS8) {
                        if (iMessage instanceof RoomStreamAdaptationMessage) {
                            RoomStreamAdaptationMessage roomStreamAdaptationMessage = (RoomStreamAdaptationMessage) iMessage;
                            abstractC1089300eS8.LJFF(new C1088940eRY(roomStreamAdaptationMessage.subjectPositionInfo, Boolean.valueOf(roomStreamAdaptationMessage.isEmpty)));
                        }
                    }
                };
            }
        }, null);
        LJ(new C1088340eQa(dataChannel), null);
        LJI(new C1089570eSZ(((Number) c01gwLIZIZ.getValue()).longValue(), c1089550eSX, c1089720eSo));
        LJI(new AbstractC1089260eS4<Float>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eRx
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return PublicScreenFrequencyRuleConfig.getValue().detail;
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return PublicScreenFrequencyRuleConfig.getValue().type;
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(Float f) {
                this.LIZIZ.zW(LiveClientStrategyPublicScreenFrequency.class, Integer.valueOf(C814420VxA.LIZIZ(f.floatValue() * LSPassThroughRecordSizeConfig.DEFAULT)));
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1089100eRo(), c1089240eS2));
            }
        });
        LJI(new AbstractC1089260eS4<Integer>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eSB
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return PublicScreenSmallScreenOptRuleConfig.getValue().detail;
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return PublicScreenSmallScreenOptRuleConfig.getValue().type;
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(Integer num) {
                int iIntValue = num.intValue();
                DataChannel dataChannel2 = this.LIZIZ;
                boolean z = true;
                if (iIntValue != 1) {
                    z = false;
                }
                dataChannel2.zW(LiveSmallScreenOptRule.class, Boolean.valueOf(z));
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1932907hf(), c1089240eS2));
            }
        });
        LJI(new AbstractC1089260eS4<Boolean>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eSP
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return "";
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return "";
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(Boolean bool) {
                this.LIZIZ.LC0(TopMaskVisibilityEvent.class, new C0IJ0(bool.booleanValue(), C0IJ1.LIGHTNESS));
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1933007hg(), c1089240eS2));
            }
        });
        LJI(new AbstractC1089260eS4<Integer>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eRs
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return LiveChatLineMarginConfigSetting.INSTANCE.getValue().detail;
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return LiveChatLineMarginConfigSetting.INSTANCE.getValue().type;
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(Integer num) {
                DataChannelGlobal.LLILZ.JQ2(C1148050fyt.class, Integer.valueOf(num.intValue()));
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1932907hf(), c1089240eS2));
            }
        });
        LJI(new AbstractC1089260eS4<Long>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eRy
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return LiveLikeEffectLevelConfig.getValue().detail;
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return LiveLikeEffectLevelConfig.getValue().type;
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(Long l) {
                this.LIZIZ.zW(LiveLikeParamsMapChanel.class, Long.valueOf(l.longValue()));
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1089990eTF(), c1089240eS2));
            }
        });
        LJI(new AbstractC1089260eS4<Long>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eRv
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return LivePSAnimationDurationSetting.getValue().detail;
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return LivePSAnimationDurationSetting.getValue().type;
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(Long l) {
                long jLongValue = l.longValue();
                if (1 <= jLongValue && jLongValue < 1000) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("animation duration is ");
                    sbLIZ.append(jLongValue);
                    C20441214yg.LIZIZ("publicscreen_animation", C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZIZ.zW(LiveStrategyPublicScreenAnimationDuration.class, Long.valueOf(jLongValue));
                }
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1089990eTF(), c1089240eS2));
            }
        });
        LJI(new AbstractC1089260eS4<Boolean>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eSR
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return LiveStreamCommentAdaptionConfigSetting.INSTANCE.getValue().detail;
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return LiveStreamCommentAdaptionConfigSetting.INSTANCE.getValue().type;
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(Boolean bool) {
                this.LIZIZ.LC0(StreamAdaptionInputEnableEvent.class, Boolean.valueOf(bool.booleanValue()));
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1933007hg(), c1089240eS2));
            }
        });
        LJI(new AbstractC1089260eS4<List<? extends Integer>>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eRw
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return LivePanGestureAngleV2.getValue().detail;
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return LivePanGestureAngleV2.getValue().type;
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(List<? extends Integer> list) {
                List<? extends Integer> list2 = list;
                if (!list2.isEmpty()) {
                    DataChannelGlobal.LLILZ.HQ2(LivePortraitScrollAngleData.class, ListProtector.get(list2, 0));
                }
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1936207iC(new C1932907hf()), c1089240eS2));
            }
        });
        LJI(new AbstractC1089260eS4<List<? extends Float>>(c1089240eS2, c1089720eSo, c1089780eSu, dataChannel) { // from class: X.0eRt
            @Override // X.AbstractC1089260eS4
            public final String LIZLLL() {
                return LivePanGestureSpeed.getValue().detail;
            }

            @Override // X.AbstractC1089260eS4
            public final String LJ() {
                return LivePanGestureSpeed.getValue().type;
            }

            @Override // X.AbstractC1089260eS4
            public final void LJI(List<? extends Float> list) {
                List<? extends Float> list2 = list;
                if (list2.size() >= 2) {
                    DataChannelGlobal.LLILZ.HQ2(LivePortraitScrollSpeedData.class, new C466500IRc(C814420VxA.LIZIZ(((Number) ListProtector.get(list2, 0)).floatValue()), ((Number) ListProtector.get(list2, 1)).floatValue()));
                }
            }

            {
                super(c1089720eSo, c1089780eSu, dataChannel, new C1089860eT2(new C1936207iC(new C1089100eRo()), c1089240eS2));
            }
        });
    }

    @Override // X.InterfaceC1089430eSL
    public final Object LIZIZ(String str) {
        if (str != null) {
            Object objLIZIZ = this.LJ.LIZIZ(str);
            if (objLIZIZ != null && (objLIZIZ instanceof InterfaceC1088470eQn)) {
                return ((InterfaceC1088470eQn) objLIZIZ).LIZ();
            }
            return this.LJFF.LJIIIIZZ(str, EnumC467180ITs.EPI.getGroupName(), "default");
        }
        return null;
    }

    @InterfaceC1294060jmO
    public final void LJI(InterfaceC1089740eSq interfaceC1089740eSq) {
        Strategy strategyLIZIZ = interfaceC1089740eSq.LIZIZ();
        if (strategyLIZIZ != null) {
            this.LJI.LIZLLL(strategyLIZIZ, interfaceC1089740eSq);
        }
    }

    @Override // X.InterfaceC1089430eSL
    public final void T4(TriggerStrategyConfig triggerStrategyConfig) {
        List<C443120HZe> list = (List) ((LinkedHashMap) this.LJII).get(triggerStrategyConfig.getStrategyName());
        if (list != null) {
            for (C443120HZe c443120HZe : list) {
                ((ILiveDecisionService) this.LJIIIIZZ.getValue()).sl((String) c443120HZe.getFirst(), (String) c443120HZe.getSecond(), (InterfaceC1093100eYG) c443120HZe.getThird());
            }
        }
        this.LJII.remove(triggerStrategyConfig.getStrategyName());
    }

    @Override // X.InterfaceC1089430eSL
    public final void G2(final InterfaceC1092770eXj interfaceC1092770eXj, final TriggerStrategyConfig triggerStrategyConfig) {
        Strategy first;
        Pair<Strategy, InterfaceC1089740eSq> pairLJ = this.LJ.LJ(triggerStrategyConfig.getStrategyName());
        if (pairLJ != null && (first = pairLJ.getFirst()) != null) {
            interfaceC1092770eXj.LIZ();
            List<C0J0E> listLIZIZ = first.LIZIZ();
            if (listLIZIZ != null) {
                for (C0J0E c0j0e : (ArrayList) listLIZIZ) {
                    InterfaceC1093100eYG interfaceC1093100eYGLl = ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).Ll(c0j0e.LIZJ, c0j0e.LIZ, new InterfaceC1093100eYG() { // from class: X.0eSe
                        @Override // X.InterfaceC1093100eYG
                        public final void LIZJ(Object obj, Object obj2, String str, String str2) {
                            if (Intrinsics.LJFF(obj, obj2)) {
                                return;
                            }
                            interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZ(triggerStrategyConfig.getStrategyName(), new C1089610eSd(str, false), str));
                        }
                    });
                    if (interfaceC1093100eYGLl != null) {
                        List list = (List) ((LinkedHashMap) this.LJII).get(triggerStrategyConfig.getStrategyName());
                        if (list == null) {
                            Map<String, List<C443120HZe<String, String, InterfaceC1093100eYG>>> map = this.LJII;
                            String strategyName = triggerStrategyConfig.getStrategyName();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new C443120HZe(c0j0e.LIZJ, c0j0e.LIZ, interfaceC1093100eYGLl));
                            map.put(strategyName, arrayList);
                        } else {
                            list.add(new C443120HZe(c0j0e.LIZJ, c0j0e.LIZ, interfaceC1093100eYGLl));
                        }
                    }
                }
                return;
            }
            return;
        }
        ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
        EnumC467180ITs enumC467180ITs = EnumC467180ITs.SERVER_DECISION_GROUP;
        InterfaceC1093100eYG interfaceC1093100eYGLl2 = iLiveDecisionService.Ll(enumC467180ITs.getGroupName(), triggerStrategyConfig.getStrategyName(), new InterfaceC1093100eYG() { // from class: X.0eSO
            @Override // X.InterfaceC1093100eYG
            public final void LIZJ(Object obj, Object obj2, String str, String str2) {
                if (Intrinsics.LJFF(obj, obj2)) {
                    return;
                }
                if (obj2 != null) {
                    interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZ(triggerStrategyConfig.getStrategyName(), new C1089610eSd(obj2.toString(), false), str));
                } else {
                    interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.EPI_FAIL.getCode(), "no server result"));
                }
            }
        });
        if (interfaceC1093100eYGLl2 != null) {
            List list2 = (List) ((LinkedHashMap) this.LJII).get(triggerStrategyConfig.getStrategyName());
            if (list2 == null) {
                Map<String, List<C443120HZe<String, String, InterfaceC1093100eYG>>> map2 = this.LJII;
                String strategyName2 = triggerStrategyConfig.getStrategyName();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C443120HZe(enumC467180ITs.getGroupName(), triggerStrategyConfig.getStrategyName(), interfaceC1093100eYGLl2));
                map2.put(strategyName2, arrayList2);
                return;
            }
            list2.add(new C443120HZe(enumC467180ITs.getGroupName(), triggerStrategyConfig.getStrategyName(), interfaceC1093100eYGLl2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eSW] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJ(AbstractC1089300eS8 abstractC1089300eS8, final InterfaceC1089750eSr interfaceC1089750eSr) {
        this.LJI.LIZJ(abstractC1089300eS8, new InterfaceC1089750eSr<Object>() { // from class: X.0eSW
            @Override // X.InterfaceC1089750eSr
            public final void LIZ(C0J0Q c0j0q, Object obj, String str) {
                InterfaceC1089750eSr<Object> interfaceC1089750eSr2 = interfaceC1089750eSr;
                if (interfaceC1089750eSr2 != null) {
                    interfaceC1089750eSr2.LIZ(c0j0q, obj, str);
                }
                C1089870eT3 c1089870eT3 = (C1089870eT3) this.LJIIJJI.getValue();
                if (((Boolean) c1089870eT3.LIZLLL.getValue()).booleanValue() && ((HashSet) c1089870eT3.LJ.getValue()).contains(str)) {
                    ((C1089280eS6) c1089870eT3.LJIILIIL.getValue()).LIZLLL(false);
                }
            }
        });
    }

    public final void LJFF(AbstractC1088350eQb abstractC1088350eQb, boolean z) {
        if (z) {
            LJ(abstractC1088350eQb, null);
        }
    }

    @Override // X.InterfaceC1089430eSL
    public final C1093040eYA Tt(FinalStrategyConfig finalStrategyConfig, Map<String, ? extends Object> map) {
        Strategy first;
        C443120HZe<Strategy, C1089610eSd, C1089610eSd> c443120HZeLJIIIZ;
        String str;
        Pair<Strategy, InterfaceC1089740eSq> pairLJ = this.LJ.LJ(finalStrategyConfig.getStrategyName());
        if (pairLJ != null && (first = pairLJ.getFirst()) != null && (c443120HZeLJIIIZ = this.LJFF.LJIIIZ(first, map, true, "")) != null) {
            C1089610eSd third = c443120HZeLJIIIZ.getThird();
            C1089780eSu c1089780eSu = this.LIZLLL;
            String str2 = first.name;
            String str3 = third.LIZ;
            Map<String, String> map2 = third.LIZIZ;
            if (third.LIZJ) {
                str = first.decisionKey;
            } else {
                str = str2;
            }
            ((ArrayList) c1089780eSu.LIZ.LIZJ).add(new C1089730eSp(str2, str3, str, map2));
            return C1093130eYJ.LIZ(finalStrategyConfig.getStrategyName(), c443120HZeLJIIIZ.getThird(), "");
        }
        return null;
    }

    @Override // X.InterfaceC1089430eSL
    public final void n9(FinalStrategyConfig finalStrategyConfig, Map<String, ? extends Object> map, InterfaceC1092770eXj interfaceC1092770eXj) {
        Strategy first;
        String string;
        String str;
        Object obj;
        Pair<Strategy, InterfaceC1089740eSq> pairLJ = this.LJ.LJ(finalStrategyConfig.getStrategyName());
        if (pairLJ != null && (first = pairLJ.getFirst()) != null) {
            Map<String, Object> customParams = finalStrategyConfig.getCustomParams();
            if (customParams == null || (obj = customParams.get("trigger_feature")) == null || (string = obj.toString()) == null) {
                string = "";
            }
            C443120HZe<Strategy, C1089610eSd, C1089610eSd> c443120HZeLJIIIZ = this.LJFF.LJIIIZ(first, map, true, string);
            if (c443120HZeLJIIIZ != null) {
                C1089610eSd third = c443120HZeLJIIIZ.getThird();
                C1089780eSu c1089780eSu = this.LIZLLL;
                String str2 = first.name;
                String str3 = third.LIZ;
                Map<String, String> map2 = third.LIZIZ;
                if (third.LIZJ) {
                    str = first.decisionKey;
                } else {
                    str = str2;
                }
                ((ArrayList) c1089780eSu.LIZ.LIZJ).add(new C1089730eSp(str2, str3, str, map2));
                interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZ(finalStrategyConfig.getStrategyName(), c443120HZeLJIIIZ.getThird(), string));
                return;
            }
            interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.EPI_FAIL.getCode(), "emp"));
            return;
        }
        C1090000eTG c1090000eTGO3 = ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).O3(EnumC1094630eaj.DEFAULT, EnumC467180ITs.SERVER_DECISION_GROUP.getGroupName(), finalStrategyConfig.getStrategyName());
        if (c1090000eTGO3 == null) {
            interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.EPI_FAIL.getCode(), "no server result"));
        } else {
            interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZ(finalStrategyConfig.getStrategyName(), new C1089610eSd(String.valueOf(c1090000eTGO3.LIZJ), false), ""));
        }
    }
}
