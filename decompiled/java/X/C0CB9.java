package X;

import java.lang.reflect.Method;
import java.util.Set;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0CB9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CB9 implements C0CB5 {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 201));

    @Override // X.C0CB5
    public final boolean LIZ(Method method) {
        return ((Set) this.LIZ.getValue()).contains(method.getDeclaringClass().getSimpleName());
    }
}
