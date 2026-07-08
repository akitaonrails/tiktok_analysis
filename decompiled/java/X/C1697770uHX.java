package X;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0uHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697770uHX implements InterfaceC1697790uHZ, InterfaceC497601wk {
    public final View LL;
    public final C1692080u8M LLILLJJLI;
    public final InterfaceC497601wk LLILLL;
    public final AtomicReference LLILZ = new AtomicReference(null);

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILLL.getCoroutineContext();
    }

    @Override // X.InterfaceC1694980uD2
    public final View getView() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // X.InterfaceC1694980uD2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1694800uCk r9, X.InterfaceC1364105Vn r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1697780uHY
            if (r0 == 0) goto L27
            r7 = r10
            X.0uHY r7 = (X.C1697780uHY) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 == r5) goto L4d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0uHY r7 = new X.0uHY
            r7.<init>(r8, r10)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.atomic.AtomicReference r4 = r8.LLILZ
            kotlin.jvm.internal.AwS391S0200000_25 r3 = new kotlin.jvm.internal.AwS391S0200000_25
            r0 = 12
            r3.<init>(r9, r8, r0)
            X.0uHQ r2 = new X.0uHQ
            r1 = 0
            r2.<init>(r8, r1)
            r7.LLILLL = r5
            X.06WP r0 = new X.06WP
            r0.<init>(r4, r1, r3, r2)
            java.lang.Object r0 = X.C2296808zG.LJ(r0, r7)
            if (r0 != r6) goto L50
            return r6
        L4d:
            X.C155000ia.LIZIZ(r1)
        L50:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1697770uHX.LIZ(X.0uCk, X.05Vn):java.lang.Object");
    }

    public C1697770uHX(AndroidComposeView androidComposeView, C1692080u8M c1692080u8M, InterfaceC497601wk interfaceC497601wk) {
        this.LL = androidComposeView;
        this.LLILLJJLI = c1692080u8M;
        this.LLILLL = interfaceC497601wk;
    }
}
