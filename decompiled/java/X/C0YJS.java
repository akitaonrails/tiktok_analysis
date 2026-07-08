package X;

import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YJS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJS implements InterfaceC872130YJf<List<? extends ConversationParticipantReadIndex>> {
    public final String LIZ;
    public final C0YH7 LIZIZ;

    public C0YJS(C0YH7 c0yh7, String str) {
        this.LIZ = str;
        this.LIZIZ = c0yh7;
    }

    @Override // X.InterfaceC872130YJf
    public final List LIZ(C0YJW c0yjw, Object obj) {
        C869590Y9l lastShowMessage;
        List<ConversationParticipantReadIndex> list = (List) obj;
        c0yjw.LIZJ(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list);
        for (ConversationParticipantReadIndex conversationParticipantReadIndex : C13LP.LLIIII(arrayList2)) {
            ArrayList arrayList3 = new ArrayList();
            List<ParticipantReadIndex> list2 = conversationParticipantReadIndex.participantReadIndex;
            if (list2 != null) {
                arrayList3.addAll(list2);
                List<ParticipantReadIndex> listLLIIII = C13LP.LLIIII(arrayList3);
                C0Y8T c0y8tLIZ = this.LIZIZ.LIZJ().LJ().LIZ(conversationParticipantReadIndex.conversation_id);
                if (c0y8tLIZ != null && (lastShowMessage = c0y8tLIZ.getLastShowMessage()) != null && lastShowMessage.isSelf(this.LIZIZ.getConfig().LIZIZ())) {
                    long index = lastShowMessage.getIndex();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (ParticipantReadIndex participantReadIndex : listLLIIII) {
                        Long l = participantReadIndex.user_id;
                        long jLIZIZ = this.LIZIZ.getConfig().LIZIZ();
                        if (l == null || l.longValue() != jLIZIZ) {
                            if (!Intrinsics.LJFF("1", lastShowMessage.getLocalExt().get("s:message_index_is_local")) && participantReadIndex.index.longValue() >= index) {
                                linkedHashSet.add(participantReadIndex.user_id);
                            }
                        }
                    }
                    arrayList.add(new C872090YJb(conversationParticipantReadIndex.conversation_id, index, linkedHashSet, this.LIZ));
                }
            }
        }
        return arrayList;
    }
}
