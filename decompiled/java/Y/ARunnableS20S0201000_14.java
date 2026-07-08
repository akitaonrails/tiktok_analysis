package Y;

import X.AbstractC874240YRi;
import X.AbstractRunnableC874200YRe;
import X.C098200Yq;
import X.C0NBD;
import X.C0PEM;
import X.C0Y8T;
import X.C0YNP;
import X.C0YRZ;
import X.C0YSQ;
import X.C0Z72;
import X.C0Z86;
import X.C0Z8L;
import X.C0Z8M;
import X.C0ZDX;
import X.C0ZI0;
import X.C0ZLB;
import X.C0ZLO;
import X.C1225604qs;
import X.C189200o6;
import X.C19212010Ec;
import X.C1A1M;
import X.C1C7U;
import X.C1ES0;
import X.C2296808zG;
import X.C23250099c;
import X.C538540LAe;
import X.C867400Y1a;
import X.C867430Y1d;
import X.C867450Y1f;
import X.C869590Y9l;
import X.C878950Ydx;
import X.C882340YjQ;
import X.C882350YjR;
import X.C884110YmH;
import X.C885310YoD;
import X.C885850Yp5;
import X.C888470YtJ;
import X.C888490YtL;
import X.C888510YtN;
import X.C892450Yzj;
import X.C894700Z8a;
import X.EnumC894710Z8b;
import X.InterfaceC1493105sv;
import X.InterfaceC876950Yaj;
import X.InterfaceC888500YtM;
import android.text.Editable;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS20S0201000_14 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((InterfaceC888500YtM) this.l0).getSessionType() == 0) {
            linkedHashMap.put("to_user_id", String.valueOf(C0YNP.LJII(((InterfaceC888500YtM) this.l0).getSessionId())));
        }
        linkedHashMap.put("conversation_id", ((InterfaceC888500YtM) this.l0).getSessionId());
        C888490YtL c888490YtL = C888490YtL.LIZ;
        InterfaceC888500YtM interfaceC888500YtM = (InterfaceC888500YtM) this.l0;
        c888490YtL.getClass();
        linkedHashMap.put("chat_type", C888490YtL.LIZLLL(interfaceC888500YtM));
        linkedHashMap.put("enter_from", C888510YtN.LIZ((InterfaceC888500YtM) this.l0));
        linkedHashMap.put("enter_method", "inbox_camera_icon");
        linkedHashMap.put("rank", String.valueOf(this.i2));
        ((InterfaceC1493105sv) this.l1).sendEvent("show_camera_entrance", linkedHashMap);
    }

    public final void LIZ$1() {
        EnumC894710Z8b enumC894710Z8b;
        String eventValue;
        String strLIZ;
        C878950Ydx pageKey;
        FilterTabType filterTabType;
        String mobValue;
        C0Z86 c0z86;
        C884110YmH.LJ++;
        C885850Yp5.LIZ.getClass();
        C885850Yp5.LIZJ++;
        C888490YtL c888490YtL = C888490YtL.LIZ;
        InterfaceC888500YtM interfaceC888500YtM = (InterfaceC888500YtM) this.l0;
        int i = this.i2;
        InterfaceC1493105sv interfaceC1493105sv = (InterfaceC1493105sv) this.l1;
        c888490YtL.getClass();
        if (interfaceC888500YtM instanceof C0Z8M) {
            Map<String, String> mapLJ = C888490YtL.LJ(interfaceC888500YtM);
            C0Z8M c0z8m = (C0Z8M) interfaceC888500YtM;
            mapLJ.put("is_master", c0z8m.isOwner() ? "1" : CardStruct.IStatusCode.DEFAULT);
            mapLJ.put("chat_type", "group");
            mapLJ.put("is_recommended_chat", CardStruct.IStatusCode.DEFAULT);
            mapLJ.put("is_snapshot", c0z8m.isSnapshot() ? "1" : CardStruct.IStatusCode.DEFAULT);
            C885310YoD c885310YoD = C885310YoD.LIZ;
            Boolean boolValueOf = (!(interfaceC888500YtM instanceof C0Z86) || (c0z86 = (C0Z86) interfaceC888500YtM) == null) ? null : Boolean.valueOf(c0z86.getShowStarIcon());
            c885310YoD.getClass();
            String strLJIILLIIL = C885310YoD.LJIILLIIL(boolValueOf, null, null);
            if (strLJIILLIIL.length() > 0) {
                mapLJ.put("chat_label", strLJIILLIIL);
            }
            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
            if (c19212010Ec.LJJ() && (pageKey = c0z8m.getPageKey()) != null && (filterTabType = pageKey.LLILLL) != null && (mobValue = filterTabType.getMobValue()) != null) {
                mapLJ.put("tab_name", mobValue);
            }
            mapLJ.put("inbox_mode", c19212010Ec.LIZJ().getMobValue());
            C1225604qs.LIZ.getClass();
            if (C1225604qs.LIZ()) {
                mapLJ.put("cell_order", String.valueOf(i));
                C0Z72 middleViewVO = c0z8m.getMiddleViewVO();
                if (middleViewVO != null && (strLIZ = C892450Yzj.LIZ(middleViewVO)) != null) {
                    mapLJ.put("hint_type", strLIZ);
                }
                if (c0z8m.getHasUnreadMention()) {
                    mapLJ.put("mention_status", "mention");
                } else {
                    mapLJ.put("mention_status", "no_mention");
                }
                C894700Z8a activityStatusTextWithType = c0z8m.getActivityStatusTextWithType();
                if (activityStatusTextWithType != null && (enumC894710Z8b = activityStatusTextWithType.LIZJ) != null && (eventValue = enumC894710Z8b.getEventValue()) != null) {
                    mapLJ.put("online_status", eventValue);
                }
                C869590Y9l lastMsg = c0z8m.getLastMsg();
                if (lastMsg != null) {
                    mapLJ.put("last_show_msg_create_at_gap_min", String.valueOf((System.currentTimeMillis() - lastMsg.getCreatedAt()) / ((long) C538540LAe.LLJJJIL)));
                    mapLJ.put("last_show_msg_send_by_self", String.valueOf(C0ZDX.LJJJJIZL(lastMsg)));
                }
            }
            String str = C0NBD.LIZ;
            if (str == null) {
                str = "";
            }
            mapLJ.put("inbox_session_id", str);
            interfaceC1493105sv.sendEvent("chat_show", mapLJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$2() {
        Object c098200Yq;
        EnumC894710Z8b enumC894710Z8b;
        String eventValue;
        String strLIZ;
        C878950Ydx pageKey;
        FilterTabType filterTabType;
        String mobValue;
        C884110YmH.LIZLLL++;
        C885850Yp5.LIZ.getClass();
        C885850Yp5.LIZIZ++;
        C888490YtL c888490YtL = C888490YtL.LIZ;
        InterfaceC888500YtM interfaceC888500YtM = (InterfaceC888500YtM) this.l0;
        int i = this.i2;
        InterfaceC1493105sv interfaceC1493105sv = (InterfaceC1493105sv) this.l1;
        c888490YtL.getClass();
        if (interfaceC888500YtM instanceof C0Z8L) {
            boolean z = ((C0Z8L) interfaceC888500YtM).getLastMessageMsgType() == 15;
            String strLIZLLL = C888490YtL.LIZLLL(interfaceC888500YtM);
            Map mapLJ = C888490YtL.LJ(interfaceC888500YtM);
            C0Z8L c0z8l = (C0Z8L) interfaceC888500YtM;
            mapLJ.put("to_user_id", String.valueOf(C0YNP.LJII(c0z8l.getSessionId())));
            String str = CardStruct.IStatusCode.DEFAULT;
            mapLJ.put("is_new_chat", z ? "1" : CardStruct.IStatusCode.DEFAULT);
            C885310YoD c885310YoD = C885310YoD.LIZ;
            IMUser imUser = c0z8l.getImUser();
            c885310YoD.getClass();
            C885310YoD.LJIIJJI(imUser, mapLJ);
            mapLJ.put("chat_type", strLIZLLL);
            mapLJ.put("is_recommended_chat", CardStruct.IStatusCode.DEFAULT);
            mapLJ.put("is_snapshot", c0z8l.isSnapshot() ? "1" : CardStruct.IStatusCode.DEFAULT);
            C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(c0ysq).LIZ(c0z8l.getSessionId());
            if (c0y8tLIZ != null && C882340YjQ.LJFF(c0y8tLIZ)) {
                str = "1";
            }
            mapLJ.put("help_requested", str);
            C0Y8T c0y8tLIZ2 = C0YSQ.LIZIZ(c0ysq).LIZ(c0z8l.getSessionId());
            if (c0y8tLIZ2 != null) {
                C882350YjR c882350YjRLIZIZ = C882340YjQ.LIZIZ(c0y8tLIZ2);
                if (c882350YjRLIZIZ.LIZ) {
                    mapLJ.put("chatbot_state", c882350YjRLIZIZ.LIZIZ);
                    mapLJ.put("chatbot_exist", "1");
                }
            }
            String strLJIILLIIL = C885310YoD.LJIILLIIL(Boolean.valueOf(c0z8l.getShowStarIcon()), c0z8l.getChatLabels(), null);
            if (strLJIILLIIL.length() > 0) {
                mapLJ.put("chat_label", strLJIILLIIL);
            }
            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
            if (c19212010Ec.LJJ() && (pageKey = c0z8l.getPageKey()) != null && (filterTabType = pageKey.LLILLL) != null && (mobValue = filterTabType.getMobValue()) != null) {
                mapLJ.put("tab_name", mobValue);
            }
            mapLJ.put("inbox_mode", c19212010Ec.LIZJ().getMobValue());
            C1225604qs.LIZ.getClass();
            if (C1225604qs.LIZ()) {
                mapLJ.put("cell_order", String.valueOf(i));
                try {
                    c098200Yq = String.valueOf(C1A1M.LIZIZ.LJII(((C0Z8L) interfaceC888500YtM).getUid()));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                    mapLJ.put("topk_friend_index", c098200Yq);
                }
                C0Z72 middleViewVO = c0z8l.getMiddleViewVO();
                if (middleViewVO != null && (strLIZ = C892450Yzj.LIZ(middleViewVO)) != null) {
                    mapLJ.put("hint_type", strLIZ);
                }
                C894700Z8a activityStatusTextWithType = c0z8l.getActivityStatusTextWithType();
                if (activityStatusTextWithType != null && (enumC894710Z8b = activityStatusTextWithType.LIZJ) != null && (eventValue = enumC894710Z8b.getEventValue()) != null) {
                    mapLJ.put("online_status", eventValue);
                }
                C869590Y9l lastMsg = c0z8l.getLastMsg();
                if (lastMsg != null) {
                    mapLJ.put("last_show_msg_create_at_gap_min", String.valueOf((System.currentTimeMillis() - lastMsg.getCreatedAt()) / ((long) C538540LAe.LLJJJIL)));
                    mapLJ.put("last_show_msg_send_by_self", String.valueOf(C0ZDX.LJJJJIZL(lastMsg)));
                }
            }
            String str2 = C0NBD.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            mapLJ.put("inbox_session_id", str2);
            interfaceC1493105sv.sendEvent("chat_show", mapLJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            r5 = this;
            X.0YtL r0 = X.C888490YtL.LIZ
            java.lang.Object r4 = r5.l0
            X.0YtM r4 = (X.InterfaceC888500YtM) r4
            int r1 = r5.i2
            java.lang.Object r3 = r5.l1
            X.05sv r3 = (X.InterfaceC1493105sv) r3
            r0.getClass()
            boolean r0 = r4 instanceof X.C0Z8L
            if (r0 == 0) goto L5e
            java.util.Map r2 = X.C888490YtL.LIZIZ(r4, r1)
            X.0Z8L r4 = (X.C0Z8L) r4
            java.lang.String r0 = r4.getSessionId()
            long r0 = X.C0YNP.LJII(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "to_user_id"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = r4.getImUser()
            if (r1 == 0) goto L47
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            if (r0 == 0) goto L47
            X.06pF r0 = r0.LIZ()
            if (r0 == 0) goto L47
            java.lang.String r1 = r0.LJIL(r1)
            if (r1 != 0) goto L49
        L47:
            java.lang.String r1 = ""
        L49:
            java.lang.String r0 = "relation_tag"
            r2.put(r0, r1)
            X.0Z72 r1 = r4.getMiddleViewVO()
            X.0Y9l r0 = r4.getLastMsg()
            X.C892210YzL.LIZ(r2, r1, r0)
            java.lang.String r0 = "ttsocial_chat_cell_show"
            r3.sendEvent(r0, r2)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS20S0201000_14.LIZ$3():void");
    }

    public final void LIZ$4() {
        ((C867400Y1a) this.l1).LJI = new ArrayList();
        Iterator it2 = ((Map) this.l0).values().iterator();
        while (it2.hasNext()) {
            C0Y8T c0y8tLJIJJLI = C867450Y1f.LJIJJLI(((C867400Y1a) this.l1).LIZJ, this.i2, (MessageBody) it2.next());
            if (c0y8tLJIJJLI != null) {
                ((C867400Y1a) this.l1).LJI.add(c0y8tLJIJJLI);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (MessageBody messageBody : ((Map) this.l0).values()) {
            C867430Y1d c867430Y1d = new C867430Y1d();
            c867430Y1d.LIZLLL = messageBody.conversation_id;
            c867430Y1d.LJ = messageBody.conversation_short_id;
            c867430Y1d.LJFF = messageBody.conversation_type;
            arrayList.add(c867430Y1d.build());
        }
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJ = new GetConversationInfoListV2RequestBody(arrayList);
        ((C867400Y1a) this.l1).LJIIIZ(this.i2, c1es0.build(), null, (Map) this.l0);
    }

    public static final void run$0(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BaseUploadTask@e3e1.onTaskFailed$1");
        try {
            C0YRZ c0yrz = ((AbstractRunnableC874200YRe) aRunnableS20S0201000_14.l0).LLILLJJLI;
            if (c0yrz != null) {
                c0yrz.LIZIZ(aRunnableS20S0201000_14.i2, (Exception) aRunnableS20S0201000_14.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseUploadTask@e3e1.onTaskFailed$1");
    }

    public static final void run$1(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.tryCameraIconShowTrackRunnable$1");
        try {
            aRunnableS20S0201000_14.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.tryCameraIconShowTrackRunnable$1");
    }

    public static final void run$2(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.tryGetGroupChatShowTrackRunnable$1");
        try {
            aRunnableS20S0201000_14.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.tryGetGroupChatShowTrackRunnable$1");
    }

    public static final void run$3(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.tryGetPrivateChatShowTrackRunnable$1");
        try {
            aRunnableS20S0201000_14.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.tryGetPrivateChatShowTrackRunnable$1");
    }

    public static final void run$4(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.tryGetSocialGroupChatShowTrackRunnable$1");
        try {
            C888490YtL c888490YtL = C888490YtL.LIZ;
            InterfaceC888500YtM interfaceC888500YtM = (InterfaceC888500YtM) aRunnableS20S0201000_14.l0;
            int i = aRunnableS20S0201000_14.i2;
            InterfaceC1493105sv interfaceC1493105sv = (InterfaceC1493105sv) aRunnableS20S0201000_14.l1;
            c888490YtL.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C888470YtJ(interfaceC888500YtM, i, interfaceC1493105sv, null), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.tryGetSocialGroupChatShowTrackRunnable$1");
    }

    public static final void run$5(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.tryGetSocialPrivateChatShowTrackRunnable$1");
        try {
            aRunnableS20S0201000_14.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.tryGetSocialPrivateChatShowTrackRunnable$1");
    }

    public static final void run$6(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        boolean zLIZ;
        C1C7U.LIZ("GetConversationInfoListHandler@1df6.getInner$1");
        try {
            aRunnableS20S0201000_14.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GetConversationInfoListHandler@1df6.getInner$1");
    }

    public static final void run$7(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMBaseLongPressPopupHelper@9681.show$runnable$1");
        try {
            ((C0ZLB) aRunnableS20S0201000_14.l0).LIZLLL((LongPressConfig) aRunnableS20S0201000_14.l1, aRunnableS20S0201000_14.i2 + 1);
            C0ZLO c0zlo = ((LongPressConfig) aRunnableS20S0201000_14.l1).onLongPressPopupProvider;
            if (c0zlo != null) {
                c0zlo.LIZ(C0ZLB.LIZ((C0ZLB) aRunnableS20S0201000_14.l0));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMBaseLongPressPopupHelper@9681.show$runnable$1");
    }

    public static final void run$8(ARunnableS20S0201000_14 aRunnableS20S0201000_14) {
        C0ZI0 c0zi0 = (C0ZI0) aRunnableS20S0201000_14.l0;
        int i = aRunnableS20S0201000_14.i2;
        Editable editable = (Editable) aRunnableS20S0201000_14.l1;
        c0zi0.getClass();
        C1C7U.LIZ("HashTagMentionEditText@a45d.addHashtagEmoji$3L");
        c0zi0.setSelection(Math.min(i, editable.length()));
        C1C7U.LIZIZ("HashTagMentionEditText@a45d.addHashtagEmoji$3L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS20S0201000_14(Object obj, AbstractRunnableC874200YRe<AbstractRunnableC874200YRe<Object, Object, Object>, AbstractC874240YRi<Object>, Object> abstractRunnableC874200YRe, int i, Exception exc) {
        this.$t = exc;
        this.l0 = obj;
        this.i2 = abstractRunnableC874200YRe;
        this.l1 = i;
    }
}
