package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ziq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C907460Ziq extends C2217421BqW implements Function1<C0Y8T, C907840ZjS> {
    public C907460Ziq(C907810ZjP c907810ZjP) {
        super(1, c907810ZjP, C907810ZjP.class, "convertConversationIntoSearchContent", "convertConversationIntoSearchContent(Lcom/bytedance/im/core/conversation/core/model/Conversation;)Lcom/ss/android/ugc/aweme/im/search/sdk/model/IMSearchContent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C907840ZjS invoke(C0Y8T c0y8t) {
        String name;
        C0Y8T c0y8t2 = c0y8t;
        this.receiver.getClass();
        C0Y8Y coreInfo = c0y8t2.getCoreInfo();
        if (coreInfo != null && (name = coreInfo.getName()) != null) {
            String conversationId = c0y8t2.getConversationId();
            C907810ZjP.LIZ.getClass();
            return new C907840ZjS(1, conversationId, 2, C907810ZjP.LIZJ(C907810ZjP.LIZLLL(name)), c0y8t2.getUpdatedTime(), null, null, 480);
        }
        return null;
    }
}
