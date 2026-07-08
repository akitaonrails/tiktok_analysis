package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XCK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCK {
    public final Object LIZ = new Object();
    public final Object LIZIZ = new Object();
    public final ConcurrentHashMap<Type, C844800XCc> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AbstractC844850XCh, Object> LIZLLL = new ConcurrentHashMap<>();

    public final <Event> void LIZ(final Event event) {
        C844800XCc c844800XCc;
        if (Looper.myLooper() != C824170WUt.LIZLLL(null)) {
            C824170WUt.LJ(new Runnable() { // from class: X.0XBp
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CallbackCenter@e48a.postEvent$1");
                    try {
                        this.LLILLJJLI.LIZ(event);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CallbackCenter@e48a.postEvent$1");
                }
            }, null);
            return;
        }
        synchronized (this.LIZ) {
            try {
                c844800XCc = this.LIZJ.get(event.getClass());
                if (c844800XCc == null) {
                    c844800XCc = new C844800XCc();
                    this.LIZJ.put(event.getClass(), c844800XCc);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c844800XCc.LIZ = event;
        for (InterfaceC845010XCx interfaceC845010XCx : c844800XCc.LIZIZ.keySet()) {
            if (interfaceC845010XCx != null) {
                interfaceC845010XCx.LIZ(event);
            }
        }
    }

    public final void LIZJ(Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                Iterator<AbstractC844850XCh> it2 = this.LIZLLL.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC844850XCh next = it2.next();
                    if (next.LIZ == obj) {
                        LIZJ(next);
                        this.LIZLLL.remove(next);
                        break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <EVENT> void LIZIZ(boolean z, final InterfaceC845010XCx<EVENT> interfaceC845010XCx) {
        final Object obj;
        Type type = ((ParameterizedType) interfaceC845010XCx.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
        synchronized (this.LIZ) {
            try {
                final C844800XCc c844800XCc = this.LIZJ.get(type);
                if (c844800XCc == null) {
                    c844800XCc = new C844800XCc();
                    this.LIZJ.put(type, c844800XCc);
                }
                c844800XCc.LIZIZ.put(interfaceC845010XCx, this.LIZIZ);
                this.LIZLLL.put((AbstractC844850XCh) interfaceC845010XCx, this.LIZIZ);
                if (z && (obj = c844800XCc.LIZ) != null) {
                    C824170WUt.LJ(new Runnable() { // from class: X.0XCN
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
                        
                            r2.LIZ(r3);
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r4 = this;
                                java.lang.String r3 = "CallbackCenter@e48a.callbackWhenRegister$1"
                                X.C1C7U.LIZ(r3)
                                X.0XCc r0 = r1     // Catch: java.lang.Throwable -> L27
                                java.util.concurrent.ConcurrentHashMap<X.0XCx, java.lang.Object> r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L27
                                java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L27
                                java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L27
                            L11:
                                boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L27
                                if (r0 == 0) goto L32
                                X.0XCx r1 = r2     // Catch: java.lang.Throwable -> L27
                                java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L27
                                if (r1 != r0) goto L11
                                X.0XCx r1 = r2     // Catch: java.lang.Throwable -> L27
                                java.lang.Object r0 = r3     // Catch: java.lang.Throwable -> L27
                                r1.LIZ(r0)     // Catch: java.lang.Throwable -> L27
                                goto L32
                            L27:
                                r1 = move-exception
                                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                                boolean r0 = X.C2179971ATj.LIZ(r1)
                                if (r0 != 0) goto L32
                                throw r1
                            L32:
                                X.C1C7U.LIZIZ(r3)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0XCN.run():void");
                        }
                    }, null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
