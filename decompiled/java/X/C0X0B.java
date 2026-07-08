package X;

import android.os.Build;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS142S0400000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS68S0100100_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X0B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0B {
    public static Field LJI;
    public static Field LJII;
    public static Field LJIIIIZZ;
    public static Field LJIIIZ;
    public final HttpURLConnection LIZ;
    public C0X0E LIZIZ;
    public boolean LIZJ;
    public Object LIZLLL;
    public boolean LJ;
    public ByteArrayOutputStream LJFF;

    public final void LIZIZ() throws IllegalAccessException, NoSuchFieldException {
        Field fieldLIZ;
        Object c098200Yq;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        boolean zEquals = this.LIZ.getURL().getProtocol().equals("https");
        Object obj = this.LIZ;
        if (zEquals) {
            Field fieldLIZ2 = LIZ(obj.getClass(), LJI, "delegate");
            LJI = fieldLIZ2;
            obj = fieldLIZ2.get(this.LIZ);
            fieldLIZ = LIZ(obj.getClass(), LJII, "requestHeaders");
            LJII = fieldLIZ;
        } else {
            fieldLIZ = LIZ(obj.getClass(), LJIIIIZZ, "requestHeaders");
            LJIIIIZZ = fieldLIZ;
        }
        Object obj2 = fieldLIZ.get(obj);
        if (obj2 != null) {
            C0X0E c0x0e = new C0X0E(obj2);
            if (C0X0E.LIZIZ == null) {
                try {
                    Class<?> cls = obj2.getClass();
                    C0X0E.LIZIZ = cls.getDeclaredMethod("get", String.class);
                    C0X0E.LIZJ = cls.getDeclaredMethod("add", String.class, String.class);
                    C0X0E.LIZLLL = cls.getDeclaredMethod("removeAll", String.class);
                    C0X0E.LJ = cls.getDeclaredMethod("set", String.class, String.class);
                    C0X0E.LJFF = cls.getDeclaredMethod("build", new Class[0]);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    if (Build.VERSION.SDK_INT == 28) {
                        NetworkComponent.INSTANCE.disableUrlConnectionService$network_release();
                    } else {
                        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                        C0WSW.LIZ("Helios:Network-Service", AFwS200S0000000_13.get$arr$(415), 6, thM5exceptionOrNullimpl);
                    }
                }
            }
            this.LIZIZ = c0x0e;
        }
        this.LIZLLL = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    public final String LIZJ() throws IllegalAccessException, InterruptedException, NoSuchMethodException, InvocationTargetException {
        ByteArrayOutputStream byteArrayOutputStream;
        Object obj;
        Object obj2;
        T t;
        T t2;
        try {
            LIZLLL();
            byteArrayOutputStream = this.LJFF;
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = Build.VERSION.SDK_INT == 28 ? 5 : 6;
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Service", new AwS557S0100000_13(this, 205), i, e);
        }
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toString(C841650Wzz.LIZIZ.name());
        }
        if (!this.LJ && (obj = this.LIZLLL) != null && (obj2 = LIZ(obj.getClass(), null, "httpEngine").get(obj)) != null) {
            this.LJ = true;
            Field fieldLIZ = LIZ(obj2.getClass(), null, "bufferedRequestBody");
            C118300cf c118300cf = new C118300cf();
            NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
            long j = networkConfigNetworkConfigOrNull != null ? networkConfigNetworkConfigOrNull.bodyDelayInterval : 500L;
            C259800zU c259800zU = new C259800zU();
            try {
                t = fieldLIZ.get(obj2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                t = 0;
            }
            c259800zU.element = t;
            while (c259800zU.element == 0 && c118300cf.element < j) {
                Thread.sleep(10L);
                c118300cf.element += 10;
                try {
                    t2 = fieldLIZ.get(obj2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    t2 = 0;
                }
                c259800zU.element = t2;
            }
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Cost", new AwS68S0100100_13(c118300cf, j, 1), 2, null);
            T t3 = c259800zU.element;
            if (t3 == 0) {
                return null;
            }
            Field fieldLIZ2 = LIZ(t3.getClass(), null, "sink");
            C259800zU c259800zU2 = new C259800zU();
            ?? r0 = fieldLIZ2.get(c259800zU.element);
            if (r0 == 0) {
                return null;
            }
            c259800zU2.element = r0;
            if (Intrinsics.LJFF(r0.getClass().getName(), "com.android.okhttp.internal.http.Http1xStream$ChunkedSink")) {
                ?? r02 = LIZ(c259800zU2.element.getClass(), null, "sink").get(c259800zU2.element);
                if (r02 == 0) {
                    return null;
                }
                c259800zU2.element = r02;
                C0WSW.LIZ("Helios:Network-Service", new AwS142S0400000_13(obj, (Object) this, (C0X0B) c259800zU, (C259800zU<Object>) c259800zU2, (C259800zU<Object>) 1), 6, new Throwable());
            }
            Object obj3 = LIZ(c259800zU2.element.getClass(), null, "content").get(c259800zU2.element);
            if (obj3 == null) {
                return null;
            }
            Method declaredMethod = obj3.getClass().getDeclaredMethod("copyTo", OutputStream.class);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            declaredMethod.invoke(obj3, byteArrayOutputStream2);
            this.LJFF = byteArrayOutputStream2;
            return byteArrayOutputStream2.toString(C841650Wzz.LIZIZ.name());
        }
        return null;
    }

    public final void LIZLLL() {
        Object c098200Yq;
        try {
            LIZIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Service", AFwS200S0000000_13.get$arr$(414), 6, thM5exceptionOrNullimpl);
        }
    }

    public C0X0B(HttpURLConnection httpURLConnection) {
        this.LIZ = httpURLConnection;
    }

    public static Field LIZ(Class cls, Field field, String str) throws NoSuchFieldException {
        if (field == null) {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        }
        return field;
    }
}
