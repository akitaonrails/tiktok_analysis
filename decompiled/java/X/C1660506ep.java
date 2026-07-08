package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.06ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1660506ep extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C1660506ep(Object obj) {
        super(1, obj, MessageListViewModel.class, "onConversationEvent", "onConversationEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        AbstractC1702506lb abstractC1702506lb2 = abstractC1702506lb;
        AssemViewModel assemViewModel = (AssemViewModel) this.receiver;
        assemViewModel.getClass();
        if (abstractC1702506lb2 instanceof C1702406la) {
            assemViewModel.setState(new AwS368S0200000_2(((C1702406la) abstractC1702506lb2).LIZ, abstractC1702506lb2, 6));
        }
        return Unit.LIZ;
    }
}
