package X;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1153504fF<T> implements InterfaceC1153404fE {
    public final Class<T> LIZ;
    public final Function1<Class<?>, String> LIZIZ;

    @Override // X.InterfaceC1153404fE
    public final void LIZ(List<? extends Type> list) {
        Class<?> cls;
        for (Type type : list) {
            if ((type instanceof Class) && (cls = (Class) type) != null && this.LIZ.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(this.LIZIZ.invoke(cls));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1153504fF(Class<T> cls, Function1<? super Class<?>, String> function1) {
        this.LIZ = cls;
        this.LIZIZ = function1;
    }
}
