package com.bytedance.android.live.broadcast;

import X.C001A;
import X.C098200Yq;
import X.C0IGR;
import X.C0IP3;
import X.C0IUA;
import X.C0J3M;
import X.C0JT6;
import X.C1148040fys;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C128Y;
import X.C1563370qml;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AKO;
import X.C465520INi;
import X.C480040Is6;
import X.C480790ItJ;
import X.C480800ItK;
import X.C771340UNo;
import X.C776250Uch;
import X.C930850aKZ;
import X.C931010aKp;
import X.C931020aKq;
import X.C931040aKs;
import X.C931210aL9;
import X.C931360aLO;
import X.C931430aLV;
import X.EnumC682280QpW;
import X.InterfaceC500940Jki;
import X.InterfaceC772190UQv;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.broadcast.api.ILiveBroadcastLifecycleExposed;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.game.model.AccessRecallMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseBroadcastFragment extends BaseFragment implements C1AKO, C0IP3 {
    public DataChannel LL;
    public boolean LLILLJJLI;
    public Room LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public void OR() {
    }

    public boolean SR() {
        return false;
    }

    public void UR() {
    }

    public void VR(int i, int i2, Intent intent) {
    }

    public View ZR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void bS() {
    }

    public void cS() {
    }

    public void dS() {
    }

    @Override // X.C1AKO
    public void finish() {
    }

    public void gS() {
    }

    @Override // X.C1AKO
    public Fragment getFragment() {
        return this;
    }

    public void hS() {
    }

    public void iS(View view) {
    }

    public void kS() {
    }

    public final void NR() {
        IMessageManager iMessageManager;
        if (this.LLILZIL || this.LL == null || (iMessageManager = (IMessageManager) getDataChannel().gg0(C776250Uch.class)) == null) {
            return;
        }
        this.LLILZIL = true;
        iMessageManager.addMessageListener(C001A.ACCESS_RECALL_MESSAGE.getIntType(), new OnIMMessageListener() { // from class: X.0ItL
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "LIVE_BAN_CAPABILITY";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                if (iMessage instanceof AccessRecallMessage) {
                    BaseBroadcastFragment baseBroadcastFragment = this.LL;
                    AccessRecallMessage accessRecallMessage = (AccessRecallMessage) iMessage;
                    if (baseBroadcastFragment.LL != null) {
                        C0KX8 c0kx8 = (C0KX8) baseBroadcastFragment.getDataChannel().gg0(LiveBanCapabilityChannel.class);
                        if (c0kx8 != null) {
                            c0kx8.LJI = accessRecallMessage.scene;
                        }
                        String str = accessRecallMessage.scene;
                        boolean z = false;
                        switch (str.hashCode()) {
                            case -1980625194:
                                if (str.equals("STICKERS")) {
                                    if (c0kx8 == null) {
                                        return;
                                    }
                                    if (accessRecallMessage.status == 1) {
                                        z = true;
                                    }
                                    c0kx8.LIZJ = z;
                                }
                                baseBroadcastFragment.getDataChannel().zW(LiveBanCapabilityChannel.class, c0kx8);
                            case -1723429900:
                                if (str.equals("DRAW_AND_GUESS")) {
                                    if (c0kx8 == null) {
                                        return;
                                    }
                                    if (accessRecallMessage.status == 1) {
                                        z = true;
                                    }
                                    c0kx8.LIZ = z;
                                }
                                baseBroadcastFragment.getDataChannel().zW(LiveBanCapabilityChannel.class, c0kx8);
                            case -1689642695:
                                if (str.equals("LIVE_INTRO")) {
                                    if (c0kx8 == null) {
                                        return;
                                    }
                                    if (accessRecallMessage.status == 1) {
                                        z = true;
                                    }
                                    c0kx8.LIZIZ = z;
                                }
                                baseBroadcastFragment.getDataChannel().zW(LiveBanCapabilityChannel.class, c0kx8);
                            case -37181579:
                                if (str.equals("COMMENT_PIN")) {
                                    if (c0kx8 == null) {
                                        return;
                                    }
                                    if (accessRecallMessage.status == 1) {
                                        z = true;
                                    }
                                    c0kx8.LJ = z;
                                }
                                baseBroadcastFragment.getDataChannel().zW(LiveBanCapabilityChannel.class, c0kx8);
                            case 2461631:
                                if (str.equals("POLL")) {
                                    if (c0kx8 == null) {
                                        return;
                                    }
                                    if (accessRecallMessage.status == 1) {
                                        z = true;
                                    }
                                    c0kx8.LIZLLL = z;
                                }
                                baseBroadcastFragment.getDataChannel().zW(LiveBanCapabilityChannel.class, c0kx8);
                        }
                        if (c0kx8 == null) {
                            return;
                        }
                        baseBroadcastFragment.getDataChannel().zW(LiveBanCapabilityChannel.class, c0kx8);
                    }
                }
            }
        });
    }

    public final Room PR() {
        Room room = this.LLILLL;
        if (room != null) {
            return room;
        }
        return null;
    }

    public void aS() {
        ILiveBroadcastLifecycleExposed iLiveBroadcastLifecycleExposed = (ILiveBroadcastLifecycleExposed) C1161920gLG.LIZJ(ILiveBroadcastLifecycleExposed.class);
        if (iLiveBroadcastLifecycleExposed != null) {
            iLiveBroadcastLifecycleExposed.onLiveDestroy();
        }
    }

    public final DataChannel getDataChannel() {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            return dataChannel;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C465520INi.LIZ.Vu2();
        C480790ItJ.LIZ = false;
        C480800ItK.LIZ = false;
        int i = C771340UNo.LIZ;
        ((ArrayList) C771340UNo.LIZJ).remove(C0J3M.LIVE);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.IQ2(C1148040fys.class);
        dataChannelGlobal.IQ2(C931010aKp.class);
        dataChannelGlobal.IQ2(C931360aLO.class);
        dataChannelGlobal.IQ2(C931210aL9.class);
        dataChannelGlobal.IQ2(C931020aKq.class);
        dataChannelGlobal.IQ2(C931040aKs.class);
        dataChannelGlobal.IQ2(C1148310fzJ.class);
        dataChannelGlobal.IQ2(C931430aLV.class);
        ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).leaveLive();
        C0IUA.LIZLLL();
        dataChannelGlobal.zQ2(this);
        getDataChannel().zQ2(this);
        LiveHostAutoAdaptiveParams.restore();
        LiveHostPerfAutoAdaptiveSetting.setLiveHost(false);
        C480040Is6.LIZ = false;
        LiveBroadcastPictureMemOpt.INSTANCE.setAnchor(false);
        C0JT6<Boolean> c0jt6 = InterfaceC772190UQv.O3;
        Boolean bool = Boolean.FALSE;
        c0jt6.LIZJ(bool);
        ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).stopIllegalActivityMethodCallCheck(this);
        super.onDestroy();
        if (this.LLILLJJLI) {
            return;
        }
        aS();
        dataChannelGlobal.JQ2(C930850aKZ.class, bool);
    }

    public final long RR() {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            return interfaceC500940JkiUser.getCurrentUserId();
        }
        return 0L;
    }

    public final long getRoomId() {
        return PR().getId();
    }

    @Override // X.C1AKO
    public boolean onBackPressed() {
        C0IGR c0igr;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        C0IGR c0igr2;
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
            for (C128Y c128y : listLJJLIIIJL) {
                if ((c128y instanceof C0IGR) && (c0igr2 = (C0IGR) c128y) != null && c0igr2.onBackPressed()) {
                    return true;
                }
            }
        }
        for (C128Y c128y2 : getChildFragmentManager().LJJLIIIJL()) {
            if ((c128y2 instanceof C0IGR) && (c0igr = (C0IGR) c128y2) != null && c0igr.onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.LLILLJJLI) {
            return;
        }
        bS();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LLILLJJLI) {
            return;
        }
        cS();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean zLJI = MethodIDManager.LJI(196764);
        super.onResume();
        OR();
        if (this.LLILLJJLI) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            dS();
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.LLILLJJLI) {
            return;
        }
        gS();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LLILLJJLI) {
            return;
        }
        hS();
    }

    @Override // X.C0IP3
    public DataChannel provideDataChannel() {
        return getDataChannel();
    }

    public void WR(Bundle bundle) {
        ILiveBroadcastLifecycleExposed iLiveBroadcastLifecycleExposed = (ILiveBroadcastLifecycleExposed) C1161920gLG.LIZJ(ILiveBroadcastLifecycleExposed.class);
        if (iLiveBroadcastLifecycleExposed != null) {
            iLiveBroadcastLifecycleExposed.onLiveCreate();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        if (this.LLILLJJLI) {
            return;
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(51);
        }
        if (!SR() && !Room.isValid(PR())) {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                C1563370qml.LIZ(activity2, EnumC682280QpW.FINISH, new AwS551S0100000_7(this, 2));
            }
            this.LLILLJJLI = true;
            return;
        }
        UR();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fd  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.BaseBroadcastFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLILLJJLI) {
            return;
        }
        iS(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.LLILLJJLI) {
            return;
        }
        VR(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewZR;
        C19GS c19gs = null;
        if (this.LLILLJJLI) {
            viewZR = null;
        } else {
            viewZR = ZR(layoutInflater, viewGroup);
        }
        if (!(viewZR instanceof View)) {
            viewZR = null;
        }
        if (viewZR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewZR, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewZR, this);
                viewZR.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewZR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewZR;
    }
}
