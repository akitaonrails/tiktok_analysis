package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C909900Zmm extends C2217421BqW implements Function1<InterfaceC904740ZeS, Unit> {
    public C909900Zmm(C909910Zmn c909910Zmn) {
        super(1, c909910Zmn, C909910Zmn.class, "updateLastMessageContent", "updateLastMessageContent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/MessageEvent;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC904740ZeS interfaceC904740ZeS) {
        C869590Y9l c869590Y9l;
        String uuid;
        C1157450gE3 c1157450gE3;
        C909930Zmp c909930Zmp;
        InterfaceC904740ZeS interfaceC904740ZeS2 = interfaceC904740ZeS;
        C909910Zmn c909910Zmn = (C909910Zmn) this.receiver;
        c909910Zmn.getClass();
        if (interfaceC904740ZeS2 instanceof C1758306ub) {
            c909910Zmn.LJ.setValue(interfaceC904740ZeS2);
        }
        Object value = c909910Zmn.LIZLLL.getValue();
        Object uuid2 = null;
        if ((value instanceof C1157450gE3) && (c1157450gE3 = (C1157450gE3) value) != null && (c909930Zmp = (C909930Zmp) c1157450gE3.LIZ) != null) {
            c869590Y9l = c909930Zmp.LIZ;
        } else {
            c869590Y9l = null;
        }
        if (interfaceC904740ZeS2 instanceof C06S8) {
            Iterator<C869590Y9l> it2 = ((C06S8) interfaceC904740ZeS2).LIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C869590Y9l next = it2.next();
                String uuid3 = next.getUuid();
                if (c869590Y9l != null) {
                    uuid = c869590Y9l.getUuid();
                } else {
                    uuid = null;
                }
                if (Intrinsics.LJFF(uuid3, uuid)) {
                    uuid2 = next;
                    break;
                }
            }
            C869590Y9l c869590Y9l2 = (C869590Y9l) uuid2;
            if (c869590Y9l2 != null) {
                c909910Zmn.LIZLLL.setValue(new C1157450gE3(new C909930Zmp(c869590Y9l2.m38clone()), EnumC1156000gBi.CACHE));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateLastMessageContent: OnUpdateMessageEvent uuid=");
                sbLIZ.append(c869590Y9l2.getUuid());
                sbLIZ.append(", index=");
                sbLIZ.append(c869590Y9l2.getIndex());
                sbLIZ.append(", msgType=");
                sbLIZ.append(c869590Y9l2.getMsgType());
                sbLIZ.append(", msgStatus=");
                sbLIZ.append(c869590Y9l2.getMsgStatus());
                sbLIZ.append(", msgId=");
                sbLIZ.append(c869590Y9l2.getMsgId());
                sbLIZ.append(", createAt=");
                sbLIZ.append(c869590Y9l2.getCreatedAt());
                sbLIZ.append(", deleted=");
                sbLIZ.append(c869590Y9l2.getDeleted());
                C21290718Tp.LIZIZ("AiChatLastMessageRepository", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else if (interfaceC904740ZeS2 instanceof C06SA) {
            C869590Y9l c869590Y9l3 = ((C06SA) interfaceC904740ZeS2).LIZJ;
            String uuid4 = c869590Y9l3.getUuid();
            if (c869590Y9l != null) {
                uuid2 = c869590Y9l.getUuid();
            }
            if (Intrinsics.LJFF(uuid4, uuid2)) {
                c909910Zmn.LIZLLL.setValue(new C1157450gE3(new C909930Zmp(c869590Y9l3.m38clone()), EnumC1156000gBi.CACHE));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLastMessageContent: OnSendMessageEvent uuid=");
                sbLIZ2.append(c869590Y9l3.getUuid());
                sbLIZ2.append(", index=");
                sbLIZ2.append(c869590Y9l3.getIndex());
                sbLIZ2.append(", msgType=");
                sbLIZ2.append(c869590Y9l3.getMsgType());
                sbLIZ2.append(", msgStatus=");
                sbLIZ2.append(c869590Y9l3.getMsgStatus());
                sbLIZ2.append(", msgId=");
                sbLIZ2.append(c869590Y9l3.getMsgId());
                sbLIZ2.append(", createAt=");
                sbLIZ2.append(c869590Y9l3.getCreatedAt());
                sbLIZ2.append(", deleted=");
                sbLIZ2.append(c869590Y9l3.getDeleted());
                C21290718Tp.LIZIZ("AiChatLastMessageRepository", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateLastMessageContent: OnUpdateMessageEvent unhandledEvent=");
            sbLIZ3.append(interfaceC904740ZeS2);
            C21290718Tp.LIZIZ("AiChatLastMessageRepository", C2188811AlT.LIZIZ(sbLIZ3));
        }
        return Unit.LIZ;
    }
}
