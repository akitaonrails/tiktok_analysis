package X;

/* JADX INFO: renamed from: X.19HE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.authorize.network.AuthorizeApiImpl", f = "AuthorizeApiImpl.kt", l = {100, 138}, m = "getAuthCode")
public final class C19HE extends AbstractC23140094w {
    public C1B3S LL;
    public C1B3J LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1B3I LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19HE(C1B3I c1b3i, InterfaceC1364105Vn<? super C19HE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1b3i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthorizeApiImpl@56d5.getAuthCode$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, false, this);
        C1C7U.LIZIZ("AuthorizeApiImpl@56d5.getAuthCode$1");
        return objLIZ;
    }
}
