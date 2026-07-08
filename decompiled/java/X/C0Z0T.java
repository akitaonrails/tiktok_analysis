package X;

/* JADX INFO: renamed from: X.0Z0T, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ml.tars.scene.TarsSceneInstImpl", f = "TarsSceneInstImpl.kt", l = {249}, m = "inferenceBatchByCoroutine")
public final class C0Z0T extends AbstractC23140094w {
    public InterfaceC892690Z0h LL;
    public C882890YkJ LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0Z0K LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z0T(C0Z0K c0z0k, InterfaceC1364105Vn<? super C0Z0T> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0z0k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TarsSceneInstImpl@b88c.inferenceBatchByCoroutine$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZ.LJ(null, null, this);
        C1C7U.LIZIZ("TarsSceneInstImpl@b88c.inferenceBatchByCoroutine$1");
        return objLJ;
    }
}
