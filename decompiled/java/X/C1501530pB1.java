package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0pB1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501530pB1 extends AbstractC1501480pAw {
    public final Executor LIZ;

    public C1501530pB1(Executor executor) {
        this.LIZ = executor;
    }

    @Override // X.AbstractC1501480pAw
    public final InterfaceC1501470pAv LIZ(Type type, Annotation[] annotationArr) {
        final Executor executor = null;
        if (C1502190pC5.LJFF(type) != InterfaceC1501750pBN.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type typeLJ = C1502190pC5.LJ(0, (ParameterizedType) type);
            if (!C1502190pC5.LJIIIIZZ(annotationArr, InterfaceC1297370jrj.class)) {
                executor = this.LIZ;
            }
            return new InterfaceC1501470pAv<Object, InterfaceC1501750pBN<?>>() { // from class: X.0pB2
                @Override // X.InterfaceC1501470pAv
                public final Type LIZ() {
                    return typeLJ;
                }

                @Override // X.InterfaceC1501470pAv
                public final Object LIZIZ(C1500200p8s c1500200p8s) {
                    Executor executor2 = executor;
                    if (executor2 != null) {
                        return new C1501740pBM(executor2, c1500200p8s);
                    }
                    return c1500200p8s;
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
