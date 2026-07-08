package X;

/* JADX INFO: renamed from: X.0NUA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {314}, m = "loadWithTimeoutOrNull$ui_text_release")
public final class C0NUA extends AbstractC23140094w {
    public C0NUU LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NUC LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NUA(C0NUC c0nuc, InterfaceC1364105Vn<? super C0NUA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0nuc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LJIILIIL(null, this);
    }
}
