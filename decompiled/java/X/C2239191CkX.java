package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.bytedance.ies.cutsame.source.TemplateSourceServiceImpl", f = "TemplateSourceService.kt", l = {418, 423, 429}, m = "fetchEffect")
public final class C2239191CkX extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public InterfaceC20343514iv LLILLL;
    public Function1 LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C2239171CkV LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2239191CkX(C2239171CkV c2239171CkV, InterfaceC1364105Vn<? super C2239191CkX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c2239171CkV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TemplateSourceServiceImpl@4504.fetchEffect$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, null, null, null, null, this);
        C1C7U.LIZIZ("TemplateSourceServiceImpl@4504.fetchEffect$1");
        return objLIZLLL;
    }
}
