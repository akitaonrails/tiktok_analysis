package X;

import com.bytedance.ies.im.core.send.MessageQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874820YTo extends C09AY implements Function0<MessageQueue> {
    public final /* synthetic */ C874740YTg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874820YTo(C874740YTg c874740YTg) {
        super(0);
        this.LL = c874740YTg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MessageQueue invoke() {
        return new MessageQueue(this.LL.LIZIZ);
    }
}
