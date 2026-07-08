package X;

import androidx.lifecycle.LifecycleCoroutineScope;

/* JADX INFO: renamed from: X.01lC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C426001lC extends AbstractC426101lD {
    public final InterfaceC497601wk LIZ;
    public final C2252321DDq LIZIZ;
    public AnonymousClass0956 LIZJ;
    public AnonymousClass0956 LIZLLL;
    public final C2252321DDq LJ;

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LIZLLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public C426001lC(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = lifecycleCoroutineScope;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0);
        this.LIZIZ = c2252321DDqLIZ;
        this.LJ = c2252321DDqLIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r2 <= r8) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0041 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r7, int r8, long r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C425901lB
            if (r0 == 0) goto L74
            r5 = r11
            X.01lB r5 = (X.C425901lB) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r3 = 1
            if (r0 == 0) goto L44
            if (r0 != r3) goto L7a
            int r2 = r5.LLILLJJLI
            long r9 = r5.LLILLL
            int r8 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            X.1DDq r1 = r6.LIZIZ
            java.lang.Integer r0 = X.C2286608xc.LJ(r2)
            r1.setValue(r0)
            if (r2 == r8) goto L82
            int r2 = r2 + 1
        L35:
            r5.LL = r8
            r5.LLILLL = r9
            r5.LLILLJJLI = r2
            r5.LLILZLL = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r9, r5)
            if (r0 != r4) goto L28
            return r4
        L44:
            X.C155000ia.LIZIZ(r1)
            X.1DDq r1 = r6.LIZIZ
            java.lang.Integer r0 = X.C2286608xc.LJ(r7)
            r1.setValue(r0)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L62
            X.1DDq r1 = r6.LIZIZ
            java.lang.Integer r0 = X.C2286608xc.LJ(r8)
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L62:
            int r2 = r8 - r7
            if (r2 > 0) goto L69
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L69:
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r9 = r9 * r0
            long r0 = (long) r2
            long r9 = r9 / r0
            int r2 = r7 + 1
            if (r2 > r8) goto L82
            goto L35
        L74:
            X.01lB r5 = new X.01lB
            r5.<init>(r6, r11)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L82:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C426001lC.LIZ(int, int, long, X.05Vn):java.lang.Object");
    }
}
