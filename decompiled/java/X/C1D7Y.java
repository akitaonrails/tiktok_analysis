package X;

/* JADX INFO: renamed from: X.1D7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.Loader", f = "Loader.kt", l = {117}, m = "applyCollator")
public final class C1D7Y<D> extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC2250601D7a<Object, Object> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D7Y(AbstractC2250601D7a<Object, Object> abstractC2250601D7a, InterfaceC1364105Vn<? super C1D7Y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = abstractC2250601D7a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Loader@dc36.applyCollator$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this, null);
        C1C7U.LIZIZ("Loader@dc36.applyCollator$1");
        return objLIZ;
    }
}
