package X;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.07oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1974107oJ {
    public final Method LIZ;
    public final List<?> LIZIZ;

    public final String toString() {
        return C786410Ut5.j4("%s.%s() %s", new Object[]{this.LIZ.getDeclaringClass().getName(), this.LIZ.getName(), this.LIZIZ});
    }

    public C1974107oJ(Method method, List<?> list) {
        this.LIZ = method;
        this.LIZIZ = Collections.unmodifiableList(list);
    }
}
