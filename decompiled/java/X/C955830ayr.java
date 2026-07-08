package X;

/* JADX INFO: renamed from: X.0ayr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.core.linkmic.LinkMicEventDispatcher$observeBattleMessageFlow$1$invokeSuspend$$inlined$map$1$2", f = "ILinkMicEventDispatcher.kt", l = {223}, m = "emit")
public final class C955830ayr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C955560ayQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C955830ayr(C955560ayQ c955560ayQ, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c955560ayQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LinkMicEventDispatcher@67fe.observeBattleMessageFlow$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("LinkMicEventDispatcher@67fe.observeBattleMessageFlow$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
