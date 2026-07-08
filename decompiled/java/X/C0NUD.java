package X;

/* JADX INFO: renamed from: X.0NUD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {412}, m = "runCached")
public final class C0NUD extends AbstractC23140094w {
    public C0NUF LL;
    public C0NUE LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0NUF LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NUD(C0NUF c0nuf, InterfaceC1364105Vn<? super C0NUD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0nuf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return this.LLILZIL.LIZJ(null, null, null, this);
    }
}
