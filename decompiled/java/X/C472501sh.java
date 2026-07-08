package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.map.DynamicMapUtilsKt$loadStaticMap$2$1", f = "DynamicMapUtils.kt", l = {189, 190}, m = "invokeSuspend")
public final class C472501sh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05XL LL;
    public int LLILLJJLI;
    public final /* synthetic */ C05XL<Bitmap> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ TuxIconView LLIZ;
    public final /* synthetic */ ViewGroup LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472501sh(C05XL<Bitmap> c05xl, String str, Function0<Unit> function0, Function0<Unit> function02, TuxIconView tuxIconView, ViewGroup viewGroup, Function0<Unit> function03, InterfaceC1364105Vn<? super C472501sh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05xl;
        this.LLILZ = str;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
        this.LLIZ = tuxIconView;
        this.LLIZLLLIL = viewGroup;
        this.LLJ = function03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472501sh(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: CancellationException -> 0x0062, Exception -> 0x006e, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0062, Exception -> 0x006e, blocks: (B:20:0x004b, B:21:0x004e, B:23:0x005e, B:15:0x0034, B:16:0x0037, B:11:0x0022), top: B:34:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "DynamicMapUtilsKt@a976.loadStaticMap$2$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1c
            if (r0 != r3) goto L14
            goto L4b
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.05XL r1 = r6.LL
            goto L34
        L1f:
            X.C155000ia.LIZIZ(r7)
            X.05XL<android.graphics.Bitmap> r1 = r6.LLILLL     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            java.lang.String r0 = r6.LLILZ     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            r6.LL = r1     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            r6.LLILLJJLI = r2     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            java.lang.Object r7 = X.C1179600gnm.LIZIZ(r0, r6)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            if (r7 != r4) goto L37
            X.C1C7U.LIZIZ(r5)
            return r4
        L34:
            X.C155000ia.LIZIZ(r7)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
        L37:
            r1.LJIIZILJ(r7)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            X.05XL<android.graphics.Bitmap> r1 = r6.LLILLL     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            r0 = 0
            r6.LL = r0     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            r6.LLILLJJLI = r3     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            java.lang.Object r7 = r1.LJLIIIL(r6)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            if (r7 != r4) goto L4e
            X.C1C7U.LIZIZ(r5)
            return r4
        L4b:
            X.C155000ia.LIZIZ(r7)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
        L4e:
            com.bytedance.tux.icon.TuxIconView r2 = r6.LLIZ     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            android.view.ViewGroup r1 = r6.LLIZLLLIL     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLJ     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            r2.setImageBitmap(r7)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            r1.addView(r2)     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            if (r0 == 0) goto L79
            r0.invoke()     // Catch: java.util.concurrent.CancellationException -> L62 java.lang.Exception -> L6e
            goto L79
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLILZIL
            if (r0 == 0) goto L79
            r0.invoke()
            goto L79
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLILZLL
            if (r0 == 0) goto L79
            r0.invoke()
        L79:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472501sh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
