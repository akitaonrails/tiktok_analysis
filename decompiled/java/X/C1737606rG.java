package X;

import Y.AComparatorS501S0100000_2;
import android.content.Context;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.fake.message.ChatRoomFakeMsgOperatorAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.fake.message.ChatRoomFakeMsgOperatorAssem$triggerFakeMessageByChatRoomEvent$1", f = "ChatRoomFakeMsgOperatorAssem.kt", l = {}, m = "invokeSuspend")
public final class C1737606rG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChatRoomFakeMsgOperatorAssem LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737606rG(ChatRoomFakeMsgOperatorAssem chatRoomFakeMsgOperatorAssem, Context context, int i, InterfaceC1364105Vn<? super C1737606rG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chatRoomFakeMsgOperatorAssem;
        this.LLILLJJLI = context;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1737606rG(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        ?? LJ;
        ?? LJ2;
        long lastMessageOrderIndex;
        long lastMessageIndex;
        Set<Integer> setLIZ;
        C1C7U.LIZ("ChatRoomFakeMsgOperatorAssem@4cab.triggerFakeMessageByChatRoomEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZ(this.LL.m238do());
        c1684506ih.LIZJ(this.LLILLJJLI);
        ChatRoomFakeMsgOperatorAssem chatRoomFakeMsgOperatorAssem = this.LL;
        int i2 = this.LLILLL;
        C1737706rH c1737706rH = chatRoomFakeMsgOperatorAssem.LLILLL;
        SessionInfo sessionInfoM238do = chatRoomFakeMsgOperatorAssem.m238do();
        c1737706rH.getClass();
        int chatType = sessionInfoM238do.getChatType();
        if (chatType != 0) {
            if (chatType != 3) {
                i = 2;
            } else {
                i = 8;
            }
        } else {
            i = 4;
        }
        String conversationId = chatRoomFakeMsgOperatorAssem.m238do().getConversationId();
        String uuid = chatRoomFakeMsgOperatorAssem.m238do().getUuid();
        C1736606r6 c1736606r6LIZIZ = c1684506ih.LIZIZ();
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, FakeMsgProtocol.class, false);
        if (listLIZIZ != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (ArrayList) listLIZIZ) {
                FakeMsgProtocol fakeMsgProtocol = (FakeMsgProtocol) obj2;
                InterfaceC1757006uO interfaceC1757006uOH80 = fakeMsgProtocol.h80();
                if (interfaceC1757006uOH80 != null && (setLIZ = interfaceC1757006uOH80.LIZ()) != null && setLIZ.contains(Integer.valueOf(i2)) && (fakeMsgProtocol.j40() & i) == i) {
                    arrayList.add(obj2);
                }
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (Object obj3 : arrayList) {
                LJ.put(Integer.valueOf(((FakeMsgProtocol) obj3).Sv1()), obj3);
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        List listLIZIZ2 = C1554610qYd.LIZIZ(GScope.LL, FakeMsgProtocol.class, false);
        if (listLIZIZ2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : (ArrayList) listLIZIZ2) {
                FakeMsgProtocol fakeMsgProtocol2 = (FakeMsgProtocol) obj4;
                Set<Integer> setLIZLLL = fakeMsgProtocol2.xf1().LIZLLL();
                if (setLIZLLL != null && setLIZLLL.contains(Integer.valueOf(i2)) && (fakeMsgProtocol2.j40() & i) == i) {
                    arrayList2.add(obj4);
                }
            }
            int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
            if (iLIZIZ2 < 16) {
                iLIZIZ2 = 16;
            }
            LJ2 = new LinkedHashMap(iLIZIZ2);
            for (Object obj5 : arrayList2) {
                LJ2.put(Integer.valueOf(((FakeMsgProtocol) obj5).Sv1()), obj5);
            }
        } else {
            LJ2 = C2097608Jq.LJ();
        }
        Set setLJII = C15442062u.LJII(LJ.keySet(), LJ2.keySet());
        ArrayList arrayList3 = new ArrayList(C13LP.LJLLLL(new AComparatorS501S0100000_2(LJ2, 9), C13LP.LLIIII(LJ2.keySet())));
        arrayList3.addAll(C13LP.LLIIII(setLJII));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            FakeMsgProtocol fakeMsgProtocol3 = (FakeMsgProtocol) LJ2.get(Integer.valueOf(iIntValue));
            if (fakeMsgProtocol3 != null) {
                InterfaceC1737306rD interfaceC1737306rDBo = chatRoomFakeMsgOperatorAssem.bo();
                C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(conversationId);
                if (c0y8tLJIL != null) {
                    lastMessageOrderIndex = c0y8tLJIL.getLastMessageOrderIndex();
                } else {
                    lastMessageOrderIndex = 0;
                }
                long jMax = Math.max(lastMessageOrderIndex, 10000L);
                if (c0y8tLJIL != null) {
                    lastMessageIndex = c0y8tLJIL.getLastMessageIndex();
                } else {
                    lastMessageIndex = 1;
                }
                interfaceC1737306rDBo.LIZIZ(conversationId, uuid, c1736606r6LIZIZ, fakeMsgProtocol3, c0y8tLJIL, jMax, lastMessageIndex, null);
            }
            FakeMsgProtocol fakeMsgProtocol4 = (FakeMsgProtocol) LJ.get(Integer.valueOf(iIntValue));
            if (fakeMsgProtocol4 != null) {
                ((C1756306uH) chatRoomFakeMsgOperatorAssem.bo()).LIZ(conversationId, uuid, c1736606r6LIZIZ, fakeMsgProtocol4, null);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomFakeMsgOperatorAssem@4cab.triggerFakeMessageByChatRoomEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
