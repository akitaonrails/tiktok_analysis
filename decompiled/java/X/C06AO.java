package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06AO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C06AO extends C2217421BqW implements Function1<InterfaceC904740ZeS, Unit> {
    public C06AO(Object obj) {
        super(1, obj, CommonChatNoticeAssem.class, "onMessageEvent", "onMessageEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/MessageEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC904740ZeS interfaceC904740ZeS) {
        ((CommonChatNoticeAssem) this.receiver).df1(interfaceC904740ZeS);
        return Unit.LIZ;
    }
}
