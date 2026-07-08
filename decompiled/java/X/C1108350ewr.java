package X;

import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.model.message.SubPinEventMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ewr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108350ewr implements OnMessageListener, InterfaceC1141530foN {
    public static final C1108350ewr LL = new C1108350ewr();
    public static final C1119470fEn<InterfaceC1108360ews> LLILLJJLI = new C1119470fEn<>((Object) null);
    public static final C1119470fEn<Integer> LLILLL = new C1119470fEn<>((Object) null);
    public static final C1119470fEn<Integer> LLILZ = new C1119470fEn<>((Object) null);

    public static void LIZ(Room room) {
        SubPinCard subPinCard;
        if (room != null && (subPinCard = room.subPinCard) != null) {
            C1108790exZ c1108790exZ = new C1108790exZ(subPinCard, new C1107970ewF(-1L), null, new C1108370ewt(room), 4);
            InterfaceC1108360ews interfaceC1108360ewsLIZLLL = LLILLJJLI.LIZLLL(subPinCard.type);
            if (interfaceC1108360ewsLIZLLL != null) {
                interfaceC1108360ewsLIZLLL.LLLLZI(c1108790exZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1108350ewr.mh2(X.00zr):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        SubPinCard subPinCard;
        if (iMessage instanceof SubPinEventMessage) {
            SubPinEventMessage subPinEventMessage = (SubPinEventMessage) iMessage;
            int i = subPinEventMessage.actionType;
            if (i != 1) {
                if (i == 2 && (subPinCard = subPinEventMessage.card) != null) {
                    LIZIZ(subPinCard.type, EnumC1108700exQ.UNPIN, Long.valueOf(subPinEventMessage.operatorUserId));
                    return;
                }
                return;
            }
            SubPinCard subPinCard2 = subPinEventMessage.card;
            if (subPinCard2 == null) {
                return;
            }
            long j2 = subPinEventMessage.operatorUserId;
            CommonMessageData commonMessageData = subPinEventMessage.baseMessage;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            } else {
                j = -2;
            }
            C1108790exZ c1108790exZ = new C1108790exZ(subPinCard2, new C1107970ewF(j), Long.valueOf(j2), null, 8);
            InterfaceC1108360ews interfaceC1108360ewsLIZLLL = LLILLJJLI.LIZLLL(subPinCard2.type);
            if (interfaceC1108360ewsLIZLLL == null) {
                return;
            }
            interfaceC1108360ewsLIZLLL.LLLLZI(c1108790exZ);
        }
    }

    public static void LIZIZ(int i, EnumC1108700exQ enumC1108700exQ, Long l) {
        InterfaceC1108360ews interfaceC1108360ewsLIZLLL = LLILLJJLI.LIZLLL(i);
        if (interfaceC1108360ewsLIZLLL != null) {
            interfaceC1108360ewsLIZLLL.I(enumC1108700exQ, l);
        }
    }

    public static void LIZJ(List list, int i, EnumC1108060ewO enumC1108060ewO) {
        C1119470fEn<Integer> c1119470fEn;
        Integer numLIZLLL;
        boolean z;
        EnumC1108060ewO enumC1108060ewO2;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            C1119470fEn<Integer> c1119470fEn2 = LLILLL;
            Integer numLIZLLL2 = c1119470fEn2.LIZLLL(iIntValue);
            if (numLIZLLL2 != null) {
                c1119470fEn2.LJFF(iIntValue, Integer.valueOf(numLIZLLL2.intValue() & (~i)));
            }
            if ((i == 8192 || i == 16384) && (numLIZLLL = (c1119470fEn = LLILZ).LIZLLL(iIntValue)) != null) {
                c1119470fEn.LJFF(iIntValue, Integer.valueOf(numLIZLLL.intValue() & (~i)));
            }
            Integer numLIZLLL3 = c1119470fEn2.LIZLLL(iIntValue);
            boolean z2 = true;
            if (numLIZLLL3 != null && numLIZLLL3.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            Integer numLIZLLL4 = LLILZ.LIZLLL(iIntValue);
            if (numLIZLLL4 == null || numLIZLLL4.intValue() != 0) {
                z2 = false;
            }
            if (z) {
                enumC1108060ewO2 = EnumC1108060ewO.NULL;
            } else {
                enumC1108060ewO2 = enumC1108060ewO;
            }
            InterfaceC1108360ews interfaceC1108360ewsLIZLLL = LLILLJJLI.LIZLLL(iIntValue);
            if (interfaceC1108360ewsLIZLLL != null) {
                interfaceC1108360ewsLIZLLL.LJJZZIII(z, z2, enumC1108060ewO2);
            }
        }
    }

    public static void LIZLLL(List list, int i, EnumC1108060ewO enumC1108060ewO) {
        C1119470fEn<Integer> c1119470fEn;
        Integer numLIZLLL;
        boolean z;
        EnumC1108060ewO enumC1108060ewO2;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            C1119470fEn<Integer> c1119470fEn2 = LLILLL;
            Integer numLIZLLL2 = c1119470fEn2.LIZLLL(iIntValue);
            if (numLIZLLL2 != null) {
                c1119470fEn2.LJFF(iIntValue, Integer.valueOf(numLIZLLL2.intValue() | i));
            }
            if ((i == 8192 || i == 16384) && (numLIZLLL = (c1119470fEn = LLILZ).LIZLLL(iIntValue)) != null) {
                c1119470fEn.LJFF(iIntValue, Integer.valueOf(numLIZLLL.intValue() | i));
            }
            Integer numLIZLLL3 = c1119470fEn2.LIZLLL(iIntValue);
            boolean z2 = true;
            if (numLIZLLL3 != null && numLIZLLL3.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            Integer numLIZLLL4 = LLILZ.LIZLLL(iIntValue);
            if (numLIZLLL4 == null || numLIZLLL4.intValue() != 0) {
                z2 = false;
            }
            if (z) {
                enumC1108060ewO2 = EnumC1108060ewO.NULL;
            } else {
                enumC1108060ewO2 = enumC1108060ewO;
            }
            InterfaceC1108360ews interfaceC1108360ewsLIZLLL = LLILLJJLI.LIZLLL(iIntValue);
            if (interfaceC1108360ewsLIZLLL != null) {
                interfaceC1108360ewsLIZLLL.LJJZZIII(z, z2, enumC1108060ewO2);
            }
        }
    }
}
