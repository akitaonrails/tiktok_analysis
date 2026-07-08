package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.PermitBizContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestAnchorPanelOptimizedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuestManagePanelOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlowMethodOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerNewLayoutTopicIdSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0aK4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930540aK4 {
    public static final String LJJJJ(int i) {
        switch (i) {
            case 0:
                return "multi_guest_apply_request_from_float_btn";
            case 1:
                return "multi_guest_apply_request_direct";
            case 2:
                return "multi_guest_apply_request_outside_broadcast";
            case 3:
                return "multi_guest_apply_request_from_moderator_dialog";
            case 4:
                return "multi_guest_apply_request_from_recommond";
            case 5:
                return "multi_guest_apply_request_auto_request_from_outside";
            case 6:
                return "multi_guest_apply_request_auto_request_from_guide";
            case 7:
                return "multi_guest_apply_request_from_audience_empty_mask_direct";
            case 8:
                return "multi_guest_apply_request_from_moderator_empty_mask_direct";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "multi_guest_apply_request_from_toplive_page_multi_button";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "multi_guest_apply_request_from_create_avatar";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "multi_guest_apply_request_from_guest_invite";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "multi_guest_apply_request_from_guest_invite_direct";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            default:
                return "unkonw";
            case 15:
                return "multi_guest_apply_request_from_feed_cover";
            case 16:
                return "multi_guest_apply_request_from_top_live_direct";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "multi_guest_apply_request_from_recover_hangup";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "multi_guest_apply_request_from_top_live_direct_without_apply_dialog";
            case 19:
                return "multi_guest_apply_request_from_lets_dance";
        }
    }

    public static final boolean LIZJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        User owner = room != null ? room.getOwner() : null;
        return owner != null && UserService.getInstance().user().getCurrentUserId() == owner.getId();
    }

    public static final Long LJII() {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (owner = room.getOwner()) == null) {
            return null;
        }
        return Long.valueOf(owner.getId());
    }

    public static final Room LJIIIZ() {
        return (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
    }

    public static final Long LJIIJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return Long.valueOf(room.getId());
        }
        return null;
    }

    public static final User LJIILL() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.getOwner();
        }
        return null;
    }

    public static final Long LJIILLIIL() {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (owner = room.getOwner()) == null) {
            return null;
        }
        return Long.valueOf(owner.getId());
    }

    public static final Long LJIIZILJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return Long.valueOf(room.getOwnerUserId());
        }
        return null;
    }

    public static final boolean LJIJJLI() {
        return (!LiveSdkMultiGuestAnchorPanelOptimizedSetting.INSTANCE.isEnable() || LJJIJ() || C917810ZzX.LJII()) ? false : true;
    }

    public static final boolean LJJIFFI() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return C781520UlC.LIZLLL(room) && LivePlayerNewLayoutTopicIdSetting.INSTANCE.isGameTopic(room);
    }

    public static final boolean LJJIIJZLJL() {
        return C781520UlC.LIZIZ((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
    }

    public static final boolean LJJIIZ() {
        return C781520UlC.LIZLLL((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
    }

    public static final boolean LJJIIZI() {
        return C781520UlC.LJIIL((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
    }

    public static final boolean LJJIJ() {
        return C781520UlC.LJFF((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
    }

    public static final boolean LIZLLL() {
        return (LIZJ() || LJFF()) ? false : true;
    }

    public static final boolean LJ() {
        return LJJII(UserService.getInstance().user().LJIJJLI());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJFF() {
        if (LIZJ()) {
            return false;
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        return (num != null && num.intValue() == 2) || C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) == 5;
    }

    public static final User LJIIJJI() {
        return UserService.getInstance().user().LJIJJLI();
    }

    public static final long LJIIL() {
        return UserService.getInstance().user().getCurrentUserId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJJIII() {
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        return (num != null && num.intValue() == 2) || C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) == 5;
    }

    public static final boolean LJJIJIIJI() {
        return Intrinsics.LJFF(C924810aAp.LJ().LIZIZ, Boolean.TRUE) || C924810aAp.LJ().LJIIIIZZ;
    }

    public static final boolean LJJJIL() {
        return (!MultiGuestGuestManagePanelOptSetting.isNewPanelEnabled() || C931780aM4.LJFF(null) || LJJIIJZLJL() || C917810ZzX.LJII()) ? false : true;
    }

    public static final LinkPlayerInfo LIZ(LinkListUser linkListUser) {
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.mFanTicket = linkListUser.fanTicket;
        linkPlayerInfo.mUser = linkListUser.user;
        linkPlayerInfo.mModifyTime = linkListUser.modifyTime;
        linkPlayerInfo.mLinkType = linkListUser.linkType;
        linkPlayerInfo.mRoleType = linkListUser.roleType;
        linkPlayerInfo.paidMoney = (int) linkListUser.payedMoney;
        linkPlayerInfo.mInteractIdStr = linkListUser.linkMicId;
        linkPlayerInfo.mFanTicketType = linkListUser.fanTicketType;
        linkPlayerInfo.LIZ = linkListUser.LIZ;
        linkPlayerInfo.linkTypePermission = -1L;
        linkPlayerInfo.blurredAvatar = linkListUser.blurredAvatar;
        return linkPlayerInfo;
    }

    public static final LinkListUser LIZIZ(LinkPlayerInfo linkPlayerInfo) {
        LinkListUser linkListUser = new LinkListUser();
        linkListUser.fanTicket = linkPlayerInfo.mFanTicket;
        linkListUser.user = linkPlayerInfo.mUser;
        linkListUser.modifyTime = linkPlayerInfo.mModifyTime;
        linkListUser.linkType = linkPlayerInfo.mLinkType;
        linkListUser.roleType = linkPlayerInfo.mRoleType;
        linkListUser.payedMoney = linkPlayerInfo.paidMoney;
        linkListUser.linkMicId = linkPlayerInfo.mInteractIdStr;
        linkListUser.fanTicketType = linkPlayerInfo.mFanTicketType;
        linkListUser.LIZ = linkPlayerInfo.LIZ;
        linkListUser.blurredAvatar = linkPlayerInfo.blurredAvatar;
        return linkListUser;
    }

    public static final boolean LJI(DataChannel dataChannel) {
        if (dataChannel != null) {
            return Intrinsics.LJFF(dataChannel.gg0(HasMultiGuestV3GuestModeratorWidget.class), Boolean.TRUE);
        }
        return false;
    }

    public static final Pair<Integer, Integer> LJIIIIZZ(Layout layout) {
        String str = layout.businessType;
        if (Intrinsics.LJFF(str, EnumC918990a1R.FLOAT.getBusinessType())) {
            return new Pair<>(1, 1);
        }
        if (Intrinsics.LJFF(str, EnumC918990a1R.FLOAT_FIX.getBusinessType())) {
            return new Pair<>(1, 0);
        }
        if (Intrinsics.LJFF(str, EnumC918990a1R.GRID_FLOAT.getBusinessType())) {
            return new Pair<>(0, 1);
        }
        if (Intrinsics.LJFF(str, EnumC918990a1R.GRID_FIX.getBusinessType())) {
            return new Pair<>(0, 0);
        }
        return null;
    }

    public static final String LJIILIIL(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.RoomsData roomsData;
        String str;
        String str2 = "hangout";
        if (enterRoomConfig != null) {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            if ((roomsData2 != null && (str = roomsData2.enterMethod) != null && u.LJJIIJZLJL(str, "hangout", false)) || ((roomsData = enterRoomConfig.mRoomsData) != null && (str2 = roomsData.enterMethod) != null)) {
                return str2;
            }
            return "";
        }
        return "";
    }

    public static final String LJIILJJIL(LinkPlayerInfo linkPlayerInfo) {
        String str;
        List<String> list = linkPlayerInfo.recommendTagList;
        if (list == null || (str = (String) C13LP.LJJJLZIJ(0, list)) == null) {
            return "";
        }
        return str;
    }

    public static final boolean LJIJJ(User user) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Long lValueOf = Long.valueOf(user.getId());
        c930480aJy.getClass();
        return C930480aJy.LJIJJ(lValueOf);
    }

    public static final boolean LJIL(User user) {
        C930480aJy.LIZ.getClass();
        if (!C930480aJy.LJIJI(user) && !LJJIIJ(user)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJ(PermitApplyMessage permitApplyMessage) {
        Boolean boolValueOf;
        BusinessContent businessContent;
        MultiLiveContent multiLiveContent;
        PermitBizContent permitBizContent;
        BizContentWrapper bizContentWrapper = permitApplyMessage.customMessage.bizContentWrapper;
        if (bizContentWrapper != null && (businessContent = bizContentWrapper.bizContent) != null && (multiLiveContent = businessContent.multiLiveContent) != null && (permitBizContent = multiLiveContent.permitIMContent) != null) {
            boolValueOf = Boolean.valueOf(permitBizContent.isApplyAutoApproved);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public static final boolean LJJI(User user) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Long lValueOf = Long.valueOf(user.getId());
        c930480aJy.getClass();
        if (!C930480aJy.LJIJJ(lValueOf) && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70().contains(Long.valueOf(user.getId()))) {
            return true;
        }
        return false;
    }

    public static final boolean LJJII(User user) {
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJIJI(user)) {
            return false;
        }
        return LJJIIJ(user);
    }

    public static final boolean LJJIIJ(User user) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        if (LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null && !listLJJIII2.isEmpty()) {
                Iterator it2 = listLJJIII2.iterator();
                while (it2.hasNext()) {
                    User user2 = ((LinkPlayerInfo) it2.next()).mUser;
                    if (user2 != null && user2.getId() == user.getId()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null && !listLJJIII.isEmpty()) {
            Iterator it3 = listLJJIII.iterator();
            while (it3.hasNext()) {
                User user3 = ((LinkListUser) it3.next()).user;
                if (user3 != null && user3.getId() == user.getId()) {
                    return true;
                }
            }
            return false;
        }
        return false;
        return false;
    }

    public static final boolean LJJIJIIJIL(PermitApplyMessage permitApplyMessage) {
        Boolean boolValueOf;
        BusinessContent businessContent;
        MultiLiveContent multiLiveContent;
        PermitBizContent permitBizContent;
        BizContentWrapper bizContentWrapper = permitApplyMessage.customMessage.bizContentWrapper;
        if (bizContentWrapper != null && (businessContent = bizContentWrapper.bizContent) != null && (multiLiveContent = businessContent.multiLiveContent) != null && (permitBizContent = multiLiveContent.permitIMContent) != null) {
            boolValueOf = Boolean.valueOf(permitBizContent.isQuickCallAutoApproved);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public static final <T> C01GW<T> LJJIJIL(Function0<? extends T> function0) {
        if (MultiGuestSlowMethodOptSetting.INSTANCE.isEnable()) {
            return C292401Bi.LIZ(function0);
        }
        return C452501pT.LIZIZ(function0);
    }

    public static final void LJJIJL(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
    }

    public static final void LJJIZ(LiveDialogFragment liveDialogFragment) {
        if (liveDialogFragment != null && liveDialogFragment.isShowing()) {
            liveDialogFragment.dismiss();
        }
    }

    public static final void LJJJI(Boolean bool) {
        boolean zIsAppForeground;
        if (bool != null) {
            zIsAppForeground = bool.booleanValue();
        } else {
            zIsAppForeground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (dataChannelGlobal.gg0(C930550aK5.class) != null) {
            dataChannelGlobal.JQ2(C930550aK5.class, new C924780aAm(zIsAppForeground));
        }
    }

    public static final Long LJJJJIZL(String str) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        User user;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfo;
        User user2;
        if (str == null) {
            return null;
        }
        if (LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe == null || (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) == null || (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ2.LJFF(str)) == null || (user2 = linkPlayerInfo.mUser) == null) {
                return null;
            }
            return Long.valueOf(user2.getId());
        }
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJFF(str)) == null || (user = linkListUser.user) == null) {
            return null;
        }
        return Long.valueOf(user.getId());
    }

    public static final Object LJIJ(int i, List list) {
        if (i >= list.size()) {
            return null;
        }
        return ListProtector.get(list, i);
    }

    public static final void LJJIJLIJ(ViewGroup viewGroup, Function1<? super View, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            Object next = c09re.next();
            Boolean boolInvoke = function1.invoke(next);
            if (!boolInvoke.booleanValue()) {
                boolInvoke = null;
            }
            Boolean bool = boolInvoke;
            if (bool != null) {
                bool.booleanValue();
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C500260Jjc.LJJJLL((View) it3.next());
        }
    }

    public static final void LJJJ(final View view, Runnable runnable) {
        View viewFindViewById;
        if (Build.VERSION.SDK_INT >= 24) {
            HandlerHook.viewPost(view, runnable);
            return;
        }
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        if (activityLIZ == null || (viewFindViewById = activityLIZ.findViewById(R.id.content)) == null) {
            return;
        }
        final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        final ViewTreeObserverOnGlobalLayoutListenerC854680Xfu viewTreeObserverOnGlobalLayoutListenerC854680Xfu = new ViewTreeObserverOnGlobalLayoutListenerC854680Xfu(viewTreeObserver, runnable, 5);
        C786410Ut5.x3(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
        if (!view.isAttachedToWindow()) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC854680Xfu, ViewTreeObserver.OnGlobalLayoutListener.class);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0V0n
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    C786410Ut5.C3(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
                }
            });
        }
        view.requestLayout();
    }

    public static final void LJJIL(int i, View view, ViewGroup viewGroup) {
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            try {
                if (view.getParent() == null) {
                    viewGroup.addView(view, i);
                }
                if (Intrinsics.LJFF(view.getParent(), viewGroup)) {
                    return;
                }
                C500260Jjc.LJJJLL(view);
                viewGroup.addView(view, i);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        if (view.getParent() == null) {
            viewGroup.addView(view, i);
        }
        if (Intrinsics.LJFF(view.getParent(), viewGroup)) {
            return;
        }
        C500260Jjc.LJJJLL(view);
        viewGroup.addView(view, i);
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    public static TuxIconDrawable LJJJJI(int i, Context context, Integer num, Integer num2) {
        Context contextLJJIIZI;
        if (context != null && (contextLJJIIZI = C520010KaN.LJJIIZI(context, true)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (num != null) {
                num.intValue();
                c419910GdJ.LIZIZ = num.intValue();
            }
            if (num2 != null) {
                num2.intValue();
                c419910GdJ.LIZJ = num2.intValue();
            }
            c419910GdJ.LIZ = i;
            return c419910GdJ.LIZ(contextLJJIIZI);
        }
        return null;
    }

    public static void LJIJI(DataChannel dataChannel, Context context, String str, boolean z, int i) {
        int iCeil;
        C760370TsB c760370TsBLIZJ;
        String str2;
        String host;
        boolean zBooleanValue = true;
        if ((i & 8) != 0) {
            Uri uri = UriProtector.parse(str);
            if (uri != null && (host = uri.getHost()) != null && a0.LJJIIZI(host, "lynx", false)) {
                z = true;
            } else {
                z = false;
            }
        }
        String str3 = "";
        if (!TextUtils.isEmpty(str) && context != null && dataChannel != null) {
            Uri uri2 = UriProtector.parse(str);
            uri2.getHost();
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                if (!TextUtils.isEmpty(str3)) {
                    Uri.Builder builderBuildUpon = UriProtector.parse(str3).buildUpon();
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri2);
                    if (queryParameterNames != null) {
                        for (String str4 : queryParameterNames) {
                            if (!Intrinsics.LJFF(str4, "url")) {
                                builderBuildUpon.appendQueryParameter(str4, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, str4));
                            }
                        }
                    }
                    Boolean bool = (Boolean) dataChannel.gg0(C0TZM.class);
                    if (bool != null && !(zBooleanValue = bool.booleanValue())) {
                        iCeil = (int) C497740JfY.LJJI(C465640INu.LIZIZ(context));
                    } else {
                        iCeil = (int) Math.ceil(((double) C497740JfY.LJJI(C465640INu.LIZ(context))) * 0.7d);
                    }
                    int iCeil2 = (int) Math.ceil(C497740JfY.LJJI(C465640INu.LIZIZ(context)));
                    if (z) {
                        c760370TsBLIZJ = C0KYL.LIZIZ(builderBuildUpon.build().toString());
                    } else {
                        c760370TsBLIZJ = C0KYL.LIZJ(builderBuildUpon.build().toString());
                    }
                    EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
                    c760370TsBLIZJ.LJIJI(8, enumC760350Ts9);
                    if (zBooleanValue) {
                        str2 = "bottom";
                    } else if (!C454590Hs9.LIZ(context)) {
                        str2 = "right";
                    } else {
                        str2 = "left";
                    }
                    c760370TsBLIZJ.LJIIIIZZ(str2);
                    c760370TsBLIZJ.LJIIIZ(iCeil, enumC760350Ts9);
                    c760370TsBLIZJ.LJJ(iCeil2, enumC760350Ts9);
                    c760370TsBLIZJ.LJ(-1);
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZJ.LIZ().toString(), null);
                    return;
                }
                throw new IllegalStateException("Check failed.");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("faile url->");
                sbLIZ.append(str3);
                C20441214yg.LJFF("gotoWebPage", C2188811AlT.LIZIZ(sbLIZ), e);
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("faile uriString->");
        sbLIZ2.append(str);
        sbLIZ2.append(", context->");
        sbLIZ2.append(context);
        sbLIZ2.append(", dataChannel->");
        sbLIZ2.append(dataChannel);
        C20441214yg.LJ("gotoWebPage", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
