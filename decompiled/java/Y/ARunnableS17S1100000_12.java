package Y;

import X.C0TKG;
import X.C0TKH;
import X.C0TWK;
import X.C0TWL;
import X.C0TXA;
import X.C0TXY;
import X.C0UG4;
import X.C0UG5;
import X.C0UKZ;
import X.C1126030fPN;
import X.C1161920gLG;
import X.C1210880hcE;
import X.C123100dR;
import X.C1305340k4a;
import X.C1305440k4k;
import X.C1306430k6L;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1444350ngn;
import X.C14EC;
import X.C16F5;
import X.C19748512Ol;
import X.C19EG;
import X.C1AH6;
import X.C1C7U;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2197011Ayh;
import X.C418440Gaw;
import X.C473410IhP;
import X.C500260Jjc;
import X.C748320TXa;
import X.C776870Udh;
import X.C786410Ut5;
import X.C974710bTJ;
import X.C982760bgI;
import X.EnumC919170a1j;
import X.InterfaceC740200T1u;
import X.InterfaceC780310UjF;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.liveinteract.competition.game.event.GameCrossScreenSeiInfo;
import com.bytedance.android.live.liveinteract.competition.game.event.GameRivalTeamMaxComboUpdateChannel;
import com.bytedance.android.live.liveinteract.competition.game.event.GameScoreUpdateChannel;
import com.bytedance.android.livesdk.broadcast.PreviewBoardBottomBubbleShowEvent;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionMoreWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS17S1100000_12 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        MiniGameFragment miniGameFragment;
        TextView textView;
        MiniGameFragment miniGameFragment2 = (MiniGameFragment) this.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((MiniGameFragment) this.l1).q);
        sbLIZ.append('\n');
        sbLIZ.append(this.s0);
        miniGameFragment2.q = C2188811AlT.LIZIZ(sbLIZ);
        C2197011Ayh.LIZ.getClass();
        if (!C2197011Ayh.LIZJ() || (textView = (miniGameFragment = (MiniGameFragment) this.l1).p) == null) {
            return;
        }
        textView.setText(miniGameFragment.q);
    }

    public final void LIZ$1() {
        if (!a0.LJJIIZI(this.s0, "live_catch_bean_final_score", false)) {
            if (a0.LJJIIZI(this.s0, "live_catch_bean_update_score", false)) {
                try {
                    GameCrossScreenSeiInfo gameCrossScreenSeiInfo = (GameCrossScreenSeiInfo) C19748512Ol.LIZIZ.LJII(C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(new JSONObject(this.s0), "live_catch_bean_update_score")), GameCrossScreenSeiInfo.class);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("game score sei info = ");
                    sbLIZ.append(gameCrossScreenSeiInfo);
                    C20441214yg.LIZIZ("CompetitionMessageManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
                    DataChannel dataChannel = ((C974710bTJ) this.l1).LIZ;
                    C982760bgI c982760bgI = new C982760bgI(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, -10000, false, (int) gameCrossScreenSeiInfo.score, false, null, gameCrossScreenSeiInfo.createTime);
                    if (dataChannel != null) {
                        dataChannel.zW(GameScoreUpdateChannel.class, c982760bgI);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        try {
            GameCrossScreenSeiInfo gameCrossScreenSeiInfo2 = (GameCrossScreenSeiInfo) C19748512Ol.LIZIZ.LJII(C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(new JSONObject(this.s0), "live_catch_bean_final_score")), GameCrossScreenSeiInfo.class);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("game rival final score sei info = ");
            sbLIZ2.append(gameCrossScreenSeiInfo2);
            C20441214yg.LIZIZ("CompetitionMessageManagerImpl", C2188811AlT.LIZIZ(sbLIZ2));
            DataChannel dataChannel2 = ((C974710bTJ) this.l1).LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(GameRivalTeamMaxComboUpdateChannel.class, Long.valueOf(gameCrossScreenSeiInfo2.maxCombo));
            }
            DataChannel dataChannel3 = ((C974710bTJ) this.l1).LIZ;
            C982760bgI c982760bgI2 = new C982760bgI(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, -10000, false, (int) gameCrossScreenSeiInfo2.score, true, null, gameCrossScreenSeiInfo2.createTime);
            if (dataChannel3 != null) {
                dataChannel3.zW(GameScoreUpdateChannel.class, c982760bgI2);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final void LIZ$2() {
        String str = this.s0;
        if (Intrinsics.LJFF(str, "video_play")) {
            if (Intrinsics.LJFF(((JSONObject) this.l1).optString("enter_from"), "homepage_hot") && C123100dR.LIZ(((JSONObject) this.l1).optString("aweme_id"))) {
                C0TXY c0txy = C0TXY.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("video_play");
                sbLIZ.append(((JSONObject) this.l1).optString("aweme_id"));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c0txy.getClass();
                if (C0TXY.LJIIIIZZ(strLIZIZ)) {
                    C0TXY.LJI(C748320TXa.LJI);
                    C0TXY.LJI(C748320TXa.LJIIIZ);
                    C0TXY.LJI(C748320TXa.LIZJ);
                    if (Intrinsics.LJFF(((JSONObject) this.l1).optString("is_ls_content"), "1")) {
                        C0TXY.LJI(C748320TXa.LJ);
                    }
                    C0TXY.LJI(C748320TXa.LJIILIIL);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "livesdk_live_show") && Intrinsics.LJFF(((JSONObject) this.l1).optString("enter_from_merge"), "homepage_hot") && C123100dR.LIZ(((JSONObject) this.l1).optString("room_id"))) {
            C0TXY c0txy2 = C0TXY.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("livesdk_live_show");
            sbLIZ2.append(((JSONObject) this.l1).optString("room_id"));
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c0txy2.getClass();
            if (C0TXY.LJIIIIZZ(strLIZIZ2)) {
                C0TXY.LJI(C748320TXa.LJI);
                C0TXY.LJI(C748320TXa.LJIIIZ);
                C0TXY.LJI(C748320TXa.LIZJ);
                C0TXY.LJI(C748320TXa.LIZLLL);
                C0TXY.LJI(C748320TXa.LJIILIIL);
            }
        }
    }

    public final void LIZ$3() {
        PreviewRevisionMoreWidget previewRevisionMoreWidget = (PreviewRevisionMoreWidget) this.l1;
        if (previewRevisionMoreWidget.LLILZ) {
            FrameLayout frameLayout = previewRevisionMoreWidget.LLJ;
            int height = frameLayout != null ? frameLayout.getHeight() : 0;
            ((PreviewRevisionMoreWidget) this.l1).LLJI = ValueAnimator.ofFloat(0.0f, C418440Gaw.LIZIZ(16));
            PreviewRevisionMoreWidget previewRevisionMoreWidget2 = (PreviewRevisionMoreWidget) this.l1;
            ValueAnimator valueAnimator = previewRevisionMoreWidget2.LLJI;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new AUListenerS69S0101000_12(previewRevisionMoreWidget2, height, 2));
            }
            ValueAnimator valueAnimator2 = ((PreviewRevisionMoreWidget) this.l1).LLJI;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(300L);
            }
            ValueAnimator valueAnimator3 = ((PreviewRevisionMoreWidget) this.l1).LLJI;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            C20337914i1<Map<String, Boolean>> c20337914i1 = C0UKZ.LLILZ;
            Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
            mapLIZIZ.put(this.s0, Boolean.TRUE);
            c20337914i1.LJFF(mapLIZIZ);
        }
    }

    public final void LIZ$4() {
        PreviewRevisionMoreWidget previewRevisionMoreWidget = (PreviewRevisionMoreWidget) this.l1;
        if (previewRevisionMoreWidget.LLILZ) {
            FrameLayout frameLayout = previewRevisionMoreWidget.LLJ;
            int height = frameLayout != null ? frameLayout.getHeight() : 0;
            ((PreviewRevisionMoreWidget) this.l1).LLJI = ValueAnimator.ofFloat(0.0f, C418440Gaw.LIZIZ(16));
            PreviewRevisionMoreWidget previewRevisionMoreWidget2 = (PreviewRevisionMoreWidget) this.l1;
            ValueAnimator valueAnimator = previewRevisionMoreWidget2.LLJI;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new AUListenerS69S0101000_12(previewRevisionMoreWidget2, height, 3));
            }
            ValueAnimator valueAnimator2 = ((PreviewRevisionMoreWidget) this.l1).LLJI;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(300L);
            }
            ValueAnimator valueAnimator3 = ((PreviewRevisionMoreWidget) this.l1).LLJI;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            C20337914i1<Map<String, Boolean>> c20337914i1 = C0UKZ.LLILZ;
            Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
            mapLIZIZ.put(this.s0, Boolean.TRUE);
            c20337914i1.LJFF(mapLIZIZ);
        }
    }

    public final void LIZ$5() {
        try {
            ((Function0) this.l1).invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("safeSubmit>>>tag:");
            sbLIZ.append(this.s0);
            sbLIZ.append(" error:");
            sbLIZ.append(e.getMessage());
            C1306430k6L.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static final void run$0(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        InterfaceC780310UjF interfaceC780310UjF;
        String str;
        C1305340k4a c1305340k4a = (C1305340k4a) aRunnableS17S1100000_12.l1;
        String str2 = aRunnableS17S1100000_12.s0;
        c1305340k4a.getClass();
        C1C7U.LIZ("CpuInfoFetcher@9fab.fetch$1L$1L");
        if (str2 != null && str2.length() != 0) {
            C1305340k4a.LIZIZ = str2;
            Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
            if (context != null) {
                C1305440k4k c1305440k4kLIZIZ = C1305440k4k.LIZIZ(context);
                c1305440k4kLIZIZ.LJII(str2, "hardware_info_cpu_soc");
                c1305440k4kLIZIZ.LIZ();
            }
            WeakReference<InterfaceC780310UjF> weakReference = c1305340k4a.LIZ;
            if (weakReference != null && (interfaceC780310UjF = weakReference.get()) != null && (str = C1305340k4a.LIZIZ) != null) {
                interfaceC780310UjF.LIZ(str);
            }
            C1C7U.LIZIZ("CpuInfoFetcher@9fab.fetch$1L$1L");
            return;
        }
        C1C7U.LIZIZ("CpuInfoFetcher@9fab.fetch$1L$1L");
    }

    public static final void run$1(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewSettingWidget@ad1d.onShow$3");
        try {
            PreviewSettingWidget previewSettingWidget = (PreviewSettingWidget) aRunnableS17S1100000_12.l1;
            DataChannel dataChannel = previewSettingWidget.dataChannel;
            if (dataChannel != null) {
                dataChannel.EQ2(previewSettingWidget, PreviewBoardBottomBubbleShowEvent.class, new AwS126S1100000_12(previewSettingWidget, aRunnableS17S1100000_12.s0, 3));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewSettingWidget@ad1d.onShow$3");
    }

    public static final void run$10(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveComposerManagerB@e202.removeCurrentPanelSticker$1");
        try {
            ((C0UG4) aRunnableS17S1100000_12.l1).lr(aRunnableS17S1100000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveComposerManagerB@e202.removeCurrentPanelSticker$1");
    }

    public static final void run$11(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveComposerManagerOPT@a709.removeCurrentPanelSticker$1");
        try {
            ((C0UG5) aRunnableS17S1100000_12.l1).lr(aRunnableS17S1100000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveComposerManagerOPT@a709.removeCurrentPanelSticker$1");
    }

    public static final void run$12(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("CompetitionMessageManagerImpl@7335.registerMessage$3$1");
        try {
            aRunnableS17S1100000_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CompetitionMessageManagerImpl@7335.registerMessage$3$1");
    }

    public static final void run$13(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("ComboViewHelperV2@f89b.executeAnimDelay$1");
        try {
            Function0 function0 = (Function0) aRunnableS17S1100000_12.l1;
            if (function0 != null) {
                function0.invoke();
            }
            C1126030fPN.LIZIZ.remove(aRunnableS17S1100000_12.s0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("executeAnimDelay: end tag ");
            sbLIZ.append(aRunnableS17S1100000_12.s0);
            C20441214yg.LIZIZ("ComboViewHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComboViewHelperV2@f89b.executeAnimDelay$1");
    }

    public static final void run$14(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        RecyclerView recyclerViewFromXml;
        C1C7U.LIZ("LiveCenterMainView@9a36.smoothScrollToCard$1");
        try {
            int iLJI = ((C1AH6) aRunnableS17S1100000_12.l1).LJI(aRunnableS17S1100000_12.s0);
            if (iLJI != -1 && (recyclerViewFromXml = ((C1AH6) aRunnableS17S1100000_12.l1).getRecyclerViewFromXml()) != null) {
                recyclerViewFromXml.smoothScrollToPosition(iLJI);
                if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
                    ((C1AH6) aRunnableS17S1100000_12.l1).LIZIZ(recyclerViewFromXml, iLJI);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCenterMainView@9a36.smoothScrollToCard$1");
    }

    public static final void run$15(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LSFeedCardSignalManager@7e30.onEvent$1");
        try {
            aRunnableS17S1100000_12.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LSFeedCardSignalManager@7e30.onEvent$1");
    }

    public static final void run$16(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        BaseListFragmentPanel baseListFragmentPanel = (BaseListFragmentPanel) aRunnableS17S1100000_12.l1;
        String str = aRunnableS17S1100000_12.s0;
        baseListFragmentPanel.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.onFirstDataLoaded$1L");
        Aweme awemeLLLLLJLJLL = baseListFragmentPanel.LLLLLJLJLL();
        if (awemeLLLLLJLJLL == null) {
            awemeLLLLLJLJLL = new Aweme();
            awemeLLLLLJLJLL.setAid(baseListFragmentPanel.LLLLIIIILLL.getAid());
            awemeLLLLLJLJLL.setCanPlay(false);
        }
        if (TextUtils.equals(str, awemeLLLLLJLJLL.getAid())) {
            baseListFragmentPanel.LLLIIII(awemeLLLLLJLJLL, true);
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onFirstDataLoaded$1L");
    }

    public static final void run$17(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewRevisionMoreWidget@b5de.playTranslation$1$1");
        try {
            aRunnableS17S1100000_12.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewRevisionMoreWidget@b5de.playTranslation$1$1");
    }

    public static final void run$18(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewRevisionMoreWidget@b5de.playTranslation$1");
        try {
            C473410IhP.LIZJ(new ARunnableS17S1100000_12((PreviewRevisionMoreWidget) aRunnableS17S1100000_12.l1, aRunnableS17S1100000_12.s0, 17), 1000L);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewRevisionMoreWidget@b5de.playTranslation$1");
    }

    public static final void run$19(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewRevisionMoreWidget@b5de.playTranslation$2$1");
        try {
            aRunnableS17S1100000_12.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewRevisionMoreWidget@b5de.playTranslation$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Ukw] */
    public static final void run$2(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("HighLightVideoOperateImpl@b167.downloadVideoAndSaveToDraft$1$onSuccess$1");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(aRunnableS17S1100000_12.s0);
            IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
            final GameLiveFragment gameLiveFragment = (GameLiveFragment) aRunnableS17S1100000_12.l1;
            iHostCreativeTool.lF(arrayList, new C14EC() { // from class: X.0Ukw
                @Override // X.C14EC
                public final void onSuccess() {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    String str = gameLiveFragment.fragmentIdStr;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put("fragment_id", str);
                    linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    C1CC2.LJII(0, C0KQH.LIZ("ttlive_highlight_to_draft_monitor"), linkedHashMap);
                }

                @Override // X.C14EC
                public final void onFailed(Exception exc) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("downloadVideoAndSaveToDraft(). save to draft. onFailed e=");
                    String message2 = null;
                    if (exc != null) {
                        message = exc.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C20441214yg.LJ("HighLightVideoOperateImpl", C2188811AlT.LIZIZ(sbLIZ));
                    String str = gameLiveFragment.fragmentIdStr;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("save highlight to draft error, error msg:");
                    if (exc != null) {
                        message2 = exc.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C779470Uht.LIZ(2, 4, str, C2188811AlT.LIZIZ(sbLIZ2));
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HighLightVideoOperateImpl@b167.downloadVideoAndSaveToDraft$1$onSuccess$1");
    }

    public static final void run$20(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewRevisionMoreWidget@b5de.playTranslation$2");
        try {
            C473410IhP.LIZJ(new ARunnableS17S1100000_12((PreviewRevisionMoreWidget) aRunnableS17S1100000_12.l1, aRunnableS17S1100000_12.s0, 19), 1000L);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewRevisionMoreWidget@b5de.playTranslation$2");
    }

    public static final void run$21(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameUiStrategy@3ab.registerTipListeners$tipListener$1$onTipDismiss$1");
        try {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C776870Udh) aRunnableS17S1100000_12.l1).LJI, aRunnableS17S1100000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameUiStrategy@3ab.registerTipListeners$tipListener$1$onTipDismiss$1");
    }

    public static final void run$22(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("SparkLoader@2f3.injectSparkContext$3$invoke$1$2$onReceivedError$1");
        try {
            C1440005kM.LIZ(new C1210880hcE(aRunnableS17S1100000_12.s0, "FUNCTION_FROM_DEFAULT", "lynx_card_load_error", (Aweme) aRunnableS17S1100000_12.l1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkLoader@2f3.injectSparkContext$3$invoke$1$2$onReceivedError$1");
    }

    public static final void run$23(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        Aweme aweme;
        C1C7U.LIZ("DeleteLynxCardMethod@8334.handle$2");
        try {
            C0TXA c0txa = (C0TXA) aRunnableS17S1100000_12.l1;
            String eventType = null;
            if (c0txa != null) {
                aweme = c0txa.getAweme();
            } else {
                aweme = null;
            }
            C0TXA c0txa2 = (C0TXA) aRunnableS17S1100000_12.l1;
            if (c0txa2 != null) {
                eventType = c0txa2.getEventType();
            }
            C1440005kM.LIZ(new C1210880hcE(eventType, "FUNCTION_FROM_NOT_INTERESTED", aRunnableS17S1100000_12.s0, aweme));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeleteLynxCardMethod@8334.handle$2");
    }

    public static final void run$24(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("StrategyExtKt@27df.safeExecute$1");
        try {
            aRunnableS17S1100000_12.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StrategyExtKt@27df.safeExecute$1");
    }

    public static final void run$25(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("AppLogManager@e330.onEventV3$1");
        try {
            C0TKH c0tkh = C0TKG.LIZ;
            if (c0tkh != null) {
                ((HashMap) c0tkh.LIZ).put(aRunnableS17S1100000_12.s0, (JSONObject) aRunnableS17S1100000_12.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AppLogManager@e330.onEventV3$1");
    }

    public static final void run$3(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameCastWiredFragment@4f72.startRunnable$1");
        try {
            ((GameCastWiredFragment) aRunnableS17S1100000_12.l1).NR();
            GameCastWiredFragment gameCastWiredFragment = (GameCastWiredFragment) aRunnableS17S1100000_12.l1;
            gameCastWiredFragment.LLILLJJLI = false;
            C16F5 c16f5 = gameCastWiredFragment.LLIZ;
            if (c16f5 != null) {
                c16f5.setText(aRunnableS17S1100000_12.s0);
            }
            GameCastWiredFragment gameCastWiredFragment2 = (GameCastWiredFragment) aRunnableS17S1100000_12.l1;
            gameCastWiredFragment2.getClass();
            C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(false, gameCastWiredFragment2, 7));
            gameCastWiredFragment2.LLILLL = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameCastWiredFragment@4f72.startRunnable$1");
    }

    public static final void run$4(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameCastWiredFragmentV2@456d.startRunnable$1");
        try {
            ((GameCastWiredFragmentV2) aRunnableS17S1100000_12.l1).NR();
            GameCastWiredFragmentV2 gameCastWiredFragmentV2 = (GameCastWiredFragmentV2) aRunnableS17S1100000_12.l1;
            gameCastWiredFragmentV2.LLILLJJLI = false;
            C16F5 c16f5 = gameCastWiredFragmentV2.LLIZ;
            if (c16f5 != null) {
                c16f5.setText(aRunnableS17S1100000_12.s0);
            }
            GameCastWiredFragmentV2 gameCastWiredFragmentV22 = (GameCastWiredFragmentV2) aRunnableS17S1100000_12.l1;
            gameCastWiredFragmentV22.getClass();
            C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(false, gameCastWiredFragmentV22, 6));
            gameCastWiredFragmentV22.LLILLL = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameCastWiredFragmentV2@456d.startRunnable$1");
    }

    public static final void run$5(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FullFeedFragmentPanel@9b2e.doLoadMore$1");
        try {
            InterfaceC740200T1u interfaceC740200T1u = ((FullFeedFragmentPanel) aRunnableS17S1100000_12.l1).LLLII;
            if (interfaceC740200T1u != null) {
                interfaceC740200T1u.Ed(aRunnableS17S1100000_12.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.doLoadMore$1");
    }

    public static final void run$6(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.updateLogText$1");
        try {
            aRunnableS17S1100000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.updateLogText$1");
    }

    public static final void run$7(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.initWSServer$1$1");
        try {
            MiniGameFragment miniGameFragment = (MiniGameFragment) aRunnableS17S1100000_12.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("websocket server status changed: ");
            sbLIZ.append(aRunnableS17S1100000_12.s0);
            miniGameFragment.VT(C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.initWSServer$1$1");
    }

    public static final void run$8(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHighLightPublisher@1fdb.showPublishToast$1");
        try {
            C19EG c19eg = ((C1444350ngn) aRunnableS17S1100000_12.l1).LLILLJJLI;
            if (c19eg != null) {
                String str = aRunnableS17S1100000_12.s0;
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPublisher@1fdb.showPublishToast$1");
    }

    public static final void run$9(ARunnableS17S1100000_12 aRunnableS17S1100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("H5LoadUtil@1cbd.tryPreload$1");
        try {
            try {
                ((C0TWL) aRunnableS17S1100000_12.l1).LIZIZ();
                ((C0TWL) aRunnableS17S1100000_12.l1).LIZ(aRunnableS17S1100000_12.s0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("H5LoadUtil@1cbd.tryPreload$1");
    }

    public ARunnableS17S1100000_12(C0TWK c0twk, int i) {
        this.$t = i;
        this.l1 = c0twk;
        this.s0 = "personal_homepage";
    }

    public ARunnableS17S1100000_12(JSONObject jSONObject, int i) {
        this.$t = i;
        this.s0 = "local_strategy";
        this.l1 = jSONObject;
    }

    public ARunnableS17S1100000_12(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
