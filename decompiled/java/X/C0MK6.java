package X;

import Y.AgS34S0500000_8;

/* JADX INFO: renamed from: X.0MK6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createPrepareTaskFlow$$inlined$map$1$2", f = "Forward2StoryEnvironment.kt", l = {223}, m = "emit")
public final class C0MK6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS34S0500000_8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MK6(AgS34S0500000_8 agS34S0500000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS34S0500000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Forward2StoryEnvironment@d506.createPrepareTaskFlow$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.createPrepareTaskFlow$$inlined$map$1$2$1");
        return objEmit;
    }
}
