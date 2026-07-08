package X;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12LE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LE extends C09AY implements Function0<C12L2> {
    public C12LE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.12L2] */
    @Override // kotlin.jvm.functions.Function0
    public final C12L2 invoke() {
        WindowLayoutComponent windowLayoutComponentLIZ;
        try {
            ClassLoader classLoader = InterfaceC715840S6c.class.getClassLoader();
            if (classLoader != null && (windowLayoutComponentLIZ = new C12LD(classLoader, new C12LH(classLoader)).LIZ()) != null) {
                return new C12L6(windowLayoutComponentLIZ, new C12LH(classLoader)) { // from class: X.12L2
                    public final WindowLayoutComponent LIZ;
                    public final C12LH LIZIZ;
                    public final ReentrantLock LIZJ = new ReentrantLock();
                    public final Map<Context, C12L0> LIZLLL = new LinkedHashMap();
                    public final Map<C092O<C0N9B>, Context> LJ = new LinkedHashMap();
                    public final Map<C12L0, C12L5> LJFF = new LinkedHashMap();
                    public final Map<C12L0, Consumer<WindowLayoutInfo>> LJI = new LinkedHashMap();

                    @Override // X.C12L6
                    public final void LIZ(C092O<C0N9B> c092o) {
                        ReentrantLock reentrantLock = this.LIZJ;
                        reentrantLock.lock();
                        try {
                            Context context = (Context) ((LinkedHashMap) this.LJ).get(c092o);
                            if (context == null) {
                                reentrantLock.unlock();
                                return;
                            }
                            C12L0 c12l0 = (C12L0) ((LinkedHashMap) this.LIZLLL).get(context);
                            if (c12l0 == null) {
                                reentrantLock.unlock();
                                return;
                            }
                            ReentrantLock reentrantLock2 = c12l0.LIZIZ;
                            reentrantLock2.lock();
                            try {
                                c12l0.LIZLLL.remove(c092o);
                                reentrantLock2.unlock();
                                this.LJ.remove(c092o);
                                if (c12l0.LIZLLL.isEmpty()) {
                                    this.LIZLLL.remove(context);
                                    C12L8.LIZ.getClass();
                                    if (C12L8.LIZ() < 2) {
                                        C12L5 c12l5Remove = this.LJFF.remove(c12l0);
                                        if (c12l5Remove != null) {
                                            c12l5Remove.dispose();
                                        }
                                    } else {
                                        Consumer<WindowLayoutInfo> consumerRemove = this.LJI.remove(c12l0);
                                        if (consumerRemove != null) {
                                            this.LIZ.removeWindowLayoutInfoListener(consumerRemove);
                                        }
                                    }
                                }
                                reentrantLock.unlock();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                reentrantLock2.unlock();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            reentrantLock.unlock();
                            throw th2;
                        }
                    }

                    {
                        this.LIZ = windowLayoutComponentLIZ;
                        this.LIZIZ = c12lh;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x001d A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x001d, B:9:0x003b, B:11:0x0044, B:12:0x005a, B:15:0x0068), top: B:22:0x0005 }] */
                    @Override // X.C12L6
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(android.content.Context r7, X.C12L7 r8, X.C12LA r9) {
                        /*
                            r6 = this;
                            java.util.concurrent.locks.ReentrantLock r3 = r6.LIZJ
                            r3.lock()
                            java.util.Map<android.content.Context, X.12L0> r0 = r6.LIZLLL     // Catch: java.lang.Throwable -> L7b
                            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L7b
                            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L7b
                            X.12L0 r0 = (X.C12L0) r0     // Catch: java.lang.Throwable -> L7b
                            if (r0 == 0) goto L1d
                            r0.LIZIZ(r9)     // Catch: java.lang.Throwable -> L7b
                            java.util.Map<X.092O<X.0N9B>, android.content.Context> r0 = r6.LJ     // Catch: java.lang.Throwable -> L7b
                            r0.put(r9, r7)     // Catch: java.lang.Throwable -> L7b
                            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L7b
                            if (r0 != 0) goto L77
                        L1d:
                            X.12L0 r4 = new X.12L0     // Catch: java.lang.Throwable -> L7b
                            r4.<init>(r7)     // Catch: java.lang.Throwable -> L7b
                            java.util.Map<android.content.Context, X.12L0> r0 = r6.LIZLLL     // Catch: java.lang.Throwable -> L7b
                            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L7b
                            java.util.Map<X.092O<X.0N9B>, android.content.Context> r0 = r6.LJ     // Catch: java.lang.Throwable -> L7b
                            r0.put(r9, r7)     // Catch: java.lang.Throwable -> L7b
                            r4.LIZIZ(r9)     // Catch: java.lang.Throwable -> L7b
                            X.12L8 r0 = X.C12L8.LIZ     // Catch: java.lang.Throwable -> L7b
                            r0.getClass()     // Catch: java.lang.Throwable -> L7b
                            int r1 = X.C12L8.LIZ()     // Catch: java.lang.Throwable -> L7b
                            r0 = 2
                            if (r1 >= r0) goto L68
                            X.12L1 r5 = new X.12L1     // Catch: java.lang.Throwable -> L7b
                            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b
                            boolean r0 = r7 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L7b
                            if (r0 == 0) goto L5a
                            X.12LH r2 = r6.LIZIZ     // Catch: java.lang.Throwable -> L7b
                            androidx.window.extensions.layout.WindowLayoutComponent r1 = r6.LIZ     // Catch: java.lang.Throwable -> L7b
                            java.lang.Class<androidx.window.extensions.layout.WindowLayoutInfo> r0 = androidx.window.extensions.layout.WindowLayoutInfo.class
                            X.12Dl r0 = X.C13LE.LIZ(r0)     // Catch: java.lang.Throwable -> L7b
                            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> L7b
                            X.12L4 r1 = r2.LIZ(r1, r0, r7, r5)     // Catch: java.lang.Throwable -> L7b
                            java.util.Map<X.12L0, X.12L5> r0 = r6.LJFF     // Catch: java.lang.Throwable -> L7b
                            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L7b
                            goto L77
                        L5a:
                            androidx.window.extensions.layout.WindowLayoutInfo r1 = new androidx.window.extensions.layout.WindowLayoutInfo     // Catch: java.lang.Throwable -> L7b
                            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L7b
                            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7b
                            r4.accept(r1)     // Catch: java.lang.Throwable -> L7b
                            r3.unlock()
                            return
                        L68:
                            X.12L3 r1 = new X.12L3     // Catch: java.lang.Throwable -> L7b
                            r1.<init>()     // Catch: java.lang.Throwable -> L7b
                            java.util.Map<X.12L0, androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.layout.WindowLayoutInfo>> r0 = r6.LJI     // Catch: java.lang.Throwable -> L7b
                            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L7b
                            androidx.window.extensions.layout.WindowLayoutComponent r0 = r6.LIZ     // Catch: java.lang.Throwable -> L7b
                            r0.addWindowLayoutInfoListener(r7, r1)     // Catch: java.lang.Throwable -> L7b
                        L77:
                            r3.unlock()
                            return
                        L7b:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7b
                            r3.unlock()
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C12L2.LIZIZ(android.content.Context, X.12L7, X.12LA):void");
                    }
                };
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C12LF c12lf = C12LF.LIZ;
        }
        return null;
    }
}
