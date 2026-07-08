package X;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.13fI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20066213fI implements InterfaceC1697790uHZ {
    public final /* synthetic */ InterfaceC1697790uHZ LL;
    public final /* synthetic */ InterfaceC1697790uHZ LLILLJJLI;
    public final /* synthetic */ AtomicReference LLILLL;
    public final /* synthetic */ C20065113f7 LLILZ;

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.getCoroutineContext();
    }

    @Override // X.InterfaceC1694980uD2
    public final View getView() {
        return this.LL.getView();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // X.InterfaceC1694980uD2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1694800uCk r10, X.InterfaceC1364105Vn r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C20066313fJ
            if (r0 == 0) goto L27
            r8 = r11
            X.13fJ r8 = (X.C20066313fJ) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r1 = r8.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r6 = 1
            if (r0 == 0) goto L2d
            if (r0 == r6) goto L50
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.13fJ r8 = new X.13fJ
            r8.<init>(r9, r11)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.atomic.AtomicReference r5 = r9.LLILLL
            r0 = 22
            kotlin.jvm.internal.AFwS274S0000000_30 r4 = kotlin.jvm.internal.AFwS274S0000000_30.get$arr$(r0)
            X.13fG r3 = new X.13fG
            X.13f7 r2 = r9.LLILZ
            X.0uHZ r0 = r9.LLILLJJLI
            r1 = 0
            r3.<init>(r2, r10, r0, r1)
            r8.LLILLL = r6
            X.06WP r0 = new X.06WP
            r0.<init>(r5, r1, r4, r3)
            java.lang.Object r0 = X.C2296808zG.LJ(r0, r8)
            if (r0 != r7) goto L53
            return r7
        L50:
            X.C155000ia.LIZIZ(r1)
        L53:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20066213fI.LIZ(X.0uCk, X.05Vn):java.lang.Object");
    }

    public C20066213fI(InterfaceC1697790uHZ interfaceC1697790uHZ, AtomicReference atomicReference, C20065113f7 c20065113f7) {
        this.LLILLJJLI = interfaceC1697790uHZ;
        this.LLILLL = atomicReference;
        this.LLILZ = c20065113f7;
        this.LL = interfaceC1697790uHZ;
    }
}
