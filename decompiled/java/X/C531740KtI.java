package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531740KtI implements InterfaceC532480KuU<Object, Object> {
    public final String LIZ;
    public final CoroutineContext LIZIZ;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<Object>, Object> LIZJ;

    @Override // X.InterfaceC532490KuV
    public final CoroutineContext LJJJLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC532490KuV
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC532480KuU
    public final Object LIZ(Object obj, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return this.LIZJ.invoke(obj, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C531740KtI(String str, CoroutineContext coroutineContext, Function2<Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> function2) {
        this.LIZJ = function2;
        this.LIZ = str;
        this.LIZIZ = coroutineContext;
    }
}
