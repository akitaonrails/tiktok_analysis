package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS23S0101000_12;
import Y.ATListenerS446S0100000_12;
import Y.AfS181S0100000_12;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.PreviewBoardPlaceHolderVisibility;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.LiveGoalFeatureEnableChannel;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.ShowExposureGuideAnimEvent;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.LiveTryModeUseTTLHSplitSetting;
import com.bytedance.android.livesdk.dataChannel.BillboardOverlayVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveAsiaBeautyGenderOpt;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectFaceDetectAllowlistSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePreviewMemLeakOpt;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770210UJf extends C0ULK {
    public final int LLILLL;
    public final Fragment LLILZ;
    public C20516015Pq LLILZIL;
    public C20516015Pq LLILZLL;
    public C20516015Pq LLIZ;
    public C20516015Pq LLIZLLLIL;
    public C20516015Pq LLJ;
    public C20516015Pq LLJI;
    public C20516015Pq LLJIJIL;
    public C20516015Pq LLJILJIL;
    public C20516015Pq LLJILJILJ;
    public C20516015Pq LLJILLL;
    public C20516015Pq LLJJ;
    public C20516015Pq LLJJI;
    public C20516015Pq LLJJIII;
    public C20516015Pq LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public C20516015Pq LLJJIJIL;
    public C426160GnO LLJJJ;
    public C20516015Pq LLJJJIL;
    public C20516015Pq LLJJJJ;
    public C20516015Pq LLJJJJJIL;
    public C20516015Pq LLJJJJLIIL;
    public C20516015Pq LLJJL;
    public C20516015Pq LLJJLIIIJLLLLLLLZ;
    public C20516015Pq LLJL;
    public C20516015Pq LLJLIL;
    public C20516015Pq LLJLILLLLZIIL;
    public C20516015Pq LLJLL;
    public C20516015Pq LLJLLIL;
    public C20516015Pq LLJLLL;
    public C20516015Pq LLJZ;
    public C20516015Pq LLJZIJLIL;
    public C20516015Pq LLL;
    public C20516015Pq LLLF;
    public C20516015Pq LLLFF;
    public C20516015Pq LLLFFI;
    public C0UKT LLLFZ;
    public C20516015Pq LLLI;
    public final DataChannel LLLII;
    public boolean LLLIIII;
    public final C01GW LLLIIIIL;
    public final C1120000fFe LLLIIIL;
    public final ScaleGestureDetectorOnScaleGestureListenerC21656519pD LLLIIL;
    public final C769230UFl LLLIILIL;
    public final C0UKN LLLIL;
    public final InterfaceC767150U7l<? extends LiveEffect> LLLILZ;
    public long LLLILZJ;
    public int LLLILZLLLI;
    public boolean LLLIZZ;
    public int LLLJ;
    public int LLLJIL;
    public final C0UKK LLLJL;
    public final View LLLL;
    public final View LLLLII;
    public C11JF LLLLIIIILLL;
    public long LLLLIIL;
    public final C0UAL LLLLIILL;
    public final ViewGroup LLLLIILLL;
    public final C770390UJx LLLLIL;
    public C20516015Pq LLLLILI;
    public float LLLLJ;
    public float LLLLJI;
    public boolean LLLLL;
    public final ARunnableS112S0100000_12 LLLLLIL;
    public final C0UJ8 LLLLLILLIL;
    public String LLLLLJIL;

    private final C0UJY getLiveParamsListener() {
        return (C0UJY) this.LLLIIIIL.getValue();
    }

    @Override // X.C0ULK
    public final void LIZJ() {
        C0UOP c0uop;
        DataChannel dataChannel = this.LLLII;
        if (dataChannel != null && (c0uop = (C0UOP) dataChannel.gg0(C758410Tp1.class)) != null) {
            c0uop.LIZLLL = System.currentTimeMillis() - c0uop.LIZJ;
        }
        DataChannel dataChannel2 = this.LLLII;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(LivePreviewWidgetsLoaded.class);
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() {
        Pair pair;
        C770390UJx c770390UJx = this.LLLLIL;
        if (c770390UJx != null) {
            ((C11NJ) c770390UJx.LIZ.getValue()).LJ();
        }
        ((HashMap) C0UI9.LIZIZ).clear();
        C0UI9.LIZ().clear();
        C0UAL c0ual = this.LLLLIILL;
        if (c0ual != null) {
            ((C768740UDo) c0ual).LIZIZ();
        }
        C1120000fFe c1120000fFe = this.LLLIIIL;
        if (c1120000fFe != null) {
            c1120000fFe.LIZJ(this.LLLIIL);
        }
        C1120000fFe c1120000fFe2 = this.LLLIIIL;
        if (c1120000fFe2 != null) {
            c1120000fFe2.LIZJ(this.LLLIILIL);
        }
        C1120000fFe c1120000fFe3 = this.LLLIIIL;
        if (c1120000fFe3 != null) {
            c1120000fFe3.LIZJ(this.LLLIL);
        }
        C786410Ut5.LJL(C783270Uo1.LIZJ(), new Runnable() { // from class: X.0UJn
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoModeSimpleContainer@7233.onDestroy$1");
                try {
                    C1D4I.LJIIIZ(false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoModeSimpleContainer@7233.onDestroy$1");
            }
        });
        C768460UCm.LIZIZ().tr(this.LLLLLILLIL);
        DataChannel dataChannel = this.LLLII;
        if (C500260Jjc.LJJIJIIJIL((dataChannel == null || (pair = (Pair) dataChannel.gg0(StartLiveSuccessChannel.class)) == null) ? null : (Boolean) pair.getFirst())) {
            if (this.LLLJL != null) {
                C769540UGq.LIZ = 500;
                C769540UGq.LIZIZ = false;
                C769540UGq.LIZJ = false;
                C0UK0.LIZ = false;
                C0UK0.LIZIZ = false;
                C0UK0.LIZJ = false;
            }
            C774610Ua3.LL.LLLZZIL(false);
            C781270Ukn.LJI().onLeavePreview();
            C768460UCm.LIZIZ().release();
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).K42();
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).releaseGalleryModule();
            C781270Ukn.LJI().releasePanelResource(false);
            ((C0U79) C781270Ukn.LJI().getLiveEffectRestoreManager()).LIZ(this.LLLII);
            C768460UCm.LIZJ().release();
            C768460UCm.LJFF();
            C767120U7i.LIZLLL(true);
            C768460UCm.LJII().release(false);
            C760080Tri.LIZ();
        } else {
            C0UKK c0ukk = this.LLLJL;
            if (c0ukk != null) {
                c0ukk.LLJJ = null;
            }
        }
        C11JF c11jf = this.LLLLIIIILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C0UKJ.LIZIZ();
        C0UKN c0ukn = this.LLLIL;
        if (c0ukn != null) {
            c0ukn.LJI();
        }
        if (LivePreviewMemLeakOpt.enable()) {
            C0UJY liveParamsListener = getLiveParamsListener();
            if (liveParamsListener != null) {
                liveParamsListener.LJIL(null);
            }
            C0UJY liveParamsListener2 = getLiveParamsListener();
            if (liveParamsListener2 != null) {
                liveParamsListener2.LJJI(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0339  */
    @Override // X.C0ULK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 1531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770210UJf.LJ():void");
    }

    public final void LJII() {
        if (LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget() && LivePreviewComponentsSimplifyTypeSetting.INSTANCE.showBottomLiveGoalBtn()) {
            DataChannel dataChannel = this.LLLII;
            if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), Boolean.FALSE)) {
                C0UKC.LIZ(C13LE.LIZ(LiveGoalPreviewButtonWidget.class), getLiveGoalBtnWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
            }
        }
    }

    public final C20516015Pq getApplyWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b7_);
            this.LLJJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBeautyWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bv1);
            this.LLJJIII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBillboardOverlayContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c17);
            this.LLJZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBulltinEditContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d5u);
            this.LLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBusinessWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6f);
            this.LLJLILLLLZIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCampaignWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.da_);
            this.LLLF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCloseWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e2y);
            this.LLILZLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCoverWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f5x);
            this.LLILZIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCustomWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fdt);
            this.LLJJJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getEcBillboardPreviewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gf2);
            this.LLLI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getEcIndependentWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gf9);
            this.LLJLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFansClubWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ho4);
            this.LLJJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFilterStyleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hye);
            this.LLJJLIIIJLLLLLLLZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C426160GnO getFlowLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.idc);
            this.LLJJJ = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final C20516015Pq getGestureMagicTipContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iuw);
            this.LLJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C0UKT getGoLiveLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j38);
            this.LLLFZ = (C0UKT) callbackFindViewById;
        }
        return (C0UKT) callbackFindViewById;
    }

    public final C20516015Pq getInteractWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kvi);
            this.LLJJJJLIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getIntroductionContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kyi);
            this.LLJILJILJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveBoardTipWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFFI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mu9);
            this.LLLFFI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveBoardsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mua);
            this.LLJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxs);
            this.LLJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveGoalBtnWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f757myl);
            this.LLLFF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveGoalEffectContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.myo);
            this.LLJLLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getMoreWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.olv);
            this.LLJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPlaybookWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qt1);
            this.LLJJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPracticeLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rnm);
            this.LLJILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPromoteWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s_u);
            this.LLJLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getReverseCameraWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tft);
            this.LLIZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSettingWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uvz);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getShareWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v30);
            this.LLIZLLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getShoppingManageIntroductionContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v8q);
            this.LLJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getShoppingManageLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v8r);
            this.LLJJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStartLiveContainerV1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vyy);
            this.LLJILJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final FrameLayout getStickerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w4u);
            this.LLJJIJIIJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C20516015Pq getStickerWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w7u);
            this.LLJJIJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSubscribeWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wil);
            this.LLJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getViewerWishesContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZIJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.viewer_wishes_widget_container);
            this.LLJZIJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final boolean LJIIJ() {
        Map<String, LiveEffect> map;
        Map<String, LiveEffect> map2;
        Collection<LiveEffect> collectionValues;
        List listLLIIII;
        Map<String, Map<String, LiveEffect>> mapJr = C768460UCm.LIZIZ().jr();
        String str = C0UD4.LIZIZ;
        if (mapJr.containsKey(str) && (map = mapJr.get(str)) != null && (!map.isEmpty()) && (map2 = mapJr.get(str)) != null && (collectionValues = map2.values()) != null && (listLLIIII = C13LP.LLIIII(collectionValues)) != null) {
            ArrayList<String> arrayList = new ArrayList();
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((LiveEffect) it2.next()).LLJJ(), arrayList);
            }
            if (!arrayList.isEmpty()) {
                for (String str2 : arrayList) {
                    for (String str3 : LiveEffectFaceDetectAllowlistSetting.INSTANCE.getALLOWLIST()) {
                        if (u.LJJIIJZLJL(str2, str3, false)) {
                            C19EG activity = this.LLILZ.getActivity();
                            if (activity == null) {
                                return true;
                            }
                            activity.runOnUiThread(new ARunnableS112S0100000_12(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                            return true;
                        }
                    }
                }
            }
            C19EG activity2 = this.LLILZ.getActivity();
            if (activity2 != null) {
                activity2.runOnUiThread(new ARunnableS112S0100000_12(this, 301));
            }
        }
        return false;
    }

    public final void LJIIIIZZ(boolean z) {
        Boolean bool;
        DataChannel dataChannel = this.LLLII;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C753750ThV.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIFFI(bool)) {
            DataChannel dataChannel2 = this.LLLII;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C753750ThV.class, Boolean.TRUE);
            }
            C1113800f5e.LJIIIIZZ = false;
            if (z) {
                this.LLLLIIIILLL = (C11JF) C11NZ.LJLJJLL(3L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJIILIIL(C0J1R.LIZIZ(this.LLILZ)).LJJLJLI(new AfS181S0100000_12(this, 175));
                return;
            }
            C0UKJ.LJII = true;
            C0UKJ.LJIIIIZZ = "dark_detect";
            C0UKJ.LIZ(this, this.LLLII);
            C0UKZ.LJLZ.LJFF(Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void LJIIIZ(boolean z) {
        if (z) {
            if (this.LLLLIILLL.getVisibility() != 0) {
                C500260Jjc.LLFFF(this.LLLLIILLL);
                C0UJY liveParamsListener = getLiveParamsListener();
                if (liveParamsListener != null) {
                    liveParamsListener.showBottomTab();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLLLIILLL.getVisibility() != 0) {
            return;
        }
        C500260Jjc.LJIILLIIL(this.LLLLIILLL);
        C0UJY liveParamsListener2 = getLiveParamsListener();
        if (liveParamsListener2 == null) {
            return;
        }
        liveParamsListener2.hideBottomTab();
    }

    public final void setApplyWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIL = c20516015Pq;
    }

    public final void setBeautyWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIII = c20516015Pq;
    }

    public final void setBillboardOverlayContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJZ = c20516015Pq;
    }

    public final void setBulltinEditContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLL = c20516015Pq;
    }

    public final void setBusinessWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLILLLLZIIL = c20516015Pq;
    }

    public final void setCampaignWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLF = c20516015Pq;
    }

    public final void setCloseWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZLL = c20516015Pq;
    }

    public final void setCoverWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZIL = c20516015Pq;
    }

    public final void setCustomWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJJIL = c20516015Pq;
    }

    public final void setEcBillboardPreviewContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLI = c20516015Pq;
    }

    public final void setEcIndependentWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLL = c20516015Pq;
    }

    public final void setFansClubWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJ = c20516015Pq;
    }

    public final void setFilterStyleContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJLIIIJLLLLLLLZ = c20516015Pq;
    }

    public final void setFlowLayoutFromXml(C426160GnO c426160GnO) {
        this.LLJJJ = c426160GnO;
    }

    public final void setGestureMagicTipContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJL = c20516015Pq;
    }

    public final void setGoLiveLoadingViewFromXml(C0UKT c0ukt) {
        this.LLLFZ = c0ukt;
    }

    public final void setInteractWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJLIIL = c20516015Pq;
    }

    public final void setIntroductionContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJILJ = c20516015Pq;
    }

    public final void setLiveBoardTipWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFFI = c20516015Pq;
    }

    public final void setLiveBoardsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLIL = c20516015Pq;
    }

    public final void setLiveEventsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJIJIL = c20516015Pq;
    }

    public final void setLiveFilterPos$livebroadcast_impl_release(int i) {
        DialogFragment dialogFragment;
        Dialog dialog;
        if (this.LLILZ.isAdded()) {
            Fragment fragmentLJJJJZI = this.LLILZ.getChildFragmentManager().LJJJJZI("LiveBeautyFilterDialogFragment");
            if ((fragmentLJJJJZI instanceof DialogFragment) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null && (dialog = dialogFragment.getDialog()) != null && dialog.isShowing()) {
                return;
            }
        }
        Integer numLIZIZ = InterfaceC766480U4w.LIZ.LIZIZ();
        if (numLIZIZ != null && numLIZIZ.intValue() == i) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIFFI;
        if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
            c20337914i1.LJFF(Boolean.TRUE);
        }
        InterfaceC767150U7l<? extends LiveEffect> interfaceC767150U7l = this.LLLILZ;
        if (interfaceC767150U7l != null) {
            interfaceC767150U7l.LIZJ(i);
        }
        C768460UCm.LJFF();
        C767120U7i.LIZJ("VideoModeContainer#setLiveFilterPos", false);
        C768460UCm.LJFF();
        C767120U7i.LJI(this.LLLII, "VideoModeContainer#setLiveFilterPos", false, false);
        C768460UCm.LJFF();
        C767120U7i.LIZ("VideoModeContainer#setLiveFilterPos");
    }

    public final void setLiveGoalBtnWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFF = c20516015Pq;
    }

    public final void setLiveGoalEffectContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLLL = c20516015Pq;
    }

    public final void setMoreWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJI = c20516015Pq;
    }

    public final void setPlaybookWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJL = c20516015Pq;
    }

    public final void setPracticeLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILLL = c20516015Pq;
    }

    public final void setPromoteWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLLIL = c20516015Pq;
    }

    public final void setReverseCameraWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public final void setSettingWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setShareWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZLLLIL = c20516015Pq;
    }

    public final void setShoppingManageIntroductionContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJ = c20516015Pq;
    }

    public final void setShoppingManageLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJI = c20516015Pq;
    }

    public final void setStartLiveContainerV1FromXml(C20516015Pq c20516015Pq) {
        this.LLJILJIL = c20516015Pq;
    }

    public final void setStickerContainerFromXml(FrameLayout frameLayout) {
        this.LLJJIJIIJIL = frameLayout;
    }

    public final void setStickerWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJI = c20516015Pq;
    }

    public final void setSubscribeWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJIL = c20516015Pq;
    }

    public final void setViewerWishesContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJZIJLIL = c20516015Pq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0U86, X.0UJ8] */
    public C770210UJf(int i, Fragment fragment) {
        int iLJIIZILJ;
        boolean z;
        Room room;
        super(fragment.requireContext(), R.layout.hic);
        this.LLILLL = i;
        this.LLILZ = fragment;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLLII = dataChannelLJ;
        this.LLLIIIIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 774));
        ScaleGestureDetectorOnScaleGestureListenerC21656519pD scaleGestureDetectorOnScaleGestureListenerC21656519pD = new ScaleGestureDetectorOnScaleGestureListenerC21656519pD(getContext(), dataChannelLJ, 1);
        this.LLLIIL = scaleGestureDetectorOnScaleGestureListenerC21656519pD;
        this.LLLILZ = C768460UCm.LJI();
        if (C497740JfY.LJJ()) {
            iLJIIZILJ = -C497740JfY.LJIIZILJ();
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        float f = iLJIIZILJ;
        this.LLLILZLLLI = -100;
        this.LLLLIILLL = (ViewGroup) findViewById(R.id.ax2);
        this.LLLLLIL = new ARunnableS112S0100000_12(this, 302);
        ?? r5 = new C0U86() { // from class: X.0UJ8
            /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
            @Override // X.C0U86
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r5, java.lang.String r6, boolean r7) {
                /*
                    r4 = this;
                    X.0UEo r0 = X.C768460UCm.LIZIZ()
                    java.util.Map r2 = r0.jr()
                    X.0UJf r3 = r4.LIZ
                    java.lang.String r1 = X.C0UD4.LIZIZ
                    boolean r0 = r2.containsKey(r1)
                    if (r0 == 0) goto L46
                    java.lang.Object r0 = r2.get(r1)
                    java.util.Map r0 = (java.util.Map) r0
                    boolean r0 = r0.isEmpty()
                    r1 = 1
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L46
                L21:
                    r3.LLLIIII = r1
                    X.0UJf r1 = r4.LIZ
                    boolean r0 = r1.LLLIIII
                    if (r0 == 0) goto L45
                    boolean r0 = r1.LJIIJ()
                    if (r0 == 0) goto L45
                    X.0UJf r0 = r4.LIZ
                    androidx.fragment.app.Fragment r0 = r0.LLILZ
                    X.19EG r3 = r0.getActivity()
                    if (r3 == 0) goto L45
                    Y.ARunnableS112S0100000_12 r2 = new Y.ARunnableS112S0100000_12
                    X.0UJf r1 = r4.LIZ
                    r0 = 303(0x12f, float:4.25E-43)
                    r2.<init>(r1, r0)
                    r3.runOnUiThread(r2)
                L45:
                    return
                L46:
                    X.0UJf r0 = r4.LIZ
                    com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LLLII
                    if (r2 == 0) goto L53
                    java.lang.Class<com.bytedance.android.live.effect.api.FaceDetectEvent> r1 = com.bytedance.android.live.effect.api.FaceDetectEvent.class
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r2.LC0(r1, r0)
                L53:
                    r1 = 0
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0UJ8.LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, boolean):void");
            }
        };
        this.LLLLLILLIL = r5;
        InterfaceC770090UIt interfaceC770090UIt = new InterfaceC770090UIt() { // from class: X.0UJi
            @Override // X.InterfaceC770090UIt
            public final void onResult(int i2) {
                C19EG activity;
                C770210UJf c770210UJf = this.LIZ;
                if (c770210UJf.LLLIIII && c770210UJf.LJIIJ()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C770210UJf c770210UJf2 = this.LIZ;
                    if (jCurrentTimeMillis - c770210UJf2.LLLILZJ > 100 || i2 != c770210UJf2.LLLILZLLLI) {
                        c770210UJf2.LLLILZJ = System.currentTimeMillis();
                        C770210UJf c770210UJf3 = this.LIZ;
                        c770210UJf3.LLLILZLLLI = i2;
                        if (c770210UJf3.LL && (activity = c770210UJf3.LLILZ.getActivity()) != null) {
                            activity.runOnUiThread(new ARunnableS23S0101000_12(i2, this.LIZ, 15));
                        }
                    }
                }
            }
        };
        this.LLLLLJIL = EnumC770010UIl.DEFAULT.value;
        InterfaceC770070UIr interfaceC770070UIr = new InterfaceC770070UIr() { // from class: X.0UJ5
            @Override // X.InterfaceC770070UIr
            public final void LIZ(boolean z2, EnumC770010UIl enumC770010UIl) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C770210UJf c770210UJf = this.LIZ;
                if (jCurrentTimeMillis - c770210UJf.LLLLIIL > 1000) {
                    c770210UJf.LLLIZZ = z2;
                }
                if (LiveAsiaBeautyGenderOpt.INSTANCE.enable()) {
                    String str = this.LIZ.LLLLLJIL;
                    EnumC770010UIl enumC770010UIl2 = EnumC770010UIl.DEFAULT;
                    if (Intrinsics.LJFF(str, enumC770010UIl2.value) && enumC770010UIl != enumC770010UIl2) {
                        this.LIZ.LLLLLJIL = enumC770010UIl.value;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("result: ");
                        sbLIZ.append(this.LIZ.LLLLLJIL);
                        C20441214yg.LJIIIZ("BeautyGenderDetect", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC766480U4w.LJJJJZI.LIZJ(this.LIZ.LLLLLJIL);
                    }
                }
            }
        };
        C0UJY liveParamsListener = getLiveParamsListener();
        if (liveParamsListener != null) {
            liveParamsListener.LJIL(interfaceC770090UIt);
        }
        C0UJY liveParamsListener2 = getLiveParamsListener();
        if (liveParamsListener2 != null) {
            liveParamsListener2.LJJI(interfaceC770070UIr);
        }
        InterfaceC769000UEo interfaceC769000UEoLIZIZ = C768460UCm.LIZIZ();
        C0UGC c0ugc = new C0UGC();
        c0ugc.LIZ = C0UD4.LJII;
        c0ugc.LIZLLL = "broadcast";
        c0ugc.LIZJ = C781270Ukn.LJI().getComposerHandler(C770730ULf.LIZ(dataChannelLJ));
        interfaceC769000UEoLIZIZ.or(new C0UG8(c0ugc));
        interfaceC769000UEoLIZIZ.Dr(r5);
        C768460UCm.LJ();
        if (dataChannelLJ != null) {
            getContext();
            C0U79.LIZIZ(dataChannelLJ, fragment, true);
        }
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C0UFI.LIZJ = dataChannelLJ;
            C0UFI.LIZLLL = true;
            if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            C0UFI.LJI(AFwS245S0000000_12.get$arr$(6), z);
            C768460UCm.LIZLLL();
            C766720U5u.LJIIJ(this.LLLII);
        }
        this.LLLLILI = (C20516015Pq) findViewById(R.id.uu7);
        setOnTouchListener(new ATListenerS446S0100000_12(this, 19));
        this.LLLLIILL = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).createMagicGestureEffectAnchorHelper(dataChannelLJ, this, null);
        C770390UJx c770390UJx = new C770390UJx();
        this.LLLLIL = c770390UJx;
        if (dataChannelLJ != null) {
            dataChannelLJ.EQ2(fragment, RoomCreateInfoChannel.class, new AwS378S0200000_12(dataChannelLJ, c770390UJx, 42));
        }
        C1D4I.LIZ = new C2250021D4u(fragment);
        if (dataChannelLJ != null && (fragment instanceof BaseFragment)) {
            C1120000fFe c1120000fFe = new C1120000fFe(dataChannelLJ);
            this.LLLIIIL = c1120000fFe;
            BaseFragment baseFragment = (BaseFragment) fragment;
            C0UKN c0ukn = new C0UKN(getContext(), dataChannelLJ, 3, baseFragment);
            this.LLLIL = c0ukn;
            C769230UFl c769230UFl = new C769230UFl(getContext(), dataChannelLJ, f, baseFragment);
            this.LLLIILIL = c769230UFl;
            c1120000fFe.LIZIZ(scaleGestureDetectorOnScaleGestureListenerC21656519pD);
            c1120000fFe.LIZIZ(c0ukn);
            c1120000fFe.LIZIZ(c769230UFl);
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.A3;
        if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
            LJIIIIZZ(true);
            c20337914i1.LJFF(Boolean.TRUE);
        }
        this.LLLLII = findViewById(R.id.wq7);
        this.LLLL = findViewById(R.id.wq1);
        C0UKT goLiveLoadingViewFromXml = getGoLiveLoadingViewFromXml();
        if (goLiveLoadingViewFromXml != null) {
            goLiveLoadingViewFromXml.setLifecycleOwner(fragment);
            goLiveLoadingViewFromXml.setDataChannel(dataChannelLJ);
        }
        C0UKK c0ukk = new C0UKK(getContext());
        this.LLLJL = c0ukk;
        c0ukk.setDataChannel(dataChannelLJ);
        addView(c0ukk, new FrameLayout.LayoutParams(-1, -1));
        C0UKN c0ukn2 = this.LLLIL;
        if (c0ukn2 != null) {
            c0ukn2.LLJILJILJ = new C0UKO() { // from class: X.0UKA
                @Override // X.C0UKO
                public final Pair<Integer, Integer> LIZ() {
                    RoomCreateInfo roomCreateInfo;
                    BannerInRoomCollection.BannerInfo bannerInfo;
                    List<BannerInRoom> list;
                    if (LiveExposureOptSetting.INSTANCE.enable()) {
                        return new Pair<>(Integer.valueOf(this.LIZ.getIntroductionContainerFromXml().getBottom()), Integer.valueOf(this.LIZ.getFlowLayoutFromXml().getTop()));
                    }
                    DataChannel dataChannel = this.LIZ.LLLII;
                    return new Pair<>(Integer.valueOf((dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || (bannerInfo = roomCreateInfo.bannerInfo) == null || (list = bannerInfo.bannerList) == null || list.size() != 0) ? this.LIZ.getIntroductionContainerFromXml().getBottom() + ((int) C497740JfY.LIZIZ(66.0f)) : this.LIZ.getIntroductionContainerFromXml().getBottom()), Integer.valueOf(this.LIZ.getHeight() - this.LIZ.getFlowLayoutFromXml().getTop()));
                }

                @Override // X.C0UKO
                public final void LIZIZ() {
                    C0UKK c0ukk2 = this.LIZ.LLLJL;
                    if (c0ukk2 != null) {
                        c0ukk2.LIZIZ();
                    }
                }

                @Override // X.C0UKO
                public final void LIZJ(boolean z2) {
                    if (z2) {
                        C0UKK c0ukk2 = this.LIZ.LLLJL;
                        if (c0ukk2 != null) {
                            c0ukk2.LJI();
                            return;
                        }
                        return;
                    }
                    C0UKK c0ukk3 = this.LIZ.LLLJL;
                    if (c0ukk3 == null) {
                        return;
                    }
                    c0ukk3.LJFF();
                }

                @Override // X.C0UKO
                public final void LIZLLL(int i2) {
                    C780540Ujc c780540Ujc;
                    C0UKK c0ukk2 = this.LIZ.LLLJL;
                    if (c0ukk2 != null && (c780540Ujc = c0ukk2.LLJ) != null) {
                        c780540Ujc.LJI(i2);
                    }
                }
            };
        }
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(fragment, BillboardOverlayVisibilityChannel.class, new AwS591S0100000_12(this, 854));
            dataChannelLJ.BQ2(fragment, LiveGoalFeatureEnableChannel.class, new AwS591S0100000_12(this, 855));
            dataChannelLJ.BQ2(fragment, PreviewBoardPlaceHolderVisibility.class, new AwS591S0100000_12(this, 856));
            dataChannelLJ.BQ2(fragment, ShowExposureGuideAnimEvent.class, new AwS591S0100000_12(this, 857));
            String str = (String) dataChannelLJ.gg0(C0UJD.class);
            if (str != null && str.length() != 0) {
                C781270Ukn.LJI().getLiveGoalEffectHelper();
                C0UFI.LJIILL();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0UJ7(str, null), 3);
            }
        }
        C0UJK.LIZ();
        if (dataChannelLJ != null) {
            C774610Ua3.LL.LLLZIIL(fragment, dataChannelLJ);
        }
        if (!LiveTryModeUseTTLHSplitSetting.INSTANCE.enable()) {
            C0UNJ.LIZ(fragment);
        }
    }
}
