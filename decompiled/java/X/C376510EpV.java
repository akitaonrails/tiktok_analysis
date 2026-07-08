package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.topbar.save.EPSaveFlow", f = "EPSaveFlow.kt", l = {401}, m = "saveAndLeave")
public final class C376510EpV extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Function2 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C376460EpQ LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C376510EpV(C376460EpQ c376460EpQ, InterfaceC1364105Vn<? super C376510EpV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c376460EpQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPSaveFlow@a786.saveAndLeave$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILZIL.LJIILIIL(null, null, this, null);
        C1C7U.LIZIZ("EPSaveFlow@a786.saveAndLeave$1");
        return objLJIILIIL;
    }
}
