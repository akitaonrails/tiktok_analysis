package X;

/* JADX INFO: renamed from: X.0cH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.usecase.GetSchemaUseCase", f = "GetSchemaUseCase.kt", l = {28}, m = "invoke$suspendImpl")
public final class C1005590cH7 extends AbstractC23140094w {
    public C1005600cH8 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1005580cH6 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005590cH7(C1005580cH6 c1005580cH6, InterfaceC1364105Vn<? super C1005590cH7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1005580cH6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetSchemaUseCase@5ec9.invoke$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = C1005580cH6.LIZ(this.LLILLL, null, null, null, null, null, this);
        C1C7U.LIZIZ("GetSchemaUseCase@5ec9.invoke$1");
        return objLIZ;
    }
}
