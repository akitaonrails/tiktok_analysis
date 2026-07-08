package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06nI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1713006nI extends C2217421BqW implements Function1<C0Y8T, String> {
    public C1713006nI(C907520Ziw c907520Ziw) {
        super(1, c907520Ziw, C907520Ziw.class, "getConversationLogString", "getConversationLogString$im_search_impl_release(Lcom/bytedance/im/core/conversation/core/model/Conversation;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C0Y8T c0y8t) {
        String name;
        C0Y8T c0y8t2 = c0y8t;
        this.receiver.getClass();
        if (c0y8t2 == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0y8t2.getConversationId());
        sbLIZ.append('#');
        C0Y8Y coreInfo = c0y8t2.getCoreInfo();
        if (coreInfo != null) {
            name = coreInfo.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append('#');
        sbLIZ.append(c0y8t2.getUpdatedTime());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
