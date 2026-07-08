package X;

import android.graphics.Rect;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkMicContainerPreloadRectChannel;
import com.bytedance.android.live.liveinteract.api.LinkMicPreLoadView;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCohostMaxInviteCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCohostMaxLinkedCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostInvitationOverIssuranceConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostInvitationOverIssuranceConfigSetting;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.LinkmicUser;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.ChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0apo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950220apo {
    public static final Room LIZJ() {
        return (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
    }

    public static final long LJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    public static final EnumC919210a1n LJIIIZ() {
        EnumC919210a1n enumC919210a1n;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        return (dataChannel == null || (enumC919210a1n = (EnumC919210a1n) dataChannel.gg0(C956670b0D.class)) == null) ? EnumC919210a1n.NONE : enumC919210a1n;
    }

    public static final int LJIIJJI() {
        return C13LZ.LJ(LinkMicCohostMaxLinkedCountSetting.INSTANCE.getValue(), 2, 4);
    }

    public static final boolean LIZ() {
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        boolean z = false;
        boolean zLJLJLJ = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LJLJLJ() : false;
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        boolean zLJJLIIJ = interfaceC954180awCLLJLL2 != null ? interfaceC954180awCLLJLL2.LJJLIIJ() : false;
        if (!zLJLJLJ && !zLJJLIIJ) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canJoinChannelNew = ");
        sbLIZ.append(z);
        sbLIZ.append(", isRtcEngineOn = ");
        sbLIZ.append(zLJLJLJ);
        sbLIZ.append(", isRtcLocked = ");
        sbLIZ.append(zLJJLIIJ);
        C20441214yg.LJIIIZ("MultiCoHostService", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static final long LIZLLL() {
        Room roomLIZJ = LIZJ();
        if (roomLIZJ != null) {
            return roomLIZJ.getId();
        }
        return 0L;
    }

    public static final long LJFF() {
        InterfaceC500940Jki interfaceC500940JkiUser;
        UserService userService = UserService.getInstance();
        if (userService == null || (interfaceC500940JkiUser = userService.user()) == null) {
            return 0L;
        }
        return interfaceC500940JkiUser.getCurrentUserId();
    }

    public static final boolean LJI() {
        return LJFF() == LJ();
    }

    public static final boolean LJIJI() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ == null) {
            return false;
        }
        List<LinkUser> listLJFF = C948780anU.LJFF(interfaceC954180awCLJIIIZ);
        if (listLJFF.isEmpty()) {
            return false;
        }
        Iterator<LinkUser> it2 = listLJFF.iterator();
        while (it2.hasNext()) {
            Long l = it2.next().userId;
            long jLJIIL = C930540aK4.LJIIL();
            if (l != null && l.longValue() == jLJIIL) {
                return true;
            }
        }
        return false;
    }

    public static final EnumC950230app LJII(boolean z) {
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() && !z && C915980Zwa.LJII().Uh() == 3) {
            return EnumC950230app.COHOST;
        }
        EnumC950230app enumC950230app = EnumC950230app.SINGLE_LIVE;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
            return EnumC950230app.MULTI_GUEST;
        }
        if (C915980Zwa.LJII().LLI() != EnumC950120ape.Linked) {
            return enumC950230app;
        }
        return EnumC950230app.COHOST;
    }

    public static final List<LinkmicUser> LJIIIIZZ(Room room) {
        CoHost coHost;
        List<LinkmicUser> list;
        MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
        if (multiLiveUserSettings == null || (coHost = multiLiveUserSettings.coHost) == null || (list = coHost.linkedUsers) == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static final int LJIIJ(C955540ayO c955540ayO) {
        int iMax = Math.max(1, LinkMicCohostMaxInviteCountSetting.INSTANCE.getValue());
        LiveCohostInvitationOverIssuranceConfig value = LiveCohostInvitationOverIssuranceConfigSetting.getValue();
        if (value.getEnabled() != 1) {
            return iMax;
        }
        for (int i : value.getSourceTypeList()) {
            if (i == c955540ayO.LIZ) {
                return Math.max(1, value.getMaximumInvitableMicSlots());
            }
        }
        return iMax;
    }

    public static final long LJIIL(Room room) {
        RoomLinkInfo linkMicInfo;
        ChannelInfo channelInfo;
        if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (channelInfo = linkMicInfo.channelInfo) != null) {
            return channelInfo.groupChannelId;
        }
        return 0L;
    }

    public static final long LJIILIIL(Room room) {
        RoomLinkInfo linkMicInfo;
        ChannelInfo channelInfo;
        if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (channelInfo = linkMicInfo.channelInfo) != null) {
            return channelInfo.innerChannelId;
        }
        return 0L;
    }

    public static final long LJIILJJIL(Room room) {
        MultiLiveUserSettings multiLiveUserSettings;
        ArrayMap<Integer, Long> arrayMap;
        Long l;
        if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (arrayMap = multiLiveUserSettings.channelMap) != null && (l = arrayMap.get(2)) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final Rect LJIILL(DataChannel dataChannel) {
        Rect rect;
        View view;
        if (C0IWY.LIZ) {
            if (dataChannel == null || (rect = (Rect) dataChannel.gg0(LinkMicContainerPreloadRectChannel.class)) == null) {
                rect = new Rect();
                if (dataChannel != null && (view = (View) dataChannel.gg0(LinkMicPreLoadView.class)) != null) {
                    view.getGlobalVisibleRect(rect);
                }
                C1AZW c1azw = C1AZW.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preLoadInteractSize, rect=");
                sbLIZ.append(rect);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1azw.getClass();
                C1AZW.LIZ("LayoutFirstFrameOptLog", strLIZIZ, null, null);
                if (dataChannel != null) {
                    dataChannel.zW(LinkMicContainerPreloadRectChannel.class, rect);
                }
            }
            return rect;
        }
        return null;
    }

    public static final long LJIILLIIL(Room room) {
        if (room == null) {
            return 0L;
        }
        return room.getOwnerUserId();
    }

    public static final C754570Tip LJIIZILJ(User user) {
        String strLJ = C0KVU.LJ(user);
        String str = "";
        if (strLJ == null) {
            strLJ = "";
        }
        String strLIZLLL = C0KVU.LIZLLL(user);
        if (strLIZLLL != null) {
            str = strLIZLLL;
        }
        return new C754570Tip(strLJ, str, user.getAvatarThumb());
    }

    public static final boolean LJIJJ(User user) {
        FollowInfo followInfo = user.getFollowInfo();
        if (followInfo == null || followInfo.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    public static final int LJIL(String str) {
        int i = 0;
        if (str != null && str.length() != 0) {
            try {
                i = CastIntegerProtector.parseInt(str);
                return i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return i;
    }

    public static final long LJJ(String str) {
        if (str != null && str.length() != 0) {
            try {
                return CastLongProtector.parseLong(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0L;
            }
        }
        return 0L;
    }

    public static final <T> boolean LIZIZ(Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection != collection2) {
            if (collection != null) {
                if (!collection.equals(collection2)) {
                    if (collection2 == null || collection.size() != collection2.size()) {
                        return false;
                    }
                    for (T t : collection) {
                        for (T t2 : collection) {
                            if (t == t2 || (t != null && t.equals(t2))) {
                                break;
                            }
                        }
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean LJIJ(int i, int i2) {
        if (i + i2 >= LJIIJJI()) {
            return true;
        }
        return false;
    }

    public static final void LJIJJLI(final View view, final Runnable runnable, final boolean z) {
        if (view == null) {
            C20441214yg.LJIIL("CoHostExt", "safePostView called on a null view.");
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.01vl
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    if (!z || (view.getWidth() > 0 && view.getHeight() > 0)) {
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeOnGlobalLayoutListener(this);
                            C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                        }
                        runnable.run();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018 A[PHI: r1
      0x0018: PHI (r1v5 java.lang.String) = (r1v0 java.lang.String), (r1v6 java.lang.String) binds: [B:12:0x0016, B:10:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0TYk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C11JL LJJI(final X.C16F5 r9, final X.C954460awe r10, java.lang.String r11, final java.lang.String r12, final kotlin.jvm.functions.Function0 r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C950220apo.LJJI(X.16F5, X.0awe, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0):X.11JL");
    }
}
