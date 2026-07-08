package X;

import com.bytedance.retrofit2.Retrofit;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.09a0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2395009a0 extends C09S8 {
    public final Executor LIZ;

    public C2395009a0(Executor executor) {
        this.LIZ = executor;
    }

    @Override // X.C09S8
    public final C09SJ<?, ?> LIZ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        final Executor executor = null;
        if (C2396109aB.LJFF(type) != C0X9S.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type typeLJ = C2396109aB.LJ(0, (ParameterizedType) type);
            if (!C2396109aB.LJIIIIZZ(annotationArr, InterfaceC2394909Zz.class)) {
                executor = this.LIZ;
            }
            return new C09SJ<Object, C0X9S<?>>() { // from class: X.09a1
                @Override // X.C09SJ
                public final Type LIZ() {
                    return typeLJ;
                }

                @Override // X.C09SJ
                public final C0X9S<?> LIZIZ(C0X9S<Object> c0x9s) {
                    Executor executor2 = executor;
                    if (executor2 != null) {
                        return new C1500780p9o(executor2, c0x9s);
                    }
                    return c0x9s;
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
