package X;

import com.ss.android.ugc.aweme.chatnotice.ChatNoticeApiHelper;

/* JADX INFO: renamed from: X.06IO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.ChatNoticeApiHelper", f = "ChatNoticeApiHelper.kt", l = {115}, m = "sendNoticeAck")
public final class C06IO extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ChatNoticeApiHelper LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06IO(ChatNoticeApiHelper chatNoticeApiHelper, InterfaceC1364105Vn<? super C06IO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = chatNoticeApiHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeApiHelper@ffea.sendNoticeAck$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, 0, null, this);
        C1C7U.LIZIZ("ChatNoticeApiHelper@ffea.sendNoticeAck$1");
        return objLIZIZ;
    }
}
