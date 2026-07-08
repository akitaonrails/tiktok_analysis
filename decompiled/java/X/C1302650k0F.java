package X;

/* JADX INFO: renamed from: X.0k0F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession", f = "CallSession.kt", l = {214}, m = "maybeSwitchToSpeakerOnCallStart")
public final class C1302650k0F extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1302520k02 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302650k0F(C1302520k02 c1302520k02, InterfaceC1364105Vn<? super C1302650k0F> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1302520k02;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LJFF(this);
    }
}
