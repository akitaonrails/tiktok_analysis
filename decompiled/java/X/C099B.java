package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.099B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {104}, m = "withTimeoutOrNull")
public final class C099B<T> extends AbstractC23140094w {
    public Function2 LL;
    public C259800zU LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public int LLILZ;

    public C099B(InterfaceC1364105Vn<? super C099B> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return C099A.LIZJ(0L, null, this);
    }
}
