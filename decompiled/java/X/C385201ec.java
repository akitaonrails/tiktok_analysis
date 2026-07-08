package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.SettingsRegistry$dynamicItem$3", f = "LiveHostSettingsConfigFactory.kt", l = {226, 228}, m = "invokeSuspend")
public final class C385201ec extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<InterfaceC497601wk, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ C499990JjB LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C385201ec(boolean z, InterfaceC1631630sYr<? super InterfaceC497601wk, ? super Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, ? super Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, int i, InterfaceC1631620sYq<? super Fragment, ? super LifecycleOwner, ? super C499640Jic, Unit> interfaceC1631620sYq, Function0<Unit> function0, Function0<Unit> function02, C499990JjB c499990JjB, int i2, InterfaceC1364105Vn<? super C385201ec> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = interfaceC1631630sYr;
        this.LLILZIL = i;
        this.LLILZLL = interfaceC1631620sYq;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
        this.LLJ = c499990JjB;
        this.LLJI = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C385201ec c385201ec = new C385201ec(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c385201ec.LLILLJJLI = obj;
        return c385201ec;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.01ec for r19v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.String r10 = "SettingsRegistry@fb82.dynamicItem$3"
            X.C1C7U.LIZ(r10)
            java.lang.Object r3 = X.C099R.LJFF()
            r5 = r19
            int r0 = r5.LL
            r6 = 2
            r8 = 1
            if (r0 == 0) goto L1d
            if (r0 == r8) goto L6c
            if (r0 == r6) goto L6c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1d:
            X.C155000ia.LIZIZ(r20)
            java.lang.Object r7 = r5.LLILLJJLI
            X.01ed r11 = new X.01ed
            int r12 = r5.LLILZIL
            X.0sYq<androidx.fragment.app.Fragment, androidx.lifecycle.LifecycleOwner, X.0Jic, kotlin.Unit> r13 = r5.LLILZLL
            kotlin.jvm.functions.Function0<kotlin.Unit> r14 = r5.LLIZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r15 = r5.LLIZLLLIL
            X.0JjB r1 = r5.LLJ
            int r0 = r5.LLJI
            r4 = 0
            r18 = r4
            r16 = r1
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.01ee r9 = new X.01ee
            X.0JjB r2 = r5.LLJ
            int r1 = r5.LLILZIL
            int r0 = r5.LLJI
            r9.<init>(r2, r1, r0, r4)
            boolean r0 = r5.LLILLL
            if (r0 == 0) goto L57
            X.0sYr<X.01wk, kotlin.jvm.functions.Function1<? super X.05Vn<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<? super X.05Vn<? super kotlin.Unit>, ? extends java.lang.Object>, X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r5.LLILZ
            r5.LL = r8
            java.lang.Object r0 = r0.invoke(r7, r11, r9, r5)
            if (r0 != r3) goto L6f
            X.C1C7U.LIZIZ(r10)
            return r3
        L57:
            X.1DFB r2 = X.C0PEM.LIZJ
            X.01eb r1 = new X.01eb
            X.0sYr<X.01wk, kotlin.jvm.functions.Function1<? super X.05Vn<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<? super X.05Vn<? super kotlin.Unit>, ? extends java.lang.Object>, X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r5.LLILZ
            r1.<init>(r0, r11, r9, r4)
            r5.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r5, r2, r1)
            if (r0 != r3) goto L6f
            X.C1C7U.LIZIZ(r10)
            return r3
        L6c:
            X.C155000ia.LIZIZ(r20)
        L6f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385201ec.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
