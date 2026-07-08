package X;

import android.os.Build;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0pB3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1501550pB3 {
    public static final C1501550pB3 LIZ;

    public Executor LIZIZ() {
        return null;
    }

    public int LIZLLL() {
        return 0;
    }

    public boolean LJFF(Method method) {
        return false;
    }

    static {
        C1501550pB3 c1501550pB3;
        try {
            Class.forName("android.os.Build");
            c1501550pB3 = new C1501550pB3() { // from class: X.0pB5
                @Override // X.C1501550pB3
                public final Executor LIZIZ() {
                    return new Executor() { // from class: X.07zk
                        public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            C786410Ut5.LJJZZIII(this.LL, runnable);
                        }
                    };
                }

                @Override // X.C1501550pB3
                public final List<? extends AbstractC1501440pAs> LIZJ() {
                    return Build.VERSION.SDK_INT >= 24 ? Collections.singletonList(C1501500pAy.LIZ) : Collections.emptyList();
                }

                @Override // X.C1501550pB3
                public final int LIZLLL() {
                    return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
                }

                @Override // X.C1501550pB3
                public final List<? extends AbstractC1501480pAw> LIZ(Executor executor) {
                    if (executor != null) {
                        C1501530pB1 c1501530pB1 = new C1501530pB1(executor);
                        if (Build.VERSION.SDK_INT >= 24) {
                            return Arrays.asList(C1501580pB6.LIZ, c1501530pB1);
                        }
                        return Collections.singletonList(c1501530pB1);
                    }
                    throw new AssertionError();
                }

                @Override // X.C1501550pB3
                public final boolean LJFF(Method method) {
                    if (Build.VERSION.SDK_INT < 24) {
                        return false;
                    }
                    return method.isDefault();
                }
            };
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                Class.forName("java.util.Optional");
                c1501550pB3 = new C1501550pB3() { // from class: X.0pB4
                    @Override // X.C1501550pB3
                    public final int LIZLLL() {
                        return 1;
                    }

                    @Override // X.C1501550pB3
                    public final List<? extends AbstractC1501440pAs> LIZJ() {
                        return Collections.singletonList(C1501500pAy.LIZ);
                    }

                    @Override // X.C1501550pB3
                    public final List<? extends AbstractC1501480pAw> LIZ(Executor executor) {
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(C1501580pB6.LIZ);
                        arrayList.add(new C1501530pB1(executor));
                        return Collections.unmodifiableList(arrayList);
                    }

                    @Override // X.C1501550pB3
                    public final boolean LJFF(Method method) {
                        return method.isDefault();
                    }

                    @Override // X.C1501550pB3
                    public final Object LJ(Method method, Class<?> cls, Object obj, Object... objArr) throws NoSuchMethodException {
                        Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                        declaredConstructor.setAccessible(true);
                        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
                    }
                };
            } catch (ClassNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
                c1501550pB3 = new C1501550pB3();
            }
        }
        LIZ = c1501550pB3;
    }

    public List<? extends AbstractC1501440pAs> LIZJ() {
        return Collections.emptyList();
    }

    public List<? extends AbstractC1501480pAw> LIZ(Executor executor) {
        return Collections.singletonList(new C1501530pB1(executor));
    }

    public Object LJ(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }
}
