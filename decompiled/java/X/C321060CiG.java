package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageRemote;

/* JADX INFO: renamed from: X.0CiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageRemote", f = "MessageRemote.kt", l = {39}, m = "fetchHistoryMessage")
public final class C321060CiG extends AbstractC23140094w {
    public MessageRemote LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MessageRemote LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321060CiG(MessageRemote messageRemote, InterfaceC1364105Vn<? super C321060CiG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = messageRemote;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRemote@7617.fetchHistoryMessage$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0, 0L, null, this);
        C1C7U.LIZIZ("MessageRemote@7617.fetchHistoryMessage$1");
        return objLIZ;
    }
}
