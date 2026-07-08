package X;

/* JADX INFO: renamed from: X.0ybo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.internal.net.MessageRemote", f = "MessageRemote.kt", l = {321, 323}, m = "fetchNewMessage")
public final class C1864100ybo extends AbstractC23140094w {
    public Object LL;
    public C1863980ybc LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1863980ybc LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864100ybo(C1863980ybc c1863980ybc, InterfaceC1364105Vn<? super C1864100ybo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1863980ybc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRemote@c2f6.fetchNewMessage$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILZ.LJIIJ(0L, null, 0, this);
        C1C7U.LIZIZ("MessageRemote@c2f6.fetchNewMessage$1");
        return objLJIIJ;
    }
}
