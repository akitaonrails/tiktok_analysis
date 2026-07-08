package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19499211Qo<T, R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<T> {
    public static final long serialVersionUID = -4823716997131257941L;
    public final C19498811Qk<T, R> LL;
    public final int LLILLJJLI;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // X.InterfaceC626120Oh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComplete() throws java.lang.Throwable {
        /*
            r6 = this;
            X.11Qk<T, R> r5 = r6.LL
            int r0 = r6.LLILLJJLI
            monitor-enter(r5)
            java.lang.Object[] r4 = r5.LLILZ     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto Lb
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
            return
        Lb:
            r0 = r4[r0]     // Catch: java.lang.Throwable -> L28
            r3 = 1
            if (r0 != 0) goto L12
            r2 = 1
            goto L1c
        L12:
            r2 = 0
            int r0 = r5.LLJIJIL     // Catch: java.lang.Throwable -> L28
            int r1 = r0 + 1
            r5.LLJIJIL = r1     // Catch: java.lang.Throwable -> L28
            int r0 = r4.length     // Catch: java.lang.Throwable -> L28
            if (r1 != r0) goto L1e
        L1c:
            r5.LLIZLLLIL = r3     // Catch: java.lang.Throwable -> L28
        L1e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L24
            r5.LIZ()
        L24:
            r5.LIZJ()
            return
        L28:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19499211Qo.onComplete():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    @Override // X.InterfaceC626120Oh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r7) throws java.lang.Throwable {
        /*
            r6 = this;
            X.11Qk<T, R> r5 = r6.LL
            int r1 = r6.LLILLJJLI
            X.11Md r0 = r5.LLJ
            boolean r0 = r0.addThrowable(r7)
            if (r0 == 0) goto L3b
            boolean r0 = r5.LLILZLL
            r4 = 1
            if (r0 == 0) goto L34
            monitor-enter(r5)
            java.lang.Object[] r3 = r5.LLILZ     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2c
            return
        L18:
            r0 = r3[r1]     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L1e
            r2 = 1
            goto L28
        L1e:
            r2 = 0
            int r0 = r5.LLJIJIL     // Catch: java.lang.Throwable -> L2c
            int r1 = r0 + 1
            r5.LLJIJIL = r1     // Catch: java.lang.Throwable -> L2c
            int r0 = r3.length     // Catch: java.lang.Throwable -> L2c
            if (r1 != r0) goto L2a
        L28:
            r5.LLIZLLLIL = r4     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2c
            goto L32
        L2c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L32:
            if (r2 == 0) goto L37
        L34:
            r5.LIZ()
        L37:
            r5.LIZJ()
            return
        L3b:
            X.C19489211Ms.LIZIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19499211Qo.onError(java.lang.Throwable):void");
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        boolean z;
        C19498811Qk<T, R> c19498811Qk = this.LL;
        int i = this.LLILLJJLI;
        synchronized (c19498811Qk) {
            try {
                Object[] objArr = c19498811Qk.LLILZ;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i];
                int i2 = c19498811Qk.LLJI;
                if (obj == null) {
                    i2++;
                    c19498811Qk.LLJI = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    c19498811Qk.LLILZIL.offer((Object[]) objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c19498811Qk.LIZJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    public C19499211Qo(C19498811Qk<T, R> c19498811Qk, int i) {
        this.LL = c19498811Qk;
        this.LLILLJJLI = i;
    }
}
