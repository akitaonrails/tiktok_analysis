package X;

import com.bytedance.im.core.internal.link.handler.BatchGetMultiConversationParticipantsReadIndexHelper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YDO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDO extends C09AY implements Function0<BatchGetMultiConversationParticipantsReadIndexHelper> {
    public final /* synthetic */ C0YDN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YDO(C0YDN c0ydn) {
        super(0);
        this.LL = c0ydn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BatchGetMultiConversationParticipantsReadIndexHelper invoke() {
        return new BatchGetMultiConversationParticipantsReadIndexHelper(this.LL.LIZ);
    }
}
