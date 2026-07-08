package X;

/* JADX INFO: renamed from: X.0O2R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, 57}, m = "awaitLoad")
public final class C0O2R extends AbstractC23140094w {
    public C0O2Q LL;
    public C0NUU LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0O2Q LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O2R(C0O2Q c0o2q, InterfaceC1364105Vn<? super C0O2R> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0o2q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.LIZIZ(null, this);
    }
}
