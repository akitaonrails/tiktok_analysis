package X;

/* JADX INFO: renamed from: X.1AyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.tasks.MinisPreDownloadFPTask", f = "MinisPreDownloadFPTask.kt", l = {32, 47}, m = "execute")
public final class C2196831AyP extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2196811AyN LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2196831AyP(C2196811AyN c2196811AyN, InterfaceC1364105Vn<? super C2196831AyP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c2196811AyN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisPreDownloadFPTask@582d.execute$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("MinisPreDownloadFPTask@582d.execute$1");
        return objLIZ;
    }
}
