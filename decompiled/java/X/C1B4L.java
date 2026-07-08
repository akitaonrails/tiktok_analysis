package X;

/* JADX INFO: renamed from: X.1B4L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.viewmodel.ShareActionHelper", f = "ShareActionHelper.kt", l = {235}, m = "getShareScope")
public final class C1B4L extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1B4B LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4L(C1B4B c1b4b, InterfaceC1364105Vn<? super C1B4L> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1b4b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("ShareActionHelper@b7c.getShareScope$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, null, null, this);
        C1C7U.LIZIZ("ShareActionHelper@b7c.getShareScope$1");
        return objLIZ;
    }
}
