package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.service.model.IMChatExt;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Yt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888350Yt7 extends C883710Yld {
    public static final C01GW<C888350Yt7> LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(374));

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZJ(InterfaceC888500YtM interfaceC888500YtM, final C19EG c19eg, View view) {
        C0Z8L c0z8l;
        final C879540Yeu c879540YeuLJIJI;
        FilterTabType filterTabType = null;
        if ((interfaceC888500YtM instanceof C0Z8L) && (c0z8l = (C0Z8L) interfaceC888500YtM) != null) {
            final C878950Ydx pageKey = c0z8l.getPageKey();
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            if (C881500Yi4.LJ() != null && (c879540YeuLJIJI = AbstractC883730Ylf.LJIJI(pageKey, c0z8l.getSessionId())) != null) {
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                if (C289900BXw.LIZ()) {
                    c13dvLIZIZ.add(new C877470YbZ(c19eg, c879540YeuLJIJI, pageKey));
                }
                if (((Number) C0BBJ.LIZ.getValue()).intValue() == 1) {
                    c13dvLIZIZ.add(new AbstractC880120Yfq(c19eg, c879540YeuLJIJI, pageKey) { // from class: X.0YtA
                        public final int LLJ = 2131834217;
                        public final int LLJI = R.raw.icon_multiple_square;

                        @Override // X.AbstractC880120Yfq
                        public final void LIZ() {
                            String conversationId;
                            InterfaceC894800Z8k interfaceC894800Z8k = (InterfaceC894800Z8k) PluggableExtentionKt.pluggableSpi$default(ILightInteractionPlatformService.class, false, false, false, 14, null);
                            if (interfaceC894800Z8k != null) {
                                C0Y8T c0y8t = this.LLILZ;
                                if (c0y8t == null || (conversationId = c0y8t.getConversationId()) == null) {
                                    conversationId = "";
                                }
                                interfaceC894800Z8k.LJIILIIL(conversationId, EnumC1696906kh.CONVERSATION);
                            }
                        }

                        @Override // X.AbstractC880120Yfq
                        public final boolean LJI() {
                            return !(((Number) C0BBJ.LIZ.getValue()).intValue() == 1);
                        }

                        @Override // X.AbstractC880120Yfq
                        public final int LIZIZ() {
                            return this.LLJI;
                        }

                        @Override // X.AbstractC880120Yfq
                        public final int LIZLLL() {
                            return this.LLJ;
                        }
                    });
                }
                C05RV c05rvLIZJ = C19212010Ec.LIZJ.LIZJ();
                int i = C877880YcE.LIZ[c05rvLIZJ.ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new C1954807lC();
                    }
                    c13dvLIZIZ.add(new C877710Ybx(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C877770Yc3(c19eg, c879540YeuLJIJI, pageKey));
                    if (c05rvLIZJ == C05RV.PRO_CREATOR_INBOX) {
                        if (pageKey != null) {
                            filterTabType = pageKey.LLILLL;
                        }
                        if (filterTabType == FilterTabType.ARCHIVE) {
                            c13dvLIZIZ.add(new C882820YkC(c19eg, c879540YeuLJIJI, pageKey));
                        } else {
                            c13dvLIZIZ.add(new C882810YkB(c19eg, c879540YeuLJIJI, pageKey));
                        }
                        c13dvLIZIZ.add(new C882780Yk8(c19eg, c879540YeuLJIJI, pageKey));
                        c13dvLIZIZ.add(new C882770Yk7(c19eg, c879540YeuLJIJI, pageKey));
                        c13dvLIZIZ.add(new C877750Yc1(c19eg, c879540YeuLJIJI, pageKey));
                        c13dvLIZIZ.add(new C880110Yfp(c19eg, c879540YeuLJIJI, pageKey));
                        c13dvLIZIZ.add(new C882870YkH(c19eg, c879540YeuLJIJI, pageKey));
                    } else {
                        c13dvLIZIZ.add(new C882870YkH(c19eg, c879540YeuLJIJI, pageKey));
                        c13dvLIZIZ.add(new C877750Yc1(c19eg, c879540YeuLJIJI, pageKey));
                        if (pageKey != null) {
                            filterTabType = pageKey.LLILLL;
                        }
                        if (filterTabType == FilterTabType.ARCHIVE) {
                            c13dvLIZIZ.add(new C882820YkC(c19eg, c879540YeuLJIJI, pageKey));
                        } else {
                            c13dvLIZIZ.add(new C882810YkB(c19eg, c879540YeuLJIJI, pageKey));
                        }
                        c13dvLIZIZ.add(new C880110Yfp(c19eg, c879540YeuLJIJI, pageKey));
                    }
                    c13dvLIZIZ.add(new C882850YkF(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C879020Ye4(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C888450YtH(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C887770YsB(c19eg, c879540YeuLJIJI, pageKey));
                } else {
                    c13dvLIZIZ.add(new C877750Yc1(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C877770Yc3(c19eg, c879540YeuLJIJI, pageKey));
                    if (pageKey != null) {
                        filterTabType = pageKey.LLILLL;
                    }
                    if (filterTabType == FilterTabType.ARCHIVE) {
                        c13dvLIZIZ.add(new C882820YkC(c19eg, c879540YeuLJIJI, pageKey));
                    } else {
                        c13dvLIZIZ.add(new C882810YkB(c19eg, c879540YeuLJIJI, pageKey));
                    }
                    c13dvLIZIZ.add(new C880110Yfp(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C888450YtH(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C887770YsB(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C879020Ye4(c19eg, c879540YeuLJIJI, pageKey));
                }
                c13dvLIZIZ.add(new C888400YtC(c19eg, c879540YeuLJIJI));
                c13dvLIZIZ.add(new C883700Ylc(c19eg, c879540YeuLJIJI));
                c13dvLIZIZ.add(new C888410YtD(c19eg, c879540YeuLJIJI));
                c13dvLIZIZ.add(new C888390YtB(c19eg, c879540YeuLJIJI));
                List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
                C887690Ys3.LIZ.getClass();
                C887690Ys3.LIZ(c19eg, c879540YeuLJIJI, listLIZ, view);
            }
        }
    }

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view, Map<String, String> map) {
        C0Z8L c0z8l;
        boolean z;
        int unreadCount;
        boolean z2;
        EnumC896490ZEx enumC896490ZEx;
        boolean z3;
        boolean z4;
        boolean z5;
        String uid;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        String uuid;
        UrlModel urlModel;
        String str;
        boolean zLJI = MethodIDManager.LJI(72030);
        if ((interfaceC888500YtM instanceof C0Z8L) && (c0z8l = (C0Z8L) interfaceC888500YtM) != null) {
            String sessionId = c0z8l.getSessionId();
            if (map != null && (str = map.get("has_icon")) != null) {
                z = Boolean.parseBoolean(str);
            } else {
                z = false;
            }
            IMUser imUser = c0z8l.getImUser();
            if (imUser == null) {
                imUser = new IMUser();
                imUser.setUid(String.valueOf(C0YNP.LJII(sessionId)));
                Object avatar = c0z8l.getAvatar();
                if (avatar instanceof UrlModel) {
                    urlModel = (UrlModel) avatar;
                } else {
                    urlModel = null;
                }
                imUser.setAvatarThumb(urlModel);
                imUser.setNickName(c0z8l.getName());
            }
            imUser.setType(-1);
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionId);
            IMChatExt iMChatExt = new IMChatExt();
            iMChatExt.commerceScene = "msg_list";
            ThoughtInfo thoughtBubble = c0z8l.getThoughtBubble();
            String str2 = "";
            if (thoughtBubble == null) {
                ISocialThoughtDataCenterService iSocialThoughtDataCenterService = (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpiForReal(ISocialThoughtDataCenterService.class);
                if (iSocialThoughtDataCenterService != null) {
                    String uid2 = imUser.getUid();
                    if (uid2 == null) {
                        uid2 = "";
                    }
                    thoughtBubble = iSocialThoughtDataCenterService.LIZIZ(uid2);
                } else {
                    thoughtBubble = null;
                }
            }
            EnterChatParams enterChatParams = new EnterChatParams((Context) c19eg, imUser);
            enterChatParams.setEnterFrom(3);
            enterChatParams.setEnterFromForMob(C888510YtN.LIZ(c0z8l));
            enterChatParams.setEnterMethodForMob("cell");
            C20619615mM.LIZ.getClass();
            enterChatParams.setMobEnterMethodForEditShare(C20619615mM.LIZ());
            enterChatParams.setSessionId(sessionId);
            enterChatParams.setChatExt(iMChatExt);
            enterChatParams.setHasCameraIcon(z);
            if (c0y8tLIZ != null) {
                unreadCount = (int) c0y8tLIZ.getUnreadCount();
            } else {
                unreadCount = 0;
            }
            enterChatParams.setUnreadCount(unreadCount);
            enterChatParams.setRecommendedChat(false);
            enterChatParams.setUnreadViewState(c0z8l.getSessionUnreadViewState());
            boolean z6 = true;
            if (c0y8tLIZ != null && c0y8tLIZ.isStickTop()) {
                z2 = true;
            } else {
                z2 = false;
            }
            enterChatParams.setStickyTop(z2);
            enterChatParams.setTCM(c0z8l.isTCM());
            C894700Z8a activityStatusTextWithType = c0z8l.getActivityStatusTextWithType();
            if (activityStatusTextWithType == null || (enumC896490ZEx = activityStatusTextWithType.LIZIZ) == null) {
                enumC896490ZEx = EnumC896490ZEx.NO_STATUS;
            }
            enterChatParams.setActivityStatus(enumC896490ZEx);
            enterChatParams.setLastMessageMsgType(c0z8l.getLastMessageMsgType());
            C869590Y9l lastMsg = c0z8l.getLastMsg();
            if (lastMsg != null && (uuid = lastMsg.getUuid()) != null) {
                str2 = uuid;
            }
            enterChatParams.setLastMsgUUId(str2);
            if (c0z8l.getReadStatus() == EnumC881770YiV.ALL_SEEN) {
                z3 = true;
            } else {
                z3 = false;
            }
            enterChatParams.setLastMsgAllRead(z3);
            if (c0y8tLIZ != null && C0Z5J.LIZIZ(c0y8tLIZ)) {
                z4 = true;
            } else {
                z4 = false;
            }
            enterChatParams.setMediaMsgMasking(z4);
            if (c0y8tLIZ != null && C879390Yef.LIZLLL(c0y8tLIZ)) {
                z5 = true;
            } else {
                z5 = false;
            }
            enterChatParams.setHighRiskConversation(z5);
            if (thoughtBubble == null || !C054H.LIZ.LIZIZ(sessionId, thoughtBubble.thoughtId)) {
                z6 = false;
            }
            enterChatParams.setHasThoughtAndWillShowAsExpanded(z6);
            if (map != null) {
                String str3 = map.get("tab_name");
                if (str3 != null) {
                    enterChatParams.getExtraMobParams().put("tab_name", str3);
                }
                String str4 = map.get("chat_label");
                if (str4 != null) {
                    enterChatParams.getExtraMobParams().put("chat_label", str4);
                }
            }
            C892210YzL.LIZ(enterChatParams.getExtraMobParams(), c0z8l.getMiddleViewVO(), c0z8l.getLastMsg());
            boolean zLJIILLIIL = C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onClick, startChat, result=");
            sbLIZ.append(zLJIILLIIL);
            sbLIZ.append(", enterChatParams=");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("EnterChatParams(sessionId=");
            sbLIZ2.append(enterChatParams.getSessionId());
            sbLIZ2.append(", chatType=");
            sbLIZ2.append(enterChatParams.getChatType());
            sbLIZ2.append(", enterFrom=");
            sbLIZ2.append(enterChatParams.getEnterFrom());
            sbLIZ2.append(", enterFromForMob=");
            sbLIZ2.append(enterChatParams.getEnterFromForMob());
            sbLIZ2.append(", enterMethodForMob=");
            sbLIZ2.append(enterChatParams.getEnterMethodForMob());
            sbLIZ2.append(", uid=");
            IMUser imUser2 = enterChatParams.getImUser();
            if (imUser2 != null) {
                uid = imUser2.getUid();
            } else {
                uid = null;
            }
            sbLIZ2.append(uid);
            sbLIZ2.append(", isQuickChat=");
            sbLIZ2.append(enterChatParams.isQuickChat());
            sbLIZ2.append(", unreadCount=");
            sbLIZ2.append(enterChatParams.getUnreadCount());
            sbLIZ2.append(", uuid=");
            sbLIZ2.append(enterChatParams.getUuid());
            sbLIZ2.append(')');
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            C2188811AlT.LIZIZ(sbLIZ);
            if (zLJIILLIIL && C289910BXx.LIZ()) {
                view.setLongClickable(false);
                Object context = view.getContext();
                if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2191208iE(view, null), 2);
                }
            }
            C1440005kM.LIZ(new C883690Ylb());
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZIZ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view, Map<String, String> map) {
        LIZ(interfaceC888500YtM, c19eg, view, map);
    }
}
