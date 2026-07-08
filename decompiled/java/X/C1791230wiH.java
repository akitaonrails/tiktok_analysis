package X;

import android.view.View;
import androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
public final class C1791230wiH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C259800zU<C1838660xwm> LLILLL;
    public final /* synthetic */ C13Y1 LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1791230wiH(C259800zU<C1838660xwm> c259800zU, C13Y1 c13y1, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, InterfaceC1364105Vn<? super C1791230wiH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = c13y1;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.LLIZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1791230wiH c1791230wiH = new C1791230wiH(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1791230wiH.LLILLJJLI = obj;
        return c1791230wiH;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L1f
            if (r0 != r7) goto L17
            java.lang.Object r8 = r9.LLILLJJLI
            X.09AE r8 = (X.C09AE) r8
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L14
            goto L8d
        L14:
            r2 = move-exception
            goto La4
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.00zU<X.0xwm> r0 = r9.LLILLL     // Catch: java.lang.Throwable -> La2
            T r3 = r0.element     // Catch: java.lang.Throwable -> La2
            X.0xwm r3 = (X.C1838660xwm) r3     // Catch: java.lang.Throwable -> La2
            if (r3 == 0) goto L58
            android.view.View r0 = r9.LLIZ     // Catch: java.lang.Throwable -> La2
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> La2
            android.content.Context r0 = X.C786410Ut5.N3(r0)     // Catch: java.lang.Throwable -> La2
            X.05YD r2 = androidx.compose.ui.platform.m5.LIZ(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> La2
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> La2
            float r1 = r0.floatValue()     // Catch: java.lang.Throwable -> La2
            X.05ZL r0 = r3.LL     // Catch: java.lang.Throwable -> La2
            X.13FI r0 = (X.C13FI) r0     // Catch: java.lang.Throwable -> La2
            r0.LJIILJJIL(r1)     // Catch: java.lang.Throwable -> La2
            X.0wiG r1 = new X.0wiG     // Catch: java.lang.Throwable -> La2
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> La2
            r0 = 3
            X.0956 r8 = X.C23250099c.LIZLLL(r4, r5, r5, r1, r0)     // Catch: java.lang.Throwable -> La2
            goto L59
        L58:
            r8 = r5
        L59:
            X.13Y1 r4 = r9.LLILZ     // Catch: java.lang.Throwable -> La0
            r9.LLILLJJLI = r8     // Catch: java.lang.Throwable -> La0
            r9.LL = r7     // Catch: java.lang.Throwable -> La0
            r4.getClass()     // Catch: java.lang.Throwable -> La0
            X.13Xx r3 = new X.13Xx     // Catch: java.lang.Throwable -> La0
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> La0
            kotlin.coroutines.CoroutineContext r0 = r9.getContext()     // Catch: java.lang.Throwable -> La0
            X.0xwj r2 = X.C1838620xwi.LIZ(r0)     // Catch: java.lang.Throwable -> La0
            X.0xws r1 = r4.LIZ     // Catch: java.lang.Throwable -> La0
            X.13Y0 r0 = new X.13Y0     // Catch: java.lang.Throwable -> La0
            r0.<init>(r4, r3, r2, r5)     // Catch: java.lang.Throwable -> La0
            java.lang.Object r1 = X.C23250099c.LJI(r9, r1, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> La0
            if (r1 == r0) goto L82
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> La0
        L82:
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> La0
            if (r1 == r0) goto L8a
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> La0
        L8a:
            if (r1 != r6) goto L8d
            return r6
        L8d:
            if (r8 == 0) goto L92
            r8.LIZIZ(r5)
        L92:
            androidx.lifecycle.LifecycleOwner r0 = r9.LLILZIL
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r9.LLILZLL
            r1.removeObserver(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La0:
            r2 = move-exception
            goto La4
        La2:
            r2 = move-exception
            r8 = r5
        La4:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> La8
            goto Laa
        La8:
            r2 = move-exception
            goto La4
        Laa:
            if (r8 == 0) goto Laf
            r8.LIZIZ(r5)
        Laf:
            androidx.lifecycle.LifecycleOwner r0 = r9.LLILZIL
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r9.LLILZLL
            r1.removeObserver(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1791230wiH.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
