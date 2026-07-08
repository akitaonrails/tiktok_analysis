package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import Y.AfS181S0100000_12;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.ResetLivePreviewSurfaceViewLayout;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.PreviewBottomBubbleShowEvent;
import com.bytedance.android.livesdk.broadcast.PreviewLiveModeIndicatorVisibilityChannel;
import com.bytedance.android.livesdk.broadcast.RestartLiveChannel;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.ManageModeIntroductionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutRootWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewInviteGuestWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCoverTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionMoreWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionPracticeModelEntranceWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewShoppingManageLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewShowLocationWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.TryModeIntroductionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewPracticeLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.dataChannel.BasePreviewWidgetVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewBulletinEditVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewNonSimpleModeComponentChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewShoppingManageShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewTryModeShowChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectFaceDetectAllowlistSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAddAutoAcceptInGoLivePageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixSurfaceViewResumeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePreviewMemLeakOpt;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.data.AboveGoLiveButtonComponent;
import webcast.data.BottomContainerComponent;
import webcast.data.LiveGoLivePageContainer;

/* JADX INFO: renamed from: X.0UJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770190UJd extends C0ULK implements InterfaceC1141530foN {
    public final int LLILLL;
    public final Fragment LLILZ;
    public C20516015Pq LLILZIL;
    public FrameLayout LLILZLL;
    public C20516015Pq LLIZ;
    public C20516015Pq LLIZLLLIL;
    public C20516015Pq LLJ;
    public C20516015Pq LLJI;
    public C20516015Pq LLJIJIL;
    public C20516015Pq LLJILJIL;
    public C20516015Pq LLJILJILJ;
    public C0UKT LLJILLL;
    public boolean LLJJ;
    public C20516015Pq LLJJI;
    public C20516015Pq LLJJIII;
    public C20516015Pq LLJJIJI;
    public C20516015Pq LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public ViewGroup LLJJJ;
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
    public View LLJLLIL;
    public ConstraintLayout LLJLLL;
    public C20516015Pq LLJZ;
    public C20516015Pq LLJZIJLIL;
    public C20516015Pq LLL;
    public C20516015Pq LLLF;
    public C01DS LLLFF;
    public C500020JjE LLLFFI;
    public C426160GnO LLLFZ;
    public final C770390UJx LLLI;
    public C20516015Pq LLLII;
    public C20516015Pq LLLIIII;
    public final List<C13IQ<? extends PreviewWidget>> LLLIIIIL;
    public int LLLIIIL;
    public final DataChannel LLLIIL;
    public boolean LLLIILIL;
    public final C01GW LLLIL;
    public final C1120000fFe LLLILZ;
    public final ScaleGestureDetectorOnScaleGestureListenerC21656519pD LLLILZJ;
    public final C769230UFl LLLILZLLLI;
    public final C0UKN LLLIZZ;
    public final InterfaceC767150U7l<? extends LiveEffect> LLLJ;
    public long LLLJIL;
    public int LLLJL;
    public boolean LLLL;
    public final ViewGroup LLLLII;
    public C0UKK LLLLIIIILLL;
    public final View LLLLIIL;
    public final View LLLLIILL;
    public C11JF LLLLIILLL;
    public long LLLLIL;
    public final C0UAL LLLLILI;
    public InterfaceC770380UJw LLLLJ;
    public boolean LLLLJI;
    public int LLLLL;
    public boolean LLLLLIL;
    public C0UKH LLLLLILLIL;
    public float LLLLLJIL;
    public float LLLLLJLJLL;
    public boolean LLLLLL;
    public final ARunnableS112S0100000_12 LLLLLLIL;
    public boolean LLLLLLJ;
    public final C0UJG LLLLLLL;
    public boolean LLLLLLLLL;
    public final C770270UJl LLLLLLLLLL;
    public String LLLLLLLZIL;
    public final C0UJ4 LLLLLLZ;
    public final C0UK8 LLLLLLZZ;
    public C0UK5 LLLLLZ;
    public final Set<EnumC770260UJk> LLLLLZIL;
    public final C770320UJq LLLLLZL;
    public boolean LLLLZ;
    public boolean LLLLZI;
    public boolean LLLLZIL;
    public final ViewOnLayoutChangeListenerC785940UsK LLLLZLL;
    public float LLLLZLLIL;
    public float LLLLZLLLI;
    public long LLLZ;
    public float LLLZI;
    public float LLLZIIL;
    public Boolean LLLZIL;
    public final ARunnableS112S0100000_12 LLLZL;
    public final AwS591S0100000_12 LLLZLL;

    /* JADX WARN: Removed duplicated region for block: B:110:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04cd  */
    @Override // X.C0ULK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770190UJd.LJ():void");
    }

    @Override // X.C0ULK
    public final void LJFF() {
        this.LLLLZI = false;
        this.LLLLZ = false;
        this.LLLLLLJ = false;
        this.LLLLLZIL.clear();
        C0UK5 c0uk5 = this.LLLLLZ;
        if (c0uk5 != null) {
            c0uk5.LIZ();
        }
        this.LLILLJJLI.remove("batch_widget_load_token");
    }

    public final int getWeakY() {
        int[] iArr = new int[2];
        C426160GnO c426160GnO = this.LLLFZ;
        if (c426160GnO != null) {
            c426160GnO.getLocationOnScreen(iArr);
        }
        return iArr[1];
    }

    public static final boolean LJIILJJIL() {
        return AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable() && C500260Jjc.LJJIFFI(InterfaceC772600USk.If.LIZIZ()) && C474650IjP.LIZ();
    }

    private final C0UJY getLiveParamsListener() {
        return (C0UJY) this.LLLIL.getValue();
    }

    @Override // X.C0ULK
    public final void LIZJ() {
        C0UOP c0uop;
        DataChannel dataChannel = this.LLLIIL;
        if (dataChannel != null && (c0uop = (C0UOP) dataChannel.gg0(C758410Tp1.class)) != null) {
            c0uop.LIZLLL = System.currentTimeMillis() - c0uop.LIZJ;
        }
        DataChannel dataChannel2 = this.LLLIIL;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(LivePreviewWidgetsLoaded.class);
        }
        if (PreviewEnterFpsOptSetting.INSTANCE.enable()) {
            LJIILLIIL();
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() {
        InterfaceC769410UGd interfaceC769410UGdM70;
        InterfaceC770380UJw interfaceC770380UJw;
        Pair pair;
        C0UK5 c0uk5 = this.LLLLLZ;
        if (c0uk5 != null) {
            c0uk5.LIZ();
        }
        this.LLILLJJLI.remove("batch_widget_load_token");
        this.LLLLLZ = null;
        this.LLLLLILLIL = null;
        ConstraintLayout constraintLayout = this.LLJLLL;
        if (constraintLayout != null) {
            constraintLayout.removeOnLayoutChangeListener(this.LLLLZLL);
        }
        ((ArrayList) this.LLLIIIIL).clear();
        C770390UJx c770390UJx = this.LLLI;
        if (c770390UJx != null) {
            ((C11NJ) c770390UJx.LIZ.getValue()).LJ();
        }
        ((HashMap) C0UI9.LIZIZ).clear();
        C0UI9.LIZ().clear();
        C0UAL c0ual = this.LLLLILI;
        if (c0ual != null) {
            ((C768740UDo) c0ual).LIZIZ();
        }
        C1120000fFe c1120000fFe = this.LLLILZ;
        if (c1120000fFe != null) {
            c1120000fFe.LIZJ(this.LLLILZJ);
        }
        C1120000fFe c1120000fFe2 = this.LLLILZ;
        if (c1120000fFe2 != null) {
            c1120000fFe2.LIZJ(this.LLLILZLLLI);
        }
        C1120000fFe c1120000fFe3 = this.LLLILZ;
        if (c1120000fFe3 != null) {
            c1120000fFe3.LIZJ(this.LLLIZZ);
        }
        C786410Ut5.LJL(C783270Uo1.LIZJ(), new Runnable() { // from class: X.0UJp
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoModeContainerRevision@ec60.onDestroy$1");
                try {
                    C1D4I.LJIIIZ(false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoModeContainerRevision@ec60.onDestroy$1");
            }
        });
        C768460UCm.LIZIZ().tr(this.LLLLLLL);
        DataChannel dataChannel = this.LLLIIL;
        if (C500260Jjc.LJJIJIIJIL((dataChannel == null || (pair = (Pair) dataChannel.gg0(StartLiveSuccessChannel.class)) == null) ? null : (Boolean) pair.getFirst())) {
            if (this.LLLLIIIILLL != null) {
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
            ((C0U79) C781270Ukn.LJI().getLiveEffectRestoreManager()).LIZ(this.LLLIIL);
            C768460UCm.LIZJ().release();
            C768460UCm.LJFF();
            C767120U7i.LIZLLL(true);
            C768460UCm.LJII().release(false);
            C760080Tri.LIZ();
            InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
            if (boardsDisplayStateManager != null) {
                boardsDisplayStateManager.LJIILIIL();
            }
            InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
            if (effectBoardService != null) {
                effectBoardService.release();
            }
        } else {
            C0UKK c0ukk = this.LLLLIIIILLL;
            if (c0ukk != null) {
                c0ukk.LLJJ = null;
            }
            C781270Ukn.LJI().composerManagerB().LJIJJ();
        }
        C11JF c11jf = this.LLLLIILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
        C0UKJ.LIZIZ();
        C0UKN c0ukn = this.LLLIZZ;
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
        if (BugFixSurfaceViewResumeSetting.INSTANCE.isEnable() && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage() && (interfaceC769410UGdM70 = C781270Ukn.LJIILJJIL().M70()) != null && interfaceC769410UGdM70.getPanelLayoutType() == 1 && (interfaceC770380UJw = this.LLLLJ) != null) {
            interfaceC770380UJw.lj();
        }
    }

    public final void LJIIIIZZ() {
        View view;
        C770230UJh.LIZ.getClass();
        int iLIZIZ = C770230UJh.LIZIZ();
        boolean z = false;
        if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable() && this.LLILLL == 3) {
            C500260Jjc.LJLJLLL(((int) C497740JfY.LIZIZ((iLIZIZ - 28) / 5)) * 3, this.LLLFZ);
        } else {
            C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(iLIZIZ - 28), this.LLLFZ);
            C20516015Pq c20516015Pq = this.LLLII;
            if (c20516015Pq != null) {
                C500260Jjc.LJJLJ(0, c20516015Pq);
            }
        }
        int i = (iLIZIZ - 28) / 5;
        Iterator it2 = ((ArrayList) this.LLLIIIIL).iterator();
        while (it2.hasNext()) {
            PreviewWidget previewWidgetLJFF = C0UKC.LJFF((C13IQ) it2.next());
            if (previewWidgetLJFF != null && (view = previewWidgetLJFF.getView()) != null) {
                C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(i), view);
            }
        }
        ConstraintLayout constraintLayout = this.LLJLLL;
        C770230UJh.LIZ.getClass();
        C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(C770230UJh.LIZJ()), constraintLayout);
        C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(C770230UJh.LIZJ()), this.LLJJIII);
        PreviewStartLiveWidget previewStartLiveWidget = (PreviewStartLiveWidget) C0UKC.LJFF(C13LE.LIZ(PreviewStartLiveWidget.class));
        if (previewStartLiveWidget != null) {
            previewStartLiveWidget.G1();
        }
        if (C770230UJh.LIZLLL()) {
            C20516015Pq c20516015Pq2 = this.LLJJJIL;
            ViewGroup.LayoutParams layoutParams = c20516015Pq2 != null ? c20516015Pq2.getLayoutParams() : null;
            C19ME c19me = layoutParams instanceof C19ME ? (C19ME) layoutParams : null;
            if (C770230UJh.LIZLLL() && C770230UJh.LJ()) {
                z = true;
            }
            if (c19me != null) {
                ((ViewGroup.MarginLayoutParams) c19me).width = z ? (int) C497740JfY.LIZIZ(C770230UJh.LIZ()) : -1;
                c19me.horizontalBias = z ? 1.0f : 0.5f;
            }
            C20516015Pq c20516015Pq3 = this.LLJJJIL;
            if (c20516015Pq3 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20516015Pq3);
                c20516015Pq3.setLayoutParams(c19me);
            }
            PreviewBannerWidget previewBannerWidget = (PreviewBannerWidget) C0UKC.LJFF(C13LE.LIZ(PreviewBannerWidget.class));
            if (previewBannerWidget != null) {
                previewBannerWidget.J1();
            }
        }
    }

    public final void LJIIIZ() {
        int i = this.LLILLL;
        if (i == 3 || i == 1) {
            return;
        }
        AwS626S0100000_12 awS626S0100000_12 = new AwS626S0100000_12(this, 49);
        int i2 = this.LLLLL;
        if (i2 == 0) {
            awS626S0100000_12.invoke(Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exl, getContext())), Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exm, getContext())));
            ConstraintLayout constraintLayout = this.LLJLLL;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(R.drawable.f_k);
                return;
            }
            return;
        }
        if (i2 == 1) {
            awS626S0100000_12.invoke(Integer.valueOf(C20736316Cj.LIZIZ(R.attr.ep5, getContext())), null);
            ConstraintLayout constraintLayout2 = this.LLJLLL;
            if (constraintLayout2 != null) {
                constraintLayout2.setBackgroundResource(R.drawable.f_l);
                return;
            }
            return;
        }
        awS626S0100000_12.invoke(Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exl, getContext())), Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exm, getContext())));
        ConstraintLayout constraintLayout3 = this.LLJLLL;
        if (constraintLayout3 != null) {
            constraintLayout3.setBackgroundResource(R.drawable.f_k);
        }
    }

    public final void LJIILLIIL() {
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.A3;
        if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
            DataChannel dataChannel = this.LLLIIL;
            if (C500260Jjc.LJJIFFI(dataChannel != null ? (Boolean) dataChannel.gg0(C753750ThV.class) : null)) {
                DataChannel dataChannel2 = this.LLLIIL;
                if (dataChannel2 != null) {
                    dataChannel2.SX0(C753750ThV.class, Boolean.TRUE);
                }
                C1113800f5e.LJIIIIZZ = false;
                this.LLLLIILLL = (C11JF) C11NZ.LJLJJLL(3L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJIILIIL(C0J1R.LIZIZ(this.LLILZ)).LJJLJLI(new AfS181S0100000_12(this, 177));
                c20337914i1.LJFF(Boolean.TRUE);
            }
        }
        if (this.LLLLIIIILLL == null) {
            C0UKK c0ukk = new C0UKK(getContext());
            this.LLLLIIIILLL = c0ukk;
            c0ukk.setDataChannel(this.LLLIIL);
            addView(this.LLLLIIIILLL, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void LJIJ() {
        C19ME c19me;
        C20516015Pq c20516015Pq;
        if (!this.LLLLJI) {
            View view = this.LLJLLIL;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
                if (c19me != null && (c20516015Pq = this.LLJJIII) != null) {
                    c19me.bottomToTop = c20516015Pq.getId();
                }
            } else {
                c19me = null;
            }
            View view2 = this.LLJLLIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, c19me);
            }
            C0UKC.LIZ(C13LE.LIZ(PreviewInviteGuestWidget.class), this.LLJJIII, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        LinkMicMgPreviewLivePageSetting linkMicMgPreviewLivePageSetting = LinkMicMgPreviewLivePageSetting.INSTANCE;
        if (linkMicMgPreviewLivePageSetting.enable() || MultiGuestAddAutoAcceptInGoLivePageSetting.INSTANCE.enable()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewGuestLayoutRootWidget.class), this.LLJJIJI, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
            if (linkMicMgPreviewLivePageSetting.showLayoutInPreviewLivePage()) {
                C0UKC.LIZ(C13LE.LIZ(PreviewGuestLayoutZoomSurfaceWidget.class), this.LLJJIJIIJIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                InterfaceC770380UJw interfaceC770380UJw = this.LLLLJ;
                SurfaceView surfaceViewW9 = interfaceC770380UJw != null ? interfaceC770380UJw.w9() : null;
                PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget = (PreviewGuestLayoutZoomSurfaceWidget) C0UKC.LJFF(C13LE.LIZ(PreviewGuestLayoutZoomSurfaceWidget.class));
                if (previewGuestLayoutZoomSurfaceWidget != null) {
                    C0UJY liveParamsListener = getLiveParamsListener();
                    View viewFindViewById = findViewById(R.id.jaj);
                    previewGuestLayoutZoomSurfaceWidget.LLILZLL = this;
                    previewGuestLayoutZoomSurfaceWidget.LLJ = liveParamsListener;
                    previewGuestLayoutZoomSurfaceWidget.LLJILJIL = viewFindViewById;
                    previewGuestLayoutZoomSurfaceWidget.LLJILJILJ = surfaceViewW9;
                }
                InterfaceC770380UJw interfaceC770380UJw2 = this.LLLLJ;
                ViewGroup viewGroupOl = interfaceC770380UJw2 != null ? interfaceC770380UJw2.ol() : null;
                if (surfaceViewW9 != null && viewGroupOl != null && this.LLJJ) {
                    DataChannel dataChannel = this.LLLIIL;
                    if (dataChannel != null) {
                        dataChannel.SX0(C769520UGo.class, new C15CK(surfaceViewW9, viewGroupOl));
                    }
                    this.LLJJ = false;
                }
                DataChannel dataChannel2 = this.LLLIIL;
                if (dataChannel2 != null) {
                    dataChannel2.BQ2(this.LLILZ, ResetLivePreviewSurfaceViewLayout.class, new AwS591S0100000_12(this, 880));
                }
            }
        }
    }

    public final void LJIJI() {
        int i = this.LLILLL;
        if (i != 1) {
            if (i == 2) {
                C0UKC.LIZ(C13LE.LIZ(ManageModeIntroductionWidget.class), this.LLJL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                C0UKC.LIZ(C13LE.LIZ(PreviewShoppingManageLiveWidget.class), this.LLJLIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                return;
            } else if (i != 3) {
                if (C0UON.LIZ == null) {
                    C0UKC.LIZ(C13LE.LIZ(TryModeIntroductionWidget.class), this.LLJJL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewTryModeShowChannel.class)}, true);
                    C0UKC.LIZ(C13LE.LIZ(PreviewPracticeLiveWidget.class), this.LLJJLIIIJLLLLLLLZ, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewTryModeShowChannel.class)}, true);
                    C0UKC.LIZ(C13LE.LIZ(ManageModeIntroductionWidget.class), this.LLJL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewShoppingManageShowChannel.class)}, true);
                    C0UKC.LIZ(C13LE.LIZ(PreviewShoppingManageLiveWidget.class), this.LLJLIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewShoppingManageShowChannel.class)}, true);
                }
                C0UKC.LIZ(C13LE.LIZ(PreviewBannerWidget.class), this.LLJJJIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewNonSimpleModeComponentChannel.class)}, true);
                return;
            }
        }
        if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable() && this.LLILLL == 3) {
            return;
        }
        C0UKC.LIZ(C13LE.LIZ(TryModeIntroductionWidget.class), this.LLJJL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewPracticeLiveWidget.class), this.LLJJLIIIJLLLLLLLZ, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
    }

    public final void LJIJJ() {
        List<AboveGoLiveButtonComponent> list;
        C20516015Pq c20516015Pq;
        C0UKC.LIZ(C13LE.LIZ(PreviewStartLiveWidget.class), getStartLiveContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCloseWidget.class), this.LLJJI, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        int i = this.LLILLL;
        C19ME c19me = null;
        if (i == 0 || (i == 1 && LJIILJJIL())) {
            C0UKC.LIZJ(C13LE.LIZ(PreviewRevisionCoverTitleWidget.class), this.LLJZIJLIL, getTitleChannel());
            if (HostAddLocationSetting.INSTANCE.enable()) {
                RoomCreateInfo roomCreateInfo = C0UON.LIZ;
                if (roomCreateInfo == null) {
                    C0UKC.LIZJ(C13LE.LIZ(PreviewShowLocationWidget.class), this.LLL, getTitleChannel());
                } else {
                    LiveGoLivePageContainer liveGoLivePageContainer = roomCreateInfo.liveGoLivePageContainer;
                    if (liveGoLivePageContainer != null && (list = liveGoLivePageContainer.aboveGoLiveButtonContainer) != null) {
                        Iterator<AboveGoLiveButtonComponent> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            AboveGoLiveButtonComponent next = it2.next();
                            if (next.type == 25) {
                                if (next != null) {
                                }
                            }
                        }
                        C0UKC.LIZJ(C13LE.LIZ(PreviewShowLocationWidget.class), this.LLL, getTitleChannel());
                    }
                }
            }
        }
        if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable() && this.LLILLL == 3) {
            View view = this.LLJLLIL;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null && (c20516015Pq = this.LLLII) != null) {
                c19me.bottomToTop = c20516015Pq.getId();
            }
            View view2 = this.LLJLLIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, c19me);
            }
            C0UKC.LIZ(C13LE.LIZ(PreviewRevisionPracticeModelEntranceWidget.class), this.LLLII, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
            this.LLLLJI = true;
        }
        int i2 = this.LLILLL;
        if (i2 == 1 || i2 == 3 || i2 == 2) {
            LJIJJLI();
        }
    }

    public final void LJIJJLI() {
        if (this.LLILLL == 1 && LJIILJJIL()) {
            return;
        }
        ConstraintLayout constraintLayout = this.LLJLLL;
        if (constraintLayout != null) {
            constraintLayout.setBackground(null);
            constraintLayout.setMinHeight(0);
            constraintLayout.setPadding(0, 0, 0, 0);
        }
        C0UKC.LIZLLL(C13LE.LIZ(PreviewRevisionCoverTitleWidget.class));
        C0UKC.LIZLLL(C13LE.LIZ(PreviewShowLocationWidget.class));
        C20516015Pq c20516015Pq = this.LLJZIJLIL;
        if (c20516015Pq != null) {
            C500260Jjc.LJJLJ(0, c20516015Pq);
        }
        C20516015Pq c20516015Pq2 = this.LLL;
        if (c20516015Pq2 != null) {
            C500260Jjc.LJJLJ(0, c20516015Pq2);
        }
    }

    public final void LJIL() {
        if (C500260Jjc.LJJIJIIJIL((Boolean) DataChannelGlobal.LLILZ.gg0(RestartLiveChannel.class))) {
            C0UJY liveParamsListener = getLiveParamsListener();
            if (liveParamsListener != null) {
                liveParamsListener.LJIL(this.LLLLLLLLLL);
            }
            C0UJY liveParamsListener2 = getLiveParamsListener();
            if (liveParamsListener2 != null) {
                liveParamsListener2.LJJI(this.LLLLLLZ);
            }
        }
    }

    public final void LJJI() {
        DataChannel dataChannel = this.LLLIIL;
        boolean z = !(dataChannel != null ? Intrinsics.LJFF(dataChannel.gg0(StickerDialogShowChannel.class), Boolean.FALSE) : false);
        DataChannel dataChannel2 = this.LLLIIL;
        boolean z2 = !(dataChannel2 != null ? Intrinsics.LJFF(dataChannel2.gg0(EffectDialogShowChannel.class), Boolean.FALSE) : false);
        DataChannel dataChannel3 = this.LLLIIL;
        boolean z3 = z && z2 && ((dataChannel3 != null ? Intrinsics.LJFF(dataChannel3.gg0(LiveGoalDialogShowChannel.class), Boolean.FALSE) : false) ^ true);
        ConstraintLayout constraintLayout = this.LLJLLL;
        if (constraintLayout != null) {
            C786410Ut5.LL(z3 ? 0 : 4, constraintLayout);
        }
    }

    public final C20516015Pq getBillboardOverlayContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c17);
            this.LLJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBoardsDisplayViewWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c7c);
            this.LLJILJILJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBulltinEditContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d5u);
            this.LLJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFilterStyleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hye);
            this.LLIZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGestureMagicTipContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iuw);
            this.LLIZLLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C0UKT getGoLiveLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j38);
            this.LLJILLL = (C0UKT) callbackFindViewById;
        }
        return (C0UKT) callbackFindViewById;
    }

    public final C20516015Pq getLiveBoardTipWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mu9);
            this.LLJILJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventStickerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxm);
            this.LLILZIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveGoalEffectContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.myo);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStartLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vyx);
            this.LLLF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final FrameLayout getStickerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w4u);
            this.LLILZLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    private final Set<C13IQ<? extends BasePreviewWidgetVisibilityChannel>> getTitleChannel() {
        return LJIILJJIL() ? C093Y.LJ(C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)) : C093Y.LJ(C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewNonSimpleModeComponentChannel.class));
    }

    public final void LJIIZILJ() {
        InterfaceC769000UEo interfaceC769000UEoLIZIZ = C768460UCm.LIZIZ();
        C20441214yg.LIZIZ("EffectMonitor#PreviewInit", interfaceC769000UEoLIZIZ.toString());
        C0UGC c0ugc = new C0UGC();
        c0ugc.LIZ = C0UD4.LJII;
        c0ugc.LIZLLL = "broadcast";
        c0ugc.LIZJ = C781270Ukn.LJI().getComposerHandler(C770730ULf.LIZ(this.LLLIIL));
        interfaceC769000UEoLIZIZ.or(new C0UG8(c0ugc));
        interfaceC769000UEoLIZIZ.Dr(this.LLLLLLL);
        C768460UCm.LJ();
        DataChannel dataChannel = this.LLLIIL;
        if (dataChannel == null) {
            return;
        }
        Fragment fragment = this.LLILZ;
        getContext();
        C0U79.LIZIZ(dataChannel, fragment, true);
    }

    public final boolean LJJ() {
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
                            activity.runOnUiThread(new ARunnableS112S0100000_12(this, 308));
                            return true;
                        }
                    }
                }
            }
            C19EG activity2 = this.LLILZ.getActivity();
            if (activity2 != null) {
                activity2.runOnUiThread(new ARunnableS112S0100000_12(this, 309));
            }
        }
        return false;
    }

    private final C426160GnO getFlowLayout() {
        return this.LLLFZ;
    }

    public final boolean getLoadPracticeCapsule() {
        return this.LLLLJI;
    }

    public final InterfaceC770380UJw getSurfaceViewController() {
        return this.LLLLJ;
    }

    public final boolean getZoomStatus() {
        return this.LLLLZIL;
    }

    public static final LinearLayout.LayoutParams LJIIJ(int i) {
        int iLIZ;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (i != 8 && i != 15 && i != 21) {
            iLIZ = C439101nJ.LIZ(16);
        } else {
            iLIZ = 0;
        }
        layoutParams.topMargin = iLIZ;
        return layoutParams;
    }

    public final void LJIIJJI(EnumC770260UJk enumC770260UJk) {
        if (this.LLLLLZIL.add(enumC770260UJk) && C770280UJm.LIZ[enumC770260UJk.ordinal()] == 1) {
            C19719912Dl c19719912DlLIZ = C781270Ukn.LJIJ().ZI2().LIZ();
            if ((c19719912DlLIZ instanceof C13IQ) && c19719912DlLIZ != null) {
                C0UKC.LIZ(c19719912DlLIZ, getBulltinEditContainerFromXml(), new C13IQ[]{C13LE.LIZ(PreviewBulletinEditVisibilityChannel.class)}, true);
            }
        }
    }

    public final void LJIILIIL(List<BottomContainerComponent> list) {
        boolean z;
        boolean z2;
        boolean z3;
        RoomCreateInfo roomCreateInfo;
        GoLiveECIconInfo goLiveECIconInfo;
        if (this.LLLLLLJ) {
            return;
        }
        this.LLLLLLJ = true;
        if (C753070TgP.LIZIZ(this.LLLIIL) == C0UFE.ON) {
            z = true;
        } else {
            z = false;
        }
        boolean zIsPrivateAccount = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount();
        DataChannel dataChannel = this.LLLIIL;
        if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null && (goLiveECIconInfo = roomCreateInfo.goLiveEcIconInfo) != null && goLiveECIconInfo.independentDisplayEcIcon) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = new ArrayList();
        for (BottomContainerComponent bottomContainerComponent : list) {
            int i = bottomContainerComponent.type;
            if (i != 11) {
                if (i != 15) {
                    if (i == 21) {
                        z3 = z2;
                    } else {
                        arrayList.add(bottomContainerComponent);
                    }
                } else {
                    z3 = z;
                }
                if (z3) {
                    arrayList.add(bottomContainerComponent);
                }
            } else if (!zIsPrivateAccount) {
                arrayList.add(bottomContainerComponent);
            }
        }
        C0UJW.LJFF(arrayList);
        DataChannel dataChannel2 = this.LLLIIL;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(PreviewBottomBubbleShowEvent.class);
        }
        if (!arrayList.isEmpty()) {
            List listLIZIZ = C0UJW.LIZIZ();
            if (listLIZIZ != null && arrayList.size() == listLIZIZ.size()) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((BottomContainerComponent) ListProtector.get(arrayList, i2)).type != ((BottomContainerComponent) ListProtector.get(listLIZIZ, i2)).type) {
                        C473410IhP.LIZJ(new ARunnableS81S0200000_12(arrayList, this, 92), 2000L);
                        break;
                    }
                }
            } else {
                C473410IhP.LIZJ(new ARunnableS81S0200000_12(arrayList, this, 92), 2000L);
                break;
            }
            C0UJW.LJ(arrayList);
        }
    }

    public final void LJIILL(boolean z) {
        if (z) {
            if (this.LLLLII.getVisibility() != 0) {
                C500260Jjc.LLFFF(this.LLLLII);
                C0UJY c0ujyLIZ = C770730ULf.LIZ(this.LLLIIL);
                if (c0ujyLIZ != null) {
                    c0ujyLIZ.showBottomTab();
                }
                DataChannel dataChannel = this.LLLIIL;
                if (dataChannel != null) {
                    dataChannel.zW(PreviewLiveModeIndicatorVisibilityChannel.class, Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLLLII.getVisibility() != 0) {
            return;
        }
        C500260Jjc.LJIILLIIL(this.LLLLII);
        C0UJY c0ujyLIZ2 = C770730ULf.LIZ(this.LLLIIL);
        if (c0ujyLIZ2 != null) {
            c0ujyLIZ2.hideBottomTab();
        }
        DataChannel dataChannel2 = this.LLLIIL;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.zW(PreviewLiveModeIndicatorVisibilityChannel.class, Boolean.FALSE);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Room room;
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_goal_update_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            C0U6C liveGoalEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
            boolean z = false;
            if (C1871910yoP.LIZIZ(interfaceC1107590evd, "isQuit", false)) {
                ((C0UFI) liveGoalEffectHelper).LJIILLIIL();
                return;
            }
            if (C1871910yoP.LIZLLL(interfaceC1107590evd, "live_goal_background_position", 0) == 0) {
                ((C0UFI) liveGoalEffectHelper).LJIIJJI();
            } else {
                C0UFI.LJJIFFI();
                C0UFI.LJJI();
            }
            DataChannel dataChannel = this.LLLIIL;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            }
            liveGoalEffectHelper.getClass();
            C0UFI.LJI(AFwS245S0000000_12.get$arr$(9), z);
            C0UFI.LJ = null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Boolean boolValueOf;
        if (motionEvent.getAction() == 0) {
            PreviewRevisionMoreWidget previewRevisionMoreWidget = (PreviewRevisionMoreWidget) C0UKC.LJFF(C13LE.LIZ(PreviewRevisionMoreWidget.class));
            if (previewRevisionMoreWidget != null) {
                boolValueOf = Boolean.valueOf(previewRevisionMoreWidget.H1(motionEvent.getY()));
            } else {
                boolValueOf = null;
            }
            this.LLLZIL = boolValueOf;
            this.LLLZI = motionEvent.getX();
            this.LLLZIIL = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            float fAbs = (float) Math.abs(motionEvent.getY() - this.LLLZIIL);
            if (fAbs > ((float) Math.abs(motionEvent.getX() - this.LLLZI)) && fAbs > 5.0f && Intrinsics.LJFF(this.LLLZIL, Boolean.TRUE)) {
                PreviewRevisionMoreWidget previewRevisionMoreWidget2 = (PreviewRevisionMoreWidget) C0UKC.LJFF(C13LE.LIZ(PreviewRevisionMoreWidget.class));
                if (previewRevisionMoreWidget2 != null) {
                    float y = motionEvent.getY();
                    float f = this.LLLZIIL;
                    if (y - f > 0.0f) {
                        z = true;
                    }
                    if (previewRevisionMoreWidget2.H1(f)) {
                        if (z) {
                            if (!previewRevisionMoreWidget2.LLILZ) {
                                previewRevisionMoreWidget2.onClick(null);
                            }
                        } else if (previewRevisionMoreWidget2.LLILZ) {
                            previewRevisionMoreWidget2.onClick(null);
                            return true;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void setBillboardOverlayContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJI = c20516015Pq;
    }

    public final void setBoardsDisplayViewWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJILJ = c20516015Pq;
    }

    public final void setBulltinEditContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJIJIL = c20516015Pq;
    }

    public final void setFilterStyleContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public final void setFirstEnterVideoMode(boolean z) {
        this.LLLLZ = z;
    }

    public final void setGestureMagicTipContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZLLLIL = c20516015Pq;
    }

    public final void setGoLiveLoadingViewFromXml(C0UKT c0ukt) {
        this.LLJILLL = c0ukt;
    }

    public final void setLiveBoardTipWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJIL = c20516015Pq;
    }

    public final void setLiveEventStickerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZIL = c20516015Pq;
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
        InterfaceC767150U7l<? extends LiveEffect> interfaceC767150U7l = this.LLLJ;
        if (interfaceC767150U7l != null) {
            interfaceC767150U7l.LIZJ(i);
        }
        C768460UCm.LJFF();
        C767120U7i.LIZJ("VideoModeContainer#setLiveFilterPos", false);
        C768460UCm.LJFF();
        C767120U7i.LJI(this.LLLIIL, "VideoModeContainer#setLiveFilterPos", false, false);
        C768460UCm.LJFF();
        C767120U7i.LIZ("VideoModeContainer#setLiveFilterPos");
    }

    public final void setLiveGoalEffectContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setLivePreviewBridge(C0UKH c0ukh) {
        this.LLLLLILLIL = c0ukh;
    }

    public final void setLoadPracticeCapsule(boolean z) {
        this.LLLLJI = z;
    }

    public final void setStartLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLF = c20516015Pq;
    }

    public final void setStickerContainerFromXml(FrameLayout frameLayout) {
        this.LLILZLL = frameLayout;
    }

    public final void setSurfaceViewController(InterfaceC770380UJw interfaceC770380UJw) {
        this.LLLLJ = interfaceC770380UJw;
    }

    public final void setVideoSelect(boolean z) {
        this.LLLLZI = z;
    }

    public final void setZoomStatus(boolean z) {
        this.LLLLZIL = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0475  */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0UJG] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0UJl] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0UJ4] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.0UJq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C770190UJd(int r16, androidx.fragment.app.Fragment r17) {
        /*
            Method dump skipped, instruction units count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770190UJd.<init>(int, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Set LJIIL(int r3, int r4) {
        /*
            r0 = 3
            X.13IQ[] r2 = new X.C13IQ[r0]
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel> r0 = com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel.class
            X.12Dl r1 = X.C13LE.LIZ(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel> r0 = com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel.class
            X.12Dl r1 = X.C13LE.LIZ(r0)
            r0 = 1
            r2[r0] = r1
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel.class
            X.12Dl r1 = X.C13LE.LIZ(r0)
            r0 = 2
            r2[r0] = r1
            java.util.Set r1 = X.C093Y.LJ(r2)
            r0 = 8
            if (r4 == r0) goto L49
            r0 = 12
            if (r4 == r0) goto L3f
            r0 = 15
            if (r4 == r0) goto L49
            r0 = 21
            if (r4 == r0) goto L49
        L32:
            r0 = 4
            if (r3 <= r0) goto L3e
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            r1.add(r0)
        L3e:
            return r1
        L3f:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            r1.add(r0)
            goto L32
        L49:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            r1.add(r0)
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            r1.add(r0)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770190UJd.LJIIL(int, int):java.util.Set");
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(X.C770190UJd r15, java.util.List r16, java.lang.String r17, int r18) {
        /*
            Method dump skipped, instruction units count: 1996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770190UJd.LJII(X.0UJd, java.util.List, java.lang.String, int):void");
    }
}
