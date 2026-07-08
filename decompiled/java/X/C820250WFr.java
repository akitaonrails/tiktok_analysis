package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0WFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820250WFr extends AbstractRunnableC820240WFq {
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Bundle LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ C820210WFn LLJIJIL;
    public final /* synthetic */ Long LLILZIL = null;
    public final /* synthetic */ boolean LLJI = true;

    @Override // X.AbstractRunnableC820240WFq
    public final void LIZ() {
        Long l = this.LLILZIL;
        long jLongValue = l == null ? this.LL : l.longValue();
        InterfaceC820490WGp interfaceC820490WGp = this.LLJIJIL.LJI;
        C0W3J.LJIIIIZZ(interfaceC820490WGp);
        interfaceC820490WGp.logEvent(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, jLongValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C820250WFr(C820210WFn c820210WFn, String str, String str2, Bundle bundle, boolean z) {
        super(c820210WFn, true);
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = bundle;
        this.LLJ = z;
        this.LLJIJIL = c820210WFn;
    }
}
