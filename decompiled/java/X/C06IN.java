package X;

import com.ss.android.ugc.aweme.chatnotice.ChatNoticeApiHelper;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06IN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.ChatNoticeApiHelper", f = "ChatNoticeApiHelper.kt", l = {64}, m = "fetchNotice")
public final class C06IN extends AbstractC23140094w {
    public SessionInfo LL;
    public Function1 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ChatNoticeApiHelper LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06IN(ChatNoticeApiHelper chatNoticeApiHelper, InterfaceC1364105Vn<? super C06IN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = chatNoticeApiHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeApiHelper@ffea.fetchNotice$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("ChatNoticeApiHelper@ffea.fetchNotice$1");
        return objLIZJ;
    }
}
