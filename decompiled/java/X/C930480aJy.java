package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multihost.event.MultiLivePermitChannel;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestToastWithAppLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS100S1000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930480aJy {
    public static final C930480aJy LIZ = new C930480aJy();
    public static final Map<Long, Long> LIZIZ = new LinkedHashMap();
    public static final int LIZJ = 2460;
    public static long LIZLLL;

    public static long LJIIIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    public static LinkPlayerInfo LJIIJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return null;
        }
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LIZIZ = 0;
        linkPlayerInfo.mInteractIdStr = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        linkPlayerInfo.mUser = owner;
        return linkPlayerInfo;
    }

    public static boolean LJIIL() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        InterfaceC927510aFB interfaceC927510aFB;
        if (!LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || interfaceC954180awCLLJLL.LLIIJLIL() == null) {
            return true;
        }
        LIZ.getClass();
        Layout layoutLJIILLIIL = LJIILLIIL();
        if (layoutLJIILLIIL == null) {
            return true;
        }
        if (C500260Jjc.LJJIIZ(layoutLJIILLIIL.anchorZoomLayoutId) && C500260Jjc.LJJIIZ(layoutLJIILLIIL.zoomLayoutId)) {
            return true;
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
        Boolean boolValueOf = null;
        if ((objLJIIIZ instanceof InterfaceC927510aFB) && (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ) != null) {
            boolValueOf = Boolean.valueOf(interfaceC927510aFB.LJIIIIZZ());
        }
        return C176600m4.LIZIZ(boolValueOf);
    }

    public static Layout LJIILLIIL() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC927510aFB interfaceC927510aFB;
        Layout layoutLJIIZILJ;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
        if ((objLJIIIZ instanceof InterfaceC927510aFB) && (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ) != null && (layoutLJIIZILJ = interfaceC927510aFB.LJIIZILJ()) != null) {
            return layoutLJIIZILJ;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null) {
            return null;
        }
        return interfaceC937900aVwLLIIJLIL.LJFF();
    }

    public static boolean LJIIIIZZ() {
        UserAttr userAttr = UserService.getInstance().user().LJIJJLI().getUserAttr();
        if (userAttr != null) {
            return userAttr.isAdmin;
        }
        return false;
    }

    public static AwS100S1000000_15 LJIILIIL() {
        String layoutId;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        if (C931790aM5.LIZIZ()) {
            layoutId = C940770aaZ.LIZ().getDataSource().LJIL();
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (layoutId = interfaceC937820aVoLJJJJZ.getLayoutId()) == null) {
                layoutId = "";
            }
        }
        return new AwS100S1000000_15(layoutId, 8);
    }

    public static boolean LJIJ() {
        return LJIJI(UserService.getInstance().user().LJIJJLI());
    }

    public static boolean LJJ() {
        if (System.currentTimeMillis() - LIZLLL <= 500) {
            return true;
        }
        LIZLLL = System.currentTimeMillis();
        return false;
    }

    public static boolean LJJI() {
        int size;
        if (C917810ZzX.LJIILIIL()) {
            size = C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ());
        } else {
            List listLIZLLL = C917520Zz4.LIZLLL();
            size = listLIZLLL != null ? listLIZLLL.size() : 0;
        }
        if (size >= 1 || Intrinsics.LJFF(C917520Zz4.LJIIL(), "live_voice")) {
            return true;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        return C927600aFK.LIZLLL();
    }

    public static boolean LJJIIZI() {
        return C924810aAp.LJ().LJIIIIZZ && LJIJI(UserService.getInstance().user().LJIJJLI());
    }

    public static int LJIIJJI(LinkPlayerInfo linkPlayerInfo) {
        User user;
        FollowInfo followInfo;
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null && (followInfo = user.getFollowInfo()) != null) {
            return (int) followInfo.getFollowStatus();
        }
        return 0;
    }

    public static int LJIILJJIL(C957020b0m c957020b0m) {
        int i;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        int width;
        InterfaceC940060aZQ interfaceC940060aZQ;
        int iWidth = c957020b0m.getShapeDescriptor().LIZ.width();
        int iHeight = c957020b0m.getShapeDescriptor().LIZ.height();
        if (iWidth > iHeight) {
            i = iHeight;
        } else {
            i = iWidth;
        }
        int i2 = (int) (i * 0.5f);
        if (C917890Zzf.LIZ(false)) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            FrameLayout frameLayoutLIZIZ = null;
            if (interfaceC954180awCLLJLL != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
            } else {
                interfaceC937900aVwLLIIJLIL = null;
            }
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                frameLayoutLIZIZ = interfaceC940060aZQ.LIZIZ();
            }
            if (frameLayoutLIZIZ != null) {
                width = frameLayoutLIZIZ.getWidth();
            } else {
                width = -1;
            }
            return (int) new C2140208a0(iWidth, iHeight, width).LIZ();
        }
        return i2;
    }

    public static int LJIILL(InterfaceC937840aVq interfaceC937840aVq) {
        int i;
        int i2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        int width;
        InterfaceC940060aZQ interfaceC940060aZQ;
        ViewGroup.LayoutParams layoutParams = interfaceC937840aVq.LJJIIJ().getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = interfaceC937840aVq.LJJIIJ().getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        } else {
            i2 = 0;
        }
        int iMin = (int) (Math.min(i, i2) * 0.5f);
        if (C917890Zzf.LIZ(false)) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            FrameLayout frameLayoutLIZIZ = null;
            if (interfaceC954180awCLLJLL != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
            } else {
                interfaceC937900aVwLLIIJLIL = null;
            }
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                frameLayoutLIZIZ = interfaceC940060aZQ.LIZIZ();
            }
            if (frameLayoutLIZIZ != null) {
                width = frameLayoutLIZIZ.getWidth();
            } else {
                width = -1;
            }
            return (int) new C2140208a0(i, i2, width).LIZ();
        }
        return iMin;
    }

    public static boolean LJIJI(User user) {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (owner = room.getOwner()) != null && owner.getId() == user.getId() && user.getId() != 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJ(Long l) {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf = null;
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        }
        return Intrinsics.LJFF(lValueOf, l);
    }

    public static boolean LJIJJLI(String str) {
        return LJIJJ(Long.valueOf(C01HE.LJI(str)));
    }

    public static boolean LJIL(Long l) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (l != null && currentUserId == l.longValue()) {
            return true;
        }
        return false;
    }

    public static boolean LJJIFFI(C470590Icr c470590Icr) {
        if (c470590Icr != null && c470590Icr.statusCode == 0 && c470590Icr.data != 0) {
            return true;
        }
        return false;
    }

    public static boolean LJJII(String str) {
        return Intrinsics.LJFF(str, "business_mute_source_audio_mute_punish");
    }

    public static boolean LJJIJ(boolean z) {
        if (!LJJIIZI()) {
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (C923330a8R.LJFF() && !z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static String LJJIJL(Long l) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfo;
        boolean zLJIJ = LJIJ();
        C948450amx c948450amx = C948450amx.LIZIZ;
        Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (objLJIIIZ instanceof InterfaceC917640ZzG) {
            interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ;
        } else {
            interfaceC917640ZzG = null;
        }
        if (l == null) {
            return null;
        }
        l.longValue();
        if (zLJIJ) {
            Object objLJIIIZ2 = c948450amx.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (!(objLJIIIZ2 instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ2) == null || (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) == null || (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ2.LJIILIIL(l.longValue())) == null) {
                return null;
            }
            return linkPlayerInfo.mInteractIdStr;
        }
        if (interfaceC917640ZzG == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIILIIL(l.longValue())) == null) {
            return null;
        }
        return linkListUser.linkMicId;
    }

    public static int LIZ(LinkPlayerInfo linkPlayerInfo, MultiGuestDataHolder multiGuestDataHolder) {
        String str = null;
        if (linkPlayerInfo != null) {
            str = linkPlayerInfo.mInteractIdStr;
        }
        Boolean boolLIZLLL = multiGuestDataHolder.LIZLLL(str);
        if (boolLIZLLL != null) {
            boolean zBooleanValue = boolLIZLLL.booleanValue();
            Integer num = 2;
            num.intValue();
            if (zBooleanValue) {
                return num.intValue();
            }
            return 1;
        }
        return 1;
    }

    public static int LIZIZ(LinkListUser linkListUser, MultiGuestDataHolder multiGuestDataHolder) {
        String str = null;
        if (linkListUser != null) {
            str = linkListUser.linkMicId;
        }
        Boolean boolLIZLLL = multiGuestDataHolder.LIZLLL(str);
        if (boolLIZLLL != null) {
            boolean zBooleanValue = boolLIZLLL.booleanValue();
            Integer num = 2;
            num.intValue();
            if (zBooleanValue) {
                return num.intValue();
            }
            return 1;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r7, com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r8) {
        /*
            boolean r0 = X.C927560aFG.LIZJ()
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L6a
            if (r7 == 0) goto L67
            long r0 = r7.linkTypePermission
        Lc:
            int r1 = X.C916490ZxP.LIZLLL(r0)
            r0 = 3
            if (r1 == r0) goto L15
            if (r1 != r3) goto L6a
        L15:
            r6 = 1
        L16:
            boolean r0 = X.C930540aK4.LIZJ()
            r5 = 0
            if (r0 == 0) goto L50
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r1 = r1.LJIIIZ(r0)
            boolean r0 = r1 instanceof X.InterfaceC302401Fe
            if (r0 == 0) goto L65
            X.01Fe r1 = (X.InterfaceC302401Fe) r1
            if (r1 == 0) goto L65
            X.0aGn r4 = r1.LIZ()
        L31:
            if (r6 == 0) goto L4f
            if (r7 == 0) goto L37
            java.lang.String r5 = r7.mInteractIdStr
        L37:
            java.lang.Boolean r1 = r8.LJIILLIIL(r5)
            r0 = 2
            if (r1 == 0) goto L6c
            boolean r1 = r1.booleanValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r0.intValue()
            if (r1 == 0) goto L8d
            int r2 = r0.intValue()
        L4f:
            return r2
        L50:
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_MODERATOR_USER_MANAGER"
            java.lang.Object r1 = r1.LJIIIZ(r0)
            boolean r0 = r1 instanceof X.InterfaceC917530Zz5
            if (r0 == 0) goto L65
            X.0Zz5 r1 = (X.InterfaceC917530Zz5) r1
            if (r1 == 0) goto L65
            X.0aGn r4 = r1.LIZ()
            goto L31
        L65:
            r4 = r5
            goto L31
        L67:
            r0 = 3
            goto Lc
        L6a:
            r6 = 0
            goto L16
        L6c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r2.intValue()
            if (r4 == 0) goto L8f
            if (r7 == 0) goto L7b
            java.lang.String r1 = r7.mInteractIdStr
            if (r1 != 0) goto L7d
        L7b:
            java.lang.String r1 = ""
        L7d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L8d
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C921170a4x.LJII(r4, r1)
            if (r0 == 0) goto L8d
            int r0 = r0.mLinkType
            if (r0 != r3) goto L8f
        L8d:
            r2 = 1
            return r2
        L8f:
            int r2 = r2.intValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C930480aJy.LIZJ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder):int");
    }

    public static int LIZLLL(LinkListUser linkListUser, MultiGuestDataHolder multiGuestDataHolder) {
        boolean z;
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        String str;
        LinkListUser linkListUserLJIIIIZZ;
        long j = multiGuestDataHolder.LJJJZ;
        if (j != 3 && j != 1) {
            z = false;
        } else {
            z = true;
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        String str2 = null;
        if (objLJIIIZ instanceof InterfaceC917640ZzG) {
            interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ;
        } else {
            interfaceC917640ZzG = null;
        }
        if (!z) {
            return 0;
        }
        if (linkListUser != null) {
            str2 = linkListUser.linkMicId;
        }
        Boolean boolLJIILLIIL = multiGuestDataHolder.LJIILLIIL(str2);
        if (boolLJIILLIIL != null) {
            boolean zBooleanValue = boolLJIILLIIL.booleanValue();
            Integer num = 2;
            num.intValue();
            if (zBooleanValue) {
                return num.intValue();
            }
            return 1;
        }
        Integer num2 = 2;
        num2.intValue();
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null) {
            if (linkListUser == null || (str = linkListUser.linkMicId) == null) {
                str = "";
            }
            if (TextUtils.isEmpty(str) || (linkListUserLJIIIIZZ = C921170a4x.LJIIIIZZ(abstractC928510aGnLIZ, str)) == null || linkListUserLJIIIIZZ.linkType == 1) {
                return 1;
            }
        }
        return num2.intValue();
    }

    public static boolean LJJIII(MotionEvent motionEvent, View view) {
        if (motionEvent == null || view == null) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public static void LJJIJIL(String str, String str2) {
        String str3;
        C766270U4b.LJIIJJI(str);
        if (LiveSdkMultiGuestToastWithAppLogSetting.INSTANCE.isEnable()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
            c474500IjALIZ.LJJII(C930540aK4.LJIIJ(), "room_id");
            LIZ.getClass();
            c474500IjALIZ.LJJII(Long.valueOf(LJIIIZ()), "anchor_id");
            if (C930540aK4.LIZJ()) {
                str3 = "anchor";
            } else {
                str3 = "user";
            }
            c474500IjALIZ.LJJII(str3, "user_type");
            c474500IjALIZ.LJJII(str2, "msg_id");
            c474500IjALIZ.LJJII(str, "msg_content");
            c474500IjALIZ.LJJII("", "extra");
            c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())), "guest_cnt");
            c474500IjALIZ.LIZ();
        }
    }

    public static boolean LJ(String str, Context context, final C11NJ c11nj) {
        if (!UserService.getInstance().user().isLogin()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C476760Imo c476760Imo = new C476760Imo();
            c476760Imo.LIZ = C497740JfY.LJIJI(2131851927);
            c476760Imo.LIZJ = -1;
            c476760Imo.LJ = "gift";
            c476760Imo.LJFF = str;
            c476760Imo.LIZLLL = "popup";
            interfaceC500940JkiUser.LJIILL(context, new C501600Jlm(c476760Imo)).LIZIZ(new C476750Imn<InterfaceC2262081DgM>() { // from class: X.0aK0
                @Override // X.C476750Imn, X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    c11nj.LIZ(interfaceC420801kM);
                }
            });
            return false;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJJIJIIJI(2131843092, "pm_mig_live_no_internet_connection_new", "");
        return false;
    }

    public static boolean LJFF(LinkPlayerInfo linkPlayerInfo, int i, boolean z) {
        String strLIZ;
        String strLIZ2;
        User user;
        String strLIZ3;
        String strLIZ4;
        User user2;
        int i2;
        String idStr;
        String str;
        User user3;
        User user4;
        User user5;
        boolean z2 = true;
        Object[] objArr = new Object[1];
        Integer numValueOf = null;
        if (linkPlayerInfo != null && (user5 = linkPlayerInfo.mUser) != null) {
            strLIZ = C0KVU.LIZ(user5);
        } else {
            strLIZ = null;
        }
        objArr[0] = strLIZ;
        String strLJIJJ = C497740JfY.LJIJJ(2131843477, objArr);
        if (strLJIJJ == null || !z) {
            Object[] objArr2 = new Object[1];
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                strLIZ2 = C0KVU.LIZ(user);
            } else {
                strLIZ2 = null;
            }
            objArr2[0] = strLIZ2;
            strLJIJJ = C497740JfY.LJIJJ(2131843478, objArr2);
        }
        Object[] objArr3 = new Object[1];
        if (linkPlayerInfo != null && (user4 = linkPlayerInfo.mUser) != null) {
            strLIZ3 = C0KVU.LIZ(user4);
        } else {
            strLIZ3 = null;
        }
        objArr3[0] = strLIZ3;
        String strLJIJJ2 = C497740JfY.LJIJJ(2131843480, objArr3);
        if (strLJIJJ2 == null || !z) {
            Object[] objArr4 = new Object[1];
            if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                strLIZ4 = C0KVU.LIZ(user2);
            } else {
                strLIZ4 = null;
            }
            objArr4[0] = strLIZ4;
            strLJIJJ2 = C497740JfY.LJIJJ(2131843481, objArr4);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        if (linkPlayerInfo != null) {
            i2 = linkPlayerInfo.appVersion;
        } else {
            i2 = 0;
        }
        if (i2 < LIZJ) {
            if (i == 1) {
                C766270U4b.LJIIJJI(strLJIJJ);
            } else {
                C766270U4b.LJIIJJI(strLJIJJ2);
            }
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkMuteLimitedAndShowToast-> userid:");
        if (linkPlayerInfo != null && (user3 = linkPlayerInfo.mUser) != null) {
            idStr = user3.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" , interactId:");
        if (linkPlayerInfo != null) {
            str = linkPlayerInfo.mInteractIdStr;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" , status:");
        sbLIZ.append(i);
        sbLIZ.append(" , isOpCamera:");
        sbLIZ.append(z);
        sbLIZ.append(" , appVersion:");
        if (linkPlayerInfo != null) {
            numValueOf = Integer.valueOf(linkPlayerInfo.appVersion);
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" , limited:");
        sbLIZ.append(z2);
        C20441214yg.LJIIIZ("anchorMuteGuest/anchor", C2188811AlT.LIZIZ(sbLIZ));
        return z2;
    }

    public static void LJIIZILJ(C930480aJy c930480aJy, Context context, Throwable th) {
        c930480aJy.getClass();
        String strLJIJI = C497740JfY.LJIJI(2131851936);
        if (th != null && context != null) {
            if (th instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                String prompt = c501470JlZ.getPrompt();
                String alert = c501470JlZ.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    C501540Jlg.LIZ(context, alert, context.getResources().getString(2131851921));
                    return;
                } else if (!TextUtils.isEmpty(prompt)) {
                    C766270U4b.LJIIIZ(context, prompt);
                    return;
                } else {
                    C766270U4b.LJIIIZ(context, strLJIJI);
                    return;
                }
            }
            C766270U4b.LJFF(2131851936, context);
        }
    }

    public static void LJJIIJ(String str, String str2, String str3) {
        String str4;
        Context contextLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        sbLIZ.append(str4);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            if (str3 != null && (contextLIZ = C176600m4.LIZ()) != null) {
                C501540Jlg.LIZ(contextLIZ, str3, contextLIZ.getResources().getString(2131851921));
            }
            C766270U4b.LJIIJJI(str2);
        }
    }

    public static final void LJJIJIIJI(int i, String str, String str2) {
        String str3;
        String strLJIJI = C497740JfY.LJIJI(i);
        if (strLJIJI == null) {
            return;
        }
        C766270U4b.LJIIJJI(strLJIJI);
        if (LiveSdkMultiGuestToastWithAppLogSetting.INSTANCE.isEnable()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
            c474500IjALIZ.LJJII(C930540aK4.LJIIJ(), "room_id");
            LIZ.getClass();
            c474500IjALIZ.LJJII(Long.valueOf(LJIIIZ()), "anchor_id");
            if (C930540aK4.LIZJ()) {
                str3 = "anchor";
            } else {
                str3 = "user";
            }
            c474500IjALIZ.LJJII(str3, "user_type");
            c474500IjALIZ.LJJII(str, "msg_id");
            c474500IjALIZ.LJJII(strLJIJI, "msg_content");
            c474500IjALIZ.LJJII(str2, "extra");
            c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())), "guest_cnt");
            c474500IjALIZ.LIZ();
        }
    }

    public static boolean LJJJI(DataChannel dataChannel, Function0 function0, boolean z) {
        boolean z2;
        Boolean boolValueOf;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        List<LinkUser> listLIZLLL;
        if (C494680Jac.LJI(dataChannel)) {
            if (z) {
                if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel)) {
                    LJJIJIIJI(2131856620, "ttlive_superFanLIVE_preview_toast_general", "");
                } else {
                    LJJIJIIJI(2131844448, "pm_sublive_preview_toast_general", "");
                    return false;
                }
            }
            return false;
        }
        if (Intrinsics.LJFF(Boolean.valueOf(C922570a7D.LIZ(dataChannel)), Boolean.TRUE) && ((interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || listLIZLLL.size() <= 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("validateGuestMicFeatureForAnchor", "[onClick] isViewerLimitPerception", null, null);
            if (z) {
                LJJIJIIJI(2131844624, "pm_unavailable1", "");
            }
            return false;
        }
        C930510aK1 c930510aK1 = (C930510aK1) dataChannel.gg0(MultiLivePermitChannel.class);
        Boolean boolValueOf2 = null;
        if (c930510aK1 != null && c930510aK1.LIZ) {
            if (!z) {
                return false;
            }
            if (c930510aK1.LIZJ == 4003036) {
                FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
                if (fragmentManager != null) {
                    Room room = (Room) dataChannel.gg0(RoomChannel.class);
                    if (room != null && room.cppVersion == 2) {
                        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showCppUnlockGuideDialogV2(C497740JfY.LJIJI(2131842925), "multi_guest", Boolean.FALSE, fragmentManager);
                        function0.invoke();
                    } else {
                        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showCppUnlockGuideDialog(C497740JfY.LJIJI(2131842925), "multi_guest", Boolean.FALSE, fragmentManager);
                        function0.invoke();
                    }
                }
            } else {
                C0KX8 c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class);
                if (c0kx8 != null) {
                    boolValueOf2 = Boolean.valueOf(c0kx8.LJFF);
                }
                if (C176600m4.LIZIZ(boolValueOf2)) {
                    LJJIJIIJI(2131844182, "pm_subFeatureBan_LIVEhostPage_multiSuspendToast", "");
                } else {
                    C766270U4b.LJIIJJI(c930510aK1.LIZIZ);
                }
            }
            Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room2 != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_feature_locked_toast_show");
                c474500IjALIZ.LJJII(Long.valueOf(room2.getId()), "room_id");
                c474500IjALIZ.LJJII(C354201Zc.LIZ(room2.getStreamType()), "live_type");
                c474500IjALIZ.LJJII(Long.valueOf(room2.getOwnerUserId()), "anchor_id");
                c474500IjALIZ.LJJII("multi_guest", "feature");
                c474500IjALIZ.LIZ();
            }
            return false;
        }
        C0KX8 c0kx82 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class);
        if (c0kx82 != null) {
            boolValueOf = Boolean.valueOf(c0kx82.LJFF);
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            if (z) {
                LJJIJIIJI(2131844182, "pm_subFeatureBan_LIVEhostPage_multiSuspendToast", "");
            }
            return false;
        }
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(C926530aDb.LIZ(z, (Room) dataChannel.gg0(RoomChannel.class))))) {
            return false;
        }
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1() && !C917140ZyS.LJIIJ(dataChannel)) {
            if (z) {
                LJJIJIIJI(2131842195, "pm_in_lineup", "");
            }
            return false;
        }
        C934320aQA c934320aQA = (C934320aQA) dataChannel.gg0(C956830b0T.class);
        if (c934320aQA != null && c934320aQA.LJI()) {
            Room room3 = (Room) dataChannel.gg0(RoomChannel.class);
            if (room3 != null) {
                boolValueOf2 = Boolean.valueOf(room3.hasMultiLivePermissionAnchorSide());
            }
            if (!C500260Jjc.LJJIJIIJIL(boolValueOf2)) {
                return true;
            }
        }
        if (z) {
            LJJIJIIJI(2131844624, "pm_unavailable1", "");
        }
        return false;
    }

    public static C758340Tou LJI(MultiGuestDataHolder multiGuestDataHolder, boolean z, boolean z2, int i) {
        String strLIZLLL;
        C758340Tou c758340Tou = new C758340Tou();
        C924790aAn.LIZLLL();
        c758340Tou.LIZ = C924790aAn.LIZLLL().LJFF;
        c758340Tou.LIZLLL = i;
        c758340Tou.LJFF = z;
        c758340Tou.LJ = z2;
        c758340Tou.LIZIZ = C924790aAn.LIZLLL().LJII;
        c758340Tou.LIZJ = C924790aAn.LIZLLL().LJIIIIZZ;
        if (C924790aAn.LIZLLL().LJIIL == 2) {
            String strLIZLLL2 = C924810aAp.LJ().LIZLLL();
            if (strLIZLLL2 != null) {
                multiGuestDataHolder.LJIJJLI(strLIZLLL2, true);
            }
            c758340Tou.LJ = false;
        } else if (C924790aAn.LIZLLL().LJIIL == 1 && (strLIZLLL = C924810aAp.LJ().LIZLLL()) != null) {
            multiGuestDataHolder.LJIJJLI(strLIZLLL, false);
            return c758340Tou;
        }
        return c758340Tou;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIL(android.widget.ImageView r5, int r6, android.content.Context r7, boolean r8, boolean r9) {
        /*
            r4 = 2130975492(0x7f041b04, float:1.7559837E38)
            if (r9 == 0) goto L1b
            boolean r0 = r5 instanceof com.bytedance.android.live.design.view.icon.LiveIconView
            if (r0 == 0) goto L13
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            android.graphics.drawable.Drawable r0 = X.C0UDZ.LIZ(r4)
            r5.setIcon(r0)
            return
        L13:
            android.graphics.drawable.Drawable r0 = X.C0UDZ.LIZ(r4)
            r5.setImageDrawable(r0)
            return
        L1b:
            r3 = 1
            if (r8 != 0) goto L5c
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r2 = (com.bytedance.android.live.liveinteract.api.IInteractService) r2
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L5a
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
        L3e:
            boolean r0 = r2.ny1(r0)
            if (r0 != 0) goto L5c
            r2 = 0
        L45:
            if (r6 == r3) goto L80
            r0 = 2
            if (r6 != r0) goto L59
            boolean r0 = r5 instanceof com.bytedance.android.live.design.view.icon.LiveIconView
            if (r0 == 0) goto L6b
            if (r2 == 0) goto L5e
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            android.graphics.drawable.Drawable r0 = X.C0UDZ.LIZ(r4)
            r5.setIcon(r0)
        L59:
            return
        L5a:
            r0 = 0
            goto L3e
        L5c:
            r2 = 1
            goto L45
        L5e:
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            r0 = 2131106192(0x7f061990, float:1.7824928E38)
            int r0 = X.C20736316Cj.LJ(r0, r7)
            r5.setIcon(r0)
            return
        L6b:
            if (r2 == 0) goto L75
            android.graphics.drawable.Drawable r0 = X.C0UDZ.LIZ(r4)
            r5.setImageDrawable(r0)
            return
        L75:
            r0 = 2130975491(0x7f041b03, float:1.7559835E38)
            android.graphics.drawable.Drawable r0 = X.C0UDZ.LIZ(r0)
            r5.setImageDrawable(r0)
            return
        L80:
            boolean r1 = r5 instanceof com.bytedance.android.live.design.view.icon.LiveIconView
            r0 = 2130975494(0x7f041b06, float:1.755984E38)
            if (r1 == 0) goto L9c
            if (r2 == 0) goto L8f
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            r5.setIcon(r0)
            return
        L8f:
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            r0 = 2131106189(0x7f06198d, float:1.7824922E38)
            int r0 = X.C20736316Cj.LJ(r0, r7)
            r5.setIcon(r0)
            return
        L9c:
            if (r2 == 0) goto La6
            android.graphics.drawable.Drawable r0 = X.C0UDZ.LIZ(r0)
            r5.setImageDrawable(r0)
            return
        La6:
            r0 = 2130975493(0x7f041b05, float:1.7559839E38)
            android.graphics.drawable.Drawable r0 = X.C0UDZ.LIZ(r0)
            r5.setImageDrawable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C930480aJy.LJJIL(android.widget.ImageView, int, android.content.Context, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (X.C923330a8R.LJIIIZ() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIZ(android.widget.ImageView r3, int r4, android.content.Context r5, boolean r6, java.lang.Boolean r7) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C930480aJy.LJJIZ(android.widget.ImageView, int, android.content.Context, boolean, java.lang.Boolean):void");
    }

    public static void LJJJ(LiveIconView liveIconView, EnumC920250a3T enumC920250a3T, Context context, int i, int i2, boolean z) {
        int i3;
        int i4 = C920270a3V.LIZ[enumC920250a3T.ordinal()];
        int i5 = R.attr.dst;
        if (i4 != 1) {
            if (i4 != 2) {
                if (liveIconView != null) {
                    if (!z) {
                        i5 = R.attr.dss;
                    }
                    liveIconView.setIcon(C20736316Cj.LJ(i5, context));
                    liveIconView.setIconTint(i2);
                    return;
                }
                return;
            }
            if (liveIconView == null) {
                return;
            }
            if (z) {
                i3 = R.attr.dn_;
            } else {
                i3 = R.attr.cs2;
            }
            liveIconView.setIcon(C20736316Cj.LJ(i3, context));
            liveIconView.setIconTint(i);
            return;
        }
        if (liveIconView == null) {
            return;
        }
        if (!z) {
            i5 = R.attr.dss;
        }
        liveIconView.setIcon(C20736316Cj.LJ(i5, context));
        liveIconView.setIconTint(i);
    }

    public static void LJJIIZ(C930480aJy c930480aJy, final Context context, final LinkPlayerInfo linkPlayerInfo, final int i, C11NJ c11nj, C01G5 c01g5, WeakReference weakReference, int i2) {
        String idStr;
        String str;
        Integer numValueOf;
        Integer numValueOf2;
        long id;
        User user;
        User user2;
        final WeakReference weakReference2 = weakReference;
        final C01G5 c01g52 = c01g5;
        Long lValueOf = null;
        if ((i2 & 16) != 0) {
            c01g52 = null;
        }
        if ((i2 & 32) != 0) {
            weakReference2 = null;
        }
        c930480aJy.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realAnchorMuteGuestOp-> userid:");
        if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
            idStr = user2.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" , interactId:");
        if (linkPlayerInfo != null) {
            str = linkPlayerInfo.mInteractIdStr;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" , appVersion:");
        if (linkPlayerInfo != null) {
            numValueOf = Integer.valueOf(linkPlayerInfo.appVersion);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("anchorMuteGuest/anchor", C2188811AlT.LIZIZ(sbLIZ));
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
        if (c01g52 != null) {
            numValueOf2 = Integer.valueOf(c01g52.getFlag());
        } else {
            numValueOf2 = null;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        long jLJIIIZ = LJIIIZ();
        long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        C927640aFO c927640aFO = new C927640aFO(id, jLJIIIZ, jLJIILL, lValueOf, i, numValueOf2, null);
        c927600aFKLIZ.getClass();
        C19487311Lz.LIZIZ(C927600aFK.LIZIZ(c927640aFO), c11nj, new C09JN() { // from class: X.01GB
            @Override // X.C09JN
            public final void accept(Object obj) {
                Integer numValueOf3;
                String str2;
                RequestError requestError;
                RequestError requestError2;
                boolean z;
                User user3;
                Long lValueOf2;
                User user4;
                User user5;
                Long lValueOf3;
                User user6;
                User user7;
                User user8;
                User user9;
                Function0<Unit> function0;
                User user10;
                int i3;
                GuestMicCameraManageResponse.ResponseData responseData;
                C1C7U.LIZ("MultiGuestUtil@525a.realAnchorMuteGuestOp$1");
                C470590Icr c470590Icr = (C470590Icr) obj;
                C930480aJy.LIZ.getClass();
                T t = (T) null;
                if (C930480aJy.LJJIFFI(c470590Icr)) {
                    if (c470590Icr != null && (responseData = (GuestMicCameraManageResponse.ResponseData) c470590Icr.data) != null && responseData.ratelimit) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i4 = (int) ((GuestMicCameraManageResponse.ResponseData) c470590Icr.data).expirationTime;
                        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                        if (linkPlayerInfo2 != null) {
                            user10 = linkPlayerInfo2.mUser;
                        } else {
                            user10 = null;
                        }
                        if (i == 1) {
                            i3 = 2131755577;
                        } else {
                            i3 = 2131755578;
                        }
                        C766270U4b.LJIIJJI(C497740JfY.LJIIL(i3, i4, C0KVU.LIZ(user10), String.valueOf(i4)));
                    } else {
                        WeakReference<Function0<Unit>> weakReference3 = weakReference2;
                        if (weakReference3 != null && (function0 = weakReference3.get()) != null) {
                            function0.invoke();
                        }
                        int i5 = i;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 == 3) {
                                        LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo;
                                        if (linkPlayerInfo3 != null) {
                                            user9 = linkPlayerInfo3.mUser;
                                        } else {
                                            user9 = null;
                                        }
                                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843475, C0KVU.LIZ(user9)));
                                    }
                                } else if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                                    if (c01g52 != C01G5.ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME) {
                                        LinkPlayerInfo linkPlayerInfo4 = linkPlayerInfo;
                                        if (linkPlayerInfo4 != null) {
                                            user8 = linkPlayerInfo4.mUser;
                                        } else {
                                            user8 = null;
                                        }
                                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843476, C0KVU.LIZ(user8)));
                                    }
                                } else {
                                    LinkPlayerInfo linkPlayerInfo5 = linkPlayerInfo;
                                    if (linkPlayerInfo5 != null) {
                                        user7 = linkPlayerInfo5.mUser;
                                    } else {
                                        user7 = null;
                                    }
                                    C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843476, C0KVU.LIZ(user7)));
                                }
                            } else {
                                LinkPlayerInfo linkPlayerInfo6 = linkPlayerInfo;
                                if (linkPlayerInfo6 != null) {
                                    user5 = linkPlayerInfo6.mUser;
                                } else {
                                    user5 = null;
                                }
                                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843534, C0KVU.LIZ(user5)));
                                LinkPlayerInfo linkPlayerInfo7 = linkPlayerInfo;
                                if (linkPlayerInfo7 != null && (user6 = linkPlayerInfo7.mUser) != null) {
                                    lValueOf3 = Long.valueOf(user6.getId());
                                } else {
                                    lValueOf3 = null;
                                }
                                C930480aJy.LIZIZ.put(lValueOf3, Long.valueOf(System.currentTimeMillis()));
                            }
                        } else {
                            LinkPlayerInfo linkPlayerInfo8 = linkPlayerInfo;
                            if (linkPlayerInfo8 != null) {
                                user3 = linkPlayerInfo8.mUser;
                            } else {
                                user3 = null;
                            }
                            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843535, C0KVU.LIZ(user3)));
                            LinkPlayerInfo linkPlayerInfo9 = linkPlayerInfo;
                            if (linkPlayerInfo9 != null && (user4 = linkPlayerInfo9.mUser) != null) {
                                lValueOf2 = Long.valueOf(user4.getId());
                            } else {
                                lValueOf2 = null;
                            }
                            C930480aJy.LIZIZ.put(lValueOf2, Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("realAnchorMuteGuestOp-> success data ");
                    if (c470590Icr != null) {
                        t = c470590Icr.data;
                    }
                    sbLIZ2.append(t);
                    C20441214yg.LJIIIZ("anchorMuteGuest/anchor", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("realAnchorMuteGuestOp-> failed: code = ");
                    if (c470590Icr != null) {
                        numValueOf3 = Integer.valueOf(c470590Icr.statusCode);
                    } else {
                        numValueOf3 = null;
                    }
                    sbLIZ3.append(numValueOf3);
                    sbLIZ3.append(",msg=");
                    if (c470590Icr != null && (requestError2 = c470590Icr.LJ) != null) {
                        str2 = requestError2.message;
                    } else {
                        str2 = null;
                    }
                    sbLIZ3.append(str2);
                    C20441214yg.LJIIIZ("anchorMuteGuest/anchor", C2188811AlT.LIZIZ(sbLIZ3));
                    Context context2 = context;
                    if (c470590Icr != null && (requestError = c470590Icr.LJ) != null) {
                        t = (T) new Throwable(requestError.message);
                    }
                    C501540Jlg.LIZJ(context2, t);
                }
                C1C7U.LIZIZ("MultiGuestUtil@525a.realAnchorMuteGuestOp$1");
            }
        }, new C515801zg(linkPlayerInfo, context, 32), null, null, 56);
    }

    public static void LJJIJLIJ(C930480aJy c930480aJy, Long l, DataChannel dataChannel, int i, int i2, C1324720kZq c1324720kZq, boolean z, InterfaceC940060aZQ interfaceC940060aZQ, int i3) {
        boolean z2;
        Map map;
        int width;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if ((i3 & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i3 & 64) != 0) {
            z = false;
        }
        FrameLayout frameLayoutLIZIZ = null;
        if ((i3 & 128) != 0) {
            interfaceC940060aZQ = null;
        }
        c930480aJy.getClass();
        if (interfaceC940060aZQ == null) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
            } else {
                interfaceC937900aVwLLIIJLIL = null;
            }
            if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) {
                interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL;
            } else {
                interfaceC940060aZQ = null;
            }
        }
        int iMin = (int) (Math.min(i, i2) * 0.5f);
        if (interfaceC940060aZQ != null) {
            frameLayoutLIZIZ = interfaceC940060aZQ.LIZIZ();
        }
        if (C917890Zzf.LIZ(z)) {
            if (frameLayoutLIZIZ != null) {
                width = frameLayoutLIZIZ.getWidth();
            } else {
                width = -1;
            }
            iMin = (int) new C2140208a0(i, i2, width, "new layout avatar element").LIZ();
        }
        if (z2 && dataChannel != null && (map = (Map) dataChannel.gg0(C750330Tbz.class)) != null && l != null) {
            map.put(Long.valueOf(l.longValue()), Integer.valueOf(iMin));
        }
        if (c1324720kZq != null) {
            ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iMin;
                layoutParams.width = iMin;
            }
            if (c1324720kZq != null) {
                C786410Ut5.W5(c1324720kZq, layoutParams);
            }
        }
    }
}
