package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorHostUseTTLHGameLiveBugFixSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastSAAMemLeakOptRecord;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveSmoothActivityArchOpt;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UKG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UKG extends C2217421BqW implements Function1<Pair<? extends Boolean, ? extends Long>, Unit> {
    public C0UKG(Object obj) {
        super(1, obj, LiveBroadcastPreviewFragment.class, "onStartLive", "onStartLive(Lkotlin/Pair;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Boolean, ? extends Long> pair) {
        IHostBridge iHostBridge;
        C0UKH c0ukh;
        LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = (LiveBroadcastPreviewFragment) this.receiver;
        liveBroadcastPreviewFragment.getClass();
        if (pair.getFirst().booleanValue()) {
            DataChannel dataChannel = liveBroadcastPreviewFragment.LLILZLL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            if (C751980Tee.LIZJ(dataChannel) != LiveMode.VIDEO && AnchorHostUseTTLHGameLiveBugFixSetting.INSTANCE.enable() && (c0ukh = liveBroadcastPreviewFragment.LLLFZ) != null) {
                c0ukh.LLLJIL();
            }
            ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(true);
            if ((LiveSmoothActivityArchOpt.enable() || ((iHostBridge = (IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)) != null && iHostBridge.enableGotoPreviewOpt())) && !C354201Zc.LJFF(liveBroadcastPreviewFragment.SR())) {
                C0UJY c0ujy = liveBroadcastPreviewFragment.LLLIIIL;
                if (c0ujy != null) {
                    c0ujy.LJJIFFI();
                }
                C0UHK.LIZIZ(null);
            }
            liveBroadcastPreviewFragment.LLJZIJLIL = true;
            C0UJY c0ujy2 = liveBroadcastPreviewFragment.LLLIIIL;
            if (c0ujy2 != null) {
                c0ujy2.LJJIJL(LiveBroadcastSAAMemLeakOptRecord.getEnable());
            }
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).destroyEffectPalletHandler();
            if (C760180Trs.LJII()) {
                C770190UJd c770190UJd = liveBroadcastPreviewFragment.LLJ;
                if (c770190UJd != null) {
                    C1EOY c1eoy = C1EOY.LIZ;
                    C1EOY.LJIIIIZZ();
                    C774610Ua3.LL.LLLZZIL(true);
                    ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).K42();
                    ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).releaseGalleryModule();
                    C781270Ukn.LJI().releasePanelResource(false);
                    ((C0U79) C781270Ukn.LJI().getLiveEffectRestoreManager()).LIZ(c770190UJd.LLLIIL);
                    C768460UCm.LIZJ().release();
                    C768460UCm.LJFF();
                    C767120U7i.LIZLLL(false);
                    C768460UCm.LJII().release(true);
                }
            } else {
                DataChannel dataChannel2 = liveBroadcastPreviewFragment.LLILZLL;
                if (dataChannel2 == null) {
                    dataChannel2 = null;
                }
                if (C770730ULf.LJII(dataChannel2)) {
                    C770210UJf c770210UJf = liveBroadcastPreviewFragment.LLIZ;
                    if (c770210UJf != null) {
                        C774610Ua3.LL.LLLZZIL(true);
                        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).K42();
                        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).releaseGalleryModule();
                        C781270Ukn.LJI().releasePanelResource(false);
                        ((C0U79) C781270Ukn.LJI().getLiveEffectRestoreManager()).LIZ(c770210UJf.LLLII);
                        C768460UCm.LIZJ().release();
                        C768460UCm.LJFF();
                        C767120U7i.LIZLLL(false);
                        C768460UCm.LJII().release(true);
                    }
                } else {
                    C770200UJe c770200UJe = liveBroadcastPreviewFragment.LLIZLLLIL;
                    if (c770200UJe != null) {
                        C1EOY c1eoy2 = C1EOY.LIZ;
                        C1EOY.LJIIIIZZ();
                        C774610Ua3.LL.LLLZZIL(true);
                        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).K42();
                        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).releaseGalleryModule();
                        C781270Ukn.LJI().releasePanelResource(false);
                        ((C0U79) C781270Ukn.LJI().getLiveEffectRestoreManager()).LIZ(c770200UJe.LLLLILI);
                        C768460UCm.LIZJ().release();
                        C768460UCm.LJFF();
                        C767120U7i.LIZLLL(false);
                        C768460UCm.LJII().release(true);
                    }
                }
            }
            C473410IhP.LJI();
            C0IK5.LIZLLL(null);
            C497700JfU.LIZ.LIZJ(false, EnumC768840UDy.PREVIEW);
            if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
                C0UFI.LIZJ = null;
            }
            if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Kx1()) {
                C0UFT.LJIIIIZZ = null;
                C0UFT.LJIIIZ = null;
                C0UFT.LJFF = true;
                C781270Ukn.LJI().getComposerFilterSlideHelper().release();
            }
            boolean z = C782660Un2.LIZ;
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL("live_lop_pns_fe_age");
            C1546560qLe.LIZ.getClass();
            C1546500qLY.LJIIIIZZ("live_lop_pns_fe_age");
            C782660Un2.LJ = null;
        }
        return Unit.LIZ;
    }
}
