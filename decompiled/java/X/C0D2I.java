package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0D2I, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D2I<T> implements C0D2S<T> {
    public final C0YEM LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final C0D2M LIZLLL;
    public C1DEK LJFF;
    public final C0D2L<T> LJII;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJI = new AtomicBoolean(true);
    public final Set<String> LJIIIIZZ = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // X.C0D2S
    public final void LIZ() {
        if (this.LJ.compareAndSet(true, false)) {
            C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "DefaultSendMessageQueue", "User logout", 4);
            this.LJIIIIZZ.clear();
            C1DEK c1dek = this.LJFF;
            if (c1dek == null) {
                c1dek = null;
            }
            c1dek.LIZIZ(null);
        }
    }

    @Override // X.C0D2S
    public final void LIZLLL() {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "DefaultSendMessageQueue", "Network is now available", 4);
        C0D2L<T> c0d2l = this.LJII;
        C099F c099f = c0d2l.LIZJ;
        if (c099f != null) {
            C868780Y6i.LJIILJJIL(c0d2l.LIZ.LIZLLL(), "DefaultSendMessageQueue", "Delay cancelled — interrupted by signal", 4);
            c099f.LJJLIIIJILLIZJL(Unit.LIZ);
        }
    }

    @Override // X.C0D2S
    public final void LJJ() {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "DefaultSendMessageQueue", "App is foreground", 4);
        this.LJI.compareAndSet(false, true);
    }

    @Override // X.C0D2S
    public final void LJJIJIIJI() {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "DefaultSendMessageQueue", "App is background", 4);
        this.LJI.compareAndSet(true, false);
    }

    @Override // X.C0D2S
    public final void LIZJ(String str) {
        if (!this.LJ.get()) {
            return;
        }
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "DefaultSendMessageQueue", "Cancel network job", 4);
        this.LJIIIIZZ.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:12:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C1DEK r7, X.InterfaceC1364105Vn r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C332360D1e
            if (r0 == 0) goto L5c
            r5 = r8
            X.0D1e r5 = (X.C332360D1e) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            r2 = 2
            if (r0 == 0) goto L50
            if (r0 == r3) goto L32
            if (r0 != r2) goto L62
            X.0WWy r0 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L27:
            r5.LL = r0
            r5.LLILZ = r3
            java.lang.Object r1 = r0.LIZ(r5)
            if (r1 != r4) goto L37
            return r4
        L32:
            X.0WWy r0 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L37:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()
            X.0D2H r1 = (X.C0D2H) r1
            r5.LL = r0
            r5.LLILZ = r2
            java.lang.Object r1 = r6.LJI(r1, r5)
            if (r1 != r4) goto L27
            return r4
        L50:
            X.C155000ia.LIZIZ(r1)
            r7.getClass()
            X.1DEL r0 = new X.1DEL
            r0.<init>(r7)
            goto L27
        L5c:
            X.0D1e r5 = new X.0D1e
            r5.<init>(r6, r8)
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D2I.LJ(X.1DEK, X.05Vn):java.lang.Object");
    }

    public final void LJFF(C0D2H<T> c0d2h, Exception exc) {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "DefaultSendMessageQueue", "Network request is unsuccessful", 4);
        this.LJIIIIZZ.remove(c0d2h.LIZ);
        c0d2h.LIZLLL.LJJJJJ(new C0D2N(exc, c0d2h.LJ.get()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:25:0x0065, B:104:0x0134], limit reached: 103 */
    /* JADX WARN: Path cross not found for [B:37:0x00a7, B:96:0x00cc], limit reached: 103 */
    /* JADX WARN: Path cross not found for [B:94:0x0079, B:32:0x009e], limit reached: 103 */
    /* JADX WARN: Path cross not found for [B:96:0x00cc, B:37:0x00a7], limit reached: 103 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a A[Catch: Exception -> 0x0149, TRY_ENTER, TryCatch #6 {Exception -> 0x0149, blocks: (B:65:0x0141, B:66:0x0145, B:64:0x013a), top: B:104:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.1DEK] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0169 -> B:100:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C0D2H<T> r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D2I.LJI(X.0D2H, X.05Vn):java.lang.Object");
    }

    public C0D2I(C0YEM c0yem, InterfaceC497601wk interfaceC497601wk, C0D2M c0d2m) {
        this.LIZIZ = c0yem;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = c0d2m;
        this.LJII = new C0D2L<>(c0yem, interfaceC497601wk);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    @Override // X.C0D2S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r10, X.C1DFB r11, X.C864240XvK r12, X.InterfaceC1364105Vn r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C0D2G
            if (r0 == 0) goto La3
            r4 = r13
            X.0D2G r4 = (X.C0D2G) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r6 = 0
            r3 = 2
            r7 = 1
            if (r0 == 0) goto L27
            if (r0 == r7) goto L91
            if (r0 != r3) goto Laa
            X.C155000ia.LIZIZ(r2)
        L26:
            return r2
        L27:
            X.C155000ia.LIZIZ(r2)
            X.0YEM r0 = r9.LIZIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "NetworkJob created "
            r2.append(r0)
            java.lang.Thread r0 = X.C786410Ut5.u3()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r8 = "DefaultSendMessageQueue"
            r2 = 4
            X.C868780Y6i.LJIILJJIL(r1, r8, r0, r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = r9.LJ
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r7)
            if (r0 == 0) goto L7c
            X.0YEM r0 = r9.LIZIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "Initialize retry channel"
            X.C868780Y6i.LJIILJJIL(r1, r8, r0, r2)
            java.util.Set<java.lang.String> r0 = r9.LJIIIIZZ
            r0.clear()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = 6
            X.1DEK r0 = X.C095G.LIZ(r1, r6, r0)
            r9.LJFF = r0
            X.01wk r2 = r9.LIZJ
            X.0D1d r1 = new X.0D1d
            r1.<init>(r9, r6)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r6, r6, r1, r0)
        L7c:
            X.0D2H r1 = new X.0D2H
            r1.<init>(r10, r11, r12)
            java.util.Set<java.lang.String> r0 = r9.LJIIIIZZ
            r0.add(r10)
            r4.LL = r1
            r4.LLILZ = r7
            java.lang.Object r0 = r9.LJI(r1, r4)
            if (r0 != r5) goto L96
            return r5
        L91:
            X.0D2H r1 = r4.LL
            X.C155000ia.LIZIZ(r2)
        L96:
            r4.LL = r6
            r4.LLILZ = r3
            X.099F r0 = r1.LIZLLL
            java.lang.Object r2 = r0.LJLIIIL(r4)
            if (r2 != r5) goto L26
            return r5
        La3:
            X.0D2G r4 = new X.0D2G
            r4.<init>(r9, r13)
            goto L12
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D2I.LIZIZ(java.lang.String, X.1DFB, X.0XvK, X.05Vn):java.lang.Object");
    }
}
