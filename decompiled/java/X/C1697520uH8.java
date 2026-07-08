package X;

/* JADX INFO: renamed from: X.0uH8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {100}, m = "bringIntoView")
public final class C1697520uH8 extends AbstractC23140094w {
    public C1683130ttv LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1697510uH7 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697520uH8(C1697510uH7 c1697510uH7, InterfaceC1364105Vn<? super C1697520uH8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1697510uH7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        return this.LLILZLL.LIZ(null, this);
    }
}
