package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.topbar.save.EPSaveFlow", f = "EPSaveFlow.kt", l = {434}, m = "handleSaveAsync")
public final class C376490EpT extends AbstractC23140094w {
    public Function2 LL;
    public C0E48 LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C376460EpQ LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C376490EpT(C376460EpQ c376460EpQ, InterfaceC1364105Vn<? super C376490EpT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c376460EpQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPSaveFlow@a786.handleSaveAsync$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILZLL.LJIIJ(this, null, false, false);
        C1C7U.LIZIZ("EPSaveFlow@a786.handleSaveAsync$1");
        return objLJIIJ;
    }
}
