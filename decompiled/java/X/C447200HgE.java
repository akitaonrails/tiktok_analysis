package X;

/* JADX INFO: renamed from: X.0HgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.widget.multiImageview.loader.MultiIconLoadHelper", f = "MultiIconLoadHelper.kt", l = {75}, m = "fetchImageUrls")
public final class C447200HgE extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C447180HgC LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447200HgE(C447180HgC c447180HgC, InterfaceC1364105Vn<? super C447200HgE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c447180HgC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiIconLoadHelper@8f7e.fetchImageUrls$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, this);
        C1C7U.LIZIZ("MultiIconLoadHelper@8f7e.fetchImageUrls$1");
        return objLIZ;
    }
}
