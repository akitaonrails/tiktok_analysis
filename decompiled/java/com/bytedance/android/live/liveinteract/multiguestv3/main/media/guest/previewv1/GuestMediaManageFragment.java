package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1;

import X.C01Z4;
import X.C0KX4;
import X.C0U85;
import X.C0U86;
import X.C0UDD;
import X.C0UEH;
import X.C0UEU;
import X.C0UEW;
import X.C0UEX;
import X.C0UI0;
import X.C1103220eoa;
import X.C1121670fIL;
import X.C1126540fQC;
import X.C1143300frE;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C1291830jin;
import X.C12ES;
import X.C1324720kZq;
import X.C1555540qa8;
import X.C1602160rnK;
import X.C16F5;
import X.C16FS;
import X.C1701940uOG;
import X.C19748912Op;
import X.C19EH;
import X.C19ME;
import X.C19P4;
import X.C1CCC;
import X.C1CCD;
import X.C1EOY;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C473410IhP;
import X.C497740JfY;
import X.C768860UEa;
import X.C769850UHv;
import X.C769870UHx;
import X.C770840ULq;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C917520Zz4;
import X.C917810ZzX;
import X.C921180a4y;
import X.C921870a65;
import X.C923330a8R;
import X.C923810a9D;
import X.C923820a9E;
import X.C924070a9d;
import X.C924230a9t;
import X.C924620aAW;
import X.C924810aAp;
import X.C924940aB2;
import X.C927560aFG;
import X.C927710aFV;
import X.C930360aJm;
import X.C930480aJy;
import X.C930940aKi;
import X.C932270aMr;
import X.C936050aSx;
import X.C942160aco;
import X.C943990afl;
import X.C947420alI;
import X.C947560alW;
import X.C949060anw;
import X.C956790b0P;
import X.C956840b0U;
import X.EnumC919910a2v;
import X.EnumC920250a3T;
import X.EnumC947440alK;
import X.EnumC952680atm;
import X.InterfaceC500100JjM;
import X.InterfaceC665370Q7z;
import X.InterfaceC769000UEo;
import X.InterfaceC769650UHb;
import X.InterfaceC769780UHo;
import X.InterfaceC920110a3F;
import X.InterfaceC923870a9J;
import X.InterfaceC923890a9L;
import X.InterfaceC927510aFB;
import X.InterfaceC947260al2;
import X.InterfaceC954180awC;
import Y.ACListenerS147S0100000_12;
import Y.AObjectS358S0100000_15;
import Y.AObjectS390S0100000_15;
import Y.AObjectS530S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.AfS181S0100000_12;
import Y.AkS157S0000000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.GuestManagePanelCameraOpenEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestSelectAvatarEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2CloseEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.effect.EnableAudienceEffectControlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSyncEffectRealtimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting;
import com.bytedance.android.livesdk.model.message.EffectControlMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class GuestMediaManageFragment extends PreviewFragment implements View.OnClickListener, C1CCD, SeekBar.OnSeekBarChangeListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZyI2LCwtZygmLTY4Zz8hLTMlLDgleWsLPCogPAgpLSYyBSQiKCg2DjctLiI2JjE=";
    public C1324720kZq LL;
    public InterfaceC923870a9J LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public C1126540fQC LLILZIL;
    public FrameLayout LLILZLL;
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;
    public ImageView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public View LLJJ;
    public C19748912Op LLJJI;
    public RecyclerView LLJJIII;
    public C16F5 LLJJIJI;
    public C16FS LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public View LLJJJ;
    public ConstraintLayout LLJJJIL;
    public LiveIconView LLJJJJ;
    public LiveIconView LLJJJJJIL;
    public C1103220eoa LLJJJJLIIL;
    public C19P4 LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public FrameLayout LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public View LLJLLIL;
    public MultiGuestAvatarPreviewFragment LLJLLL;
    public MultiGuestEffectSwitchFragment LLJZ;
    public LiveIconView LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public int LLLFF;
    public LiveEffect LLLFFI;
    public C0UDD LLLFZ;
    public int LLLIIII;
    public LiveEffect LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public LiveDialogFragment LLLILZ;
    public InterfaceC769780UHo LLLILZJ;
    public C0UEU LLLILZLLLI;
    public int LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public DataChannel LLLJL;
    public MultiGuestDataHolder LLLLIIIILLL;
    public InterfaceC923890a9L LLLLIILLL;
    public InterfaceC769000UEo LLLLJ;
    public C0UDD LLLLJI;
    public C947560alW LLLLLL;
    public C0U85 LLLLLLIL;

    @InterfaceC947260al2(name = "ZOOM_SERVICE")
    public InterfaceC927510aFB mZoomService;
    public final C11NJ LLLL = new C11NJ();
    public final BPEAHandler LLLLII = new BPEAHandler(Looper.getMainLooper());
    public String LLLLIIL = "";
    public boolean LLLLIILL = false;
    public boolean LLLLIL = false;
    public boolean LLLLILI = false;
    public String LLLLL = "";
    public String LLLLLIL = "";
    public String LLLLLILLIL = "";
    public String LLLLLJIL = "outside";
    public final Long LLLLLJLJLL = Long.valueOf(System.currentTimeMillis());
    public boolean LLLLLLJ = false;
    public boolean LLLLLLL = false;
    public boolean LLLLLLLLL = false;
    public boolean LLLLLLLLLL = false;
    public boolean LLLI;
    public final MutableLiveData<Boolean> LLLLLLLZIL = new MutableLiveData<>(Boolean.valueOf(this.LLLI));
    public boolean LLLII;
    public final MutableLiveData<Boolean> LLLLLLZ = new MutableLiveData<>(Boolean.valueOf(this.LLLII));
    public C930360aJm LLLLLLZZ = null;
    public final ACListenerS147S0100000_12 LLLLLZ = new ACListenerS147S0100000_12(this, 61);
    public final C927710aFV LLLLLZIL = new C921870a65() { // from class: X.0aFV
        @Override // X.C921870a65, X.InterfaceC964770bDH
        public final void LJJJLL(C954780axA c954780axA) {
            LiveDialogFragment liveDialogFragment;
            if (c954780axA.LIZIZ != EnumC969200bKQ.Linked && (liveDialogFragment = this.LL.LLLILZ) != null) {
                C929860aIy.LIZ.LJFF(liveDialogFragment);
            }
        }

        @Override // X.C921870a65, X.InterfaceC964770bDH
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            LiveDialogFragment liveDialogFragment;
            if (i != 5 && (liveDialogFragment = this.LL.LLLILZ) != null) {
                C929860aIy.LIZ.LJFF(liveDialogFragment);
            }
        }
    };
    public final C769870UHx LLLLLZL = new C769870UHx(this);
    public final C770840ULq LLLLZ = new InterfaceC769650UHb() { // from class: X.0ULq
        @Override // X.InterfaceC769650UHb
        public final void LIZIZ() {
            GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
            if (guestMediaManageFragment.LLLLLLL) {
                Map<Integer, Integer> map = C768860UEa.LIZ;
                C768860UEa.LIZJ(guestMediaManageFragment.LLLIIII, "video_anchor_connect_detail");
                guestMediaManageFragment.LLLLLLL = false;
            }
        }

        @Override // X.InterfaceC769650UHb
        public final LiveEffect LIZLLL() {
            return this.LIZ.LLLIIIIL;
        }

        @Override // X.InterfaceC769650UHb
        public final int LJI() {
            return this.LIZ.LLLIIII;
        }

        @Override // X.InterfaceC769650UHb
        public final void LIZJ(LiveEffect liveEffect) {
            this.LIZ.LLLIIIIL = liveEffect;
        }

        @Override // X.InterfaceC769650UHb
        public final void LJ(int i) {
            GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
            if (i != guestMediaManageFragment.LLLIIII) {
                guestMediaManageFragment.LLLLLLL = true;
            }
            guestMediaManageFragment.LLLIIII = i;
        }

        @Override // X.InterfaceC769650UHb
        public final void LJFF(int i, boolean z) {
            GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
            String str = C770830ULp.LIZ.get(Integer.valueOf(i));
            if (str == null) {
                str = "audio";
            }
            guestMediaManageFragment.LLLLLILLIL = str;
        }
    };
    public final C769850UHv LLLLZI = new C1CCC() { // from class: X.0UHv
        @Override // X.C1CCC
        public final void LIZ() {
        }

        @Override // X.C1CCC
        public final void LIZIZ(LiveEffect liveEffect) {
        }

        @Override // X.C1CCC
        public final void LIZJ(LiveEffect liveEffect, String str) {
            C0UEU c0ueu = this.LIZ.LLLILZLLLI;
            if (c0ueu != null) {
                c0ueu.LLLI(3, liveEffect, C0UD4.LJ);
            }
        }

        @Override // X.C1CCC
        public final void LIZLLL(LiveEffect liveEffect, String str) {
            C0UEU c0ueu = this.LIZ.LLLILZLLLI;
            if (c0ueu != null) {
                c0ueu.LLLI(2, liveEffect, C0UD4.LJ);
            }
        }
    };

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // X.C1CCD
    public final void NP() {
        C20441214yg.LJIIIZ("GuestMediaManageFragment", "onSyncStickersFailed");
        PR(new ArrayList());
    }

    public final String OR() {
        InterfaceC927510aFB interfaceC927510aFB = this.mZoomService;
        return interfaceC927510aFB != null ? interfaceC927510aFB.LJIILL() : "";
    }

    public final void SR() {
        DataChannel dataChannel;
        InterfaceC769000UEo interfaceC769000UEo;
        boolean z = !this.LLLI;
        this.LLLI = z;
        this.LLLLLLLZIL.setValue(Boolean.valueOf(z));
        if (this.LLLI) {
            ZR("business_mute_click_manage_panel");
        } else {
            WR("business_mute_click_manage_panel");
        }
        if (C927560aFG.LIZ() && MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility()) {
            if (this.LLLI) {
                aS(null);
            } else {
                MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment = this.LLJLLL;
                if (multiGuestAvatarPreviewFragment != null) {
                    aS(multiGuestAvatarPreviewFragment.PR());
                }
            }
        }
        if (EnableAudienceEffectControlSetting.INSTANCE.enable() && this.LLLI) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectControlMessageHelper().getClass();
            EffectControlMessage effectControlMessage = C0UEH.LJI;
            if (effectControlMessage != null && (interfaceC769000UEo = C0UEH.LJIIJJI) != null) {
                C0UEH.LJ(effectControlMessage, interfaceC769000UEo);
            }
        }
        this.LLLJL.LC0(GuestManagePanelCameraOpenEvent.class, Boolean.valueOf(this.LLLI));
        if (!LiveSdkMultiGuestSyncEffectRealtimeSetting.isEnable() || (dataChannel = this.LLLJL) == null || this.LLLI) {
            return;
        }
        dataChannel.LC0(MultiLiveGuestMuteVideoEvent.class, new C0UI0(false, "business_mute_click_manage_panel"));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IAvatarBusinessAbility iAvatarBusinessAbility;
        Avatar avatarOj0;
        C20441214yg.LJIIIZ("GuestMediaManageFragment", "onDestroy");
        super.onDestroy();
        if (EnableAudienceEffectControlSetting.INSTANCE.enable()) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectControlMessageHelper().getClass();
            C20441214yg.LJIIIZ("EffectControlMessage", "setGuestManagePanelComposerManager");
            C0UEH.LJIIJJI = null;
        }
        this.LLLJL.LC0(GuestManagePanelCameraOpenEvent.class, Boolean.FALSE);
        C0U85 c0u85 = this.LLLLLLIL;
        if (c0u85 != null) {
            c0u85.LIZ(false);
        }
        C1126540fQC c1126540fQC = this.LLILZIL;
        if (c1126540fQC != null) {
            c1126540fQC.LIZLLL();
        }
        InterfaceC769780UHo interfaceC769780UHo = this.LLLILZJ;
        if (interfaceC769780UHo != null) {
            interfaceC769780UHo.onDestroy();
        }
        this.LLLJIL = false;
        this.LLLLLLL = false;
        this.LLLL.LJ();
        this.LLLLII.removeCallbacksAndMessages(null);
        C20441214yg.LJIIIZ("GuestMediaManageFragment", "dispose");
        if (!this.LLLL.LLILLJJLI) {
            this.LLLL.dispose();
        }
        this.LLLLIL = false;
        this.LLLLILI = false;
        NR(false);
        if (this.LLJLLL == null && C927560aFG.LIZ() && MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility()) {
            boolean z = this.LLLLLLLLL;
            DataChannel dataChannel = this.LLLJL;
            if (!z && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && !multiGuestDataHolderLIZJ.LJIIJ && dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null && (iAvatarBusinessAbility = (IAvatarBusinessAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IAvatarBusinessAbility.class, null)) != null && (avatarOj0 = iAvatarBusinessAbility.Oj0()) != null) {
                dataChannel.LC0(MultiGuestSelectAvatarEvent.class, new C924070a9d(avatarOj0, false));
            }
        }
        if (!"disconnect_icon".equals(this.LLLLLJIL)) {
            if (this.LLLJL != null) {
                C930360aJm c930360aJm = this.LLLLLLZZ;
                this.LLLJL.LC0(MultiGuestV3PreviewPanelV2CloseEvent.class, new C923820a9E(new C923810a9D(this.LLLIILIL || this.LLLIIL, this.LLL, this.LLLF, this.LLLFF, this.LLLFFI, this.LLLFZ, (c930360aJm == null || c930360aJm.LIZ() == null) ? 0 : c930360aJm.LIZ().intValue()), Boolean.valueOf(this.LLLLLLLLL), Boolean.valueOf(this.LLLLLLLLLL)));
            }
            if (this.LLLLIIIILLL != null) {
                C924940aB2.LIZ(this.LLLIIIIL, this.LLLIIII, !r4.LJIIIZ, !this.LLLI, this.LLLII, this.LLLLLJIL, System.currentTimeMillis() - this.LLLLLJLJLL.longValue(), true, C924620aAW.LJIILJJIL(this.mZoomService, OR()), this.LLLLL);
            }
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLLLLZIL);
        this.LLJZ = null;
        this.LLLLLLLLL = false;
        this.LLJLL = null;
        this.LLJLLL = null;
        C1EOY.LIZ.LJJII("multi_guest_guest_media_manage_page");
        if (this.LLJJIJIL != null && ((View) this.LLILLJJLI).getParent() != null) {
            C786410Ut5.LJJJZ((View) this.LLILLJJLI, this.LLJJIJIL);
        }
        this.LLLLLLZZ = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C20441214yg.LJIIIZ("GuestMediaManageFragment", "onPause");
        super.onPause();
        if (this.LLLLIILL) {
            return;
        }
        UR("business_mute_pause_manage_panel", false);
        this.LLLLIL = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C20441214yg.LJIIIZ("GuestMediaManageFragment", "onResume");
        super.onResume();
        this.LLLLIILL = false;
        UR("business_mute_resume_manage_panel", this.LLLI);
        if (this.LLLLIL && this.LLLLILI) {
            this.LLLLIL = false;
            this.LLLLILI = false;
            C20441214yg.LJIIIZ("GuestMediaManageFragment", "dispose");
            if (this.LLLL.LLILLJJLI) {
                return;
            }
            this.LLLL.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLLJL.zQ2(this);
    }

    public final void NR(boolean z) {
        C947420alI c947420alILJII;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null) {
            return;
        }
        C949060anw c949060anwYo1 = ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
        if (C942160aco.LIZ()) {
            if ((interfaceC954180awCLLJLL.LJJJLIIL() == EnumC952680atm.SINGLE_VIEWMODE_V2 || interfaceC954180awCLLJLL.LJJJLIIL() == EnumC952680atm.SINGLE_VIEWMODE) && c949060anwYo1 != null && (c947420alILJII = c949060anwYo1.LJII()) != null && c947420alILJII.LIZJ != EnumC947440alK.NONE) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enableDoubleDisplay ");
                sbLIZ.append(z);
                C20441214yg.LJIIL("GuestMediaManageFragment", C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    C786410Ut5.LLIIII((SurfaceView) this.LLILLJJLI, 0);
                }
                interfaceC954180awCLLJLL.LJJLIIIJLLLLLLLZ().LJIJJ(C924810aAp.LJ().LIZLLL(), z);
            }
        }
    }

    public final void PR(List<LiveEffect> list) {
        C20441214yg.LJIIIZ("GuestMediaManageFragment", C786410Ut5.j4("initStickerRecyclerView liveEffects=%s", new Object[]{list.toString()}));
        if (list.isEmpty()) {
            list.add(new LiveEffectOld());
            return;
        }
        ListProtector.add(list, 0, new LiveEffectOld());
        this.LLLILZLLLI = new C0UEU(getContext(), list, new C0UEW() { // from class: X.0UHu
            @Override // X.C0UEW
            public final boolean LIZ(LiveEffect liveEffect) {
                if (liveEffect.LLJI().equals("")) {
                    return true;
                }
                try {
                    return this.LIZ.LLLILZJ.LIZ(liveEffect);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            @Override // X.C0UEW
            public final void LIZIZ(LiveEffect liveEffect) {
                GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
                InterfaceC769780UHo interfaceC769780UHo = guestMediaManageFragment.LLLILZJ;
                if (interfaceC769780UHo == null || guestMediaManageFragment.LLLILZLLLI == null) {
                    return;
                }
                if (interfaceC769780UHo.LIZ(liveEffect)) {
                    this.LIZ.LLLILZLLLI.LLLI(2, liveEffect, C0UD4.LJ);
                } else {
                    GuestMediaManageFragment guestMediaManageFragment2 = this.LIZ;
                    guestMediaManageFragment2.LLLILZJ.LIZIZ(C0UD4.LJ, liveEffect, guestMediaManageFragment2.LLLLZI);
                }
            }

            @Override // X.C0UEW
            public final void LIZJ(LiveEffect liveEffect) {
                InterfaceC769000UEo interfaceC769000UEo;
                InterfaceC769000UEo interfaceC769000UEo2 = this.LIZ.LLLLJ;
                if (interfaceC769000UEo2 != null) {
                    interfaceC769000UEo2.lr(C0UD4.LJ);
                }
                if (!TextUtils.equals(liveEffect.LLJI(), "") && (interfaceC769000UEo = this.LIZ.LLLLJ) != null) {
                    interfaceC769000UEo.kr(liveEffect, C0UD4.LJ);
                }
                this.LIZ.LLLIIIIL = liveEffect;
                C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                String strValueOf = String.valueOf(liveEffect.getEffectId());
                c1276840jKc.getClass();
                C1276840jKc.LJIIL(strValueOf);
                C1276840jKc.LJIILL(this.LIZ.LLLIIIIL.getResourceId());
                C1276840jKc.LJIIJ(this.LIZ.LLLIIIIL, false);
            }
        }, true, this.LLLJL);
        RecyclerView recyclerView = this.LLJJIII;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.LLJJIII.setAdapter(this.LLLILZLLLI);
        }
    }

    public final void WR(String str) {
        boolean z;
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        C20441214yg.LJIIIZ("GuestMediaManageFragment", "switchToAudioSelection");
        if (this.LLLLIIIILLL == null) {
            return;
        }
        C947560alW c947560alW = this.LLLLLL;
        if (c947560alW != null && (multiGuestEffectSwitchFragment = this.LLJZ) != null) {
            c947560alW.LJI(multiGuestEffectSwitchFragment.OR(), this.LLJZ.NR());
        }
        C0UEX.LIZJ(1, "business_mute_click_manage_panel".equals(str));
        this.LLLLLILLIL = "audio";
        C924940aB2.LIZJ(this.LLLLLIL, this.LLLLL, "audio", this.LLLIIIIL, this.LLLIIII, !this.LLLLIIIILLL.LJIIIZ, !this.LLLI, this.LLLII, true, C924620aAW.LJIILJJIL(this.mZoomService, OR()));
        VR(str, false);
        C12ES.LJIILL(8, this.LLJILJIL);
        C12ES.LJIILL(8, this.LLJJI);
        C12ES.LJIILL(8, this.LLJJIII);
        if (C927560aFG.LIZ() && MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility()) {
            FrameLayout frameLayout = this.LLJLL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            View view = this.LLJLLIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            if (this.LLJLLL == null && this.LLJLL != null) {
                Long l = (Long) this.LLLJL.gg0(C956840b0U.class);
                if (l != null && l.longValue() != 0) {
                    if (System.currentTimeMillis() - l.longValue() < Mp4ScreenVideoLoadTimeout.CONTROL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLLJL.SX0(C956840b0U.class, 0L);
                } else {
                    z = false;
                }
                this.LLJLLL = MultiGuestAvatarPreviewFragment.SR(this.LLLILZ.getParentFragmentManager(), false, false, false, z, this.LLLJL, new AObjectS390S0100000_15(this, 8), new AObjectS530S0100000_15(this, 8), new AObjectS358S0100000_15(this, 74), null);
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.bjr, this.LLJLLL, null);
                c19ehLJIIJ.LJIIL();
            }
            MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment = this.LLJLLL;
            if (multiGuestAvatarPreviewFragment != null) {
                multiGuestAvatarPreviewFragment.PL1(true);
                if (LiveSdkMultiGuestSyncEffectRealtimeSetting.isEnable()) {
                    C473410IhP.LIZIZ(new ARunnableS115S0100000_15(this, 129));
                }
            }
        }
        TextView textView = this.LLJILJILJ;
        if (textView != null) {
            textView.setTextColor(-2130706433);
        }
        TextView textView2 = this.LLJILLL;
        if (textView2 != null) {
            textView2.setTextColor(-2130706433);
        }
        FrameLayout frameLayout2 = this.LLILZLL;
        if (frameLayout2 != null && this.LLJZ != null) {
            C12ES.LJIILL(8, frameLayout2);
            C12ES.LJIILL(8, this.LLJJL);
            DataChannel dataChannel = this.LLJZ.LLJILJILJ;
            if (dataChannel != null) {
                dataChannel.LC0(MultiGuestPreviewCameraOpenEvent.class, Boolean.FALSE);
            }
        }
        C12ES.LJIILL(8, this.LLJLIL);
        if (C927560aFG.LIZIZ()) {
            this.LLJJIJI.setText(2131851259);
        }
        C16F5 c16f5 = this.LLJJIJI;
        if (c16f5 != null && this.LLJLLL == null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
    }

    public final void ZR(String str) {
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2;
        if (this.LLILZLL != null && (multiGuestEffectSwitchFragment2 = this.LLJZ) != null) {
            if (!multiGuestEffectSwitchFragment2.LLJJL) {
                multiGuestEffectSwitchFragment2.UR();
                multiGuestEffectSwitchFragment2.LLJJL = true;
            }
            if (!multiGuestEffectSwitchFragment2.mStatusViewValid) {
                multiGuestEffectSwitchFragment2.LLJJLIIIJLLLLLLLZ = true;
            }
            DataChannel dataChannel = multiGuestEffectSwitchFragment2.LLJILJILJ;
            if (dataChannel != null) {
                dataChannel.LC0(MultiGuestPreviewCameraOpenEvent.class, Boolean.TRUE);
            }
            C12ES.LJIILL(0, this.LLILZLL);
            C12ES.LJIILL(8, this.LLJILJIL);
            if (this.LLJZ.OR()) {
                C12ES.LJIILL(0, this.LLJJL);
            }
            if (this.LLJZ.NR()) {
                C12ES.LJIILL(0, this.LLJJLIIIJLLLLLLLZ);
            }
        }
        C20441214yg.LJIIIZ("GuestMediaManageFragment", "switchToBeautySelection");
        this.LLLLLILLIL = "enhance";
        if (this.LLLLIIIILLL == null) {
            return;
        }
        C947560alW c947560alW = this.LLLLLL;
        if (c947560alW != null && (multiGuestEffectSwitchFragment = this.LLJZ) != null) {
            c947560alW.LJFF(multiGuestEffectSwitchFragment.OR(), this.LLJZ.NR());
        }
        C0UEX.LIZJ(2, "business_mute_click_manage_panel".equals(str));
        C924940aB2.LIZJ(this.LLLLLIL, this.LLLLL, this.LLLLLILLIL, this.LLLIIIIL, this.LLLIIII, !this.LLLLIIIILLL.LJIIIZ, !this.LLLI, this.LLLII, true, C924620aAW.LJIILJJIL(this.mZoomService, OR()));
        InterfaceC923890a9L interfaceC923890a9L = this.LLLLIILLL;
        if (interfaceC923890a9L != null) {
            interfaceC923890a9L.LJIIL();
        }
        VR(str, true);
        View view = this.LLJJ;
        if (view != null) {
            C19ME c19me = (C19ME) view.getLayoutParams();
            c19me.bottomToBottom = R.id.buz;
            c19me.rightToRight = R.id.buz;
            c19me.leftToLeft = R.id.buz;
            C786410Ut5.W5(this.LLJJ, c19me);
        }
        C19748912Op c19748912Op = this.LLJJI;
        if (c19748912Op != null) {
            int visibility = c19748912Op.getVisibility();
            c19748912Op.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c19748912Op);
        }
        RecyclerView recyclerView = this.LLJJIII;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
        TextView textView = this.LLJILJILJ;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        TextView textView2 = this.LLJILLL;
        if (textView2 != null) {
            textView2.setTextColor(-2130706433);
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        FrameLayout frameLayout = this.LLJLL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
            MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment = this.LLJLLL;
            if (multiGuestAvatarPreviewFragment != null) {
                multiGuestAvatarPreviewFragment.PL1(false);
            }
        }
        View view3 = this.LLJLLIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        C16F5 c16f5 = this.LLJJIJI;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
    }

    public final void aS(Avatar avatar) {
        InterfaceC923870a9J interfaceC923870a9J = this.LLILLJJLI;
        if (interfaceC923870a9J != null) {
            interfaceC923870a9J.LJIIIZ(new C936050aSx(avatar, true));
        }
    }

    public final void bS(String str) {
        boolean z;
        if (this.LLJJJJJIL == null) {
            return;
        }
        if (C917810ZzX.LJIIIIZZ()) {
            C786410Ut5.LLJJIJIL(this.LLJJJJJIL, 8);
            return;
        }
        if (C924230a9t.LIZ(1)) {
            C786410Ut5.LLJJIJIL(this.LLJJJJJIL, 8);
            return;
        }
        Context context = getContext();
        InterfaceC927510aFB interfaceC927510aFB = this.mZoomService;
        if (interfaceC927510aFB != null && context != null) {
            EnumC920250a3T enumC920250a3TLJIJJLI = interfaceC927510aFB.LJIJJLI();
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (!C923330a8R.LJIIIZ() && enumC920250a3TLJIJJLI != EnumC920250a3T.CAN_ZOOM_TO_MIN) {
                C786410Ut5.LLJJIJIL(this.LLJJJJJIL, 8);
            } else {
                C786410Ut5.LLJJIJIL(this.LLJJJJJIL, 0);
                LiveIconView liveIconView = this.LLJJJJJIL;
                if (enumC920250a3TLJIJJLI != EnumC920250a3T.ZOOM_DISABLED) {
                    z = true;
                } else {
                    z = false;
                }
                liveIconView.setClickable(z);
                C930480aJy c930480aJy = C930480aJy.LIZ;
                LiveIconView liveIconView2 = this.LLJJJJJIL;
                Context context2 = getContext();
                int iLIZIZ = C20736316Cj.LIZIZ(R.attr.c9k, context);
                int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.c9m, context);
                c930480aJy.getClass();
                C930480aJy.LJJJ(liveIconView2, enumC920250a3TLJIJJLI, context2, iLIZIZ, iLIZIZ2, false);
            }
            C1143300frE.LJIIJJI().LJII("Zoom/GuestMediaManageFragment", C2097608Jq.LJIIJ(new Pair("action", "logZoomButtonStatus"), new Pair("zoomStatus", enumC920250a3TLJIJJLI.name()), new Pair("source", str)));
        }
    }

    public final void cS(final LiveDialog liveDialog) {
        Long lValueOf;
        final String str;
        User owner;
        FollowInfo followInfo;
        if (this.mZoomService == null) {
            return;
        }
        String strOR = OR();
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        map.put("guest_id", strValueOf);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        } else {
            lValueOf = null;
        }
        map.put("anchor_relationship", String.valueOf(lValueOf));
        map.put("connected_guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
        C917520Zz4.LIZ(map);
        C01Z4.LIZ(null, map);
        C0KX4.LIZ("livesdk_canceled_enlarge_guest_screen", map, null, true);
        C1143300frE.LJIIJJI().LJII("Zoom/GuestMediaManageFragment", C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "entrance"), new Pair("zoomServiceIsNull", false), new Pair("myLinkMicId", strOR), new Pair("zoomStatus", this.mZoomService.LJIL(strOR).name())));
        if (this.mZoomService.LJIL(strOR) == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
            str = "zoom_min";
        } else {
            str = "zoom_max";
        }
        if (!TextUtils.isEmpty(strOR)) {
            this.mZoomService.LJI(strOR, new InterfaceC920110a3F() { // from class: X.0aMd
                @Override // X.InterfaceC920110a3F
                public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZJ(String str2) {
                    C1143300frE.LJIIJJI().LJII("Zoom/GuestMediaManageFragment", C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "zoomSuccess")));
                    DialogInterface dialogInterface = liveDialog;
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    C16FS c16fs = this.LIZJ.LLJJIJIIJIL;
                    if (c16fs != null) {
                        c16fs.performClick();
                    }
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZ(int i, String str2, String str3, Throwable th) {
                    String message;
                    C01N8.LIZ(i, "zoom", str, 0L, "guest", "http_fail", str3);
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("action", "zoom");
                    pairArr[1] = new Pair("step", "zoomFail");
                    pairArr[2] = new Pair("errorCode", Integer.valueOf(i));
                    pairArr[3] = new Pair("errorMessage", str3);
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    pairArr[4] = new Pair("throwable", message);
                    c1143300frELJIIJJI.LJII("Zoom/GuestMediaManageFragment", C2097608Jq.LJIIJ(pairArr));
                    DialogInterface dialogInterface = liveDialog;
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    if (this.LIZJ.mZoomService != null) {
                        C917140ZyS.LJII(Integer.valueOf(i), str3, th, this.LIZJ.getContext(), this.LIZJ.LLLJL, UserService.getInstance().user().LJIJJLI());
                    }
                }
            }, true, this.LLLLLLJ, false, true, EnumC919910a2v.FROM_GUEST_MEDIA_MANAGE_FRAGMENT, null);
        } else {
            if (liveDialog == null) {
                return;
            }
            liveDialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022d  */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r25) {
        /*
            Method dump skipped, instruction units count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment.onClick(android.view.View):void");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.LLLLLLL) {
            Map<Integer, Integer> map = C768860UEa.LIZ;
            C768860UEa.LIZJ(this.LLLIIII, "video_anchor_connect_detail");
            this.LLLLLLL = false;
        }
    }

    @Override // X.C1CCD
    public final void uv(EffectChannelResponse effectChannelResponse) {
        C20441214yg.LJIIIZ("GuestMediaManageFragment", C786410Ut5.j4("onSyncStickersSuccess effectCategoryResponseList=%s", new Object[]{effectChannelResponse}));
        ((InterfaceC500100JjM) C11NZ.LJJJJIZL(effectChannelResponse.getAllCategoryEffects()).LJJJJZI(new AkS157S0000000_12(1)).LJLJLLL().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZLLL(C11RD.LIZJ(this.LLJJIII))).LIZ(new AfS181S0100000_12(this, 194), new AfS181S0100000_12(this, 195));
    }

    public final void UR(String str, boolean z) {
        C20441214yg.LJIIIZ("GuestMediaManageFragment", C786410Ut5.j4("switchCameraOnOrOff isVideoOn=%s source=%s", new Object[]{Boolean.valueOf(z), str}));
        if (this.LLILLJJLI == null) {
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJL(Boolean.valueOf(!z), str, "just for fake capture");
        }
        this.LLILLJJLI.LJI(this.LLLII);
        this.LLILLJJLI.LJIILIIL(CertProviderManagerKt.findCert("bpea-video_capture_in_preview_panel_switch_camera", 1476788234), z);
    }

    public final void VR(String str, boolean z) {
        C20441214yg.LJIIIZ("GuestMediaManageFragment", C786410Ut5.j4("switchPreview isVideoOn=%s", new Object[]{Boolean.valueOf(z)}));
        UR(str, z);
        if (z) {
            View view = this.LLJI;
            if (view != null) {
                view.setBackground(C497740JfY.LJIIJ(R.drawable.eso));
            }
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                view2.setBackground(C497740JfY.LJIIJ(R.drawable.erj));
                this.LLJIJIL.setEnabled(true);
            }
            C1324720kZq c1324720kZq = this.LL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            C1126540fQC c1126540fQC = this.LLILZIL;
            if (c1126540fQC != null) {
                C786410Ut5.LLJJI(c1126540fQC, 8);
                this.LLILZIL.LIZLLL();
            }
            ImageView imageView = this.LLJ;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
                return;
            }
            return;
        }
        if (this.LLJI != null) {
            if (C927560aFG.LIZIZ() || (C932270aMr.LIZIZ() && !"anchor_invite".equals(this.LLLLL))) {
                C786410Ut5.T4(this.LLJI, 0.5f);
            } else {
                C786410Ut5.T4(this.LLJI, 1.0f);
            }
            this.LLJI.setBackground(C497740JfY.LJIIJ(R.drawable.esm));
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            view3.setBackground(C497740JfY.LJIIJ(R.drawable.erh));
            this.LLJIJIL.setEnabled(false);
        }
        C1324720kZq c1324720kZq2 = this.LL;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 0);
        }
        C1126540fQC c1126540fQC2 = this.LLILZIL;
        if (c1126540fQC2 != null) {
            C786410Ut5.LLJJI(c1126540fQC2, 0);
            this.LLILZIL.LJII();
        }
        if (!this.LLLJ) {
            ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
            C1121670fIL.LJII(this.LL, avatarThumb, new C1291830jin(0.74698794f));
            ImageView imageView2 = this.LLJ;
            C1121670fIL.LJIILIIL(imageView2, avatarThumb, imageView2.getWidth(), this.LLJ.getHeight(), R.drawable.el_);
            this.LLLJ = true;
        }
        ImageView imageView3 = this.LLJ;
        if (imageView3 == null) {
            return;
        }
        C786410Ut5.LJZI(0, imageView3);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0U85 c0u85 = new C0U85(this.LLJLILLLLZIIL, this.LLILLJJLI, this, new C0U86() { // from class: X.0UKY
            @Override // X.C0U86
            public final void LIZ(LiveEffect liveEffect, String str, boolean z) {
                if (z) {
                    this.LIZ.LLLIIIIL = liveEffect;
                } else {
                    this.LIZ.LLLIIIIL = new LiveEffectOld();
                }
            }
        }, this.LLLLLL);
        this.LLLLLLIL = c0u85;
        c0u85.LIZ(true);
        C943990afl.LIZ().LIZLLL(view);
        NR(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x055f, code lost:
    
        if (r0 > 8) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0588, code lost:
    
        if (r0 > 8) goto L11;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r30, android.view.ViewGroup r31, android.os.Bundle r32) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 1483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i >= 0 && i <= seekBar.getMax() && z) {
            InterfaceC923870a9J interfaceC923870a9J = this.LLILLJJLI;
            if (interfaceC923870a9J != null) {
                interfaceC923870a9J.LJIILLIIL();
            }
            if (i != this.LLLIIII) {
                this.LLLLLLL = true;
            }
            this.LLLIIII = i;
        }
    }

    public static GuestMediaManageFragment RR(GuestMediaManagePanel guestMediaManagePanel, DataChannel dataChannel, Boolean bool, Boolean bool2, int i, LiveEffect liveEffect, Boolean bool3, Boolean bool4, int i2, LiveEffect liveEffect2, String str, String str2, MultiGuestDataHolder multiGuestDataHolder, String str3) {
        C20441214yg.LJIIIZ("GuestMediaManageFragment", C786410Ut5.j4("newInstance: dialog=%s,dataChannel=%s,isVideoSwitchOnBefore=%s,isUsingBackCameraBefore=%s,beautyLevelBefore=%s,stickerBefore=%s,isVideoSwitchOnWhenOpen=%s,isUsingBackCameraWhenOpen=%sbeautyLevelWhenOpen=%sstickerWhenOpen=%sopenSource=%sguestInviteType=%s", new Object[]{guestMediaManagePanel, dataChannel, bool, bool2, Integer.valueOf(i), liveEffect, bool3, bool4, Integer.valueOf(i2), liveEffect2, str, str2}));
        GuestMediaManageFragment guestMediaManageFragment = new GuestMediaManageFragment();
        guestMediaManageFragment.LLLILZ = guestMediaManagePanel;
        guestMediaManageFragment.LLLJL = dataChannel;
        guestMediaManageFragment.LLL = bool.booleanValue();
        guestMediaManageFragment.LLLF = bool2.booleanValue();
        guestMediaManageFragment.LLLFF = i;
        guestMediaManageFragment.LLLFFI = liveEffect;
        boolean zBooleanValue = bool3.booleanValue();
        guestMediaManageFragment.LLLI = zBooleanValue;
        guestMediaManageFragment.LLLLLLLZIL.setValue(Boolean.valueOf(zBooleanValue));
        boolean zBooleanValue2 = bool4.booleanValue();
        guestMediaManageFragment.LLLLLLZ.setValue(Boolean.valueOf(zBooleanValue2));
        guestMediaManageFragment.LLLII = zBooleanValue2;
        guestMediaManageFragment.LLLIIII = i2;
        guestMediaManageFragment.LLLIIIIL = liveEffect2;
        guestMediaManageFragment.LLLLL = str;
        guestMediaManageFragment.LLLLLIL = str2;
        guestMediaManageFragment.LLLLIIIILLL = multiGuestDataHolder;
        guestMediaManageFragment.LLLLIIL = str3;
        return guestMediaManageFragment;
    }
}
