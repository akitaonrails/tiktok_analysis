package X;

import com.bytedance.retrofit2.R;
import com.bytedance.retrofit2.Retrofit;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09SM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09SM extends C09S8 {
    public C09SM(int i) {
    }

    @Override // X.C09S8
    public final C09SJ<?, ?> LIZ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (!Intrinsics.LJFF(AnonymousClass0957.class, C2396109aB.LJFF(type))) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type typeLJ = C2396109aB.LJ(0, (ParameterizedType) type);
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof C09SO) {
                    arrayList.add(annotation);
                }
            }
            final C09SO c09so = (C09SO) C13LP.LJJJLL(arrayList);
            return new C09SJ<R, AnonymousClass0957<? extends R>>(typeLJ, c09so) { // from class: X.09SN
                public final Type LIZ;
                public final C09SO LIZIZ;

                @Override // X.C09SJ
                public final Type LIZ() {
                    return this.LIZ;
                }

                @Override // X.C09SJ
                public final AnonymousClass0957<? extends R> LIZIZ(C0X9S<R> c0x9s) {
                    if (this.LIZIZ != null) {
                        C09UB.LIZ(c0x9s.request(), this.LIZIZ.value(), this.LIZIZ.settingKey());
                    }
                    C099F c099fLIZIZ = C090F.LIZIZ();
                    c099fLIZIZ.LJII(new AwS369S0200000_3(c099fLIZIZ, c0x9s, 19));
                    c0x9s.enqueue(new C2501609rC(c099fLIZIZ, 7));
                    return c099fLIZIZ;
                }

                {
                    this.LIZ = typeLJ;
                    this.LIZIZ = c09so;
                }
            };
        }
        throw new IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
    }
}
