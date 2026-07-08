package X;

import Y.ACListenerS118S0200000_15;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS20S1100000_15;
import Y.AfS184S0100000_15;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.KaraokeModeStatusChannel;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.api.RequestSettingSuccessEvent;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestKaraokePlayerChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperPlayOrderUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestOpenAvatarPreviewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForMaskEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.TriggerListChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayMaskEffectUpdateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMockNetworkTipsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRemoveDividingLineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevertFollowButton;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWavePrivilegeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWaveScaleFactorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestLiveShowTransitionDurationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS133S0110000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.0aYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939710aYr extends C939720aYs implements InterfaceC491601vm, C1AXB, InterfaceC932640aNS {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIL;
    public static final int LLLLIILL;
    public EnumC918970a1P LL;
    public final Long LLILLJJLI;
    public final InterfaceC940580aaG LLILLL;
    public C1324720kZq LLILZ;
    public View LLILZIL;
    public C1324720kZq LLILZLL;
    public C941390abZ LLIZ;
    public LiveIconView LLIZLLLIL;
    public ConstraintLayout LLJ;
    public C20743416Fc LLJI;
    public C1126540fQC LLJIJIL;
    public C1105630esT LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public C1324720kZq LLJJ;
    public C1126540fQC LLJJI;
    public View LLJJIII;
    public Long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public User LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public C940640aaM LLJLLIL;
    public C940640aaM LLJLLL;
    public C932420aN6 LLJZ;
    public C940600aaI LLJZIJLIL;
    public final C11NJ LLL;
    public final C304201Fw LLLF;
    public int LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public View LLLII;
    public View LLLIIII;
    public C421310GfZ LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public C2182701Abc LLLIILIL;
    public final C940110aZV LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public Long LLLILZLLLI;
    public View LLLIZZ;
    public LiveIconView LLLJ;
    public LiveData<C936030aSv> LLLJIL;
    public C19487111Lx LLLJL;
    public boolean LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C939710aYr.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLIILL = C439101nJ.LIZ(18);
    }

    @Override // X.InterfaceC491601vm
    public final void LJII() {
        this.LLJLLL = null;
        ViewGroup liveShowOrderContainer = getLiveShowOrderContainer();
        if (liveShowOrderContainer != null) {
            C439101nJ.LJI(liveShowOrderContainer);
        }
        LJJIFFI();
    }

    @Override // X.InterfaceC491601vm
    public final void LJIIJJI() {
        this.LLJLLIL = null;
        ViewGroup liveShowOrderContainer = getLiveShowOrderContainer();
        if (liveShowOrderContainer != null) {
            C439101nJ.LJI(liveShowOrderContainer);
        }
        LJJIFFI();
    }

    public final void LJJJJI() {
        int i;
        int i2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        if (C917890Zzf.LIZ(false)) {
            i = getWindow().LJJIIJ().getLayoutParams().width;
            i2 = getWindow().LJJIIJ().getLayoutParams().height;
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            List<InterfaceC937840aVq> allLayoutWindows = (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null) ? null : interfaceC937820aVoLJJJJZ.getAllLayoutWindows();
            InterfaceC937840aVq window = getWindow();
            int width = getWindow().LJJIIJ().getWidth() * getWindow().LJJIIJ().getHeight();
            if (allLayoutWindows != null) {
                for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
                    int width2 = interfaceC937840aVq.LJJIIJ().getWidth() * interfaceC937840aVq.LJJIIJ().getHeight();
                    if (width2 <= 0) {
                        width2 = Integer.MAX_VALUE;
                    }
                    if (width2 < width) {
                        window = interfaceC937840aVq;
                        width = width2;
                    }
                }
            }
            i = window.LJJIIJ().getLayoutParams().width;
            i2 = window.LJJIIJ().getLayoutParams().height;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User user = this.LLJJJ;
        C930480aJy.LJJIJLIJ(c930480aJy, user != null ? Long.valueOf(user.getId()) : null, getMDataChannel(), i, i2, getOnlinePlayerAvatarFromXml(), false, null, 224);
        LJJJJIZL();
    }

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.C939720aYs, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLJJJIL = false;
        this.LLJJJJ = false;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        super.onDetachedFromWindow();
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.zQ2(this);
        }
        this.LLL.LJ();
        if (this.LLJJL) {
            getTalkVolumeWaveHandler().LIZLLL = true;
        }
        getTalkVolumeWaveHandler().LJI();
        this.LLILLL.LJ(getRoundCornerBgView(), this);
        this.LLLII = null;
        C2182701Abc c2182701Abc = this.LLLIILIL;
        if (c2182701Abc != null) {
            c2182701Abc.LIZJ();
        }
        C940110aZV c940110aZV = this.LLLIL;
        if (c940110aZV != null) {
            c940110aZV.LIZLLL();
        }
        LiveData<C936030aSv> liveData = this.LLLJIL;
        if (liveData != null) {
            liveData.removeObserver(getGeneratingProgressObserver());
        }
        Long l = this.LLLILZLLLI;
        if (l != null) {
            l.longValue();
            getMDataHolder().LJFF().LIZ(0L, getLinkMicId());
        }
        this.LLJZIJLIL = null;
        getNetworkNicknameContainerFromXml().removeOnLayoutChangeListener(getLayoutChangeListener());
    }

    private final C987140bnM getAvatarImageLoadListener() {
        return (C987140bnM) this.LLLIIIL.getValue();
    }

    private final Observer<C936030aSv> getGeneratingProgressObserver() {
        return (Observer) this.LLLLII.getValue();
    }

    private final View.OnLayoutChangeListener getLayoutChangeListener() {
        return (View.OnLayoutChangeListener) this.LLLLIIIILLL.getValue();
    }

    private final Animator getPauseAlphaInAnimation() {
        return (Animator) this.LLLFZ.getValue();
    }

    private final Animator getPauseAlphaOutAnimation() {
        return (Animator) this.LLLI.getValue();
    }

    private final C987140bnM getPrepareAvatarImageLoadListener() {
        return (C987140bnM) this.LLLIIL.getValue();
    }

    private final C941290abP getTalkVolumeWaveHandler() {
        return (C941290abP) this.LLLFFI.getValue();
    }

    private final InterfaceC927510aFB getZoomService() {
        C304201Fw c304201Fw = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIIL;
        return (InterfaceC927510aFB) c304201Fw.LIZ();
    }

    @Override // X.InterfaceC491601vm
    public final void LJI() {
        C932420aN6 c932420aN6 = this.LLJZ;
        if (c932420aN6 != null) {
            c932420aN6.dismiss();
        }
        C20441214yg.LIZIZ("onRemoveFromWindow", "onRemoveFromWindow");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL() {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939710aYr.LJJJJL():void");
    }

    @Override // X.InterfaceC932640aNS
    public final boolean a0() {
        C940110aZV c940110aZV = this.LLLIL;
        if (c940110aZV == null) {
            return true;
        }
        long j = c940110aZV.LIZJ;
        return (j == 0 || j == 3) ? false : true;
    }

    public final List<View> getBottomViewsSortedByPriority() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getNetworkStateImageView());
        arrayList.add(getOnlinePlayerMuteFromXml());
        ViewGroup liveShowOrderContainer = getLiveShowOrderContainer();
        if (liveShowOrderContainer != null) {
            arrayList.add(liveShowOrderContainer);
        }
        return arrayList;
    }

    public final View getFollowButtonDelegateFromXml() {
        View view = this.LLJJIII;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.ied);
        this.LLJJIII = viewFindViewById;
        return viewFindViewById;
    }

    @Override // X.InterfaceC932640aNS
    public long getFollowStatus() {
        C940110aZV c940110aZV = this.LLLIL;
        if (c940110aZV != null) {
            return c940110aZV.LIZJ;
        }
        return -1L;
    }

    public final C1126540fQC getFollowStatusV1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ife);
            this.LLJJI = (C1126540fQC) callbackFindViewById;
        }
        return (C1126540fQC) callbackFindViewById;
    }

    public final View getGuestVoiceVolumeBorderFromXml() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.jai);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getLayoutTicketFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mgt);
            this.LLJILLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final MultiGuestDataHolder getMDataHolder() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    public final ConstraintLayout getNetworkNicknameContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p55);
            this.LLJILJILJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getNickNameFollowStatusContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p96);
            this.LLJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C20743416Fc getNickNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p94);
            this.LLJI = (C20743416Fc) callbackFindViewById;
        }
        return (C20743416Fc) callbackFindViewById;
    }

    public final C1324720kZq getOnlinePlayerAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn1);
            this.LLILZLL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final LiveIconView getOnlinePlayerMuteFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn2);
            this.LLIZLLLIL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C1324720kZq getOnlinePlayerMuteVideoBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn4);
            this.LLJJ = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C1105630esT getOnlineTicketFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn8);
            this.LLJILJIL = (C1105630esT) callbackFindViewById;
        }
        return (C1105630esT) callbackFindViewById;
    }

    public final C1126540fQC getOnlineTicketIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pn_);
            this.LLJIJIL = (C1126540fQC) callbackFindViewById;
        }
        return (C1126540fQC) callbackFindViewById;
    }

    public final C1324720kZq getOnlineVoiceEffectFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pnc);
            this.LLILZ = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final View getRoundCornerBgView() {
        View view = this.LLLII;
        if (view == null) {
            view = new View(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLLII = view;
        return view;
    }

    @Override // X.C1AXB
    public Long getUid() {
        User user = this.LLJJJ;
        if (user != null) {
            return Long.valueOf(user.getId());
        }
        return null;
    }

    public final C941390abZ getVoiceWaveView() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.voice_wave_with_dress);
            this.LLIZ = (C941390abZ) callbackFindViewById;
        }
        return (C941390abZ) callbackFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C939720aYs
    public final void onSingleTapConfirm() {
        LiveMode liveMode;
        User user;
        LiveMode liveMode2;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJ()) {
            return;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (C930480aJy.LJIJI(UserService.getInstance().user().LJIJJLI())) {
            DataChannel mDataChannel = getMDataChannel();
            if (mDataChannel == null || (liveMode2 = (LiveMode) mDataChannel.gg0(LiveModeChannel.class)) == null || C781520UlC.LJ(liveMode2) || !C918090Zzz.LIZ()) {
                super.onSingleTapConfirm();
            } else {
                LJIIZILJ(false);
            }
        } else {
            DataChannel mDataChannel2 = getMDataChannel();
            if (mDataChannel2 == null || (liveMode = (LiveMode) mDataChannel2.gg0(LiveModeChannel.class)) == null || C781520UlC.LJ(liveMode) || !C930480aJy.LJIIIIZZ() || !((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).py0() || !C918090Zzz.LIZIZ() || ((user = this.LLJJJ) != null && user.getId() == UserService.getInstance().user().getCurrentUserId())) {
                User user2 = this.LLJJJ;
                if (user2 == null || user2.getId() != UserService.getInstance().user().getCurrentUserId()) {
                    C939720aYs.invokeSendGiftPanel$default(this, null, 1, null);
                } else if (C930540aK4.LJJJIL()) {
                    LJIIZILJ(true);
                } else {
                    DataChannel mDataChannel3 = getMDataChannel();
                    if (mDataChannel3 != null) {
                        mDataChannel3.LC0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C924030a9Z(null, "selfie_window", "link_management_panel"));
                    }
                }
            } else {
                User user3 = this.LLJJJ;
                C932420aN6 c932420aN6 = user3 != null ? new C932420aN6(getContext(), (InterfaceC932640aNS) this, user3, getInteractId(), getMDataChannel(), (String) (objArr2 == true ? 1 : 0), (C932100aMa) (objArr == true ? 1 : 0), 224) : null;
                this.LLJZ = c932420aN6;
                if (c932420aN6 != null) {
                    c932420aN6.LJJLIIIJILLIZJL(this);
                }
            }
        }
        User user4 = this.LLJJJ;
        C0JGU.LIZ(user4 != null ? Long.valueOf(user4.getId()) : null);
    }

    private final C1126540fQC getFollowButton() {
        return getFollowStatusV1FromXml();
    }

    private final View getFollowButtonDelegate() {
        return getFollowButtonDelegateFromXml();
    }

    private final C1126540fQC getPauseImageView() {
        return getPauseImageView$liveinteract_impl_release();
    }

    private final C16F5 getPauseMainText() {
        return getPauseMainText$liveinteract_impl_release();
    }

    private final C16F5 getPauseSecondText() {
        return getPauseSecondText$liveinteract_impl_release();
    }

    @Override // X.InterfaceC938040aWA
    public final String LJIIIIZZ() {
        return getInteractId();
    }

    @Override // X.InterfaceC491601vm
    public final void LJIILJJIL() {
        setMNeedPrepareLoading((isAnchor() || !isSelf$liveinteract_impl_release()) && !getHasLoadingFinished$liveinteract_impl_release());
    }

    @Override // X.InterfaceC491601vm
    public final void LJIILL() {
        C945640aiQ countDownLayout = getCountDownLayout();
        if (countDownLayout != null) {
            C439101nJ.LJI(countDownLayout);
        }
        setShouldShowCountDownLayoutWhenResume(false);
        C945640aiQ countDownLayout2 = getCountDownLayout();
        if (countDownLayout2 != null) {
            countDownLayout2.LIZLLL();
        }
        LJJJJZ();
    }

    @Override // X.InterfaceC491601vm
    public final void LJIJJ() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("CornerBugLocate", "onLayoutSwitched");
        this.LLILLL.LIZIZ(getRoundCornerBgView(), this);
    }

    public final void LJJI() {
        C1126540fQC followButton = getFollowButton();
        if (followButton != null) {
            C439101nJ.LJI(followButton);
            View followButtonDelegate = getFollowButtonDelegate();
            if (followButtonDelegate != null) {
                C439101nJ.LJI(followButtonDelegate);
            }
            View followButtonDelegate2 = getFollowButtonDelegate();
            if (followButtonDelegate2 != null) {
                followButtonDelegate2.setEnabled(false);
            }
        }
    }

    public final void LJJIFFI() {
        C1088120eQE timeCountdownView;
        C1106010et5 timeCircleView = getTimeCircleView();
        if ((timeCircleView == null || timeCircleView.getVisibility() != 0) && ((timeCountdownView = getTimeCountdownView()) == null || timeCountdownView.getVisibility() != 0)) {
            return;
        }
        C1106010et5 timeCircleView2 = getTimeCircleView();
        if (timeCircleView2 != null) {
            C439101nJ.LJI(timeCircleView2);
        }
        C1088120eQE timeCountdownView2 = getTimeCountdownView();
        if (timeCountdownView2 != null) {
            C439101nJ.LJI(timeCountdownView2);
        }
    }

    public final void LJJIJIIJIL() {
        C19ME c19me;
        C19ME c19me2;
        ConstraintLayout networkNicknameContainerFromXml = getNetworkNicknameContainerFromXml();
        ViewGroup.LayoutParams layoutParams = networkNicknameContainerFromXml != null ? networkNicknameContainerFromXml.getLayoutParams() : null;
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return;
        }
        c19me.startToStart = 0;
        c19me.topToTop = -1;
        c19me.endToEnd = 0;
        c19me.bottomToTop = -1;
        c19me.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C497740JfY.LIZIZ(4.0f);
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
        c19me.bottomToTop = -1;
        c19me.setMarginStart((int) C497740JfY.LIZIZ(4.0f));
        c19me.horizontalChainStyle = 1;
        c19me.horizontalBias = 0.0f;
        LiveIconView onlinePlayerMuteFromXml = getOnlinePlayerMuteFromXml();
        c19me.setMarginEnd((int) ((onlinePlayerMuteFromXml == null || onlinePlayerMuteFromXml.getVisibility() != 0) ? C497740JfY.LIZIZ(4.0f) : C497740JfY.LIZIZ(20.0f)));
        ConstraintLayout networkNicknameContainerFromXml2 = getNetworkNicknameContainerFromXml();
        if (networkNicknameContainerFromXml2 != null) {
            C786410Ut5.m6(networkNicknameContainerFromXml2, c19me);
        }
        ConstraintLayout layoutTicketFromXml = getLayoutTicketFromXml();
        ViewGroup.LayoutParams layoutParams2 = layoutTicketFromXml != null ? layoutTicketFromXml.getLayoutParams() : null;
        if (!(layoutParams2 instanceof C19ME) || (c19me2 = (C19ME) layoutParams2) == null) {
            return;
        }
        c19me2.startToStart = 0;
        c19me2.topToTop = 0;
        c19me2.topToBottom = -1;
        ((ViewGroup.MarginLayoutParams) c19me2).topMargin = 0;
        c19me2.bottomToBottom = -1;
        c19me2.startToEnd = -1;
        ConstraintLayout layoutTicketFromXml2 = getLayoutTicketFromXml();
        if (layoutTicketFromXml2 != null) {
            C786410Ut5.m6(layoutTicketFromXml2, c19me2);
        }
    }

    public final boolean LJJIL() {
        C945640aiQ countDownLayout = getCountDownLayout();
        if (countDownLayout != null) {
            ViewGroup viewGroup = countDownLayout.LLILZ;
            boolValueOf = Boolean.valueOf(C500260Jjc.LJJJI(viewGroup != null ? Boolean.valueOf(C500260Jjc.LJJJJIZL(viewGroup)) : null));
        }
        return C500260Jjc.LJJIJIIJIL(boolValueOf);
    }

    public final void LJJIZ() {
        User user;
        if (MultiGuestRevertFollowButton.enable()) {
            C1126540fQC followButton = getFollowButton();
            if (followButton != null) {
                C439101nJ.LJI(followButton);
            }
            View followButtonDelegate = getFollowButtonDelegate();
            if (followButtonDelegate != null) {
                C439101nJ.LJI(followButtonDelegate);
            }
            View followButtonDelegate2 = getFollowButtonDelegate();
            if (followButtonDelegate2 != null) {
                followButtonDelegate2.setEnabled(false);
                return;
            }
            return;
        }
        C1126540fQC followButton2 = getFollowButton();
        if (followButton2 != null) {
            if (!C500260Jjc.LJJJJIZL(followButton2) && (user = this.LLJJJ) != null) {
                C0JGT.LIZJ(user.getId());
            }
            followButton2.setActualImageResource(R.drawable.f0q);
            C12ES.LJIILL(0, followButton2);
            View followButtonDelegate3 = getFollowButtonDelegate();
            if (followButtonDelegate3 != null) {
                C12ES.LJIILL(0, followButtonDelegate3);
            }
            View followButtonDelegate4 = getFollowButtonDelegate();
            if (followButtonDelegate4 != null) {
                followButtonDelegate4.setEnabled(true);
            }
            View followButtonDelegate5 = getFollowButtonDelegate();
            if (followButtonDelegate5 != null) {
                C500260Jjc.LJLIIIL(500L, followButtonDelegate5, new AwS594S0100000_15(this, 1201));
            }
        }
    }

    public final void LJJJJIZL() {
        C01IZ c01iz;
        if (!LJJIII(getInteractId()) || !C500260Jjc.LJJJJIZL(getOnlinePlayerAvatarFromXml())) {
            C421310GfZ c421310GfZ = this.LLLIIIIL;
            if (c421310GfZ != null) {
                C930540aK4.LJJIJL(c421310GfZ);
                return;
            }
            return;
        }
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel == null || (c01iz = (C01IZ) mDataChannel.gg0(PlayMaskEffectUpdateChannel.class)) == null) {
            return;
        }
        if (c01iz.LIZ != 1) {
            C421310GfZ c421310GfZ2 = this.LLLIIIIL;
            if (c421310GfZ2 != null) {
                C930540aK4.LJJIJL(c421310GfZ2);
                return;
            }
            return;
        }
        InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
        if (interfaceC927690aFTLIZ != null) {
            interfaceC927690aFTLIZ.LIZIZ(getUid(), new AwS629S0100000_15(this, 102));
        } else {
            LJJJJJ(this, false, null);
        }
    }

    public final void LJJJJLI() {
        float fLIZIZ;
        ViewGroup.LayoutParams layoutParams = getWindow().LJJIIJ().getLayoutParams();
        int i = 0;
        int i2 = layoutParams != null ? layoutParams.height : 0;
        InterfaceC927510aFB zoomService = getZoomService();
        if (Intrinsics.LJFF(zoomService != null ? zoomService.LJIILIIL() : null, getInteractId())) {
            if (C2104308Mf.LIZJ()) {
                fLIZIZ = C497740JfY.LIZIZ(240.0f);
            } else {
                EnumC918970a1P enumC918970a1P = this.LL;
                if (enumC918970a1P == EnumC918970a1P.FLOATING || enumC918970a1P == EnumC918970a1P.FLOATING_FIX) {
                    fLIZIZ = C497740JfY.LIZIZ(220.0f);
                }
            }
            i = (int) fLIZIZ;
        }
        int i3 = i2 - i;
        ConstraintLayout pauseContainer = getPauseContainer();
        if (pauseContainer != null) {
            C500260Jjc.LJJLJ(i, pauseContainer);
        }
        C941020aay.LIZ(i3, getPauseImageView(), getPauseMainText(), getPauseSecondText());
    }

    public final void LJJJJZ() {
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        C19ME c19me2;
        initCountDownLayout();
        if (!LJJIL()) {
            View fanTicketContainer = getFanTicketContainer();
            if (fanTicketContainer != null) {
                C439101nJ.LJI(fanTicketContainer);
            }
            C945640aiQ countDownLayout = getCountDownLayout();
            layoutParams = countDownLayout != null ? countDownLayout.getLayoutParams() : null;
            if (!(layoutParams instanceof C19ME) || (c19me2 = (C19ME) layoutParams) == null) {
                return;
            }
            if (C916800Zxu.LIZIZ(getLinkMicId(), false)) {
                c19me2.startToEnd = R.id.mgt;
                c19me2.topToTop = R.id.mgt;
                c19me2.startToStart = -1;
                c19me2.topToBottom = -1;
                ((ViewGroup.MarginLayoutParams) c19me2).topMargin = 0;
            } else {
                c19me2.startToEnd = -1;
                c19me2.topToTop = -1;
                c19me2.startToStart = 0;
                c19me2.topToBottom = R.id.mgt;
                ((ViewGroup.MarginLayoutParams) c19me2).topMargin = 0;
            }
            C945640aiQ countDownLayout2 = getCountDownLayout();
            if (countDownLayout2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(countDownLayout2);
                countDownLayout2.setLayoutParams(c19me2);
                return;
            }
            return;
        }
        View fanTicketContainer2 = getFanTicketContainer();
        if (fanTicketContainer2 != null) {
            C12ES.LJIILL(0, fanTicketContainer2);
        }
        ViewGroup.LayoutParams layoutParams2 = getWindow().LJJIIJ().getLayoutParams();
        int i = layoutParams2 != null ? layoutParams2.width : 0;
        C945640aiQ countDownLayout3 = getCountDownLayout();
        layoutParams = countDownLayout3 != null ? countDownLayout3.getLayoutParams() : null;
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return;
        }
        if (i >= C497740JfY.LIZIZ(88)) {
            c19me.startToEnd = R.id.mgt;
            c19me.topToTop = R.id.mgt;
            c19me.startToStart = -1;
            c19me.topToBottom = -1;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) C497740JfY.LIZIZ(3.0f);
        } else {
            c19me.startToEnd = -1;
            c19me.topToTop = -1;
            c19me.startToStart = 0;
            c19me.topToBottom = R.id.f01;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
        }
        C945640aiQ countDownLayout4 = getCountDownLayout();
        if (countDownLayout4 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(countDownLayout4);
            countDownLayout4.setLayoutParams(c19me);
        }
    }

    public final void LJJJJZI() {
        ViewParent parent;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ2;
        LJJJJL();
        LJJJJI();
        LJJJLL();
        LJJJJLI();
        LJIIIZ(getMDataHolder().LJIIIZ(getInteractId()));
        LJFF("updateUiLayoutParams");
        this.LLILLL.LIZJ(getWindow().getCornerRadius());
        this.LLILLL.LIZIZ(getRoundCornerBgView(), this);
        if (C939550aYb.LIZJ()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getWindow().LJJIIJ().getLayoutParams();
            Rect rect = new Rect();
            int i = marginLayoutParams.leftMargin;
            rect.left = i;
            int i2 = marginLayoutParams.topMargin;
            rect.top = i2;
            rect.right = i + marginLayoutParams.width;
            rect.bottom = i2 + marginLayoutParams.height;
            InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
            Boolean boolValueOf = null;
            Rect containerActualRange = (interfaceC937900aVwLJIIIIZZ == null || (interfaceC937820aVoLJJJJZ2 = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) == null) ? null : interfaceC937820aVoLJJJJZ2.getContainerActualRange();
            InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ2 = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
            if (interfaceC937900aVwLJIIIIZZ2 != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ2.LJJJJZ()) != null) {
                boolValueOf = Boolean.valueOf(interfaceC937820aVoLJJJJZ.LJZI());
            }
            boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
            View view = this.LLLIIII;
            if (view != null) {
                C786410Ut5.W5(view, C939550aYb.LIZ(getContext(), rect, containerActualRange, zLJJJI));
            }
            View view2 = this.LLLIIII;
            if (view2 != null) {
                view2.bringToFront();
            }
            View view3 = this.LLLIIII;
            if (view3 != null && (parent = view3.getParent()) != null) {
                parent.requestLayout();
            }
            View view4 = this.LLLIIII;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void LJJJLIIL() {
        boolean zLJJIII = LJJIII(getInteractId());
        LJJJJ("updateVideoAndAudioStatus", !zLJJIII);
        LJJJIL(!(getMDataHolder().LIZLLL(getInteractId()) != null ? r0.booleanValue() : false), this.LLJLILLLLZIIL);
        C783270Uo1.LIZLLL(new ARunnableS115S0100000_15(new AwS133S0110000_15(this, zLJJIII, 13), 213));
    }

    public final void LJJJLL() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C1324720kZq onlinePlayerAvatarFromXml = getOnlinePlayerAvatarFromXml();
        int iLIZ = (onlinePlayerAvatarFromXml == null || (layoutParams2 = onlinePlayerAvatarFromXml.getLayoutParams()) == null) ? C439101nJ.LIZ(60) : layoutParams2.width;
        DisplayMetrics displayMetrics = C497740JfY.LIZIZ;
        LJJIJIL(getOnlineVoiceEffectFromXml(), (iLIZ * 1.6f) / displayMetrics.density);
        if (MultiGuestVoiceWavePrivilegeSetting.INSTANCE.enable()) {
            C1324720kZq onlinePlayerAvatarFromXml2 = getOnlinePlayerAvatarFromXml();
            LJJIJIL(getVoiceWaveView(), (((onlinePlayerAvatarFromXml2 == null || (layoutParams = onlinePlayerAvatarFromXml2.getLayoutParams()) == null) ? C439101nJ.LIZ(60) : layoutParams.width) * MultiGuestVoiceWaveScaleFactorSetting.INSTANCE.getValue()) / displayMetrics.density);
        }
    }

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return getMDataHolder().LIZLLL(getInteractId());
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return getInteractId();
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        return Integer.valueOf(getWindow().LJIILL());
    }

    public final ConstraintLayout getPauseContainer() {
        return getPauseContainer$liveinteract_impl_release();
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        return Integer.valueOf(getWindow().LJIIIIZZ());
    }

    @Override // X.InterfaceC938040aWA
    public Long getUserId() {
        Long uid;
        return (getUid() == null || (uid = getUid()) == null || uid.longValue() <= 0) ? this.LLILLJJLI : getUid();
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return getMDataHolder().LJIILLIIL(getInteractId());
    }

    @Override // X.C1AXB
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.C1AXB
    public int getX() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getLeft();
    }

    @Override // android.view.View, X.C1AXB
    public int getY() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getTop();
    }

    @Override // X.C939720aYs
    public final void initView() {
        super.initView();
        if (isAnchor()) {
            C1324720kZq prepareAvatarBackground$liveinteract_impl_release = getPrepareAvatarBackground$liveinteract_impl_release();
            if (prepareAvatarBackground$liveinteract_impl_release != null) {
                C786410Ut5.LLJJIII(prepareAvatarBackground$liveinteract_impl_release, 0);
            }
        } else {
            C1324720kZq prepareAvatarBackground$liveinteract_impl_release2 = getPrepareAvatarBackground$liveinteract_impl_release();
            if (prepareAvatarBackground$liveinteract_impl_release2 != null) {
                C786410Ut5.LLJJIII(prepareAvatarBackground$liveinteract_impl_release2, 8);
            }
        }
        LJJJJZI();
    }

    @Override // X.C939720aYs, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C19ME c19me;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        DataChannel mDataChannel;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IAvatarBusinessAbility iAvatarBusinessAbility;
        MutableLiveData mutableLiveDataHr2;
        C080500Rv c080500RvLIZ;
        C11PQ<SoundWareEffectExtra> c11pq;
        super.onAttachedToWindow();
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow, radius=");
        sbLIZ.append(getWindow().getCornerRadius());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("CornerBugLocate", strLIZIZ);
        DataChannel mDataChannel2 = getMDataChannel();
        if (mDataChannel2 != null) {
            mDataChannel2.DQ2(MultiGuestKaraokePlayerChangeChannel.class, this, new AwS381S0200000_15(this, mDataChannel2, 193));
            mDataChannel2.CQ2(KaraokeModeStatusChannel.class, this, new AwS594S0100000_15(this, 1193));
            mDataChannel2.CQ2(PlayMaskEffectUpdateChannel.class, this, new AwS594S0100000_15(this, 1194));
            if (isSelf$liveinteract_impl_release()) {
                mDataChannel2.CQ2(MultiLiveGuestMuteAudioEvent.class, this, new AwS594S0100000_15(this, 1195));
                mDataChannel2.CQ2(MultiLiveGuestMuteVideoEvent.class, this, new AwS594S0100000_15(this, 1196));
                mDataChannel2.DQ2(AigcWallpaperPlayOrderUpdateEvent.class, this, new AwS594S0100000_15(this, 1197));
                mDataChannel2.CQ2(MultiGuestOpenAvatarPreviewEvent.class, this, new AwS594S0100000_15(this, 1198));
            } else {
                mDataChannel2.CQ2(MultiLiveUserMediaEvent.class, this, new AwS594S0100000_15(this, 1199));
                mDataChannel2.CQ2(PlayerPauseLiveForMaskEvent.class, this, new AwS594S0100000_15(this, 1200));
                mDataChannel2.CQ2(RequestSettingSuccessEvent.class, this, new AwS594S0100000_15(this, 1190));
                this.LLL.LIZ(C433601mQ.LJ(new InterfaceC434201mW() { // from class: X.0aVX
                    @Override // X.InterfaceC434201mW
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC434201mW
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC434201mW
                    public final User LIZJ() {
                        return this.LIZ.LLJJJ;
                    }
                }));
            }
            mDataChannel2.CQ2(LinkReceiveEnlargeMessageEvent.class, this, new AwS594S0100000_15(this, 1191));
            mDataChannel2.CQ2(ZoomedPositionsUpdateEvent.class, this, new AwS594S0100000_15(this, 1192));
        }
        InterfaceC927740aFY interfaceC927740aFYLIZIZ = C00S0.LIZIZ();
        if (interfaceC927740aFYLIZIZ != null && (c080500RvLIZ = interfaceC927740aFYLIZIZ.LIZ(getLinkMicId())) != null && (c11pq = c080500RvLIZ.LIZ) != null) {
            this.LLL.LIZ(C937310aUz.LJI(new C11IW(c11pq.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 255))), "MultiGuestV3GuestMask", "addVoiceWaveEffectChangedListener").LJIILL().LJIIZILJ());
        }
        LJJJLIIL();
        int iLJIIJJI = getMDataHolder().LJIIJJI(getInteractId());
        if (iLJIIJJI != 0 && iLJIIJJI != 1 && iLJIIJJI == 2) {
            LJIJ("updatePausedStatus", true);
        }
        if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && getMDataHolder().LJIIIZ(getInteractId()) != -1) {
            LJIIIZ(getMDataHolder().LJIIIZ(getInteractId()));
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        this.LL = C927600aFK.LJII();
        LJJJJZI();
        DataChannel mDataChannel3 = getMDataChannel();
        if (mDataChannel3 != null) {
            mDataChannel3.LC0(TriggerListChangeEvent.class, 3);
        }
        C2182701Abc c2182701Abc = new C2182701Abc(getContext(), getWindow(), getMDataChannel());
        this.LLLIILIL = c2182701Abc;
        c2182701Abc.LIZ(this);
        C940110aZV c940110aZV = this.LLLIL;
        if (c940110aZV != null) {
            c940110aZV.LIZJ();
        }
        String layoutBusinessType = null;
        if (isSelf$liveinteract_impl_release() && C927560aFG.LIZ() && MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility() && (mDataChannel = getMDataChannel()) != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) mDataChannel.gg0(C956790b0P.class)) != null && (iAvatarBusinessAbility = (IAvatarBusinessAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IAvatarBusinessAbility.class, null)) != null && (mutableLiveDataHr2 = iAvatarBusinessAbility.Hr2()) != null) {
            this.LLLJIL = mutableLiveDataHr2;
            this.LLLL = true;
            mutableLiveDataHr2.observeForever(getGeneratingProgressObserver());
        }
        Long l = this.LLLILZLLLI;
        if (l != null) {
            getMDataHolder().LJFF().LIZ(l.longValue(), getLinkMicId());
        }
        if (C936720aU2.LIZIZ()) {
            C936720aU2.LIZLLL(getGuestVoiceVolumeBorderFromXml(), C20736316Cj.LIZIZ(R.attr.fxy, getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), getWindow().getCornerRadius());
        }
        LJJJJIZL();
        getNetworkNicknameContainerFromXml().addOnLayoutChangeListener(getLayoutChangeListener());
        if (C917910Zzh.LIZ(C930540aK4.LIZJ())) {
            ViewGroup.LayoutParams layoutParams = getNickNameFromXml().getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
                return;
            }
            InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
            if (interfaceC937900aVwLIZ != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLIZ.LJJJJZ()) != null) {
                layoutBusinessType = interfaceC937820aVoLJJJJZ.getLayoutBusinessType();
            }
            if (Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT.getBusinessType()) || Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT_FIX.getBusinessType()) || Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST.getBusinessType()) || Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.ZOOM_PANEL.getBusinessType())) {
                c19me.matchConstraintMinWidth = 0;
            } else {
                c19me.matchConstraintMinWidth = C439101nJ.LIZ(18);
            }
            C20743416Fc nickNameFromXml = getNickNameFromXml();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(nickNameFromXml);
            nickNameFromXml.setLayoutParams(c19me);
        }
    }

    @Override // X.InterfaceC491601vm, X.InterfaceC940700aaS
    public final Long LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC938040aWA
    public View getSoundWaveBorderV2() {
        return this.LLLIIII;
    }

    @Override // X.InterfaceC940700aaS
    public final void LIZIZ(boolean z) {
        C1126540fQC followButton;
        C1126540fQC followButton2;
        C1126540fQC followButton3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lastFollowStatus=");
        sbLIZ.append(this.LLJLIL);
        sbLIZ.append(", isFollowed=");
        sbLIZ.append(z);
        sbLIZ.append(", isFromMaskClicked=");
        sbLIZ.append(false);
        C20441214yg.LIZIZ("MultiGuestV3GuestMask", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJLIL == z) {
            return;
        }
        if (z) {
            C1126540fQC followButton4 = getFollowButton();
            if (followButton4 != null && followButton4.LJI() && (followButton3 = getFollowButton()) != null) {
                followButton3.LIZLLL();
            }
            C1126540fQC followButton5 = getFollowButton();
            if (followButton5 != null && !followButton5.LJI() && (followButton = getFollowButton()) != null && followButton.getVisibility() == 0 && (followButton2 = getFollowButton()) != null) {
                C1143920fsE c1143920fsE = new C1143920fsE();
                c1143920fsE.LIZ = followButton2;
                c1143920fsE.LJFF = true;
                c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1");
                c1143920fsE.LIZJ = "ttlive_user_info_follow_complete_1.webp";
                c1143920fsE.LJ = new C987290bnb(this, 6);
                C1143680frq.LJIIIIZZ(c1143920fsE);
            }
        } else {
            LJJIZ();
        }
        this.LLJLIL = z;
        C932420aN6 c932420aN6 = this.LLJZ;
        if (c932420aN6 != null) {
            c932420aN6.LJJLIIIJLJLI(null, z);
        }
        LJFF("onFollowStatusChange");
    }

    @Override // X.InterfaceC938040aWA
    public final void LIZLLL(long j) {
        C924580aAS c924580aASLJFF;
        if (!MultiGuestAvatarFeatureSetting.INSTANCE.hasSeeAbility()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AvatarStat] call mask switchGuestAvatar avatarId=");
        sbLIZ.append(j);
        sbLIZ.append(" lastAvatarId=");
        sbLIZ.append(this.LLLILZLLLI);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        Long l = this.LLLILZLLLI;
        if (l == null || l.longValue() != j) {
            this.LLLILZLLLI = Long.valueOf(j);
            MultiGuestDataHolder mDataHolder = getMDataHolder();
            if (mDataHolder != null && (c924580aASLJFF = mDataHolder.LJFF()) != null) {
                c924580aASLJFF.LIZ(j, getLinkMicId());
            }
            LJJIJLIJ(j);
        }
        boolean zLJJIII = LJJIII(getInteractId());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateAvatarState videoMute=");
        sbLIZ2.append(zLJJIII);
        LJJJJ(C2188811AlT.LIZIZ(sbLIZ2), !zLJJIII);
    }

    @Override // X.InterfaceC491601vm
    public final void LJ(C01E9 c01e9) {
        initCountDownLayout();
        C945640aiQ countDownLayout = getCountDownLayout();
        if (countDownLayout != null) {
            C12ES.LJIILL(0, countDownLayout);
        }
        setShouldShowCountDownLayoutWhenResume(true);
        C945640aiQ countDownLayout2 = getCountDownLayout();
        if (countDownLayout2 != null) {
            countDownLayout2.LJ(c01e9.LJFF, c01e9.LJ, c01e9.LIZLLL);
        }
        LJJJJZ();
    }

    public final void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestV3GuestMask", C2188811AlT.LIZIZ(sbLIZ));
        C930540aK4.LJJJ(this, new ARunnableS20S1100000_15(this, str, 6));
    }

    @Override // X.InterfaceC491601vm
    public final void LJIIIZ(int i) {
        EnumC920860a4S enumC920860a4SLIZ;
        int i2 = this.LLLFF;
        if (i2 == i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiGuestV3GuestMask_updateNetworkState return as networkState is the same as old ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        EnumC920860a4S enumC920860a4SLIZ2 = C920900a4W.LIZ(i2);
        this.LLLFF = i;
        LiveSdkMockNetworkTipsSetting liveSdkMockNetworkTipsSetting = LiveSdkMockNetworkTipsSetting.INSTANCE;
        if (liveSdkMockNetworkTipsSetting.isEnable()) {
            int state = liveSdkMockNetworkTipsSetting.getState();
            if (state == 1) {
                enumC920860a4SLIZ = EnumC920860a4S.BAD;
            } else if (state >= 2) {
                enumC920860a4SLIZ = EnumC920860a4S.VERY_BAD;
            } else {
                enumC920860a4SLIZ = C920900a4W.LIZ(i);
            }
        } else {
            enumC920860a4SLIZ = C920900a4W.LIZ(i);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MultiGuestV3GuestMask_updateNetworkState linkMicId:");
        sbLIZ2.append(getLinkMicId());
        sbLIZ2.append(" state = ");
        sbLIZ2.append(enumC920860a4SLIZ);
        C20441214yg.LIZIZ("NetworkStateTips", C2188811AlT.LIZIZ(sbLIZ2));
        C16FV networkStateImageView = getNetworkStateImageView();
        if (networkStateImageView != null) {
            int i3 = C920890a4V.LIZ[enumC920860a4SLIZ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    C439101nJ.LJI(networkStateImageView);
                } else {
                    if (getNickNameFromXml() == null || getNickNameFromXml().getWidth() >= ((int) C497740JfY.LIZIZ(18.0f))) {
                        C12ES.LJIILL(0, networkStateImageView);
                        if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                            networkStateImageView.setImageResource(R.drawable.f54);
                        } else {
                            networkStateImageView.setImageResource(R.drawable.ep7);
                        }
                    }
                    if (enumC920860a4SLIZ2 != enumC920860a4SLIZ) {
                        LJJIJIIJI(i);
                    }
                }
            } else {
                if (getNickNameFromXml() == null || getNickNameFromXml().getWidth() >= ((int) C497740JfY.LIZIZ(18.0f))) {
                    C12ES.LJIILL(0, networkStateImageView);
                    if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                        networkStateImageView.setImageResource(R.drawable.f53);
                    } else {
                        networkStateImageView.setImageResource(R.drawable.ep6);
                    }
                }
                if (enumC920860a4SLIZ2 != enumC920860a4SLIZ) {
                    LJJIJIIJI(i);
                }
            }
        }
        LJFF("updateNetworkState");
    }

    @Override // X.InterfaceC491601vm
    public final void LJIIJ(long j) {
        C01E9 c01e9LJIIJJI;
        initCountDownLayout();
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            c01e9LJIIJJI = interfaceC421301kRLIZIZ.LJIIJJI(getInteractId());
        } else {
            c01e9LJIIJJI = null;
        }
        C945640aiQ countDownLayout = getCountDownLayout();
        if (countDownLayout != null) {
            C12ES.LJIILL(0, countDownLayout);
        }
        setShouldShowCountDownLayoutWhenResume(true);
        C945640aiQ countDownLayout2 = getCountDownLayout();
        if (countDownLayout2 != null) {
            countDownLayout2.LJFF(j);
        }
        if (c01e9LJIIJJI != null && c01e9LJIIJJI.LIZLLL != 0) {
            LJ(c01e9LJIIJJI);
            C20441214yg.LIZIZ("MultiGuestV3GuestMask", "updateCountDownTime-> compensation fanTicket ui show");
        }
        LJJJJL();
        LJJJJZ();
    }

    @Override // X.InterfaceC491601vm
    public final void LJIILLIIL(InterfaceC937840aVq interfaceC937840aVq) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachToLinkMicWindow, radius=");
        sbLIZ.append(interfaceC937840aVq.getCornerRadius());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("CornerBugLocate", strLIZIZ);
        C930540aK4.LJJIJL(this);
        setWindow(interfaceC937840aVq);
        C786410Ut5.LJJJJIZL(interfaceC937840aVq.LJJIIJ());
        interfaceC937840aVq.LJJIIJ().addView(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // X.InterfaceC491601vm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(boolean r10) {
        /*
            r9 = this;
            r2 = r9
            if (r10 == 0) goto L30
            com.bytedance.android.live.base.model.user.User r3 = r2.LLJJJ
            if (r3 == 0) goto L4a
            android.content.Context r1 = r2.getContext()
            java.lang.String r4 = r2.getInteractId()
            com.bytedance.ies.sdk.datachannel.DataChannel r5 = r2.getMDataChannel()
            X.0aNJ r8 = X.EnumC932550aNJ.V3
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r2.getMDataChannel()
            boolean r0 = X.C930540aK4.LJI(r0)
            X.0aMa r7 = X.C932440aN8.LIZIZ(r0)
            X.0aN6 r0 = new X.0aN6
            java.lang.String r6 = "guest_control_popup_panel"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
        L28:
            r2.LLJZ = r0
            if (r0 == 0) goto L2f
            r0.LJJLIIIJILLIZJL(r2)
        L2f:
            return
        L30:
            com.bytedance.android.live.base.model.user.User r3 = r2.LLJJJ
            if (r3 == 0) goto L4a
            X.0aN6 r0 = new X.0aN6
            android.content.Context r1 = r2.getContext()
            java.lang.String r4 = r2.getInteractId()
            com.bytedance.ies.sdk.datachannel.DataChannel r5 = r2.getMDataChannel()
            r6 = 0
            r8 = 224(0xe0, float:3.14E-43)
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L28
        L4a:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939710aYr.LJIIZILJ(boolean):void");
    }

    @Override // X.InterfaceC938040aWA
    public final void LJIJJLI(int i) {
        boolean z;
        if (i != 4 && i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AudioState] call mask switchGuestAudio ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        LJJJIL(!z, this.LLJLILLLLZIIL);
    }

    public final View LJIL(boolean z) {
        View view = this.LLLIZZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.op6);
        if (viewFindViewById == null) {
            return null;
        }
        if (viewFindViewById instanceof ViewStub) {
            if (!z) {
                return null;
            }
            View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewFindViewById);
            LiveIconView liveIconView = (LiveIconView) viewLJLLLL.findViewById(R.id.op7);
            this.LLLJ = liveIconView;
            if (liveIconView != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exb, viewLJLLLL.getContext()));
                gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(3.0f));
                liveIconView.setBackground(gradientDrawable);
            }
            C238400w2 c238400w2 = new C238400w2();
            View viewFindViewById2 = viewLJLLLL.findViewById(R.id.op8);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new ACListenerS118S0200000_15(c238400w2, this, 78), viewFindViewById2);
            }
            this.LLLIZZ = viewLJLLLL;
        }
        return this.LLLIZZ;
    }

    public final boolean LJJ(boolean z) {
        if (getMCurrentUserIsLinkedGuest()) {
            int iLIZJ = getMDataHolder().LIZJ(getInteractId());
            if (iLIZJ != 4 && iLIZJ != 2 && iLIZJ != 3 && z) {
                return false;
            }
        } else if (getMDataHolder().LJ(getInteractId()) != 1 && z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIII(java.lang.String r4) {
        /*
            r3 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r3.getMDataHolder()
            java.lang.Boolean r0 = r0.LJIILLIIL(r4)
            if (r0 == 0) goto Lf
            boolean r0 = r0.booleanValue()
            return r0
        Lf:
            X.0aJy r1 = X.C930480aJy.LIZ
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            com.bytedance.android.live.base.model.user.User r0 = r0.LJIJJLI()
            r1.getClass()
            boolean r0 = X.C930480aJy.LJIJI(r0)
            r2 = 1
            if (r0 == 0) goto L51
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r1 = r1.LJIIIZ(r0)
            boolean r0 = r1 instanceof X.InterfaceC302401Fe
            if (r0 == 0) goto L70
            X.01Fe r1 = (X.InterfaceC302401Fe) r1
            if (r1 == 0) goto L70
            X.0aGn r0 = r1.LIZ()
            if (r0 == 0) goto L70
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C921170a4x.LJII(r0, r4)
            if (r0 == 0) goto L70
            int r1 = r0.mLinkType
        L45:
            r0 = 2
            if (r1 != r0) goto L70
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r3.getMDataHolder()
            r0.LJIJJLI(r4, r2)
            r0 = 1
            return r0
        L51:
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_GUEST_USER_MANAGER"
            java.lang.Object r1 = r1.LJIIIZ(r0)
            boolean r0 = r1 instanceof X.InterfaceC917640ZzG
            if (r0 == 0) goto L70
            X.0ZzG r1 = (X.InterfaceC917640ZzG) r1
            if (r1 == 0) goto L70
            X.0aGn r0 = r1.LIZ()
            if (r0 == 0) goto L70
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = X.C921170a4x.LJIIIIZZ(r0, r4)
            if (r0 == 0) goto L70
            int r1 = r0.linkType
            goto L45
        L70:
            boolean r0 = r3.isSelf$liveinteract_impl_release()
            if (r0 == 0) goto L7f
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r3.getMDataHolder()
            boolean r0 = r0.LJIIJ
            if (r0 != 0) goto L7f
            return r2
        L7f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939710aYr.LJJIII(java.lang.String):boolean");
    }

    public final void LJJIIJ(ImageModel imageModel) {
        if (!this.LLJJJIL) {
            C1324720kZq onlinePlayerAvatarFromXml = getOnlinePlayerAvatarFromXml();
            if (onlinePlayerAvatarFromXml != null && !C500260Jjc.LJJJJIZL(onlinePlayerAvatarFromXml)) {
                return;
            }
            this.LLJJJIL = true;
            if (imageModel == null) {
                this.LLJJJIL = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadAvatarForMute invoke: width:");
            sbLIZ.append(getOnlinePlayerAvatarFromXml().getWidth());
            sbLIZ.append(", height: ");
            sbLIZ.append(getOnlinePlayerAvatarFromXml().getHeight());
            C20441214yg.LIZIZ("MultiGuestV3GuestMask_image", C2188811AlT.LIZIZ(sbLIZ));
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                int width = getOnlinePlayerAvatarFromXml().getWidth();
                int height = getOnlinePlayerAvatarFromXml().getHeight();
                c1324610kZfLJIIIZ.LJ = width;
                c1324610kZfLJIIIZ.LJFF = height;
                c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJIIIZ.LJIIL = getAvatarImageLoadListener();
                c1324610kZfLJIIIZ.LJJI(getOnlinePlayerAvatarFromXml());
                return;
            }
            C0JSS.LJIIIIZZ(getOnlinePlayerAvatarFromXml(), imageModel, getOnlinePlayerAvatarFromXml().getWidth(), getOnlinePlayerAvatarFromXml().getHeight(), R.drawable.el_, getAvatarImageLoadListener());
        }
    }

    public final void LJJIIZ(ImageModel imageModel) {
        int width;
        int width2;
        if (!C930540aK4.LIZJ()) {
            return;
        }
        C1324720kZq prepareAvatar$liveinteract_impl_release = getPrepareAvatar$liveinteract_impl_release();
        int height = 0;
        if ((prepareAvatar$liveinteract_impl_release != null && !C500260Jjc.LJJJJIZL(prepareAvatar$liveinteract_impl_release)) || this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        if (imageModel == null) {
            this.LLJJJJJIL = false;
        }
        C20441214yg.LIZIZ("MultiGuestV3GuestMask_image", "loadPrepareAvatar invoke");
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            C1324720kZq prepareAvatar$liveinteract_impl_release2 = getPrepareAvatar$liveinteract_impl_release();
            if (prepareAvatar$liveinteract_impl_release2 != null) {
                width2 = prepareAvatar$liveinteract_impl_release2.getWidth();
            } else {
                width2 = 0;
            }
            C1324720kZq prepareAvatar$liveinteract_impl_release3 = getPrepareAvatar$liveinteract_impl_release();
            if (prepareAvatar$liveinteract_impl_release3 != null) {
                height = prepareAvatar$liveinteract_impl_release3.getHeight();
            }
            c1324610kZfLJIIIZ.LJ = width2;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIL = getPrepareAvatarImageLoadListener();
            c1324610kZfLJIIIZ.LJJI(getPrepareAvatar$liveinteract_impl_release());
            return;
        }
        if (getPrepareAvatar$liveinteract_impl_release() == null) {
            return;
        }
        C1324720kZq prepareAvatar$liveinteract_impl_release4 = getPrepareAvatar$liveinteract_impl_release();
        C1324720kZq prepareAvatar$liveinteract_impl_release5 = getPrepareAvatar$liveinteract_impl_release();
        if (prepareAvatar$liveinteract_impl_release5 != null) {
            width = prepareAvatar$liveinteract_impl_release5.getWidth();
        } else {
            width = 0;
        }
        C1324720kZq prepareAvatar$liveinteract_impl_release6 = getPrepareAvatar$liveinteract_impl_release();
        if (prepareAvatar$liveinteract_impl_release6 != null) {
            height = prepareAvatar$liveinteract_impl_release6.getHeight();
        }
        C0JSS.LJIIIIZZ(prepareAvatar$liveinteract_impl_release4, imageModel, width, height, R.drawable.el_, getPrepareAvatarImageLoadListener());
    }

    public final long LJJIJ(String str) {
        LinkPlayerInfo next;
        User user;
        Long lValueOf;
        long jLIZ = getWindow().LIZ();
        if (jLIZ == -1) {
            Long l = this.LLILLJJLI;
            if (l != null) {
                return l.longValue();
            }
            List<LinkPlayerInfo> list = getMDataHolder().LJJJ;
            if (list == null) {
                return jLIZ;
            }
            Iterator<LinkPlayerInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.mInteractIdStr, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = next;
            if (linkPlayerInfo == null || (user = linkPlayerInfo.mUser) == null || (lValueOf = Long.valueOf(user.getId())) == null) {
                return jLIZ;
            }
            return lValueOf.longValue();
        }
        return jLIZ;
    }

    public final void LJJIJIIJI(int i) {
        int i2;
        C20441214yg.LIZIZ("NetworkStateTips", "MultiGuestV3GuestMask_reportCurrentNetworkState");
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        c930480aJy.getClass();
        if (C930480aJy.LJIJI(userLJIJJLI)) {
            long jLIZ = getWindow().LIZ();
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            map.put("guest_id", String.valueOf(jLIZ));
            map.put("net_speed_level", String.valueOf(i));
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_anchor_guest_netspeed_stuck_icon_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
            c474500IjALIZIZ.LJJIIZI(map);
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
            return;
        }
        long jLIZ2 = getWindow().LIZ();
        HashMap map2 = new HashMap();
        C01Z4.LIZ(null, map2);
        map2.put("show_guest_id", String.valueOf(jLIZ2));
        if (jLIZ2 == UserService.getInstance().user().getCurrentUserId()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        map2.put("is_self", String.valueOf(i2));
        map2.put("net_speed_level", String.valueOf(i));
        C0KX4.LIZ("livesdk_guest_netspeed_stuck_icon_show", map2, null, true);
    }

    public final void LJJIJLIJ(long j) {
        boolean z;
        String string;
        if (!MultiGuestAvatarFeatureSetting.INSTANCE.hasSeeAbility()) {
            return;
        }
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLLILZJ = z;
        LJJJLZIJ("showAvatarAIIcon", LJJIII(getInteractId()));
        if (!this.LLLILZ) {
            if (j > 0) {
                Long userId = getUserId();
                if (userId == null || (string = userId.toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                C924600aAU.LIZ("show", string);
                View viewLJIL = LJIL(true);
                if (viewLJIL != null) {
                    C12ES.LJIILL(0, viewLJIL);
                }
                LiveIconView liveIconView = this.LLLJ;
                if (liveIconView != null) {
                    liveIconView.setIcon(R.drawable.djy);
                }
            } else {
                View viewLJIL2 = LJIL(false);
                if (viewLJIL2 != null) {
                    C439101nJ.LJI(viewLJIL2);
                }
            }
            LJJJJL();
        }
    }

    public final void LJJJ(C940600aaI c940600aaI) {
        C917720ZzO.LIZ.getClass();
        if (!C917720ZzO.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("source->");
            sbLIZ.append(c940600aaI.LIZJ);
            sbLIZ.append("->showKaraokeIconOnMask not in karaoke phase two exp, so return");
            C917720ZzO.LJI("MultiGuestV3GuestMask", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (Intrinsics.LJFF(c940600aaI.LIZJ, "onNewSongMsg") && C930540aK4.LIZLLL()) {
            C917720ZzO.LJI("MultiGuestV3GuestMask", "current user not online, so should not handle onNewMsg");
            return;
        }
        Long l = c940600aaI.LIZ;
        this.LLJJIJI = c940600aaI.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("source->");
        sbLIZ2.append(c940600aaI.LIZJ);
        sbLIZ2.append(", lastKaraokeUid->");
        sbLIZ2.append(l);
        sbLIZ2.append(", currentKaraokeUId->");
        sbLIZ2.append(this.LLJJIJI);
        sbLIZ2.append(", getUserId()->");
        sbLIZ2.append(getUserId());
        C917720ZzO.LJI("MultiGuestV3GuestMask", C2188811AlT.LIZIZ(sbLIZ2));
        if (Intrinsics.LJFF(l, getUserId()) && !Intrinsics.LJFF(this.LLJJIJI, getUserId())) {
            C917720ZzO.LJI("MultiGuestV3GuestMask", "this mask is last karaoke Player mask, so hide karaoke icon");
            this.LLJLILLLLZIIL = false;
            LJJJIL(this.LLJLL, false);
        } else if (Intrinsics.LJFF(this.LLJJIJI, getUserId())) {
            C917720ZzO.LJI("MultiGuestV3GuestMask", "this mask is current karaoke Player mask, so show karaoke icon");
            this.LLJLILLLLZIIL = true;
            LJJJIL(this.LLJLL, true);
        }
    }

    public final void LJJJI(boolean z) {
        View view;
        if (C939550aYb.LIZJ() && (view = this.LLLIIII) != null) {
            if (z) {
                if (view != null) {
                    C12ES.LJIILL(0, view);
                    return;
                }
                return;
            } else {
                if (view == null) {
                    return;
                }
                C439101nJ.LJI(view);
                return;
            }
        }
        if (z) {
            View guestVoiceVolumeBorderFromXml = getGuestVoiceVolumeBorderFromXml();
            if (guestVoiceVolumeBorderFromXml == null) {
                return;
            }
            C12ES.LJIILL(0, guestVoiceVolumeBorderFromXml);
            return;
        }
        View guestVoiceVolumeBorderFromXml2 = getGuestVoiceVolumeBorderFromXml();
        if (guestVoiceVolumeBorderFromXml2 == null) {
            return;
        }
        C439101nJ.LJI(guestVoiceVolumeBorderFromXml2);
    }

    public final void LJJJJLL(View view) {
        C19ME c19me;
        C19ME c19me2;
        if (C916800Zxu.LIZIZ(getLinkMicId(), false)) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
                    c19me2.topToTop = R.id.p55;
                    c19me2.topToBottom = -1;
                    c19me2.bottomToBottom = R.id.p55;
                    c19me2.bottomToTop = -1;
                    c19me2.startToEnd = R.id.pn2;
                    c19me2.startToStart = -1;
                    c19me2.endToStart = -1;
                    c19me2.endToEnd = -1;
                    C786410Ut5.W5(view, c19me2);
                    return;
                }
                return;
            }
            return;
        }
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (!(layoutParams2 instanceof C19ME) || (c19me = (C19ME) layoutParams2) == null) {
            return;
        }
        c19me.topToTop = -1;
        c19me.bottomToBottom = -1;
        c19me.startToEnd = -1;
        c19me.endToStart = -1;
        c19me.endToEnd = -1;
        c19me.startToStart = 0;
        c19me.topToBottom = R.id.mgt;
        C786410Ut5.W5(view, c19me);
    }

    @Override // X.InterfaceC932640aNS
    public final void LLJJL(String str) {
        invokeSendGiftPanel(str);
    }

    @Override // X.InterfaceC938040aWA
    public final void bc(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[VideoState] call mask switchGuestVideo ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        LJJJJ("updateVideoState", !z);
    }

    public final void setAudioEnable(boolean z) {
        this.LLJLL = z;
    }

    public final void setFollowButtonDelegateFromXml(View view) {
        this.LLJJIII = view;
    }

    public final void setFollowStatusV1FromXml(C1126540fQC c1126540fQC) {
        this.LLJJI = c1126540fQC;
    }

    public final void setGuestVoiceVolumeBorderFromXml(View view) {
        this.LLILZIL = view;
    }

    public final void setKaraokePlayer(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setLayoutTicketFromXml(ConstraintLayout constraintLayout) {
        this.LLJILLL = constraintLayout;
    }

    public final void setMDataHolder(MultiGuestDataHolder multiGuestDataHolder) {
        this.mDataHolder = multiGuestDataHolder;
    }

    public final void setNetworkNicknameContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJILJILJ = constraintLayout;
    }

    public final void setNickNameFollowStatusContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJ = constraintLayout;
    }

    public final void setNickNameFromXml(C20743416Fc c20743416Fc) {
        this.LLJI = c20743416Fc;
    }

    public final void setOnlinePlayerAvatarFromXml(C1324720kZq c1324720kZq) {
        this.LLILZLL = c1324720kZq;
    }

    public final void setOnlinePlayerMuteFromXml(LiveIconView liveIconView) {
        this.LLIZLLLIL = liveIconView;
    }

    public final void setOnlinePlayerMuteVideoBgFromXml(C1324720kZq c1324720kZq) {
        this.LLJJ = c1324720kZq;
    }

    public final void setOnlineTicketFromXml(C1105630esT c1105630esT) {
        this.LLJILJIL = c1105630esT;
    }

    public final void setOnlineTicketIconFromXml(C1126540fQC c1126540fQC) {
        this.LLJIJIL = c1126540fQC;
    }

    public final void setOnlineVoiceEffectFromXml(C1324720kZq c1324720kZq) {
        this.LLILZ = c1324720kZq;
    }

    @Override // X.InterfaceC938040aWA
    public void setSoundWaveBorderV2(View view) {
        this.LLLIIII = view;
    }

    public final void setVoiceWaveView(C941390abZ c941390abZ) {
        this.LLIZ = c941390abZ;
    }

    @Override // X.C939720aYs
    public final void updateState(int i) {
        C1324720kZq prepareAvatarBackground$liveinteract_impl_release;
        C1324720kZq prepareAvatar$liveinteract_impl_release;
        super.updateState(i);
        if (i == 1 && !LJJIII(getInteractId()) && (prepareAvatar$liveinteract_impl_release = getPrepareAvatar$liveinteract_impl_release()) != null) {
            C786410Ut5.LLJJIII(prepareAvatar$liveinteract_impl_release, 8);
        }
        if (!isAnchor() && (prepareAvatarBackground$liveinteract_impl_release = getPrepareAvatarBackground$liveinteract_impl_release()) != null) {
            C786410Ut5.LLJJIII(prepareAvatarBackground$liveinteract_impl_release, 8);
        }
    }

    @Override // X.C939720aYs, X.InterfaceC938310aWb
    public final void updateUserInfo(User user) {
        super.updateUserInfo(user);
        C930540aK4.LJJJ(this, new ARunnableS106S0100000_6((Function0) new AwS416S0200000_15(user, this, 126), 327));
        getMOnlineName().setText(C0KVU.LIZ(user));
        this.LLJJJ = user;
        if (!this.LLJJIJIL) {
            C940110aZV c940110aZV = this.LLLIL;
            if (c940110aZV != null) {
                c940110aZV.LJ(null, "isTriggerUpdateFollowStatus");
            }
            this.LLJJIJIL = true;
            C20441214yg.LIZIZ("MultiGuestV3GuestMask", "Trigger UpdateFollowStatus");
        }
    }

    public static boolean LJJII(View view, View view2) {
        if (!C500260Jjc.LJJJJIZL(view) || !C500260Jjc.LJJJJIZL(view2)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        int i2 = iArr2[0];
        return Rect.intersects(rect, new Rect(i2, iArr2[1], view2.getWidth() + i2, iArr2[1] + view2.getHeight()));
    }

    public static final void LJJIJIL(View view, float f) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(f);
            if (layoutParams.height == iLIZIZ && layoutParams.width == iLIZIZ) {
                return;
            }
            layoutParams.height = iLIZIZ;
            layoutParams.width = iLIZIZ;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    @Override // X.InterfaceC491601vm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r5, boolean r6) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939710aYr.LIZJ(int, boolean):void");
    }

    @Override // X.InterfaceC491601vm
    public final void LJIIL(long j, long j2) {
        if (j == 0 && j2 == 0) {
            C1106010et5 timeCircleView = getTimeCircleView();
            if (timeCircleView != null) {
                C439101nJ.LJI(timeCircleView);
            }
            C1088120eQE timeCountdownView = getTimeCountdownView();
            if (timeCountdownView != null) {
                C439101nJ.LJI(timeCountdownView);
                return;
            }
            return;
        }
        initTimerView();
        LJJJJLL(getTimerViewLayout());
        LJJJJL();
        C1106010et5 timeCircleView2 = getTimeCircleView();
        if (timeCircleView2 != null) {
            C12ES.LJIILL(0, timeCircleView2);
        }
        C1088120eQE timeCountdownView2 = getTimeCountdownView();
        if (timeCountdownView2 != null) {
            C12ES.LJIILL(0, timeCountdownView2);
        }
        C1106010et5 timeCircleView3 = getTimeCircleView();
        if (timeCircleView3 != null) {
            timeCircleView3.setTotalTime(j);
        }
        C1106010et5 timeCircleView4 = getTimeCircleView();
        if (timeCircleView4 != null) {
            timeCircleView4.setRemainTime(j2);
        }
        C1088120eQE timeCountdownView3 = getTimeCountdownView();
        if (timeCountdownView3 != null) {
            timeCountdownView3.LIZ(j2, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    @Override // X.InterfaceC491601vm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(int r5, boolean r6) {
        /*
            r4 = this;
            android.view.ViewGroup r0 = r4.getLiveShowOrderContainer()
            if (r0 == 0) goto L94
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        La:
            X.0aaM r0 = new X.0aaM
            r0.<init>(r5, r6)
            r4.LLJLLL = r0
            r0 = 10
            r3 = 0
            if (r5 < r0) goto L7b
            r1 = -2
            if (r2 == 0) goto L1f
            int r0 = r2.width
            if (r0 == r1) goto L28
            r2.width = r1
        L1f:
            android.view.ViewGroup r0 = r4.getLiveShowOrderContainer()
            if (r0 == 0) goto L28
            X.C786410Ut5.X5(r2, r0)
        L28:
            android.view.ViewGroup r0 = r4.getLiveShowOrderContainer()
            if (r0 == 0) goto L31
            X.C12ES.LJIILL(r3, r0)
        L31:
            X.16F5 r1 = r4.getLiveShowOrderTv()
            if (r1 == 0) goto L3e
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r1.setText(r0)
        L3e:
            if (r6 == 0) goto L60
            X.16F5 r2 = r4.getLiveShowOrderTv()
            if (r2 == 0) goto L5a
            android.content.Context r1 = r4.getContext()
            r0 = 2131103659(0x7f060fab, float:1.781979E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L57
            int r3 = r0.intValue()
        L57:
            r2.setTextColor(r3)
        L5a:
            java.lang.String r0 = "showLiveShowOrder"
            r4.LJFF(r0)
            return
        L60:
            X.16F5 r2 = r4.getLiveShowOrderTv()
            if (r2 == 0) goto L5a
            android.content.Context r1 = r4.getContext()
            r0 = 2131103656(0x7f060fa8, float:1.7819784E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L77
            int r3 = r0.intValue()
        L77:
            r2.setTextColor(r3)
            goto L5a
        L7b:
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r1 = (int) r0
            if (r2 == 0) goto L8a
            int r0 = r2.width
            if (r0 == r1) goto L28
            r2.width = r1
        L8a:
            android.view.ViewGroup r0 = r4.getLiveShowOrderContainer()
            if (r0 == 0) goto L28
            X.C786410Ut5.X5(r2, r0)
            goto L28
        L94:
            r2 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939710aYr.LJIILIIL(int, boolean):void");
    }

    @Override // X.InterfaceC938040aWA
    public final void LJIJ(String str, boolean z) {
        ConstraintLayout layoutTicketFromXml;
        Animator pauseAlphaOutAnimation;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPaused : ");
        sbLIZ.append(z);
        sbLIZ.append(" , source:");
        sbLIZ.append(str);
        sbLIZ.append(", linkmic_id : ");
        sbLIZ.append(getInteractId());
        sbLIZ.append(" , self_linkmic_id : ");
        sbLIZ.append(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
        C1AZW.LJIIJ(12, "MultiGuestV3GuestMask_va_state_ability", C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (z != this.LLJJLIIIJLLLLLLLZ && !Intrinsics.LJFF(getLinkMicId(), C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
            this.LLJJLIIIJLLLLLLLZ = z;
            long jLongValue = 0;
            boolean z2 = true;
            if (z) {
                initPauseLayout$liveinteract_impl_release();
                LJJJLZIJ("PauseStatus", false);
                ConstraintLayout pauseContainer = getPauseContainer();
                if (pauseContainer != null) {
                    C12ES.LJIILL(0, pauseContainer);
                }
                LJJJJLI();
                Animator pauseAlphaInAnimation = getPauseAlphaInAnimation();
                if (pauseAlphaInAnimation != null) {
                    pauseAlphaInAnimation.start();
                }
                C1126540fQC pauseImageView = getPauseImageView();
                if (pauseImageView != null) {
                    C1143920fsE c1143920fsE = new C1143920fsE();
                    c1143920fsE.LIZ = pauseImageView;
                    c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
                    if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                        c1143920fsE.LIZJ = "ttlive_pause_live_coffee_cup.png";
                    } else {
                        c1143920fsE.LIZJ = "ttlive_pause_live_anim.webp";
                    }
                    c1143920fsE.LJFF = true;
                    C1143680frq.LJIIIIZZ(c1143920fsE);
                }
                C1324720kZq onlinePlayerAvatarFromXml = getOnlinePlayerAvatarFromXml();
                if (onlinePlayerAvatarFromXml != null) {
                    C439101nJ.LJI(onlinePlayerAvatarFromXml);
                }
                C930540aK4.LJJJ(this, new ARunnableS106S0100000_6((Function0) new AwS559S0100000_15(this, 1220), 327));
                if (C930540aK4.LJFF() || C930540aK4.LIZJ()) {
                    z2 = false;
                }
                if (C916800Zxu.LJ(getLinkMicId(), z2)) {
                    C1324720kZq onlinePlayerMuteVideoBgFromXml = getOnlinePlayerMuteVideoBgFromXml();
                    if (onlinePlayerMuteVideoBgFromXml != null) {
                        C12ES.LJIILL(0, onlinePlayerMuteVideoBgFromXml);
                    }
                } else {
                    C1324720kZq onlinePlayerMuteVideoBgFromXml2 = getOnlinePlayerMuteVideoBgFromXml();
                    if (onlinePlayerMuteVideoBgFromXml2 != null) {
                        C439101nJ.LJI(onlinePlayerMuteVideoBgFromXml2);
                    }
                }
                LJJJI(false);
                View view = this.LLLII;
                if (view != null) {
                    this.LLILLL.LIZLLL(view, false);
                }
                LJJIJLIJ(0L);
                return;
            }
            ConstraintLayout pauseContainer2 = getPauseContainer();
            if (pauseContainer2 != null && true == C500260Jjc.LJJJJIZL(pauseContainer2) && (pauseAlphaOutAnimation = getPauseAlphaOutAnimation()) != null) {
                pauseAlphaOutAnimation.start();
            }
            if (LJJIL() && (layoutTicketFromXml = getLayoutTicketFromXml()) != null) {
                C12ES.LJIILL(0, layoutTicketFromXml);
            }
            C20743416Fc nickNameFromXml = getNickNameFromXml();
            if (nickNameFromXml != null) {
                C12ES.LJIILL(0, nickNameFromXml);
            }
            ConstraintLayout nickNameFollowStatusContainerFromXml = getNickNameFollowStatusContainerFromXml();
            if (nickNameFollowStatusContainerFromXml != null) {
                C12ES.LJIILL(0, nickNameFollowStatusContainerFromXml);
            }
            updateOnlineCloseUI();
            LJJJLIIL();
            Long l = this.LLLILZLLLI;
            if (l != null) {
                jLongValue = l.longValue();
            }
            LJJIJLIJ(jLongValue);
        }
    }

    @Override // X.InterfaceC491601vm
    public final void LJIJI(long j, long j2) {
        Boolean boolValueOf;
        if (j == 0 && j2 == 0) {
            C1106010et5 timeCircleView = getTimeCircleView();
            if (timeCircleView != null) {
                C439101nJ.LJI(timeCircleView);
            }
            C1088120eQE timeCountdownView = getTimeCountdownView();
            if (timeCountdownView != null) {
                C439101nJ.LJI(timeCountdownView);
                return;
            }
            return;
        }
        InterfaceC927510aFB zoomService = getZoomService();
        Boolean boolValueOf2 = null;
        if (zoomService != null) {
            boolValueOf = Boolean.valueOf(zoomService.LJIIIIZZ());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            InterfaceC927510aFB zoomService2 = getZoomService();
            if (zoomService2 != null) {
                boolValueOf2 = Boolean.valueOf(zoomService2.LJIJ(getLinkMicId()));
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                initTimerView();
                LJJJJLL(getTimerViewLayout());
                LJJJJL();
                C1106010et5 timeCircleView2 = getTimeCircleView();
                boolean z = false;
                if (timeCircleView2 != null) {
                    C12ES.LJIILL(0, timeCircleView2);
                }
                C1088120eQE timeCountdownView2 = getTimeCountdownView();
                if (timeCountdownView2 != null) {
                    C12ES.LJIILL(0, timeCountdownView2);
                }
                C1106010et5 timeCircleView3 = getTimeCircleView();
                if (timeCircleView3 != null) {
                    timeCircleView3.setTotalTime(j);
                }
                C1106010et5 timeCircleView4 = getTimeCircleView();
                if (timeCircleView4 != null) {
                    timeCircleView4.setRemainTime(j2);
                }
                C1088120eQE timeCountdownView3 = getTimeCountdownView();
                if (timeCountdownView3 != null) {
                    if (MultiGuestLiveShowTransitionDurationSetting.INSTANCE.isCountdownLabelAnimated() && j2 < 10) {
                        z = true;
                    }
                    timeCountdownView3.LIZ(j2, z);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v20, types: [REQUEST, X.0kbR] */
    public final void LJJIIJZLJL(final ImageModel imageModel, final C1324720kZq c1324720kZq) {
        boolean z;
        List urls;
        int i;
        String str = null;
        if (C937750aVh.LIZ()) {
            if (C939550aYb.LIZLLL()) {
                i = R.drawable.f5t;
            } else {
                i = R.drawable.f5v;
            }
            if (c1324720kZq != null && !Intrinsics.LJFF(c1324720kZq.getTag(), Integer.valueOf(i)) && c1324720kZq != null) {
                c1324720kZq.setImageRequest(null);
                c1324720kZq.setBackground(C497740JfY.LJIIJ(i));
                c1324720kZq.setForeground(null);
                c1324720kZq.setTag(Integer.valueOf(i));
                return;
            }
            return;
        }
        if (c1324720kZq != null && c1324720kZq.getId() == R.id.pn4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.LLJJJJ) {
                return;
            }
            C1324720kZq onlinePlayerMuteVideoBgFromXml = getOnlinePlayerMuteVideoBgFromXml();
            if (onlinePlayerMuteVideoBgFromXml != null && !C500260Jjc.LJJJJIZL(onlinePlayerMuteVideoBgFromXml)) {
                return;
            } else {
                this.LLJJJJ = true;
            }
        } else if (c1324720kZq != null && c1324720kZq.getId() == R.id.rog) {
            if (!C930540aK4.LIZJ() || this.LLJJJJLIIL) {
                return;
            }
            C1324720kZq prepareAvatarBackground$liveinteract_impl_release = getPrepareAvatarBackground$liveinteract_impl_release();
            if (prepareAvatarBackground$liveinteract_impl_release != null && !C500260Jjc.LJJJJIZL(prepareAvatarBackground$liveinteract_impl_release)) {
                return;
            } else {
                this.LLJJJJLIIL = true;
            }
        }
        if (imageModel == null && c1324720kZq != null) {
            if (c1324720kZq.getId() == R.id.pn4) {
                this.LLJJJJ = false;
            } else if (c1324720kZq.getId() == R.id.rog) {
                this.LLJJJJLIIL = false;
            }
        }
        C20441214yg.LIZIZ("MultiGuestV3GuestMask_image", "loadGaussianBlurBg invoke");
        if (c1324720kZq != null) {
            c1324720kZq.setBackground(null);
            c1324720kZq.setForeground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.eos, c1324720kZq.getContext())));
            c1324720kZq.setTag(null);
        }
        C1291820jim c1291820jim = new C1291820jim(5);
        if (C1819620xS4.LIZLLL(imageModel)) {
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str = (String) C13LP.LJJJLL(urls);
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJIILIIL = c1291820jim;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
            imageDecodeOptionsBuilder.getClass();
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            if (c1324720kZq == null) {
                return;
            }
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LIZLLL = LIZ;
            c1320810kTXLIZJ.LJIILJJIL = c1324720kZq.getController();
            c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0aZG
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LIZLLL(String str2, Throwable th) {
                    C1324720kZq c1324720kZq2 = c1324720kZq;
                    if (c1324720kZq2 != null && c1324720kZq2.getId() == R.id.pn4) {
                        this.LLJJJJ = false;
                    } else {
                        C1324720kZq c1324720kZq3 = c1324720kZq;
                        if (c1324720kZq3 != null && c1324720kZq3.getId() == R.id.rog) {
                            this.LLJJJJLIIL = false;
                        }
                    }
                    C1304680k3W.LIZ.LIZ(40008, String.valueOf(th), null);
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str2, Object obj, Animatable animatable) {
                    C1324720kZq c1324720kZq2 = c1324720kZq;
                    boolean z2 = true;
                    if (c1324720kZq2 != null && c1324720kZq2.getId() == R.id.pn4) {
                        C939710aYr c939710aYr = this;
                        if (obj == null || imageModel == null) {
                            z2 = false;
                        }
                        c939710aYr.LLJJJJ = z2;
                        return;
                    }
                    C1324720kZq c1324720kZq3 = c1324720kZq;
                    if (c1324720kZq3 == null || c1324720kZq3.getId() != R.id.rog) {
                        return;
                    }
                    C939710aYr c939710aYr2 = this;
                    if (obj == null || imageModel == null) {
                        z2 = false;
                    }
                    c939710aYr2.LLJJJJLIIL = z2;
                }
            };
            c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
            return;
        }
        C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
        c1325700kbQLIZJ.LJIILIIL = c1291820jim;
        ?? LIZ2 = c1325700kbQLIZJ.LIZ();
        if (c1324720kZq == null) {
            return;
        }
        C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
        c1320810kTXLIZJ2.LIZLLL = LIZ2;
        c1320810kTXLIZJ2.LJIILJJIL = c1324720kZq.getController();
        c1320810kTXLIZJ2.LJIIIIZZ = new C987320bne(c1324720kZq, this, 3);
        c1324720kZq.setController(c1320810kTXLIZJ2.LIZ());
    }

    public final void LJJIIZI(String str, String str2) {
        boolean zBooleanValue;
        boolean z;
        Boolean boolLIZLLL = getMDataHolder().LIZLLL(getInteractId());
        if (boolLIZLLL != null) {
            zBooleanValue = boolLIZLLL.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C1324720kZq onlinePlayerAvatarFromXml = getOnlinePlayerAvatarFromXml();
        if (onlinePlayerAvatarFromXml != null && onlinePlayerAvatarFromXml.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !zBooleanValue) {
            String interactId = getInteractId();
            if (interactId == null) {
                interactId = str;
            }
            boolean zLIZLLL = getTalkVolumeWaveHandler().LIZLLL(getMDataHolder().LJIILL(interactId));
            if (zLIZLLL) {
                C934650aQh c934650aQhLIZ = C934640aQg.LIZ(str2);
                c934650aQhLIZ.LIZLLL = LJJIJ(interactId);
                c934650aQhLIZ.LJ = "guest";
                C934640aQg.LIZIZ(c934650aQhLIZ);
            }
            this.LLJJL = zLIZLLL;
        } else {
            getTalkVolumeWaveHandler().LIZLLL = true;
            C1324720kZq onlineVoiceEffectFromXml = getOnlineVoiceEffectFromXml();
            if (onlineVoiceEffectFromXml != null) {
                C786410Ut5.LLJJIII(onlineVoiceEffectFromXml, 4);
            }
            this.LLJJL = false;
        }
        if ((!LinkCoreModelKt.currentUserIsAnchor() && MultiGuestRemoveDividingLineSetting.INSTANCE.getValue() == 0) || ((!LinkCoreModelKt.currentUserIsAnchor() && MultiGuestRemoveDividingLineSetting.INSTANCE.getValue() == 3) || C939550aYb.LIZJ())) {
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
            String interactId2 = getInteractId();
            if (interactId2 == null) {
                interactId2 = str;
            }
            Boolean boolLIZLLL2 = getMDataHolder().LIZLLL(interactId2);
            if ((boolLIZLLL2 == null || !boolLIZLLL2.booleanValue()) && !this.LLJJLIIIJLLLLLLLZ) {
                int iLJIILL = getMDataHolder().LJIILL(interactId2);
                C1324720kZq onlinePlayerAvatarFromXml2 = getOnlinePlayerAvatarFromXml();
                if (onlinePlayerAvatarFromXml2 != null) {
                    onlinePlayerAvatarFromXml2.getVisibility();
                }
                InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
                C307001Gy.LIZ().getClass();
                EnumC918970a1P enumC918970a1PLJIIIIZZ = C927600aFK.LJIIIIZZ(interfaceC937900aVwLIZ);
                EnumC918970a1P enumC918970a1P = EnumC918970a1P.FLOATING;
                if (enumC918970a1PLJIIIIZZ == enumC918970a1P && !C917140ZyS.LJIIIIZZ(interfaceC937900aVwLIZ, str)) {
                    if (enumC918970a1PLJII == enumC918970a1P && (!C924790aAn.LIZLLL().LJFF() || C936720aU2.LIZIZ())) {
                        LJJJI(false);
                        boolean zLJFF = getTalkVolumeWaveHandler().LJFF(iLJIILL, new AwS559S0100000_15(this, 1222));
                        if (zLJFF) {
                            C934650aQh c934650aQhLIZ2 = C934640aQg.LIZ(str2);
                            c934650aQhLIZ2.LIZLLL = LJJIJ(interactId2);
                            c934650aQhLIZ2.LJ = "guest";
                            C934640aQg.LIZIZ(c934650aQhLIZ2);
                            View view = this.LLLII;
                            if (view != null) {
                                this.LLILLL.LIZLLL(view, zLJFF);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else if ((enumC918970a1PLJII == enumC918970a1P || enumC918970a1PLJII == EnumC918970a1P.FLOATING_FIX) && C917140ZyS.LJIIIIZZ(C920280a3W.LIZ(), interactId2)) {
                    LJJJI(false);
                    return;
                }
                if (!getTalkVolumeWaveHandler().LJFF(iLJIILL, new AwS559S0100000_15(this, 1221))) {
                    return;
                }
                LJJJI(true);
                C934650aQh c934650aQhLIZ3 = C934640aQg.LIZ(str2);
                c934650aQhLIZ3.LIZLLL = LJJIJ(interactId2);
                c934650aQhLIZ3.LJ = "guest";
                C934640aQg.LIZIZ(c934650aQhLIZ3);
                return;
            }
            LJJJI(false);
            View view2 = this.LLLII;
            if (view2 == null) {
                return;
            }
            this.LLILLL.LIZLLL(view2, false);
        }
    }

    public final void LJJIJL(View view, Object obj) {
        Object tag = view.getTag(R.id.hig);
        view.setTag(R.id.hig, obj);
        if (!Intrinsics.LJFF(tag, obj)) {
            LiveIconView onlinePlayerMuteFromXml = getOnlinePlayerMuteFromXml();
            if (Intrinsics.LJFF(view, getNetworkStateImageView())) {
                LJFF("updateState");
                return;
            }
            if (Intrinsics.LJFF(view, onlinePlayerMuteFromXml)) {
                LJJJJJL(LJJ(this.LLJLL), this.LLJLILLLLZIIL);
                return;
            }
            if (!Intrinsics.LJFF(view, getLiveShowOrderContainer())) {
                return;
            }
            ViewGroup liveShowOrderContainer = getLiveShowOrderContainer();
            Object tag2 = null;
            if (liveShowOrderContainer != null) {
                tag2 = liveShowOrderContainer.getTag(R.id.hig);
            }
            if ((tag2 instanceof Integer) && tag2 != null) {
                C500260Jjc.LJLJLJ(getLiveShowOrderContainer(), false);
                LJJIFFI();
                return;
            }
            C940640aaM c940640aaM = this.LLJLLIL;
            C940640aaM c940640aaM2 = this.LLJLLL;
            if (c940640aaM != null) {
                LIZJ(c940640aaM.LIZ, c940640aaM.LIZIZ);
            } else if (c940640aaM2 != null) {
                LJIILIIL(c940640aaM2.LIZ, c940640aaM2.LIZIZ);
            } else {
                LJIIJJI();
                LJII();
            }
        }
    }

    public final void LJJJIL(boolean z, boolean z2) {
        this.LLJLL = z;
        boolean zLJJ = LJJ(z);
        if (zLJJ) {
            LJJJI(false);
            View view = this.LLLII;
            if (view != null) {
                this.LLILLL.LIZLLL(view, false);
            }
        }
        LJJJJJL(zLJJ, z2);
        LJJJJL();
        LJJJJI();
        LJJJLL();
        LJFF("switchGuestAudio");
    }

    public final void LJJJJ(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source : ");
        sbLIZ.append(str);
        sbLIZ.append(", linkmic_id : ");
        sbLIZ.append(getInteractId());
        sbLIZ.append(" , videoEnable : ");
        sbLIZ.append(z);
        sbLIZ.append(" , isPaused : ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C1AZW.LJIIJ(12, "MultiGuestV3GuestMask_va_state_ability", C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        LJJJLZIJ("switchGuestVideo", !z);
        if (z) {
            C1324720kZq onlinePlayerAvatarFromXml = getOnlinePlayerAvatarFromXml();
            if (onlinePlayerAvatarFromXml != null) {
                C786410Ut5.LLJJIII(onlinePlayerAvatarFromXml, 8);
            }
            C1324720kZq onlinePlayerMuteVideoBgFromXml = getOnlinePlayerMuteVideoBgFromXml();
            if (onlinePlayerMuteVideoBgFromXml != null) {
                C786410Ut5.LLJJIII(onlinePlayerMuteVideoBgFromXml, 8);
            }
        } else {
            boolean z2 = true;
            if (MultiGuestAvatarFeatureSetting.INSTANCE.hasSeeAbility()) {
                MultiGuestDataHolder mDataHolder = getMDataHolder();
                if (mDataHolder != null && mDataHolder.LJI(getInteractId()) > 0) {
                    C1324720kZq onlinePlayerAvatarFromXml2 = getOnlinePlayerAvatarFromXml();
                    if (onlinePlayerAvatarFromXml2 != null) {
                        C786410Ut5.LLJJIII(onlinePlayerAvatarFromXml2, 8);
                    }
                    C1324720kZq onlinePlayerMuteVideoBgFromXml2 = getOnlinePlayerMuteVideoBgFromXml();
                    if (onlinePlayerMuteVideoBgFromXml2 != null) {
                        C786410Ut5.LLJJIII(onlinePlayerMuteVideoBgFromXml2, 8);
                    }
                } else {
                    C1324720kZq onlinePlayerAvatarFromXml3 = getOnlinePlayerAvatarFromXml();
                    if (onlinePlayerAvatarFromXml3 != null) {
                        C786410Ut5.LLJJIII(onlinePlayerAvatarFromXml3, 0);
                    }
                    if (C930540aK4.LJFF() || C930540aK4.LIZJ()) {
                        z2 = false;
                    }
                    if (C916800Zxu.LJ(getLinkMicId(), z2)) {
                        C1324720kZq onlinePlayerMuteVideoBgFromXml3 = getOnlinePlayerMuteVideoBgFromXml();
                        if (onlinePlayerMuteVideoBgFromXml3 != null) {
                            C786410Ut5.LLJJIII(onlinePlayerMuteVideoBgFromXml3, 0);
                        }
                    } else {
                        C1324720kZq onlinePlayerMuteVideoBgFromXml4 = getOnlinePlayerMuteVideoBgFromXml();
                        if (onlinePlayerMuteVideoBgFromXml4 != null) {
                            C786410Ut5.LLJJIII(onlinePlayerMuteVideoBgFromXml4, 8);
                        }
                    }
                    C930540aK4.LJJJ(this, new ARunnableS106S0100000_6((Function0) new AwS559S0100000_15(this, 1220), 327));
                }
            } else {
                C1324720kZq onlinePlayerAvatarFromXml4 = getOnlinePlayerAvatarFromXml();
                if (onlinePlayerAvatarFromXml4 != null) {
                    C786410Ut5.LLJJIII(onlinePlayerAvatarFromXml4, 0);
                }
                if (C930540aK4.LJFF() || C930540aK4.LIZJ()) {
                    z2 = false;
                }
                if (C916800Zxu.LJ(getLinkMicId(), z2)) {
                    C1324720kZq onlinePlayerMuteVideoBgFromXml5 = getOnlinePlayerMuteVideoBgFromXml();
                    if (onlinePlayerMuteVideoBgFromXml5 != null) {
                        C786410Ut5.LLJJIII(onlinePlayerMuteVideoBgFromXml5, 0);
                    }
                } else {
                    MultiGuestDataHolder mDataHolder2 = getMDataHolder();
                    if (mDataHolder2 != null && mDataHolder2.LJI(getInteractId()) > 0) {
                        C1324720kZq onlinePlayerAvatarFromXml5 = getOnlinePlayerAvatarFromXml();
                        if (onlinePlayerAvatarFromXml5 != null) {
                            C786410Ut5.LLJJIII(onlinePlayerAvatarFromXml5, 8);
                        }
                    } else {
                        C1324720kZq onlinePlayerAvatarFromXml6 = getOnlinePlayerAvatarFromXml();
                        if (onlinePlayerAvatarFromXml6 != null) {
                            C786410Ut5.LLJJIII(onlinePlayerAvatarFromXml6, 0);
                        }
                    }
                    C1324720kZq onlinePlayerMuteVideoBgFromXml6 = getOnlinePlayerMuteVideoBgFromXml();
                    if (onlinePlayerMuteVideoBgFromXml6 != null) {
                        C786410Ut5.LLJJIII(onlinePlayerMuteVideoBgFromXml6, 8);
                    }
                }
                C930540aK4.LJJJ(this, new ARunnableS106S0100000_6((Function0) new AwS559S0100000_15(this, 1220), 327));
            }
        }
        LJJJJIZL();
    }

    public final void LJJJJJL(boolean z, boolean z2) {
        int iIntValue;
        String displayId;
        LiveIconView onlinePlayerMuteFromXml = getOnlinePlayerMuteFromXml();
        Integer num = 0;
        num.intValue();
        String displayId2 = null;
        if (!z) {
            num = null;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 8;
        }
        C786410Ut5.LLJJIJIL(onlinePlayerMuteFromXml, iIntValue);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("online_player_mute.visible -->nickName:");
        User user = this.LLJJJ;
        if (user != null) {
            displayId = user.getDisplayId();
        } else {
            displayId = null;
        }
        sbLIZ.append(displayId);
        sbLIZ.append(' ');
        sbLIZ.append(C500260Jjc.LJJJJIZL(getOnlinePlayerMuteFromXml()));
        sbLIZ.append(" , showMuteIcon-->");
        sbLIZ.append(z);
        sbLIZ.append(", isKaraokeSing-->");
        sbLIZ.append(z2);
        sbLIZ.append(" external_control_hide_width:");
        sbLIZ.append(getOnlinePlayerMuteFromXml().getTag(R.id.hig));
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("online_player_mute.visible -->nickName:");
        User user2 = this.LLJJJ;
        if (user2 != null) {
            displayId2 = user2.getDisplayId();
        }
        sbLIZ2.append(displayId2);
        sbLIZ2.append(C500260Jjc.LJJJJIZL(getOnlinePlayerMuteFromXml()));
        sbLIZ2.append(" , showMuteIcon-->");
        sbLIZ2.append(z);
        sbLIZ2.append(", isKaraokeSing-->");
        sbLIZ2.append(z2);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (z) {
            if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                LiveIconView onlinePlayerMuteFromXml2 = getOnlinePlayerMuteFromXml();
                if (onlinePlayerMuteFromXml2 != null) {
                    onlinePlayerMuteFromXml2.setIconAttr(R.attr.e3y);
                }
            } else {
                LiveIconView onlinePlayerMuteFromXml3 = getOnlinePlayerMuteFromXml();
                if (onlinePlayerMuteFromXml3 != null) {
                    onlinePlayerMuteFromXml3.setIconAttr(R.attr.e44);
                }
            }
        } else if (z2) {
            LiveIconView onlinePlayerMuteFromXml4 = getOnlinePlayerMuteFromXml();
            if (onlinePlayerMuteFromXml4 != null) {
                C786410Ut5.LLJJIJIL(onlinePlayerMuteFromXml4, 0);
            }
            LiveIconView onlinePlayerMuteFromXml5 = getOnlinePlayerMuteFromXml();
            if (onlinePlayerMuteFromXml5 != null) {
                onlinePlayerMuteFromXml5.setIconAttr(R.attr.dcc);
            }
        }
        if (C917910Zzh.LIZ(C930540aK4.LIZJ()) && getOnlinePlayerMuteFromXml().getTag(R.id.hig) != null) {
            C786410Ut5.LLJJIJIL(getOnlinePlayerMuteFromXml(), 8);
        }
    }

    public final void LJJJLZIJ(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVoiceWaveVisiblity, source=");
        sbLIZ.append(str);
        sbLIZ.append(", isAudioMode=");
        sbLIZ.append(z);
        sbLIZ.append(", isAvatarMode =");
        sbLIZ.append(this.LLLILZJ);
        C20441214yg.LIZIZ("MultiGuestV3GuestMask", C2188811AlT.LIZIZ(sbLIZ));
        if (z && !this.LLLILZJ) {
            C941390abZ voiceWaveView = getVoiceWaveView();
            if (voiceWaveView != null) {
                C500260Jjc.LLFFF(voiceWaveView);
                return;
            }
            return;
        }
        C941390abZ voiceWaveView2 = getVoiceWaveView();
        if (voiceWaveView2 == null) {
            return;
        }
        C500260Jjc.LJIILLIIL(voiceWaveView2);
    }

    public static final void LJJJJJ(C939710aYr c939710aYr, boolean z, List<String> list) {
        int i;
        if (z) {
            if (c939710aYr.LJJIII(c939710aYr.getInteractId()) && C500260Jjc.LJJJJIZL(c939710aYr.getOnlinePlayerAvatarFromXml())) {
                ViewGroup viewGroup = (ViewGroup) c939710aYr.findViewById(R.id.pmw);
                if (viewGroup != null) {
                    int i2 = 0;
                    if (list != null && (!list.isEmpty())) {
                        C421310GfZ c421310GfZ = c939710aYr.LLLIIIIL;
                        if (c421310GfZ == null) {
                            c421310GfZ = new C421310GfZ(c939710aYr.getContext());
                            C19ME c19me = new C19ME((int) C497740JfY.LIZIZ(20.0f), (int) C497740JfY.LIZIZ(20.0f));
                            c19me.bottomToBottom = R.id.pn1;
                            c19me.topToTop = -1;
                            c19me.startToEnd = -1;
                            c19me.startToStart = -1;
                            c19me.endToEnd = R.id.pn1;
                            c19me.endToStart = -1;
                            c19me.setMarginEnd(-10);
                            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = -10;
                            c421310GfZ.setBackgroundResource(R.drawable.f_v);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421310GfZ);
                            c421310GfZ.setLayoutParams(c19me);
                            c421310GfZ.setStrokeWidth(12.0f);
                            c421310GfZ.setElevation(6.0f);
                            c939710aYr.LLLIIIIL = c421310GfZ;
                        }
                        ViewGroup.LayoutParams layoutParams = c939710aYr.getOnlinePlayerAvatarFromXml().getLayoutParams();
                        if (layoutParams != null) {
                            i = layoutParams.width;
                        } else {
                            i = 0;
                        }
                        ViewGroup.LayoutParams layoutParams2 = c939710aYr.getOnlinePlayerAvatarFromXml().getLayoutParams();
                        if (layoutParams2 != null) {
                            i2 = layoutParams2.height;
                        }
                        int iMin = (int) Math.min(Math.min(i, i2) * 0.5f, C497740JfY.LIZIZ(40.0f));
                        if (iMin <= 0) {
                            iMin = (int) C497740JfY.LIZIZ(20.0f);
                        }
                        c421310GfZ.getLayoutParams().width = iMin;
                        c421310GfZ.getLayoutParams().height = iMin;
                        C786410Ut5.u6(c421310GfZ, c421310GfZ.getLayoutParams());
                        C930540aK4.LJJIL(-1, c421310GfZ, viewGroup);
                        c421310GfZ.setCuttingRadius(iMin * 0.5f);
                        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(list);
                        int width = c421310GfZ.getWidth();
                        int height = c421310GfZ.getHeight();
                        c1324610kZfLIZJ.LJ = width;
                        c1324610kZfLIZJ.LJFF = height;
                        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                        c1324610kZfLIZJ.LJIJI(Float.valueOf((float) Math.ceil(((double) c421310GfZ.getWidth()) * 0.5d)));
                        c1324610kZfLIZJ.LJJIIJ = -12303292;
                        c1324610kZfLIZJ.LJJIII = 4.0f;
                        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                        c1324610kZfLIZJ.LJJI(c421310GfZ);
                        return;
                    }
                    return;
                }
                return;
            }
            C421310GfZ c421310GfZ2 = c939710aYr.LLLIIIIL;
            if (c421310GfZ2 == null) {
                return;
            }
            C930540aK4.LJJIJL(c421310GfZ2);
            return;
        }
        C421310GfZ c421310GfZ3 = c939710aYr.LLLIIIIL;
        if (c421310GfZ3 == null) {
            return;
        }
        C930540aK4.LJJIJL(c421310GfZ3);
    }

    public C939710aYr(Context context, InterfaceC937840aVq interfaceC937840aVq, String str, AbstractC938280aWY abstractC938280aWY, DataChannel dataChannel, EnumC918970a1P enumC918970a1P, Long l, InterfaceC940580aaG interfaceC940580aaG) {
        super(context, interfaceC937840aVq, str, abstractC938280aWY, dataChannel);
        this.LL = enumC918970a1P;
        this.LLILLJJLI = l;
        this.LLILLL = interfaceC940580aaG;
        this.LLJLIL = true;
        this.LLJLL = true;
        this.LLL = new C11NJ();
        this.LLLF = new C304201Fw("ZOOM_SERVICE");
        this.LLLFF = -1;
        this.LLLFFI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1219));
        this.LLLFZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1216));
        this.LLLI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1217));
        this.LLLIIIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 1214));
        this.LLLIIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 1218));
        this.LLLIL = new C940110aZV(this);
        this.LLLL = true;
        this.LLLLII = C930540aK4.LJJIJIL(new AwS416S0200000_15(this, context, 127));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1215));
        C948450amx.LIZIZ.LIZJ(this);
        Context contextLJJIIZI = C520010KaN.LJJIIZI(context, true);
        if (contextLJJIIZI != null) {
            FrameLayout.inflate(contextLJJIIZI, getWindowLayoutId(), this);
            initView();
        }
    }
}
