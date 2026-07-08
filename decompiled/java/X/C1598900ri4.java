package X;

/* JADX INFO: renamed from: X.0ri4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.platform.ActiveStatusSkylightFetcher", f = "ActiveStatusSkylightFetcher.kt", l = {162}, m = "pullContactList")
public final class C1598900ri4 extends AbstractC23140094w {
    public InterfaceC897330ZId LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1598840rhy LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598900ri4(C1598840rhy c1598840rhy, InterfaceC1364105Vn<? super C1598900ri4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1598840rhy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActiveStatusSkylightFetcher@76a5.pullContactList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("ActiveStatusSkylightFetcher@76a5.pullContactList$1");
        return objLJ;
    }
}
