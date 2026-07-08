package X;

import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.1DEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2252631DEv<T> extends C1DDP {
    public int LLILLL;

    public void LIZ(Object obj, Throwable th) {
    }

    public abstract InterfaceC1364105Vn<T> LIZIZ();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T LJ(Object obj) {
        return obj;
    }

    public abstract Object LJIIIIZZ();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[Catch: all -> 0x00a3, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0002, B:5:0x0019, B:23:0x0073, B:25:0x0079, B:33:0x0099, B:36:0x00a2, B:35:0x009f, B:7:0x001f, B:9:0x002d, B:20:0x005b, B:13:0x0035, B:15:0x003f, B:17:0x0045, B:21:0x0066), top: B:43:0x0002, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r11 = this;
            X.1DDO r4 = r11.LLILLJJLI
            X.05Vn r0 = r11.LIZIZ()     // Catch: java.lang.Throwable -> La3
            X.1DEu r0 = (X.C2252621DEu) r0     // Catch: java.lang.Throwable -> La3
            X.05Vn<T> r6 = r0.LLILZIL     // Catch: java.lang.Throwable -> La3
            java.lang.Object r0 = r0.LLIZ     // Catch: java.lang.Throwable -> La3
            kotlin.coroutines.CoroutineContext r5 = r6.getContext()     // Catch: java.lang.Throwable -> La3
            java.lang.Object r3 = X.C09AQ.LIZJ(r5, r0)     // Catch: java.lang.Throwable -> La3
            X.09AU r0 = X.C09AQ.LIZ     // Catch: java.lang.Throwable -> La3
            r2 = 0
            if (r3 == r0) goto L1e
            X.099d r10 = X.C23252099e.LIZJ(r6, r5, r3)     // Catch: java.lang.Throwable -> La3
            goto L1f
        L1e:
            r10 = r2
        L1f:
            kotlin.coroutines.CoroutineContext r9 = r6.getContext()     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r11.LJIIIIZZ()     // Catch: java.lang.Throwable -> L96
            java.lang.Throwable r7 = r11.LIZJ(r8)     // Catch: java.lang.Throwable -> L96
            if (r7 != 0) goto L66
            int r1 = r11.LLILLL     // Catch: java.lang.Throwable -> L96
            r0 = 1
            if (r1 == r0) goto L35
            r0 = 2
            if (r1 != r0) goto L5b
        L35:
            X.08zJ r0 = X.C09AE.LJJLJ     // Catch: java.lang.Throwable -> L96
            kotlin.coroutines.CoroutineContext$Element r1 = r9.get(r0)     // Catch: java.lang.Throwable -> L96
            X.09AE r1 = (X.C09AE) r1     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L58
            boolean r0 = r1.isActive()     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L58
            java.util.concurrent.CancellationException r1 = r1.LJJJLL()     // Catch: java.lang.Throwable -> L96
            r11.LIZ(r8, r1)     // Catch: java.lang.Throwable -> L96
            X.00Yq r0 = new X.00Yq     // Catch: java.lang.Throwable -> L96
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L96
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L96
            r6.resumeWith(r0)     // Catch: java.lang.Throwable -> L96
            goto L71
        L58:
            if (r7 == 0) goto L5b
            goto L66
        L5b:
            java.lang.Object r0 = r11.LJ(r8)     // Catch: java.lang.Throwable -> L96
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L96
            r6.resumeWith(r0)     // Catch: java.lang.Throwable -> L96
            goto L71
        L66:
            X.00Yq r0 = new X.00Yq     // Catch: java.lang.Throwable -> L96
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L96
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L96
            r6.resumeWith(r0)     // Catch: java.lang.Throwable -> L96
        L71:
            if (r10 == 0) goto L79
            boolean r0 = r10.LJLJJL()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L7c
        L79:
            X.C09AQ.LIZ(r5, r3)     // Catch: java.lang.Throwable -> La3
        L7c:
            r4.LIZIZ()     // Catch: java.lang.Throwable -> L85
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L85
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L85
            goto L8e
        L85:
            r1 = move-exception
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L8e:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            r11.LJFF(r2, r0)
            return
        L96:
            r1 = move-exception
            if (r10 == 0) goto L9f
            boolean r0 = r10.LJLJJL()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto La2
        L9f:
            X.C09AQ.LIZ(r5, r3)     // Catch: java.lang.Throwable -> La3
        La2:
            throw r1     // Catch: java.lang.Throwable -> La3
        La3:
            r2 = move-exception
            r4.LIZIZ()     // Catch: java.lang.Throwable -> Lad
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> Lad
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> Lad
            goto Lb6
        Lad:
            r1 = move-exception
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        Lb6:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            r11.LJFF(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2252631DEv.LJII():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LJII();
        } catch (Throwable th) {
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public AbstractC2252631DEv(int i) {
        this.LLILLL = i;
    }

    public Throwable LIZJ(Object obj) {
        CompletedExceptionally completedExceptionally;
        if (!(obj instanceof CompletedExceptionally) || (completedExceptionally = (CompletedExceptionally) obj) == null) {
            return null;
        }
        return completedExceptionally.cause;
    }

    public final void LJFF(final Throwable th, Throwable th2) {
        if (th == null) {
            if (th2 == null) {
                return;
            } else {
                th = th2;
            }
        } else if (th2 != null) {
            C13SZ.LIZ(th, th2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fatal exception in coroutines machinery for ");
        sbLIZ.append(this);
        sbLIZ.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2185108hF.LIZ(LIZIZ().getContext(), new Error(strLIZIZ, th) { // from class: X.139R
        });
    }
}
