package X;

import Y.AAListenerS265S0200000_13;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yR7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857470yR7 {
    public static long LIZIZ;
    public static final C1857470yR7 LIZ = new C1857470yR7();
    public static volatile boolean LIZJ = true;

    public static List LIZ(Message message, InterfaceC665370Q7z interfaceC665370Q7z, boolean z) {
        List<Message> listPH2;
        ArrayList arrayList = null;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        if (iMessageAbility != null && (listPH2 = iMessageAbility.PH2(message.replyUuid)) != null) {
            arrayList = new ArrayList();
            for (Message message2 : listPH2) {
                Message message3 = message2;
                if (!C1858670yT3.LJIIL(message3) && (!z || !message3.isRegenDeprecated)) {
                    arrayList.add(message2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility] */
    public static void LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z, Message message, int i) {
        Message messageDL1;
        TakoSug takoSugOv2;
        boolean z;
        ?? arrayList;
        List<C326880Cre> listSL;
        Integer numValueOf;
        String str;
        Message messagePrevious;
        ViewGroup viewGroupY4 = null;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        if (iMessageAbility2 != null) {
            messageDL1 = iMessageAbility2.DL1(message.replyMsgId);
        } else {
            messageDL1 = null;
        }
        if (iMessageAbility != null) {
            takoSugOv2 = iMessageAbility.ov2();
        } else {
            takoSugOv2 = null;
        }
        if (takoSugOv2 != null) {
            z = true;
        } else {
            z = false;
        }
        LIZJ = z;
        if (iMessageAbility != null) {
            iMessageAbility.c50();
            List<Message> listPH2 = iMessageAbility.PH2(message.replyUuid);
            if (listPH2 != null) {
                ListIterator<Message> listIterator = listPH2.listIterator(listPH2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        messagePrevious = listIterator.previous();
                        Message message2 = messagePrevious;
                        if (C1858670yT3.LJIIL(message2) && !message2.isHidden) {
                            break;
                        }
                    } else {
                        messagePrevious = null;
                        break;
                    }
                }
                Message message3 = messagePrevious;
                if (message3 != null) {
                    iMessageAbility.ua2(Message.LIZLLL(message3, null, 0, true, 0, false, null, false, -536870913, 2097151), false, false);
                }
            }
        }
        String str2 = message.replyUuid;
        ?? r8 = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        if (r8 != 0 && (listSL = r8.sL()) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listSL, 10));
            Iterator<C326880Cre> it2 = listSL.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().LLILLL);
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                Message message4 = (Message) obj;
                List listLJIIJJI = C1697810uHb.LJIIJJI(10001, -8002);
                TakoMixFeed takoMixFeedLJIIIZ = message4.LJIIIZ();
                if (takoMixFeedLJIIIZ != null) {
                    numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
                } else {
                    numValueOf = null;
                }
                if (C13LP.LJJJJ(numValueOf, listLJIIJJI)) {
                    TakoQuestionnaire takoQuestionnaire = message4.LJIILL;
                    if (takoQuestionnaire != null) {
                        str = takoQuestionnaire.followReplyMessageId;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, str2)) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if ((!arrayList.isEmpty()) && r8 != 0) {
            r8.cN0(null, messageDL1, arrayList, false);
        }
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
        if (takoCardAbility != null) {
            viewGroupY4 = takoCardAbility.Y4();
        }
        List listLIZ = LIZ(message, interfaceC665370Q7z, false);
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        if (messageDL1 != null) {
            C1857480yR8 c1857480yR8 = new C1857480yR8(iMessageAbility, message, interfaceC665370Q7z, messageDL1, i, listLIZ);
            AFwS216S0000000_27.get$arr$(332).getClass();
            if (viewGroupY4 != null) {
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                duration.addListener(new AAListenerS265S0200000_13(c1857480yR8, viewGroupY4, 4));
                duration.addUpdateListener(new AUListenerS256S0100000_6(viewGroupY4, 160));
                duration.setInterpolator(new LinearInterpolator());
                duration.setStartDelay(100L);
                duration.start();
            }
        }
    }

    public static void LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, Message message, int i) {
        Map<String, String> commonParams;
        String str;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (commonParams = iTakoContextAbility.getCommonParams()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = message.uuid;
            if (i != 1) {
                if (i != 2) {
                    str = "default";
                } else {
                    str = "detailed";
                }
            } else {
                str = "concise";
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            c20235014FoLIZ.LIZ("tikbot_regenerate_option_click", C2097608Jq.LJIIJ(new Pair("enter_from", commonParams.get("enter_from")), new Pair("enter_method", commonParams.get("enter_method")), new Pair("process_id", commonParams.get("process_id")), new Pair("tako_session_id", commonParams.get("tako_session_id")), new Pair("tako_chat_id", commonParams.get("tako_chat_id")), new Pair("message_id", str2), new Pair("button_type", str)));
        }
    }
}
