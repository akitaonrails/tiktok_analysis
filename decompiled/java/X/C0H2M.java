package X;

/* JADX INFO: renamed from: X.0H2M, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.EmptyElementDisplayStrategy$Companion", f = "EmptyElementDisplayStrategy.kt", l = {61, 71}, m = "getEmptyPlaceholder")
public final class C0H2M extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0H2N LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2M(C0H2N c0h2n, InterfaceC1364105Vn<? super C0H2M> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0h2n;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmptyElementDisplayStrategy$Companion@96f6.getEmptyPlaceholder$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("EmptyElementDisplayStrategy$Companion@96f6.getEmptyPlaceholder$1");
        return objLIZ;
    }
}
