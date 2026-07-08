package X;

/* JADX INFO: renamed from: X.0k08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession", f = "CallSession.kt", l = {240, 244, 253}, m = "maybeDelaySwitchToSpeaker")
public final class C1302580k08 extends AbstractC23140094w {
    public C1302520k02 LL;
    public C1302410jzr LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1302520k02 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302580k08(C1302520k02 c1302520k02, InterfaceC1364105Vn<? super C1302580k08> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1302520k02;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.LIZLLL(null, this);
    }
}
