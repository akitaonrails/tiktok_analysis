package X;

import android.os.Build;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.09a3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2395309a3 {
    public static final C2395309a3 LIZ;
    public static final boolean LIZIZ;

    public Executor LIZIZ() {
        return null;
    }

    public void LIZLLL() {
    }

    public boolean LJ(Method method) {
        return false;
    }

    static {
        C2395309a3 c2395309a3;
        boolean z;
        try {
            Class.forName("android.os.Build");
            c2395309a3 = new C2395309a3() { // from class: X.09a2
                @Override // X.C2395309a3
                public final void LIZLLL() {
                }

                @Override // X.C2395309a3
                public final Executor LIZIZ() {
                    return new Executor() { // from class: X.07zj
                        public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            C786410Ut5.LJJZZIII(this.LL, runnable);
                        }
                    };
                }

                @Override // X.C2395309a3
                public final List<? extends AbstractC2343909Gj> LIZJ() {
                    return Collections.emptyList();
                }

                @Override // X.C2395309a3
                public final List<? extends C09S8> LIZ(Executor executor) {
                    if (executor != null) {
                        return Collections.singletonList(new C2395009a0(executor));
                    }
                    throw new AssertionError();
                }

                @Override // X.C2395309a3
                public final boolean LJ(Method method) {
                    if (Build.VERSION.SDK_INT < 24) {
                        return false;
                    }
                    return method.isDefault();
                }
            };
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            c2395309a3 = new C2395309a3();
        }
        LIZ = c2395309a3;
        try {
            new C1501920pBe();
            z = true;
        } catch (NoClassDefFoundError e2) {
            TryCatchGuardChecker.doCheck(e2);
            z = false;
        }
        LIZIZ = z;
    }

    public List<? extends AbstractC2343909Gj> LIZJ() {
        return Collections.emptyList();
    }

    public List<? extends C09S8> LIZ(Executor executor) {
        if (executor != null) {
            return Collections.singletonList(new C2395009a0(executor));
        }
        return Collections.singletonList(new C09S8() { // from class: X.09Ue
            @Override // X.C09S8
            public final C09SJ<?, ?> LIZ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
                if (C2396109aB.LJFF(type) != C0X9S.class) {
                    return null;
                }
                if (type instanceof ParameterizedType) {
                    final Type typeLJ = C2396109aB.LJ(0, (ParameterizedType) type);
                    return new C09SJ<Object, C0X9S<?>>() { // from class: X.09Uf
                        @Override // X.C09SJ
                        public final C0X9S<?> LIZIZ(C0X9S<Object> c0x9s) {
                            return c0x9s;
                        }

                        @Override // X.C09SJ
                        public final Type LIZ() {
                            return typeLJ;
                        }
                    };
                }
                throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
            }
        });
    }
}
