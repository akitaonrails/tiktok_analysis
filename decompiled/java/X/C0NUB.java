package X;

/* JADX INFO: renamed from: X.0NUB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {281, 295}, m = "load")
public final class C0NUB extends AbstractC23140094w {
    public C0NUC LL;
    public Object LLILLJJLI;
    public C0NUU LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0NUC LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NUB(C0NUC c0nuc, InterfaceC1364105Vn<? super C0NUB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c0nuc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        return this.LLIZ.LJIIL(this);
    }
}
