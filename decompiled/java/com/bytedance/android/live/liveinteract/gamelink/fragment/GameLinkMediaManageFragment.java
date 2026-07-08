package com.bytedance.android.live.liveinteract.gamelink.fragment;

import X.C098200Yq;
import X.C0IPN;
import X.C1103220eoa;
import X.C1121670fIL;
import X.C1126540fQC;
import X.C1143780fs0;
import X.C11NJ;
import X.C1291830jin;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C417850GZz;
import X.C497740JfY;
import X.C786410Ut5;
import X.C921810a5z;
import X.C922430a6z;
import X.C924250a9v;
import X.C924300aA0;
import X.C924650aAZ;
import X.C930940aKi;
import X.InterfaceC924460aAG;
import Y.AObjectS358S0100000_15;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.ShowGuestDisconnectDialogEvent;
import com.bytedance.android.live.liveinteract.gamelink.utils.GameLinkPreviewPanelCloseEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public class GameLinkMediaManageFragment extends BaseFragment implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZygyJSHELIOSAgICE4ZiM+KCg+LSs4ZwgyJSAAICE4BSAoIC4eKSstLioVOiQrJCo9PA==";
    public C1324720kZq LL;
    public C1126540fQC LLILLJJLI;
    public ViewGroup LLILLL;
    public ViewGroup LLILZ;
    public ImageView LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public C16FS LLIZLLLIL;
    public FrameLayout LLJ;
    public View LLJI;
    public C1103220eoa LLJIJIL;
    public LiveDialogFragment LLJILJIL;
    public boolean LLJILJILJ;
    public DataChannel LLJILLL;
    public final C11NJ LLJJ = new C11NJ();
    public final BPEAHandler LLJJI = new BPEAHandler(Looper.getMainLooper());
    public final GameLinkDataHolder LLJJIII = C924250a9v.LIZ();
    public boolean LLJJIJI = false;
    public boolean LLJJIJIIJIL = false;
    public boolean LLJJIJIL = false;
    public String LLJJJ = "";
    public String LLJJJIL = "";
    public String LLJJJJ = "outside";
    public final Long LLJJJJJIL = Long.valueOf(System.currentTimeMillis());
    public InterfaceC924460aAG LLJJJJLIIL = null;
    public final C924300aA0 LLJJL = new C921810a5z() { // from class: X.0aA0
        @Override // X.C921810a5z, X.InterfaceC964770bDH
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            LiveDialogFragment liveDialogFragment;
            if (i != 5 && (liveDialogFragment = this.LL.LLJILJIL) != null) {
                liveDialogFragment.dismiss();
            }
        }
    };

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C20441214yg.LJIIIZ("GameLinkMediaManageFragment", "onDestroy");
        super.onDestroy();
        C1126540fQC c1126540fQC = this.LLILLJJLI;
        if (c1126540fQC != null) {
            c1126540fQC.LIZLLL();
        }
        this.LLJJ.LJ();
        this.LLJJJJLIIL.a9(this.LLJJL);
        this.LLJJI.removeCallbacksAndMessages(null);
        C20441214yg.LJIIIZ("GameLinkMediaManageFragment", "dispose");
        if (!this.LLJJ.LLILLJJLI) {
            this.LLJJ.dispose();
        }
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel != null) {
            dataChannel.FQ2(GameLinkPreviewPanelCloseEvent.class);
        }
        GameLinkDataHolder gameLinkDataHolder = this.LLJJIII;
        if (gameLinkDataHolder != null) {
            C924650aAZ c924650aAZ = C924650aAZ.LIZ;
            int i = !gameLinkDataHolder.LJIIIZ ? 1 : 0;
            String str = this.LLJJJJ;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJJJJIL.longValue();
            String str2 = this.LLJJJ;
            HashMap map = new HashMap();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                map.put("room_id", room.getIdStr());
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            }
            map.put("props_id", String.valueOf(0L));
            map.put("enhance_level", String.valueOf(2L));
            map.put("mic_status", String.valueOf(i ^ 1));
            map.put("camera_status", String.valueOf(0));
            map.put("camera_type", "off");
            map.put("close_way", str);
            map.put("stay_duration", String.valueOf(jCurrentTimeMillis));
            map.put("enlarge_status", String.valueOf(0));
            map.put("request_page", str2);
            C924650aAZ.LIZJ(c924650aAZ, map);
            C924650aAZ.LJIILLIIL("livesdk_guest_connection_setting_panel_close", null, map);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C20441214yg.LJIIIZ("GameLinkMediaManageFragment", "onPause");
        super.onPause();
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJIIJIL = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C20441214yg.LJIIIZ("GameLinkMediaManageFragment", "onResume");
        super.onResume();
        this.LLJJIJI = false;
        if (this.LLJJIJIIJIL && this.LLJJIJIL) {
            this.LLJJIJIIJIL = false;
            this.LLJJIJIL = false;
            C20441214yg.LJIIIZ("GameLinkMediaManageFragment", "dispose");
            if (this.LLJJ.LLILLJJLI) {
                return;
            }
            this.LLJJ.dispose();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LiveDialogFragment liveDialogFragment;
        C20441214yg.LJIIIZ("GameLinkMediaManageFragment", C786410Ut5.j4("onClick v=%s", new Object[]{Integer.valueOf(view.getId())}));
        int id = view.getId();
        if (id == R.id.ma2) {
            C20441214yg.LJIIIZ("GameLinkMediaManageFragment", "showDisconnectDialog");
            InterfaceC924460aAG interfaceC924460aAG = this.LLJJJJLIIL;
            if (interfaceC924460aAG != null && interfaceC924460aAG.LLJLL() != null && this.LLJJJJLIIL.LLJLL().G0() != null) {
                C924650aAZ.LIZ.LJII(UserService.getInstance().user().getCurrentUserId(), "go_live_panel", this.LLJJJIL, this.LLJJJJLIIL.LLJLL().G0().linkMicId);
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null && room.getOwner() != null) {
                LiveDialogFragment liveDialogFragment2 = this.LLJILJIL;
                if (liveDialogFragment2 != null) {
                    liveDialogFragment2.dismiss();
                }
                if (this.LLJILLL != null) {
                    this.LLJILLL.LC0(ShowGuestDisconnectDialogEvent.class, new Pair("setting_panel", 10002));
                    return;
                }
                return;
            }
            return;
        }
        if (id == R.id.ob7) {
            GameLinkDataHolder gameLinkDataHolder = this.LLJJIII;
            if (gameLinkDataHolder == null) {
                return;
            }
            int i = gameLinkDataHolder.LJJJLL;
            if (i != 2 && i != 3) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onClickMicBtn setAudioEnable from ");
            sbLIZ.append(this.LLJJIII.LJIIIZ);
            sbLIZ.append(" to ");
            sbLIZ.append(!this.LLJJIII.LJIIIZ);
            C20441214yg.LJIIIZ("GameLinkMediaManageFragment", C2188811AlT.LIZIZ(sbLIZ));
            GameLinkDataHolder gameLinkDataHolder2 = this.LLJJIII;
            boolean z = !gameLinkDataHolder2.LJIIIZ;
            gameLinkDataHolder2.LJIIIZ = z;
            C924650aAZ.LIZ.LJIIIZ(gameLinkDataHolder2.LJJJJJL, gameLinkDataHolder2.LJL, "guest_connection_panel", true ^ z);
            DataChannel dataChannel = this.LLJILLL;
            if (dataChannel == null) {
                return;
            }
            dataChannel.LC0(GameLinkGuestMuteAudioEvent.class, new C922430a6z(this.LLJJIII.LJIIIZ, "business_mute_manage_panel"));
            return;
        }
        if (id != R.id.cuk || (liveDialogFragment = this.LLJILJIL) == null) {
            return;
        }
        this.LLJJJJ = "confirm_icon";
        liveDialogFragment.dismiss();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        C20441214yg.LJIIIZ("GameLinkMediaManageFragment", C786410Ut5.j4("onCreateView: onCreateView=%s, container=%s, savedInstanceState=%s", new Object[]{layoutInflater, viewGroup, bundle}));
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gik, viewGroup, false);
        C20441214yg.LJIIIZ("GameLinkMediaManageFragment", C786410Ut5.j4("findViewByID mRootView=%s", new Object[]{viewTd}));
        viewTd.findViewById(R.id.rqi);
        this.LLJ = (FrameLayout) viewTd.findViewById(R.id.rpx);
        this.LL = (C1324720kZq) viewTd.findViewById(R.id.bhn);
        this.LLILLJJLI = (C1126540fQC) viewTd.findViewById(R.id.bah);
        this.LLILZIL = (ImageView) viewTd.findViewById(R.id.bh2);
        this.LLILZLL = viewTd.findViewById(R.id.bak);
        this.LLIZLLLIL = (C16FS) viewTd.findViewById(R.id.cuk);
        this.LLIZ = viewTd.findViewById(R.id.video_top_bg);
        this.LLJI = viewTd.findViewById(R.id.ma2);
        this.LLJIJIL = (C1103220eoa) viewTd.findViewById(R.id.ob7);
        this.LLILLL = (ViewGroup) viewTd.findViewById(R.id.ccd);
        viewTd.findViewById(R.id.oc9);
        this.LLILZ = (ViewGroup) viewTd.findViewById(R.id.mgx);
        C417850GZz.LIZ((int) C497740JfY.LIZIZ(8.0f), this.LLJ);
        C417850GZz.LIZ((int) C497740JfY.LIZIZ(8.0f), this.LL);
        C417850GZz.LIZ((int) C497740JfY.LIZIZ(8.0f), this.LLIZ);
        C786410Ut5.LJLLLLLL(0, this.LLJI);
        C786410Ut5.LLJJJ(this.LLIZLLLIL, 0);
        this.LLJJIJIL = true;
        C786410Ut5.I7(this, this.LLJI);
        C786410Ut5.h8(this.LLIZLLLIL, this);
        this.LLILLJJLI.LLJILJIL = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "audio_interact_effect.webp");
        C1324720kZq c1324720kZq = this.LL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        }
        C1126540fQC c1126540fQC = this.LLILLJJLI;
        if (c1126540fQC != null) {
            C786410Ut5.LLJJI(c1126540fQC, 0);
            this.LLILLJJLI.LJII();
        }
        if (!this.LLJILJILJ) {
            ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
            C1121670fIL.LJII(this.LL, avatarThumb, new C1291830jin(0.74698794f));
            ImageView imageView = this.LLILZIL;
            C1121670fIL.LJIILIIL(imageView, avatarThumb, imageView.getWidth(), this.LLILZIL.getHeight(), R.drawable.el_);
            this.LLJILJILJ = true;
        }
        ImageView imageView2 = this.LLILZIL;
        if (imageView2 != null) {
            C786410Ut5.LJZI(0, imageView2);
        }
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        this.LLJILJILJ = false;
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, GameLinkGuestMuteAudioEvent.class, new AObjectS358S0100000_15(this, 85));
            dataChannel.EQ2(this, MultiGuestAudioVolumeEvent.class, new AObjectS358S0100000_15(this, 86));
        }
        C786410Ut5.K8(this.LLJIJIL, this);
        if (this.LLJJIII != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" onCreateView isAudioEnable = ");
            sbLIZ.append(this.LLJJIII.LJIIIZ);
            C20441214yg.LJIIIZ("GameLinkMediaManageFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC924460aAG interfaceC924460aAG = this.LLJJJJLIIL;
        if (interfaceC924460aAG != null) {
            interfaceC924460aAG.Fe(this.LLJJL);
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    public static GameLinkMediaManageFragment NR(GameLinkMediaManagePanel gameLinkMediaManagePanel, DataChannel dataChannel, String str, String str2, InterfaceC924460aAG interfaceC924460aAG) {
        C20441214yg.LJIIIZ("GameLinkMediaManageFragment", C786410Ut5.j4("newInstance: dialog=%s,dataChannel=%s,openSource=%sguestInviteType=%s", new Object[]{gameLinkMediaManagePanel, dataChannel, str, str2}));
        GameLinkMediaManageFragment gameLinkMediaManageFragment = new GameLinkMediaManageFragment();
        gameLinkMediaManageFragment.LLJILJIL = gameLinkMediaManagePanel;
        gameLinkMediaManageFragment.LLJILLL = dataChannel;
        gameLinkMediaManageFragment.LLJJJ = str;
        gameLinkMediaManageFragment.LLJJJIL = str2;
        gameLinkMediaManageFragment.LLJJJJLIIL = interfaceC924460aAG;
        return gameLinkMediaManageFragment;
    }
}
