package X;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0WAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818880WAk {
    public static final Object LJIIIZ = new Object();
    public static final ExecutorC2424009eg LJIIJ = new Executor() { // from class: X.09eg
        public static final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C786410Ut5.LJJZZIII(LL, runnable);
        }
    };
    public static final C830490Whz LJIIJJI = new C830490Whz();
    public final Context LIZ;
    public final String LIZIZ;
    public final C0W3K LIZJ;
    public final C818970WAt LIZLLL;
    public final AtomicBoolean LJ;
    public final AtomicBoolean LJFF;
    public final C818870WAj<C795430VIf> LJI;
    public final InterfaceC812380Vts<C0W4C> LJII;
    public final List<C0WB0> LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static C818880WAk LIZIZ() {
        C818880WAk c818880WAk;
        synchronized (LJIIIZ) {
            try {
                c818880WAk = (C818880WAk) LJIIJJI.get("[DEFAULT]");
                if (c818880WAk == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Default FirebaseApp is not initialized in this process ");
                    sbLIZ.append(C0W4K.LIZ());
                    sbLIZ.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c818880WAk;
    }

    public final void LIZ() {
        C0W3J.LJIIJ("FirebaseApp was deleted", !this.LJFF.get());
    }

    public final void LIZLLL() throws Exception {
        Context context = this.LIZ;
        if (Build.VERSION.SDK_INT < 24 || !(!C0W4B.LIZ(context))) {
            C818970WAt c818970WAt = this.LIZLLL;
            LIZ();
            c818970WAt.LJI("[DEFAULT]".equals(this.LIZIZ));
            this.LJII.get().LIZJ();
            return;
        }
        Context context2 = this.LIZ;
        AtomicReference<C818890WAl> atomicReference = C818890WAl.LIZIZ;
        if (atomicReference.get() == null) {
            C818890WAl c818890WAl = new C818890WAl(context2);
            while (!atomicReference.compareAndSet(null, c818890WAl)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            C786410Ut5.LJIJJ(context2, c818890WAl, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LIZIZ, "name");
        c0w3l.LIZ(this.LIZJ, "options");
        return c0w3l.toString();
    }

    public final String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        LIZ();
        sbLIZ.append(C818940WAq.LIZ(this.LIZIZ.getBytes(Charset.defaultCharset())));
        sbLIZ.append("+");
        LIZ();
        sbLIZ.append(C818940WAq.LIZ(this.LIZJ.LIZIZ.getBytes(Charset.defaultCharset())));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJI() {
        boolean z;
        LIZ();
        C795430VIf c795430VIf = this.LJI.get();
        synchronized (c795430VIf) {
            z = c795430VIf.LIZIZ;
        }
        return z;
    }

    public static void LJFF(Context context) {
        synchronized (LJIIIZ) {
            try {
                if (LJIIJJI.containsKey("[DEFAULT]")) {
                    LIZIZ();
                    return;
                }
                C0W3K c0w3kLIZ = C0W3K.LIZ(context);
                if (c0w3kLIZ == null) {
                    return;
                }
                LJ(context, c0w3kLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C818880WAk)) {
            return false;
        }
        String str = this.LIZIZ;
        C818880WAk c818880WAk = (C818880WAk) obj;
        c818880WAk.LIZ();
        return str.equals(c818880WAk.LIZIZ);
    }

    public static C818880WAk LJ(Context context, C0W3K c0w3k) throws Exception {
        C818880WAk c818880WAk;
        if (C786410Ut5.N3(context) instanceof Application) {
            Application application = (Application) C786410Ut5.N3(context);
            AtomicReference<C818910WAn> atomicReference = C818910WAn.LIZ;
            if (atomicReference.get() == null) {
                C818910WAn c818910WAn = new C818910WAn();
                while (true) {
                    if (atomicReference.compareAndSet(null, c818910WAn)) {
                        ComponentCallbacks2C818900WAm.LIZJ(application);
                        ComponentCallbacks2C818900WAm.LLILZIL.LIZ(c818910WAn);
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
            }
        }
        if (C786410Ut5.N3(context) != null) {
            context = C786410Ut5.N3(context);
        }
        synchronized (LJIIIZ) {
            try {
                C830490Whz c830490Whz = LJIIJJI;
                boolean zContainsKey = true ^ c830490Whz.containsKey("[DEFAULT]");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FirebaseApp name ");
                sbLIZ.append("[DEFAULT]");
                sbLIZ.append(" already exists!");
                C0W3J.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), zContainsKey);
                C0W3J.LJIIIZ(context, "Application context cannot be null.");
                c818880WAk = new C818880WAk(context, c0w3k, "[DEFAULT]");
                c830490Whz.put("[DEFAULT]", c818880WAk);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c818880WAk.LIZLLL();
        return c818880WAk;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0WAu] */
    public C818880WAk(final Context context, C0W3K c0w3k, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LJ = atomicBoolean;
        this.LJFF = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LJIIIIZZ = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.LIZ = context;
        C0W3J.LJI(str);
        this.LIZIZ = str;
        this.LIZJ = c0w3k;
        final C819000WAw c819000WAw = new C819000WAw(ComponentDiscoveryService.class);
        List<InterfaceC812380Vts<ComponentRegistrar>> listLIZ = new Object(context, c819000WAw) { // from class: X.0WAu
            public final T LIZ;
            public final InterfaceC819030WAz<T> LIZIZ;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
            public final List<InterfaceC812380Vts<ComponentRegistrar>> LIZ() {
                ?? arrayList;
                Object obj;
                PackageManager packageManager;
                ServiceInfo serviceInfo;
                ArrayList arrayList2 = new ArrayList();
                InterfaceC819030WAz<T> interfaceC819030WAz = this.LIZIZ;
                T t = this.LIZ;
                C819000WAw c819000WAw2 = (C819000WAw) interfaceC819030WAz;
                c819000WAw2.getClass();
                Context context2 = (Context) t;
                try {
                    packageManager = context2.getPackageManager();
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                Bundle bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context2, c819000WAw2.LIZ), 128)) == null) ? null : serviceInfo.metaData;
                if (bundle == null) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                    for (String str2 : bundle.keySet()) {
                        try {
                            obj = bundle.get(str2);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj = null;
                        } catch (OutOfMemoryError e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            obj = null;
                        }
                        if ("com.google.firebase.components.ComponentRegistrar".equals(obj) && str2.startsWith("com.google.firebase.components:")) {
                            arrayList.add(str2.substring(31));
                        }
                    }
                }
                for (final String str3 : arrayList) {
                    arrayList2.add(new InterfaceC812380Vts() { // from class: X.0WAv
                        @Override // X.InterfaceC812380Vts
                        public final Object get() {
                            String str4 = str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                }
                                throw new C819010WAx(C786410Ut5.j4("Class %s is not an instance of %s", new Object[]{str4, "com.google.firebase.components.ComponentRegistrar"}));
                            } catch (ClassNotFoundException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                return null;
                            } catch (IllegalAccessException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                throw new C819010WAx(C786410Ut5.j4("Could not instantiate %s.", new Object[]{str4}), e5);
                            } catch (InstantiationException e6) {
                                TryCatchGuardChecker.doCheck(e6);
                                throw new C819010WAx(C786410Ut5.j4("Could not instantiate %s.", new Object[]{str4}), e6);
                            } catch (NoSuchMethodException e7) {
                                TryCatchGuardChecker.doCheck(e7);
                                throw new C819010WAx(C786410Ut5.j4("Could not instantiate %s", new Object[]{str4}), e7);
                            } catch (InvocationTargetException e8) {
                                TryCatchGuardChecker.doCheck(e8);
                                throw new C819010WAx(C786410Ut5.j4("Could not instantiate %s", new Object[]{str4}), e8);
                            }
                        }
                    });
                }
                return arrayList2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = context;
                this.LIZIZ = c819000WAw;
            }
        }.LIZ();
        C818920WAo c818920WAo = new C818920WAo(LJIIJ);
        ((ArrayList) c818920WAo.LIZIZ).addAll(listLIZ);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        ((ArrayList) c818920WAo.LIZIZ).add(new InterfaceC812380Vts() { // from class: X.0WAr
            @Override // X.InterfaceC812380Vts
            public final Object get() {
                return firebaseCommonRegistrar;
            }
        });
        ((ArrayList) c818920WAo.LIZJ).add(C0WBP.LIZIZ(context, Context.class, new Class[0]));
        ((ArrayList) c818920WAo.LIZJ).add(C0WBP.LIZIZ(this, C818880WAk.class, new Class[0]));
        ((ArrayList) c818920WAo.LIZJ).add(C0WBP.LIZIZ(c0w3k, C0W3K.class, new Class[0]));
        C818970WAt c818970WAt = new C818970WAt(c818920WAo.LIZ, c818920WAo.LIZIZ, c818920WAo.LIZJ, c818920WAo.LIZLLL);
        this.LIZLLL = c818970WAt;
        this.LJI = new C818870WAj<>(new InterfaceC812380Vts() { // from class: X.0Vrm
            @Override // X.InterfaceC812380Vts
            public final Object get() {
                C818880WAk c818880WAk = this.LIZ;
                Context context2 = context;
                c818880WAk.getClass();
                return new C795430VIf(context2, c818880WAk.LIZJ(), (InterfaceC795440VIg) c818880WAk.LIZLLL.LIZIZ(InterfaceC795440VIg.class));
            }
        });
        this.LJII = c818970WAt.LIZJ(C0W4C.class);
        C0WB0 c0wb0 = new C0WB0() { // from class: X.0WAp
            @Override // X.C0WB0
            public final void LIZ(boolean z) {
                C818880WAk c818880WAk = this.LIZ;
                if (!z) {
                    c818880WAk.LJII.get().LIZJ();
                } else {
                    c818880WAk.getClass();
                }
            }
        };
        LIZ();
        if (atomicBoolean.get() && ComponentCallbacks2C818900WAm.LLILZIL.LL.get()) {
            c0wb0.LIZ(true);
        }
        copyOnWriteArrayList.add(c0wb0);
    }
}
