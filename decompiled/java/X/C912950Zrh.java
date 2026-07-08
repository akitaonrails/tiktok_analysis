package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.model.DMNavArg;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS337S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zrh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912950Zrh {
    public final Function1<EnterChatParams, Boolean> LIZ;
    public final InterfaceC1631620sYq<Activity, C913140Zs0, Integer, Unit> LIZIZ;

    public C912950Zrh(int i) {
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(624);
        AFwS337S0000000_14 aFwS337S0000000_14 = AFwS337S0000000_14.get$arr$(2);
        this.LIZ = aFwS229S0000000_2;
        this.LIZIZ = aFwS337S0000000_14;
    }

    public final void LIZIZ(Activity activity, DMNavArg dMNavArg) {
        String conversationId;
        Intent mainActivityIntent;
        if (dMNavArg != null && (conversationId = dMNavArg.getConversationId()) != null) {
            Integer messagePreviewEnabled = dMNavArg.getMessagePreviewEnabled();
            if (messagePreviewEnabled != null && messagePreviewEnabled.intValue() == 0 && !Intrinsics.LJFF(dMNavArg.getPushLabel(), "click_push_im_msg_req")) {
                return;
            }
            Integer numIsGroupMemberRequest = dMNavArg.isGroupMemberRequest();
            if (numIsGroupMemberRequest != null && numIsGroupMemberRequest.intValue() == 1) {
                C913140Zs0 c913140Zs0 = new C913140Zs0(UUID.randomUUID().toString());
                String conversationId2 = dMNavArg.getConversationId();
                String str = "";
                if (conversationId2 == null) {
                    conversationId2 = "";
                }
                c913140Zs0.setConversationId(conversationId2);
                String enterFrom = dMNavArg.getEnterFrom();
                if (enterFrom == null) {
                    enterFrom = "";
                }
                c913140Zs0.setEnterFromForMob(enterFrom);
                String enterMethod = dMNavArg.getEnterMethod();
                if (enterMethod != null) {
                    str = enterMethod;
                }
                c913140Zs0.setEnterMethod(str);
                this.LIZIZ.invoke(activity, c913140Zs0, 16);
                return;
            }
            if (Intrinsics.LJFF(dMNavArg.getPushLabel(), "click_activity_status")) {
                if (((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()) {
                    EnterChatParams enterChatParamsLIZ = LIZ(activity, dMNavArg, 0);
                    enterChatParamsLIZ.setEnterFromForMob("outer_push");
                    this.LIZ.invoke(enterChatParamsLIZ);
                    return;
                }
                String routerTo = dMNavArg.getRouterTo();
                if (routerTo == null) {
                    return;
                }
                int iHashCode = routerTo.hashCode();
                if (iHashCode != -1320346019) {
                    if (iHashCode != 100344454) {
                        if (iHashCode != 1619975958 || !routerTo.equals("chat_page")) {
                            return;
                        }
                        EnterChatParams enterChatParamsLIZ2 = LIZ(activity, dMNavArg, 0);
                        enterChatParamsLIZ2.setEnterFromForMob("outer_push");
                        enterChatParamsLIZ2.setReturnPage(dMNavArg.getRouterFrom());
                        enterChatParamsLIZ2.setAppLaunchFrom("out_app_push");
                        this.LIZ.invoke(enterChatParamsLIZ2);
                        return;
                    }
                    if (!routerTo.equals("inbox")) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("enter_from", "outer_push", bundle);
                    C786410Ut5.LJJJI("conversation_id", dMNavArg.getConversationId(), bundle);
                    C1336205Ku.LIZ(false).getImChatService().LJIIL(activity, bundle, false, null);
                    return;
                }
                if (!routerTo.equals("chat_panel") || !Intrinsics.LJFF(dMNavArg.getRouterFrom(), "feed_fyp") || (mainActivityIntent = ((IMainService) ServiceManager.get().getService(IMainService.class)).getMainActivityIntent(activity)) == null) {
                    return;
                }
                EnterChatParams enterChatParamsLIZ3 = LIZ(activity, dMNavArg, 0);
                enterChatParamsLIZ3.setEnterFromForMob("outer_push");
                enterChatParamsLIZ3.setQuickChat(true);
                enterChatParamsLIZ3.setAppLaunchFrom("out_app_push");
                mainActivityIntent.putExtra("key_enter_chat_params", enterChatParamsLIZ3);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, mainActivityIntent, "Context_startActivity_1");
                C1701330uNH.LIZ(mainActivityIntent, activity);
                C2204961BRm.LJIILLIIL(activity, mainActivityIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzLziRcmM8XKgFbiKeSziaXBAAltT3oDuc/T4xtjsc=", null));
                return;
            }
            if (!Intrinsics.LJFF(dMNavArg.getEnterMethod(), "deeplink_email")) {
                this.LIZ.invoke(LIZ(activity, dMNavArg, 0));
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0W8U(conversationId, this, activity, dMNavArg, null), 3);
            }
        }
    }

    public static EnterChatParams LIZ(Activity activity, DMNavArg dMNavArg, int i) {
        int i2;
        C893600Z3u c893600Z3u;
        long jLongValue;
        int iIntValue;
        Integer chatType = dMNavArg.getChatType();
        boolean z = false;
        if (chatType != null && chatType.intValue() == 0) {
            if (Intrinsics.LJFF(dMNavArg.getPushLabel(), "click_push_im_msg_req")) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 3;
        }
        EnterChatParams enterChatParams = new EnterChatParams(activity, i2, dMNavArg.getConversationId());
        enterChatParams.setEnterFromForMob(dMNavArg.getEnterFrom());
        enterChatParams.setEnterMethodForMob(dMNavArg.getEnterMethod());
        enterChatParams.setKeepEnterFrom(true);
        enterChatParams.setMsgIdFromPush(dMNavArg.getMsgIdFromPush());
        if (Intrinsics.LJFF(dMNavArg.getEnterFrom(), "outer_push")) {
            enterChatParams.setClickOutPushParams(new C892110YzB(System.currentTimeMillis(), !((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()));
        }
        if (dMNavArg.getRefMessageId() != null && dMNavArg.getRefMessageContent() != null && dMNavArg.getRefMessageSenderUid() != null && dMNavArg.getRefMessageType() != null) {
            Long refMessageId = dMNavArg.getRefMessageId();
            long jLongValue2 = 0;
            if (refMessageId != null) {
                jLongValue = refMessageId.longValue();
            } else {
                jLongValue = 0;
            }
            Integer refMessageType = dMNavArg.getRefMessageType();
            if (refMessageType != null) {
                iIntValue = refMessageType.intValue();
            } else {
                iIntValue = 0;
            }
            String refMessageContent = dMNavArg.getRefMessageContent();
            if (refMessageContent == null) {
                refMessageContent = "";
            }
            Long refMessageSenderUid = dMNavArg.getRefMessageSenderUid();
            if (refMessageSenderUid != null) {
                jLongValue2 = refMessageSenderUid.longValue();
            }
            c893600Z3u = new C893600Z3u(jLongValue, iIntValue, refMessageContent, jLongValue2);
        } else {
            c893600Z3u = null;
        }
        enterChatParams.setPushReferenceInfo(c893600Z3u);
        enterChatParams.setUnreadCount(i);
        enterChatParams.setDefaultOpenPanelType(dMNavArg.getOpenPanelType());
        enterChatParams.setOutPushLabel(dMNavArg.getPushLabel());
        Integer showKeyboardByDefault = dMNavArg.getShowKeyboardByDefault();
        if (showKeyboardByDefault != null && showKeyboardByDefault.intValue() == 1) {
            z = true;
        }
        enterChatParams.setShowKeyBoardByDefault(z);
        enterChatParams.setSourceBtmToken(dMNavArg.getSourceBtmToken());
        return enterChatParams;
    }
}
