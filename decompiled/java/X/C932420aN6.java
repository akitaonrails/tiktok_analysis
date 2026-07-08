package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3GuestOpenLiveSettingEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.GuestInviteViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.MultiGuestShowLayoutSettingDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEarFeedbackSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowBackGuideSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuestManagePanelOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.model.MultiGuestExpandEvent;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS67S0210000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aN6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932420aN6 extends C214906198m implements InterfaceC932780aNg {
    public static final /* synthetic */ int LLLILZ = 0;
    public final Context LL;
    public final InterfaceC932640aNS LLILLJJLI;
    public final User LLILLL;
    public final String LLILZ;
    public final DataChannel LLILZIL;
    public final String LLILZLL;
    public final C932100aMa LLIZ;
    public final C01GW LLIZLLLIL;
    public final String LLJ;
    public C16F5 LLJI;
    public LiveIconView LLJIJIL;
    public C1324720kZq LLJILJIL;
    public C16F5 LLJILJILJ;
    public ViewGroup LLJILLL;
    public FrameLayout LLJJ;
    public ViewGroup LLJJI;
    public ViewGroup LLJJIII;
    public RunnableC781530UlD LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public View LLJJJ;
    public C445880He6 LLJJJIL;
    public boolean LLJJJJ;
    public final Set<Long> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public List<GuestInvitePanelResp.ListUser> LLJJLIIIJLLLLLLLZ;
    public C518340KUm LLJL;
    public boolean LLJLIL;
    public C19R6 LLJLILLLLZIIL;
    public final C932450aN9 LLJLL;
    public final boolean LLJLLIL;
    public final EnumC932550aNJ LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public final C01GW LLL;
    public RecyclerView LLLF;
    public final C1117360fBO LLLFF;
    public final User LLLFFI;
    public final C11NJ LLLFZ;
    public LifecycleOwner LLLI;
    public final Room LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public boolean LLLIIIL;
    public Long LLLIIL;
    public final C922470a73 LLLIILIL;
    public final C932470aNB LLLIL;

    @InterfaceC947260al2(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;

    @InterfaceC947260al2(name = "ZOOM_SERVICE")
    public InterfaceC927510aFB oZoomService;

    public static final String LJJIJ() {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return String.valueOf((room == null || (owner = room.getOwner()) == null) ? null : Long.valueOf(owner.getId()));
    }

    public static boolean LJJJLZIJ() {
        InterfaceC302601Fg interfaceC302601FgLIZ;
        return MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2 A[PHI: r10
      0x00e2: PHI (r10v2 android.graphics.drawable.Drawable) = 
      (r10v1 android.graphics.drawable.Drawable)
      (r10v1 android.graphics.drawable.Drawable)
      (r10v3 android.graphics.drawable.Drawable)
      (r10v3 android.graphics.drawable.Drawable)
     binds: [B:68:0x00e9, B:72:0x00f5, B:61:0x00d4, B:65:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C932770aNf LJJIJIIJI() {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932420aN6.LJJIJIIJI():X.0aNf");
    }

    public final InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> LJJIJIIJIL() {
        InterfaceC917530Zz5 interfaceC917530Zz5;
        InterfaceC302401Fe interfaceC302401Fe;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User user = this.LLLFFI;
        c930480aJy.getClass();
        if (C930480aJy.LJIJI(user)) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (!(objLJIIIZ instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) == null) {
                return null;
            }
            return interfaceC302401Fe.LIZ();
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        if (!(objLJIIIZ2 instanceof InterfaceC917530Zz5) || (interfaceC917530Zz5 = (InterfaceC917530Zz5) objLJIIIZ2) == null) {
            return null;
        }
        return interfaceC917530Zz5.LIZ();
    }

    public final InterfaceC921200a50<LinkListUser, LinkMessage> LJJIJIL() {
        InterfaceC917640ZzG interfaceC917640ZzG;
        if (!LJJL(this.LLILLL)) {
            return null;
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (!(objLJIIIZ instanceof InterfaceC917640ZzG) || (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ) == null) {
            return null;
        }
        return interfaceC917640ZzG.LIZ();
    }

    public final int LJJIZ() {
        Boolean boolValueOf;
        String str;
        InterfaceC927510aFB interfaceC927510aFB = this.oZoomService;
        if (C500260Jjc.LJJJI(interfaceC927510aFB != null ? Boolean.valueOf(interfaceC927510aFB.LJFF()) : null)) {
            return 2;
        }
        InterfaceC927510aFB interfaceC927510aFB2 = this.oZoomService;
        if (interfaceC927510aFB2 != null) {
            LinkPlayerInfo linkPlayerInfoLJJJJJ = LJJJJJ(this.LLILLL);
            if (linkPlayerInfoLJJJJJ == null || (str = linkPlayerInfoLJJJJJ.mInteractIdStr) == null) {
                str = "";
            }
            boolValueOf = Boolean.valueOf(interfaceC927510aFB2.LIZJ(str));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return 1;
        }
        LinkPlayerInfo linkPlayerInfoLJJJJJ2 = LJJJJJ(this.LLILLL);
        String str2 = linkPlayerInfoLJJJJJ2 != null ? linkPlayerInfoLJJJJJ2.mInteractIdStr : null;
        InterfaceC927510aFB interfaceC927510aFB3 = this.oZoomService;
        return Intrinsics.LJFF(str2, interfaceC927510aFB3 != null ? interfaceC927510aFB3.LJIILIIL() : null) ? 3 : 0;
    }

    public final C932770aNf LJJJI() {
        boolean zLIZ = this.LLIZ.LIZ("flip");
        C932090aMZ c932090aMZ = new C932090aMZ(this.LLILZIL, new AwS559S0100000_15(this, 974));
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            multiGuestDataHolder = null;
        }
        boolean z = multiGuestDataHolder.LJIIJ;
        float f = z ? 1.0f : 0.5f;
        return new C932770aNf(R.id.erw, R.id.xmk, C497740JfY.LJIJI(2131854281), f, R.id.k0l, C20736316Cj.LIZLLL(R.attr.d0v, this.LL), f, z, false, false, new AwS67S0210000_15(c932090aMZ, zLIZ, this, 5), 1792);
    }

    public final C935170aRX LJJJIL() {
        return (C935170aRX) this.LLJJJJLIIL.getValue();
    }

    public final ViewGroup LJJJJJL() {
        return (ViewGroup) this.LLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C932770aNf LJJJJL() {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932420aN6.LJJJJL():X.0aNf");
    }

    public final EnumC920250a3T LJJJJLL() {
        InterfaceC927510aFB interfaceC927510aFB = this.oZoomService;
        return interfaceC927510aFB == null ? EnumC920250a3T.ZOOM_DISABLED : interfaceC927510aFB.LJIL(this.LLILZ);
    }

    public final void LJJJJZI() {
        LJJLI("live_setting");
        if (C930540aK4.LIZJ() && LJJL(this.LLILLL)) {
            DataChannel dataChannel = this.LLILZIL;
            if (dataChannel != null) {
                dataChannel.LC0(MultiGuestShowLayoutSettingDialogEvent.class, new C927400aF0(false, true, 1));
            }
            C923300a8O.LJFF("live_setting");
            return;
        }
        if (LiveSdkMultiGuestEarFeedbackSetting.isEnable()) {
            DataChannel dataChannel2 = this.LLILZIL;
            if (dataChannel2 != null) {
                dataChannel2.LC0(MultiGuestV3GuestOpenLiveSettingEvent.class, new C924040a9a(true));
            }
            C923300a8O.LJFF("live_setting");
            return;
        }
        DataChannel dataChannel3 = this.LLILZIL;
        if (dataChannel3 != null) {
            dataChannel3.LC0(MultiGuestV3GuestOpenLiveSettingEvent.class, new C924040a9a(false));
        }
        C923300a8O.LJFF("live_status");
    }

    public final void LJJJLIIL() {
        DataChannel dataChannel;
        Room room;
        C19EG c19egLJIJJLI;
        if (this.LLJL != null || (dataChannel = this.LLILZIL) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (c19egLJIJJLI = C520010KaN.LJIJJLI(this.LL, true)) == null) {
            return;
        }
        this.LLJL = new C518340KUm(room, c19egLJIJJLI, this.LLILZIL);
    }

    public final void LJJLIIIIJ() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        GuestInviteViewModel viewModel;
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) == null) {
            return;
        }
        IGuestInviteAbility iGuestInviteAbility = (IGuestInviteAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuestInviteAbility.class, null);
        if (iGuestInviteAbility != null && (viewModel = iGuestInviteAbility.getViewModel()) != null) {
            viewModel.AQ2(null, this.LLJLLL == EnumC932550aNJ.V3 ? "guest_interact_panel" : "guest_manage_panel");
        }
        dismiss();
    }

    public final void LJJLIIIJL() {
        boolean z;
        long jLongValue;
        InterfaceC932640aNS interfaceC932640aNS = this.LLILLJJLI;
        if (interfaceC932640aNS == null) {
            Long l = (Long) C742890TCd.LIZ(this.LLILLL.getId()).LJLZ();
            if (l == null || !(l.longValue() == 0 || l.longValue() == 3)) {
                z = true;
                if (l == null) {
                    jLongValue = -1;
                }
                LJJLIIIJLJLI(Long.valueOf(jLongValue), z);
            } else {
                z = false;
            }
            jLongValue = l.longValue();
            LJJLIIIJLJLI(Long.valueOf(jLongValue), z);
        } else {
            LJJLIIIJLJLI(Long.valueOf(this.LLILLJJLI.getFollowStatus()), interfaceC932640aNS.a0());
        }
        LiveIconView liveIconView = this.LLJIJIL;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C786410Ut5.i5(liveIconView, 1.0f);
        C16F5 c16f5 = this.LLJI;
        C786410Ut5.k5(c16f5 != null ? c16f5 : null, 1.0f);
    }

    public static boolean LJJIIZ() {
        UserAttr userAttr = UserService.getInstance().user().LJIJJLI().getUserAttr();
        if (userAttr != null) {
            return userAttr.isAdmin;
        }
        return false;
    }

    public final C932770aNf LJJIJLIJ() {
        C20743516Fd c20743516FdLJJJJI;
        float f;
        List<PosIdentity> listLIZIZ;
        if (!C917810ZzX.LJIIIZ()) {
            return null;
        }
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (!C918060Zzw.LIZ(zLIZJ)) {
            return null;
        }
        InterfaceC927510aFB interfaceC927510aFB = this.oZoomService;
        int size = (interfaceC927510aFB == null || (listLIZIZ = interfaceC927510aFB.LIZIZ()) == null) ? 0 : listLIZIZ.size();
        if (LJJJLZIJ() || LJJJJLL() != EnumC920250a3T.CAN_ZOOM_TO_MAX || size < 1 || size >= 2 || ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.LLILZIL)) {
            c20743516FdLJJJJI = LJJJJI("zoom x2", null);
            f = 0.5f;
        } else {
            c20743516FdLJJJJI = LJJJJI("zoom x2", null);
            f = 1.0f;
        }
        C915850ZwN.LJ("show", this.LLILLL.getId(), this.LLILZLL, f == 0.5f, false);
        return new C932770aNf(R.id.ero, R.id.xm1, C497740JfY.LJIJI(2131853912), f, R.id.k06, c20743516FdLJJJJI, f, true, false, false, null, 3840);
    }

    public final C932770aNf LJJJJLI() {
        C20743516Fd c20743516FdLJJJJI;
        boolean z;
        if ((!C917810ZzX.LJIIIZ() && !C930540aK4.LIZJ()) || !this.LLIZ.LIZ("zoom") || C924230a9t.LIZ(1)) {
            return null;
        }
        EnumC920250a3T enumC920250a3TLJJJJLL = LJJJJLL();
        int[] iArr = C932460aNA.LIZIZ;
        int i = iArr[enumC920250a3TLJJJJLL.ordinal()];
        int i2 = 2131843218;
        float f = 1.0f;
        if (i == 1) {
            c20743516FdLJJJJI = LJJJJI("zoom", EnumC932480aNC.ON);
        } else if (i != 2) {
            c20743516FdLJJJJI = LJJJJI("zoom", EnumC932480aNC.ON);
            f = 0.5f;
        } else {
            c20743516FdLJJJJI = LJJJJI("zoom", EnumC932480aNC.OFF);
            i2 = 2131843221;
        }
        if (!LJJL(this.LLILLL) || C930540aK4.LIZJ() || enumC920250a3TLJJJJLL == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
            z = true;
            int i3 = iArr[enumC920250a3TLJJJJLL.ordinal()];
            if (i3 == 1) {
                C919870a2r.LIZLLL(LJJIZ(), LJJIJ(), String.valueOf(this.LLILLL.getId()), "show", C917520Zz4.LJIILL(this.LLILLL), this.LLILZLL);
            } else if (i3 == 2) {
                C919870a2r.LIZLLL(LJJIZ(), LJJIJ(), String.valueOf(this.LLILLL.getId()), "show", C917520Zz4.LJIILL(this.LLILLL), this.LLILZLL);
                C915850ZwN.LJIIJJI(16, this.LLILLL.getId(), "show", C917520Zz4.LJIILL(this.LLILLL), false);
            }
        } else {
            z = false;
        }
        return new C932770aNf(R.id.eru, R.id.xmf, C497740JfY.LJIJI(i2), f, R.id.k0j, c20743516FdLJJJJI, f, true, false, z, null, 2816);
    }

    public final boolean LJJJZ() {
        C957020b0m next;
        Iterator<C957020b0m> it2 = C940770aaZ.LIZ().getDataSource().LJIIIZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            PosIdentity posIdentity = next.getPosIdentity();
            if (Intrinsics.LJFF(posIdentity != null ? posIdentity.value : null, this.LLILZ)) {
                break;
            }
        }
        C957020b0m c957020b0m = next;
        return C932820aNk.LIZIZ(c957020b0m != null ? c957020b0m.getPosIdentity() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIJ() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932420aN6.LJJLIIJ():void");
    }

    public static boolean LJJL(User user) {
        if (user != null && user.getId() == C950220apo.LJFF()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x04e4, code lost:
    
        if (r1 != 3) goto L247;
     */
    @Override // X.InterfaceC932780aNg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(int r24) {
        /*
            Method dump skipped, instruction units count: 1981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932420aN6.LJIIJJI(int):void");
    }

    public final int LJJIIJZLJL(LinkPlayerInfo linkPlayerInfo) {
        MultiGuestDataHolder multiGuestDataHolder = null;
        if (LJJL(this.LLILLL)) {
            if (C930540aK4.LIZJ()) {
                if (((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).isMicMuted()) {
                    return 2;
                }
                return 1;
            }
            MultiGuestDataHolder multiGuestDataHolder2 = this.multiGuestDataHolder;
            if (multiGuestDataHolder2 != null) {
                multiGuestDataHolder = multiGuestDataHolder2;
            }
            if (!multiGuestDataHolder.LJIIIZ) {
                return 2;
            }
            return 1;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder3 = this.multiGuestDataHolder;
        if (multiGuestDataHolder3 != null) {
            multiGuestDataHolder = multiGuestDataHolder3;
        }
        c930480aJy.getClass();
        return C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
    }

    public final LinkPlayerInfo LJJJJJ(User user) {
        LinkListUser linkListUserLJIIJJI;
        LinkPlayerInfo linkPlayerInfoLJIIIZ;
        InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50LJJIJIIJIL = LJJIJIIJIL();
        if (interfaceC921200a50LJJIJIIJIL == null || (linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(interfaceC921200a50LJJIJIIJIL, user.getId())) == null) {
            InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50LJJIJIL = LJJIJIL();
            if (interfaceC921200a50LJJIJIL != null && (linkListUserLJIIJJI = C921170a4x.LJIIJJI(interfaceC921200a50LJJIJIL, user.getId())) != null) {
                LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
                linkPlayerInfo.mInteractIdStr = linkListUserLJIIJJI.linkMicId;
                linkPlayerInfo.mUser = linkListUserLJIIJJI.user;
                return linkPlayerInfo;
            }
            return null;
        }
        return linkPlayerInfoLJIIIZ;
    }

    public final void LJJLI(String str) {
        if (!LJJL(this.LLILLL)) {
            return;
        }
        int i = C932460aNA.LIZ[this.LLJLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (C930540aK4.LIZJ() && LJJL(this.LLILLL)) {
                    C923300a8O.LIZ(str);
                    return;
                } else {
                    C923300a8O.LJI(str);
                    return;
                }
            }
            return;
        }
        if (C930540aK4.LIZJ() && LJJL(this.LLILLL)) {
            C923300a8O.LIZ(str);
        } else {
            C923300a8O.LJII(str);
        }
    }

    public final void LJJLIIIJ(String str) {
        LinkPlayerInfo linkPlayerInfo;
        C957020b0m next;
        long id;
        int i;
        User user;
        List listLJIJJLI;
        Object obj;
        String str2;
        Iterator<C957020b0m> it2 = C940770aaZ.LIZ().getDataSource().LJIIIZ().iterator();
        while (true) {
            linkPlayerInfo = null;
            obj = null;
            linkPlayerInfo = null;
            if (it2.hasNext()) {
                next = it2.next();
                PosIdentity posIdentity = next.getPosIdentity();
                if (posIdentity != null) {
                    str2 = posIdentity.value;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, this.LLILZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C957020b0m c957020b0m = next;
        InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50LJJIJIIJIL = LJJIJIIJIL();
        if (interfaceC921200a50LJJIJIIJIL != null && (listLJIJJLI = ((AbstractC928510aGn) interfaceC921200a50LJJIJIIJIL).LJIJJLI()) != null) {
            Iterator it3 = listLJIJJLI.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (Intrinsics.LJFF(((LinkPlayerInfo) next2).mInteractIdStr, this.LLILZ)) {
                    obj = next2;
                    break;
                }
            }
            linkPlayerInfo = (LinkPlayerInfo) obj;
        }
        if (c957020b0m != null) {
            boolean zLJJJZ = LJJJZ();
            PosIdentity posIdentity2 = c957020b0m.getPosIdentity();
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                id = user.getId();
            } else {
                id = -1;
            }
            MultiGuestSpotExtra multiGuestExtra = c957020b0m.getMultiGuestExtra();
            if (multiGuestExtra != null) {
                i = multiGuestExtra.spotRank;
            } else {
                i = 0;
            }
            C917670ZzJ.LIZJ(str, zLJJJZ, new C917680ZzK(posIdentity2, id, i, (int) c957020b0m.getSpotId()), "");
        }
    }

    public final void LJJLIIIJILLIZJL(View view) {
        Context context;
        Object objValueOf;
        String str;
        if (view.isAttachedToWindow() && view.getContext() != null && (context = view.getContext()) != null && C520010KaN.LJIIJJI(context)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("managePanel#showAboveView, ");
            Context context2 = view.getContext();
            if (context2 != null) {
                objValueOf = Boolean.valueOf(C520010KaN.LJIIJJI(context2));
            } else {
                objValueOf = null;
            }
            sbLIZ.append(objValueOf);
            C20441214yg.LIZIZ("TAG", C2188811AlT.LIZIZ(sbLIZ));
            C920830a4P.LJI = this.LLILZLL;
            showAtLocation(view, 80, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            C930480aJy c930480aJy = C930480aJy.LIZ;
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            c930480aJy.getClass();
            C915060Zv6.LIZ(!C930480aJy.LJIJI(userLJIJJLI) ? 1 : 0, "show", String.valueOf(this.LLILLL.getId()), this.LLILZ, this.LLILZLL);
            C320501Md.LIZLLL("show", String.valueOf(this.LLILLL.getId()), this.LLILZ, this.LLILZLL);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("request_page", this.LLILZLL);
            linkedHashMap.put("guest_id", String.valueOf(this.LLILLL.getId()));
            linkedHashMap.put("link_id", this.LLILZ);
            HashMap map = new HashMap();
            if (LinkCoreModelKt.currentUserIsAnchor()) {
                str = "anchor";
            } else {
                str = "guest";
            }
            map.put("from_user_type", str);
            C404301hh.LIZIZ(map);
            C924620aAW.LJIIJJI(map);
            map.putAll(linkedHashMap);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guest_quick_manage_panel");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJJLIIIJJIZ(String str) {
        String str2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForItemId;
        RecyclerView.ViewHolder viewHolderFindViewHolderForItemId2;
        C932760aNe c932760aNe;
        C932750aNd c932750aNd;
        C932760aNe c932760aNe2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForItemId3;
        RecyclerView.ViewHolder viewHolderFindViewHolderForItemId4;
        C932750aNd c932750aNd2;
        C932750aNd c932750aNd3;
        C932750aNd c932750aNd4;
        LinkPlayerInfo linkPlayerInfoLJJJJJ = LJJJJJ(this.LLILLL);
        RecyclerView.ViewHolder viewHolderFindViewHolderForItemId5 = null;
        if (linkPlayerInfoLJJJJJ != null) {
            str2 = linkPlayerInfoLJJJJJ.mInteractIdStr;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            if (this.LLJLLIL) {
                RecyclerView recyclerView = this.LLLF;
                if (recyclerView != null) {
                    viewHolderFindViewHolderForItemId3 = recyclerView.findViewHolderForItemId(R.id.eso);
                } else {
                    viewHolderFindViewHolderForItemId3 = null;
                }
                if ((viewHolderFindViewHolderForItemId3 instanceof C932750aNd) && (c932750aNd4 = (C932750aNd) viewHolderFindViewHolderForItemId3) != null) {
                    c932750aNd4.L5(LJJIJIIJI());
                }
                RecyclerView recyclerView2 = this.LLLF;
                if (recyclerView2 != null) {
                    viewHolderFindViewHolderForItemId4 = recyclerView2.findViewHolderForItemId(R.id.erw);
                } else {
                    viewHolderFindViewHolderForItemId4 = null;
                }
                if ((viewHolderFindViewHolderForItemId4 instanceof C932750aNd) && (c932750aNd3 = (C932750aNd) viewHolderFindViewHolderForItemId4) != null) {
                    c932750aNd3.L5(LJJJI());
                }
                RecyclerView recyclerView3 = this.LLLF;
                if (recyclerView3 != null) {
                    viewHolderFindViewHolderForItemId5 = recyclerView3.findViewHolderForItemId(R.id.erd);
                }
                if ((viewHolderFindViewHolderForItemId5 instanceof C932750aNd) && (c932750aNd2 = (C932750aNd) viewHolderFindViewHolderForItemId5) != null) {
                    c932750aNd2.L5(LJJJJL());
                    return;
                }
                return;
            }
            RecyclerView recyclerView4 = this.LLLF;
            if (recyclerView4 != null) {
                viewHolderFindViewHolderForItemId = recyclerView4.findViewHolderForItemId(R.id.eso);
            } else {
                viewHolderFindViewHolderForItemId = null;
            }
            if ((viewHolderFindViewHolderForItemId instanceof C932760aNe) && (c932760aNe2 = (C932760aNe) viewHolderFindViewHolderForItemId) != null) {
                c932760aNe2.L5(LJJIJIIJI());
            }
            RecyclerView recyclerView5 = this.LLLF;
            if (recyclerView5 != null) {
                viewHolderFindViewHolderForItemId2 = recyclerView5.findViewHolderForItemId(R.id.erw);
            } else {
                viewHolderFindViewHolderForItemId2 = null;
            }
            if ((viewHolderFindViewHolderForItemId2 instanceof C932750aNd) && (c932750aNd = (C932750aNd) viewHolderFindViewHolderForItemId2) != null) {
                c932750aNd.L5(LJJJI());
            }
            RecyclerView recyclerView6 = this.LLLF;
            if (recyclerView6 != null) {
                viewHolderFindViewHolderForItemId5 = recyclerView6.findViewHolderForItemId(R.id.erd);
            }
            if (!(viewHolderFindViewHolderForItemId5 instanceof C932760aNe) || (c932760aNe = (C932760aNe) viewHolderFindViewHolderForItemId5) == null) {
                return;
            }
            c932760aNe.L5(LJJJJL());
        }
    }

    public final void LJJLIIIJLLLLLLLZ(List<GuestInvitePanelResp.ListUser> list) {
        ArrayList arrayList;
        C932510aNF c932510aNF;
        if (!this.LLJLLIL || this.LLJLLL != EnumC932550aNJ.V3 || !MultiGuestGuestManagePanelOptSetting.isV2() || list.size() < 3) {
            return;
        }
        List<?> list2 = this.LLLFF.LL;
        if ((list2 instanceof C410901il) && (arrayList = (ArrayList) list2) != null) {
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next() instanceof C932510aNF) {
                    if (i >= 0) {
                        Object obj = arrayList.get(i);
                        if ((obj instanceof C932510aNF) && (c932510aNF = (C932510aNF) obj) != null) {
                            C932510aNF c932510aNF2 = new C932510aNF(c932510aNF.LIZ, C13LP.LL(list, 3));
                            arrayList.set(i, c932510aNF2);
                            this.LLLFF.notifyItemChanged(i, c932510aNF2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932420aN6.onClick(android.view.View):void");
    }

    public static void LJJIIJ(C410901il c410901il, C932770aNf c932770aNf) {
        if (c932770aNf != null && C500260Jjc.LJJJI(Boolean.valueOf(c932770aNf.LJIIJ))) {
            c410901il.add(c932770aNf);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final C20743516Fd LJJJJI(String str, EnumC932480aNC enumC932480aNC) {
        switch (str.hashCode()) {
            case -110072281:
                if (!str.equals("zoom x2")) {
                    return null;
                }
                if (this.LLJLLIL) {
                    return C20736316Cj.LIZLLL(R.attr.dr0, this.LL);
                }
                return C20736316Cj.LIZLLL(R.attr.dqz, this.LL);
            case 3172656:
                if (!str.equals("gift")) {
                    return null;
                }
                if (this.LLJLLIL) {
                    return C20736316Cj.LIZLLL(R.attr.dtb, this.LL);
                }
                return C20736316Cj.LIZLLL(R.attr.dt_, this.LL);
            case 3744723:
                if (!str.equals("zoom")) {
                    return null;
                }
                if (enumC932480aNC == EnumC932480aNC.ON) {
                    if (this.LLJLLIL) {
                        return C20736316Cj.LIZLLL(R.attr.dst, this.LL);
                    }
                    return C20736316Cj.LIZLLL(R.attr.dss, this.LL);
                }
                if (enumC932480aNC != EnumC932480aNC.OFF) {
                    return null;
                }
                if (this.LLJLLIL) {
                    return C20736316Cj.LIZLLL(R.attr.dn_, this.LL);
                }
                return C20736316Cj.LIZLLL(R.attr.cs2, this.LL);
            case 93166550:
                if (!str.equals("audio")) {
                    return null;
                }
                if (enumC932480aNC == EnumC932480aNC.ON) {
                    if (this.LLJLLIL) {
                        return C20736316Cj.LIZLLL(R.attr.e3u, this.LL);
                    }
                    return C20736316Cj.LIZLLL(R.attr.e40, this.LL);
                }
                if (enumC932480aNC != EnumC932480aNC.OFF) {
                    return null;
                }
                if (this.LLJLLIL) {
                    return C20736316Cj.LIZLLL(R.attr.e3x, this.LL);
                }
                return C20736316Cj.LIZLLL(R.attr.e43, this.LL);
            case 112202875:
                if (!str.equals("video")) {
                    return null;
                }
                if (enumC932480aNC == EnumC932480aNC.ON) {
                    if (this.LLJLLIL) {
                        return C20736316Cj.LIZLLL(R.attr.emd, this.LL);
                    }
                    return C20736316Cj.LIZLLL(R.attr.emc, this.LL);
                }
                if (enumC932480aNC == EnumC932480aNC.OFF) {
                    if (this.LLJLLIL) {
                        return C20736316Cj.LIZLLL(R.attr.emu, this.LL);
                    }
                    return C20736316Cj.LIZLLL(R.attr.emt, this.LL);
                }
                if (enumC932480aNC != EnumC932480aNC.DISABLE) {
                    return null;
                }
                if (this.LLJLLIL) {
                    return C20736316Cj.LIZLLL(R.attr.emu, this.LL);
                }
                return C20736316Cj.LIZLLL(R.attr.emt, this.LL);
            case 1352226353:
                if (!str.equals("countdown")) {
                    return null;
                }
                if (this.LLJLLIL) {
                    return C20736316Cj.LIZLLL(R.attr.d0l, this.LL);
                }
                return C20736316Cj.LIZLLL(R.attr.dju, this.LL);
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final C410901il LJJJJIZL(C932100aMa c932100aMa, EnumC932550aNJ enumC932550aNJ) {
        boolean z;
        float f;
        Boolean boolValueOf;
        float f2;
        Room room;
        RoomAuthStatus roomAuthStatus;
        C410901il c410901il = new C410901il();
        for (String str : c932100aMa.LIZ) {
            C932770aNf c932770aNf = null;
            switch (str.hashCode()) {
                case -1617552511:
                    if (str.equals("double_zoom")) {
                        LJJIIJ(c410901il, LJJIJLIJ());
                    }
                    break;
                case -1514917603:
                    if (str.equals("voice_ring")) {
                        LJJIIJ(c410901il, new C932770aNf(R.id.etw, R.id.xrp, C497740JfY.LJIJI(2131854232), 1.0f, R.id.k59, C20736316Cj.LIZLLL(R.attr.eec, this.LL), 1.0f, true, false, false, null, 3840));
                    }
                    break;
                case -1183699191:
                    if (str.equals("invite")) {
                        C932770aNf c932770aNf2 = new C932770aNf(R.id.esc, R.id.xok, C497740JfY.LJIJI(2131852855), 1.0f, R.id.k18, C20736316Cj.LIZLLL(R.attr.e_5, this.LL), 1.0f, true, false, false, null, 3840);
                        if (this.LLJLLIL) {
                            if (enumC932550aNJ == EnumC932550aNJ.V3) {
                                if (MultiGuestGuestManagePanelOptSetting.isV2()) {
                                    c410901il.add(new C932510aNF(c932770aNf2, C13LP.LL(this.LLJJLIIIJLLLLLLLZ, 3)));
                                }
                                break;
                            } else if (enumC932550aNJ == EnumC932550aNJ.V4) {
                                if (MultiGuestGuestManagePanelOptSetting.isV1()) {
                                    c410901il.add(new C932510aNF(c932770aNf2, C13LP.LL(this.LLJJLIIIJLLLLLLLZ, 3)));
                                }
                                break;
                            }
                        }
                        LJJIIJ(c410901il, c932770aNf2);
                    }
                    break;
                case -1068795718:
                    if (str.equals("modify")) {
                        LJJIIJ(c410901il, new C932770aNf(R.id.esp, R.id.xp4, C497740JfY.LJIJI(2131843460), 1.0f, R.id.k22, C20736316Cj.LIZLLL(R.attr.clj, this.LL), 1.0f, true, false, false, null, 3840));
                    }
                    break;
                case -1035608622:
                    if (str.equals("count_down")) {
                        if (C917810ZzX.LJIIIZ() && C927800aFe.LIZIZ()) {
                            c932770aNf = new C932770aNf(R.id.erh, R.id.xls, C497740JfY.LJIJI(2131843217), 1.0f, R.id.jzs, LJJJJI("countdown", null), 1.0f, true, false, false, null, 3840);
                        }
                        LJJIIJ(c410901il, c932770aNf);
                    }
                    break;
                case -509770730:
                    if (str.equals("fun_kit")) {
                        if (!this.LLJJJJ) {
                            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                            C978360bZC.LJIIIZ("show", "interact_panel");
                        }
                        LJJIIJ(c410901il, new C932770aNf(R.id.ery, R.id.xmm, C497740JfY.LJIJI(2131853925), 1.0f, R.id.k0n, C20736316Cj.LIZLLL(R.attr.dkj, this.LL), 1.0f, true, false, false, new AwS594S0100000_15(this, 906), 1792));
                    }
                    break;
                case 3145837:
                    if (str.equals("flip")) {
                        LJJIIJ(c410901il, LJJJI());
                    }
                    break;
                case 3172656:
                    if (str.equals("gift")) {
                        DataChannel dataChannel = this.LLILZIL;
                        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                            boolValueOf = Boolean.valueOf(roomAuthStatus.isEnableGift());
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf)) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.5f;
                        }
                        LJJIIJ(c410901il, new C932770aNf(R.id.es0, R.id.xmn, C497740JfY.LJIJI(2131843219), f2, R.id.k0r, LJJJJI("gift", null), f2, true, false, false, null, 3840));
                    }
                    break;
                case 3744723:
                    if (str.equals("zoom")) {
                        LJJIIJ(c410901il, LJJJJLI());
                    }
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        LJJIIJ(c410901il, LJJIJIIJI());
                    }
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        LJJIIJ(c410901il, LJJJJL());
                    }
                    break;
                case 691326590:
                    if (str.equals("manage_guest")) {
                        LJJIIJ(c410901il, new C932770aNf(R.id.esk, R.id.xow, C497740JfY.LJIJI(2131843152), 1.0f, R.id.k1w, C20736316Cj.LIZLLL(R.attr.e17, this.LL), 1.0f, true, false, false, null, 3840));
                    }
                    break;
                case 1985941072:
                    if (str.equals("setting")) {
                        LJJIIJ(c410901il, new C932770aNf(R.id.et8, R.id.xqc, C497740JfY.LJIJI(2131854874), 1.0f, R.id.k3t, C20736316Cj.LIZLLL(R.attr.e1s, this.LL), 1.0f, true, false, false, null, 3840));
                    }
                    break;
                case 2129353517:
                    if (str.equals("switch_spot")) {
                        if (C940770aaZ.LIZ().getDataSource().getPanelLayoutType() != 1 && C930540aK4.LIZJ() && LJJL(this.LLILLL)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((C917810ZzX.LJIIIZ() || z) && C932490aND.LIZ(C930540aK4.LIZJ())) {
                            boolean z2 = !LJJJZ();
                            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.cqd, this.LL);
                            if (z2) {
                                f = 1.0f;
                            } else {
                                f = 0.5f;
                            }
                            String strLJIJI = C497740JfY.LJIJI(2131854003);
                            LJJLIIIJ("show");
                            c932770aNf = new C932770aNf(R.id.etf, R.id.xqy, strLJIJI, f, R.id.k4b, c20743516FdLIZLLL, f, true, RedDotExtensionKt.LJIILLIIL(C0UX6.MULTI_GUEST_SWITCH_SPOT_RED_DOT), false, null, 3584);
                        }
                        LJJIIJ(c410901il, c932770aNf);
                    }
                    break;
            }
        }
        this.LLJJJJ = true;
        return c410901il;
    }

    public final void LJJLIIIJLJLI(Long l, boolean z) {
        User.EnigmaInfo enigmaInfo;
        this.LLLIIL = l;
        User user = this.LLILLL;
        if (user != null && (enigmaInfo = user.enigmaInfo) != null && enigmaInfo.isEnigmaMaskOn) {
            C1324720kZq c1324720kZq = this.LLJILJIL;
            if (c1324720kZq == null) {
                c1324720kZq = null;
            }
            C439101nJ.LJI(c1324720kZq);
            ViewGroup viewGroup = this.LLJILLL;
            if (viewGroup != null) {
                C439101nJ.LJI(viewGroup);
                return;
            }
            return;
        }
        C932450aN9 c932450aN9 = this.LLJLL;
        if (!c932450aN9.LIZJ) {
            if (MultiGuestFollowBackGuideSetting.INSTANCE.enableManagePanelFollowOpt()) {
                if (z) {
                    ViewGroup viewGroup2 = c932450aN9.LIZLLL;
                    if (viewGroup2 != null) {
                        C439101nJ.LJI(viewGroup2);
                        return;
                    }
                    return;
                }
                ViewGroup viewGroup3 = c932450aN9.LIZLLL;
                if (viewGroup3 != null) {
                    C12ES.LJIILL(0, viewGroup3);
                }
                c932450aN9.LIZ(l, z);
                return;
            }
            if (z) {
                C1324720kZq c1324720kZq2 = c932450aN9.LIZ;
                if (c1324720kZq2 == null) {
                    return;
                }
                C439101nJ.LJI(c1324720kZq2);
                return;
            }
            C1324720kZq c1324720kZq3 = c932450aN9.LIZ;
            if (c1324720kZq3 == null) {
                return;
            }
            C12ES.LJIILL(0, c1324720kZq3);
        }
    }

    public static final void LJJLIIIJJI(Room room, C932420aN6 c932420aN6, boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("blocked_list_toast_click");
        c474500IjALIZ.LJJIIZI(C2097608Jq.LJI(new Pair("anchor_id", String.valueOf(room.getOwnerUserId())), new Pair("room_id", String.valueOf(room.getId())), new Pair("user_id", String.valueOf(c932420aN6.LLILLL.getId())), new Pair("admin_type", C0KYR.LIZJ(c932420aN6.LLILZIL))));
        c474500IjALIZ.LJJII("guest_quick_manage_panel", "enter_from");
        c474500IjALIZ.LJIIJJI("relation");
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        if (z) {
            str = "yes";
        } else {
            str = "no";
        }
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LIZ();
    }

    public final void LJJLJ(final String str, final DialogInterface dialogInterface, final boolean z, boolean z2, boolean z3, boolean z4) {
        C1143300frE.LJIIJJI().LJII(this.LLJ, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "entrance")));
        InterfaceC927510aFB interfaceC927510aFB = this.oZoomService;
        if (interfaceC927510aFB != null) {
            interfaceC927510aFB.LJI(str, new InterfaceC920110a3F() { // from class: X.0aMY
                @Override // X.InterfaceC920110a3F
                public final void LIZJ(String str2) {
                    DataChannel dataChannel;
                    C1143300frE.LJIIJJI().LJII(this.LIZ.LLJ, C2097608Jq.LJIIJ(new Pair("action", "zoom"), new Pair("step", "onZoomSuccess")));
                    if (C930540aK4.LJIL(UserService.getInstance().user().LJIJJLI())) {
                        if (z) {
                            C766270U4b.LIZLLL(2131843136);
                        } else {
                            C766270U4b.LIZLLL(2131843134);
                        }
                    }
                    DialogInterface dialogInterface2 = dialogInterface;
                    if (dialogInterface2 != null) {
                        dialogInterface2.dismiss();
                    }
                    if (!z && (dataChannel = this.LIZ.LLILZIL) != null) {
                        dataChannel.FQ2(MultiGuestExpandEvent.class);
                    }
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                    DialogC933230aOP dialogC933230aOPLIZ = C920230a3R.LIZ(this.LIZ.LL, true, (PosIdentity) ListProtector.get(list, 0), (PosIdentity) ListProtector.get(list, 1), new AwS129S1100000_15(str, function1, 12));
                    dialogC933230aOPLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987030bnB(dialogC933230aOPLIZ, this.LIZ, str, 3));
                    C786410Ut5.N4(dialogC933230aOPLIZ);
                    C915850ZwN.LJIIJ(str, false);
                }

                @Override // X.InterfaceC920110a3F
                public final void LIZ(int i, String str2, String str3, Throwable th) {
                    String str4;
                    String message;
                    if (z) {
                        str4 = "zoom_min";
                    } else {
                        str4 = "zoom_max";
                    }
                    C01N8.LIZ(i, "zoom", str4, 0L, "guest", "http_fail", str3);
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    String str5 = this.LIZ.LLJ;
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("action", "zoom");
                    pairArr[1] = new Pair("step", "onZoomFail");
                    pairArr[2] = new Pair("errorCode", Integer.valueOf(i));
                    pairArr[3] = new Pair("errorMessage", str3);
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    pairArr[4] = new Pair("throwable", message);
                    c1143300frELJIIJJI.LJII(str5, C2097608Jq.LJIIJ(pairArr));
                    DialogInterface dialogInterface2 = dialogInterface;
                    if (dialogInterface2 != null) {
                        dialogInterface2.dismiss();
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    C932420aN6 c932420aN6 = this.LIZ;
                    C917140ZyS.LJII(numValueOf, str3, th, c932420aN6.LL, c932420aN6.LLILZIL, c932420aN6.LLILLL);
                }
            }, true, z3, z4, z2, EnumC919910a2v.FROM_MULTI_GUEST_MANAGE_PANEL, null);
        }
        if (z) {
            C915850ZwN.LJIIJJI(24, this.LLILLL.getId(), "click", null, false);
        }
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x069b  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0a8T, X.0aNB] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0a73, X.0bDH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C932420aN6(android.content.Context r21, X.InterfaceC932640aNS r22, com.bytedance.android.live.base.model.user.User r23, java.lang.String r24, com.bytedance.ies.sdk.datachannel.DataChannel r25, java.lang.String r26, X.C932100aMa r27, X.EnumC932550aNJ r28) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932420aN6.<init>(android.content.Context, X.0aNS, com.bytedance.android.live.base.model.user.User, java.lang.String, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, X.0aMa, X.0aNJ):void");
    }

    public /* synthetic */ C932420aN6(Context context, InterfaceC932640aNS interfaceC932640aNS, User user, String str, DataChannel dataChannel, String str2, C932100aMa c932100aMa, int i) {
        this(context, interfaceC932640aNS, user, str, dataChannel, (i & 32) != 0 ? "guest_control_popup_panel" : str2, (i & 64) != 0 ? C932440aN8.LIZJ() : c932100aMa, (EnumC932550aNJ) null);
    }
}
