package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.topbar.save.EPSaveFlow", f = "EPSaveFlow.kt", l = {589, 616}, m = "templateIntercept")
public final class C376500EpU extends AbstractC23140094w {
    public Function0 LL;
    public C0E48 LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C376460EpQ LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C376500EpU(C376460EpQ c376460EpQ, InterfaceC1364105Vn<? super C376500EpU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c376460EpQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPSaveFlow@a786.templateIntercept$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIZILJ = this.LLILZIL.LJIIZILJ(null, this);
        C1C7U.LIZIZ("EPSaveFlow@a786.templateIntercept$1");
        return objLJIIZILJ;
    }
}
