package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JBH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.launcershortcut.executor.DefaultLauncherShortcutExecutor$tryAddLauncherShortcutInternal$1$1", f = "DefaultLauncherShortcutExecutor.kt", l = {141, 143}, m = "invokeSuspend")
public final class C0JBH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public AnonymousClass0956 LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C816050Vzn LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ Function2<Boolean, Throwable, Unit> LLIZ;
    public final /* synthetic */ C815230VyT LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0JBH(C816050Vzn c816050Vzn, Context context, Function2<? super Boolean, ? super Throwable, Unit> function2, C815230VyT c815230VyT, InterfaceC1364105Vn<? super C0JBH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c816050Vzn;
        this.LLILZLL = context;
        this.LLIZ = function2;
        this.LLIZLLLIL = c815230VyT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0JBH c0jbh = new C0JBH(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0jbh.LLILZ = obj;
        return c0jbh;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.0956] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.String r11 = "DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r18
            int r0 = r5.LLILLL
            r6 = 2
            r9 = 1
            r3 = 0
            if (r0 == 0) goto L35
            if (r0 == r9) goto L8c
            if (r0 != r6) goto Lb1
            java.lang.Object r7 = r5.LL
            X.09AE r7 = (X.C09AE) r7
            java.lang.Object r15 = r5.LLILZ
            X.00zU r15 = (X.C259800zU) r15
            X.C155000ia.LIZIZ(r19)
        L21:
            r7.LIZIZ(r3)
            T r0 = r15.element
            X.09AE r0 = (X.C09AE) r0
            if (r0 == 0) goto L2d
            r0.LIZIZ(r3)
        L2d:
            r15.element = r3
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L35:
            X.C155000ia.LIZIZ(r19)
            java.lang.Object r8 = r5.LLILZ
            X.01wk r8 = (X.InterfaceC497601wk) r8
            X.00zU r15 = new X.00zU
            r15.<init>()
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r7 = X.C2107308Nj.LIZ
            X.0JBG r10 = new X.0JBG
            X.0Vzn r2 = r5.LLILZIL
            android.content.Context r1 = r5.LLILZLL
            kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Throwable, kotlin.Unit> r0 = r5.LLIZ
            r10.<init>(r2, r1, r0, r3)
            X.0956 r0 = X.C23250099c.LIZLLL(r8, r7, r3, r10, r6)
            r15.element = r0
            X.0JBI r12 = new X.0JBI
            android.content.Context r13 = r5.LLILZLL
            kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Throwable, kotlin.Unit> r14 = r5.LLIZ
            X.0VyT r0 = r5.LLIZLLLIL
            r17 = r3
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            X.C23250099c.LIZLLL(r8, r7, r3, r12, r6)
            X.013C r2 = new X.013C
            r2.<init>()
            X.0JBJ r1 = new X.0JBJ
            X.0Vzn r0 = r5.LLILZIL
            r1.<init>(r0, r15, r2, r3)
            X.0956 r7 = X.C23250099c.LIZLLL(r8, r7, r3, r1, r6)
            r5.LLILZ = r15
            r5.LL = r2
            r5.LLILLJJLI = r7
            r5.LLILLL = r9
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r4) goto L99
            X.C1C7U.LIZIZ(r11)
            return r4
        L8c:
            X.0956 r7 = r5.LLILLJJLI
            java.lang.Object r2 = r5.LL
            X.013C r2 = (X.C013C) r2
            java.lang.Object r15 = r5.LLILZ
            X.00zU r15 = (X.C259800zU) r15
            X.C155000ia.LIZIZ(r19)
        L99:
            boolean r0 = r2.element
            if (r0 != 0) goto L2f
            r5.LLILZ = r15
            r5.LL = r7
            r5.LLILLJJLI = r3
            r5.LLILLL = r6
            r0 = 100
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r4) goto L21
            X.C1C7U.LIZIZ(r11)
            return r4
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JBH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
