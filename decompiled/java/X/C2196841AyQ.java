package X;

/* JADX INFO: renamed from: X.1AyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.tasks.MinisPreloadMetaTask", f = "MinisPreloadMetaTask.kt", l = {21}, m = "execute")
public final class C2196841AyQ extends AbstractC23140094w {
    public C2390309Yf LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2196821AyO LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2196841AyQ(C2196821AyO c2196821AyO, InterfaceC1364105Vn<? super C2196841AyQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c2196821AyO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisPreloadMetaTask@6438.execute$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("MinisPreloadMetaTask@6438.execute$1");
        return objLIZ;
    }
}
