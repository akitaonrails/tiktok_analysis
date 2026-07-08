package X;

import com.bytedance.android.livesdk.model.message.DispersionInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.network.NetworkHelper", f = "NetworkHelper.kt", l = {96, 128}, m = "requestSR")
public final class C598390NdV<T> extends AbstractC23140094w {
    public InterfaceC497601wk LL;
    public Object LLILLJJLI;
    public DispersionInfo LLILLL;
    public Function1 LLILZ;
    public Function2 LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C598360NdS LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598390NdV(C598360NdS c598360NdS, InterfaceC1364105Vn<? super C598390NdV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c598360NdS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NetworkHelper@106c.requestSR$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLIZ.LJIIIIZZ(null, null, null, null, null, this);
        C1C7U.LIZIZ("NetworkHelper@106c.requestSR$1");
        return objLJIIIIZZ;
    }
}
