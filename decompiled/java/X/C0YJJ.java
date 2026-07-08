package X;

import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJJ {
    public final C0YJZ LIZ;
    public final C0YH7 LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(395));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(396));

    /* JADX WARN: Type inference failed for: r1v6, types: [X.0YD7] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0YD7] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.0YD7] */
    public final void LIZ(Pair<? extends List<String>, String> pair) {
        boolean zLJI = MethodIDManager.LJI(137949);
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real batch fetch, from: ");
        sbLIZ.append(pair.getSecond());
        C868780Y6i.LJ(c868780Y6iLIZLLL, "ReadReceiptFetcher", C2188811AlT.LIZIZ(sbLIZ), 4);
        C0YH7 c0yh7 = this.LIZIZ;
        List<String> first = pair.getFirst();
        C914120Zta c914120Zta = new C914120Zta(this, pair, 2);
        C0YD9 c0yd9 = new C0YD9(c0yh7);
        final C914130Ztb c914130Ztb = new C914130Ztb(c914120Zta, c0yd9, new ArrayList(), 10);
        ArrayList<List> arrayList = new ArrayList();
        int i = C0YJN.LIZJ;
        int i2 = C0YJN.LIZIZ;
        ArrayList arrayList2 = null;
        boolean z = false;
        for (String str : first) {
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.add(str);
            if (i > 0 && !z) {
                if (arrayList2.size() == i) {
                    final C0YH7 c0yh72 = c0yd9.LIZ;
                    new AbstractC871540YGy<C0YD8>(c0yh72, c914130Ztb) { // from class: X.0YD7
                        public boolean LJFF;
                        public final C01GW LJI;

                        @Override // X.AbstractC867440Y1e
                        public final boolean LJ() {
                            return true;
                        }

                        @Override // X.AbstractC867440Y1e
                        public final boolean LJIIIIZZ(C0YIN c0yin) {
                            Response response;
                            ResponseBody responseBody;
                            BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody;
                            if (c0yin != null && (response = c0yin.LLIZ) != null && (responseBody = response.body) != null && (batchGetConversationParticipantsReadIndexResponseBody = responseBody.batch_get_conversation_participants_readindex) != null && batchGetConversationParticipantsReadIndexResponseBody.conversationParticipantsReadIndex != null) {
                                return true;
                            }
                            return false;
                        }

                        {
                            super(c0yh72, C0YMR.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue(), c914130Ztb);
                            this.LJI = C452501pT.LIZIZ(new AwS558S0100000_14(c0yh72, 1669));
                        }

                        @Override // X.AbstractC867440Y1e
                        public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                            if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
                                List<ConversationParticipantReadIndex> list = c0yin.LLIZ.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex;
                                if (list != null) {
                                    LIZJ(new C0YD8(list, this.LJFF));
                                    return;
                                } else {
                                    LIZ(c0yin);
                                    return;
                                }
                            }
                            LIZ(c0yin);
                        }

                        public final void LJIIJJI(String str2, boolean z2, List list) {
                            this.LJFF = z2;
                            C868780Y6i c868780Y6i = (C868780Y6i) this.LJI.getValue();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("BatchGetReadIndexHandler");
                            sbLIZ2.append(" get, from + ");
                            sbLIZ2.append("");
                            sbLIZ2.append(", conIds = ");
                            sbLIZ2.append(list);
                            C868780Y6i.LJIILIIL(c868780Y6i, C2188811AlT.LIZIZ(sbLIZ2));
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            if (list.isEmpty()) {
                                C868780Y6i c868780Y6i2 = (C868780Y6i) this.LJI.getValue();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("BatchGetReadIndexHandler");
                                sbLIZ3.append(" get, conIds is null, return");
                                C868780Y6i.LJIILIIL(c868780Y6i2, C2188811AlT.LIZIZ(sbLIZ3));
                                return;
                            }
                            Iterator it2 = list.iterator();
                            int inboxType = 0;
                            while (it2.hasNext()) {
                                String str3 = (String) it2.next();
                                C0Y8T c0y8tLIZ = this.LJ.LIZJ().LJ().LIZ(str3);
                                if ((c0y8tLIZ != null && c0y8tLIZ.getConversationShortId() != 0) || (c0y8tLIZ = this.LJ.LIZJ().LJ().LJJLIIIIJ(str3)) != null) {
                                    if (c0y8tLIZ.getConversationShortId() != 0) {
                                        inboxType = c0y8tLIZ.getInboxType();
                                        arrayList3.add(str3);
                                        arrayList4.add(Long.valueOf(c0y8tLIZ.getConversationShortId()));
                                    }
                                }
                            }
                            C870480YCw c870480YCw = new C870480YCw();
                            C1516540pZE.LIZ(arrayList3);
                            c870480YCw.LIZLLL = arrayList3;
                            C1516540pZE.LIZ(arrayList4);
                            c870480YCw.LJ = arrayList4;
                            c870480YCw.LJFF = "";
                            this.LJ.getConfig().LIZ().getClass();
                            c870480YCw.LJI = Boolean.FALSE;
                            BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBodyBuild = c870480YCw.build();
                            C1ES0 c1es0 = new C1ES0();
                            c1es0.LJJLJLI = batchGetConversationParticipantsReadIndexRequestBodyBuild;
                            LJIIIZ(inboxType, c1es0.build(), null, new Object[0]);
                        }
                    }.LJIIJJI("", true, arrayList2);
                    arrayList2 = null;
                    z = true;
                }
            } else if (arrayList2.size() == i2) {
                arrayList.add(arrayList2);
                arrayList2 = null;
            }
        }
        for (List list : arrayList) {
            c0yd9.LIZIZ++;
            final C0YH7 c0yh73 = c0yd9.LIZ;
            new AbstractC871540YGy<C0YD8>(c0yh73, c914130Ztb) { // from class: X.0YD7
                public boolean LJFF;
                public final C01GW LJI;

                @Override // X.AbstractC867440Y1e
                public final boolean LJ() {
                    return true;
                }

                @Override // X.AbstractC867440Y1e
                public final boolean LJIIIIZZ(C0YIN c0yin) {
                    Response response;
                    ResponseBody responseBody;
                    BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody;
                    if (c0yin != null && (response = c0yin.LLIZ) != null && (responseBody = response.body) != null && (batchGetConversationParticipantsReadIndexResponseBody = responseBody.batch_get_conversation_participants_readindex) != null && batchGetConversationParticipantsReadIndexResponseBody.conversationParticipantsReadIndex != null) {
                        return true;
                    }
                    return false;
                }

                {
                    super(c0yh73, C0YMR.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue(), c914130Ztb);
                    this.LJI = C452501pT.LIZIZ(new AwS558S0100000_14(c0yh73, 1669));
                }

                @Override // X.AbstractC867440Y1e
                public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                    if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
                        List<ConversationParticipantReadIndex> list2 = c0yin.LLIZ.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex;
                        if (list2 != null) {
                            LIZJ(new C0YD8(list2, this.LJFF));
                            return;
                        } else {
                            LIZ(c0yin);
                            return;
                        }
                    }
                    LIZ(c0yin);
                }

                public final void LJIIJJI(String str2, boolean z2, List list2) {
                    this.LJFF = z2;
                    C868780Y6i c868780Y6i = (C868780Y6i) this.LJI.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BatchGetReadIndexHandler");
                    sbLIZ2.append(" get, from + ");
                    sbLIZ2.append("");
                    sbLIZ2.append(", conIds = ");
                    sbLIZ2.append(list2);
                    C868780Y6i.LJIILIIL(c868780Y6i, C2188811AlT.LIZIZ(sbLIZ2));
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (list2.isEmpty()) {
                        C868780Y6i c868780Y6i2 = (C868780Y6i) this.LJI.getValue();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("BatchGetReadIndexHandler");
                        sbLIZ3.append(" get, conIds is null, return");
                        C868780Y6i.LJIILIIL(c868780Y6i2, C2188811AlT.LIZIZ(sbLIZ3));
                        return;
                    }
                    Iterator it2 = list2.iterator();
                    int inboxType = 0;
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        C0Y8T c0y8tLIZ = this.LJ.LIZJ().LJ().LIZ(str3);
                        if ((c0y8tLIZ != null && c0y8tLIZ.getConversationShortId() != 0) || (c0y8tLIZ = this.LJ.LIZJ().LJ().LJJLIIIIJ(str3)) != null) {
                            if (c0y8tLIZ.getConversationShortId() != 0) {
                                inboxType = c0y8tLIZ.getInboxType();
                                arrayList3.add(str3);
                                arrayList4.add(Long.valueOf(c0y8tLIZ.getConversationShortId()));
                            }
                        }
                    }
                    C870480YCw c870480YCw = new C870480YCw();
                    C1516540pZE.LIZ(arrayList3);
                    c870480YCw.LIZLLL = arrayList3;
                    C1516540pZE.LIZ(arrayList4);
                    c870480YCw.LJ = arrayList4;
                    c870480YCw.LJFF = "";
                    this.LJ.getConfig().LIZ().getClass();
                    c870480YCw.LJI = Boolean.FALSE;
                    BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBodyBuild = c870480YCw.build();
                    C1ES0 c1es0 = new C1ES0();
                    c1es0.LJJLJLI = batchGetConversationParticipantsReadIndexRequestBodyBuild;
                    LJIIIZ(inboxType, c1es0.build(), null, new Object[0]);
                }
            }.LJIIJJI("", false, list);
        }
        if (arrayList2 != null) {
            c0yd9.LIZIZ++;
            final C0YH7 c0yh74 = c0yd9.LIZ;
            new AbstractC871540YGy<C0YD8>(c0yh74, c914130Ztb) { // from class: X.0YD7
                public boolean LJFF;
                public final C01GW LJI;

                @Override // X.AbstractC867440Y1e
                public final boolean LJ() {
                    return true;
                }

                @Override // X.AbstractC867440Y1e
                public final boolean LJIIIIZZ(C0YIN c0yin) {
                    Response response;
                    ResponseBody responseBody;
                    BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody;
                    if (c0yin != null && (response = c0yin.LLIZ) != null && (responseBody = response.body) != null && (batchGetConversationParticipantsReadIndexResponseBody = responseBody.batch_get_conversation_participants_readindex) != null && batchGetConversationParticipantsReadIndexResponseBody.conversationParticipantsReadIndex != null) {
                        return true;
                    }
                    return false;
                }

                {
                    super(c0yh74, C0YMR.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue(), c914130Ztb);
                    this.LJI = C452501pT.LIZIZ(new AwS558S0100000_14(c0yh74, 1669));
                }

                @Override // X.AbstractC867440Y1e
                public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                    if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
                        List<ConversationParticipantReadIndex> list2 = c0yin.LLIZ.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex;
                        if (list2 != null) {
                            LIZJ(new C0YD8(list2, this.LJFF));
                            return;
                        } else {
                            LIZ(c0yin);
                            return;
                        }
                    }
                    LIZ(c0yin);
                }

                public final void LJIIJJI(String str2, boolean z2, List list2) {
                    this.LJFF = z2;
                    C868780Y6i c868780Y6i = (C868780Y6i) this.LJI.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BatchGetReadIndexHandler");
                    sbLIZ2.append(" get, from + ");
                    sbLIZ2.append("");
                    sbLIZ2.append(", conIds = ");
                    sbLIZ2.append(list2);
                    C868780Y6i.LJIILIIL(c868780Y6i, C2188811AlT.LIZIZ(sbLIZ2));
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (list2.isEmpty()) {
                        C868780Y6i c868780Y6i2 = (C868780Y6i) this.LJI.getValue();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("BatchGetReadIndexHandler");
                        sbLIZ3.append(" get, conIds is null, return");
                        C868780Y6i.LJIILIIL(c868780Y6i2, C2188811AlT.LIZIZ(sbLIZ3));
                        return;
                    }
                    Iterator it2 = list2.iterator();
                    int inboxType = 0;
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        C0Y8T c0y8tLIZ = this.LJ.LIZJ().LJ().LIZ(str3);
                        if ((c0y8tLIZ != null && c0y8tLIZ.getConversationShortId() != 0) || (c0y8tLIZ = this.LJ.LIZJ().LJ().LJJLIIIIJ(str3)) != null) {
                            if (c0y8tLIZ.getConversationShortId() != 0) {
                                inboxType = c0y8tLIZ.getInboxType();
                                arrayList3.add(str3);
                                arrayList4.add(Long.valueOf(c0y8tLIZ.getConversationShortId()));
                            }
                        }
                    }
                    C870480YCw c870480YCw = new C870480YCw();
                    C1516540pZE.LIZ(arrayList3);
                    c870480YCw.LIZLLL = arrayList3;
                    C1516540pZE.LIZ(arrayList4);
                    c870480YCw.LJ = arrayList4;
                    c870480YCw.LJFF = "";
                    this.LJ.getConfig().LIZ().getClass();
                    c870480YCw.LJI = Boolean.FALSE;
                    BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBodyBuild = c870480YCw.build();
                    C1ES0 c1es0 = new C1ES0();
                    c1es0.LJJLJLI = batchGetConversationParticipantsReadIndexRequestBodyBuild;
                    LJIIIZ(inboxType, c1es0.build(), null, new Object[0]);
                }
            }.LJIIJJI("", false, arrayList2);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZIZ(Pair<String, String> pair) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real fetch, from: ");
        sbLIZ.append(pair.getSecond());
        C868780Y6i.LJ(c868780Y6iLIZLLL, "ReadReceiptFetcher", C2188811AlT.LIZIZ(sbLIZ), 4);
        final C0YH7 c0yh7 = this.LIZIZ;
        final C914120Zta c914120Zta = new C914120Zta(this, pair, 3);
        AbstractC871540YGy<List<? extends ParticipantReadIndex>> abstractC871540YGy = new AbstractC871540YGy<List<? extends ParticipantReadIndex>>(c0yh7, c914120Zta) { // from class: X.0YHL
            @Override // X.AbstractC867440Y1e
            public final boolean LJIIIIZZ(C0YIN c0yin) {
                Response response;
                ResponseBody responseBody;
                if (c0yin != null && (response = c0yin.LLIZ) != null && (responseBody = response.body) != null && responseBody.participants_read_index_body != null && c0yin.LJIIJJI()) {
                    return true;
                }
                return false;
            }

            {
                int value = C0YMR.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue();
            }

            @Override // X.AbstractC867440Y1e
            public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                if (LJIIIIZZ(c0yin)) {
                    LIZJ(c0yin.LLIZ.body.participants_read_index_body.indexes);
                } else {
                    LIZ(c0yin);
                }
            }
        };
        C0Y8T c0y8tLIZ = abstractC871540YGy.LJ.LIZJ().LJ().LIZ(pair.getFirst());
        if (c0y8tLIZ != null && !c0y8tLIZ.isLocal()) {
            C0YJK c0yjk = new C0YJK();
            c0yjk.LIZLLL = Long.valueOf(c0y8tLIZ.getConversationShortId());
            c0yjk.LJ = Integer.valueOf(c0y8tLIZ.getConversationType());
            c0yjk.LJFF = c0y8tLIZ.getConversationId();
            GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBodyLIZIZ = c0yjk.build();
            C1ES0 c1es0 = new C1ES0();
            c1es0.LJJJLZIJ = getConversationParticipantsReadIndexV3RequestBodyLIZIZ;
            abstractC871540YGy.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, c0y8tLIZ);
            return;
        }
        abstractC871540YGy.LIZ(C0YIN.LIZJ(abstractC871540YGy.LJ.getConfig().LIZ.LJFF().LJIILL(), abstractC871540YGy.LJ.LIZLLL(), -1017));
    }

    public C0YJJ(C0YJZ c0yjz, C0YH7 c0yh7) {
        this.LIZ = c0yjz;
        this.LIZIZ = c0yh7;
        C23250099c.LIZLLL(C315110CWv.LIZ(), null, null, new C0YJR(this, null), 3);
        C23250099c.LIZLLL(C315110CWv.LIZ(), null, null, new C0YJO(this, null), 3);
    }
}
