package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.099A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C099A {
    public static final <U, T extends U> Object LIZ(C098W<U, ? super T> c098w, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2) throws Throwable {
        Object completedExceptionally;
        final InterfaceC2238208po interfaceC2238208poInvokeOnTimeout = AnonymousClass0958.LIZLLL(c098w.LLILZ.getContext()).invokeOnTimeout(c098w.LLILZIL, c098w, c098w.LLILLL);
        c098w.LJII(new C1DF1(interfaceC2238208poInvokeOnTimeout) { // from class: X.1DE5
            public final InterfaceC2238208po LLILZIL;

            {
                this.LLILZIL = interfaceC2238208poInvokeOnTimeout;
            }

            @Override // X.C1DFU
            public final void LJII(Throwable th) {
                this.LLILZIL.dispose();
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                LJII(th);
                return Unit.LIZ;
            }
        });
        boolean z = false;
        try {
            C19719512Dh.LJ(2, function2);
            completedExceptionally = function2.invoke(c098w, c098w);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally == C099R.LJFF()) {
            return C099R.LJFF();
        }
        Object objLJJLIIIJJI = c098w.LJJLIIIJJI(completedExceptionally);
        if (objLJJLIIIJJI == C1DFI.LIZIZ) {
            return C099R.LJFF();
        }
        if (objLJJLIIIJJI instanceof CompletedExceptionally) {
            Throwable th2 = ((CompletedExceptionally) objLJJLIIIJJI).cause;
            if (!(th2 instanceof C094W) || ((C094W) th2).coroutine != c098w) {
                z = true;
            }
            if (!z) {
                if (!(completedExceptionally instanceof CompletedExceptionally)) {
                    return completedExceptionally;
                }
                throw ((CompletedExceptionally) completedExceptionally).cause;
            }
            throw th2;
        }
        return C1DFI.LIZ(objLJJLIIIJJI);
    }

    public static final <T> Object LIZIZ(long j, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        if (j > 0) {
            Object objLIZ = LIZ(new C098W(j, interfaceC1364105Vn), function2);
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            return objLIZ;
        }
        throw new C094W("Timed out immediately");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.098W] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZJ(long r8, kotlin.jvm.functions.Function2<? super X.InterfaceC497601wk, ? super X.InterfaceC1364105Vn<? super T>, ? extends java.lang.Object> r10, X.InterfaceC1364105Vn<? super T> r11) {
        /*
            boolean r0 = r11 instanceof X.C099B
            if (r0 == 0) goto L23
            r7 = r11
            X.099B r7 = (X.C099B) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto L2d
            X.00zU r3 = r7.LLILLJJLI
            goto L29
        L23:
            X.099B r7 = new X.099B
            r7.<init>(r11)
            goto L12
        L29:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C094W -> L64
            return r1
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r1)
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L3f
            return r5
        L3f:
            X.00zU r3 = new X.00zU
            r3.<init>()
            r7.LL = r10     // Catch: X.C094W -> L62
            r7.LLILLJJLI = r3     // Catch: X.C094W -> L62
            r7.LLILZ = r4     // Catch: X.C094W -> L62
            X.098W r0 = new X.098W     // Catch: X.C094W -> L62
            r0.<init>(r8, r7)     // Catch: X.C094W -> L62
            r3.element = r0     // Catch: X.C094W -> L62
            java.lang.Object r1 = LIZ(r0, r10)     // Catch: X.C094W -> L62
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: X.C094W -> L62
            if (r1 != r0) goto L5e
            X.C099Q.LIZJ(r7)     // Catch: X.C094W -> L62
        L5e:
            if (r1 != r6) goto L61
            return r6
        L61:
            return r1
        L62:
            r2 = move-exception
            goto L65
        L64:
            r2 = move-exception
        L65:
            X.09AE r1 = r2.coroutine
            T r0 = r3.element
            if (r1 != r0) goto L6c
            return r5
        L6c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C099A.LIZJ(long, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
