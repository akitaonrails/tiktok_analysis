package Y;

import X.C0QSJ;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZRA;
import X.C1336205Ku;
import X.C1558520qew;
import X.C418440Gaw;
import X.C426750GoL;
import X.C457780HxI;
import X.C458640Hyg;
import X.C687700QyG;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C898190ZLl;
import X.C898980ZOm;
import X.C910680Zo2;
import X.InterfaceC539120LCk;
import X.InterfaceC876950Yaj;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.DMVoiceMessageSideTranscriptButtonUISlot;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class ACListenerS56S1200000_14 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS56S1200000_14 aCListenerS56S1200000_14, View view) {
        ((InterfaceC539120LCk) aCListenerS56S1200000_14.l1).LIZ(3, (InnerPushMessage) aCListenerS56S1200000_14.l2, aCListenerS56S1200000_14.s0);
    }

    public static final void onClick$1(ACListenerS56S1200000_14 aCListenerS56S1200000_14, View view) {
        Object ability;
        C0Y8T c0y8tLIZ;
        C458640Hyg.LIZJ(((C869590Y9l) aCListenerS56S1200000_14.l2).getMsgId(), "continuous_voice_icon", ((C457780HxI) ((DMVoiceMessageSideTranscriptButtonUISlot) aCListenerS56S1200000_14.l1).LLJLLIL.getValue()).LL.getConversationId(), aCListenerS56S1200000_14.s0);
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL((DMVoiceMessageSideTranscriptButtonUISlot) aCListenerS56S1200000_14.l1), ChatRoomScope.class);
        C869590Y9l c869590Y9l = null;
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(MessagePowerListAbility.class);
        } else {
            ability = null;
        }
        if (!(ability instanceof MessagePowerListAbility)) {
            ability = null;
        }
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
        if (messagePowerListAbility == null) {
            return;
        }
        List<C869590Y9l> listVi2 = messagePowerListAbility.vi2();
        C869590Y9l c869590Y9l2 = (C869590Y9l) aCListenerS56S1200000_14.l2;
        Iterator<C869590Y9l> it2 = listVi2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C869590Y9l next = it2.next();
            if (Intrinsics.LJFF(next.getUuid(), c869590Y9l2.getUuid())) {
                c869590Y9l = next;
                break;
            }
        }
        C869590Y9l c869590Y9l3 = c869590Y9l;
        if (c869590Y9l3 == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((C457780HxI) ((DMVoiceMessageSideTranscriptButtonUISlot) aCListenerS56S1200000_14.l1).LLJLLIL.getValue()).LL.getConversationId())) == null) {
            return;
        }
        boolean z = C0ZRA.LIZ;
        C0ZRA.LIZLLL(aCListenerS56S1200000_14.s0, c0y8tLIZ.getConversationShortId(), c869590Y9l3, new C898980ZOm(messagePowerListAbility));
    }

    public static final void onClick$2(ACListenerS56S1200000_14 aCListenerS56S1200000_14, View view) {
        MessageListScrollAbility messageListScrollAbility = (MessageListScrollAbility) ((UnreadIndicatorAssemV2) aCListenerS56S1200000_14.l1).LLJJIJIIJIL.getValue();
        if (messageListScrollAbility != null) {
            messageListScrollAbility.C31(((C910680Zo2) aCListenerS56S1200000_14.l2).LJ - 1, new AwS628S0100000_14((UnreadIndicatorAssemV2) aCListenerS56S1200000_14.l1, 27));
        }
        ((UnreadIndicatorAssemV2) aCListenerS56S1200000_14.l1).Oo();
        ((UnreadIndicatorAssemV2) aCListenerS56S1200000_14.l1).So(((C910680Zo2) aCListenerS56S1200000_14.l2).LIZIZ, aCListenerS56S1200000_14.s0, true);
    }

    public static final void onClick$3(ACListenerS56S1200000_14 aCListenerS56S1200000_14, View view) {
        int i;
        ((C910680Zo2) aCListenerS56S1200000_14.l1).LIZLLL.invoke();
        UnreadIndicatorAssemV2 unreadIndicatorAssemV2 = (UnreadIndicatorAssemV2) aCListenerS56S1200000_14.l2;
        if (unreadIndicatorAssemV2.LLJILJILJ == null) {
            Context context = unreadIndicatorAssemV2.getContext();
            if (context != null && C426750GoL.LIZLLL(context)) {
                i = -120;
            } else {
                i = 120;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, C418440Gaw.LIZIZ(Integer.valueOf(i)));
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setDuration(240L);
                objectAnimatorOfFloat.addListener(new ALAdapterS10S0100000_14(view, 2));
                C786410Ut5.Pd(objectAnimatorOfFloat);
            } else {
                objectAnimatorOfFloat = null;
            }
            unreadIndicatorAssemV2.LLJILJILJ = objectAnimatorOfFloat;
        }
        ((UnreadIndicatorAssemV2) aCListenerS56S1200000_14.l2).So(((C910680Zo2) aCListenerS56S1200000_14.l1).LIZIZ, aCListenerS56S1200000_14.s0, true);
    }

    public static final void onClick$4(ACListenerS56S1200000_14 aCListenerS56S1200000_14, View view) {
        ((InterfaceC539120LCk) aCListenerS56S1200000_14.l1).LIZ(3, (InnerPushMessage) aCListenerS56S1200000_14.l2, aCListenerS56S1200000_14.s0);
    }

    public static final void onClick$5(ACListenerS56S1200000_14 aCListenerS56S1200000_14, View view) {
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        C898190ZLl c898190ZLl = C898190ZLl.LL;
        Context context = (Context) aCListenerS56S1200000_14.l1;
        String strLIZLLL = C1336205Ku.LIZ(false).getImUserService().LIZLLL(aCListenerS56S1200000_14.s0);
        Map map = (Map) aCListenerS56S1200000_14.l2;
        c898190ZLl.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(context, 0, strLIZLLL);
        enterChatParams.setEnterFromForMob((String) map.get("enter_from"));
        enterChatParams.setEnterMethodForMob((String) map.get("enter_method"));
        enterChatParams.setQuickChat(true);
        imChatService.LJIILLIIL(enterChatParams, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS56S1200000_14(com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2 r2, X.C910680Zo2 r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.s0 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l1 = r2
            r0.l2 = r3
            r0.s0 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS56S1200000_14.<init>(com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2, X.0Zo2, java.lang.String, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS56S1200000_14(Object obj, Context context, String str, Map<String, String> map) {
        this.$t = map;
        this.l1 = obj;
        this.s0 = context;
        this.l2 = str;
    }
}
