package com.bytedance.android.live.liveinteract.voicechat.main.link.guest;

import X.AbstractC928510aGn;
import X.AbstractC929640aIc;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IMT;
import X.C0K04;
import X.C0KVU;
import X.C0UTB;
import X.C0UTD;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1117360fBO;
import X.C11L5;
import X.C12ES;
import X.C1304660k3U;
import X.C1338270kvh;
import X.C14KS;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C1954807lC;
import X.C19748512Ol;
import X.C19EG;
import X.C19GN;
import X.C19GO;
import X.C19GS;
import X.C19ME;
import X.C20441214yg;
import X.C2095008Iq;
import X.C21382118m3;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C305801Gm;
import X.C307001Gy;
import X.C410901il;
import X.C418440Gaw;
import X.C439101nJ;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C520010KaN;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C914810Zuh;
import X.C915980Zwa;
import X.C917750ZzR;
import X.C917930Zzj;
import X.C921170a4x;
import X.C921180a4y;
import X.C922800a7a;
import X.C923650a8x;
import X.C924630aAX;
import X.C924790aAn;
import X.C924810aAp;
import X.C924980aB6;
import X.C925600aC6;
import X.C925640aCA;
import X.C925770aCN;
import X.C926520aDa;
import X.C926610aDj;
import X.C926630aDl;
import X.C926650aDn;
import X.C927600aFK;
import X.C929630aIb;
import X.C930540aK4;
import X.C930940aKi;
import X.C933980aPc;
import X.C936690aTz;
import X.C937140aUi;
import X.C945740aia;
import X.C945770aid;
import X.C948450amx;
import X.C950220apo;
import X.C951190arN;
import X.C963140bAe;
import X.C986860bmu;
import X.DialogInterfaceOnClickListenerC986970bn5;
import X.EnumC926600aDi;
import X.EnumC928480aGk;
import X.EnumC929650aId;
import X.InterfaceC500100JjM;
import X.InterfaceC917640ZzG;
import X.InterfaceC923660a8y;
import X.InterfaceC923710a93;
import X.InterfaceC924020a9Y;
import X.InterfaceC925780aCO;
import X.InterfaceC928000aFy;
import X.InterfaceC929970aJ9;
import X.InterfaceC948490an1;
import X.InterfaceC954180awC;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS150S0100000_15;
import Y.ALAdapterS10S0200000_15;
import Y.ARunnableS113S0100000_13;
import Y.AfS184S0100000_15;
import Y.AfS3S0000100_15;
import Y.AfS5S0100100_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestLinkPlayerListChange;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestHangupRoomIdsChannel;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyHangupSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGuestPanelUiOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnhanceInviteSenseSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicFixListByTypeParams;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatUserInfoFragment extends LiveBaseFragment implements InterfaceC929970aJ9, InterfaceC925780aCO, C0IMT<Integer> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zzk8ISYpKiHELIOScyPGshKCY9ZiklJyR9LzApOjt9HiolKioQICQ4HDw2OgwiLyAVOiQrJCo9PA==";
    public final boolean LL;
    public int LLILLJJLI;
    public LiveDialogFragment LLILLL;
    public RecyclerView LLILZ;
    public final C1117360fBO LLILZIL;
    public C16FS LLILZLL;
    public C16F5 LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public C0UTB LLJI;
    public final C01GW LLJIJIL;
    public C0UTD LLJILJIL;
    public DataChannel LLJILJILJ;
    public EnumC926600aDi LLJILLL;
    public AbstractC929640aIc LLJJ;
    public WeakReference<C923650a8x> LLJJI;
    public C925770aCN LLJJIII;
    public LiveIconView LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public View LLJJIJIL;
    public final C410901il LLJJJ;
    public final C410901il LLJJJIL;
    public int LLJJJJ;
    public C945740aia LLJJJJJIL;
    public ConstraintLayout LLJJJJLIIL;
    public RunnableC781530UlD LLJJL;
    public final C951190arN LLJJLIIIJLLLLLLLZ;
    public C16F5 LLJL;
    public C16F5 LLJLIL;
    public String LLJLILLLLZIIL;
    public final int LLJLL;
    public List<GuestApplyStillInLineResponse.GuestApplyItem> LLJLLIL;
    public List<GuestApplyStillInLineResponse.GuestInvitedItem> LLJLLL;
    public final InterfaceC917640ZzG LLJZ;
    public final C01GW LLJZIJLIL;
    public C19GN LLL;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    @Override // X.InterfaceC925780aCO
    public final /* synthetic */ void Kh(Throwable th) {
    }

    @Override // X.InterfaceC925780aCO
    public final /* synthetic */ void ht() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object[] objArr;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/voicechat/main/link/guest/VoiceChatUserInfoFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6kAPO0QJ+wVzIleUjngcRPaIdiHtxz/wc1YKwucOWmV5Pjas6gfOG5kMn9RZ60lxcpldRQ==", null)));
        if (c0wsuLIZIZ.LIZ || (objArr = c0wsuLIZIZ.LIZJ) == null || (obj = objArr[0]) == null) {
            return;
        }
        ((Boolean) obj).booleanValue();
    }

    public final MultiGuestDataHolder PR() {
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    public final void cS() {
        C16FS c16fs = this.LLILZLL;
        if (c16fs != null) {
            c16fs.setClickable(true);
        }
        if (UR()) {
            mS(null);
        } else {
            C16F5 c16f5 = this.LLIZLLLIL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131842120));
            }
        }
        ConstraintLayout constraintLayout = this.LLJJJJLIIL;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(0, constraintLayout);
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, 8);
        C945740aia c945740aia = this.LLJJJJJIL;
        (c945740aia != null ? c945740aia : null).LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS() {
        /*
            r6 = this;
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.LLJJJJLIIL
            r5 = 0
            if (r1 != 0) goto L6
            r1 = r5
        L6:
            r0 = 0
            X.C786410Ut5.LL(r0, r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.LLILZ
            if (r1 != 0) goto Lf
            r1 = r5
        Lf:
            r0 = 8
            X.C786410Ut5.LLIZLLLIL(r1, r0)
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveRoomMatchConfigSetting.isEnableRandomMatch()
            if (r0 == 0) goto La8
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LLJILJILJ
            if (r1 == 0) goto La8
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestFirstApplyFromNormalRoom> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestFirstApplyFromNormalRoom.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La8
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r6.LLJILJILJ
            if (r2 == 0) goto L37
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestFirstApplyFromNormalRoom> r1 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestFirstApplyFromNormalRoom.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.zW(r1, r0)
        L37:
            X.0INV r0 = X.C0IL2.LIZ
            com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r0 = r0.LIZ()
            if (r0 == 0) goto La5
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r4 = r0.mEnterRoomConfig
            if (r4 == 0) goto La6
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r4.mRoomsData
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.isFromMgTopLive
        L49:
            java.lang.String r1 = "1"
            boolean r3 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r4 == 0) goto La3
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r4.mRoomsData
            if (r0 == 0) goto La3
            java.lang.String r0 = r0.enterForMultiLive
        L57:
            boolean r2 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r4 == 0) goto La1
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r4.mRoomsData
            if (r0 == 0) goto La1
            java.lang.String r1 = r0.actionTypeForMultiLive
        L63:
            java.lang.String r0 = "5"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r3 == 0) goto La8
            if (r2 == 0) goto La8
            if (r0 == 0) goto La8
            X.16F5 r1 = r6.LLIZLLLIL
            if (r1 == 0) goto L7d
            r0 = 2131854564(0x7f1184e4, float:1.9342807E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
        L7d:
            X.16F5 r1 = r6.LLJ
            if (r1 == 0) goto L8b
            r0 = 2131854563(0x7f1184e3, float:1.9342805E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
        L8b:
            X.0aia r1 = r6.LLJJJJJIL
            if (r1 != 0) goto L90
            r1 = r5
        L90:
            X.0aCN r0 = r6.LLJJIII
            if (r0 == 0) goto L9a
            boolean r0 = r0.LJFF
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L9a:
            X.C500260Jjc.LJJJI(r5)
            r1.LJI()
            return
        La1:
            r1 = r5
            goto L63
        La3:
            r0 = r5
            goto L57
        La5:
            r4 = r5
        La6:
            r0 = r5
            goto L49
        La8:
            X.16F5 r1 = r6.LLIZLLLIL
            if (r1 == 0) goto L8b
            r0 = 2131842119(0x7f115447, float:1.9317565E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment.dS():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gS() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C16FS c16fs = this.LLILZLL;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
        C16FS c16fs2 = this.LLILZLL;
        if (c16fs2 != null) {
            c16fs2.setClickable(true);
        }
        C924790aAn.LIZLLL();
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null) {
            if (num.intValue() == 0) {
                if (this.LLJILLL == EnumC926600aDi.GO_LIVE) {
                    aS(C497740JfY.LJIJI(2131851630));
                    NR(R.style.a7g);
                    return;
                }
                NR(R.style.a7g);
                aS(UR() ? C497740JfY.LJIJI(2131853891) : C497740JfY.LJIJI(2131843980));
                C16F5 c16f5 = this.LLIZ;
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 0);
                }
                iS();
                C16FS c16fs3 = this.LLILZLL;
                if (c16fs3 != null) {
                    C12ES.LJIILL(0, c16fs3);
                    return;
                }
                return;
            }
            if (num.intValue() != 2) {
                if (num.intValue() == 1) {
                    hS();
                    return;
                }
                return;
            }
            C16FS c16fs4 = this.LLILZLL;
            if (c16fs4 != null) {
                C12ES.LJIILL(0, c16fs4);
            }
            NR(R.style.a82);
            aS(C497740JfY.LJIJI(2131841435));
            C16FS c16fs5 = this.LLILZLL;
            ViewGroup.LayoutParams layoutParams = c16fs5 != null ? c16fs5.getLayoutParams() : null;
            if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.bottomMargin = 28;
            C16FS c16fs6 = this.LLILZLL;
            if (c16fs6 != null) {
                C786410Ut5.x6(c16fs6, marginLayoutParams);
            }
            C16F5 c16f52 = this.LLIZ;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 8);
            }
        }
    }

    public final void iS() {
        int i;
        Integer num;
        C19ME c19me;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJZIJLIL.getValue();
        C917930Zzj c917930Zzj = assemViewModel != null ? (C917930Zzj) assemViewModel.getState() : null;
        if (c917930Zzj != null) {
            i = c917930Zzj.LL;
            num = c917930Zzj.LLILLJJLI;
        } else {
            i = 0;
            num = null;
        }
        String strLIZLLL = C917750ZzR.LIZLLL(i, num);
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            c16f5.setText(strLIZLLL);
        }
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(8.0f), recyclerView);
        if (!this.LL) {
            ConstraintLayout constraintLayout = this.LLJJJJLIIL;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
                return;
            } else {
                c19me.bottomToTop = R.id.ja3;
            }
        }
        if (!LinkMicGuestPanelUiOptSetting.isEnabled()) {
            C16F5 c16f52 = this.LLJ;
            if (c16f52 != null) {
                C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(16.0f), c16f52);
                return;
            }
            return;
        }
        C16F5 c16f53 = this.LLJ;
        if (c16f53 != null) {
            C500260Jjc.LJJLJ(0, c16f53);
        }
        ConstraintLayout constraintLayout2 = this.LLJJJJLIIL;
        ConstraintLayout constraintLayout3 = constraintLayout2 != null ? constraintLayout2 : null;
        constraintLayout3.setPadding(constraintLayout3.getPaddingStart(), constraintLayout3.getPaddingTop(), constraintLayout3.getPaddingEnd(), (int) C497740JfY.LIZIZ(32.0f));
    }

    public final void o() {
        C19GN c19gn;
        C19GN c19gn2 = this.LLL;
        if (c19gn2 != null && c19gn2.isShowing() && (c19gn = this.LLL) != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
        }
        C19GO c19go = new C19GO(getContext());
        c19go.LJI(2131844676);
        c19go.LIZIZ(2131844677);
        c19go.LJ(2131844675, new DialogInterfaceOnClickListenerC986970bn5(this, 3), false);
        c19go.LIZJ(2131843825, new DialogInterface.OnClickListener() { // from class: X.0aIq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, false);
        C19GN c19gnLIZ = c19go.LIZ();
        this.LLL = c19gnLIZ;
        c19gnLIZ.setCanceledOnTouchOutside(false);
        C19GN c19gn3 = this.LLL;
        if (c19gn3 != null) {
            C926630aDl.LIZ(c19gn3, 5, true, false, false, 120);
        }
        C19GN c19gn4 = this.LLL;
        if (c19gn4 != null) {
            C786410Ut5.M4(c19gn4);
        }
        VR(this, "show");
    }

    @Override // X.InterfaceC925780aCO
    public final void oE() {
        InterfaceC917640ZzG interfaceC917640ZzG = this.LLJZ;
        if (interfaceC917640ZzG != null) {
            interfaceC917640ZzG.LJIJJ(C950220apo.LJFF(), "anchor_invite_guest");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        LiveDialogFragment liveDialogFragment = this.LLILLL;
        if (liveDialogFragment == null) {
            return true;
        }
        liveDialogFragment.dismissAllowingStateLoss();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        final C923650a8x c923650a8x;
        long id;
        long ownerUserId;
        InterfaceC500100JjM interfaceC500100JjM;
        WeakReference<C923650a8x> weakReference;
        final C923650a8x c923650a8x2;
        String strU3;
        Long lLJIILIIL;
        super.onResume();
        if (this.LL && (weakReference = this.LLJJI) != null && (c923650a8x2 = weakReference.get()) != null) {
            GuestApplyStillInLineParams guestApplyStillInLineParams = new GuestApplyStillInLineParams();
            guestApplyStillInLineParams.userId = UserService.getInstance().user().getCurrentUserId();
            Long lLJIIJ = C930540aK4.LJIIJ();
            guestApplyStillInLineParams.roomId = lLJIIJ != null ? lLJIIJ.longValue() : 0L;
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            guestApplyStillInLineParams.channelId = (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) == null) ? 0L : lLJIILIIL.longValue();
            C480460Ism.LIZ().getClass();
            InterfaceC500100JjM interfaceC500100JjM2 = (InterfaceC500100JjM) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).getStillInLineData(guestApplyStillInLineParams).LJIILIIL(new C11L5() { // from class: X.0a7Q
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C11L5
                public final void accept(Object obj, Object obj2) {
                    GuestApplyStillInLineResponse.ResponseData responseData;
                    BaseResponse baseResponse = (BaseResponse) obj;
                    if (baseResponse != null && (responseData = (GuestApplyStillInLineResponse.ResponseData) baseResponse.data) != null) {
                        DataChannel dataChannel = c923650a8x2.dataChannel;
                        if (dataChannel != null) {
                            List<GuestApplyStillInLineResponse.GuestApplyItem> list = responseData.guestApplyList;
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            Iterator<GuestApplyStillInLineResponse.GuestApplyItem> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Long.valueOf(it2.next().roomId));
                            }
                            dataChannel.zW(MultiGuestHangupRoomIdsChannel.class, arrayList);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchStillInLineData guestApplyList.size=");
                        sbLIZ.append(responseData.guestApplyList.size());
                        C20441214yg.LIZIZ("VoiceChatWatchPresenter", C2188811AlT.LIZIZ(sbLIZ));
                        C928400aGc.LLIZ = responseData.guestApplyList.size();
                        C928340aGW.LLIZ = responseData.guestInvitedList.size();
                    }
                }
            }).LIZLLL(c923650a8x2.autoDisposeWithTransformer());
            if (interfaceC500100JjM2 != null) {
                interfaceC500100JjM2.LIZ(new AfS184S0100000_15(this, 252), new C09JN() { // from class: X.00R8
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("VoiceChatUserInfoFragment@8dfc.fetchStillInLineList$3");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchStillInLineList fail: ");
                        sbLIZ.append(((Throwable) obj).getMessage());
                        C20441214yg.LJ("VoiceChatUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("VoiceChatUserInfoFragment@8dfc.fetchStillInLineList$3");
                    }
                });
            }
        }
        WeakReference<C923650a8x> weakReference2 = this.LLJJI;
        if (weakReference2 == null || (c923650a8x = weakReference2.get()) == null || c923650a8x.mView == 0) {
            return;
        }
        try {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
                ownerUserId = room.getOwnerUserId();
            } else {
                id = 0;
                ownerUserId = 0;
            }
            if (!(id != 0)) {
                throw new IllegalStateException("Check failed.");
            }
            if (ownerUserId == 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
                long jLIZIZ = C963140bAe.LIZIZ();
                List listLJIIJJI = C1697810uHb.LJIIJJI(1, 2, 11);
                String json = LinkMicFixListByTypeParams.isEnable() ? GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, listLJIIJJI, new TypeToken<List<? extends Integer>>() { // from class: X.04X4
                }.getType()) : listLJIIJJI.toString();
                C480460Ism.LIZ().getClass();
                interfaceC500100JjM = (InterfaceC500100JjM) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).getListByType(id, ownerUserId, C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ()), json, 0, 0, 5, 0, 0L, null).LJIILL(new AfS5S0100100_15(jLIZIZ, c923650a8x, 16)).LJIIL(new AfS3S0000100_15(jLIZIZ, 16)).LIZLLL(c923650a8x.autoDisposeWithTransformer());
            } else {
                List listLJIIJJI2 = C1697810uHb.LJIIJJI(1, 2, 11);
                String json2 = LinkMicFixListByTypeParams.isEnable() ? GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, listLJIIJJI2, new TypeToken<List<? extends Integer>>() { // from class: X.04X3
                }.getType()) : listLJIIJJI2.toString();
                C480460Ism.LIZ().getClass();
                interfaceC500100JjM = (InterfaceC500100JjM) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).getListByType(id, ownerUserId, C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ()), json2, 0, 0, 5, 0, 0L, null).LJIILIIL(new C11L5() { // from class: X.0a7T
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.C11L5
                    public final void accept(Object obj, Object obj2) {
                        MultiLiveGuestInfoList multiLiveGuestInfoList;
                        ArrayList<LinkPlayerInfo> arrayList;
                        MultiGuestDataHolder multiGuestDataHolder;
                        BaseResponse baseResponse = (BaseResponse) obj;
                        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (arrayList = multiLiveGuestInfoList.onLineUsers) != null && (multiGuestDataHolder = c923650a8x.getMultiGuestDataHolder()) != null) {
                            multiGuestDataHolder.LJJJ = arrayList;
                        }
                    }
                }).LIZLLL(c923650a8x.autoDisposeWithTransformer());
            }
            if (interfaceC500100JjM != null) {
                interfaceC500100JjM.LIZ(new AfS184S0100000_15(this, 84), new AfS184S0100000_15(this, 85));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public VoiceChatUserInfoFragment() {
        this.LL = LinkMicApplyHangupSetting.isEnable() || MultiGuestEnhanceInviteSenseSetting.isEnabled();
        this.LLILLJJLI = -1;
        this.LLILZIL = new C1117360fBO();
        this.LLJIJIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(161));
        this.LLJJJ = new C410901il();
        this.LLJJJIL = new C410901il();
        this.LLJJLIIIJLLLLLLLZ = new C951190arN();
        this.LLJLILLLLZIIL = "outside";
        this.LLJLL = 354;
        this.LLJZIJLIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 544));
        try {
            DataChannel dataChannel = this.LLJILJILJ;
            this.LLJZ = dataChannel != null ? (InterfaceC917640ZzG) C933980aPc.LJII(dataChannel, InterfaceC917640ZzG.class) : null;
            C948450amx.LIZIZ.LIZJ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().LJIIZILJ();
            C948450amx.LIZIZ.LIZJ(this);
            C1304660k3U.LIZ.LIZIZ(70001, "LinkInjector.inject error", th, null);
        }
        C20441214yg.LIZIZ("VoiceChatUserInfoFragment", "init useFakeStateFirstTime from init");
    }

    public final void OR() {
        Room room;
        C19GN c19gn;
        C923650a8x c923650a8x;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUserLJIIJJI;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        InterfaceC917640ZzG interfaceC917640ZzG = this.LLJZ;
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUserLJIIJJI = C921170a4x.LJIIJJI(abstractC928510aGnLIZ, currentUserId)) != null) {
            C922800a7a.LIZLLL(currentUserId, "guest", "go_live_panel", PR().LJJLIIIJILLIZJL, linkListUserLJIIJJI.linkMicId);
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            this.LLJLILLLLZIIL = "disconnect_icon";
            WeakReference<C923650a8x> weakReference = this.LLJJI;
            if (weakReference == null || (c923650a8x = weakReference.get()) == null) {
                return;
            }
            InterfaceC924020a9Y.LJIJJLI.getClass();
            c923650a8x.LLJL = Intrinsics.LJFF("go_live_panel", "profile_page") ? "quick_leave_normally" : "leave_normally";
            MultiGuestFeedbackController.LJIIJ.getClass();
            InterfaceC923710a93 interfaceC923710a93LIZ = C914810Zuh.LIZ();
            if (interfaceC923710a93LIZ == null || !interfaceC923710a93LIZ.LIZIZ(new C926650aDn("go_live_panel"))) {
                c923650a8x.exitInteractInNormalWay(String.valueOf(c923650a8x.LLJL), false, 10002);
                return;
            }
            InterfaceC923660a8y interfaceC923660a8y = (InterfaceC923660a8y) c923650a8x.mView;
            if (interfaceC923660a8y != null) {
                interfaceC923660a8y.l9();
                return;
            }
            return;
        }
        C19GN c19gn2 = this.LLL;
        if (c19gn2 != null && c19gn2.isShowing() && (c19gn = this.LLL) != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
        }
        String str = EnumC929650aId.PANEL.value;
        MultiGuestSlardarMonitorOptSetting multiGuestSlardarMonitorOptSetting = MultiGuestSlardarMonitorOptSetting.INSTANCE;
        if (multiGuestSlardarMonitorOptSetting.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("type", str, jSONObject);
            C924630aAX.LIZ.LJJJLIIL(0, "leave_click", jSONObject, false);
        }
        DataChannel dataChannel = this.LLJILJILJ;
        String strLIZ = C0KVU.LIZ((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : room.getOwner());
        if (strLIZ == null) {
            strLIZ = "";
        }
        String strLJIJJ = C497740JfY.LJIJJ(2131841439, strLIZ);
        C19GO c19go = new C19GO(getContext());
        c19go.LIZLLL = strLJIJJ;
        c19go.LIZIZ(2131842392);
        c19go.LJ(2131843832, new DialogInterfaceOnClickListenerC986970bn5(this, 4), false);
        c19go.LIZJ(2131843838, new DialogInterface.OnClickListener() { // from class: X.0aIW
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C924630aAX.LJJIJ(0);
                dialogInterface.dismiss();
            }
        }, false);
        this.LLL = c19go.LIZ();
        if (multiGuestSlardarMonitorOptSetting.isEnable()) {
            C924630aAX.LIZ.LJJJLIIL(0, "leave_popup_show", new JSONObject(), false);
        }
        C19GN c19gn3 = this.LLL;
        if (c19gn3 != null) {
            C926630aDl.LIZ(c19gn3, 5, true, false, false, 120);
        }
        C19GN c19gn4 = this.LLL;
        if (c19gn4 != null) {
            C786410Ut5.M4(c19gn4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void SR() {
        Context context;
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initApplyState useFakeStateFirstTime:");
        sbLIZ.append(false);
        C20441214yg.LIZIZ("VoiceChatUserInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
        gS();
        if (num != null) {
            if (num.intValue() == 1) {
                dS();
            } else if (num.intValue() == 0 || num.intValue() == -1) {
                cS();
            }
        }
        C925770aCN c925770aCN = this.LLJJIII;
        if (c925770aCN != null && c925770aCN.LIZJ == 6 && (context = getContext()) != null) {
            RR(context);
        }
        C924790aAn.LIZLLL().LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean UR() {
        return (C924790aAn.LIZLLL().LJ() || ((Integer) C924790aAn.LIZLLL().LIZIZ).intValue() == -1) && C924810aAp.LJ().LJJJJLI;
    }

    @Override // X.InterfaceC925780aCO
    public final void ZK() {
        DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ;
        LiveDialogFragment liveDialogFragment;
        C305801Gm.LIZIZ(2131842112);
        C925770aCN c925770aCN = this.LLJJIII;
        if ((c925770aCN == null || (c925770aCN.LIZJ != 0 && c925770aCN.LIZJ != 1 && c925770aCN.LIZJ != 6 && c925770aCN.LIZJ != 15)) && (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ()) != null) {
            boolean z = deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZLLL == 2;
            deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZLLL = -1;
            if (!z && (liveDialogFragment = this.LLILLL) != null) {
                liveDialogFragment.dismiss();
            }
        }
        PR().LJI = System.currentTimeMillis();
        DataChannel dataChannel = this.LLJILJILJ;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomGuestApplySucceedEvent.class, new Pair("", Boolean.FALSE));
        }
        gS();
        dS();
    }

    public final void hS() {
        NR(R.style.a85);
        aS(C497740JfY.LJIJI(2131840602));
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        iS();
        C16FS c16fs = this.LLILZLL;
        if (c16fs != null) {
            C12ES.LJIILL(0, c16fs);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C923650a8x c923650a8x;
        C19GN c19gn;
        Integer num;
        super.onDestroy();
        C925770aCN c925770aCN = this.LLJJIII;
        if (c925770aCN != null && c925770aCN.LIZJ == 2 && ((num = (Integer) C924790aAn.LIZLLL().LIZIZ) == null || num.intValue() != 1)) {
            C925600aC6.LJIJJLI("in_liveroom");
        }
        C19GN c19gn2 = this.LLL;
        if (c19gn2 != null && c19gn2.isShowing() && (c19gn = this.LLL) != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
        }
        WeakReference<C923650a8x> weakReference = this.LLJJI;
        if (weakReference != null && (c923650a8x = weakReference.get()) != null) {
            c923650a8x.LLIZLLLIL = null;
        }
        AbstractC929640aIc abstractC929640aIc = this.LLJJ;
        if (abstractC929640aIc != null) {
            abstractC929640aIc.LIZIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJJJ.clear();
        this.LLJJJIL.clear();
    }

    @Override // X.InterfaceC925780aCO
    public final LiveDialogFragment getDialog() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC925780aCO
    public final void BP(Throwable th) {
        DataChannel dataChannel = this.LLJILJILJ;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomGuestReplyFailedEvent.class, "");
        }
        C501540Jlg.LIZJ(C497740JfY.LJII(), th);
        LiveDialogFragment liveDialogFragment = this.LLILLL;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
    }

    public final void NR(int i) {
        C16FS c16fs;
        C16FS c16fs2 = this.LLILZLL;
        if (c16fs2 != null) {
            c16fs2.j0(i);
        }
        if (LinkMicGuestPanelUiOptSetting.isEnabled() && (c16fs = this.LLILZLL) != null) {
            c16fs.setRadius((int) C497740JfY.LIZIZ(999.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RR(Context context) {
        AbstractC929640aIc abstractC929640aIc;
        C20441214yg.LIZIZ("VoiceChatUserInfoFragment", "handleConnect");
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        EnumC926600aDi enumC926600aDi = this.LLJILLL;
        if (enumC926600aDi != null && C926610aDj.LIZ[enumC926600aDi.ordinal()] == 1 && num != null && num.intValue() == 0 && (abstractC929640aIc = this.LLJJ) != null && !abstractC929640aIc.LJIIIIZZ()) {
            WR(context, 0, false);
        }
    }

    public final void aS(CharSequence charSequence) {
        C16FS c16fs;
        C16FS c16fs2;
        if ((!LinkMicGuestPanelUiOptSetting.isEnabled() || (c16fs2 = this.LLILZLL) == null || c16fs2.isEnabled()) && (c16fs = this.LLILZLL) != null) {
            c16fs.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bS(int i) {
        String strLJIJI;
        String strLJIIL;
        Integer num;
        if (i == this.LLILLJJLI) {
            return;
        }
        if (!UR() && i <= 0 && (num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && num.intValue() == 1) {
            i = 1;
        }
        this.LLILLJJLI = i;
        if (UR()) {
            C16F5 c16f5 = this.LLJ;
            if (c16f5 != null) {
                int i2 = this.LLILLJJLI;
                if (i2 == 0) {
                    strLJIIL = C497740JfY.LJIJI(2131853890);
                } else {
                    strLJIIL = C497740JfY.LJIIL(2131755905, i2, Integer.valueOf(i2));
                }
                c16f5.setText(strLJIIL);
            }
        } else {
            C16F5 c16f52 = this.LLJ;
            if (c16f52 != null) {
                int i3 = this.LLILLJJLI;
                if (i3 != 0) {
                    if (i3 != 1) {
                        strLJIJI = C497740JfY.LJIIL(2131755543, 2, Integer.valueOf(i3));
                    } else {
                        strLJIJI = C497740JfY.LJIIL(2131755543, 1, 1);
                    }
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131842117);
                }
                c16f52.setText(strLJIJI);
            }
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJ, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.addListener(new ALAdapterS10S0200000_15(objectAnimatorOfFloat, this, 7));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void eg(Throwable th) {
        C501540Jlg.LIZLLL(getContext(), th, 2131853460);
    }

    public final void mS(Long l) {
        C16F5 c16f5 = this.LLIZLLLIL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131853892));
        }
        aS(C497740JfY.LJIJI(2131853891));
        if (l != null) {
            bS((int) l.longValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().LIZ(this, new C986860bmu(this, 2));
    }

    @Override // X.C0IMT
    public final void onChanged(Integer num) {
        Integer num2 = num;
        if (num2 != null) {
            if (num2.intValue() == 1) {
                dS();
            } else if (num2.intValue() == 0) {
                cS();
            }
        }
        gS();
    }

    @Override // X.InterfaceC925780aCO
    public final void zo(Throwable th) {
        C501540Jlg.LIZLLL(getContext(), th, 2131853452);
        gS();
        cS();
    }

    public static void VR(VoiceChatUserInfoFragment voiceChatUserInfoFragment, String str) {
        long jCurrentTimeMillis;
        MultiGuestDataHolder multiGuestDataHolderPR = voiceChatUserInfoFragment.PR();
        if (multiGuestDataHolderPR != null) {
            jCurrentTimeMillis = multiGuestDataHolderPR.LJI;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        C925640aCA.LJIIZILJ(str, System.currentTimeMillis() - jCurrentTimeMillis, 0L, "apply", null, null, 0, 0, null, null, null, 2032);
        if (Intrinsics.LJFF(str, "click")) {
            voiceChatUserInfoFragment.PR().LJI = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void WR(Context context, int i, boolean z) {
        boolean z2;
        C925770aCN c925770aCN;
        FragmentManager fragmentManager;
        LiveDialogFragment liveDialogFragment;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
        C925770aCN c925770aCN2 = this.LLJJIII;
        c927600aFKLIZ.getClass();
        if (C927600aFK.LJIILJJIL(c925770aCN2) && !z) {
            this.LLJI = new C0UTB();
            this.LLJILJIL = new C0UTD(C520010KaN.LJIJ(context, true), this.LLJILJILJ, new AwS379S0200000_13(this, context, 1), new AwS559S0100000_15(this, 547), i, 32);
        }
        C0UTB c0utb = this.LLJI;
        if (c0utb != null) {
            C0UTD c0utd = this.LLJILJIL;
            if (c0utd == null) {
                c0utd = null;
            }
            if (c0utb.LIZ(c0utd, false)) {
                return;
            }
        }
        InterfaceC928000aFy interfaceC928000aFy = (InterfaceC928000aFy) this.LLJIJIL.getValue();
        C0UTD c0utd2 = this.LLJILJIL;
        if (c0utd2 == null) {
            c0utd2 = null;
        }
        if (interfaceC928000aFy.LIZ(c0utd2, false)) {
            return;
        }
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        C925770aCN c925770aCN3 = this.LLJJIII;
        if (c925770aCN3 != null && c925770aCN3.LIZJ == 1 && ((Number) C924790aAn.LIZLLL().LIZIZ).intValue() < 1 && (fragmentManager = getFragmentManager()) != null && (liveDialogFragment = this.LLILLL) != null) {
            liveDialogFragment.show(fragmentManager, "VoiceChatGuestUserInfoDialog");
        }
        C0UTD c0utd3 = this.LLJILJIL;
        if (c0utd3 == null) {
            c0utd3 = null;
        }
        c0utd3.LJ = i;
        C924630aAX.LJIJJLI();
        MultiGuestDataHolder multiGuestDataHolderPR = PR();
        AbstractC929640aIc abstractC929640aIc = this.LLJJ;
        if (abstractC929640aIc != null && abstractC929640aIc.LJII() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        multiGuestDataHolderPR.LJJIIZI(!z2);
        AbstractC929640aIc abstractC929640aIc2 = this.LLJJ;
        if (abstractC929640aIc2 != null) {
            abstractC929640aIc2.LJIILJJIL(C924790aAn.LIZLLL().LJIIL);
        }
        C925770aCN c925770aCN4 = this.LLJJIII;
        if (c925770aCN4 == null) {
            this.LLJJIII = new C925770aCN(null, 0, 0, false, i, false, 0, 0L, null, 0L, null, 8175);
        } else {
            c925770aCN4.LJ = i;
            c925770aCN4.LJI = C917750ZzR.LIZ;
        }
        C0UTD c0utd4 = this.LLJILJIL;
        if (c0utd4 == null) {
            c0utd4 = null;
        }
        if (c0utd4.LJFF == 101 && (c925770aCN = this.LLJJIII) != null) {
            c925770aCN.LIZLLL = true;
        }
        AbstractC929640aIc abstractC929640aIc3 = this.LLJJ;
        if (abstractC929640aIc3 == null) {
            return;
        }
        abstractC929640aIc3.LIZLLL(this.LLJJIII);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Drawable background;
        GradientDrawable gradientDrawable;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        C19ME c19me;
        C923650a8x c923650a8x;
        ViewGroup.LayoutParams layoutParams3;
        C19ME c19me2;
        this.LLJI = new C0UTB();
        boolean z = this.LL;
        if (z) {
            i = R.layout.gk7;
        } else if (!z) {
            i = R.layout.gk5;
        } else {
            throw new C1954807lC();
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        this.LLJJIJIL = viewTd;
        C19GS c19gs = null;
        if (viewTd == null) {
            viewTd = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.eu1);
        this.LLJJIJIIJIL = viewGroup2;
        if (viewGroup2 != null && (layoutParams3 = viewGroup2.getLayoutParams()) != null) {
            if (this.LL) {
                if (layoutParams3 instanceof C19ME) {
                    c19me2 = (C19ME) layoutParams3;
                } else {
                    c19me2 = null;
                }
                if (c19me2 != null) {
                    c19me2.matchConstraintMaxHeight = (int) (C14KS.LIZLLL() * 0.7f);
                }
            } else {
                layoutParams3.height = C439101nJ.LIZ(this.LLJLL);
            }
        }
        if (this.LL) {
            View view = this.LLJJIJIL;
            if (view == null) {
                view = null;
            }
            this.LLJL = (C16F5) view.findViewById(R.id.yt5);
            View view2 = this.LLJJIJIL;
            if (view2 == null) {
                view2 = null;
            }
            this.LLJLIL = (C16F5) view2.findViewById(R.id.yt3);
            View view3 = this.LLJJIJIL;
            if (view3 == null) {
                view3 = null;
            }
            RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view3.findViewById(R.id.yt2);
            this.LLJJL = runnableC781530UlD;
            if (runnableC781530UlD != null) {
                runnableC781530UlD.setLayoutManager(new SSLinearLayoutManager(getContext()));
            }
            RunnableC781530UlD runnableC781530UlD2 = this.LLJJL;
            if (runnableC781530UlD2 != null) {
                runnableC781530UlD2.setAdapter(this.LLJJLIIIJLLLLLLLZ);
            }
            C951190arN c951190arN = this.LLJJLIIIJLLLLLLLZ;
            C929630aIb c929630aIb = new C929630aIb(this);
            EnumC928480aGk enumC928480aGk = EnumC928480aGk.GUEST_PANEL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sub_apply_panel_type", "apply_panel");
            c951190arN.LLLI(C936690aTz.class, new C937140aUi(c929630aIb, null, enumC928480aGk, linkedHashMap));
        }
        View view4 = this.LLJJIJIL;
        if (view4 == null) {
            view4 = null;
        }
        View viewFindViewById = view4.findViewById(R.id.pw6);
        if (this.LLJILLL != EnumC926600aDi.GO_LIVE) {
            C12ES.LJIILL(0, viewFindViewById);
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 168), viewFindViewById);
        } else {
            C439101nJ.LJI(viewFindViewById);
        }
        View view5 = this.LLJJIJIL;
        if (view5 == null) {
            view5 = null;
        }
        LiveIconView liveIconView = (LiveIconView) view5.findViewById(R.id.lvu);
        C12ES.LJIILL(0, liveIconView);
        C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 169));
        this.LLJJIJI = liveIconView;
        View view6 = this.LLJJIJIL;
        if (view6 == null) {
            view6 = null;
        }
        this.LLILZLL = (C16FS) view6.findViewById(R.id.epb);
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 546);
        C16FS c16fs = this.LLILZLL;
        if (c16fs != null) {
            C500260Jjc.LJLILLLLZI(c16fs, R.id.epb, 1000L, new AwS592S0100000_13(awS559S0100000_15, 16));
        }
        View view7 = this.LLJJIJIL;
        if (view7 == null) {
            view7 = null;
        }
        this.LLIZ = (C16F5) view7.findViewById(R.id.ja3);
        View view8 = this.LLJJIJIL;
        if (view8 == null) {
            view8 = null;
        }
        this.LLILZ = (RecyclerView) view8.findViewById(R.id.ft8);
        View view9 = this.LLJJIJIL;
        if (view9 == null) {
            view9 = null;
        }
        this.LLJJJJLIIL = (ConstraintLayout) view9.findViewById(R.id.b4f);
        View view10 = this.LLJJIJIL;
        if (view10 == null) {
            view10 = null;
        }
        this.LLJJJJJIL = (C945740aia) view10.findViewById(R.id.b4e);
        if (C497740JfY.LJJ()) {
            C945740aia c945740aia = this.LLJJJJJIL;
            if (c945740aia == null) {
                c945740aia = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c945740aia);
            c945740aia.setScaleX(-1.0f);
        }
        View view11 = this.LLJJIJIL;
        if (view11 == null) {
            view11 = null;
        }
        C16F5 c16f5 = (C16F5) view11.findViewById(R.id.b47);
        if (c16f5 != null) {
            c16f5.setMaxLines(2);
            c16f5.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            c16f5 = null;
        }
        this.LLIZLLLIL = c16f5;
        View view12 = this.LLJJIJIL;
        if (view12 == null) {
            view12 = null;
        }
        C16F5 c16f52 = (C16F5) view12.findViewById(R.id.b45);
        if (c16f52 != null) {
            c16f52.setMaxLines(2);
            c16f52.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            c16f52 = null;
        }
        this.LLJ = c16f52;
        AbstractC929640aIc abstractC929640aIc = this.LLJJ;
        if (abstractC929640aIc != null) {
            abstractC929640aIc.LIZ(this);
        }
        WeakReference<C923650a8x> weakReference = this.LLJJI;
        if (weakReference != null && (c923650a8x = weakReference.get()) != null) {
            c923650a8x.LLIZLLLIL = this;
        }
        DataChannel dataChannel = this.LLJILJILJ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GuestLinkPlayerListChange.class, new AwS594S0100000_15(this, 569));
            dataChannel.BQ2(this, LinkInGuestCountDownFinishChannel.class, new AwS592S0100000_13(this, 17));
        }
        this.LLJILJIL = new C0UTD(getContext(), this.LLJILJILJ, new AwS592S0100000_13(this, 18), new AwS559S0100000_15(this, 545), 0, 48);
        DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ();
        if (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ != null) {
            deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LJ(new AwS559S0100000_15(this, 1189));
        }
        ConstraintLayout constraintLayout = this.LLJJJJLIIL;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(0, constraintLayout);
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, 8);
        C16F5 c16f53 = this.LLIZLLLIL;
        if (c16f53 != null) {
            c16f53.setText(C497740JfY.LJIJI(2131842120));
        }
        View view13 = this.LLJJIJIL;
        if (view13 == null) {
            view13 = null;
        }
        HandlerHook.viewPostDelay(view13, new ARunnableS113S0100000_13(this, 50), 250L);
        if (C917750ZzR.LJI(false)) {
            C917750ZzR.LJII("MultiGuestUserInfoFragment initDataChannel");
            MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel = (MultiGuestGuestShareRevenueViewModel) this.LLJZIJLIL.getValue();
            if (multiGuestGuestShareRevenueViewModel != null) {
                MultiGuestGuestShareRevenueViewModel.BQ2(multiGuestGuestShareRevenueViewModel, new C2217371BqR() { // from class: X.0aIP
                    @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Integer.valueOf(((C917930Zzj) obj).LL);
                    }

                    @Override // X.C2217371BqR, X.AbstractC2217331BqN
                    public final void set(Object obj, Object obj2) {
                        ((C917930Zzj) obj).LL = ((Number) obj2).intValue();
                    }
                }, this, new AwS592S0100000_13(this, 14), 2);
            }
            MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel2 = (MultiGuestGuestShareRevenueViewModel) this.LLJZIJLIL.getValue();
            if (multiGuestGuestShareRevenueViewModel2 != null) {
                MultiGuestGuestShareRevenueViewModel.BQ2(multiGuestGuestShareRevenueViewModel2, new C2217371BqR() { // from class: X.0aIQ
                    @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C917930Zzj) obj).LLILLJJLI;
                    }

                    @Override // X.C2217371BqR, X.AbstractC2217331BqN
                    public final void set(Object obj, Object obj2) {
                        ((C917930Zzj) obj).LLILLJJLI = (Integer) obj2;
                    }
                }, this, new AwS592S0100000_13(this, 15), 2);
            }
        }
        if (LinkMicGuestPanelUiOptSetting.isEnabled()) {
            ViewGroup viewGroup3 = this.LLJJIJIIJIL;
            if (viewGroup3 != null) {
                background = viewGroup3.getBackground();
            } else {
                background = null;
            }
            if (background instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable) background;
            } else {
                gradientDrawable = null;
            }
            if (gradientDrawable != null) {
                float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            LiveIconView liveIconView2 = this.LLJJIJI;
            if (liveIconView2 != null) {
                liveIconView2.setIconTintAttr(R.attr.ezq);
            }
            C16F5 c16f54 = this.LLIZLLLIL;
            if (c16f54 != null) {
                layoutParams = c16f54.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            C16F5 c16f55 = this.LLJ;
            if (c16f55 != null) {
                c16f55.setTextSize(1, 16.0f);
            }
            C16F5 c16f56 = this.LLIZ;
            if (c16f56 != null) {
                C21382118m3.LIZJ(c16f56, 0);
                c16f56.setTextSize(1, 11.0f);
                c16f56.setMaxLines(3);
                c16f56.setPadding(c16f56.getPaddingLeft(), c16f56.getPaddingTop(), c16f56.getPaddingRight(), (int) C497740JfY.LIZIZ(16.0f));
                ViewGroup.LayoutParams layoutParams4 = c16f56.getLayoutParams();
                if (layoutParams4 instanceof C19ME) {
                    c19me = (C19ME) layoutParams4;
                } else {
                    c19me = null;
                }
                if (c19me != null) {
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                    c19me.goneTopMargin = (int) C497740JfY.LIZIZ(32.0f);
                }
            }
            C16FS c16fs2 = this.LLILZLL;
            if (c16fs2 != null) {
                layoutParams2 = c16fs2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams2 = null;
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = 0;
            }
            C16F5 c16f57 = this.LLJLIL;
            if (c16f57 != null) {
                C786410Ut5.LLJJJJ(c16f57, 8);
            }
            View view14 = this.LLJJIJIL;
            if (view14 == null) {
                view14 = null;
            }
            View viewFindViewById2 = view14.findViewById(R.id.j_f);
            if (viewFindViewById2 != null) {
                C500260Jjc.LJIILIIL(viewFindViewById2);
            }
            C945740aia c945740aia2 = this.LLJJJJJIL;
            if (c945740aia2 == null) {
                c945740aia2 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c945740aia2);
            c945740aia2.setTranslationY(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            ViewGroup.LayoutParams layoutParams5 = c945740aia2.getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
            } else {
                marginLayoutParams3 = null;
            }
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(245));
                marginLayoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                marginLayoutParams3.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            }
        }
        View view15 = this.LLJJIJIL;
        if (view15 == null) {
            view15 = null;
        }
        if (!(view15 instanceof View)) {
            view15 = null;
        }
        if (view15 != null) {
            try {
                ViewTreeLifecycleOwner.set(view15, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view15, this);
                view15.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view15;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view15;
    }

    public static void kS(VoiceChatUserInfoFragment voiceChatUserInfoFragment, List list, Long l, boolean z, int i) {
        int size;
        if ((i & 2) != 0) {
            l = 0L;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if (voiceChatUserInfoFragment.UR()) {
            voiceChatUserInfoFragment.mS(l);
            return;
        }
        voiceChatUserInfoFragment.SR();
        if (!z) {
            return;
        }
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        voiceChatUserInfoFragment.bS(size);
    }

    @Override // X.InterfaceC929970aJ9
    public final void rB(long j, long j2, List list, List list2, List list3) {
        int size;
        Room room;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((LinkPlayerInfo) it2.next()).LIZ = 2;
            }
        }
        boolean z = true;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((LinkPlayerInfo) it3.next()).LIZ = 1;
            }
        }
        int size2 = 0;
        kS(this, list2, Long.valueOf(j2), false, 4);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (list != null) {
            size = list.size();
        } else {
            size = 1;
        }
        int i = size - 1;
        DataChannel dataChannel = this.LLJILJILJ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            if (list2 != null) {
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((LinkPlayerInfo) next).mUser.getId() == currentUserId) {
                        if (next == null) {
                            break;
                        }
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (list2 != null) {
                size2 = list2.size();
            }
            C924980aB6.LIZLLL(size2, i, room.liveRoomMode, z);
        }
    }
}
