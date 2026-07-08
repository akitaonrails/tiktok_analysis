package X;

/* JADX INFO: renamed from: X.0yc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.internal.net.MessageRemote", f = "MessageRemote.kt", l = {163}, m = "fetchBotSetting")
public final class C1864230yc1 extends AbstractC23140094w {
    public C1863980ybc LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1863980ybc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864230yc1(C1863980ybc c1863980ybc, InterfaceC1364105Vn<? super C1864230yc1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1863980ybc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRemote@c2f6.fetchBotSetting$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(false, this);
        C1C7U.LIZIZ("MessageRemote@c2f6.fetchBotSetting$1");
        return objLJFF;
    }
}
