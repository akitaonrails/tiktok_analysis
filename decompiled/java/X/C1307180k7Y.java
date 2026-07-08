package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k7Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.trace.tracer.TracerExtKt", f = "TracerExt.kt", l = {23, 28}, m = "trace")
public final class C1307180k7Y<R> extends AbstractC23140094w {
    public Task LL;
    public Function1 LLILLJJLI;
    public InterfaceC1307160k7W LLILLL;
    public /* synthetic */ Object LLILZ;
    public int LLILZIL;

    public C1307180k7Y(InterfaceC1364105Vn<? super C1307180k7Y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TracerExtKt@9ef8.trace$1");
        this.LLILZ = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = C1307170k7X.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("TracerExtKt@9ef8.trace$1");
        return objLIZIZ;
    }
}
