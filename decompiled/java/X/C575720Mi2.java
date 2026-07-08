package X;

/* JADX INFO: renamed from: X.0Mi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creative.tangram.workflow.ParseModelTask", f = "ParseModelTask.kt", l = {138}, m = "schedule")
public final class C575720Mi2 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C575640Mhu LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C575720Mi2(C575640Mhu c575640Mhu, InterfaceC1364105Vn<? super C575720Mi2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c575640Mhu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ParseModelTask@a58a.schedule$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(null, null, null, this);
        C1C7U.LIZIZ("ParseModelTask@a58a.schedule$1");
        return objLJIIIIZZ;
    }
}
