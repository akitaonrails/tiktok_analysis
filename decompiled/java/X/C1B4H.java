package X;

/* JADX INFO: renamed from: X.1B4H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.viewmodel.ShareActionHelper", f = "ShareActionHelper.kt", l = {151}, m = "hasShareScope")
public final class C1B4H extends AbstractC23140094w {
    public C1402840mbq LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1B4B LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4H(C1B4B c1b4b, InterfaceC1364105Vn<? super C1B4H> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1b4b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareActionHelper@b7c.hasShareScope$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("ShareActionHelper@b7c.hasShareScope$1");
        return objLIZIZ;
    }
}
