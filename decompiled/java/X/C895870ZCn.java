package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;

/* JADX INFO: renamed from: X.0ZCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics", f = "IMChatRoomAnalytics.kt", l = {540}, m = "appendConversationParams")
public final class C895870ZCn extends AbstractC23140094w {
    public boolean LL;
    public Object LLILLJJLI;
    public IMUser LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ IMChatRoomAnalytics LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C895870ZCn(IMChatRoomAnalytics iMChatRoomAnalytics, InterfaceC1364105Vn<? super C895870ZCn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = iMChatRoomAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMChatRoomAnalytics@6d9e.appendConversationParams$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZIL.LJI(false, null, null, null, null, false, this);
        C1C7U.LIZIZ("IMChatRoomAnalytics@6d9e.appendConversationParams$1");
        return objLJI;
    }
}
