package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.StreakWheeDriveTrafficCardDataAbility;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS403S0200000_2;

/* JADX INFO: renamed from: X.06LU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06LU extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C1598906Nv LLILZIL;
    public final Set<EnumC1596306Mv> LLILZLL;
    public final Set<C067L> LLIZ;
    public C06LV LLIZLLLIL;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    public final Map<String, String> LJIIL() {
        String uid;
        C909290Zln c909290Zln;
        IMUser fromUser;
        SessionInfo sessionInfo = this.LLILZ.LJI;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("chat_type", "private");
        pairArr[1] = new Pair("conversation_id", sessionInfo.getConversationId());
        if (!(sessionInfo instanceof C909290Zln) || (c909290Zln = (C909290Zln) sessionInfo) == null || (fromUser = c909290Zln.getFromUser()) == null || (uid = fromUser.getUid()) == null) {
            uid = "";
        }
        pairArr[2] = new Pair("to_user_id", uid);
        pairArr[3] = new Pair(Scene.SCENE_SERVICE, "whee_outfit_unlock_guide");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final C1684506ih LJIILIIL() {
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZ(this.LLILZ.LJI);
        c1684506ih.LIZJ = "streak_whee_drive_traffic_card_uuid";
        c1684506ih.LIZLLL(55);
        c1684506ih.LIZJ(this.LLILZ.LIZJ);
        return c1684506ih;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLILZLL;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLILZIL;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZ;
    }

    public C06LU(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = new C1598906Nv(new C06ME());
        this.LLILZLL = Collections.singleton(EnumC1596306Mv.STREAK_EXCLUSIVE_OUTFIT_FOR_WHEE);
        this.LLIZ = Collections.singleton(C067L.SINGLE);
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        Function0<Unit> function0;
        ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(this.LLILZ.LJFF, ChatRoomFakeMsgOperatorAbility.class, null);
        if (chatRoomFakeMsgOperatorAbility != null) {
            chatRoomFakeMsgOperatorAbility.y52(LJIILIIL(), null);
        }
        C06LV c06lv = this.LLIZLLLIL;
        if (c06lv != null && (function0 = c06lv.LJIIIIZZ) != null) {
            function0.invoke();
        }
        StreakWheeDriveTrafficCardDataAbility streakWheeDriveTrafficCardDataAbility = (StreakWheeDriveTrafficCardDataAbility) C1558520qew.LIZ(this.LLILZ.LJFF, StreakWheeDriveTrafficCardDataAbility.class, null);
        if (streakWheeDriveTrafficCardDataAbility != null) {
            streakWheeDriveTrafficCardDataAbility.Cm2(null);
        }
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        if (!(c06oo instanceof C06LV)) {
            return new C06OH("Invalid task type");
        }
        return C06OI.LIZ;
    }

    @Override // X.C06O6
    public final Object LJIIJ(C06OO c06oo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C06LV c06lv;
        Function0<Unit> function0;
        if ((c06oo instanceof C06LV) && (c06lv = (C06LV) c06oo) != null) {
            this.LLIZLLLIL = c06lv;
            StreakWheeDriveTrafficCardDataAbility streakWheeDriveTrafficCardDataAbility = (StreakWheeDriveTrafficCardDataAbility) C1558520qew.LIZ(this.LLILZ.LJFF, StreakWheeDriveTrafficCardDataAbility.class, null);
            if (streakWheeDriveTrafficCardDataAbility != null) {
                streakWheeDriveTrafficCardDataAbility.Cm2(new C06LV(c06lv.LIZJ, c06lv.LIZLLL, c06lv.LJ, c06lv.LJFF, new AwS403S0200000_2(c06lv, this, 84), c06lv.LJII, c06lv.LJIIIIZZ));
            }
            ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(this.LLILZ.LJFF, ChatRoomFakeMsgOperatorAbility.class, null);
            if (chatRoomFakeMsgOperatorAbility != null) {
                chatRoomFakeMsgOperatorAbility.yl2(LJIILIIL(), null);
            }
            C06LV c06lv2 = this.LLIZLLLIL;
            if (c06lv2 != null && (function0 = c06lv2.LJII) != null) {
                function0.invoke();
            }
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("ttsocial_chat_guide_card_show", LJIIL());
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
