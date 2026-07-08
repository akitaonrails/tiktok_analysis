package X;

/* JADX INFO: renamed from: X.0D7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.TokenGenerator", f = "TokenGenerator.kt", l = {60}, m = "getToken")
public final class C334100D7w extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C334070D7t LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334100D7w(C334070D7t c334070D7t, InterfaceC1364105Vn<? super C334100D7w> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c334070D7t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TokenGenerator@937f.getToken$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("TokenGenerator@937f.getToken$1");
        return objLIZIZ;
    }
}
