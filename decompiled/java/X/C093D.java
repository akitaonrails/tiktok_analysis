package X;

/* JADX INFO: renamed from: X.093D, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentImplV2", f = "EffectPrefetcherComponentImplV2.kt", l = {144}, m = "drainQueue")
public final class C093D extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C093F LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C093D(C093F c093f, InterfaceC1364105Vn<? super C093D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c093f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectPrefetcherComponentImplV2@7766.drainQueue$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objX1 = this.LLILLJJLI.X1(this);
        C1C7U.LIZIZ("EffectPrefetcherComponentImplV2@7766.drainQueue$1");
        return objX1;
    }
}
