package X;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Yt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888340Yt6 extends C883710Yld {
    public static final C01GW<C888340Yt6> LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(372));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZJ(InterfaceC888500YtM interfaceC888500YtM, final C19EG c19eg, View view) {
        C0Z8M c0z8m;
        final C879540Yeu c879540YeuLJIJI;
        C0Y8T c0y8t;
        FilterTabType filterTabType = null;
        if ((interfaceC888500YtM instanceof C0Z8M) && (c0z8m = (C0Z8M) interfaceC888500YtM) != null) {
            final C878950Ydx pageKey = c0z8m.getPageKey();
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            if (C881500Yi4.LJ() != null && (c879540YeuLJIJI = AbstractC883730Ylf.LJIJI(pageKey, c0z8m.getSessionId())) != null) {
                T t = c879540YeuLJIJI.LIZJ;
                if (t instanceof C0Y8T) {
                    c0y8t = (C0Y8T) t;
                } else {
                    c0y8t = null;
                }
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                if (C289900BXw.LIZ()) {
                    c13dvLIZIZ.add(new C877470YbZ(c19eg, c879540YeuLJIJI, pageKey));
                }
                if (Intrinsics.LJFF(c879540YeuLJIJI.LIZ, C1606306Qr.INSTANCE) && c0y8t != null && c0y8t.isTemp()) {
                    c13dvLIZIZ.add(new C879020Ye4(c19eg, c879540YeuLJIJI, pageKey));
                } else {
                    C05RV c05rvLIZJ = C19212010Ec.LIZJ.LIZJ();
                    int i = C877870YcD.LIZ[c05rvLIZJ.ordinal()];
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
                            c13dvLIZIZ.add(new AbstractC880120Yfq(c19eg, c879540YeuLJIJI, pageKey) { // from class: X.0Yo2
                                public final int LLJ = 2131831557;
                                public final int LLJI = R.raw.icon_bell;

                                @Override // X.AbstractC880120Yfq
                                public final void LIZ() {
                                    String conversationId;
                                    IMGroupChatApi.LIZIZ.getClass();
                                    C1618306Vh value = C1618506Vj.LIZLLL.getValue();
                                    Activity activity = this.LL;
                                    C0Y8T c0y8t2 = this.LLILZ;
                                    if (c0y8t2 == null || (conversationId = c0y8t2.getConversationId()) == null) {
                                        conversationId = "";
                                    }
                                    value.LIZ(activity, conversationId, "notification_page");
                                    AbstractC880120Yfq.LJFF(this, "notify", null, null, 6);
                                }

                                @Override // X.AbstractC880120Yfq
                                public final boolean LJI() {
                                    C878950Ydx c878950Ydx;
                                    C0Y8T c0y8t2 = this.LLILZ;
                                    if (c0y8t2 == null) {
                                        return true;
                                    }
                                    if (c0y8t2.getConversationType() != AbstractC1711506n3.LIZIZ || (!C880000Yfe.LIZ && C0ZFW.LIZ.LJIIIZ(c0y8t2))) {
                                        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
                                        FilterTabType filterTabType2 = null;
                                        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
                                            filterTabType2 = c878950Ydx.LLILLL;
                                        }
                                        if (filterTabType2 != FilterTabType.SPAM && !AbstractC880120Yfq.LJII(this.LLILZ)) {
                                            return false;
                                        }
                                    }
                                    return true;
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
                            c13dvLIZIZ.add(new AbstractC880120Yfq(c19eg, c879540YeuLJIJI, pageKey) { // from class: X.0Yo2
                                public final int LLJ = 2131831557;
                                public final int LLJI = R.raw.icon_bell;

                                @Override // X.AbstractC880120Yfq
                                public final void LIZ() {
                                    String conversationId;
                                    IMGroupChatApi.LIZIZ.getClass();
                                    C1618306Vh value = C1618506Vj.LIZLLL.getValue();
                                    Activity activity = this.LL;
                                    C0Y8T c0y8t2 = this.LLILZ;
                                    if (c0y8t2 == null || (conversationId = c0y8t2.getConversationId()) == null) {
                                        conversationId = "";
                                    }
                                    value.LIZ(activity, conversationId, "notification_page");
                                    AbstractC880120Yfq.LJFF(this, "notify", null, null, 6);
                                }

                                @Override // X.AbstractC880120Yfq
                                public final boolean LJI() {
                                    C878950Ydx c878950Ydx;
                                    C0Y8T c0y8t2 = this.LLILZ;
                                    if (c0y8t2 == null) {
                                        return true;
                                    }
                                    if (c0y8t2.getConversationType() != AbstractC1711506n3.LIZIZ || (!C880000Yfe.LIZ && C0ZFW.LIZ.LJIIIZ(c0y8t2))) {
                                        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
                                        FilterTabType filterTabType2 = null;
                                        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
                                            filterTabType2 = c878950Ydx.LLILLL;
                                        }
                                        if (filterTabType2 != FilterTabType.SPAM && !AbstractC880120Yfq.LJII(this.LLILZ)) {
                                            return false;
                                        }
                                    }
                                    return true;
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
                        c13dvLIZIZ.add(new C882850YkF(c19eg, c879540YeuLJIJI, pageKey));
                        c13dvLIZIZ.add(new C879020Ye4(c19eg, c879540YeuLJIJI, pageKey));
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
                        c13dvLIZIZ.add(new AbstractC880120Yfq(c19eg, c879540YeuLJIJI, pageKey) { // from class: X.0Yo2
                            public final int LLJ = 2131831557;
                            public final int LLJI = R.raw.icon_bell;

                            @Override // X.AbstractC880120Yfq
                            public final void LIZ() {
                                String conversationId;
                                IMGroupChatApi.LIZIZ.getClass();
                                C1618306Vh value = C1618506Vj.LIZLLL.getValue();
                                Activity activity = this.LL;
                                C0Y8T c0y8t2 = this.LLILZ;
                                if (c0y8t2 == null || (conversationId = c0y8t2.getConversationId()) == null) {
                                    conversationId = "";
                                }
                                value.LIZ(activity, conversationId, "notification_page");
                                AbstractC880120Yfq.LJFF(this, "notify", null, null, 6);
                            }

                            @Override // X.AbstractC880120Yfq
                            public final boolean LJI() {
                                C878950Ydx c878950Ydx;
                                C0Y8T c0y8t2 = this.LLILZ;
                                if (c0y8t2 == null) {
                                    return true;
                                }
                                if (c0y8t2.getConversationType() != AbstractC1711506n3.LIZIZ || (!C880000Yfe.LIZ && C0ZFW.LIZ.LJIIIZ(c0y8t2))) {
                                    InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
                                    FilterTabType filterTabType2 = null;
                                    if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
                                        filterTabType2 = c878950Ydx.LLILLL;
                                    }
                                    if (filterTabType2 != FilterTabType.SPAM && !AbstractC880120Yfq.LJII(this.LLILZ)) {
                                        return false;
                                    }
                                }
                                return true;
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
                        c13dvLIZIZ.add(new C887770YsB(c19eg, c879540YeuLJIJI, pageKey));
                        c13dvLIZIZ.add(new C879020Ye4(c19eg, c879540YeuLJIJI, pageKey));
                    }
                }
                c13dvLIZIZ.add(new C888400YtC(c19eg, c879540YeuLJIJI));
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
        C0Z8M c0z8m;
        int unreadCount;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int iLIZ;
        boolean z5;
        String uuid;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if ((interfaceC888500YtM instanceof C0Z8M) && (c0z8m = (C0Z8M) interfaceC888500YtM) != null) {
            String sessionId = c0z8m.getSessionId();
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionId);
            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
            EnterChatParams enterChatParams = new EnterChatParams(c19eg, 3, sessionId);
            enterChatParams.setEnterFrom(3);
            enterChatParams.setEnterFromForMob(C888510YtN.LIZ(c0z8m));
            C20619615mM.LIZ.getClass();
            enterChatParams.setMobEnterMethodForEditShare(C20619615mM.LIZ());
            enterChatParams.setEnterMethodForMob("cell");
            if (c0y8tLIZ != null) {
                unreadCount = (int) c0y8tLIZ.getUnreadCount();
            } else {
                unreadCount = 0;
            }
            enterChatParams.setUnreadCount(unreadCount);
            enterChatParams.setUnreadViewState(c0z8m.getSessionUnreadViewState());
            if (c0y8tLIZ != null && c0y8tLIZ.isStickTop()) {
                z = true;
            } else {
                z = false;
            }
            enterChatParams.setStickyTop(z);
            if (c0y8tLIZ != null && C879390Yef.LIZLLL(c0y8tLIZ)) {
                z2 = true;
            } else {
                z2 = false;
            }
            enterChatParams.setHighRiskConversation(z2);
            if (c0y8tLIZ != null && C0Z5J.LIZIZ(c0y8tLIZ)) {
                z3 = true;
            } else {
                z3 = false;
            }
            enterChatParams.setMediaMsgMasking(z3);
            if (c0y8tLIZ != null && c0y8tLIZ.isDissolved()) {
                z4 = true;
            } else {
                z4 = false;
            }
            enterChatParams.setDissolvedGroup(z4);
            C894700Z8a activityStatusTextWithType = c0z8m.getActivityStatusTextWithType();
            if (activityStatusTextWithType != null) {
                iLIZ = C888950Yu5.LIZ(activityStatusTextWithType);
            } else {
                iLIZ = 0;
            }
            enterChatParams.setActivityStatusLevel(iLIZ);
            if (c0z8m.getReadStatus() == EnumC881770YiV.ALL_SEEN) {
                z5 = true;
            } else {
                z5 = false;
            }
            enterChatParams.setLastMsgAllRead(z5);
            C869590Y9l lastMsg = c0z8m.getLastMsg();
            if (lastMsg == null || (uuid = lastMsg.getUuid()) == null) {
                uuid = "";
            }
            enterChatParams.setLastMsgUUId(uuid);
            if (map != null) {
                String str = map.get("readers");
                if (str != null && str.length() != 0) {
                    List listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
                    Iterator it2 = listLJJLIIIJ.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(CastLongProtector.parseLong((String) it2.next())));
                    }
                    enterChatParams.setReaders(arrayList);
                }
                if (map != null) {
                    String str2 = map.get("tab_name");
                    if (str2 != null) {
                        enterChatParams.getExtraMobParams().put("tab_name", str2);
                    }
                    String str3 = map.get("chat_label");
                    if (str3 != null) {
                        enterChatParams.getExtraMobParams().put("chat_label", str3);
                    }
                }
            }
            C892210YzL.LIZ(enterChatParams.getExtraMobParams(), c0z8m.getMiddleViewVO(), c0z8m.getLastMsg());
            if (imChatService.LJIILLIIL(enterChatParams, null) && C289910BXx.LIZ()) {
                view.setLongClickable(false);
                Object context = view.getContext();
                if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2191108iD(view, null), 2);
                }
            }
            C1440005kM.LIZ(new C883690Ylb());
        }
    }

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZIZ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view, Map<String, String> map) {
        LIZ(interfaceC888500YtM, c19eg, view, map);
    }
}
