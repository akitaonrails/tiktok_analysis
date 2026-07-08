package X;

/* JADX INFO: renamed from: X.0XwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher", f = "DefaultRemoteFetcher.kt", l = {445}, m = "sendHttpBridge$core_release")
public final class C864820XwG extends AbstractC23140094w {
    public C0YCX LL;
    public C0YIS LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0YI6 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864820XwG(C0YI6 c0yi6, InterfaceC1364105Vn<? super C864820XwG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0yi6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C0Y8K {
        C1C7U.LIZ("DefaultRemoteFetcher@8679.sendHttpBridge$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(null, null, this);
        C1C7U.LIZIZ("DefaultRemoteFetcher@8679.sendHttpBridge$1");
        return objLIZLLL;
    }
}
