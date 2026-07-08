package X;

/* JADX INFO: renamed from: X.0HTC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.network.SafeMixStudioNetworkAPIImpl", f = "SafeMixStudioNetworkAPIImpl.kt", l = {54}, m = "generate")
public final class C0HTC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0HT4 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HTC(C0HT4 c0ht4, InterfaceC1364105Vn<? super C0HTC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ht4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeMixStudioNetworkAPIImpl@daff.generate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objGenerate = this.LLILLJJLI.generate(null, this);
        C1C7U.LIZIZ("SafeMixStudioNetworkAPIImpl@daff.generate$1");
        return objGenerate;
    }
}
