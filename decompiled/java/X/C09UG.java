package X;

import com.bytedance.retrofit2.Retrofit;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.09UG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UG extends C09S8 {
    @Override // X.C09S8
    public final C09SJ<?, ?> LIZ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (retrofit != null) {
            final C09SJ<?, ?> c09sjLIZIZ = retrofit.LIZIZ(this, type, annotationArr);
            return new C09SJ<R, T>(c09sjLIZIZ) { // from class: X.09UF
                public final C09SJ<R, T> LIZ;

                @Override // X.C09SJ
                public final Type LIZ() {
                    return this.LIZ.LIZ();
                }

                {
                    this.LIZ = c09sjLIZIZ;
                }

                @Override // X.C09SJ
                public final T LIZIZ(C0X9S<R> c0x9s) {
                    return this.LIZ.LIZIZ(new C1516250pYl(c0x9s));
                }
            };
        }
        return null;
    }
}
