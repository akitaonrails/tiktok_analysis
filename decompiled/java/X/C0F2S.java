package X;

import Y.AgS98S1100000_5;

/* JADX INFO: renamed from: X.0F2S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutAnchorMediaProcessImpl$waitMockTaskFinished$terminalTask$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "AutoCutAnchorMediaProcessImpl.kt", l = {230}, m = "emit")
public final class C0F2S extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS98S1100000_5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F2S(AgS98S1100000_5 agS98S1100000_5, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS98S1100000_5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$terminalTask$1$invokeSuspend$$inlined$mapNotNull$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$terminalTask$1$invokeSuspend$$inlined$mapNotNull$1$2$1");
        return objEmit;
    }
}
