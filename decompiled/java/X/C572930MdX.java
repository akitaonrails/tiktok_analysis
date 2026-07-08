package X;

/* JADX INFO: renamed from: X.0MdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageTaskNetworkApi", f = "Text2ImageNetworkApi.kt", l = {54}, m = "submit")
public final class C572930MdX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C572890MdT LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C572930MdX(C572890MdT c572890MdT, InterfaceC1364105Vn<? super C572930MdX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c572890MdT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageTaskNetworkApi@7913.submit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, false, this);
        C1C7U.LIZIZ("Text2ImageTaskNetworkApi@7913.submit$1");
        return objLIZLLL;
    }
}
