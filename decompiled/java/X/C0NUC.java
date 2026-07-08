package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NUC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NUC implements C05P1<Object> {
    public final List<C0NUU> LL;
    public final C0NUN LLILLJJLI;
    public final C0NUF LLILLL;
    public final Function1<C0NUJ, Unit> LLILZ;
    public final C0NU9 LLILZIL;
    public final C05P0 LLILZLL;
    public boolean LLIZ = true;

    @Override // X.C05P1
    public final Object getValue() {
        return this.LLILZLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #2 {all -> 0x00d8, blocks: (B:37:0x00a5, B:39:0x00a9, B:34:0x0092), top: B:60:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a2 -> B:60:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:52:0x00fd
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NUC.LJIIL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.C0NUU r9, X.InterfaceC1364105Vn<java.lang.Object> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C0NUA
            if (r0 == 0) goto L23
            r7 = r10
            X.0NUA r7 = (X.C0NUA) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r0 = 1
            r6 = 0
            if (r1 == 0) goto L35
            if (r1 != r0) goto L2d
            X.0NUU r9 = r7.LL
            goto L29
        L23:
            X.0NUA r7 = new X.0NUA
            r7.<init>(r8, r10)
            goto L12
        L29:
            X.C155000ia.LIZIZ(r2)     // Catch: java.util.concurrent.CancellationException -> L4b java.lang.Exception -> L5a
            return r2
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r2)
            X.0NU8 r2 = new X.0NU8     // Catch: java.util.concurrent.CancellationException -> L4b java.lang.Exception -> L5a
            r2.<init>(r8, r9, r6)     // Catch: java.util.concurrent.CancellationException -> L4b java.lang.Exception -> L5a
            r7.LL = r9     // Catch: java.util.concurrent.CancellationException -> L4b java.lang.Exception -> L5a
            r7.LLILZ = r0     // Catch: java.util.concurrent.CancellationException -> L4b java.lang.Exception -> L5a
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r7)     // Catch: java.util.concurrent.CancellationException -> L4b java.lang.Exception -> L5a
            if (r2 != r3) goto L4a
            return r3
        L4a:
            return r2
        L4b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            boolean r0 = X.C23118094a.LJIIIIZZ(r0)
            if (r0 != 0) goto L88
            throw r1
        L5a:
            r5 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)
            kotlin.coroutines.CoroutineContext r1 = r7.getContext()
            X.08hG r0 = kotlinx.coroutines.CoroutineExceptionHandler.LJJLIL
            kotlin.coroutines.CoroutineContext$Element r4 = r1.get(r0)
            kotlinx.coroutines.CoroutineExceptionHandler r4 = (kotlinx.coroutines.CoroutineExceptionHandler) r4
            if (r4 == 0) goto L88
            kotlin.coroutines.CoroutineContext r3 = r7.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Unable to load font "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0, r5)
            r4.LJJ(r3, r2)
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NUC.LJIILIIL(X.0NUU, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0NUC(List<? extends C0NUU> list, Object obj, C0NUN c0nun, C0NUF c0nuf, Function1<? super C0NUJ, Unit> function1, C0NU9 c0nu9) {
        this.LL = list;
        this.LLILLJJLI = c0nun;
        this.LLILLL = c0nuf;
        this.LLILZ = function1;
        this.LLILZIL = c0nu9;
        this.LLILZLL = C20028913Yh.LJI(obj);
    }
}
