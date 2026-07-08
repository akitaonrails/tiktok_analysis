package X;

import com.ss.android.ugc.aweme.group.ChatConvUpdateVM;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1636406aw extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C1636406aw(Object obj) {
        super(1, obj, ChatConvUpdateVM.class, "onConversationEvent", "onConversationEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        Iterator<T> it2 = ((ChatConvUpdateVM) this.receiver).LLILZLL.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(abstractC1702506lb);
        }
        return Unit.LIZ;
    }
}
