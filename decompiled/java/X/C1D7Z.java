package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1D7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.Loader", f = "Loader.kt", l = {110}, m = "applyFilter")
public final class C1D7Z<D> extends AbstractC23140094w {
    public Function2 LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AbstractC2250601D7a<Object, Object> LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D7Z(AbstractC2250601D7a<Object, Object> abstractC2250601D7a, InterfaceC1364105Vn<? super C1D7Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = abstractC2250601D7a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Loader@dc36.applyFilter$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(null, this, null);
        C1C7U.LIZIZ("Loader@dc36.applyFilter$1");
        return objLIZIZ;
    }
}
